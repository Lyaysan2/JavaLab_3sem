import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SignUpService signUpService = context.getBean(SignUpService.class);
        signUpService.signUp("email@gmail.com", "12345");
    }
}
