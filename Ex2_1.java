import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2_1 {
    public static final int MAX = 5;
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        List<Integer> nums = getInput();
        sort(nums);
        display(nums);
    }

    // getInput
    public static List<Integer> getInput(){
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        while(nums.size() < MAX) {    
            String s = inp.nextLine();
            // checkType
            if(isNum(s)){
                int num = Integer.parseInt(s);
                // checkRange
                checkRange(nums, num);
            }
        }
        inp.close();
        return nums;
    }

    // check type
    public static boolean isNum(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
    }

    // check range
    public static void checkRange(List<Integer> nums, int num){
        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return;
        }
        nums.add(num);
    }

    // sort
    public static void sort(List<Integer> nums){
        Collections.sort(nums);
    }
    
    // display
    public static void display(List<Integer> nums){
        for(int num : nums)
            System.out.print(num+" ");
    }
}