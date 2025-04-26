abstract class Account{
    private int accNo;
    private double balance;
    Account(int accNo , double balance){
        this.accNo = accNo;
        this.balance = balance;
    }
    abstract public void deposit(double amounnt);
    abstract public void withdrawal(double amounnt);
    public void setAccNo(int accNo){
        this.accNo = accNo;
    }
    public int getAccNo(){
        return accNo;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    @Override
    public String toString(){
        return "Account Number: "+this.accNo+" Balance: "+this.balance;
    }
}
class SavingAcoount extends Account{
    double interestRate;
    SavingAcoount(int accNo , double balance , double interestRate){
        super(accNo, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount){
        double interest = amount*(interestRate/100);
        double newBalance = getBalance()+amount+interest;
        setBalance(newBalance);
        System.out.println("Deposited: "+amount+" Added Interest : "+interest);
    }
    @Override
    public void withdrawal(double amounnt){
        if(getBalance()>=amounnt){
            setBalance(getBalance()-amounnt);
            System.out.println("Withdrawl Amount: "+amounnt);
            System.out.println("Remaining Balance: "+getBalance());
        }
        else{
            System.out.println("Insufficient Balance for withdrawl");
        }
    }
}
class CurrentAccount extends Account{
    private double overDraftLimit;
    CurrentAccount(int accNo , double balance , double overDraftLimit){
        super(accNo, balance);
        this.overDraftLimit = overDraftLimit;
    }
    @Override
    public void deposit(double amount){
        double newBalance = getBalance()+amount;
        setBalance(newBalance);
        System.out.println("Deposited: "+amount);
    }
    @Override
    public void withdrawal(double amounnt){
        if(getBalance()+overDraftLimit>=amounnt){
            setBalance(getBalance()-amounnt);
            System.out.println("Withdrawl Amount: "+amounnt);
            System.out.println("Remaining Balance: "+getBalance());
        }
        else{
            System.out.println("Insufficient Balance for withdrawl");
        }
    }
}
public class A1_Q8 {
    public static void main(String[] args) {
        SavingAcoount s1 = new SavingAcoount(123456789, 100000, 10);
        s1.deposit(80000);
        System.out.println(s1);
        s1.withdrawal(20000);
        System.out.println(s1);
        CurrentAccount c1 = new CurrentAccount(987654321, 200000, 1000);
        c1.deposit(100000);
        System.out.println(c1);
        c1.withdrawal(200000);
        System.out.println(c1);
        c1.withdrawal(1000000);
        System.out.println(c1);
    }
}
