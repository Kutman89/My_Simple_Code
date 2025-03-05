import java.util.Scanner;

public class Level_1_2 {
    //Сумма чисел от 1 до n
    public  static void num_for_n(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum+=i;
        }
        System.out.println("Output: "+sum);
    }
    //наибольшее из 3 чисел
    public static void numbers(){
        Scanner sc = new Scanner(System.in);
        int n, max = -2100000000;
        for(int i = 0; i < 3; i++){
            System.out.print("Введите число "+(i+1)+": " );
            n = sc.nextInt();

            if(n > max){
                max = n;
            }
        }
        System.out.println("Max number: "+ max);

    }
    //таблица умножения
    public static void table(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для т. умножения: ");
        n = scanner.nextInt();
        for(int i = 1; i < 11; i++){
            System.out.println(n + " * " + i +" = "+ (n*i));
        }
    }
    //факториал числа
    public static int factorial(int n){
        if(n <= 1){
            return n;
        }
        return n * factorial(n-1);
    }
    //простое число
    public static boolean nat_n(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    //Реверс строки
    public static String reverse(String rev){
        StringBuilder sb = new StringBuilder();
        for(int i = rev.length()-1; i >= 0; i--){
            sb.append(rev.charAt(i));
        }
        return sb.toString();
    }
    //N Чисел Фибоначи
    public static void Fib(int n){
        int n1 = 0, n2 = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(n1 + " ");
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String[] args) {
    }
}