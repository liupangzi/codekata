fn get_amicable_number(number: i32) -> i32 {
    let mut result = 1;
    let boundary = (number as f64).sqrt() as i32 + 1;

    for i in 2..boundary {
        if number % i == 0 {
            result = result + i + number / i;
        }
    }

    return result;
}

fn main() {
    let mut tmp = vec![0; 10000];
    let mut result = 0;

    for i in 3..10000 {
        if tmp[i] == 0 { tmp[i] = get_amicable_number(i as i32); }
        if tmp[i] == i as i32 || tmp[i] > 9999 { continue; }
        let tmp_i = tmp[i] as usize;
        if tmp[tmp_i] == 0 { tmp[tmp_i] = get_amicable_number(tmp[i]); }
        if tmp[tmp_i] == i as i32 { result = result + i as i32 + tmp[tmp_i]; }
    }

    println!("{}", result / 2);
}
