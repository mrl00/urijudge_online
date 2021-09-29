use std::io;

fn main() {
  let vec: (Vec<u32>, u32) = get_input();
  let mut v:Vec<u32> = vec.0;
  
  v.into_iter().filter(|x| *x * vec.1 >= 40000000);
  
  println!("{:?}",v.len());
}

#[warn(dead_code)]
fn get_input() -> (&Vec<u32>, u32) {
  let mut ats = String::new();
  let mut ns  = String::new();

  io::stdin().read_line(&mut ats);
  io::stdin().read_line(&mut ns);

  let at: u32 = ats.trim().parse().unwrap();
  let n: usize = ns.trim().parse().unwrap();

  let mut vec: Vec<u32> = vec![0; n];
  
  for _i in 0..n {
    let mut xs = String::new();
    io::stdin().read_line(&mut xs);
    let x: u32 = xs.trim().parse().unwrap();
    vec.push(x);
  }

  (&vec, at)
}