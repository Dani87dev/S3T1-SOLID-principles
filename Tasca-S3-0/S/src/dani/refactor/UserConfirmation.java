package dani.refactor;

public class UserConfirmation {

    public void confirmUser(User user) {

        //enviar email
        System.out.println("📧 Sending confirmation email to: " + user.getEmail());

        //logica de confirmació - en aquest cas si ha condirmat el email
        boolean userConfirmed = true;
        if (!userConfirmed) {
            throw new IllegalArgumentException("⚠️ User did not confirm registration.");
        }

    }
}
