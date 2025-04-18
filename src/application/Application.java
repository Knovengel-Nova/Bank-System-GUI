package application;

/**
 *
 * @author knovengel
 */
public class Application {
    
    public static AccountsDataBase DB = new AccountsDataBase();
    public static Account currentActiveAccount;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        App app = new App();
        app.run();
    }
    
    
}
