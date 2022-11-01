import { List, ListItem, TextField } from "@mui/material";
import axios from "axios";
import React, { useEffect, useState } from "react";

function Search() {
  const [data, setData] = useState("");
  const [query, setQuery] = useState("");

  const [product, setProduct] = useState("");

  useEffect(() => {
    axios.get("http://localhost:8080/api/products?name=" + query).then(({ data }) => {
        setData(data.tutorials);
    });
  }, [query]);
  let inputHandler = (e) => {
    //convert input text to lower case
    var lowerCase = e.target.value.toLowerCase();
    setQuery(lowerCase);
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
      <List>
        {query && data.map((prod) => <ListItem>{prod.name}</ListItem>)}
      </List>
    </div>
  );
}

export default Search;
