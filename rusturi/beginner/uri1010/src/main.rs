use std::{io, ops::Add};

#[derive(Debug)]
struct Part {
    code: i32,
    qty: f64,
    price: f64,
}

impl Part {
    fn new() -> Part {
        let mut line = String::new();

        io::stdin()
            .read_line(&mut line)
            .expect("failed to read code.");

        let a: Vec<_> = line.split(" ").collect();

        let code: i32 = a[0].trim().parse().expect("failed to parse code");
        let qty: f64 = a[1].trim().parse().expect("failed to parse qty");
        let price: f64 = a[2].trim().parse().expect("failed to parse price");

        Part { code, qty, price }
    }
}

impl Add<Part> for Part {
    type Output = f64;

    fn add(self, b: Part) -> f64 {
        self.price * self.qty + b.price * b.qty
    }
}

fn main() {
    let p1: Part = Part::new();
    let p2: Part = Part::new();

    println!("VALOR A PAGAR: R$ {:.2}", p1 + p2)
}
