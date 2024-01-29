import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
                                            // Основной класс
    public static void main(String[] args) throws Exception {
        Scanner str = new Scanner(System.in);
        String input = str.next();
        System.out.println("Итог: " + calc(input));
    }
                                            //Класс калькулятора
    public static String calc(String input) throws Exception {
        String oper = SearchOper(input);
        String x = DivisionLine(input,0);
        String y = DivisionLine(input,1);
        System.out.println();
        int result = 0;
        return Integer.toString(result);
    }
                                            //Проверка выражения и получение операнда
    static String SearchOper(String input) throws Exception {
        String oper = "";
        String[] opers = input.split("[+\\-*/]");
        if (opers.length != 2) throw new Exception("Более двух чисел!");
        if(input.indexOf( '+' )>0){
            oper = "+";
        }else if(input.indexOf( '-' )>0){
            oper = "-";
        }else if(input.indexOf( '/' )>0){
            oper = "/";
        }else if(input.indexOf( '*' )>0) {
            oper = "*";
        }else {
            oper = null;
        }
        if(oper == null) throw new Exception("Неверная операция!");
        return oper;
    }
                                            //Получение чисел
    static String DivisionLine(String str, int index){
        String[] ind = {};
        String numbers = "0";
        if(str.indexOf( '+' )>0){
            ind = str.split( "[+]");
            numbers = ind[index];
        }else if(str.indexOf( '-' )>0){
            ind = str.split( "[-]");
            numbers = ind[index];
        }else if(str.indexOf( '/' )>0){
            ind = str.split( "[/]");
            numbers = ind[index];
        }else if(str.indexOf( '*' )>0) {
            ind = str.split("[*]");
            numbers = ind[index];
        }
        return numbers;
    }
}