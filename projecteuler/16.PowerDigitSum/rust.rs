fn main() {
    let mut result = vec![0; 305];
    result[0] = 1;

    let mut count = 0;
    while count < 1000 {
        let mut carry = 0;
        for i in 0..305 {
            let origin = result[i] * 2 + carry;
            result[i] = origin % 10;
            carry = origin / 10;
        }
        count = count + 1;
    }

    let mut sum = 0;
    for j in 0..305 {
        sum = sum + result[j];
    }

    println!("{}", sum);
}
