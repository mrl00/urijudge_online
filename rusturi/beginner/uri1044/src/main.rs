use std::{io::stdin, ops::Rem};

fn input() -> (i64, i64) {
    let mut s = String::new();
    stdin().read_line(&mut s).expect("failed to read input");
    let s: Vec<i64> = s.split_whitespace().map(|x| x.parse::<i64>().unwrap()).collect();
    (s[0], s[1])
}

fn muliple(x: &(i64, i64)) -> bool {
    x.0.max(x.1).rem(x.0.min(x.1)).eq(&0)
}

fn main() {
    let x = input();
    println!("{}", match muliple(&x) {
       true => "Sao Multiplos",
       _ => "Nao sao Multiplos"
    })
}
