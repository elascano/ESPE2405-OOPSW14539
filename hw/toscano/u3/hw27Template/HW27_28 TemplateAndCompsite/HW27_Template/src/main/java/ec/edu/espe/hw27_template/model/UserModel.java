package ec.edu.espe.hw27_template.model;

/**
 *
 * @author Damian Toscano
 */
public abstract class UserModel {

    protected String username;

    // Template method
    public final void processUser() {
        inputUsername();
        validateUser();
        storeUser();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void inputUsername();

    protected abstract void validateUser();

    // Concrete method common to all subclasses
    protected void storeUser() {
        System.out.println("Storing user: " + username);
    }

    public String getUsername() {
        return username;
    }
}
