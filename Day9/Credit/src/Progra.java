import java.util.Scanner;

class Customer {
    private int accountNo;
    private int beginningBalance;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;

    // Constructor
    public Customer(int accountNo, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
        this.accountNo = accountNo;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    // Method to calculate and check balance
    public void checkCreditLimit() {
        int newBalance = beginningBalance + totalCharges - totalCredits;
        System.out.println("New Balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded!");
        } else {
            System.out.println("Within credit limit.");
        }
    }

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
}

public class Progra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account no: ");
        int accountNo = sc.nextInt();

        System.out.print("Balance at the beginning of the month: ");
        int beginningBalance = sc.nextInt();

        System.out.print("Total of all items charged by the customer this month: ");
        int totalCharges = sc.nextInt();

        System.out.print("Total of all credits applied to the customer’s account this month: ");
        int totalCredits = sc.nextInt();

        System.out.print("Allowed credit limit: ");
        int creditLimit = sc.nextInt();

        Customer c1 = new Customer(accountNo, beginningBalance, totalCharges, totalCredits, creditLimit);
        c1.checkCreditLimit();

        sc.close();
    }
}
