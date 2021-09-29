use std::io::stdin;

fn input() -> Vec<i64> {
    let mut s = String::new();
    stdin().read_line(&mut s).expect("failed to read input");
    s.split_whitespace().map(|x| x.parse::<i64>().unwrap()).collect::<Vec<i64>>()
}

fn main() {
    let v = input();
     
    let mut v2 = v.clone();
    v2.sort(); v2.iter().for_each(|x| println!("{}", x));

    println!();

    v.iter().for_each(|x| println!("{}", x));
}
