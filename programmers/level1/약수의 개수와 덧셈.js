function solution(left, right) {
  var answer = 0;
  let counter = 0;
  for (let i = left; i <= right; i++) {
    counter = 0;
    let nowNum = i;
    for (let j = 1; j <= nowNum; j++) {
      if (nowNum % j == 0) {
        counter++;
      }
    }
    if (counter % 2 == 0) {
      answer = answer + i;
    } else if (counter % 2 != 0) {
      answer = answer - i;
    }
  }
  return answer;
}
