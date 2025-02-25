public class Employee {
    private String id;
    private String name;
    private int salary;

    // إنشاء موظف جديد مع تحديد الراتب
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //  Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // حساب الراتب السنوي
    public int getAnnualSalary() {
        return salary * 12;
    }

    //  تزيد الراتب بنسبة معينة
    public int raiseSalary(int percent) {
        salary += salary * percent / 100; // زيادة النسبة المحددة
        return salary;
    }
}
