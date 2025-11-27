import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();

        System.out.println("Введите номер задания (1-4):");
        int zadanie = sc.nextInt();

        System.out.println("Введите номер задачи (2, 4, 6, 8, 10):");
        int zadacha = sc.nextInt();

        boolean valid = true;

        if (zadanie == 1) {
            if (zadacha == 2) {
                System.out.println("Введите число: ");
                int x = readInt(sc);

                int result = obj.sumLastNums(x);
                System.out.println("Результат: " + result);
            }
            else if (zadacha == 4) {
                System.out.println("Введите число: ");
                int x = readInt(sc);

                boolean result = obj.isPositive(x);
                System.out.println("Результат: " + result);
            }
            else if (zadacha == 6) {
                System.out.println("Введите символ: ");
                char x = readChar(sc);

                boolean result = obj.isUpperCase(x);
                System.out.println("Результат: " + result);
            }
            else if (zadacha == 8) {
                System.out.println("Введите число a: ");
                int a = readInt(sc);

                System.out.println("Введите число b: ");
                int b = readInt(sc);

                boolean result = obj.isDivisor(a, b);
            }
            else if (zadacha == 10) {
                System.out.println("Введите a:");
                int a = readInt(sc);
                System.out.println("Введите b:");
                int b = readInt(sc);

                int result = obj.lastNumSum(a, b);

                System.out.println("Результат: " + result);
            }
            else
                valid = false;
        }
        else if (zadanie == 2) {
            if (zadacha == 2) {
                System.out.println("Введите число x: ");
                int x = readInt(sc);
                System.out.println("Введите число y: ");
                int y = readInt(sc);

                double result = obj.safeDiv(x, y);
                System.out.println("Результат: " + result);
            }
            else if (zadacha == 4) {
                System.out.println("Введите число x: ");
                int x = readInt(sc);
                System.out.println("Введите число y: ");
                int y = readInt(sc);

                String result = obj.makeDecision(x, y);
                System.out.println("Результат: " + result);
            }
            else if (zadacha == 6) {
                System.out.println("Введите число x: ");
                int x = readInt(sc);
                System.out.println("Введите число y: ");
                int y = readInt(sc);
                System.out.println("Введите число z: ");
                int z = readInt(sc);

                boolean result = obj.sum3(x, y, z);
                System.out.println("Результат" + result);

            }
            else if (zadacha == 8) {
                System.out.println("Введите возраст: ");
                int x = readInt(sc);

                String result = obj.age(x);
                System.out.println("Результат: " + result);
            }
            else if(zadacha == 10) {
                System.out.println("Введите день недели:");
                String x = sc.next();

                obj.printDays(x);
            }
            else {
                valid = false;
            }
        }
        else if (zadanie == 3) {
            if (zadacha == 2) {
                System.out.println("Введите число x: ");
                int x = readInt(sc);

                String result = obj.reverseListNums(x);
                System.out.println("Результат: " + result);
            }
            else if (zadacha == 4) {
                System.out.println("Введите число x: ");
                int x = readInt(sc);
                System.out.println("Введите число y: ");
                int y = readInt(sc);

                int result = obj.pow(x, y);
                System.out.println("Результат: " + result);
            }
            else if (zadacha == 6) {
                System.out.println("Введите число x:");
                int x = readInt(sc);

                boolean result = obj.equalNum(x);

                System.out.println("Результат: " + result);
            }
            else if (zadacha == 8) {
                System.out.printf("Введите число x: ");
                int x = readInt(sc);
                System.out.println("Треугольник высоты " + x + ":\n");

                obj.leftTriangle(x);
            }
            else if(zadacha == 10){
                System.out.println("Игра угадайка\n");
                obj.guessGame();
            }
            else {
                valid = false;
            }
        }
        else if (zadanie == 4) {
            if (zadacha == 2) {
                System.out.println("Введите размер массива:");
                int n = readInt(sc);

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }

                System.out.println("Введите число x: ");
                int x = readInt(sc);

                int result = obj.findLast(arr, x);
                System.out.println("Результат: " + result);

            }
            else if (zadacha == 4) {
                System.out.println("Введите размер массива:");
                int n = readInt(sc);

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }

                System.out.println("Введите число x: ");
                int x = readInt(sc);
                System.out.println("Введите pos: ");
                int pos = readInt(sc);

                int[] result = obj.add(arr, x, pos);
                System.out.println("Результат: " + Arrays.toString(result));

            }
            else if (zadacha == 6) {
                System.out.println("Введите размер массива:");
                int n = readInt(sc);

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }

                System.out.println("Массив до: " + Arrays.toString(arr));
                obj.reverse(arr);
                System.out.println("Массив после: " + Arrays.toString(arr));
            }
            else if (zadacha == 8) {
                System.out.println("Введите размер первого массива:");
                int n1 = readInt(sc);

                int[] arr1 = new int[n1];

                for (int i = 0; i < n1; i++) {
                    System.out.println("Элемент " + i + ":");
                    arr1[i] = readInt(sc);
                }

                System.out.println("Введите размер второго массива:");
                int n2 = readInt(sc);

                int[] arr2 = new int[n2];

                for (int i = 0; i < n2; i++) {
                    System.out.println("Элемент " + i + ":");
                    arr2[i] = readInt(sc);
                }

                System.out.println("Массивы: " + Arrays.toString(arr1) + ", " + Arrays.toString(arr2));
                int[] result = obj.concat(arr1, arr2);
                System.out.println("Результат: " + Arrays.toString(result));


            }
            else if (zadacha == 10) {
                System.out.println("Введите размер массива:");
                int n = readInt(sc);

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Элемент " + i + ":");
                    arr[i] = readInt(sc);
                }

                int[] result = obj.deleteNegative(arr);
                System.out.println("Результат: " + Arrays.toString(result));
            }
            else {
                valid = false;
            }
        }

        if (!valid) {
            System.out.println("Нет такой задачи");
        }

        sc.close();

    }

    private static int readInt(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Неверный ввод. Пожалуйста, введите число");
            }
        }
    }

    private static char readChar(Scanner sc) {
        while (true) {
            String input = sc.next();
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                System.out.println("Неверный ввод. Пожалуйста, введите один символ");
            }
        }
    }

    // Задание 1
    // Номер 2
    public int sumLastNums(int x) {
        // Получаем последнюю цифру числа
        int lastDigit = x % 10;

        // Получаем число без последней цифры
        int numberWithoutLastDigit = x / 10;

        // Получаем предпоследнюю цифру числа
        int secondLastDigit = numberWithoutLastDigit % 10;

        // Возвращаем сумму двух последних цифр
        return lastDigit + secondLastDigit;
    }

    // Номер 4
    public boolean isPositive(int x) {
        if(x >= 0) {
            return true;
        } else
            return false;
    }

    // Номер 6
    public boolean isUpperCase(char x) {
        // Проверяем, находится ли символ в диапазоне от 'A' до 'Z'
        return x >= 'A' && x <= 'Z';
    }

    // Номер 8
    public boolean isDivisor(int a, int b) {
        // Проверяем, делится ли a на b нацело (учитывая, что b не равно 0)
        boolean aDividesB = (b != 0) && (a % b == 0);

        // Проверяем, делится ли b на a нацело (учитывая, что a не равно 0)
        boolean bDividesA = (a != 0) && (b % a == 0);

        // Возвращаем true, если выполняется хотя бы одно условие
        return aDividesB || bDividesA;
    }

    // Номер 10

    public int lastNumSum(int a, int b) {
        // Получаем последние цифры обоих чисел и возвращаем их сумму
        return (a % 10) + (b % 10);
    }

    // Задание 2
    // Номер 2
    public double safeDiv(int x, int y) {
        try {
            double result = x / y;
            return result;
        }
        catch (Exception a) {
            return 0;
        }

    }

    // Номер 4
    public String makeDecision(int x, int y) {
        try {

            if(x > y) {
                String res = x + " > " + y;
                return res;
            }
            else if(x < y) {
                String res = x + " < " + y;
                return res;
            }
            else {
                String res = x + " == " + y;
                return res;
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка");
            return makeDecision(x, y);
        }

    }

    // Номер 6
    public boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        } else if (x + z == y) {
            return true;
        } else if (y + z == x) {
            return true;
        } else {
            return false;
        }
    }

    // Номер 8
    public String age(int x) {
        if (x % 10 == 1 && x != 11) {
            String res = x + " год";
            return res;
        }
        else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && x != 12 && x != 13 && x != 14) {
            String res = x + " года";
            return res;
        }
        else {
            String res = x + " лет";
            return res;
        }
    }

    // Номер 10
    public void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // Задание 3
    // Номер 2
    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();

        for (int i = x; i >= 0; i--) {
            result.append(i);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Номер 4
    public int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    // Номер 6
    public boolean equalNum(int x) {
        if (x < 0) x = -x;
        if (x == 0) return true;
        int first = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != first) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    // Номер 8
    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Номер 10
    public void guessGame() {
        Random random = new Random();
        int secret = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess;
        do {
            System.out.println("Введите число от 0 до 9:");
            guess = scanner.nextInt();
            attempts++;
            if (guess != secret) {
                System.out.println("Вы не угадали, ");
            }
        } while (guess != secret);
        System.out.println("Вы угадали!");
        System.out.println("Вы отгадали число за " + attempts + " попытки");
    }

    // Задание 4
    // Номер 2
    public int findLast(int[] arr, int x) {
        // Проходим по массиву с конца к началу
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i; // Возвращаем индекс при нахождении
            }
        }
        return -1; // Число не найдено
    }

    // Номер 4
    public int[] add(int[] arr, int x, int pos) {
        // Создаем новый массив размером на 1 больше
        int[] newArray = new int[arr.length + 1];

        // Копируем элементы до позиции pos
        for (int i = 0; i < pos; i++) {
            newArray[i] = arr[i];
        }

        // Вставляем новый элемент
        newArray[pos] = x;

        // Копируем оставшиеся элементы после позиции pos
        for (int i = pos; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }

    // Номер 6
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // Номер 8
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }

    // Номер 10
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }

        return result;
    }


}