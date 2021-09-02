use std::io::stdin;

static PI: f64 = 3.14159;

fn get_input() -> (f64, f64, f64) {
    let mut lin = String::new();
    stdin().read_line(&mut lin).expect("failed to read input");
    let ans: Vec<f64> = lin
        .split_whitespace()
        .map(|s| s.parse::<f64>().unwrap())
        .collect();

    (ans[0], ans[1], ans[2])
}

trait Area {
    fn area(self) -> f64;
    fn show_area(self);
}

struct Triangle {
    A: f64,
    C: f64,
}

impl Area for Triangle {
    fn area(self) -> f64 {
        self.A * self.C / 2.0
    }

    fn show_area(self) {
        println!("TRIANGULO: {:.3}", self.area())
    }
}

struct Circle {
    C: f64,
}

impl Area for Circle {
    fn area(self) -> f64 {
        PI * self.C * self.C
    }

    fn show_area(self) {
        println!("CIRCULO: {:.3}", self.area())
    }
}

struct Trapeze {
    A: f64,
    B: f64,
    C: f64,
}

impl Area for Trapeze {
    fn area(self) -> f64 {
        (self.A + self.B) * self.C / 2.0
    }
    fn show_area(self) {
        println!("TRAPEZIO: {:.3}", self.area())
    }
}

struct Square {
    B: f64,
}

impl Area for Square {
    fn area(self) -> f64 {
        self.B * self.B
    }

    fn show_area(self) {
        println!("QUADRADO: {:.3}", self.area())
    }
}

struct Rectangle {
    A: f64,
    B: f64,
}

impl Area for Rectangle {
    fn area(self) -> f64 {
        self.A * self.B
    }

    fn show_area(self) {
        println!("RETANGULO: {:.3}", self.area())
    }
}

fn main() {
    let (A, B, C) = get_input();
    Triangle { A, C }.show_area();
    Circle { C }.show_area();
    Trapeze { A, B, C }.show_area();
    Square { B }.show_area();
    Rectangle { A, B }.show_area();
}
