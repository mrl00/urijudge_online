use std::io::stdin;

fn ballots_counter(x: f64, mut v: Vec<f64>) {
    if v.is_empty() {
        return;
    }

    let vv: f64 = v.pop().unwrap();
    let val: f64 = (x / vv).trunc();

    println!("{:.0} nota(s) de R$ {:.0},00", val, vv);

    ballots_counter(x % vv, v)
}

fn main() {
    let mut num = String::new();
    stdin().read_line(&mut num).expect("failed to read input");
    let num: f64 = num.trim().parse().expect("failed to parse");

    let mut v: Vec<f64> = vec![100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0];
    v.reverse();
    println!("{:.0}", num);
    ballots_counter(num, v)
}
