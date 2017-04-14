You are given a string representing an attendance record for a student. The record only contains the following three characters:

 1. **'A'** : Absent.
 2. **'L'** : Late.
 3. **'P'** : Present.

A student could be rewarded if his attendance record doesn't contain **more than one 'A' (absent)** or **more than two continuous 'L' (late)**.

You need to return whether the student could be rewarded according to his attendance record.

**Example 1:**

<pre>
<b>Input:</b> "PPALLP"
<b>Output:</b> True
</pre>

**Example 2:**

<pre>
<b>Input:</b> "PPALLL"
<b>Output:</b> False
</pre>
