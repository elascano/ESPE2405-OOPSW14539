function createMultiplicationTable(number) {
  let table = '<table>';
  table += '<tr><th colspan="2">Multiplication Table of ' + number + '</th></tr>';
  for (let i = 1; i <= 10; i++) {
      table += '<tr><td>' + number + ' x ' + i + '</td><td>' + (number * i) + '</td></tr>';
  }
  table += '</table>';
  return table;
}

function generateTables() {
  let tablesDiv = document.getElementById('tables');
  for (let i = 1; i <= 10; i++) {
      tablesDiv.innerHTML += createMultiplicationTable(i);
  }
}

generateTables();
