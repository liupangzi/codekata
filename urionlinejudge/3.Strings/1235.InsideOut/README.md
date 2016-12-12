### 1235.Inside Out

Your printer has been infected by a virus and is printing gibberish. After staring at several printed pages for a while, you realize that it is printing every line inside-out. In other words, the left half of each line is being printed starting in the middle of the page and proceeding out toward the left margin. Similarly, the right half of each line is being printed starting at the right margin and proceeding in toward the middle of the page.

For example, the line:

```
THIS LINE IS GIBBERISH
```

is being printed as:

```
I ENIL SIHTHSIREBBIG S
```

In the same way, the line " MANGOS " is being printed as "NAM  SOG".Your task is to unscramble a String line from its printed form back into its original order. You can assume that line contains an even number of characters.

**Input**

The input contains many test cases. The first line of input contains an integer N that indicates the number of test cases. Follow N lines, each one with a string with the maximum of 100 uppercase letters ('A'-'Z') and spaces (' '). that must be unscrambled from its printed form back into its original order, like example above.

**Output**

Each line of input must produce a line of output, with the decoded message, like example above.


| Input Sample | Output Sample |
| ------------ | ------------- |
| 5 |   |
| I ENIL SIHTHSIREBBIG S | THIS LINE IS GIBBERISH |
| LEVELKAYAK | LEVELKAYAK |
| H YPPAHSYADILO | HAPPY HOLIDAYS |
| ABCDEFGHIJKLMNOPQRSTUVWXYZ | MLKJIHGFEDCBAZYXWVUTSRQPON |
| VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE | FRENCH HENS TWO DOVES AND A PARTRIDGE |

