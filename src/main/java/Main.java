import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.crypto.codec.Hex;
import org.springframework.security.crypto.codec.Utf8;

public class Main {
	
	public static void main (String ... args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

			messageDigest.reset();
			messageDigest.update("Yv_cCbAe6xTa6ze9Q3Ia6EKj7jR6cPxTrsXtGUkVzOgVzP7BRxEo26nkdcZU5HVh".getBytes("UTF-8"));
			byte[] hashedBytes = messageDigest.digest("34186a92a473e3732aad5755748455616274d3de7d22e1ab83a84267a37121e9".getBytes("UTF-8"));

			System.out.println(Hex.encode(hashedBytes));
		}
}
