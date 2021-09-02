use std::io::stdin;

fn main() {
    let mut n = String::new();
    stdin().read_line(&mut n).expect("failed to read input");

    let n: i64 = n.trim().parse().expect("failed to parse");

    println!("{} minutos", n * 2)
}
