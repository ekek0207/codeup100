
import java.util.Scanner;

public class codeup1019 {
    /**
     * 1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
     * 2019. 12. 22
     * sjh
     * **/
    public static void main(String arg[]) {

        /**
         년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
         연, 월, 일이 ".(닷)"으로 구분되어 입력된다.

         입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
         (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
         */
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        System.out.print(time);

//        String sa = String.valueOf(a);
        //System.out.println(a+" "+a+" "+a);
    }
}