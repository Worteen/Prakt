public class lib {
    private int indMax=0;
    public static boolean conditionVerify(int n){
        if (n<=0){
            System.out.println("Овощной деградант, число больше 0 .\n"+" попробуй нормально ввести :( \n");
            return false;}
        return true;}
    public static int [] generationArray(final int MIN, final int MAX, int n){
        int [] array= new int[n];
        for (int i=0; i< array.length; i++){
            array[i]=(int)(Math.random()*(MAX-MIN)+MIN);
        }
        return array;

    }
    public int min( int [] array ){
        int min=array [0];
        for (int i=1; i< array.length; i++){
            if (min > array[i]) min =array[i];
        }
        return min;
    }

    public int max( int [] array ){
        int max=array [0];
        for (int i=1; i< array.length; i++ ){
            if (max < array[i]) max =array[i];
        }
        return max;
    }
    public  void maxIndex(int [] array ){
        for (int i=1; i< array.length; i++){
            if(array[indMax]<=array[i]) indMax=i;
        }
    }
    public int getIndMax(){
        return indMax;
    }
    public  int[] method1(int [] arr){
        return new int[]{this.min(arr),this.max(arr)};
    }

    public int[] minmax  (int [] array) {
        int minb = min(array);

        int max = max(array);

        int c_min = 0;
        int c_max = 0;

        for (int i = 0; i < array.length; i++) {
            if (minb == array[i]) c_min = c_min + 1;
            if (max==array[i]) c_max=c_max+1;

        }
        return new int[]{c_min,c_max};
    }

    public double sredniy (int []array ){
        int s=0;
        for (int i = 0; i < array.length; i++) {
            s=s+array[i];
        }
        return (double) s /array.length;
    }
    public int[] timeminmax (int[] array ) {
        int timemin = min(array);
        int timemax = max(array);

        for (int i = 0; i < array.length; i++) {
            if (timemin == array[i]) {
                timemin = i+1;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (timemax == array[i]) {
                timemax = i+1;
                break;
            }

        }
        return new int[]{timemin, timemax};
    }
    public int prom (int[] array ) {
        int a= timeminmax(array)[0];
        int b= timeminmax(array)[1];
        return Math.abs(a-b);
    }


    public int nol (int []array){
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if (0 == array[i]) {
                n=n+1;

            }

        }
        return n;

    }
}
