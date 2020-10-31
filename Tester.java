public class Tester {
    public static void main(String[] args) {
        boolean allGood = true;
        BankAccount x = new BankAccount(123456789, "password123");

        allGood = check("x.toString()", x.toString(), "123456789\t0.0");
        allGood = check("x.deposit(30)", x.deposit(30), true);
        allGood = check("x.getBalance()", x.getBalance(), 30.0);
        allGood = check("x.toString()", x.toString(), "123456789\t30.0");
        allGood = check("x.getAccountID", x.getAccountID(), 123456789);
        allGood = check("x.deposit(-31)", x.deposit(-31), false);
        allGood = check("x.withdraw(20)", x.withdraw(20), true);
        allGood = check("x.withdraw(-2)", x.withdraw(-2), false);
        allGood = check("x.withhdraw(100)", x.withdraw(100), false);
        allGood = check("x.getBalance()", x.getBalance(), 10.0);
        
        // There's no way to check the password, so I'll use a try/catch to
        // see if it fails somehow.
        try {
            x.setPassword("new!");
        } catch (Exception e) {
            allGood = false;
            System.out.println("Failure on account.setPassword: Crashed.");
        }

        if (allGood) System.out.println("no error");
    }

    public static boolean check(String name, String actual, String expected) {
        if (actual.equals(expected)) return true;
        else {
            System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
            return false;
        }
    }

    public static boolean check(String name, double actual, double expected) {
        if (actual == expected) return true;
        else {
            System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
            return false;
        }
    }

    public static boolean check(String name, int actual, int expected) {
        if (actual == expected) return true;
        else {
            System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
            return false;
        }
    }

    public static boolean check(String name, boolean actual, boolean expected) {
        if (actual == expected) return true;
        else {
            System.out.println("Failure on " + name + ": Expected \"" + expected + "\", got \"" + actual + "\".");
            return false;
        }
    }
}
