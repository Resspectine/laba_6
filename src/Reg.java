import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("\\+?((375(29|44|33|25))|(8017))\\d{7}");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static void main(String[] args) throws IOException {
        File a = new File("C:\\Users\\User\\IdeaProjects\\laba_6\\input.txt");
        FileReader fileRead = new FileReader(a);
        BufferedReader bufferTelephone = new BufferedReader(fileRead);
        String buffer;
        buffer=bufferTelephone.readLine();
        int N=Integer.valueOf(buffer);
        String[] telephoneNumbers = new String[N];
        for(int i =0;i<N;i++)
        {
            buffer=bufferTelephone.readLine();
            telephoneNumbers[i]=buffer;
        }
        for(int i =0;i<N;i++)
            System.out.println(telephoneNumbers[i]+" "+checkWithRegExp(telephoneNumbers[i]));
    }
}
