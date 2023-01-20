public class beepJNI {
    static {
        System.loadLibrary("beep");
    }
    
    private native void beep();
    
    public static void main(String[] args) {
        new beepJNI().beep();
    }
}