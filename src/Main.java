import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание № 1 ");
        int[] arr = {30000, 25000, 33234, 442312, 100000};
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");
        System.out.println("Задание № 2 ");
        int[] difference = {123123, 323, 33324, 44425, 76754};
        int min = Arrays.stream(difference).min().getAsInt();
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        int max = Arrays.stream(difference).max().getAsInt();
        System.out.println("Максимальная сумма трат за неделю составила" + max + " рублей");
        System.out.println("Задание № 3 ");
        int[] average = {12312, 34200, 56150, 42300};
        int value = 0;
        for (int element : average) {
            value += element / average.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + value + " рублей");
        System.out.println("Задание № 4 ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }

        System.out.println(new String(reverseFullName));
    }
}


