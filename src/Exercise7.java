public class Exercise7 {
    public static void main (String[] args) {

        int [] nums = new int [8];

        addArr(nums,-2);
    }

    public static void addArr(int[] arr, int n){
        int counter = 1;
        if(n>0){
            for(int i = 0; i < arr.length; i+=n) {
                arr[i] = counter;
                counter ++;
                System.out.print(arr[i] + "|");
            }
        }
        else System.out.println("Значение n выходит за размеры массива");
    }
}
