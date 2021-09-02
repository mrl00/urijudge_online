use std::io::stdin;

fn ballots_counter(x: f64, mut v: Vec<f64>) {
    if v.is_empty() {
        return;
    }

    let vv: f64 = v.pop().unwrap();
    let val = (x / vv) as i32;
    
    if v.len() <= 5 {
        if v.len() == 5 {
            println!("MOEDAS:");
        }
        println!("{:.0} {}(s) de R$ {:.2}", val, "moeda", vv);
    } else {
        if v.len() == 11 {
            println!("NOTAS:");
        }
        println!("{:.0} {}(s) de R$ {:.2}", val, "nota", vv);
    }

    ballots_counter(x % vv, v)
}

fn main() {
    let mut num = String::new();
    stdin().read_line(&mut num).expect("failed to read input");

    let num: f64 = num.trim().parse().expect("failed to parse");
     
    let all: Vec<f64> = 
        vec![0.01, 0.05, 0.1, 0.25, 0.5, 1.0, 2.0, 5.0, 10.0, 20.0, 50.0, 100.0];
     
    ballots_counter(num, all);
}
