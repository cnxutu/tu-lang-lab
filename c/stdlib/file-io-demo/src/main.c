#include <stdio.h>

int write_lesson(FILE *file, const char *title) {
    /* FILE* 是资源句柄，调用方必须负责 fclose；写入结果也要检查。 */
    return file != NULL && title != NULL && fprintf(file, "%s\n", title) >= 0;
}

#ifndef UNIT_TEST
int main(void) {
    return write_lesson(stdout, "C file IO") ? 0 : 1;
}
#endif
