package Day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++)
                System.out.print("*");
            System.out.println();
        }
        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */
        int k=1,m=4;
        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < m; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {

                System.out.print("*");
            }
            k+=2;
            m--;
            System.out.println();
        }
    }
}
