// import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * Types of bank accounts.
     */
    public enum BankAccountType {
        /** Checking account. */
        CHECKING,
        /** Savings account. */
        SAVINGS,
        /** Student account. */
        STUDENT,
        /** Work account. */
        WORKPLACE
    }

    /** Account number. */
    private int accountNumber;
    /** Type of bank account. */
    private BankAccountType accountType;
    /** Current balance. */
    private double accountBalance;
    /** Name of account owner. */
    private String ownerName;
    /** Interest rate. */
    public double interestRate;
    /** Interest earned. */
    private double interestEarned;
    /** Number of accounts created. */
    private static int number = 0;

    /**
     * Creates a new bank account.
     *
     * @param name name of the account owner
     * @param accountCategory type of account being created
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountNumber = number++;
        ownerName = name;
        accountType = accountCategory;
        accountBalance = 0;
        interestRate = 0;
        interestEarned = 0;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public static int getNumber() {
        return number;
    }
}
