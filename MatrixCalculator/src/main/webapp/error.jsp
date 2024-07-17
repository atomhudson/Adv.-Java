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
        text-align: center;
        font-size: 16px;
    }
</style>
</head>
<body>
    <h2>Error: Please fill all the parameters</h2>
    <div class="error-info">
        <p>
            Some parameters required for matrix multiplication are missing. Please make sure all the necessary parameters are filled out before submitting.
        </p>
        <p>
            Ensure that you have provided values for all the required parameters, such as the number of rows and columns for each matrix.
        </p>
    </div>
</body>
</html>
