package application;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**s
 *
 * @author knovengel
 */
public class Account {
    private String name, hashedPin;
    private int accountNumber, age;
    private double accountBalance;
    private boolean isFirstTimeUser;
    public ArrayList<String> accountTransactions = new ArrayList<>();
    
    public void setAccountBalance(double balance){
        this.accountBalance = balance;
    }
    
    public double getAccountBalance(){
        return this.accountBalance;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public void deposit(double amount){
        this.accountBalance += amount;
        this.accountTransactions.add("Account Creadited with \t +"+amount);
    }
    
    public void withdraw(double amount){
        if(this.accountBalance>=amount){
            this.accountBalance -= amount;
            this.accountTransactions.add("Account Debited by \t -"+amount);
        }
    }
    
    private String hashPin(int pin) {
        try {
            // Convert the pin to a string
            String pinString = String.valueOf(pin);
            
            // Create a SHA-256 MessageDigest instance
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Compute the hash
            byte[] hashBytes = digest.digest(pinString.getBytes());
            
            // Convert byte array to hex format
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }
            
            // Return the hashed pin
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 algorithm not found");
            return null;
        }
    }
    
    public boolean authenticatePin(int pin){
        return (this.hashedPin.equalsIgnoreCase(hashPin(pin)));
    }
    
    public boolean changePin(int oldPin, int newPin){
        if(authenticatePin(oldPin)) {
            this.hashedPin = hashPin(newPin);
            return true;
        }
        return false;
    }
    
    public Account(int accountNumber, int pin){
        this.accountNumber = accountNumber;
        this.hashedPin = hashPin(pin);
        this.accountBalance = 0.0;
        this.isFirstTimeUser = true;
    }
}
