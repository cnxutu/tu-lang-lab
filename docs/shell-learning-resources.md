# Shell / Bash 学习资源

| 资源 | 类型 | 推荐星级 | 推荐理由 |
| --- | --- | --- | --- |
| [GNU Bash Reference Manual](https://www.gnu.org/software/bash/manual/bash.html) | 官方手册 | ★★★★★ | Bash 语法、内置命令和执行模型的最权威参考 |
| [POSIX Shell Utilities](https://pubs.opengroup.org/onlinepubs/9699919799/utilities/contents.html) | 标准规范 | ★★★★★ | 学习 `/bin/sh` 可移植边界，区分 Bash 专属能力 |
| [GNU awk User's Guide](https://www.gnu.org/software/gawk/manual/gawk.html) | 官方手册 | ★★★★☆ | 管道文本处理和字段聚合的系统资料 |
| [ShellCheck](https://www.shellcheck.net/) | 工具 | ★★★★★ | 发现未引用变量、错误条件和常见可移植性问题 |
| [Google Shell Style Guide](https://google.github.io/styleguide/shellguide.html) | 工程规范 | ★★★★☆ | 给出命名、函数、错误处理和可读性建议 |
| [BashFAQ](https://mywiki.wooledge.org/BashFAQ) | 社区 FAQ | ★★★★☆ | 针对引用、数组、进程和陷阱的实战问答 |

## 推荐使用方式

1. 先运行 K5 Demo，建立输出和退出码直觉。
2. 查 Bash 手册确认语法语义，不把博客示例当作规范。
3. 对修改后的脚本执行 `bash -n script.sh` 和 ShellCheck。
4. 需要跨发行版时，再对照 POSIX 规范删除 Bash 专属语法。
