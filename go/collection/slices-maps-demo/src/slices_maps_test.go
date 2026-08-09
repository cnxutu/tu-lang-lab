package slicesmaps

import "testing"

func TestGroupAndFirst(t *testing.T) {
	counts := GroupByLanguage([]string{"go", "c", "go"})
	if counts["go"] != 2 || counts["c"] != 1 {
		t.Fatalf("unexpected counts: %#v", counts)
	}
	if _, ok := First(nil); ok {
		t.Fatal("empty slice should report absence")
	}
}
