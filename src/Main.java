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
                                            //Класс каолькулятора
    public static String calc(String input){
        String x = "";
        String y = "";
        String oper = SearchOper(input);
        String res = "";
        return x;
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
    static String DivisionLine(String str){
        String numbers ="";
        if(str.indexOf( '+' )>0){
            numbers = Arrays.toString(str.split( "[+]"));
        }else if(str.indexOf( '-' )>0){
            numbers = Arrays.toString(str.split( "[-]"));
        }else if(str.indexOf( '/' )>0){
            numbers = Arrays.toString(str.split( "[/]"));
        }else if(str.indexOf( '*' )>0){
            numbers = Arrays.toString(str.split( "[*]"));
        }else{
            System.out.println("Неверная операция!");
        }
        return numbers;
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



/*
if(str.indexOf( '+' )>0){
numbers = str.split( "[+]" );
            if(numbers.length > 2){
        System.out.println("Значений больше 2!");
            }else {
result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            }
                    }else if(str.indexOf( '-' )>0){
numbers = str.split( "[-]" );
result = Integer.parseInt( numbers[0] ) - Integer.parseInt( numbers[1] );
        }else if(str.indexOf( '/' )>0){
numbers = str.split( "[/]" );
result = Integer.parseInt( numbers[0] ) / Integer.parseInt( numbers[1] );
        }else if(str.indexOf( '*' )>0){
numbers = str.split( "[*]" );
result = Integer.parseInt( numbers[0] ) * Integer.parseInt( numbers[1] );
        }else{
                System.out.println("Неверная операция!");
        }

 */