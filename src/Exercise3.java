public class Exercise3 {
    public static void main (String[] args) {

        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int o : array ){
            if (o<6){
                o*=2;
            }
            System.out.println(o);
        }
    }
}
