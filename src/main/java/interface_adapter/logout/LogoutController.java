package interface_adapter.logout;

import use_case.login.LoginInputData;
import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInputData;
import use_case.logout.LogoutInteractor;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    private final LogoutInputBoundary logoutUseCaseInteractor;

    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     * @param username the username of the user logging in
     */
    public void execute(String username) {
        // 1. instantiate the `LogoutInputData`, which should contain the username.
        // 2. tell the Interactor to execute.
        final LogoutInputData logoutInputData = new LogoutInputData(
                username);

        logoutUseCaseInteractor.execute(logoutInputData);
    }
}
