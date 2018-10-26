<html>
 <head>

  <title>Spring MVC Form Handling</title>
 </head>
 <body>
<h2>
Employee Data Form</h2>
<form action="/addEmployee" method="POST" model-attribute = "addEmployee">;
<p> employee name : <input type="text"  name ="name"></p>
<p>  salary <input type="text" name ="salary"></p>
<p> age : <input type="text" name ="age"></p>
<p> emplId: <input type="text" name="empId"></p>
<input type = "submit" value ="submit form">
</form>
</body>
</html>