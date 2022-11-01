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
  Input,
  Typography,
} from "@mui/material";
import { useEffect } from "react";
import axios from "axios";
import { useForm } from "react-hook-form";
function AddForm() {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();
  let onSubmit = (data) => {
    console.log(data)
    data.parent == '' ? data.parent = null : null
    axios.post("http://localhost:8080/api/category/add", data).then(() => {
      console.log("sucess");
    });
  };
  return (
    <>
      <Typography variant="h4">Add category</Typography>
      <Box
        component="form"
        sx={{
          display: "flex",
          flexDirection: "column",
          "& .MuiTextField-root": { m: 1, width: "25ch" },
        }}
        onSubmit={handleSubmit(onSubmit)}
        noValidate
        autoComplete="off"
      >
        <FormControl>
          <FormLabel>Name</FormLabel>
          <input {...register("name")} />
        </FormControl>
        <FormControl variant="standard" sx={{ m: 1, minWidth: 120 }}>
          <InputLabel>Age</InputLabel>
          <Select value={""} {...register("is_leaf")}>
            <MenuItem value={"yes"}>Yes</MenuItem>
            <MenuItem value={"no"}>No</MenuItem>
          </Select>
        </FormControl>
        <FormControl>
          <FormLabel>Parent</FormLabel>
          <input type="number" {...register("parent")} />
        </FormControl>
        <Input type="submit"></Input>
      </Box>
    </>
  );
}

export default AddForm;
