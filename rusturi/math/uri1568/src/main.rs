use std::{io::{Read, stdin}, ops::{Div, Mul, Sub}, time::Instant};

fn input() -> Vec<i64> {
    let mut s = String::new();
    stdin().read_to_string(&mut s).expect("failed to read input");
    let s: Vec<i64> = s.lines().map(|x| x.parse::<i64>().unwrap()).collect();
    s
}

fn seq_sum(l: i64) -> i64 {
    l.mul(l - 1).div(2)
}

fn sm(n: &i64) -> i64 {
    let mut count = 1;
    let mut l: i64 = 1;
    while seq_sum(l + 1) < *n  {
        let a = (n - seq_sum(l + 1)) / (l + 1);
        if a == 0 {
            count += 1;
        }
        l += 1;
    }
    count
}

fn main() {
    //let n = input();
    //n.iter().for_each(|x| println!("{:.0}", sm(&x)));
     
    let start = Instant::now();
    let mut s = String::new();
    stdin().read_to_string(&mut s).expect("failed to read input");
    s.lines().for_each(|x| {
        let k = x.parse::<i64>().unwrap();
        println!("{}", sm(&k));
    });
    let duration = start.elapsed();
    println!("time {:?}", duration)
}
