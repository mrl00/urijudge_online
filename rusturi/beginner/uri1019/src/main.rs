use std::{io::stdin, ops::Div};

fn main() {
    let mut n = String::new();
    stdin().read_line(&mut n).expect("failed to read input");

    let n: u64 = n.trim().parse().expect("failed to parse");

    let h = n / 3600;
    let m = (n % 3600).div(60);
    let s = (n % 3600) % 60;

    println!("{}:{}:{}", h, m, s);
}
