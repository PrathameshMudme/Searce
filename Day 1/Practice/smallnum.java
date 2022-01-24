import java.util.Scanner;

public class smallnum {

  public static int smallest(int[] arr) {

    int min = 0;
    min = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (min > arr[i])
        min = arr[i];
    }

    return min;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int length = 0;
    int numbers[] = null;

    System.out.print("Enter length of the array: ");
    length = scan.nextInt();

    numbers = new int[length];

    System.out.println("Enter array elements: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scan.nextInt();
    }

    System.out.println("Smallest element = " + smallest(numbers));

    scan.close();
  }
}