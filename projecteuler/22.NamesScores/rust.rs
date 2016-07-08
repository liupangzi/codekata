use std::error::Error;
use std::fs::File;
use std::io::prelude::*;
use std::path::Path;
use std::collections::HashMap;

fn main() {
    let mut table = HashMap::new();
    table.insert('"', 0);
    table.insert('A', 1);
    table.insert('B', 2);
    table.insert('C', 3);
    table.insert('D', 4);
    table.insert('E', 5);
    table.insert('F', 6);
    table.insert('G', 7);
    table.insert('H', 8);
    table.insert('I', 9);
    table.insert('J', 10);
    table.insert('K', 11);
    table.insert('L', 12);
    table.insert('M', 13);
    table.insert('N', 14);
    table.insert('O', 15);
    table.insert('P', 16);
    table.insert('Q', 17);
    table.insert('R', 18);
    table.insert('S', 19);
    table.insert('T', 20);
    table.insert('U', 21);
    table.insert('V', 22);
    table.insert('W', 23);
    table.insert('X', 24);
    table.insert('Y', 25);
    table.insert('Z', 26);

    let path = Path::new("p022_names.txt");
    let display = path.display();

    let mut file = match File::open(&path) {
        Err(why) => panic!("couldn't open {}: {}", display, why.description()),
        Ok(file) => file,
    };

    let mut origin_string = String::new();
    match file.read_to_string(&mut origin_string) {
        Err(why) => panic!("couldn't read {}: {}", display, why.description()),
        Ok(_) => println!("Reading file... OK"),
    }

    let str = origin_string.replace("\n", "");
    let mut words: Vec<&str> = str.split(',').collect();
    words.sort();

    let mut result = 0;
    let mut i = 1;
    for word in words {
        let chars: Vec<char> = word.chars().collect();
        let mut tmp = 0;
        for c in chars {
            tmp += table[&c];
        }
        result += (i + 1) * tmp;
        i = i + 1;
    }

    println!("{}", result);
}
