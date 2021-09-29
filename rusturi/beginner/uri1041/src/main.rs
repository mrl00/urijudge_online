use std::io::stdin;

fn input() -> (f64, f64) {
    let mut s = String::new();
    stdin().read_line(&mut s).expect("failed to read input");
    let s: Vec<f64> = s.split_whitespace().map(|x| x.parse::<f64>().unwrap()).collect();
    (s[0], s[1])
}

fn ans<'a>(x: f64, y: f64) -> &'a str {
    if x.eq(&0.0) && !y.eq(&0.0) { return "Eixo Y"  }
    if y.eq(&0.0) && !x.eq(&0.0) { return "Eixo X" }
    if x.eq(&0.0) &&  y.eq(&0.0) { return "Origem" }
    if x.gt(&0.0) {
        if y.gt(&0.0) { "Q1" }
        else { "Q4" }
    } else {
        if y.gt(&0.0) { "Q2" }
        else { "Q3" }
    }
}

fn main() {
    let (a,b) = input();
    println!("{}", ans(a,b))
}
