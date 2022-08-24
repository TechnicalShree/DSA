package ExtraOrdinary;

public class TwosTable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int num = j * i;
                if (num / 10 == 0) {
                    System.out.print(num + "  ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
