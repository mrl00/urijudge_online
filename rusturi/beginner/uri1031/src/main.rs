use std::io::stdin;

fn g(n: usize, k: usize) -> usize {
    if n == 1 { 1 }
    else {
        ((g(n - 1, k) + k - 1) % n ) + 1
    }
}

fn get_input() -> usize {
    let mut input = String::new();
    stdin().read_line(&mut input).expect("failed to read input");
    input.trim().parse::<usize>().expect("failed to parse")
}

fn main() {
    let i = 1;
    loop {
        let n = get_input();
        if n == 0 { break; }
        if g(n, i) == 13 {
            println!("{}", i);
            break;
        }
    }
}
