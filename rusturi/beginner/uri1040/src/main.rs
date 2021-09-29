use std::io::stdin;

fn get_input1() -> (f64, f64, f64, f64) {
    let mut line = String::new();
    stdin().read_line(&mut line).expect("failed to read input");
    let x: Vec<f64> = line
        .split_whitespace()
        .map(|s| s.parse::<f64>().unwrap())
        .collect();
    (x[0], x[1], x[2], x[3])
}

fn get_input2() -> f64 {
    let mut line = String::new();
    stdin().read_line(&mut line).expect("failed to read input");
    let line: f64 = line.trim().parse().expect("failed to parse");
    line
}

fn media_aluno(a: f64, b: f64, c: f64, d: f64) -> f64 {
    (a * 2.0 + b * 3.0 + c * 4.0 + d) / 10.0
}

fn aprovado1(media: f64) -> usize {
    if media >= 7.0 {
        1
    } else if media < 5.0 {
        2
    } else {
        3
    }
}

fn aprovado2(media: f64) -> bool {
    if media >= 5.0 {
        true
    } else {
        false
    }
}

fn main() {
    let (a, b, c, d) = get_input1();
    let media: f64 = media_aluno(a, b, c, d);

    let aprovado = aprovado1(media);

    println!("Media: {:.1}", media);
    match aprovado {
        1 => println!("Aluno aprovado."),
        2 => println!("Aluno reprovado."),
        3 => {
            println!("Aluno em exame.");
            let nota_rec = get_input2();
            println!("Nota do exame: {:.1}", nota_rec);
            let media_final = (nota_rec + media) / 2.0;
            if aprovado2(media_final) {
                println!("Aluno aprovado.");
            } else {
                println!("Aluno reprovado.");
            }
            println!("Media final: {:.1}", media_final);
        }
        _ => print!(""),
    }
}
