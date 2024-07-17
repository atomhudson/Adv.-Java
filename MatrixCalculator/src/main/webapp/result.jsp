<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Matrix Multiplication Calculator Web App Result</title>
<link rel="stylesheet" href="style/result.css">
</head>
<body>
    <h2>Matrix Multiplication Result:</h2>
    <div class="matrix-container">
        <div>
            <table>
                <thead>
                    <tr>
                        <th colspan="5" style="background-color: rgb(192, 192, 192);">Matrix A</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        in.planetspark.ror.matrixmult.model.MatrixMultiplicationModel model = (in.planetspark.ror.matrixmult.model.MatrixMultiplicationModel) request.getAttribute("model");
                    
                        int[][] matrixA = model.getMatrixA();
                        int rowsA = matrixA.length;
                        int colsA = matrixA[0].length;
                        
                        // Displaying Matrix A
                        for (int i = 0; i < rowsA; i++) {
                            out.println("<tr>");
                            for (int j = 0; j < colsA; j++) {
                                out.println("<td>" + matrixA[i][j] + "</td>");
                            }
                            out.println("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>
        <div class="symbol">x</div>
        <div>
            <table>
                <thead>
                    <tr>
                        <th colspan="5" style="background-color: rgb(192, 192, 192);">Matrix B</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        int[][] matrixB = model.getMatrixB();
                        int rowsB = matrixB.length;
                        int colsB = matrixB[0].length;
                        
                        // Displaying Matrix B
                        for (int i = 0; i < rowsB; i++) {
                            out.println("<tr>");
                            for (int j = 0; j < colsB; j++) {
                                out.println("<td>" + matrixB[i][j] + "</td>");
                            }
                            out.println("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>
        <div class="symbol">=</div>
        <div>
            <table>
                <thead>
                    <tr>
                        <th colspan="5" style="background-color: rgb(192, 192, 192);">Matrix Result</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        int[][] resultMatrix = model.getResultMatrix();
                        int rowsResult = resultMatrix.length;
                        int colsResult = resultMatrix[0].length;
                        
                        // Display Result Matrix
                        for (int i = 0; i < rowsResult; i++) {
                            out.println("<tr>");
                            for (int j = 0; j < colsResult; j++) {
                                out.println("<td>" + resultMatrix[i][j] + "</td>");
                            }
                            out.println("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
