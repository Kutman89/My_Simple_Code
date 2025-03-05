package OOP;
//Калькулятор
//Создайте класс Calculator с методами для сложения, вычитания, умножения и деления двух чисел.
public class Calculator {
    public int plus(int n1, int n2){
        return n1+n2;
    }
    public int minus(int n1, int n2){
        return n1-n2;
    }
    public int multiplication(int n1, int n2){
        return n1 * n2;
    }
    public int fission(int n1, int n2){
        if(n2 == 0){
            return -1;
        }
        return n1 / n2;
    }
}
