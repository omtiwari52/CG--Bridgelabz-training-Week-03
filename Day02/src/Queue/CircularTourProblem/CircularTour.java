package Queue.CircularTourProblem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>();
        int totalSurplus = 0, currentSurplus = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int balance = petrol[i] - distance[i];
            totalSurplus += balance;
            currentSurplus += balance;
            queue.offer(i); // Add petrol pump index to queue

            // If surplus becomes negative, reset the queue
            if (currentSurplus < 0) {
                start = i + 1; // Move to next possible starting point
                currentSurplus = 0;
                queue.clear(); // Reset the queue as previous sequence is invalid
            }
        }

        // If total surplus is negative, a complete tour is not possible
        return (totalSurplus >= 0) ? start : -1;
    }
}
