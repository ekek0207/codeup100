import java.util.Scanner;

public class codeup1013 {
    /**
     * 1013 : [기초-입출력] 정수 2개 입력받아 그대로 출력하기(설명)
     * 2019. 12. 18
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         * 정수(int) 2개를 입력받아 그대로 출력해보자.
         참고
         int a, b;
         scanf("%d%d", &a, &b);  //엔터/공백으로 입력 데이터가 구분되어 입력
         printf("%d %d", a, b);

         와 같은 방법으로 가능하다.
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        //a = Float.parseFloat(scan.next());
        System.out.println(a+" "+b);
        scan.close();

    }
}