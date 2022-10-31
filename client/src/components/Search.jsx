import { List, ListItem, TextField } from "@mui/material";
import axios from "axios";
import React, { useEffect, useState } from "react";

function Search() {
  const [name, setName] = useState("");
  const [product, setProduct] = useState("");

  useEffect(() => {
    axios.get("http://localhost:8080/api/products?name=" + name).then(({ data }) => {
      setProduct(data.tutorials);
    });
    console.log(product);
  }, [name]);
  const [inputText, setInputText] = useState("");
  let inputHandler = (e) => {
    //convert input text to lower case
    var lowerCase = e.target.value.toLowerCase();
    setName(lowerCase);
  };

  return (
    <div className="main">
      <h1>React Search</h1>
      <div className="search">
        <TextField
          id="outlined-basic"
          onChange={inputHandler}
          variant="outlined"
          fullWidth
          label="Search"
        />
      </div>
      <List input={inputText} />
      <List>
        {name && product.map((prod) => <ListItem>{prod.name}</ListItem>)}
      </List>
    </div>
  );
}

export default Search;
