import java.util.Scanner;

public class codeup1014 {
    /**
     * 1014 : [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)
     * 2019. 12. 18
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.

         참고
         char x, y;
         scanf("%c %c", &x, &y);
         printf("%c %c", y, x); //출력되는 순서를 작성
         와 같은 방법으로 해결할 수 있다.
         */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
//        String sa = String.valueOf(a);
//        String sb = String.valueOf(b);
        //a = Float.parseFloat(scan.next());
        System.out.println(b+" "+a);
        scan.close();

    }
}