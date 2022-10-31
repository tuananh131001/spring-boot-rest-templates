import axios from "axios";
import React, { useEffect, useState } from "react";

function ListCategory() {
  const [product, setProduct] = useState(null);

  useEffect(() => {
    axios
      .get("http://localhost:8080/api/category/")
      .then(({ data }) => setProduct(data));
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

export default ListCategory;
