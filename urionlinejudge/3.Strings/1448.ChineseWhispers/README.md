### 1448.Chinese Whispers

Every kid certainly played Chinese Whispers at least once with other kids. It is a game in which one person whispers a message to another, which is passed through a line of people until the last player announces the message to the entire group. Little John invented a variation of this game.

In this game, there are two teams and a judge. In each team, the kids play as in the original game: each kid whispers the message to another, and the last kid announces the message he/she heard. The initial message is told to the first kid of each team by the judge. This message is the same for both teams. Also, this message contains n characters (letters, spaces, punctuation, etc. included). The length of the message is known by all the kids, thus the messages announced by the last kids of each team also have n characters.

The team that announces the most similar message to the original one, wins. The "similarity" of a message is equal to the number of positions in which the character in the original message and the one in the announced message is the same. If this number is equal for both teams, find the first position for which one team announced the correct character, and the other didn't. If there's still a tie, the game result is a draw.

For example, if the initial message was "O rato roeu a roupa do rei.", the first team announced "O ator morreu, garoupa rei.", and the second team announced "O pato moeu garoupa dorlei.", the second teams wins, because there are 21 positions in which the character is the same for the second team, and only 9 positions for the first one.

![Chinese Whispers][1]

Like the ICPC judges, the judges of this game are lazy, too. They asked you to write a program that decides the winning team.

**Input**

The first line of the input contains an integer **t**, 1 ≤ **t** ≤ 1000, the number of instances that your program must process.

Each instance is described by 3 lines. The first line contains the initial message. The second line contains the message announced by the first team, and the third line contains the message announced by the second team. All the messages will have at most 100 characters, and the 3 messages will have the same length.

**Output**

For each instance, print "<i>Instancia <b>k</b></i>", where **k** is the instance number. In the following line, print "<i>time <b>W</b></i>" (Portuguese for "team **W**"), where **W** = 1 if the first team wins, or **W** = 2 if the second team wins. If the game result is a draw, print "*empate*" (Portuguese for "draw") instead. Print a blank line after each test case.

| Input Sample | Output Sample |
| ------------ | ------------- |
| 2 |  |
| O RATO ROEU A ROUPA DO REI.<br>O ATOR MORREU, GAROUPA REI.<br>O PATO MOEU GAROUPA DORLEI. | Instancia 1<br>time 2 |
| IH EMPATOU!<br>IH EMPATOU!<br>IH EMPATOU! | Instancia 2<br>empate |


  [1]: https://urionlinejudge.r.worldssl.net/gallery/images/novos/Telefone%20sem%20fio.png
