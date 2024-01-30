import java.util.HashMap;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
                                            // Основной класс
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение состоящих из двух арабских или римских чисел до 10: ");
        Scanner str = new Scanner(System.in);
        String input = str.next();
        System.out.println("Итог: " + calc(input));
    }

                                            //Класс калькулятора
    public static String calc(String input) throws Exception {
        String oper = SearchOper(input);
        String x = DivisionLine(input, 0).toUpperCase();
        String y = DivisionLine(input, 1).toUpperCase();
        String num_sys = ArabOrRoman(x,y);
        String result = null;
        if (num_sys == "arab"){
            result = arab_int_sys(x,y,oper);
        }else if (num_sys == "roman"){
            result = roman_int_sys(x,y, oper);
        }
        return result;
    }

                                            //Проверка выражения и получение операнда
    static String SearchOper(String input) throws Exception {
        String oper = "";
        String[] opers = input.split("[+\\-*/]");
        if (opers.length != 2) throw new Exception("Более двух чисел либо неверная операция!");
        if (input.indexOf('+') > 0) {
            oper = "+";
        } else if (input.indexOf('-') > 0) {
            oper = "-";
        } else if (input.indexOf('/') > 0) {
            oper = "/";
        } else if (input.indexOf('*') > 0) {
            oper = "*";
        } else {
            oper = null;
        }
        return oper;
    }

                                            //Получение чисел
    static String DivisionLine(String str, int index) {
        String[] ind = {};
        String numbers = "0";
        if (str.indexOf('+') > 0) {
            ind = str.split("[+]");
            numbers = ind[index];
        } else if (str.indexOf('-') > 0) {
            ind = str.split("[-]");
            numbers = ind[index];
        } else if (str.indexOf('/') > 0) {
            ind = str.split("[/]");
            numbers = ind[index];
        } else if (str.indexOf('*') > 0) {
            ind = str.split("[*]");
            numbers = ind[index];
        }
        return numbers;
    }
                                            // Опредиление системы счисления
    static String ArabOrRoman(String x, String y) throws Exception {
        String[] roman_nums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arab_nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String num_sys_x = "";
        String num_sys_y = "";
        for (String string : roman_nums) {
            if (x.equals(string)) {
                num_sys_x = "roman";
                break;
            } else {}
        }
        for (String string : arab_nums) {
            if (x.equals(string)) {
                num_sys_x = "arab";
                break;
            } else {}
        }
        for (String string : roman_nums) {
            if (y.equals(string)) {
                num_sys_y = "roman";
                break;
            } else {}
        }
        for (String string : arab_nums) {
            if (y.equals(string)) {
                num_sys_y = "arab";
                break;
            } else {}
        }
        if (num_sys_x == "roman" & num_sys_y == "arab" || num_sys_x == "arab" & num_sys_y == "roman") throw new Exception("Разные системы счисления");
        if (num_sys_x == "roman" & num_sys_y == "roman" || num_sys_x == "arab" & num_sys_y == "arab") {
            return num_sys_x;
        } else if (num_sys_x != "roman" || num_sys_x != "arab") throw new Exception("Число меньше 1 или больше 10!"){};
        return null;
    }
                                            // Вычисления Римской системы счислений
    static String roman_int_sys (String x, String y, String z) throws Exception {
        String[] roman_nums = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
        int num_x = roman_to_arab(x);
        int num_y = roman_to_arab(y);
        int result = switch (z) {
            case "+" -> num_x + num_y;
            case "-" -> num_x - num_y;
            case "*" -> num_x * num_y;
            case "/" -> num_x / num_y;
            default -> 0;
        };
        if(result < 1) throw new Exception("Невозможный нулевой или отрицательный результат"){};
        if(result > 20) throw new Exception("Итоговое значение больше 20!"){};
        return roman_nums[result];
    }
                                            // Вычисление Арабской системы счислений
    static String arab_int_sys (String x, String y, String z){
        int num_x = Integer.parseInt(x);
        int num_y = Integer.parseInt(y);
        int result = switch (z) {
            case "+" -> num_x + num_y;
            case "-" -> num_x - num_y;
            case "*" -> num_x * num_y;
            case "/" -> num_x / num_y;
            default -> 0;
        };
        return Integer.toString(result);
    }
                                            // Конвертация Римских чисел в Арабские
    static int roman_to_arab( String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);

        int end_char = num.length() - 1;
        char[] arr = num.toCharArray();
        int arab;
        int result = map.get(arr[end_char]);
        for (int i = end_char - 1; i >= 0; i--) {
            arab = map.get(arr[i]);
            if (arab < map.get(arr[i + 1])) {
                result -= arab;
            } else {
                result += arab;
            }
        }
        return result;
    }
}