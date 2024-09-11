#include <stdio.h>
#include <ctype.h>

int main()
{
    char s[100];
    printf("Enter the string: ");
    scanf(" %[^\n]", s);    
    
    if (s[0] >= 'a' && s[0] <= 'z')
    {
        s[0] = (char)(s[0] - 32);
    }
    
    for (int i = 0; s[i] != '\0'; i++)
    {
        if (s[i] == ' ')
        {
            if (s[i+1] >= 'a' && s[i+1] <= 'z')
            {
                s[i+1] = (char)(s[i+1] - 32);
            }
        }
    }
    
    printf("Modified string: %s\n", s);
    return 0;
}
