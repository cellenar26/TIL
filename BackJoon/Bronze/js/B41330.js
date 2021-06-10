const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', function (line) {
  input = line.split(' ');

  let num1 = Number(input[0]);
  let num2 = Number(input[1]);

  if (num1 > num2) {
    console.log('>');
  } else if (num1 < num2) {
    console.log('<');
  } else {
    console.log('==');
  }

}).on('close', function () {
  process.exit();
});