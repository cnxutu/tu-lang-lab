package goroutinechannel

import (
	"sort"
	"testing"
)

func TestSquareAll(t *testing.T) {
	got := SquareAll([]int{1, 2, 3})
	sort.Ints(got)
	want := []int{1, 4, 9}
	for index := range want {
		if got[index] != want[index] {
			t.Fatalf("unexpected result: %#v", got)
		}
	}
}
