#include <stdio.h>

#ifndef LESSON_VERSION
#define LESSON_VERSION 0
#endif

int lesson_version(void) {
    /* 宏在编译前展开；它适合构建配置，但不具备类型检查。 */
    return LESSON_VERSION;
}

#ifndef UNIT_TEST
int main(void) {
    printf("version=%d\n", lesson_version());
    return 0;
}
#endif
