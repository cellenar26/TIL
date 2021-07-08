function solution(array, commands) {
  var answer = [];
  for (var index = 0; index < commands.length; index++) {
    let i = commands[index][0]; // i 번째 요소부터
    let j = commands[index][1]; // j 번째 요소까지 포함해서 잘라야 한다.
    let k = commands[index][2]; //
    let target = array.slice(i - 1, j);

    target.sort((a, b) => {
      if (a > b) return 1;
      if (a === b) return 0;
      if (a < b) return -1;
    });
    // console.log("target: ", target);
    let real = target[k - 1];
    // console.log("real: ", real);
    answer.push(real);
  }

  return answer;
}
const array = [1, 5, 2, 6, 3, 7, 4];
const commands = [
  [2, 5, 3],
  [4, 4, 1],
  [1, 7, 3],
];

let result = solution(array, commands);
console.log(result);
