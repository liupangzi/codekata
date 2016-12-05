### 2253.Passwords Validator

Rolien and Naej are the developers of a big programming portal. To help the new site registration system, they requested your help. Your job is write a code that validates passwords that are registered on the portal, for that you should be aware for the following requirements:

 - The password must contain at least one uppercase letter, one lowercase letter and a number;
 - It can’t have any punctuation character, accent or space;
 - Moreover, the password must be 6 to 32 characters.

**Input**

The input contains several test cases and ends with EOF. Each line has a string **S**, corresponding to the password that is entered by the user at registration.

**Output**

The output contains a line, which can be "Senha valida.", if the password has all previously requested requirements, or "Senha invalida.", if one or more requirements aren’t met.

| Input Sample | Output Sample |
| ------------ | ------------- |
| URI Online Judge | Senha invalida. |
| AbcdEfgh99 | Senha valida. |
| URIOnlineJudge12 | Senha valida. |
| URI Online Judge 12 | Senha invalida. |
| Aass9 | Senha invalida. |
| Aassd9 | Senha valida.  |
| <br>  | <br> |
