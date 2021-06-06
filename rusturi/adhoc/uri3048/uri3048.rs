use std::io;

fn main() {
    let mut ns = String::new();
    io::stdin().read_line(&mut ns);
    let n: u32 = ns.trim().parse().unwrap();
    let mut z: Vec<u32> = vec![];
    
    for _i in 0..n {
      let mut ks = String::new();
      io::stdin().read_line(&mut ks);
      let k:u32 = ks.trim().parse().unwrap();
      z.push(k);
    }
    
    // let mut v: Vec<u32> = [1u32, 1, 1, 1, 1, 1, 2,2, 3, 2, 3, 2, 1, 1, 1, 3, 4].to_vec();
    // v.dedup();
    z.dedup();
    println!("{}", z.len());
}
