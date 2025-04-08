using System;

class Program
{
    // Function to add two integers
    static int Add(int a, int b)
    {
        return a + b;
    }

    // Function to check if a string is a palindrome
    static bool IsPalindrome(string s)
    {
        s = s.ToLower().Replace(" ", "");
        for (int i = 0; i < s.Length / 2; i++)
        {
            if (s[i] != s[s.Length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }

    // Recursive function to calculate factorial
    static int Factorial(int n)
    {
    }

    static void Main(string[] args)
    {
        Console.WriteLine("Sum of 3 + 5 = " + Add(3, 5));
        Console.WriteLine("Factorial of 5 = " + Factorial(5));
        Console.WriteLine("Is 'Kazak' a palindrome? " + IsPalindrome("Kazak"));
    }
}
