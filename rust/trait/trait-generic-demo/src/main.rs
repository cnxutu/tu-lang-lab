trait Summarize {
    fn summary(&self) -> String;
}

struct Lesson { title: String }

impl Summarize for Lesson {
    fn summary(&self) -> String { format!("Lesson: {}", self.title) }
}

fn print_summary<T: Summarize>(item: &T) -> String {
    // trait bound 让泛型函数只接受具备明确能力的类型。
    item.summary()
}

fn main() {
    println!("{}", print_summary(&Lesson { title: "ownership".into() }));
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn dispatches_trait_behavior() {
        let lesson = Lesson { title: "traits".into() };
        assert_eq!(print_summary(&lesson), "Lesson: traits");
    }
}
