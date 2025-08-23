

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account no:\n ");
        int accountNo = sc.nextInt();

        System.out.print("Balance at the beginning of the month: \n");
        int beginningBalance = sc.nextInt();

        System.out.print("Total of all items charged by the customer this month: \n");
        int totalCharges = sc.nextInt();

        System.out.print("Total of all credits applied to the customer’s account this month: \n");
        int totalCredits = sc.nextInt();

        System.out.print("Allowed credit limit:\n ");
        int creditLimit = sc.nextInt();

        Customer c1 = new Customer(accountNo, beginningBalance, totalCharges, totalCredits, creditLimit);
        c1.checkCreditLimit();

        
    }
}
