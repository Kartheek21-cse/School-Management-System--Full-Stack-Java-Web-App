<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%="<h1>Update the Records</h1>" %>
<form action="update" method="post" >
        <label for="id">ID</label>
        <input type="text" id="id" name="id" required>

        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>

        <label for="age">Age</label>
        <input type="number" id="age" name="age" required>

        <label for="standard">Standard</label>
        <input type="text" id="standard" name="standard" required>

        <input type="submit" value="Update">
    </form>
    </body>
</html>