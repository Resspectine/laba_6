import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Reg {
    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("\\+?[375,801]");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество номеров: ");
        input = sc.nextLine();
        String [] telephoneNumbers=new String[Integer.valueOf(input)];
        input = sc.nextLine();
        telephoneNumbers[0]=input;

    }
}
