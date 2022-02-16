package com.company;

import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class boj18258 {
    //2022.02.16
    //https://www.acmicpc.net/problem/18258

    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer( ) ;
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in )) ;

        int n = Integer.parseInt( br.readLine() ) ;
        int back = 0 ;
        Queue<Integer> queue = new LinkedList<>() ;
        //왜 stack은 stack<>() 가 되는데 큐는 안되는지 ?

        /**
         * push X: 정수 X를 큐에 넣는 연산이다.
         * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         * size: 큐에 들어있는 정수의 개수를 출력한다.
         * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
         * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         * **/

        for (int i = 0 ; i < n ; i ++ ) {
            StringTokenizer st = new StringTokenizer( br.readLine(), " " ) ;
                //String s = st.nextToken();
                switch ( st.nextToken() ) {
                    case "push": {
                        int a = Integer.parseInt(st.nextToken());
                        queue.offer(a);
                        //queue.add(a);
                        back = a;
                        break;
                    }
                    case "pop": {
                        if (queue.isEmpty()) {
                            sb.append(-1).append("\n");
                        } else {
                            sb.append(queue.poll()).append("\n");
                        }
                        break;
                    }
                    case "size": {
                        sb.append(queue.size()).append("\n");
                        break;
                    }
                    case "empty": {
                        if (queue.isEmpty()) {
                            sb.append(1).append("\n");
                        } else {
                            sb.append(0).append("\n");
                        }
                        break;
                    }
                    case "front": {
                        if (queue.isEmpty()) {
                            sb.append(-1).append("\n");
                        } else {
                            sb.append(queue.peek()).append("\n");
                        }
                        break;
                    }
                    case "back": {
                        if (queue.isEmpty()) {
                            sb.append(-1).append("\n");
                        } else {
                            sb.append(back).append("\n");
                        }
                        break;

                    }
                    default :
                        break;
                }
            //System.out.println(sb);

        }
        System.out.println(sb);
    }
}


