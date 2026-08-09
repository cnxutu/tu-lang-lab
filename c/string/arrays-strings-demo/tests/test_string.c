#include <assert.h>
#include <stddef.h>

size_t lesson_length(const char *text);

int main(void) {
    assert(lesson_length("language") == 8);
    assert(lesson_length(NULL) == 0);
    return 0;
}
