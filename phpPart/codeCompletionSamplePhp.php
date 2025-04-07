<?php

class SampleClass
{
    // 10th case
    // Method with a for loop that prints numbers 1 to 5
    public function printNumbers()
    {
    }

    // Method with a for loop that calculates the sum of first 10 numbers
    public function sumFirstTenNumbers()
    {
        $sum = 0;
        for ($i = 1; $i <= 10; $i++) {
            $sum += $i;
        }
        echo "Sum: $sum\n";
    }

    // Method with if condition to check if a number is even
    public function checkEven($number)
    {
        if ($number % 2 === 0) {
            echo "$number is even.\n";
        } else {
            echo "$number is odd.\n";
        }
    }

    // 8th case
    // Method with if condition to check if a string is empty
    public function checkEmptyString($string)
    {
    }

    // 9th case
    // Method with while loop that prints numbers from 1 to 5
    public function printWithWhile()
    {
        $i = 1;
    }

    // Method with while loop that counts down from 5 to 1
    public function countdown()
    {
        $i = 5;
        while ($i > 0) {
            echo "Countdown: $i\n";
            $i--;
        }
    }

    // 3rd case 
    // Method with input parameters to greet a user($name)


    // Method with input parameters to add two numbers
    public function addNumbers($a, $b)
    {
        $sum = $a + $b;
        echo "Sum of $a and $b is $sum\n";
    }
}
