<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 15px;
    text-align: left;
}
table#t01 {
    width: 100%;
    background-color: #f1f1c1;
}
</style>
</head>
<body bgcolor="#E6E6FA" align="center">
<div border-style= "solid">
	<form action='update' method="post">

	  Note ID:<br>
	  <input type="hidden" id="noteId" name="noteId" value=${note.noteId}><br>
	  Title:<br>
	  <input type="text" id="noteTitle" name="noteTitle" value=${note.noteTitle}><br>
	  Content:<br>
	  <input type="textarea" id="noteContent" name="noteContent" value=${note.noteContent}><br>
	  Status:<br>
	  <select id="noteStatus" name= "noteStatus">
		  <option value="active">Active</option>
		  <option value="inactive">Inactive</option>
	  </select>
	  <br>
	  <br>
	  <button type="submit" value="Submit">Update

	</form>
</div>
</body>
</html>