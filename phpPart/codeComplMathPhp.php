<?php

class SimpleHandler
{
    private int $number;
    private string $text;
    private array $data;

    public function __construct()
    {
        $this->number = rand(1, 50);
        $this->text = "Hello_" . rand(100, 999);
        $this->data = ['name' => 'John', 'age' => 30];
    }

    public function getValue(string $key): void
    {
        try {
            echo "Value: " . $this->data[$key] . "\n";
        } catch (\Throwable $e) {
            echo "Error: " . $e->getMessage() . "\n";
        }
    }

    public function divide(int $by): void
    {
    }

    public function parseInt(string $value): void
    {
        try {
            $parsedValue = (int)$value;
            if ((string)$parsedValue !== $value) {
                throw new \Exception();
            }
            echo "Parsed value: $parsedValue\n";
        } catch (\Throwable $e) {
            echo "Error: " . $e->getMessage() . "\n";
        }
    }

    public function reuseVariables(): void
    {
    
    }
}

$handler = new SimpleHandler();
$handler->getValue("name");
$handler->divide(0);
$handler->parseInt("abc");
$handler->reuseVariables();
