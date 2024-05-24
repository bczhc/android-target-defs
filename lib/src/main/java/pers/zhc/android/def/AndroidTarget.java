package pers.zhc.android.def;

import java.util.Objects;

/**
 * An Android target is a combination of ABI and API number
 */
public class AndroidTarget {
    public AndroidAbi abi;

    public int api;

    public AndroidTarget(AndroidAbi abi, int api) {
        this.abi = abi;
        this.api = api;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AndroidTarget that = (AndroidTarget) o;
        return api == that.api && abi == that.abi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(abi, api);
    }

    @Override
    public String toString() {
        return this.abi.name + "-" + this.api;
    }
}
