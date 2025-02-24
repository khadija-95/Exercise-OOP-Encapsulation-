public class Account {

    private String id;
    private String name;
    private int balance = 0;

    //  انشاء حساب جديد باستخدام ID والاسم
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //إنشاء حساب مع تحديد الرصيد
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //  Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //  تضيف مبلغ إلى الرصيد
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // تسحب مبلغ من الرصيد إذا متوفر
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
        return balance;
    }

    // التحويل إلى حساب آخر إذا كان الرصيد يكفي
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount); // سحب المبلغ من الحساب الحالي
            another.credit(amount); // إيداع المبلغ في الحساب المستلم
        } else {
            System.out.println("Transfer failed: Insufficient funds!");
        }
        return balance;
    }
}
