package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Account account = new Account.Builder(1534).withBalance(634).withOwner("hola").build();
        account.show();
    }
}
