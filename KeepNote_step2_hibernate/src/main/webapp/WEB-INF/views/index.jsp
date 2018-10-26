<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<title>Keep-Board</title>
</head>

<body>
    <h2>List of Notes</h2>

    <table>
        <tr>
            <td>Id</td><td>Title</td><td>Content</td><td>Status</td>
        </tr>
        <c:forEach items="${listNotes}" var="presentNote">
            <tr>
            <td>${presentNote.noteId}</td>
            <td>${presentNote.noteTitle}</td>
            <td>${presentNote.noteContent}</td>
            <td>${presentNote.noteStatus}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <h1>Enter Note Details</h1>

    	<form:form method="post" modelAttribute="note">
                 <table>
                            <tr>
                                 <td><label for="noteId">Note Id: </label> </td>
                                 <td><form:input path="noteId" id="noteId"/></td>
                                 <td><form:errors path="noteId" /></td>
                            </tr>
                            <tr>
                                <td><label for="noteTitle">Note Title: </label> </td>
                                <td><form:input path="noteTitle" id="noteTitle"/></td>
                                <td><form:errors path="noteTitle" /></td>
                            </tr>

                            <tr>
                                <td><label for="noteContent">Note Content: </label> </td>
                                <td><form:input path="noteContent" id="noteContent"/></td>
                                <td><form:errors path="noteContent" /></td>
                            </tr>

                            <tr>
                                <td><label for="noteStatus">Note Status: </label> </td>
                                <td><form:input path="noteStatus" id="noteStatus"/></td>
                                <td><form:errors path="noteStatus" /></td>
                            </tr>
                            <tr>
                                        <td></td>
                                        <td><form:button formaction="add">Submit</form:button></td>
                                     </tr>
                             <tr>
                                                <td></td>
                                          <td><form:button formaction="delete">Delete</form:button></td>
                                             </tr>
                    <tr>
                                           <td></td>
                                            <td><form:button formaction="update">Update</form:button></td>
                                                 </tr>
                 </table>
        </form:form>
    <br>
</body>

</html>


