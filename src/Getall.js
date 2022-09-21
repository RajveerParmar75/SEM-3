import {React, useEffect, useState} from "react";
import { useNavigate } from "react-router-dom";
import Layout from "./Layout";
export default function Getall(){
    const aipUrl='https://63202760e3bdd81d8ef39441.mockapi.io/Books_Api';
    const[data,setData]=useState([]);
    const nevigate =useNavigate();
    useEffect(()=>{fetch(aipUrl).then((res)=>res.json()).then((res)=>setData(res))});
    const formatedData=data.map((fac)=>{
      return(<div class="card float-start  templet  m-3"style={{width:23+"%"}} >
      <img src={fac.laptopPhoto} class="card-img-top" alt="..."/>
      <div class="card-body hide">
        <h5 class="card-title">{fac.laptopName}</h5>
        <p class="card-text">{fac.LaptopRAM}</p>
        <button class='but'onClick={()=>{nevigate('/faculties/'+fac.id)}}>  VIEW MORE</button>
      </div>
    </div>);
    });
    // <h1>{fac.name}</h1><button onClick={()=>{nevigate('/faculties/'+fac.id)}}>view more</button></>
    return(<><Layout/><div class="row">{formatedData}</div></>);
  }