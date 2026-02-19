package dani.refactor;

public class UserRegister {

    private User user;


    public UserRegister(User user) {
        this.user = user;
    }

    /*
        System.out.println("📧 Sending confirmation email to: " + user.getEmail());


        }
        */
    //Registro
    public void register() {

        UserValidator validator1 = new UserValidator();
        validator1.validate(user);


    }
}
}
