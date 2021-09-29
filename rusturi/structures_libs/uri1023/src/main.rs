use std::io::stdin;
use std::cmp::Ordering;

struct Houses {
    people: f64,
    mean: i64
}

impl PartialOrd for Houses {
    fn partial_cmp(&self, other: &Self) -> Option<Ordering> {
        Some(self.mean.cmp(&other.mean))
    }
}

impl PartialEq for Houses {
    fn eq(&self, other: &Self) -> bool {
        self.mean == other.mean
    }
}


fn input1() -> i64 {
    let mut s = String::new();
    stdin().read_line(&mut s).expect("failed to read line");
    let s: i64 = s.trim().parse::<i64>().expect("failed to parse");
    s
}

fn input2(s: i64) -> Vec<(i64, i64)> {
    let mut input = vec![];
    for _ in 1..=s {
        let mut a = String::new();
        stdin().read_line(&mut a).expect("failed to read line");
        let a: Vec<i64> = a.split_whitespace().map(|s| s.parse::<i64>().unwrap()).collect();
        input.push((a[0], a[1]))
    }
    let input = input;
    input
}

fn main() {
    let mut count: i64 = 1;
    loop {
        let n = input1(); if n == 0 { break; }
        let x = input2(n);
        println!("Cidade# 1:");
        x.iter().for_each(|v| print!("{}-{}", v.0, v.1))
        
    }
}
