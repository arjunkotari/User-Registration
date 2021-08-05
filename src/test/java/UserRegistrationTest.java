import com.userRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {


    @Test
    public void givenValidFirstName_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Arjun");
        Assert.assertTrue(result);
    }
    @Test
    public void givenInValidFirstName_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Arjun@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidLastName_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Sai");
        Assert.assertTrue(result);
    }
    @Test
    public void givenInValidLastName_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Sai@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidEmail_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc.100@yahoo.com.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenInValidEmail_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("abc()*@gmail.com@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidMobile_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobile("91 8499880099");
        Assert.assertTrue(result);
    }
    @Test
    public void givenInValidMobile_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobile("8699009777");
        Assert.assertFalse(result);
    }


    @Test
    public void givenValidPassword_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("Asdeq1f%dg");
        Assert.assertTrue(result);
    }
    @Test
    public void givenInValidPassword_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("Asde$gf");
        Assert.assertFalse(result);
    }

}
