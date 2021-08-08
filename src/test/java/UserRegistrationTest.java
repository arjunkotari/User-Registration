import com.userRegistration.UserRegistration;
import com.userRegistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_CustomExceptions(){
        UserRegistration userRegistration = new UserRegistration();
        boolean name;
        try{
            name = userRegistration.firstNameException("Arjun");
            Assert.assertTrue(name);
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_CustomExceptions(){
        UserRegistration userRegistration = new UserRegistration();
        boolean name;
        try{
            name = userRegistration.lastNameException("");
            Assert.assertTrue(name);
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmail_CustomExceptions(){
        UserRegistration userRegistration = new UserRegistration();
        boolean mail;
        try{
            mail = userRegistration.emailException("arjun@gmail.com.co.in");
            Assert.assertTrue(mail);
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNumber_CustomExceptions(){
        UserRegistration userRegistration = new UserRegistration();
        boolean mobileNumber;
        try{
            mobileNumber = userRegistration.mobileNumberException("91 8499889900");
            Assert.assertTrue(mobileNumber);
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPassword_CustomExceptions(){
        UserRegistration userRegistration = new UserRegistration();
        boolean name;
        try{
            name = userRegistration.passwordException("asde#1rR");
            Assert.assertTrue(name);
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }
}
