fn first<T>(items: &[T]) -> Option<&T> {
    // 泛型函数只要求切片提供索引能力，调用方仍保留具体类型信息。
    items.first()
}

fn main() {
    println!("{}", first(&["ownership", "traits"]).unwrap());
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn works_for_multiple_types() {
        assert_eq!(first(&[1, 2]), Some(&1));
        assert_eq!(first::<i32>(&[]), None);
    }
}
