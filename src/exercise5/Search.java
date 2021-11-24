package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberIndex = -1;
        int index = 0;
        for (int i = 0; i < numberCount; i++){
          if (numbers[i] == number){
            numberIndex = i;
          }
        }

        System.out.println("Number index: " + numberIndex);
    }
}
