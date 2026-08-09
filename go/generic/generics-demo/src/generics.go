package generics

func Map[T any, R any](values []T, transform func(T) R) []R {
	result := make([]R, 0, len(values))
	for _, value := range values {
		// 类型参数让同一算法适配多种输入和输出类型，并保留编译期检查。
		result = append(result, transform(value))
	}
	return result
}
