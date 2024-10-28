package interface_adapter.change_password;

import interface_adapter.ViewModel;
import interface_adapter.logout.LogoutController;

/**
 * The View Model for the Logged In View.
 */
public class LoggedInViewModel extends ViewModel<LoggedInState> {

    private LogoutController logoutController;

    public LoggedInViewModel() {
        super("logged in");
        setState(new LoggedInState());
    }

}
