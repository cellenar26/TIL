function solution(nums) {
  var answer = 0;
  for (let i = 0; i < nums.length - 2; i++) {
    for (let j = i + 1; j < nums.length - 1; j++) {
      for (let k = j + 1; k < nums.length; k++) {
        let calc = isPrime(nums[i] + nums[j] + nums[k]);
        if (calc == true) {
          answer++;
          // console.log(`${nums[i]}, ${nums[j]}, ${nums[k]}`);
          // console.log("prime: ", nums[i] + nums[j] + nums[k]);
        }
      }
    }
  }

  return answer;
}
// 아래 함수 출처: https://ant-programmer.tistory.com/2
function isPrime(num) {
  if (num === 2) return true;

  for (let i = 2; i <= num / 2; i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
}
