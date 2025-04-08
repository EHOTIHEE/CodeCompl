package main

import (
	"fmt"
	"strings"
)

// Function to add two numbers
func add(a int, b int) int {
	return a + b
}

// Function to check if a string is a palindrome
func isPalindrome(s string) bool {
	s = strings.ToLower(s)
	s = strings.ReplaceAll(s, " ", "")
	runes := []rune(s)
	for i := 0; i < len(runes)/2; i++ {
		if runes[i] != runes[len(runes)-1-i] {
			return false
		}
	}
	return true
}

// Recursive function to calculate factorial
func factorial(n int) int {
}

func main() {
	fmt.Println("Sum of 3 + 5 =", add(3, 5))
	fmt.Println("Factorial of 5 =", factorial(5))
	fmt.Println("Is 'Kazak' a palindrome?", isPalindrome("Kazak"))
}
