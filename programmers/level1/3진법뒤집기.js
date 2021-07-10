function solution(n) {
  var answer = 0;
  let calc = n.toString(3).split("");
  let forResult = [];
  for (let i = calc.length - 1; i > -1; i--) {
    forResult.push(calc[i]);
  }
  let toResult = forResult.join("");
  answer = Number.parseInt(toResult, 3);
  return answer;
}

const n = 125;
console.log(n.toString(3));
console.log(n.toString(3)[0]);
const splited = n.toString(3).split("");
console.log(splited);
console.log(solution(n));
