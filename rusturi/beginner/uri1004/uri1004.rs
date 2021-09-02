use std::io;

fn main() {
    let mut a = String::new();
    let mut b = String::new();

    io::stdin()
        .read_line(&mut a)
        .expect("failet to read input.");

    io::stdin()
        .read_line(&mut b)
        .expect("failed to read input.");

    let a: i64 = a.trim().parse().expect("failed to parse");
    let b: i64 = b.trim().parse().expect("failed to parse");

    println!("PROD = {}", a * b);
}
