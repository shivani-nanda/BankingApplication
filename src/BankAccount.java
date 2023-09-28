public class BankAccount {
    private int balance = 0;
    private String name;

    BankAccount(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void checkBalance(){
        System.out.println("This is your balance " + name + ": " + balance);
    }
    public void withdraw(int amount){
        if(balance - amount >= 0) {
            balance -= amount;
        }
        else{
            System.out.println("Not enough funds");
        }
    }
    public void deposit(int amount){
        balance+=amount;
    }

}
