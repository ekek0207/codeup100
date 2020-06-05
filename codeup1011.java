import java.util.Scanner;

public class codeup1011 {
    /**
     * 1011 : [기초-입출력] 문자 1개 입력받아 그대로 출력하기(설명)
     * 2019. 12. 15
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         * 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
         * 변수에 저장되어 있는 문자를 그대로 출력해보자.
         *
         * 참고
         * char x;
         * scanf("%c", &x);
         * printf("%c", x);
         *
         * 와 같은 방법으로 가능하다.
         */

        char a;
        Scanner scan = new Scanner(System.in);
        a = scan.next().charAt(0);
        System.out.println(a);

    }
}
