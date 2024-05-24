package pers.zhc.android.def;

public enum BuildType {
    DEBUG("debug"),
    RELEASE("release");

    public final String name;

    BuildType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static BuildType from(String name) {
        switch (name.toLowerCase()) {
            case "debug":
                return DEBUG;
            case "release":
                return RELEASE;
            default:
                throw new UnreachableError();
        }
    }
}
