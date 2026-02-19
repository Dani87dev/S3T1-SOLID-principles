package dani.refactor;

public class UserRegister implements Registable{

    private User user;

    public UserRegister(User user){
        this.user = user;
    }

    public void registrar(User user){

        if (user.getEmail() == null || !user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        if (user.getPassword() == null || user.getPassword().length() < 8 || !user.getPassword().matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }

        System.out.println("📧 Sending confirmation email to: " + user.getEmail());

        boolean userConfirmed = true;
        if (!userConfirmed) {
            System.out.println("⚠️ User did not confirm registration.");
            return;
        }

    }
}
