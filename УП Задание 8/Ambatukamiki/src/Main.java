import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



class Main{
public static void main(String[] args) {

        System.out.println("Версия программы");
        System.out.println("Функции программы:");
        System.out.println("1. Заполнить основные списки");
        System.out.println("2. Вывести основные списки");
        System.out.println("3. Вывести троечников");
        System.out.println("4. Вывести хорошистов");
        System.out.println("5. Вывести двоечники");
        System.out.println("6. Вывести отличников");
        System.out.println("7. Вывести средний балл");


        try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите количество обучающихся: ");
                int size = scanner.nextInt();




                massiv massive = new massiv(size);


                int choice;
                do {
                        System.out.print("Введите номер команды (0 для выхода): ");
                        choice = scanner.nextInt();
                        switch (choice) {
                                case 1:
                                        massive.fillArrays();
                                        break;
                                case 2:
                                        massive.printArrays();
                                        break;
                                case 3:
                                        massive.display2();
                                        break;
                                case 4:
                                        massive.display3();
                                        break;
                                case 5:
                                        massive.display4();
                                        break;
                                case 6:
                                        massive.display5();
                                        break;
                                case 7:
                                        massive.display6();
                                        break;
                                case 8:
                                        massive.display7();
                                        break;

                                default:
                                        System.out.println("Неверная команда. Попробуйте снова.");
                        }
                } while (choice != 0);
        } catch (Exception ex){
                System.out.println("Неправильно ");
        }

        }
        }
