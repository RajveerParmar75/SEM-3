import {React, useEffect, useState} from "react";
import { useNavigate } from "react-router-dom";
import Layout from "./Layout";
export default function AddFac(){
  const aipUrl='https://63202760e3bdd81d8ef39441.mockapi.io/Books_Api';
  const [data,setData]=useState({}); 
  const nevigate=useNavigate();
  return(<>
  <Layout/>
  <input type="text" placeholder="NAME" onChange={(e)=>{
    setData({...data,laptopName:e.target.value});
  }}/>
  <input type="text" placeholder="IMAGE" onChange={(e)=>{
    setData({...data,laptopPhoto:e.target.value});
  }}/>
  <input type="text" placeholder="RAM" onChange={(e)=>{
    setData({...data,LaptopRAM:e.target.value});
  }}/>
  <button onClick={()=>{
    fetch(aipUrl,{method:'POST',body:JSON.stringify(data),headers:{
      "content-Type":"application/json"
    }}).then(nevigate('/faculties'))
  }}>add faculties</button>
  </>) 
}
