public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println(" Задание №1 " );
        int salary = 15000;
        int total = 0;
        for (int i = 0;total < 2459000; i++ ) {
            total = total + total/100;
            total = total + salary;
          //  System.out.println(" Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
       // System.out.println(total);
       // System.out.println(i);
        //Задание 2
        System.out.println( " Задание №2 ");
        int a = 0;
        while ( a < 10) {a++;
        System.out.println(a);}
        for (int b = 10; b > 0; b = b -1) {
            System.out.println(b);}
        //Задание 3
        System.out.println(" Задание №3 ");
         int people = 12_000_000;
         int born = people / 1000 * 17;
         int dead = people / 1000 * 8;
       for ( int y = 0; y <= 10; y++ ) {people = people + born - dead ;
        System.out.println(" За " + y + " год население выросло до " + people + " человек ");}

    }
}