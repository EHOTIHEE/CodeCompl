package javapart;

import java.util.concurrent.*;
import java.io.*;
import java.nio.file.*;

public class FutureMethods {

    // Asynchronous method to fetch data using Future
    public static Future<String> fetchData() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        return executor.submit(() -> {
            try {
                Thread.sleep(1000);  // Simulate delay
                return "Data fetched";
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "Error fetching data";
            }
        });
    }

    //7th
    // Asynchronous method to process data using Future

    // Asynchronous method to save data using Future
    public static Future<Void> saveData(String processedData) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        return executor.submit(() -> {
            try {
                Thread.sleep(300);  // Simulate saving
                System.out.println("Data saved: " + processedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
    }

    // Method with try/catch - read file content
    public static String readFile(String path) {
        try {
            return Files.readString();
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
            return "";
        }
    }

    // 12th
    // Method with try/catch - write to a file
    public static boolean writeFile(String path, String content) {
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<String> fetchedData = fetchData();
        System.out.println("Fetching data...");
        String data = fetchedData.get();
        System.out.println("Fetched: " + data);

        Future<String> processedData = processData(data);
        System.out.println("Processing data...");
        String processed = processedData.get();
        System.out.println("Processed: " + processed);

        Future<Void> savedData = saveData(processed);
        System.out.println("Saving data...");
        savedData.get();

        System.out.println("All tasks completed!");

        // Test methods with try/catch
        System.out.println("Read from file: " + readFile("data.txt"));
        System.out.println("Write to file: " + (writeFile("output.txt", "Hello World!") ? "Success" : "Failure"));
    }
}
