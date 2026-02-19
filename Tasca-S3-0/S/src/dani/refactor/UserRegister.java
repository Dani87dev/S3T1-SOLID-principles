package dani.refactor;

public class UserRegister {

    private User user;


    public UserRegister(User user) {
        this.user = user;
    }


    public void register() {

        UserValidator validator1 = new UserValidator();
        UserConfirmation confirmation1 = new UserConfirmation();

        validator1.validate(user);
        confirmation1.confirmUser(user);

        
    }
}

