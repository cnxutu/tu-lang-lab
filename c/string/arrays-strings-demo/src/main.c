#include <stddef.h>
#include <stdio.h>

size_t lesson_length(const char *text) {
    size_t length = 0;
    /* C 字符串以 '\0' 结束，长度函数必须遵守这个约定。 */
    while (text != NULL && text[length] != '\0') {
        length++;
    }
    return length;
}

#ifndef UNIT_TEST
int main(void) {
    printf("%zu\n", lesson_length("C"));
    return 0;
}
#endif
