package Day01;

public class RSC {
    public static void main(String[] args) {
        Player player01;
        Player player02;
        int a=1;

        player01 = new Player();
        player02 = new Player();

        player01.Player = "player01";
        player02.Player = "player02";

        // 1은 가위, 2는 바위, 3은 보
        while (a==1) {
            player01.RSC = (int) (Math.random() * 3) + 1;
            player02.RSC = (int) (Math.random() * 3) + 1;

            System.out.println("player01의 선택 : " + player01.RSC);
            System.out.println("player02의 선택 : " + player02.RSC);

            if (player01.RSC == 1) {
                if (player02.RSC == 2) {
                    System.out.println("player02 win!");
                    a=0;
                } else if (player02.RSC == 3) {
                    System.out.println("player01 win!");
                    a=0;
                } else
                    System.out.println("무승부");
            } else if (player01.RSC == 2) {
                if (player02.RSC == 3) {
                    System.out.println("player02 win!");
                    a=0;
                } else if (player02.RSC == 1) {
                    System.out.println("player01 win!");
                    a=0;
                } else
                    System.out.println("무승부");
            } else if (player01.RSC == 3) {
                if (player02.RSC == 1) {
                    System.out.println("player02 win!");
                    a=0;
                } else if (player02.RSC == 2) {
                    System.out.println("player01 win!");
                    a=0;
                } else
                    System.out.println("무승부");
            }

        }
    }
}