import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GenHash {
    public static String loginPrompt() {
        String[] credentials;
        credentials = new String[2];

        System.out.print("Username: ");
        credentials[0] = Keyboard.readString();

        System.out.print("Password: ");
        credentials[1] = Keyboard.readString();

        return computeHash(credentials);
    }

    public static String computeHash(String[] args) {
        String saltedPassword = args[0] + args[1], genhash = "";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(saltedPassword.getBytes());
            byte[] bytes = md.digest();

            // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            genhash = sb.toString();

        } catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return genhash;
    }
    
    public static void main(String[] args) {
        System.out.print(loginPrompt());
    }
}
