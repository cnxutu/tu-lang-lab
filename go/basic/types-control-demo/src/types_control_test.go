package typescontrol

import "testing"

func TestDescribeLesson(t *testing.T) {
	if got := DescribeLesson("Go", Published); got != "Go [published]" {
		t.Fatalf("unexpected description: %s", got)
	}
}
