### 1898.Kickback Sum

The brazilian agency for criminal investigations called OBI (Operation of Big Investigation) noted that, as the has occurred in Petrobras, a lot of money was diverted from public state coffers to pay bribes to politicians in recent years, especially by the political party QU (United Quadrille).

The investigation is still in course and the agency has recruited you to convert some values that are with strange characters after it were decrypted the original files. Your task in this case is Relatively simple: just remove all strange characters (non-numeric) of each of the two available numbers and sum these values. Just note that the first 11 valid digits of the first number corresponding to the corrupt ID :)

**Input**

The input contains two rows, each one containing between 1 and 60 characteres ('0'-'9' and others non numeric characteres or, at least, 1 character '0'-'9') and at maximun, one decimal point ".". Desconsidering the non-numeric digits, the final number can have up to 17 characters, at maximum (including decimal point). Any number after the second digit after the decimal point must be discarded.

**Output**

Print the cpf of the corrupt as shown below and the sum of the two numbers that were diverted from public funds, always with two decimal places.

| Input Sample | Output Sample |
| ------------ | ------------- |
| `7a5a6adfg4a4adsfgsd9fg6aa904aa91#$%11.23`<br>`42**&774667` | cpf 75644969049<br>42774778.23 |
| `11#$%11111*&¨1111&*(1198-=&8789."34"8`<br>`%(&567.22%99` | cpf 11111111111<br>11989356.56 |
