public class Exercise6 {
    public static void main (String[] args) {


        int [] nums = new int [4];
        nums[0]= 25;
        nums[1]= 5;
        nums[2]= 12;
        nums[3]= 8;

        validateArr(nums);
    }

    public static boolean validateArr (int[] arr){
        boolean bool = false;
        if ((arr[0] + arr[1])==(arr[2] + arr[3])){
            bool = true;
            System.out.println((arr[0] + arr[1]) + " равно " + (arr[2] + arr[3]));
        }
        else System.out.println((arr[0] + arr[1]) + " не равно " + (arr[2] + arr[3]));
        return bool;
    }
}

