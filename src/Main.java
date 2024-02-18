import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        String[] arr = new String[2];
        arr = a.split("\\.");

        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[0]);


        System.out.println(b +"." +c);

    }
}
