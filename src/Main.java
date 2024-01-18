import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
                                            // Основной класс
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input = (str.next()).toUpperCase();
        DivisionLine(input);
        int sum = Integer.parseInt(calc(input));
    }
                                            //Класс каолькулятора
    public static String calc(String input){

        int sum = 0;
        return String.valueOf(sum);

    }
                                            //Диление строки
    static String[] DivisionLine(String str){
        String[] numbers = {};
        if(str.indexOf( '+' )>0){
            numbers = str.split( "[+]" );
        }else if(str.indexOf( '-' )>0){
            numbers = str.split( "[-]" );
        }else if(str.indexOf( '/' )>0){
            numbers = str.split( "[/]" );
        }else if(str.indexOf( '*' )>0){
            numbers = str.split( "[*]" );
        }else{
            System.out.println("Неверная операция!");
        }
        System.out.println(Arrays.toString(numbers));
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
    }


}



/*
Scanner in = new Scanner( System.in);
String str = in.next();
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