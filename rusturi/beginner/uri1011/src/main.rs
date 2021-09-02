use std::io::stdin;

static PI: f64 = 3.14159;

struct Sphere {
    r: f64,
}

impl Sphere {
    fn new(r: f64) -> Sphere {
        Sphere { r }
    }

    fn volume(self) -> f64 {
        (4.0 / 3.0) * PI * self.r * self.r * self.r
    }
}

fn main() {
    let mut r = String::new();

    stdin().read_line(&mut r).expect("failed to read r");

    let r: f64 = r.trim().parse().expect("failed to parse r");

    println!("VOLUME = {:.3}", Sphere::new(r).volume())
}
