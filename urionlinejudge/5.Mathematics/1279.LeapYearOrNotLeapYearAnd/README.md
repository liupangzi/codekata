### 1279.Leap Year or Not Leap Year and …

The ancient race of Gulamatu is very advanced in their year calculation scheme. They understand what leap year is (A year that is divisible by 4 and not divisible by 100 with the exception that years that are divisible by 400 are also leap year.) and they have also similar festival years. One is the Huluculu festival (happens on years divisible by 15) and the Bulukulu festival (Happens on years divisible by 55 provided that is also a leap year). Given an year you will have to state what properties these years have. If the year is not leap year nor festival year, then print the line 'This is an ordinary year.' The order of printing (if present) the properties is leap year-->huluculu-->bulukulu.

**Input**

Input will contain several years as input. Each year will be in separate lines. Input is terminated by end of file. All the years will not be less than 2000 (to avoid the earlier different rules for leap years) but can have more than 1000 digits.

**Output**

For each input, output the different properties of the years in different lines according to previous description and sample output. A blank line should separate the output for each line of input. Note that there are four different properties.

| Input Sample | Output Sample |
| ------------ | ------------- |
| 2000 | This is leap year.<br><br> |
| 3600 | This is leap year.<br>This is huluculu festival year.<br><br> |
| 4515 | This is huluculu festival year.<br><br> |
| 2001 | This is an ordinary year.<br> |
