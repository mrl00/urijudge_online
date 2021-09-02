use std::io::stdin;

fn dif(a: i64, b: i64, c: i64, d: i64) -> i64 {
    a * b - c * d
}

fn main() {
    let mut v: [String; 4] = 
        [String::new(), String::new(), String::new(), String::new()];

    stdin().read_line(&mut v[0]).expect("failed to parse.");
    stdin().read_line(&mut v[1]).expect("failed to parse.");
    stdin().read_line(&mut v[2]).expect("failed to parse.");
    stdin().read_line(&mut v[3]).expect("failed to parse.");

    let k: [i64; 4] = [
        v[0].trim().parse().expect("failed to parse"),
        v[1].trim().parse().expect("failed to parse"),
        v[2].trim().parse().expect("failed to parse"),
        v[3].trim().parse().expect("failed to parse"),
    ];

    println!("DIFERENCA = {}", dif(k[0], k[1], k[2], k[3]))
}
