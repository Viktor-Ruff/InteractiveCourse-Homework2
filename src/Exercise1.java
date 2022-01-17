public class Exercise1 {
    public static void main (String[] args) {

        int[] array = {1,0,0,1,1,1,0,1,0,0,1,0};
        for (int o : array ){
            if (o==1){
               o=0;
            }
            else {
                o=1;
            }
           System.out.println(o);
        }
    }
}
