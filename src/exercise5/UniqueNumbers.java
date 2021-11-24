package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        uniqueNumbers[0] = numbers[0];

        for (int i = 1; i < numberCount; i++){
          for (int j = 0; j < numberCount; j++){
            if (uniqueNumbers[j] == numbers[i]){
              break;
            } else if (uniqueNumbers[j] == 0){
              uniqueNumbers[j] = numbers[i];
              break;
            }
          }
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
