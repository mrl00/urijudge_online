use std::{cmp::Ordering, io::stdin, ops::{self, Div, Neg, Rem, Sub}};

#[derive(Debug, Clone, PartialEq, Eq, PartialOrd, Ord)]
struct Time {
    hour: i64,
    minute: i64
}

impl Time {
    fn new(hour: i64, minute: i64) -> Time {
        Time { hour, minute }
    }
}

impl ops::Neg for Time {
    type Output = Time;
    fn neg(self) -> <Self as Neg>::Output { 
        Time {
            hour: 24.sub(self.hour).sub(if self.minute != 0 { 1 } else { 0 }),
            minute: 60.sub(self.minute)
        }
    }
}

impl ops::Add for Time {
    type Output = Time;
    fn add(self, other: Time) -> Self::Output { 
        Time {
            hour: self.hour.add(other.hour).rem(24).add(self.minute.add(other.minute).div(60)),
            minute: self.minute.add(other.minute).rem(60)
        }
    }
}

impl ops::Sub for Time {
    type Output = Time;
    fn sub(self, rhs: Time) -> Self::Output {
        match self.partial_cmp(&rhs) {
            Some(Ordering::Less) => -(self + -rhs),
            Some(Ordering::Greater) => -self + rhs,
            _ => Time::new(24, 0),
        }
    }
}

fn input() -> (Time, Time) {
    let mut s = String::new(); stdin().read_line(&mut s).expect("failed to read input");
    let s: Vec<i64> = s.split_whitespace().map(|x| x.parse::<i64>().unwrap()).collect();
    (Time{hour: s[0], minute: s[1]}, Time{ hour: s[2], minute: s[3] })
}



fn main() {
    let (t1, t2): (Time, Time) = input();
    let t3: Time = t1 - t2;
    println!("O JOGO DUROU {} HORA(S) E {} MINUTO(S)", t3.hour, t3.minute);
}








