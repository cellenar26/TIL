function solution(absolutes, signs) {
  var answer = 0;
  // let firstNum = signs[0] ? absolutes[0] : absolutes[0] * -1;
  // let secondNum = signs[1] ? absolutes[1] : absolutes[1] * -1;
  // let thirdNum = signs[2] ? absolutes[2] : absolutes[2] * -1;
  let target = 0;
  for (let i = 0; i < absolutes.length; i++) {
    target = signs[i] ? absolutes[i] : absolutes[i] * -1;
    answer += target;
  }

  return answer;
}
