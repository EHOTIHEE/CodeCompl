package javapart;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncMethods {


    // Asynchronous method to fetch data
    public static CompletableFuture<String> fetchData() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);  // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Data fetched"; 
        });
    }
    // 6th case and 3rd
    // Asynchronous method to process data


    // Asynchronous method to save data
    public static CompletableFuture<Void> saveData(Object processedData) {
        return CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(300);  // Simulate saving
                System.out.println("Data saved: " + processedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        fetchData()
            .thenCompose(data -> processData(data))
            .thenCompose(processedData -> saveData(processedData))
            .thenRun(() -> System.out.println("All tasks completed!"));

        // Wait for all asynchronous operations to complete
        Thread.sleep(2000);
    }
}