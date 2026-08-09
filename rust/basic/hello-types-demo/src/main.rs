#[derive(Debug, PartialEq)]
enum ParseState {
    Ready,
    Invalid,
}

fn classify(input: &str) -> ParseState {
    // 枚举把有限状态显式建模，调用方可以用 match 强制处理每一种状态。
    if input.trim().is_empty() { ParseState::Invalid } else { ParseState::Ready }
}

fn main() {
    println!("{:?}", classify("K5"));
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn classifies_empty_input() { assert_eq!(classify(" "), ParseState::Invalid); }
}
