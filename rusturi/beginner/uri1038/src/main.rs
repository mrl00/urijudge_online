use std::{collections::HashMap, io::stdin};

fn get_input() -> (i64, f64) {
    let mut line = String::new();
    stdin().read_line(&mut line).expect("failed to read input");
    let line: Vec<f64> = line
        .split_whitespace()
        .map(|s| s.parse::<f64>().unwrap())
        .collect();
    (line[0] as i64, line[1])
}

fn lanche(c: i64, q: f64) -> f64 {
    let mut menu: HashMap<i64, f64> = std::collections::HashMap::new();

    menu.insert(1, 4.0);
    menu.insert(2, 4.5);
    menu.insert(3, 5.0);
    menu.insert(4, 2.0);
    menu.insert(5, 1.5);

    match menu.get(&c) {
        Some(x) => q * x,
        None => panic!("code not found"),
    }
}

fn main() {
    let (c, q) = get_input();
    println!("Total: R$ {:.2}", lanche(c, q))
}
