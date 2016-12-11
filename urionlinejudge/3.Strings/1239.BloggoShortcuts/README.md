### 1239.Bloggo Shortcuts

You are helping to develop a weblog-management system called bloggo. Although bloggo pushes all content to the front end of a website in HTML, not all content authors enjoy using HTML tags in their text. To make their lives easier, bloggo offers a simple syntax called *shortcuts* to achieve some HTML textual effects. Your job is to take a document written with shortcuts and translate it into proper HTML.

One shortcut is used to make italicized text. HTML does this with the `<i>` and `</i>` tags, but in bloggo, an author can simply enclose a piece of text using two instances of the underscore character, `'_'`. Thus, where a content author writes

```
  You _should_ see the baby elephant at the zoo!
```

bloggo will publish the following instead.

```
  You <i>should</i> see the baby elephant at the zoo!
```

Another shortcut serves to render text in boldface, which HTML accomplishes with `<b>` and `</b>` tags. Bloggo lets content authors do the same with paired instances of the asterisk character, `'*'`. When a content author writes the text

```
  Move it from *Receiving* to *Accounts Payable*.
```

it will end up on the website as

```
  Move it from <b>Receiving</b> to <b>Accounts Payable</b>.
```

**Input**

The input contains several test cases. Each test case is composed by one line that contais a string **text**, containing zero or more usages of the italic and boldface shortcuts. Each **text** is between 1 and 50 characters long, inclusive. The only characters allowed in **text** are the alphabetic characters 'a' to 'z' and 'A' to 'Z', the underscore `'_'`, the asterisk `'*'`, the space character, and the punctuation symbols `','`, `';'`, `'.'`, `'!'`, `'?'`, `'-'`, `'('`, and `')'`. The underscore `'_'` occurs in **text** an even number of times. The asterisk `'*'` occurs in **text** an even number of times. No substring of **text** enclosed by a balanced pair of underscores or by a balanced pair of asterisks may contain any further underscores or asterisks. 

The end of input is determined by EOF.

**Output**

Translate each input **text** into HTML as demonstrated by the examples above (and below). To render a span of text in italics in HTML, you must start with the `<i>` tag and end with the `</i>` tag. For boldface text, start with `<b>` and end with `</b>`. Print one translated text per line at standard output.

| Input Sample | Output Sample |
| ------------ | ------------- |
|`You _should_ see the new walrus at the zoo!`|`You <i>should</i> see the new walrus at the zoo!`|
|`Move it from *Accounts Payable* to *Receiving*.`|`Move it from <b>Accounts Payable</b> to <b>Receiving</b>.`|
|`I saw _Chelydra serpentina_ in *Centennial Park*.`|`I saw <i>Chelydra serpentina</i> in <b>Centennial Park</b>.`|
|`_ _ __  _ yabba dabba _   *  dooooo  * ****`|`<i> </i> <i></i> <i> yabba dabba </i> <b> dooooo </b> <b></b><b></b>`|
|`_now_I_know_*my*_ABC_next_time_*sing*it_with_me`|`<i>now</i>I<i>know</i><b>my</b><i>ABC</i>next<i>time</i><b>sing</b>it<i>with</i>me`|

