package javapart;

public class VariableOperations {
    // variables for x,y,z
    private int x;
    private int y;


    // Constructor to initialize variables
    public VariableOperations(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //16th
    // Method to add the two variables
    public int add() {
    }

    // Method to divide the first variable by the second
    public double divide() {
        if (y != 0) {
            return (double) x / y;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }
    // Method with varargs - sum of multiple numbers



    // Method with varargs - find the maximum value
    public int max(int... numbers) {
        if (numbers.length == 0) return Integer.MIN_VALUE;
        int maxVal = numbers[0];
        for (int num : numbers) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        VariableOperations vars = new VariableOperations(10, 5);
        System.out.println("Addition: " + vars.add());
        System.out.println("" + vars.divide());
        System.out.println("Sum of numbers: " + vars.sum(1, 2, 3, 4, 5));
        System.out.println("Maximum value: " + vars.max(3, 7, 1, 9, 4));
    }
}

