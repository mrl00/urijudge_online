use std::io;

struct Info {
    fix_sal: f64,
    sells: f64,
}

impl Info {
    fn new(fix_sal: f64, sells: f64) -> Info {
        Info { fix_sal, sells }
    }

    fn show_abstract(&self) {
        println!("TOTAL = R$ {:.2}", self.fix_sal + 0.15 * self.sells)
    }
}

fn main() {
    let mut a = String::new();
    let mut b = String::new();

    io::stdin()
        .read_line(&mut a)
        .expect("failed to read input.");
    a.clear();
    io::stdin()
        .read_line(&mut a)
        .expect("failed to read input.");
    io::stdin()
        .read_line(&mut b)
        .expect("failed to read input.");

    let a: f64 = a.trim().parse().expect("failed to parse.");
    let b: f64 = b.trim().parse().expect("failed to parse.");

    Info::new(a, b).show_abstract();
}
