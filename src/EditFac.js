import { useState,useEffect } from "react";
import { BrowserRouter, Link, Outlet, Route, Routes, useNavigate, useParams } from "react-router-dom";   
 export default function EditFac(){
    const aipUrl='https://63202760e3bdd81d8ef39441.mockapi.io/Books_Api';
    const [data,setData]=useState({}); 
    const param=useParams();
    const nevigate= useNavigate();
    useEffect(()=>{
      fetch(aipUrl+'/'+param.id).then(res=>res.json()).then(res=>setData(res))
    },[])
    return(<>
    <input type="text" value={data.laptopName} onChange={(e)=>{
      setData({...data,laptopName:e.target.value});
    }}/>
    <input type="text"value={data.laptopPhoto} onChange={(e)=>{
      setData({...data,laptopPhoto:e.target.value});
    }}/>
    <button onClick={()=>{
      fetch(aipUrl+"/"+param.id,{method:'PUT',body:JSON.stringify(data),headers:{
        "content-Type":"application/json"
      }}).then(res=>nevigate('/faculties'))
    }}>edit faculties</button>
    </>) 
    
  }
  