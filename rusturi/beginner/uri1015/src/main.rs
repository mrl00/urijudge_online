use std::{io::stdin, ops::Add};

struct Point {
    x: f64,
    y: f64,
}

impl Point {
    fn new(x: f64, y: f64) -> Point {
        Point { x, y }
    }

    fn distance(self, b: Point) -> f64 {
        (b.x - self.x).powi(2).add((b.y - self.y).powi(2)).sqrt()
    }
}

fn prepare_input() -> (Point, Point) {
    let mut l1 = String::new();
    let mut l2 = String::new();

    stdin().read_line(&mut l1).expect("failed to read line");
    stdin().read_line(&mut l2).expect("failed to read line");

    let l1: Vec<f64> = l1
        .split_whitespace()
        .map(|s| s.parse::<f64>().unwrap())
        .collect();
    let l2: Vec<f64> = l2
        .split_whitespace()
        .map(|s| s.parse::<f64>().unwrap())
        .collect();

    (Point::new(l1[0], l1[1]), Point::new(l2[0], l2[1]))
}

fn main() {
    let (p1, p2) = prepare_input();
    println!("{:.4}", p1.distance(p2));
}
