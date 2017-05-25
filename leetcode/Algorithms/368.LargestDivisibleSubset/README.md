Given a set of **distinct** positive integers, find the largest subset such that every pair (S<sub>i</sub>, S<sub>j</sub>) of elements in this subset satisfies: S<sub>i</sub> % S<sub>j</sub> = 0 or S<sub>j</sub> % S<sub>i</sub> = 0.

If there are multiple solutions, return any subset is fine.

**Example 1:**
```
nums: [1,2,3]

Result: [1,2] (of course, [1,3] will also be ok)
```

**Example 2:**
```
nums: [1,2,4,8]

Result: [1,2,4,8]
```
