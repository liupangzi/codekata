fn main() {
    let mut collatz = vec![true; 1000000];

    let mut count = 0;
    let mut result = 0;

    let mut i = 999999;
    while i >= 1 {
        if collatz[i] == false {
            i = i - 1;
            continue;
        }

        let mut tmp = 0;
        let mut j = i;
        while j != 1 {
            j = if j % 2 == 0 {
                j / 2
            } else {
                j * 3 + 1
            };
            tmp = tmp + 1;
            if j < 1000000 { collatz[j] = false; }
        }

        if tmp > count {
            count = tmp;
            result = i;
        }

        i = i - 1;
    }

    println!("{}", result);
}
