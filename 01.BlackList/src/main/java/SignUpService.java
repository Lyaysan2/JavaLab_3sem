public class SignUpService {

    private EmailValidator emailValidator;
    private PasswordBlackList passwordBlackList;

    public SignUpService(EmailValidator emailValidator, PasswordBlackList passwordBlackList) {
        this.emailValidator = emailValidator;
        this.passwordBlackList = passwordBlackList;
    }

    public void signUp(String email, String password){

        if (emailValidator.isValid(email)){
            System.out.println("Email подходит");
        } else{
            System.err.println("Email не подходит");
        }

        if (passwordBlackList.contains(password)){
            System.err.println("Пароль не подходит");
        } else{
            System.out.println("Пароль хороший");
        }
    }
}
