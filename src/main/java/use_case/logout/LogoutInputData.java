package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    String name;

    public LogoutInputData(String username) {
        // TODO: save the current username in an instance variable and add a getter.
        name = username;
    }

    public String getUsername() {
        return name;
    }

}
