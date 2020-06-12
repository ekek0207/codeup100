import java.util.Scanner;

public class codeup1015 {
    /**
     * 1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)
     * 2019. 12. 22
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         실수(float) 1개를 입력받아 저장한 후,
         저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
         소수점 이하 둘 째 자리까지 출력하시오.

         참고
         %.3f 와 같은 형식으로 지정하면,
         소수점 이하 넷 째 자리에서 반올림하여 소수점 이하 셋 째 자리까지 출력하라는 의미이다.
         */
        Scanner scan = new Scanner(System.in);
        Float a = scan.nextFloat();
//        String sa = String.valueOf(a);
        //a = Float.parseFloat(scan.next());
        System.out.println(String.format("%.2f",Math.round(a*100)/100.0));
        //System.out.println(String.format("%.2f", a)); <- 같은 결과값.
        //String.format() 함수를 활용하면 Math.round() 함수와 같이 소수점 n번째 자리까지 반올림하여 나타냄.

        /**
         * 앞서 소개한 메서드들은 실수를 소수점 n번째까지 잘라서 표현한다는 공통점이 있습니다. 하지만 두개의 메서드가 꼭 같은 결과값을 출력하지는 않습니다. 한가지 차이점이 있는데요.
         * Math.round()함수는 소수점아래가 0일경우 절삭
         * String.format은 절삭하지 않고 그대로 리턴(해당 자리수까지)
         */
        scan.close();

    }
}