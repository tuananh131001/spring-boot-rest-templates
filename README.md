# tiki


# init only data.sql
spring.jpa.defer-datasource-initialization = true 

# Reference the same class 
```    @ManyToOne
    @JsonBackReference
    private Category parent;

    @OneToMany(mappedBy="parent")
    private List<Category> subCategory;
```
