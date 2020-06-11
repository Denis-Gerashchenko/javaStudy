public class Account {
    private String name;
    private int id;
    private double balance;

    Account(int id, String name){
        this.id = id;
        this.name = name;
    }

    Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(int amount){
        this.balance += amount;
        return balance;
    }

    public double debit(int amount){
        if (balance >= amount){
            balance -= amount;
        }
        else {
            System.out.println("amount exceeded");
        }
        return balance;
    }
    public double transferTo(Account another, int amount){
        if (balance >= amount){
            balance -= amount;
            another.balance += amount;
        }
        else {
            System.out.println("amount exceeded");
        }
        return balance;
    }
    public String toString() {
        return "[ " + name + " balance: " + balance + "]";
    }
}
