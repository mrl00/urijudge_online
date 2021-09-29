use std::io::stdin;

fn input() -> i64 {
    let mut s = String::new();
    stdin().read_line(&mut s).expect("failed to read input");
    s.trim().parse::<i64>().expect("failed to parse")
}

fn root2(n: i64, i: i64) -> f64 {
    if n == i {
        0.0
    } else {
        1.0 / (2.0 + root2(n, i + 1))
    }
}
fn main() {
    let x = input();
    println!("{:.10}", 1.0 + root2(x, 0))
}
