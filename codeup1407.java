import java.util.Scanner;

public class codeup1407 {
    /**
     * 1407 : 문자열 출력하기 1
     * 2020. 01. 05.
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         * 길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.
         *
         * 입력
         * 문자열이 입력된다.(글자 수는 100글자 이하이고, 알파벳 대소문자와 공백 문자만 입력된다.)
         *
         * 출력
         * 공백을 제거한 후 출력한다.
         */
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        s = s.replaceAll(" ", "");
        System.out.println(s);

        /**
         * trim, replace만으로 삭제되지 않는 공백이 존재
         *
         * < 상기 코드로 삭제되지 않는 이유는.. cjk 문자셋에서 나타나는 IDEOGRAPHIC SPACE 라 불리는 유니코드 \u3000 , HTML 표현으로는 &#12288; 문자로 폰트 지원이 없으면 눈에 보이지 않는(display 되지 않는) 코드로만 존재하는 공백이기 때문.

         * 출처: https://parkdex.tistory.com/3 [PARKDEX]
         * s.replaceAll("\\p{Z}","") :
         * s 문자열에서 정규식 1칸의 공백을 -> 0칸의 공백으로 바꿈
         *
         * s.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "") :
         * s 문자열에서 정규식 1칸의 좌, 우 끝의 공백을 -> 0칸의 공백으로 바꿈
         *
         */

    }
    }