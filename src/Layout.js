
import { BrowserRouter, Link, Outlet, Route, Routes, useNavigate, useParams } from "react-router-dom";
export default function Layout(){
    return (<>
    {/* <Link to='/'>HOME </Link> <br/>
      <Link to='/faculties'> DISPLAY ALL Faculty </Link><br/>
      <Link to='/faculties/add'> ADD Faculty </Link><br/> */}
      <nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
    <Link class="navbar-brand"to='/'>HOME </Link>
      
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
          <Link class="nav-link active" to='/faculties'> DISPLAY ALL Faculty </Link>
          </li>
          <li class="nav-item">
          <Link to='/faculties/add' class="nav-link active"> ADD Faculty </Link>
          </li>
          
        </ul>
      </div>
    </div>
  </nav>
      <br/>
      <Outlet/>
      </>);
  }