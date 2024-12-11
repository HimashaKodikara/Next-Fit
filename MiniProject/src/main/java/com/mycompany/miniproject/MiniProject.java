/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class MiniProject {

    public static void nextFitFixedMemory() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int p = scanner.nextInt();

        System.out.print("Enter number of memory blocks: ");
        int n = scanner.nextInt();

        int[] process = new int[p];
        int[] memory = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter size of memory block #" + (i + 1) + ": ");
            memory[i] = scanner.nextInt();
        }

        for (int i = 0; i < p; i++) {
            System.out.print("Memory required for process #" + (i + 1) + ": ");
            process[i] = scanner.nextInt();
        }

        int[] outputNextFit = new int[p];
        for (int i = 0; i < p; i++) {
            outputNextFit[i] = -1;
        }

        int currentIndex = 0; // Keeps track of the current position in memory blocks

        for (int i = 0; i < p; i++) {
            boolean allocated = false;
            for (int j = 0; j < n; j++) {
                int index = (currentIndex + j) % n; // Circular traversal using modulo
                if (memory[index] >= process[i]) {
                    outputNextFit[i] = memory[index];
                    memory[index] -= process[i]; // Reduce available memory in the block
                    currentIndex = index; // Update the current position
                    allocated = true;
                    break;
                }
            }
            if (!allocated) {
                currentIndex = (currentIndex + 1) % n; // Move to the next block if no allocation
            }
        }

        System.out.println();
        System.out.println("Process No.\tMemory Block Allocated in Next Fit");
        for (int i = 0; i < p; i++) {
            System.out.print((i + 1) + "\t\t\t");
            if (outputNextFit[i] == -1) {
                System.out.println("Memory not allocated");
            } else {
                System.out.println(outputNextFit[i]);
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        nextFitFixedMemory();
    }
}
