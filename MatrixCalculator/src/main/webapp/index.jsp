<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Matrix Multiplication Calculator Web App</title>
<link rel="stylesheet" href="style/index.css">
<script src="js/index.js"></script>
</head>
<body>
    <form action="MatrixMultiplicationController" method="post" id="matrixForm">
        <h3 style="text-align: center;">Select the matrix size:</h3>
        <div style="display: flex; align-items: center;">
            <h3 style="margin-right: 10px; margin-top: 20px;">Matrix A:</h3>
            <input type="number" name="rowsA" id="rowsA" min="1" required style="margin-right: 5px;">
            <strong> x </strong>
            &nbsp;
            <input type="number" name="colsA" id="colsA" min="1" required style="margin-right: 5px;">
            <input type="button" value="Generate Matrix" onclick="generateMatrix('matrixContainerA', 'rowsA', 'colsA', 'matrixA')">
        </div>
        <br>
        <div style="display: flex; align-items: center;">
            <h3 style="margin-right: 10px; margin-top: 20px;">Matrix B:</h3>
            <input type="number" name="rowsB" id="rowsB" min="1" required style="margin-right: 5px;" value="colA">
            <strong> x </strong>
            &nbsp;
            <input type="number" name="colsB" id="colsB" min="1" required style="margin-right: 5px;">
            <input type="button" value="Generate Matrix" onclick="generateMatrix('matrixContainerB', 'rowsB', 'colsB', 'matrixB')">
        </div>
        <br>
        <h3>The first matrix:</h3>
        <div class="matrix-label">
            <h2>A = </h2>
            <div id="matrixContainerA"></div>
        </div>
        <br>
        <h3>The second matrix:</h3>
        <div class="matrix-label">
            <h2>B = </h2>
            <div id="matrixContainerB"></div>
        </div>
        <br><br>
        <input type="submit" value="Submit" style="display: block; margin: 0 auto;">
    </form>
</body>
</html>
