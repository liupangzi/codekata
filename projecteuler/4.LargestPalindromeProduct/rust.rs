fn is_palindrome_number(number: i32) -> bool {
    let mut origin = number;
    let mut tmp = 0;
    
    loop {
        tmp = tmp * 10 + origin % 10;
        origin /= 10;
        if origin == 0 { break; }
    }

    number == tmp
}

fn main() {
    let (mut result, mut i) = (0, 999);

    while i > 100 {
        if result / i > 999 { break; }
        let mut j = 999;
        while j > i {
            if i * j <= result { break; }
            if is_palindrome_number(i * j) {
                result = i * j;
            }
            j -= 1;
        }
        i -= 1; 
    }

    println!("{}", result);
}
