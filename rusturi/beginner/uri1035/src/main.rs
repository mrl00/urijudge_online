use std::io::stdin;

fn get_input() -> (i64, i64, i64, i64) {
    let mut line = String::new();
    stdin().read_line(&mut line).expect("failed to read input");
    let x: Vec<i64> = line
        .split_whitespace()
        .map(|s| s.parse::<i64>().unwrap())
        .collect();
    (x[0], x[1], x[2], x[3])
}

fn selection<'a>(a: i64, b: i64, c: i64, d: i64) -> &'a str {
    if b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0 {
        return "Valores aceitos";
    }
    return "Valores nao aceitos";
}

fn main() {
    let (a, b, c, d) = get_input();
    println!("{}", selection(a, b, c, d));
}
