function solution(answers) {
  var answer = [];
  let firstCounter = 0;
  let secondCounter = 0;
  let thirdCounter = 0;
  const first = [1, 2, 3, 4, 5]; // 5개
  const second = [2, 1, 2, 3, 2, 4, 2, 5]; // 8개
  const third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]; // 10개
  const firstLength = first.length;
  const secondLength = second.length;
  const thirdLength = third.length;

  let firstNewIndex = 0;
  let secondNewIndex = 0;
  let thirdNewIndex = 0;
  for (let i = 0; i < answers.length; i++) {
    firstNewIndex = i;
    secondNewIndex = i;
    thirdNewIndex = i;
    if (firstLength <= i) {
      firstNewIndex = i % firstLength;
    }
    if (secondLength <= i) {
      secondNewIndex = i % secondLength;
    }
    if (thirdLength <= i) {
      thirdNewIndex = i % thirdLength;
    }

    if (first[firstNewIndex] == answers[i]) {
      firstCounter++;
    }
    if (second[secondNewIndex] == answers[i]) {
      secondCounter++;
    }
    if (third[thirdNewIndex] == answers[i]) {
      thirdCounter++;
    }
  }

  if (firstCounter > secondCounter && firstCounter > thirdCounter) {
    answer.push(1);
  } else if (secondCounter > firstCounter && secondCounter > thirdCounter) {
    answer.push(2);
  } else if (thirdCounter > firstCounter && thirdCounter > secondCounter) {
    answer.push(3);
  } else if (firstCounter > thirdCounter && firstCounter == secondCounter) {
    answer.push(1);
    answer.push(2);
  } else if (firstCounter > secondCounter && firstCounter == thirdCounter) {
    answer.push(1);
    answer.push(3);
  } else if (secondCounter > firstCounter && secondCounter == thirdCounter) {
    answer.push(2);
    answer.push(3);
  } else if (firstCounter == secondCounter && firstCounter == thirdCounter) {
    answer.push(1);
    answer.push(2);
    answer.push(3);
  }
  //   console.log("firstCounter :", firstCounter);
  //   console.log("secondCounter : ", secondCounter);
  //   console.log("thirdCounter :", thirdCounter);
  return answer;
}
const answers = [1, 3, 2, 4, 2];
let result = solution(answers);
console.log(result);
