function solution(d, budget) {
  var answer = 0;
  let sortD = [...d].sort((a, b) => {
    // 숫자 오름차순 정렬
    if (a > b) return 1;
    if (a == b) return 0;
    if (a < b) return -1;
  });
  // console.log(sortD);
  for (let i = 0; i < d.length; i++) {
    let now = budget - sortD[i];
    if (now >= 0) {
      answer++;
    } else {
      break;
    }
    budget -= sortD[i];
  }
  return answer;
}
const d = [1, 3, 2, 5, 4];
// const d = [2, 2, 3, 3];
const budget = 9;
console.log(solution(d, budget));
