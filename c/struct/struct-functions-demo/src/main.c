#include <stdio.h>

struct lesson {
    const char *title;
    int minutes;
};

int is_short(const struct lesson *lesson) {
    /* const 指针表达“只读借用”，避免函数意外修改结构体。 */
    return lesson != NULL && lesson->minutes <= 15;
}

#ifndef UNIT_TEST
int main(void) {
    struct lesson lesson = {"C", 10};
    printf("%s: %d\n", lesson.title, is_short(&lesson));
    return 0;
}
#endif
