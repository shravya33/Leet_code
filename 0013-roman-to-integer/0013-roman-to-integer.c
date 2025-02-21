int romanToInt(char* s) {
    int roman[256] = {0}; 
    roman['I'] = 1;
    roman['V'] = 5;
    roman['X'] = 10;
    roman['L'] = 50;
    roman['C'] = 100;
    roman['D'] = 500;
    roman['M'] = 1000;

    int total = 0;
    int length = strlen(s);

    for (int i = 0; i < length; i++) {
        // If the current numeral is less than the next numeral, subtract it
        if (i < length - 1 && roman[s[i]] < roman[s[i + 1]]) {
            total -= roman[s[i]];
        } else {
            total += roman[s[i]];
        }
    }

    return total;
}
