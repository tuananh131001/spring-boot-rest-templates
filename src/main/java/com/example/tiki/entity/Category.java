package com.example.tiki.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;



@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JsonBackReference
    private Category parent;

    @OneToMany(mappedBy="parent")
    private List<Category> subCategory;

    @Column(name = "is_leaf")
    private String isLeaf;
    
    @OneToMany(fetch = FetchType.LAZY,orphanRemoval = true,mappedBy = "category",cascade = CascadeType.ALL)
    @ToString.Exclude
    private Collection<Product> productList; //no

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Category category = (Category) o;
        return id != null && Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
