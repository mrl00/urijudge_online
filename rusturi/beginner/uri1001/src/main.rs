use std::io;

fn main() {
    let mut a = String::new();
    let mut b = String::new();

    io::stdin()
        .read_line(&mut a)
        .expect("failed to read input.");

    io::stdin()
        .read_line(&mut b)
        .expect("failed to read input.");

    let a: i32 = a.trim().parse().expect("invalid input");
    let b: i32 = b.trim().parse().expect("invalid input");

    println!("X = {}", a + b);
}
