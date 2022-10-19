import React from "react";
import Button from "@mui/material/Button";
import Box from "@mui/material/Box";
import {
  OutlinedInput,
  FormControl,
  FormLabel,
  FormHelperText,
  Select,
  MenuItem,
  InputLabel,
} from "@mui/material";
function AddForm() {
  return (
    <Box
      component="form"
      sx={{
        display:'flex',
        flexDirection:'column',
        "& .MuiTextField-root": { m: 1, width: "25ch" },
      }}
      noValidate
      autoComplete="off"
    >
      <FormControl>
        <FormLabel>Brand Name</FormLabel>
        <input
          type="text"
          className="form-control"
          id="description"
          required
          name="description"
        />
      </FormControl>
      <FormControl>
        <FormLabel>Description</FormLabel>
        <input
          type="text"
          className="form-control"
          id="description"
          required
          name="description"
        />
      </FormControl>
      <FormControl>
        <FormLabel>Name</FormLabel>
        <input />
      </FormControl>
      <FormControl>
        <FormLabel>Quantity</FormLabel>
        <input />
      </FormControl>
      <FormControl variant="standard" sx={{ m: 1, minWidth: 120 }}>
        <InputLabel id="demo-simple-select-standard-label">Age</InputLabel>
        <Select
          labelId="demo-simple-select-standard-label"
          id="demo-simple-select-standard"
          label="Age"
        >
         
          <MenuItem value={"yes"}>Yes</MenuItem>
          <MenuItem value={"no"}>No</MenuItem>
        </Select>
      </FormControl>
      <Button variant="contained" className="btn btn-success">
        Submit
      </Button>
    </Box>
  );
}

export default AddForm;
