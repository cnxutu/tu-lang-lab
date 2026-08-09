fn parse_port(input: &str) -> Result<u16, String> {
    // Result 强制调用方处理成功和失败，避免异常状态被静默忽略。
    input.parse::<u16>().map_err(|_| format!("invalid port: {input}"))
}

fn find_lesson<'a>(lessons: &'a [(&str, u8)], id: u8) -> Option<&'a str> {
    lessons.iter().find(|(_, lesson_id)| *lesson_id == id).map(|(name, _)| *name)
}

fn main() {
    println!("{:?}", parse_port("8080"));
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn models_failure_and_missing_value() {
        assert!(parse_port("bad").is_err());
        assert_eq!(find_lesson(&[("ownership", 1)], 2), None);
    }
}
