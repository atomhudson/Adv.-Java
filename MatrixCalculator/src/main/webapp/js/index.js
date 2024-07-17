function generateMatrix(containerId, rowsId, colsId, matrixName) {
    var rows = parseInt(document.getElementById(rowsId).value);
    var cols = parseInt(document.getElementById(colsId).value);
    var matrixContainer = document.getElementById(containerId);
    matrixContainer.innerHTML = '';

    for (var i = 0; i < rows; i++) {
        var row = document.createElement('div');
        row.className = 'matrix-row';

        for (var j = 0; j < cols; j++) {
            var inputField = document.createElement('input');
            inputField.type = 'number';
            inputField.name = matrixName + '_' + i + '_' + j;
            inputField.className = 'matrix-cell';
            row.appendChild(inputField);
        }
        matrixContainer.appendChild(row);
    }
}
