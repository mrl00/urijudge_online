use std::{io::stdin, ops::{Add, Mul}};

fn input() ->(f64, f64, f64) {
    let mut s = String::new();
    stdin().read_line(&mut s).expect("failed to read input");
    let s: Vec<f64> = s.split_whitespace().map(|x| x.parse::<f64>().unwrap()).collect::<Vec<f64>>();
    (s[0], s[1], s[2])
}

fn is_triangle(x: &(f64, f64, f64)) -> bool {
    let max = x.0.max(x.1).max(x.2);
    if max == x.0 && x.0 < x.1.add(x.2) {
        true
    } else if max == x.1 && x.1 < x.0.add(x.2) {
        true
    } else if max == x.2 && x.2 < x.1.add(x.0) {
        true
    } else {
        false
    }
}

fn area(x: &(f64, f64, f64)) -> f64 {
   x.0.add(x.1).mul(x.2).mul(0.5)
}

fn perimeter(x: &(f64, f64, f64)) -> f64 {
    x.0.add(x.1).add(x.2)
}

fn main() {
    let x = input();
    match is_triangle(&x) {
       true => println!("Perimetro = {:.1}", perimeter(&x)),
       _ => println!("Area = {:.1}", area(&x))
    }
}
