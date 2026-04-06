import java.util.Scanner;

public class problem3{
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0, mean;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter heights of 11 players:");
        for(int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        mean = sum / 11;

        System.out.println("Mean height of the football team = " + mean);
    }
}