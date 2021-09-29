use std::{io::stdin, ops::Add};

fn input() -> (f64, f64, f64) {
    let mut s = String::new();
    stdin().read_line(&mut s).expect("failed to read input");
    let mut s: Vec<f64> = s.split_whitespace().map(|x| x.parse::<f64>().unwrap()).collect();
    s.sort_by(|a,b| a.partial_cmp(b).unwrap());
    let s = s;
    (s[0], s[1], s[2])
}

fn check_triangle<'a>(x: &(f64, f64, f64)) {
    if x.2 >= x.1.add(x.0) {
        println!("{}","NAO FORMA TRIANGULO")
    } else if x.2.powi(2) > x.1.powi(2).add(x.0.powi(2)) {
        println!("{}","TRIANGULO OBTUSANGULO")
    }

    if x.2.powi(2) == x.1.powi(2).add(x.0.powi(2)) {
        println!("{}","TRIANGULO RETANGULO")
    }
        if x.2.powi(2) < x.1.powi(2).add(x.0.powi(2)) {
        println!("{}","TRIANGULO ACUTANGULO")
    }
    if x.0 == x.1 && x.1 == x.2 {
       println!("{}","TRIANGULO EQUILATERO")
    } else if (x.0 == x.1 && x.1 != x.2) || (x.1 == x.2 && x.1 != x.0) || (x.2 == x.0 && x.2 != x.1){
        println!("{}","TRIANGULO ISOSCELES")
    } 
}

fn main() {
    let x = input();
   check_triangle(&x);
}
