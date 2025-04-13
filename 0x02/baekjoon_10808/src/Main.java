import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s;
        s= sc.nextLine();
        int[] result = new int[26];

        for(int i=0;i<s.length();i++)
        {
            int idx = s.charAt(i)-97;
            result[idx]++;
        }

        for(int i=0; i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }


    }

}
