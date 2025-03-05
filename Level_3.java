import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Level_3 {
    //Массивы и Коллекции

    //Сумма элементов массива
    //Пользователь вводит размер массива и его элементы. Найдите сумму всех элементов.
    public static void Sum_in_El() {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Введите размер массива: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);

    }

    //Максимальный элемент
    //Пользователь вводит массив чисел. Найдите максимальный элемент и его индекс.
    public static int[] Arr_max_idx(int[] n) {
        int[] max_indx = new int[]{-2100000000, 0};
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max_indx[0]) {
                max_indx[0] = n[i];
                max_indx[1] = i;
            }
        }
        return new int[]{max_indx[0], max_indx[1]};

    }

    //Сортировка массива
    //Пользователь вводит массив. Отсортируйте его по возрастанию и выведите результат.
    public static int[] BubbleSort(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            for (int l = 0; l < sort.length - i - 1; l++) {
                if (sort[l] > sort[l + 1]) {
                    int swap = sort[l];
                    sort[l] = sort[l + 1];
                    sort[l + 1] = swap;
                }
            }
        }
        return sort;
    }

    //Удаление дубликатов
    //Пользователь вводит массив чисел. Удалите все дубликаты и выведите новый массив.
    public static int[] Duplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //Поиск подстроки
    //Пользователь вводит строку и подстроку. Определите, сколько раз подстрока встречается в строке.
    public static int sub_str(String str, String sub) {
        int count = 0;
        int index = str.indexOf(sub);
        while(index != -1){
            count++;
            index = str.indexOf(sub, index + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, -222, 59995, -23048847, 99, 99, 99, 9999999};

        //Сортировка массива по возрастанию
        arr = BubbleSort(arr);

        //удаление дубликатов
        arr = Duplicate(arr);

        //вывод массива, который прошел сортировку и фильтрацию
        for (int i : arr) {
            System.out.print(i + " ");

        }System.out.println();

        //Максимальный элемент и его индекс
        int[] result = Arr_max_idx(arr);
        System.out.println("Max number: " + result[0]);
        System.out.println("Index: " + result[1]);

        //Количество подстроки в строке
        System.out.println("Количество подстрок в строке: "+sub_str("abaababababb", "aba"));
    }
}
