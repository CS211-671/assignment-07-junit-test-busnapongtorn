package ku.cs.models;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testIsUsername(){
        User u = new User("username", "password");
        assertTrue(u.isUsername("username"));
    }

    @Test
    void testSetPassword(){
        User u = new User("username", "password");
        String password = u.getPassword();
        u.setPassword("newpassword");
        assertNotEquals(password, u.getPassword());
    }

    @Test
    void testValidatePassword(){
        User u = new User("username", "password");
        boolean valid = u.validatePassword("password");
        assertTrue(valid);
    }

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }
}