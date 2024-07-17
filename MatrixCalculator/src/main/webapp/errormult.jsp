<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Error In Matrix Multiplication Calculator Web App</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        margin: 0;
        padding: 20px;
    }

    h2 {
        color: #dc3545;
        text-align: center;
    }

    .error-info {
        margin: 20px auto;
        width: 80%;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
    }

    p {
        color: #6c757d;
        text-align:center;
        font-size: 16px;
    }
</style>
</head>
<body>
    <h2>Error: Multiplication Can't be Performed</h2>
    <div class="error-info">
        <p>
            Matrix multiplication cannot be performed because the number of columns in Matrix A does not match the number of rows in Matrix B.
        </p>
        <p>
            Please ensure that the number of columns in Matrix A matches the number of rows in Matrix B for multiplication to be possible.
        </p>
    </div>
</body>
</html>
