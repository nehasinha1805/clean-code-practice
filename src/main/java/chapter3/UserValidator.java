package main.java.chapter3;
/*
* The checkPassword function, by its name, says that it checks the password.
* The side effect is the call to Session.initialize().
* This side effect creates a temporal coupling.
* If you must have a temporal coupling, you should make it clear in the name of the function.
* In this case we might rename the function checkPasswordAndInitializeSession,
* though that certainly violates “Do one thing.”
* */
public class UserValidator {

    private Cryptographer cryptographer;

    public boolean checkPassword(String userName, String password) {
        User user = UserGateway.findByName(userName);
        if(user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if("Valid Password".equals(phrase)) {
                Session.initialize(); // side effect code
                return true;
            }
        }
        return false;
    }
}
