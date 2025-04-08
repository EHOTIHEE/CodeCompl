#include <iostream>
#include <string>
#include <algorithm>

// Function to add two integers
int add(int a, int b) {
    return a + b;
}

// Function to check if a string is a palindrome
bool isPalindrome(std::string s) {
    std::transform(s.begin(), s.end(), s.begin(), ::tolower);
    s.erase(remove(s.begin(), s.end(), ' '), s.end());

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s[left] != s[right]) {
            return false;
        }
        ++left;
        --right;
    }
    return true;
}

// Recursive function to calculate factorial
int factorial(int n) {
}

int main() {
    std::cout << "Sum of 3 + 5 = " << add(3, 5) << std::endl;
    std::cout << "Factorial of 5 = " << factorial(5) << std::endl;
    std::cout << "Is 'Kazak' a palindrome? " << (isPalindrome("Kazak") ? "Yes" : "No") << std::endl;

    return 0;
}
