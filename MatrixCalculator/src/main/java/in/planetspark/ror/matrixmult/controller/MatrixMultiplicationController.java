package in.planetspark.ror.matrixmult.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.planetspark.ror.matrixmult.model.MatrixMultiplicationModel;

/**
 * Servlet implementation class MatrixMultiplicationController
 */
@WebServlet("/MatrixMultiplicationController")
public class MatrixMultiplicationController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rowsAStr = request.getParameter("rowsA");
        String colsAStr = request.getParameter("colsA");
        String rowsBStr = request.getParameter("rowsB");
        String colsBStr = request.getParameter("colsB");

        // Check if any of the input fields are empty or contain only whitespace
        if (rowsAStr.trim().isEmpty() || colsAStr.trim().isEmpty() || rowsBStr.trim().isEmpty() || colsBStr.trim().isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
            return;
        }
        try {
            int rowsA = Integer.parseInt(rowsAStr);
            int colsA = Integer.parseInt(colsAStr);
            int rowsB = Integer.parseInt(rowsBStr);
            int colsB = Integer.parseInt(colsBStr);

            // Retrieve matrix values from request parameters
            int[][] matrixA = new int[rowsA][colsA];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    String value = request.getParameter("matrixA_" + i + "_" + j);
                    matrixA[i][j] = Integer.parseInt(value);
                }
            }

            int[][] matrixB = new int[rowsB][colsB];
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    String value = request.getParameter("matrixB_" + i + "_" + j);
                    matrixB[i][j] = Integer.parseInt(value);
                }
            }

            // Check if matrix multiplication is possible
            if (colsA != rowsB) {
            	 RequestDispatcher rd = request.getRequestDispatcher("errormult.jsp");
                 rd.forward(request, response);
                return;
            }

            // Perform matrix multiplication
            int[][] resultMatrix = matrixMultiply(matrixA, matrixB);

            // Set model attributes and forward to result page
            MatrixMultiplicationModel model = new MatrixMultiplicationModel();
            model.setResultMatrix(resultMatrix);
            model.setMatrixA(matrixA);
            model.setMatrixB(matrixB);
            request.setAttribute("model", model);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (NumberFormatException e) {
        	 RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
             rd.forward(request, response);
        }
    }

    // Method to perform matrix multiplication
    private int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

}
