public class Exercise5 {
    public static void main (String[] args) {

        int max = 0;
        int [] nums = new int [10];
        nums[0]= 25;
        nums[1]= 5;
        nums[2]= 12;
        nums[3]= 8;
        nums[4]= 37;
        nums[5]= 2;
        nums[6]= 51;
        nums[7]= 224;
        nums[8]= 9;
        nums[9]= 167;
        int min = nums[0];

        for(int o : nums){
            if (max<o) max = o;
            if (min>o) min = o;
        }
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);

    }
}

