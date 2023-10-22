import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Membuat tiga objek akun
        Account account1 = new Account("Aliffia_SI4601", "102022380419", 100000.0);
        Account account2 = new Account("Jamal", "2022380420", 200000.0);
        Account account3 = new Account("Karina", "2022380421", 300000.0);
        

        // Menambahkan akun ke dalam bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Menampilkan daftar semua akun dalam bank menggunakan perulangan for
        List<Account> allAccounts = bank.getAllAccounts();
        for (Account account : allAccounts) {
            System.out.println("Saldo Akun " + account.getName() + ": " +  account.getBalance());
        }

        // Menarik dan menyetor saldo
        account1.deposit(50000.0);
        account3.withdraw(120000.0);
        
        // Menampilkan akun setelah deposit dan withdraw
        System.out.println("\n");
        System.out.println("Saldo Akun " + account1.getName() + " setelah menyetor: " + account1.getBalance());
        System.out.println("Saldo Akun " + account3.getName() + " setelah menarik uang: " + account3.getBalance());
        System.out.println("\n");

        // Menghapus akun
        String nameAccount = "Jamal";
        bank.removeAccount(nameAccount);

        // Menampilkan daftar semua akun setelah menghapus akun
        allAccounts = bank.getAllAccounts();
        System.out.println("\nDaftar Semua Akun dalam Bank:");
        for (Account account : allAccounts) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }    
    }
}
