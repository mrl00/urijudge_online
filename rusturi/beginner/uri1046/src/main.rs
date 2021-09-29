use std::{io::stdin, ops::Add};

fn input() -> (i64, i64) {
    let mut s = String::new(); stdin().read_line(&mut s).expect("failed to read input");
    let s: Vec<i64> = s.split_whitespace().map(|z| z.parse::<i64>().unwrap()).collect();
    (s[0], s[1])

}

fn game_time(x: &(i64, i64)) -> i64 {
    if x.0.ge(&x.1) {
        24.add(-x.0).add(x.1)
    } else {
        x.1.add(-x.0)
    }
}

fn main() {
    let x = input();
    println!("O JOGO DUROU {} HORA(S)", game_time(&x))
}
