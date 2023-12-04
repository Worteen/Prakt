import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("введите натуральное число:");
            n = in.nextInt();
        }
        while (lib.conditionVerify(n) == false);
        in.close();
        final int MIN = 0;
        final int MAX = 10;
        int[] a = lib.generationArray(MIN, MAX, n);
        System.out.println(Arrays.toString(a));
        lib obj = new lib();
        obj.maxIndex(a);
        int[] minmax = obj.method1(a);

        System.out.println("Минимумымым " + minmax[0] + "\n Индекс последнего максиманального " + obj.getIndMax() + "\n максиманальное значение " + minmax[1]);

        int[] minbmax = obj.minmax(a);
        System.out.println("миниманальное было столько " + minbmax[0] + " \n но максиманальное было столько " + minbmax[1]);

        double sredniy = obj.sredniy(a);
        System.out.println("среднееЕЕЕЕееЕЕ число " + sredniy);

        int[] timeminmax = obj.timeminmax(a);
        System.out.println("миниманальная " + timeminmax[0] + " максиманальная " + timeminmax[1]);

        int prom = obj.prom(a);
        System.out.println("промежуток " + prom);

        int nol = obj.nol(a);
        System.out.println("Ноликов-еболиков столько " + nol);

    }
}