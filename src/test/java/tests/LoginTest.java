package tests;

import models.User;
import org.testng.annotations.Test;


public class LoginTest {
    @Test
    public void loginPositiveTest(){

        User user = User.builder().email("shulganp@gmail.com").password("Na:30091983").build();
    }
}
