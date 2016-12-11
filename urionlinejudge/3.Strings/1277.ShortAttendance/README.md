### 1277.Short Attendance

The students at your university have lately picked up the annoying habit of missing classes. To fix this problem your board has decided to only allow students with 75% or higher attendance to sit for the exams.

From a list of students' names and their respective attendance records, print out the list of students who did not attend to enough classes and will be denied to sit for exams.

**Input**

The input contains several test cases. The first input line will contain an integer **T** indicating the number of test cases that follow.

Each test case is composed of three input lines:

 - The first line of a test case will contain an integer **N** (0 ≤ **N** ≤ 100) indicating the number of students in the class.
 - The second line will contain **N** student names with up to 50 chars each, separated by a single space character. All names will contain only uppercase or lowercase letters (‘A’-‘Z’,‘a’-‘z’).
 - The third line will contain **N** attendance records, corresponding to their respective students from the previous line. The attendance records will be separated by a single space character, and contain only ‘A’, ‘P’ and ‘M’ characters. A ‘P’ indicates that the student was present in a class, ‘A’ shows that he was absent (he did not attend) and ‘M’ shows that he was absent for a class but submitted a doctor's note then that class is not counted when calculating his attendance percentage. An attendance record will contain at least one ‘A’ or ‘P’ character.

**Output**

For each test case print out the names of all the students who do not meet the attendance requirements, separated by a single space character. Do not leave trailing spaces in the end of each line.

| Input Sample | Output Sample |
| ------------ | ------------- |
|      4       |               |
| 1<br>Justin<br>PAAPP | Justin |
| 2<br>Justin Chris<br>PAAPP PPPPA | Justin |
| 1<br>Sunny<br>PPPAM |  |
| 4<br>Mansi Arjun Nikhil Taneja<br>PPPPMPPAPP AAMAAPP PPPPAAP PPPAAAMPP | Arjun Nikhil Taneja |
