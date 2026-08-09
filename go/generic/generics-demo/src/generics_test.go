package generics

import (
	"strconv"
	"testing"
)

func TestMap(t *testing.T) {
	got := Map([]int{1, 2}, strconv.Itoa)
	if got[0] != "1" || got[1] != "2" {
		t.Fatalf("unexpected result: %#v", got)
	}
}
