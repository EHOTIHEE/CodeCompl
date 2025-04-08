#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Function to add two integers
int add(int a, int b) {
    return a + b;
}

// Function to check if a string is a palindrome
int isPalindrome(const char *s) {
    int len = strlen(s);
    char cleaned[100];
    int idx = 0;

    // Convert to lowercase and remove spaces
    for (int i = 0; i < len; i++) {
        if (s[i] != ' ') {
            cleaned[idx++] = tolower(s[i]);
        }
    }
    cleaned[idx] = '\0';

    // Check palindrome
    int left = 0;
    int right = idx - 1;
    while (left < right) {
        if (cleaned[left] != cleaned[right]) {
            return 0;
        }
        left++;
        right--;
    }
    return 1;
}

// Recursive function to calculate factorial
int factorial(int n) {
}

int main() {
    printf("Sum of 3 + 5 = %d\n", add(3, 5));
    printf("Factorial of 5 = %d\n", factorial(5));
    printf("Is 'Kazak' a palindrome? %s\n", isPalindrome("Kazak") ? "Yes" : "No");

    return 0;
}
