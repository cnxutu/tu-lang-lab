fn longest<'a>(left: &'a str, right: &'a str) -> &'a str {
    // 'a 说明返回引用不会超过两个输入引用中较短者的有效期。
    if left.len() >= right.len() { left } else { right }
}

fn main() {
    println!("{}", longest("borrow", "rust"));
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn returns_longer_slice() { assert_eq!(longest("abc", "rust"), "rust"); }
}
