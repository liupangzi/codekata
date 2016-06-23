fn main() {
    let (mut a, mut b) = (1, 2);
    let (mut i, mut result) = (0, 2);

    loop {
        for x in 0..3 {
            i = a + b;
            a = b;
            b = i;
        }

        if i <= 4000000 {
            result += i;
        } else {
            break;
        }
    }

    println!("{}", result);
}
