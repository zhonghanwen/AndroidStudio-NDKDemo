package information.tgnet;

public class MathKit {
    public static native int square(int num);

    static {
        System.loadLibrary("JniDemo");
    }
}