package dani.refactor;

public class userConfirmation {

    public void condirmUser() {

        //logica de confirmació
        boolean userConfirmed = true;
        if (!userConfirmed) {
            throw new IllegalArgumentException("⚠️ User did not confirm registration.");
        }

    }
}
