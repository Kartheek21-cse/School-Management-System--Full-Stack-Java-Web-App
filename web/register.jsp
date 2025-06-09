<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: white;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
            width: 350px;
        }
        .form-container h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
            color: #555;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border-radius: 5px;
            border: 1px solid #ccc;
            font-size: 14px;
        }
        input[type="submit"] {
            background-color: #2874f0;
            color: white;
            border: none;
            width: 100%;
            padding: 12px;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0b57d0;
        }
    </style>
</head>
<body>
    <form action="save"  class="form-container">
        <h2>Register in School</h2>

        <label for="id">ID</label>
        <input type="text" id="id" name="id" required>

        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>

        <label for="age">Age</label>
        <input type="number" id="age" name="age" required>

        <label for="standard">Standard</label>
        <input type="text" id="standard" name="standard" required>

        <input type="submit" value="Register">
    </form>
    
</body>
</html>
