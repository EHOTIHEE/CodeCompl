import React from "react";

// Function to format the user's full name
function formatUserName(firstName: string, lastName: string): string {
  return `${firstName} ${lastName}`;
}

// Function to get a random number within a range
function getRandomNumber(min: number, max: number): number {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

// Function to check if a number is even
function isEven(num: number): boolean {
  return num % 2 === 0;
}

// Main component
const UtilityFunctionsDemo: React.FC = () => {
  const fullName = formatUserName("Ivan", "Ivanov");
  const randomNumber = getRandomNumber(1, 100);
  const evenCheck = isEven(randomNumber);

  return (
    <div className="p-4 max-w-md mx-auto bg-white rounded-xl shadow-md space-y-4">
      <h1 className="text-xl font-bold">Example of Functions in React + TypeScript</h1>
      <p>Random number: {randomNumber}</p>
      <p>The number {randomNumber} is {evenCheck ? "even" : "odd"}</p>
    </div>
  );
};

export default UtilityFunctionsDemo;
