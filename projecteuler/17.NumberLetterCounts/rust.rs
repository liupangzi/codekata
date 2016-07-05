fn main() {
    // zero, one, two, three, four, five, six, seven, eight, nine, ten
    // eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen
    let ones = vec![0, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8];
    // ten, twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety
    let tens = vec![0, 3, 6, 6, 5, 5, 5, 7, 6, 6];

    let hundred = String::from("hundred");
    let hundredand = String::from("hundredand");
    let onethousand = String::from("onethousand");

    let mut result = 0;
    for count in 1..1000 {
        if count % 100 == 0 {
            result = result + ones[count / 100];
            result = result + hundred.len();
            continue;
        }

        if count % 100 < 20 {
            result = result + ones[count % 100];
        } else if count % 10 == 0 {
            result = result + tens[(count % 100) / 10];
        } else {
            result = result + ones[count % 10];
            result = result + tens[(count % 100) / 10];
        }
        
        if count / 100 > 0 {
            result = result + ones[count / 100] + hundredand.len();
        }
    }

    println!("{}", result + onethousand.len());
}
