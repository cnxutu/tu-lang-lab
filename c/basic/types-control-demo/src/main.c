#include <stdio.h>

enum lesson_state { LESSON_DRAFT, LESSON_PUBLISHED };

const char *lesson_label(enum lesson_state state) {
    /* 枚举和 switch 把有限状态写进类型，避免依赖魔法字符串。 */
    switch (state) {
        case LESSON_PUBLISHED: return "published";
        case LESSON_DRAFT: return "draft";
    }
    return "unknown";
}

#ifndef UNIT_TEST
int main(void) {
    printf("%s\n", lesson_label(LESSON_PUBLISHED));
    return 0;
}
#endif
