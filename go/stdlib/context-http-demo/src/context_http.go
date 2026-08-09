package contexthttp

import (
	"context"
	"net/http"
)

func RequestWithContext(ctx context.Context, client *http.Client, request *http.Request) (*http.Response, error) {
	// context 把取消和截止时间沿调用链传递给 HTTP 请求。
	return client.Do(request.WithContext(ctx))
}
