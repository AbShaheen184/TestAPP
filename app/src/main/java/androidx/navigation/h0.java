package androidx.navigation;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class h0 extends i0 {
    public final Class k;

    public h0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            kotlinx.coroutines.future.a.d(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            kotlinx.coroutines.future.a.d(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.k = cls;
    }

    @Override // androidx.navigation.i0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // androidx.navigation.i0
    public String b() {
        return this.k.getName();
    }

    @Override // androidx.navigation.i0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.k.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.k, ((h0) obj).k);
    }

    @Override // androidx.navigation.i0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    public h0(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.k = cls;
        } else {
            kotlinx.coroutines.future.a.d(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
