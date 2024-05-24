package pers.zhc.android.def;

public enum AndroidAbi {
    ARMEABI_V7A("armeabi-v7a"),
    ARM64_V8A("arm64-v8a"),
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

    public String toRustTriple() {
        switch (this) {
            case ARMEABI_V7A:
                return "armv7-linux-androideabi";
            case ARM64_V8A:
                return "aarch64-linux-android";
            case X86:
                return "i686-linux-android";
            case X86_64:
                return "x86_64-linux-android";
            default:
                throw new UnreachableError();
        }
    }

    public String toNdkToolchainName() {
        switch (this) {
            case ARMEABI_V7A:
                return "armv7a-linux-androideabi";
            case ARM64_V8A:
                return "aarch64-linux-android";
            case X86:
                return "i686-linux-android";
            case X86_64:
                return "x86_64-linux-android";
            default:
                throw new UnreachableError();
        }
    }

    public static AndroidAbi from(String name) {
        switch (name.toLowerCase()) {
            case "armeabi-v7a":
                return ARMEABI_V7A;
            case "arm64-v8a":
                return ARM64_V8A;
            case "x86_64":
                return X86_64;
            case "x86":
                return X86;
            default:
                throw new RuntimeException("Unknown target ABI: " + name);
        }
    }
}
