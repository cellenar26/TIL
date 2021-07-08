function solution(participant, completion) {
  var answer = "";

  participant.sort();
  completion.sort();
  for (let i = 0; i < participant.length; i++) {
    if (participant[i] != completion[i]) {
      answer = participant[i];
      return answer;
    }
  }
}

const participant = ["leo", "kiki", "eden"];
const completion = ["eden", "kiki"];
const participant2 = ["mislav", "stanko", "mislav", "ana"];
const completion2 = ["stanko", "ana", "mislav"];
const participant3 = ["marina", "josipa", "nikola", "vinko", "filipa"];
const completion3 = ["josipa", "filipa", "marina", "nikola"];

console.log(solution(participant, completion));
console.log(solution(participant2, completion2));
console.log(solution(participant3, completion3));
