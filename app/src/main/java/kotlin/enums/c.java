package kotlin.enums;

import androidx.compose.runtime.j;
import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.f;
import kotlin.collections.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f implements a, RandomAccess, Serializable {
    public final Enum[] e;

    public c(Enum[] enumArr) {
        enumArr.getClass();
        this.e = enumArr;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.e.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) o.v(r4.ordinal(), this.e)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        com.google.firebase.platforminfo.b.l(j.g("index: ", i, ", size: ", length));
        return null;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) o.v(iOrdinal, this.e)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) o.v(iOrdinal, this.e)) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}
