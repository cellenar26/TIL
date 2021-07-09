function solution(numbers) {
  var answer = "";
  answer = numbers
    .map((number) => number.toString())
    .sort((a, b) => b + a - (a + b))
    .join("");
  return answer[0] === "0" ? "0" : answer;
}
const numbers = [3, 30, 34, 5, 9];
solution(numbers);
//원소 타입이 숫자일 때 오름차순을 원한다면 => console.log(a.sort((a, b) => a - b - (b - a)));
//원소 타입이 숫자일 때 내림차순을 원한다면 => console.log(a.sort((a, b) => b - a - (a - b)));
