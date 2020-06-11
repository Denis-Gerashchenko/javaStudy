public class Testbalance {
    public static void main(String[] args) {
        Account acc1 = new Account(1, "Jacob Taylor", 500);
        Account acc2 = new Account(1, "Melissa Taylor", 1500);
        acc1.credit(500);
        acc1.transferTo(acc2,1000);
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
    }
}