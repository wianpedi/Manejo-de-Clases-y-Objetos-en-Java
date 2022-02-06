public class BankAccount {
    /*
    creamos las variables de la clase BankAccount y los metodos getter and setter
     */
    private int accountNumber;
    protected boolean activated;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}

