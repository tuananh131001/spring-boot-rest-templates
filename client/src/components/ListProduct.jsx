import axios from "axios";
import React, { useEffect, useState } from "react";

function ListProduct() {
  const [product, setProduct] = useState(null);
  useEffect(() => {
    axios.get("http://localhost:8080/api/products/").then(({ data }) => {
      setProduct(data.tutorials);
      console.log(data.tutorials)
    });
    console.log(product);
  }, []);
  return (
    <>
      <section>
        {product && product.map((prod) => <h1>{prod.name}</h1>)}
      </section>
    </>
  );
}

export default ListProduct;
