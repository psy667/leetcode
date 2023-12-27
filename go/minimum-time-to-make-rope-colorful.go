package main

func minCost(colors string, neededTime []int) int {
  totalTime := 0
  cursor := 0

  for i := 1; i < len(colors); i++ {
    if colors[i] == colors[cursor] {
      if neededTime[i] < neededTime[cursor] {
        totalTime += neededTime[i]
        continue
      }
      totalTime += neededTime[cursor]
    }
    cursor = i
  }
  return totalTime
}
