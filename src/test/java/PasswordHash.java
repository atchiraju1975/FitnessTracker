import junit.framework.TestCase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHash extends TestCase {

    public void testMD5Hash(){
         String passwordSrinivas = "givemeaccess";
        String passwordSohanSrinivas = "doihaveaccess";
         Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
         String hashedPassword = passwordEncoder.encodePassword(passwordSrinivas,null);
         System.out.println(hashedPassword);
         assertNotNull(hashedPassword);
         assertNotSame(passwordSrinivas, hashedPassword);
         String hashedPasswordAgain = passwordEncoder.encodePassword(passwordSohanSrinivas,null);
        System.out.println(hashedPasswordAgain);
        assertNotNull(hashedPasswordAgain);
        assertNotSame(passwordSohanSrinivas, hashedPasswordAgain);

    }

    public void testBcrypt(){
        String passwordSrinivas = "givemeaccess";
        String passwordSohanSrinivas = "doihaveaccess";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(passwordSrinivas);
        System.out.println(hashedPassword);
        assertNotNull(hashedPassword);
        assertNotSame(passwordSrinivas, hashedPassword);
        String hashedPasswordAgain = passwordEncoder.encode(passwordSohanSrinivas);
        System.out.println(hashedPasswordAgain);
        assertNotNull(hashedPasswordAgain);
        assertNotSame(passwordSohanSrinivas, hashedPasswordAgain);

    }

}
