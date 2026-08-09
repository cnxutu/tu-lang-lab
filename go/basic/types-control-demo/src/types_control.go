package typescontrol

import "fmt"

type LessonState int

const (
	Draft LessonState = iota
	Published
)

func DescribeLesson(title string, state LessonState) string {
	// Go 用显式类型和 switch 表达有限状态，避免散落的魔法字符串。
	switch state {
	case Published:
		return fmt.Sprintf("%s [published]", title)
	default:
		return fmt.Sprintf("%s [draft]", title)
	}
}
