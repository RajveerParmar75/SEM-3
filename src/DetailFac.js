import {React, useEffect, useState} from "react";
import { useParams } from "react-router-dom";
import { useNavigate } from "react-router-dom";
// import Layout from "./Layout";
import { Component } from "react";
import Layout from "./Layout";
import { createRoot } from "react-dom/client";
export default function DetailFac(){
    const aipUrl='https://63202760e3bdd81d8ef39441.mockapi.io/Books_Api';
    const param=useParams();
    const navigate=useNavigate();
    const [data,setData]=useState({});
    useEffect(()=>{fetch(aipUrl+'/'+param.id).then((res)=>res.json()).then((res)=>setData(res))},[]);
    return (<>
      <Layout/>
      <div class='data'>NAME : {data.laptopName}</div>
      <div class='photo'>
      <img style={{height:400+'px'}} src={data.laptopPhoto}/>
      </div>
      <button class='change'onClick={()=>{
        fetch(aipUrl+"/"+param.id,{method:"DELETE"}).then(navigate("/faculties"))
      }}>DELETE</button>
      <button class='change' onClick={()=>{
        (navigate("/faculties/edit/"+param.id))
      }}>EDIT</button>
    </>)
  }