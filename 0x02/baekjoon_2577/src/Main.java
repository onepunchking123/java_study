import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        String s;
        int[] result = new int[10];

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        s = Integer.toString(num1*num2*num3);
        //System.out.println(s);

        for(int i=0; i<s.length();i++)
        {
            int idx = s.charAt(i) -48 ;
            result[idx]++;
        }

        for(int i=0; i< result.length;i++)
        {
            System.out.println(result[i]);
        }

    }
}
