use std::{
    io::stdin,
    ops::{Div, Rem},
};

fn main() {
    let mut num = String::new();
    stdin().read_line(&mut num).expect("failed to read input");

    let num: u64 = num.trim().parse().expect("failed to parse");

    let a = num.div(365);
    let m = num.rem(365).div(30);
    let d = num.rem(365).rem(30);
    println!("{} ano(s)\n{} mes(es)\n{} dia(s)", a, m, d);
}
