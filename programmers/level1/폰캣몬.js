function solution(nums) {
  var answer = [...new Set(nums)];
  var limit = nums.length / 2;

  return answer.length > limit ? limit : answer.length;
}
