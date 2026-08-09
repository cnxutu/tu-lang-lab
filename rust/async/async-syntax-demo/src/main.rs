async fn greeting(name: &str) -> String {
    // async fn 只描述 Future；真正执行仍需要运行时或手写 executor。
    format!("hello {name}")
}

fn main() {
    // 本 Demo 保持无第三方依赖，展示语法形态；运行 Future 交给后续运行时 Demo。
    println!("async function declared: {}", std::any::type_name_of_val(&greeting("K5")));
}

#[cfg(test)]
mod tests {
    use super::*;
    #[test]
    fn async_function_is_declared() {
        let _future = greeting("K5");
        assert!(true);
    }
}
