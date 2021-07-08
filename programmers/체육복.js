function solution(n, lost, reserve) {
  const realLost = lost.filter((item) => !reserve.includes(item));
  const realReserve = reserve.filter((item) => !lost.includes(item));
  var answer = n - realLost.length;

  for (let i = 0; i < realReserve.length; i++) {
    for (let j = 0; j < realLost.length; j++) {
      if ((realReserve[i] - 1 == realLost[j] || realReserve[i] + 1 == realLost[j]) && realLost[j] != -100) {
        answer++;
        realLost[j] = -100;
        break;
      }
    }
  }

  return answer;
}
