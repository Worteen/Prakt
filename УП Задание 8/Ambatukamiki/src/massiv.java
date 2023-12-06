import java.util.*;

public class massiv {
    private String[] names;
    private int[] grades;


    public massiv(int size) {
        names = new String[size];
        grades = new int[size];
    }


    public void fillArrays() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Введите ФИО обучающегося: ");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random() * (5 - 1) + 1);

        }
    }


    public void printArrays() {
        System.out.println("Список обучающихся и их оценок:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ", " + grades[i]);
        }
    }

    public Object[] SortStringArrays1(Object[] arr) {
        Arrays.sort(arr, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        return arr;

    }

    public Object[] SortStringArrays2(Object[] arr) {
        Arrays.sort(arr, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
        return arr;

    }


    public void display2() {
        ArrayDeque<String> result = new ArrayDeque<String>();
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 3) {
                result.add(names[i]);
            }
        }
        System.out.println("Троечники:" + result.toString());
    }

    public void display3() {
        ArrayDeque<String> result = new ArrayDeque<String>();
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 4) {
                result.add(names[i]);

            }
        }
        Object[] arr = result.toArray();
        System.out.println("Хорошисты  :" + Arrays.toString(SortStringArrays1(arr)));
    }

    public void display4() {
        ArrayDeque<String> result = new ArrayDeque<String>();
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                result.add(names[i]);

            }
        }
        System.out.println("Двоечники :" + result.toString());
    }


    public void display5() {
        ArrayDeque<String> result = new ArrayDeque<String>();
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 5) {
                result.add(names[i]);

            }
        }
        Object[] arr = result.toArray();
        System.out.println("Отличники :" + Arrays.toString(SortStringArrays2(arr)));
    }

    public double display6() {
        int s = 0;
        for (int i = 0; i < grades.length; i++) {
            s = s + grades[i];
        }

        return (double) s / grades.length;
    }

    public static void display7() {

    }

}