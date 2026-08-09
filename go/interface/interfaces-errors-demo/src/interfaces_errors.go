package interfaceserrors

import "errors"

var ErrInvalidScore = errors.New("invalid score")

type Scorer interface {
	Score() int
}

type Lesson struct{ Value int }

func (lesson Lesson) Score() int { return lesson.Value }

func AcceptScore(scorer Scorer) error {
	// 接口只描述调用方需要的能力，错误值明确表达失败原因。
	if scorer.Score() < 0 {
		return ErrInvalidScore
	}
	return nil
}
