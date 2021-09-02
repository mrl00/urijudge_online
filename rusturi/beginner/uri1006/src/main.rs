use std::io::stdin;

fn media2(a: f64, b: f64, c: f64) -> f64 {
    (a * 2.0 + b * 3.0 + c * 5.0) / 10.0
}

fn main() {
    let mut a = String::new();
    let mut b = String::new();
    let mut c = String::new();

    stdin().read_line(&mut a).expect("failed to read input.");
    stdin().read_line(&mut b).expect("failed to read input.");
    stdin().read_line(&mut c).expect("failed to read input.");

    let a: f64 = a.trim().parse().expect("failed to parse");
    let b: f64 = b.trim().parse().expect("failed to parse");
    let c: f64 = c.trim().parse().expect("failed to parse");

    println!("MEDIA = {:1}", media2(a, b, c))
}
