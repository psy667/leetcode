package main

import "testing"

func TestIsPathCrossing(t *testing.T) {
    tests := []struct {
        name   string
        path   string
        result bool
    }{
        {"No Crossing", "NES", false},
        {"Simple Crossing", "NESWW", true},
        {"Cross in the Middle", "NENESSWW", true},
        {"Multiple Crossings", "NESWNESWNESW", true},
        {"Long Non-Crossing", "NENENENENENE", false},
        {"Empty Path", "", false},
    }

    for _, test := range tests {
        t.Run(test.name, func(t *testing.T) {
            if got := isPathCrossing(test.path); got != test.result {
                t.Errorf("isPathCrossing(%q) = %v; want %v", test.path, got, test.result)
            }
        })
    }
}
