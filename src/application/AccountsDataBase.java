package application;

import java.util.ArrayList;

/**
 *
 * @author knovengel
 */
public class AccountsDataBase {
    private ArrayList<Account> accountsDB = new ArrayList<>();
    
    public Account findAccount(int accountNumber){
        for(Account acc : accountsDB){
            if(acc.getAccountNumber() == accountNumber){
                return acc;
            }
        }
        return null;
    }
    
    public boolean ifAccountExists(int accountNumber){
        for(int i=0; i<accountsDB.size(); i++){
            if(accountsDB.get(i).getAccountNumber() == accountNumber){
                return true;
            }
        }
        return false;
    }
    
    public boolean changePin(int accountNumber, int oldPin, int newPin){
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            return acc.changePin(oldPin, newPin);
        }
        return false;
    }
    
    public void updateAccount(Account acc){
        
        int index = getAccountIndex(acc.getAccountNumber());
        if(index != -1){
            accountsDB.set(index, acc);
        }else{
            System.out.println("Account not Found!");
        }
        
    }
    
    public void removeAccount(Account acc){
        if(accountsDB.contains(acc)){
            accountsDB.remove(acc);
        }else{
            System.out.println("Account not found");
        }
    }
    
    public void addAccount(Account acc){
        if(findAccount(acc.getAccountNumber()) != null){
            System.out.println("Account already exists!");
        }else{
            accountsDB.add(acc);
        }
    }
    
    private int getAccountIndex(int accountNumber){
        for(int i=0; i<accountsDB.size(); i++){
            if(accountsDB.get(i).getAccountNumber() == accountNumber){
                return i;
            }
        }
        return -1;
    }
    
    public boolean authenticateAccount(int accountNumber, int pin){
        Account acc = findAccount(accountNumber);
        return ((acc != null) && acc.authenticatePin(pin));
    }
}
