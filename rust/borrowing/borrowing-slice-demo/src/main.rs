fn title_case(text: &mut String) {
    if let Some(first) = text.get_mut(0..1) {
        first.make_ascii_uppercase();
    }
}

fn word_count(text: &str) -> usize {
    // 不接管字符串所有权，只在调用期间借用只读视图。
    text.split_whitespace().count()
}

fn main() {
    let mut text = String::from("rust language");
    title_case(&mut text);
    println!("{} / {}", text, word_count(&text));
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn borrows_mutably_then_immutably() {
        let mut text = String::from("rust");
        title_case(&mut text);
        assert_eq!(word_count(&text), 1);
    }
}
