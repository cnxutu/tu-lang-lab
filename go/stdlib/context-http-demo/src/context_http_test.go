package contexthttp

import (
	"context"
	"errors"
	"net/http"
	"testing"
)

func TestRequestWithCancelledContext(t *testing.T) {
	ctx, cancel := context.WithCancel(context.Background())
	cancel()
	request, err := http.NewRequest(http.MethodGet, "http://example.invalid", nil)
	if err != nil {
		t.Fatal(err)
	}
	_, err = RequestWithContext(ctx, http.DefaultClient, request)
	if !errors.Is(err, context.Canceled) {
		t.Fatalf("expected cancellation, got %v", err)
	}
}
