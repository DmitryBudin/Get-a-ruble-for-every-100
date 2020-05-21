
public class Main {
    public static void main(String[] args) {

        int account = 200;
        int refill = 999;
        int step = 100;
        int bonus = refill / step;
        int limit = 1001;
        if (refill < limit) {
            bonus = 0;
        }
        int totalAccount = account + refill + bonus;
        System.out.println(totalAccount);
        System.out.println(bonus);
    }


}