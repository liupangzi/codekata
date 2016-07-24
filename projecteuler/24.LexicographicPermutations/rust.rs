fn main() {
    let factors = vec![2, 6, 6, 2, 5, 1, 2, 1, 1];
    let mut orders = vec![0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    
    for i in 0..factors.len() {
        print!("{}", orders[factors[i] as usize]);
        orders.remove(factors[i]);
    }
    
    println!("{}", orders[0]);
}
