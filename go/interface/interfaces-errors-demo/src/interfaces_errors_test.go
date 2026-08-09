package interfaceserrors

import (
	"errors"
	"testing"
)

func TestAcceptScore(t *testing.T) {
	if err := AcceptScore(Lesson{Value: -1}); !errors.Is(err, ErrInvalidScore) {
		t.Fatalf("expected invalid score, got %v", err)
	}
	if err := AcceptScore(Lesson{Value: 10}); err != nil {
		t.Fatalf("unexpected error: %v", err)
	}
}
