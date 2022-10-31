import {
  List,
  ListItemText,
  ListSubheader,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Typography,
} from "@mui/material";
import { Box } from "@mui/system";
import axios from "axios";
import React, { useEffect, useState } from "react";

function ListCategory() {
  const [data, setProduct] = useState(null);

  useEffect(() => {
    axios
      .get("http://localhost:8080/api/category/")
      .then(({ data }) => setProduct(data));
  }, []);
  return (
    <>
      <Typography variant="h3"> Category: </Typography>

      {data &&
        data.map((category) => (
          <>
            <Typography variant="h4">{category.name}</Typography>

            <List
              sx={{ width: "100%", maxWidth: 360, bgcolor: "background.paper" }}
              component="nav"
              aria-labelledby="nested-list-subheader"
            >
              {category.subCategory?.map((sub) => (
                <Box>
                  <Typography variant="h6">{sub.name}</Typography>
                  <Box sx={{ border: 1 }}>
                    {sub.productList?.map((prod) => (
                      <ListItemText variant="p">{prod.name}</ListItemText>
                    ))}
                  </Box>
                </Box>
              ))}
              <Box sx={{ border: 1 }}>
                {category.productList?.map((prod) => (
                  <ListItemText variant="p">{prod.name}</ListItemText>
                ))}
              </Box>
            </List>
          </>
        ))}
    </>
  );
}

export default ListCategory;
