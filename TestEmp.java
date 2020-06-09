public class TestEmp {  // Save as "TestCircle.java"
    public static void main(String[] args) {
        Employe emp1 = new Employe(1, "Sail", "Bro", 1000);
        emp1.raiseSalary(10);
        System.out.println(emp1.toString());
    }
}