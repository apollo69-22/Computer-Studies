import java.io.IOException;

class Beep {
    public static void main(String[] args) {
        try {
            Runtime runTime = Runtime.getRuntime();
        
            String c_beep = "Beep\\c_beep.exe";
        
            runTime.exec(c_beep);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}