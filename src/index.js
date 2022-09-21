import {React, useEffect, useState} from "react";
import { Component } from "react";
import { createRoot } from "react-dom/client";
import { BrowserRouter, Link, Outlet, Route, Routes, useNavigate, useParams } from "react-router-dom";
import './index.css';
import  AddFac from './AddFac';
import  Getall from './Getall';
import Layout from "./Layout";
import EditFac from "./EditFac";
import DetailFac from "./DetailFac";

const root = createRoot(document.getElementById('root'));
const aipUrl='https://63202760e3bdd81d8ef39441.mockapi.io/Books_Api';
root.render(<>
<BrowserRouter>
  <Routes>
  <Route path="/" element={<Layout/>}/>
    <Route path="/faculties" element={<Getall/>}/>
    <Route path="faculties/:id" element={<DetailFac/>}/>
    <Route path="faculties/add" element={<AddFac/>}/>
    <Route path="faculties/edit/:id" element={<EditFac/>}/>
  </Routes>
</BrowserRouter>
  </>
);
