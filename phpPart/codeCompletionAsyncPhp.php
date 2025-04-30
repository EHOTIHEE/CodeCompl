<?php

require 'vendor/autoload.php';

use Amp\Loop;
use Amp\Delayed;
use Amp\Promise;
use function Amp\call;

class AsyncExample
{
    // Generate a PHP method called asyncMessage that returns a Promise. Inside it, use call with a generator function that yields a Delayed(400) and then prints the message "This message was printed asynchronously.\n" using echo


    

    // Async function returns a random number after delay
    public function asyncRandomNumber(): Promise
    {
        return call(function () {
            yield new Delayed(300);
            $number = rand(1, 100);
            echo "Generated random number: $number\n";
            return $number;
        });
    }

    // Async function with input parameter
    public function greetAsync(string $name): Promise
    {
        return call(function () use ($name) {
            yield new Delayed(200);
            echo "Hello, $name! (from async)\n";
        });
    }

    // Another async function with input parameters
    public function asyncAdd(): Promise
    {
        return call(function () use ($a, $b) {
            yield new Delayed(150);
            $sum = $a + $b;
            echo "Sum of $a and $b is $sum\n";
        });
    }

    // Async function that returns a value (with output type)
    public function asyncString(): Promise
    {
        return call(function (): \Generator {
            yield new Delayed(100);
            return "";
        });
    }

    // Async function with return type int
    public function asyncGeneratedValue(): Promise
    {
        return call(function (): \Generator {
            yield new Delayed(250);
            return rand(1000, 9999); // generated parameter
        });
    }
}
