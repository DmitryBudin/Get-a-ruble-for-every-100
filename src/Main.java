public class Main {
    public static void main(String[] args) {

        int account = 200;
        int refill = 1500;
        int step = 100;
        int bonus = refill / step;
        int limit = 1001;
        int totalAccount = account + refill + bonus;
        if (refill < limit) {
            bonus = 0;
        }
        System.out.println(account + refill + bonus);
        System.out.println(bonus);
    }


}

