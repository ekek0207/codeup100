import java.util.Scanner;

public class codeup1012 {
    /**
     * 1012 : [기초-입출력] 실수 1개 입력받아 그대로 출력하기(설명)
     * 2019. 12. 15
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         * 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
         * 저장되어 있는 실수값을 출력해보자.
         *
         * 참고
         * float x;
         * scanf("%f", &x);
         * printf("%f", x);
         * 와 같은 방법으로 가능하다.
         */
    /**
     * + 필요한 개념
     *
     * String.format("%.6f", number);
     *
     * --> 소수점 6자리 까지 출력해준다 예를들어 1.554의 값이 입력 되더라도 1.554000 까지 출력된다.
     * 예를들어 ("%04d") 라고 했을때
     * % -  명령의시작
     *  0 - 채워질 문자
     *  4 - 총 자리수
     *  d - 십진정수, f 부동소수점, x 16진수, c 문자이 있다.
     */
        Scanner scan = new Scanner(System.in);
        //a = scan.nextFloat();

        Float a = scan.nextFloat();
        String s = String.format("%.6f", a);
        //a = Float.parseFloat(scan.next());
        System.out.println(s);
/**
        a = (float)scan.nextFloat();
 */
        scan.close();

    }
}