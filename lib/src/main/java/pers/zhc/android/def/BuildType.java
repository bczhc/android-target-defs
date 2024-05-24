package pers.zhc.android.def;

public enum BuildType {
    Debug("debug"),
    Release("release");

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
                return Debug;
            case "release":
                return Release;
            default:
                throw new UnreachableError();
        }
    }
}
