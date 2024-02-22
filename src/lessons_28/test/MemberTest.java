package lessons_28.test;

import lessons_28.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {
    Member member;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";


    @BeforeEach
    void setUp() {
        member = new Member(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet(){
        String validEmail = "valid@test.com";
        System.out.println("getEmail after: " + member.getEmail());

        member.setEmail(validEmail);

        System.out.println("getEmail before: " + member.getEmail());
        Assertions.assertEquals(validEmail, member.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testSetInvalidEmail(String email){
        member.setEmail(email);
        Assertions.assertEquals(startEmail, member.getEmail());
    }
    static Stream<String> invalidEmailData(){
        return Stream.of(
                "test@ema@il.net",
                "test@emailnet",
                "test@email.net.",
                "test@.email.net",
                "test@.emailne.t"
        );
    }

    @Test
    void  testValidPasswordSet(){
        String validPassword = "qwerty1Q$";
        System.out.println("getPassword after: " + member.getPassword());

        member.setPassword(validPassword);

        System.out.println("getPassword before: " + member.getPassword());
        Assertions.assertEquals(validPassword,member.getPassword());
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    public void testSetInvalidPassword(String password){
        member.setPassword(password);
        Assertions.assertEquals(startPassword,member.getPassword());
    }


    /*
    1. длинна пароля >= 8
    2. мин маленькая буква
    3. мин большая буква
    4. мин 1 спец символ (!%$@&*)
    5. мин 1 цифра
     */
    static Stream<String> invalidPasswordData(){
        return Stream.of(
                "qwerty{}.",
                "1DJFH",
                " ",
                "()|,<asjdf"
        );
    }
}