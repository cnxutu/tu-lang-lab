package slicesmaps

func GroupByLanguage(values []string) map[string]int {
	counts := make(map[string]int)
	for _, value := range values {
		// map 的零值为 0，直接累加即可表达频次统计。
		counts[value]++
	}
	return counts
}

func First(values []string) (string, bool) {
	if len(values) == 0 {
		return "", false
	}
	return values[0], true
}
