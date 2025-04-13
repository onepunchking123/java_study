import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];

        String num  = sc.nextLine();

        //인덱스에 필요한 카드 수 저장하기
        for(int i=0; i<num.length();i++)
        {
            //문자를 인트값으로 저장하기 위해서 -'0' -> 자동 형 변환 이용
            int tmp = num.charAt(i)-'0';
            if(tmp ==6 || tmp ==9)
            {
                arr[tmp]+=0.5;
            }
            else
            {
                arr[tmp]+=1.0;
            }
        }

        /*
        for(int i= 0 ; i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        */

        int max_index=0, max_value=0;

        for(int i=0;i< arr.length;i++)
        {
            if(max_value<arr[i])
            {
                //반올림 해서 항상 저장
                max_index = i;
                max_value = (int)Math.round(arr[i]);
            }
        }

        if(max_index ==6 || max_index ==9)
        {
            max_value = (int)Math.round(arr[6]+arr[9]);
        }
        else
        {
            max_value = (int)arr[max_index];
        }
        // System.out.println(max_index);
        System.out.println(max_value);



    }
}
