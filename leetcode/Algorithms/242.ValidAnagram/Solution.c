bool isAnagram(char* s, char* t) {
    int cache[26] = {0};
    for (; *s!='\0'; s++) cache[*s - 'a']++;
    for (; *t!='\0'; t++) cache[*t - 'a']--;
    for (int i = 0; i < 26; i++) {
        if (cache[i] != 0) return false;
    }
    return true;
}
