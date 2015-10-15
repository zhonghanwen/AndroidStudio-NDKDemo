package information.tgnet;

public class StringKit {
    public static native void setNull(String str);
    static {
        System.loadLibrary("JniDemo");
    }
}