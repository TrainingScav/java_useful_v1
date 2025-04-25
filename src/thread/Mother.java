package thread;

public class Mother extends Thread {

    // 계좌 정보
    BankAccount bankAccount;

    public Mother(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // 계좌에 출금 요청 --> 0.5초 걸림
        bankAccount.withdraw(5_000);

    }
}
