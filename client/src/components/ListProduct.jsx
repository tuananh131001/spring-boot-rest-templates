import axios from "axios";
import React, { useEffect, useState } from "react";

function ListProduct() {
  const [product, setProduct] = useState(null);
  const [haveProduct, setHaveProduct] = useState(false);

  useEffect(() => {
    axios.get("http://localhost:8080/api/category/").then(({ data }) => {
      setProduct(data);
      console.log(data);
      setHaveProduct(true);
      data.map((pro) => {
        console.log(pro.name);
      });
    });
  }, []);
  return (
    <>
      <h1> Product: </h1>
      <section>
        {product && product.map((category) => <h1>{category.name}</h1>)}
      </section>
    </>
  );
}

export default ListProduct;
