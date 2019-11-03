package inventoryMotor.Frame;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class LoginTest {
    public LoginTest() {}
    @Before
    public void setUp() {}
    @After
    public void tearDown() {}
    @Test
    public void testUsername() {
        System.out.println("username");
        String username = "admin";
        Login instance = new Login();
        String expResult = "admin";
        String result = instance.username(username);
        assertEquals(expResult, result);
    }
    @Test
    public void testPassword() {
        System.out.println("password");
        String password = "123";
        Login instance = new Login();
        String expResult = "123";
        String result = instance.password(password);
        assertEquals(expResult, result);
    }
    @Test
    public void confirm() {
        System.out.println("delete");

        String username = "admin", password = "123";

        Login login = new Login();
        String usernameExp = "admin", passwordExp = "123";

        String expResult = login.login(usernameExp, passwordExp);
        String Result = login.login(username, password);
        assertEquals(expResult, Result);   
    }
}