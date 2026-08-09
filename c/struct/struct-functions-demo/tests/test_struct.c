#include <assert.h>

struct lesson { const char *title; int minutes; };
int is_short(const struct lesson *lesson);

int main(void) {
    struct lesson lesson = {"C", 10};
    assert(is_short(&lesson) == 1);
    assert(is_short(NULL) == 0);
    return 0;
}
