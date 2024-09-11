#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main()
{
    char s[100], q[100];
    printf("Enter the first string: ");
    scanf(" %[^\n]", s);
    getchar();
    printf("Enter the second string: ");
    scanf(" %[^\n]", q);
    
    if (strlen(s) != strlen(q)) {
        printf("No, it is not an anagram\n");
        return 0;
    }
    
    int hash[128] = {0};
    
    for (int i = 0; s[i] != '\0'; i++) {
        if (s[i] != ' ')
            hash[s[i]]++;
    }
    
    for (int i = 0; q[i] != '\0'; i++) {
        if (q[i] != ' ')
            hash[q[i]]--;
    }
    
    for (int i = 0; i < 128; i++) {
        if (hash[i] != 0) {
            printf("No, it is not an anagram\n");
            return 0;
        }
    }
    
    printf("Yes, it is an anagram\n");
    return 0;
}

