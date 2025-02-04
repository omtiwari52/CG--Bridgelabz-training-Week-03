package string_buffer.compare_string_buffer_and_string_builder;

public class Main {
    public static void main(String[] args) {
        double[] time = Compare.comparePerformance(10000000);
        System.out.println("String Buffer time is: " + time[0] + "\nString Builder time is: " + time[1]);
    }
}
