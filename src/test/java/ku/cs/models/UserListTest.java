package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("king","strongpassword");
        userList.addUser("jan","okaypassword");
        userList.addUser("bus","weakpassword");

        // TODO: find one of them
        User user = userList.findUserByUsername("bus");

        // TODO: assert that UserList found User
         String expected = "bus";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("king","strongpassword");
        userList.addUser("jan","okaypassword");
        userList.addUser("bus","weakpassword");

        // TODO: change password of one user
        boolean actual = userList.changePassword("bus","weakpassword","strongestpassword");

        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("king","strongpassword");
        userList.addUser("jan","okaypassword");
        userList.addUser("bus","weakpassword");

        // TODO: call login() with correct username and password
        User actual = userList.login("king","strongpassword");
        User expected = userList.findUserByUsername("king");

        // TODO: assert that User object is found
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("king","strongpassword");
        userList.addUser("jan","okaypassword");
        userList.addUser("bus","weakpassword");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("jan","strongpassword");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}