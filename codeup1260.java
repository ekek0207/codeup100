import java.util.Scanner;

public class codeup1260 {
    /**
     * 1017 : [기초-입출력] 정수 1개 입력받아 3번 출력하기(설명)
     * 2019. 12. 22
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         * int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
         참고
         printf("%d %d %d", a, a, a);
         와 같은 방법으로 출력할 수 있다.

         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
//        String sa = String.valueOf(a);
        //a = Float.parseFloat(scan.next());
        //System.out.println(String.format("%.2f", a)); <- 같은 결과값.
        System.out.println(a+" "+a+" "+a);
        scan.close();

    }
}