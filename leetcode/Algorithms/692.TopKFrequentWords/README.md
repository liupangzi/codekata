Given a non-empty list of words, return the *k* most frequent elements.

Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

**Example 1:**
<pre>
<b>Input:</b> ["i", "love", "leetcode", "i", "love", "coding"], k = 2
<b>Output:</b> ["i", "love"]
<b>Explanation:</b> "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical 
order.
</pre>

**Example 2:**
<pre>
<b>Input:</b> ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
<b>Output:</b> ["the", "is", "sunny", "day"]
<b>Explanation:</b> "the", "is", "sunny" and "day" are the four most frequent words,
    with the number of occurrence being 4, 3, 2 and 1 respectively.
</pre>

**Note:**

 1. You may assume *k* is always valid, 1 ≤ *k* ≤ number of unique elements.
 2. Input words contain only lowercase letters.

**Follow up:**

 1. Try to solve it in O(*n* log *k*) time and O(*n*) extra space.

### [Editorial](https://leetcode.com/articles/top-k-frequent-words/)
