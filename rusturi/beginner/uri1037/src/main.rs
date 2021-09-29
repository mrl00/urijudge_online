use std::io::stdin;

fn get_input() -> f64 {
    let mut line = String::new();
    stdin().read_line(&mut line).expect("failed to read input");
    let line: f64 = line.trim().parse().expect("failed to parse");
    line
}

fn intervalo<'a>(x: f64) -> &'a str {
    if x >= 0.0 && x <= 25.0 {
        "Intervalo [0,25]"
    } else if x > 25.0 && x <= 50.0 {
        "Intervalo (25,50]"
    } else if x > 50.0 && x <= 75.0 {
        "Intervalo (50,75]"
    } else if x > 75.0 && x <= 100.0 {
        "Intervalo (75,100]"
    } else {
        "Fora de intervalo"
    }
}

fn main() {
    println!("{}", intervalo(get_input()))
}
