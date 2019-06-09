package basic;

public class SwitchCase {
    public static void main(String[]args) {
        int age= 1;
        switch (age) {
            case 2:
            System.out.println("you can talk");
            break;
            case 1:
                System.out.println("you can crawl");
                break;
            case 3:
                System.out.println("you can read");
                break;
                default:
                    System.out.println("you can not do anything yet");
        }
    }
}
