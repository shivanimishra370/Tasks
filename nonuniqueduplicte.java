    import java.util.*;
public class nonuniqueduplicte {



    
    // Method to find a single duplicate in an array of integers
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                return index + 1;
            } else {
                nums[index] = -nums[index];
            }
        }
        return -1;
    }
    
    // Method to find non-unique duplicates in an array of integers
    public static List<Integer> findNonUniqueDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                if (!result.contains(index + 1)) {
                    result.add(index + 1);
                }
            } else {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int duplicate = findDuplicate(arr);
        if (duplicate != -1) {
            System.out.println("The single duplicate in the array is: " + duplicate);
        } else {
            System.out.println("There is no duplicate in the array.");
        }
        List<Integer> duplicates = findNonUniqueDuplicates(arr);
        if (duplicates.size() > 0) {
            System.out.println("The non-unique duplicates in the array are: " + duplicates);
        } else {
            System.out.println("There are no non-unique duplicates in the array.");
        }
    }
}


