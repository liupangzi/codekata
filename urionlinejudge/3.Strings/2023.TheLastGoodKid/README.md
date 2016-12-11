### 2023.The Last Good Kid

Santa Claus classifies all the children of the world into two lists: the good ones and the naughty ones. He would like to know which of the children is the last in the good ones list, when sorting them in alphabetical order. To do that he asked his Cristhmas Elfs to write down all the good kids' names in a sheet of paper.

However, each elf wrote the names in a different way: first letter uppercase and then lowercase; all letters uppercase; all lowercase; and all kind of combinations between upper and lowercase letters.

Santa wants your help to tell which is the last name in the list given all the names of the good kids.

**Input**

The input has several lines. Each line has the name of one good kid. No elf wrote names with accented letters. The longest name is at most 80 characters long. There are no more than 1000 kids on the list. All the names are different. The names list ends with EOF.

**Output**

The output is given in one line. It consists of the name of the kid that should be at the last position of the good ones list. You must print the name exactly as it was read at the input. Use alphabetical order to sort the names, but do not differ letters because of its case.

| Input Sample | Output Sample |
| ------------ | ------------- |
| ana<br>Julio<br>gABRIEL<br>VANESSA<br>cArLoS | VANESSA |
| abraao<br>aRi<br>abelardo<br>amanda | aRi |
| Joaquim Jose da Silva Xavier<br>Pedro de Alcantara Joao Carlos Leopoldo <br>Salvador Bibiano Francisco Xavier Miguel<br>Pedro de Alcantara Francisco Antonio Joao <br>Carlos Xavier de Paula Miguel Cipriano<br>Pedro Raymundo | Pedro Raymundo |
