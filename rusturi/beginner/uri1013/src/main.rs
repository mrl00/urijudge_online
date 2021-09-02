use std::io::stdin;

fn prepare_input() -> (i64, i64, i64) {
    let mut lin = String::new();
    stdin().read_line(&mut lin).expect("failed to read line");

    let a: Vec<i64> = lin
        .split_whitespace()
        .map(|s| s.parse::<i64>().unwrap())
        .collect();

    (a[0], a[1], a[2])
}

fn bigger(a: i64, b: i64) -> i64 {
    let abs = |x: i64| if x >= 0 { x } else { -x };
    (a + b + abs(a - b)) / 2
}

fn main() {
    let (a, b, c) = prepare_input();
    println!("{} eh o maior", bigger(bigger(a, b), c))
}
