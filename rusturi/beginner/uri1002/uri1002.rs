use std::io;

static PI: f64 = 3.14159;

fn main() {
    let mut r = String::new();

    io::stdin()
        .read_line(&mut r)
        .expect("failed to read input.");

    let r: f64 = r.trim().parse().expect("failed to parse.");

    println!("A={:.4}", PI * r * r);
}
