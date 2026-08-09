# pathlib and JSON Demo

## Feature
组合 `pathlib`、JSON 和显式 UTF-8 完成标准库文件边界。
## Version & Status
Python 3.13；stable standard library。
## Background
路径和序列化是脚本、配置与数据交换的基础能力。
## Problem
字符串拼路径和默认编码会造成平台差异。
## Example
`round_trip` 写入中文 JSON，再读取回原始字典。
## Usage Scenario
配置文件、实验结果和小型数据交换。
## Limitations
示例一次性读写小文件；大数据需要流式 JSON 或专用格式。
## Code Walkthrough
Path 负责路径语义，json 负责文本格式，encoding 固定为 UTF-8。
## Business Mapping
问题 → 文件格式和平台路径不稳定；特性 → pathlib/json；收益 → 可移植标准库代码；风险/替代 → schema 校验和并发写入需另行设计。
## Learning Resources
- [pathlib](https://docs.python.org/3/library/pathlib.html)（★★★★★，官方 API）
- [json](https://docs.python.org/3/library/json.html)（★★★★★，官方 API）
- [Python Packaging User Guide](https://packaging.python.org/)（★★★★☆，工程实践）
## Run
`python -m unittest discover -s tests`；`python src/pathlib_json_demo.py`。
## Verification
测试验证中文内容 UTF-8 往返，并使用临时目录清理文件。
