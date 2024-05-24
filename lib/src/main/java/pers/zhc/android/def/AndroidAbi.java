package pers.zhc.android.def;

public enum AndroidAbi {
    ARM_V7("armeabi-v7a"),
    ARM_V8("arm64-v8a"),
    X86("x86"),
    X86_64("x86_64");

    public final String name;

    AndroidAbi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static AndroidAbi from(String name) {
        switch (name.toLowerCase()) {
            case "armeabi-v7a":
                return ARM_V7;
            case "arm64-v8a":
                return ARM_V8;
            case "x86_64":
                return X86_64;
            case "x86":
                return X86;
            default:
                throw new RuntimeException("Unknown target ABI: " + name);
        }
    }
}
