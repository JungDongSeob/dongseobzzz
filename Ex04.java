package Day01;

import javax.print.DocFlavor;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        int []RSC={1,2,3};
        Random rand = new Random();
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.
        Player player01 = null;
        Player player02 = null;
        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        player01.RSC = RSC[rand.nextInt(3)];

        //player01 = RSC[rand.nextInt(3)];
        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        
        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복


    }
}
