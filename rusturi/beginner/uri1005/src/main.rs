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

    let a: f64 = a.trim().parse().expect("failed to parse");
    let b: f64 = b.trim().parse().expect("failed to parse");

    println!("MEDIA = {:.5}", (a * 3.5 + b * 7.5) / 11.0);
}
