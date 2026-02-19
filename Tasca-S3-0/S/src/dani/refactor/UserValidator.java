package dani.refactor;

public class UserValidator {


    public void validate(User user) {

        if (user.getEmail() == null || !user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

        if (user.getPassword() == null || user.getPassword().length() < 8 || !user.getPassword().matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }

    }
}
