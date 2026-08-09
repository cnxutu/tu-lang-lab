#include <assert.h>
#include <stdio.h>

int write_lesson(FILE *file, const char *title);

int main(void) {
    FILE *file = tmpfile();
    assert(file != NULL);
    assert(write_lesson(file, "C") == 1);
    assert(write_lesson(NULL, "C") == 0);
    fclose(file);
    return 0;
}
