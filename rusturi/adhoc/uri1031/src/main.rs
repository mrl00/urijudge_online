use std::io::stdin;

fn josephus(n: i64, m: i64) -> i64 {
    if n == 1 { 1 }
    else {
        (josephus(n - 1, m) + m - 1) % n + 1
    }
}

fn read_int() -> i64 {
    let mut line = String::new();
    stdin().read_line(&mut line).expect("failed to read input");
    let line: i64 = line.trim().parse().expect("failed to parse");
    line
}

fn main() {
    loop {
       let n = read_int();
       if n == 0 { break; }
       else {

       }
    }
}
