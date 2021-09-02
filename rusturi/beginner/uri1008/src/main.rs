use std::io;

struct Salary {
    emp_num: i64,
    wor_hrs: f64,
    per_hou: f64,
}

impl Salary {
    fn new(emp_num: i64, wor_hrs: f64, per_hou: f64) -> Salary {
        Salary {
            emp_num,
            wor_hrs,
            per_hou,
        }
    }

    fn show_abstract(&self) {
        println!("NUMBER = {}", self.emp_num);
        println!("SALARY = U$ {:.2}", self.wor_hrs * self.per_hou);
    }
}

fn main() {
    let mut a = String::new();
    let mut b = String::new();
    let mut c = String::new();

    io::stdin()
        .read_line(&mut a)
        .expect("failed to read input.");
    io::stdin()
        .read_line(&mut b)
        .expect("failed to read input.");
    io::stdin()
        .read_line(&mut c)
        .expect("failed to read input.");

    let a: i64 = a.trim().parse().expect("failed to parse.");
    let b: f64 = b.trim().parse().expect("failed to parse.");
    let c: f64 = c.trim().parse().expect("failed to parse.");
    Salary::new(a, b, c).show_abstract();
}
