use std::io::stdin;

fn main() {
    let mut time = String::new();
    let mut velocity = String::new();

    stdin()
        .read_line(&mut time)
        .expect("failed to read input to time");
    stdin()
        .read_line(&mut velocity)
        .expect("failed to read input for velocity");

    let time = time.trim().parse::<f64>().expect("failed to parse time");
    let velocity = velocity
        .trim()
        .parse::<f64>()
        .expect("failed to parse velocity");

    println!("{:.3}", time * velocity / 12.0)
}
