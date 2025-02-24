//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("A101", "Mohammed", 500);
        Account acc2 = new Account("A102", "Ahmed", 1000);

        //عرض معلومات الحسابات
        System.out.println("Account 1: ID = " + acc1.getID() + ", Name = " + acc1.getName() + ", Balance = " + acc1.getBalance());
        System.out.println("Account 2: ID = " + acc2.getID() + ", Name = " + acc2.getName() + ", Balance = " + acc2.getBalance());

        // تنفيذ العمليات على الحساب الأول
        acc1.credit(200); // إيداع 200
        acc1.debit(100);  // سحب 100
        acc1.transferTo(acc2, 300); // تحويل 300 إلى الحساب الثاني

        //عرض المعلومات بعد العمليات
        System.out.println("\nAfter financial transactions:");
        System.out.println("Account 1: ID = " + acc1.getID() + ", Name = " + acc1.getName() + ", Balance = " + acc1.getBalance());
        System.out.println("Account 2: ID = " + acc2.getID() + ", Name = " + acc2.getName() + ", Balance = " + acc2.getBalance());

        // موظف جديد
        Employee emp1 = new Employee("E1001", "Khaled", 5000);
        System.out.println("\nEmployee: ID = " + emp1.getID() + ", Name = " + emp1.getName() + ", Salary = " + emp1.getSalary());

        // حساب الراتب السنوي
        System.out.println("Annual Salary: " + emp1.getAnnualSalary());

        // زيادة الراتب بنسبة 10%
        emp1.raiseSalary(10);
        System.out.println("After 10% raise: New Salary = " + emp1.getSalary());
    }
}