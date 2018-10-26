<head>
<%@ page isELIgnored="false"%>
</head>


<html>
   <head>
 <title>Spring MVC Form Handling</title>
   </head>
<body>
<h2>
Submitted Employee Information</h2>
<table border="1"><tbody>
<tr>     <td>Employee ID </td>      <td>${employee.empId}</td>   </tr>
<tr>      <td>Employee Name</td>      <td>${employee.name}</td>  </tr>
<tr>     <td>Employee Age</td>      <td>${employee.age}</td>     </tr>
<tr>      <td>Employee Salary</td>       <td>${employee.salary}</td> </tr>
</tbody></table>
</body>
</html>