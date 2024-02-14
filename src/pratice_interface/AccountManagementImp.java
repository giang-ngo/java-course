package pratice_interface;

import java.util.ArrayList;

public class AccountManagementImp implements AccountManagement {
    private ArrayList<Account> accounts;

    public AccountManagementImp(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean signup(Account account) {
        if (!isExist(account)) {
            accounts.add(account);
            return true;
        }
        return false;
    }

    private boolean isExist(Account account) {
        for (var acc : accounts) {
            if (acc.getUsername().compareTo(account.getUsername()) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(Account account) {
        for (var acc : accounts) {
            if (acc.equals(account)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void logout(Account account) {
        //bật trạng thái active == false
    }

    @Override
    public boolean removeAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (account.equals(accounts.get(i))) {
                accounts.remove(i);
            }
        }
        return false;
    }

    @Override
    public boolean recoverAccount(Account account) {
        return false;
    }

    @Override
    public boolean changePassword(Account account) {
        return false;
    }

    @Override
    public void changeAccountInfo(Account account) {

    }
}
