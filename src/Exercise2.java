public class Exercise2 {
    public static void main (String[] args) {

        int counter = 0;
        int[] array = new int[8];
        for(int i = 0; i <array.length; i++){
            array[i] = counter;
            counter+=3;
            System.out.print(array[i]+"|");
        }
    }
}

