public class Exercise4 {
    public static void main (String[] args) {

        int counter = 1;
        int temporary = 1;
        int[][] array = new int[3][3];
        for(int i = 0; i < 3; i++){
            for (int j = 0;j < 3; j++) {
                array[i][j] = counter;
                temporary ++;
                if (temporary % 2 !=0) counter = 1;
                else counter = 0;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

