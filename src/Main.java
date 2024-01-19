import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
                                            // Основной класс
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input = str.next();
        System.out.println(calc(input));
    }
                                            //Класс калькулятора
    public static String calc(String input){
        int x = Integer.parseInt(DivisionLine(input,0));
        int y = Integer.parseInt(DivisionLine(input,1));;
        String oper = SearchOper(input);
        int res = 0;
        switch (oper) {
            case "+" -> res = x + y;
            case "-" -> res = x - y;
            case "/" -> res = x / y;
            case "*" -> res = x * y;
        }
        return Integer.toString(res);
    }
    static String SearchOper(String input){
        String oper = "";
            if(input.indexOf( '+' )>0){
                oper = "+";
            }else if(input.indexOf( '-' )>0){
                oper = "-";
            }else if(input.indexOf( '/' )>0){
                oper = "/";
            }else if(input.indexOf( '*' )>0){
                oper = "*";
            }else{
                System.out.println("Неверная операция!");
            }
        return oper;
    }
                                            //Деление строки
    static String DivisionLine(String str, int index){
        String[] ind = {};
        String numbers = "0";
        if(str.indexOf( '+' )>0){
            ind = str.split( "[+]");
            if (NumElem(ind)){
                numbers = ind[index];
            }else{
                System.out.println("Больше 2-х элементов!");
            }
        }else if(str.indexOf( '-' )>0){
            ind = str.split( "[-]");
            if (NumElem(ind)){
                numbers = ind[index];
            }else{
                System.out.println("Больше 2-х элементов!");
            }
        }else if(str.indexOf( '/' )>0){
            ind = str.split( "[/]");
            if (NumElem(ind)){
                numbers = ind[index];
            }else{
                System.out.println("Больше 2-х элементов!");
            }
        }else if(str.indexOf( '*' )>0){
            ind = str.split( "[*]");
            if (NumElem(ind)){
                numbers = ind[index];
            }else{
                System.out.println("Больше 2-х элементов!");
            }
        }else{
            System.out.println("Неверная операция!");
        }
        return numbers;
    }
                                            //Проверка кол-ва цифр
    static boolean NumElem (String[] x){
        boolean log;
        if (x.length > 2){
            log = false;
        }else {
            log = true;
        }
        return log;
    }

                                            //Проверка типа
    static String ArabOrRoman(String str){
        String[] Roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] Arab = {"1","2","3","4","5","6","7","8","9","10"};
        return str;
    }

                                            //Проверка кол-ва чисел
    static boolean Numbers(String input){
        if (input.length() > 2){
            return false;
        }else{
            return true;
        }
    }
                                            //Подсчет с использованием Римских цифр
    static int RomanInt(String input){
        String[] Roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        return 0;
    }
}