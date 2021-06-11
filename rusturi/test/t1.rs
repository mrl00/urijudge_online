#[derive(PartialEq, Debug)]
struct Shoe {
    size: u32,
    style: String,
}

fn shoes_in_my_size(shoes: Vec<Shoe>) ->Vec<Shoe> {
  shoes.into_iter().filter(|s| s.size == shoe_size).collect()
}