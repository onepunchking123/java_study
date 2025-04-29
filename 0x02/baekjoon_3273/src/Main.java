import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int BinarySearch(int[] arr, int target){

        //배열을 임시 복사 -> 배열 복사를 해두고 복사를 해 둔 것에서 정렬해서 이진탐색 결과를 리턴하고 싶어서 -> 메모리 제한 나서 미리 정렬하고 배열을 입력받음
        /*
        int[] arr = Arrays.copyOf(origin, origin.length);
        Arrays.sort(arr);
        */

        int left = 0;
        int right = arr.length-1;

        while(left <= right)
        {
            int mid = (left +right)/2;
            if(target == arr[mid])
                return 1;
            else if(target > arr[mid])
                left = mid +1;
            else
                right = mid-1;
        }
        //여기에서 도달한거면 데이터를 못찾았다는 의미
        return 0;
    }

    public static void main(String[] args) throws IOException {


        // 입력, 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //1. 첫 번째 수열 크기를 입력받고 수열 크기만큼 수열 값을 담을 배열을 선언
        int size = Integer.parseInt(br.readLine());
        int[] array = new int[size];


        //2. 수열을 배열에 담기
        String value = br.readLine();
        StringTokenizer st = new StringTokenizer(value);
        int i=0;
        while(st.hasMoreTokens()){
            array[i]=Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(array);
        int sum  = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 여기서 이진 탐색을 이용해보자...
        /*
        target-현재 배열값 = 현재 배열값의 짝꿍
         */
        for(int k=0 ;k<array.length;k++)
        {
            int num1 = array[k];
            int target = sum-num1;
            if(target == num1)
                continue;
            else
                cnt += BinarySearch(array, target);
        }

        System.out.println(cnt/2);

        bw.flush();
        bw.close();
        br.close();
    }
}
