fn consume(text: String) -> usize {
    text.len()
}

fn main() {
    let original = String::from("language");
    // String 在赋值时移动所有权，避免多个可变拥有者造成悬垂指针。
    let length = consume(original);
    println!("{length}");
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn consumes_owned_value() { assert_eq!(consume(String::from("K5")), 2); }
}
