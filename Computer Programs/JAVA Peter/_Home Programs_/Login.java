import java.io.Console;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login {
    public static String loginPrompt() {
        String[] credentials;
        credentials = new String[2];

        System.out.print("Username: ");
        credentials[0] = Keyboard.readString();

        Console console = System.console();
        char[] pwd_Array = console.readPassword("Password: ");
        credentials[1] = new String(pwd_Array);

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

    public static boolean authenticate() {
        String[] stored_Creden = {"e2a166aae56dd0058f4be8816c65b5c6b38740d8fca612a86118a549acf1a33e11f5f0d36c75db2a40bad45c1775db6a17f9da04d2f72575eb4239794d744e16"};

        boolean authen = false;
        int counter = 0;
        while (authen == false && counter < 3) {
            String login_Hash = loginPrompt();
        
            for (int i = 0; i < stored_Creden.length; i++) {
                if (login_Hash.equals(stored_Creden[i])) 
                    authen = true;
                /*else if (!login_Hash.equals(stored_Creden[i]) && i == stored_Creden.length - 1)
                    authen = false;*/
            }
            counter++;
        }

        return authen;
    }
    
    public static void main(String[] args) {
        if (authenticate() == true)
            System.out.print("Authentication Successfull");
        else
            System.out.print("Authentication Failed");
    }
}