    import java.util.Scanner;
public class singleduplicated {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        
        // Reading array elements from user input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }

        // Finding first duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First duplicate value is " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicates found.");
    }
}