package mySolution;

public class UserConfirmation {

    public void confirmUser(User user) {




        System.out.println("📧 Sending confirmation email to: " + user.getEmail());
        //resposta email
        boolean userConfirmed = true;


        if (!userConfirmed) {
            throw new IllegalArgumentException("⚠️ User did not confirm registration.");
        }

    }
}
