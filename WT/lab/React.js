import { StrictMode } from "react";
	import { createRoot } from "react-dom/client";
		 const rootElement = document.getElementById("root");
  		 const root = createRoot(rootElement);
  		 function Rajveer() {
 	 return (
    		<>
      	<h1>hello their </h1>
      	<h3>I am Rajveer</h3>
    	</>
  		);
}
root.render(
  <>
    <div id="hear"></div>
    <StrictMode></StrictMode>
    <Rajveer />
    <input type="text" id="input" />
    <br />
    <button onClick={ToUpper}>to upper</button>
  </>
);
