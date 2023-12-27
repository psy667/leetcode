package main

import "testing"

func TestMinCost(t *testing.T) {
    tests := []struct {
        colors     string
        neededTime []int
        want       int
    }{
        {"abaac", []int{1, 2, 3, 4, 5}, 3}, // Removing 'a' with cost 1 and 'c' with cost 2
        {"abc", []int{1, 2, 3}, 0},          // No removals needed, cost is 0
        {"aabbcc", []int{1, 2, 1, 2, 1, 2}, 3}, // Remove one 'a', one 'b', and one 'c'
        {"aaaa", []int{1, 2, 3, 4}, 6},     // Removing first three 'a's with the cost of 1+2+3
        {"", []int{}, 0},                    // No colors, cost is 0
        {"ababab", []int{1, 1, 1, 1, 1, 1}, 0}, // Alternate colors, no removals
        {"bbb", []int{4, 5, 5}, 9},            // Remove first two 'b's with a cost of 4+5
    }

    for _, tc := range tests {
        got := minCost(tc.colors, tc.neededTime)
        if got != tc.want {
            t.Errorf("minCost(%v, %v) = %v; want %v", tc.colors, tc.neededTime, got, tc.want)
        }
    }
}
