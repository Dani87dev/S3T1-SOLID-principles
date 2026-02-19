package dani.refactor;

public class UserRegister {

    private User user;
    private UserValidator validator;
    private UserConfirmation confirmatior;


    public UserRegister(User user, UserValidator validation, UserConfirmation confirmatior) {
        this.user = user;
        this.validator = validation;
        this.confirmatior = confirmatior;
    }

    public void register() {

        validator.validateUser(user);
        confirmatior.confirmUser(user);


    }
}

