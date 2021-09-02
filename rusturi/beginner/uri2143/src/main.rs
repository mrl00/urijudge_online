fn g(n: u32) -> u32{
    if n % 2 == 0 {
        return (n - 2)*2 + 2;
    } 
    return 2*n-1;
}

fn main() {
    let mut n = String::new();


    println!("g(10) = {}", g(10));
}
