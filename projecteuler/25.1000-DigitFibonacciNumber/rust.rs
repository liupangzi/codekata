fn main() {
    let mut fa = vec![0; 999];
    fa[0] = 1;
    let mut fb = vec![0; 999];
    fb[0] = 1;

    let mut result = 3;
    loop {
        let mut tmp_array = vec![0; 999];

        let mut carry = 0;
        for i in 0..999 {
            let sum = fa[i] + fb[i] + carry;
            carry = sum / 10;
            tmp_array[i] = sum % 10;
        }

        //print!("F{}: ", result);
        //println!("{:?}", tmp_array);

        if carry > 0 {
            break;
        }

        fa = fb;
        fb = tmp_array;

        result += 1;
    }

    println!("{}", result);
}
