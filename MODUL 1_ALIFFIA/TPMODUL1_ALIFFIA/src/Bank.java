import java.util.ArrayList;
import java.util.List;

public class Bank {
    // atribut list untuk menampung akun
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // method untuk menambahkan akun ke bank
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // method untuk menghapus akun dari bank sesuai nama
    public void removeAccount(String name) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getName() == name) {
                accounts.remove(i);
                System.out.println("Akun " + name + " Berhasil Dihapus!");
                break;
            }
        }
    }

    // method untuk mendapatkan semua akun dalam bank
    public List<Account> getAllAccounts() {
        return accounts;
    }
}

