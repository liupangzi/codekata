extern crate num;

use num::bigint::BigInt;
use num::bigint::ToBigInt;
use num::traits::One;

fn binom(n: u64, k: u64) -> BigInt {
    let mut res = BigInt::one();
    for i in 0..k {
        res = (res * (n - i).to_bigint().unwrap()) /
              (i + 1).to_bigint().unwrap();
    }
    res
}

fn main() {
    println!("{}", binom(40, 20));
}
