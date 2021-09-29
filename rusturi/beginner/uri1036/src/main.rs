use std::io::stdin;

fn get_input() -> (f64, f64, f64) {
    let mut line = String::new();
    stdin().read_line(&mut line).expect("failed to read input");

    let x: Vec<f64> = line
        .split_whitespace()
        .map(|s| s.parse::<f64>().unwrap())
        .collect();

    (x[0], x[1], x[2])
}

fn bhaskara(a: f64, b: f64, c: f64) -> Option<(f64, f64)> {
    let delta: f64 = b.powf(2.0) - 4.0 * a * c;
    let den: f64 = a * 2.0;

    match delta >= 0.0 && a != 0.0 {
        true => {
            let r1: f64 = (-b + delta.sqrt()) / den;
            let r2: f64 = (-b - delta.sqrt()) / den;
            Some((r1, r2))
        }
        false => None,
    }
}

fn main() {
    let (a, b, c) = get_input();
    match bhaskara(a, b, c) {
        Some(roots) => println!("R1 = {:.5}\nR2 = {:.5}", roots.0, roots.1),
        None => println!("Impossivel calcular"),
    }
}
