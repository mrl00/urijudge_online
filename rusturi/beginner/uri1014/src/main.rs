use std::io::stdin;

fn prepare_input() -> (f64, f64) {
    let mut distance = String::new();
    let mut gas = String::new();

    stdin()
        .read_line(&mut distance)
        .expect("failed to read input");
    stdin().read_line(&mut gas).expect("failed to read input");

    let distance: f64 = distance.trim().parse().expect("failed to parse");
    let gas: f64 = gas.trim().parse().expect("failed to parse");

    (distance, gas)
}

struct Consume {
    distance: f64,
    gas: f64,
}

impl Consume {
    fn new(x: (f64, f64)) -> Consume {
        Consume {
            distance: x.0,
            gas: x.1,
        }
    }

    fn show_consume(self) {
        println!("{:.3} km/l", self.distance / self.gas)
    }
}

fn main() {
    Consume::new(prepare_input()).show_consume()
}
