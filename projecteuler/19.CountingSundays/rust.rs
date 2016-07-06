fn is_leap(year: i32) -> i32 {
    return if year % 4 == 0 && year % 400 != 0 {
        1
    } else {
        0
    }
}

fn main() {
    let year_days = vec![
        vec![31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31],
        vec![31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31],
    ];
    let mut weekday = 2;
    let mut result = 0;

    for year in 1901..2001 {
        let is_leap_year = is_leap(year) as usize;
        for month in 0..12 {
            if weekday % 7 == 0 { result = result + 1; }
            weekday = weekday + year_days[is_leap_year][month];
        }
    }

    println!("{}", result);
}
