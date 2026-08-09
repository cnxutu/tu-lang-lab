package goroutinechannel

func SquareAll(values []int) []int {
	results := make(chan int, len(values))
	for _, value := range values {
		go func(input int) {
			// goroutine 负责并发工作，channel 负责安全传递结果。
			results <- input * input
		}(value)
	}
	output := make([]int, 0, len(values))
	for range values {
		output = append(output, <-results)
	}
	return output
}
