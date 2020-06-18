import java.util.Scanner;

public class codeup1156 {
    /**
     * 1156 : 홀수 짝수 구별
     * 2019. 12. 15
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         * 용준이와 봉찬이는 짤짤이로 내기를 하였다.
         * 만약 홀수개의 돌을 쥐게 되면 용준이가 이기게 되고, 짝수개의 돌을 쥐게 되면 봉찬이가 이기는 것으로 룰을 정하였다.
         * 어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.
         * 자연수 하나가 입력된다.
         */

        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        //int a = Integer.parseInt(scan.next());

        if(Integer.parseInt(a)%2==0)
            System.out.println("even");
        else
            System.out.println("odd");

    }
}
