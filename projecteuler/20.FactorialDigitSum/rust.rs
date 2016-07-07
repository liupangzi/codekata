fn main() {
    let len = 160;
    let mut result = vec![0; len];
    result[0] = 8;
    result[1] = 8;
    result[2] = 2;
    result[3] = 6;
    result[4] = 3;

    for count in 11..100 {
        let a = count % 10;
        let b = count / 10;

        let mut result_1 = vec![0; len];
        let mut carry_1 = 0;
        for i in 0..len {
            let origin_1 = result[i] * a + carry_1;
            result_1[i] = origin_1 % 10;
            carry_1 = origin_1 / 10;
        }

        let mut result_2 = vec![0; len];
        let mut carry_2 = 0;
        for j in 1..len {
            let origin_2 = result[j - 1] * b + carry_2;
            result_2[j] = origin_2 % 10;
            carry_2 = origin_2 / 10;
        }

        let mut carry_3 = 0;
        for k in 0..len {
            let origin = result_1[k] + result_2[k] + carry_3;
            result[k] = origin % 10;
            carry_3 = origin / 10;
        }
    }

    let mut sum = 0;
    for x in 0..len{
        sum = sum + result[x];
    }

    println!("{}", sum);
}
