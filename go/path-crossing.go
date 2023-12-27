package main

import "fmt"

func isPathCrossing(path string) bool {
  visited := make(map[string]struct{})
  x, y := 0, 0
  visited["0:0"] = struct{}{}

  for _, it := range path {
    switch it {
      case 'N':
        y--
      case 'S':
        y++
      case 'W':
        x--
      case 'E':
        x++
    }

    key := fmt.Sprintf("%d:%d", x, y)

    if _, found := visited[key]; found {
      return true
    } else {
      visited[key] = struct{}{}
    }
  }
  return false
}
