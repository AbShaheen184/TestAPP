package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i0 {
    public final Class k;

    public f0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.k = cls;
        } else {
            kotlinx.coroutines.future.a.d(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // androidx.navigation.i0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        return bundle.get(str);
    }

    @Override // androidx.navigation.i0
    public final String b() {
        return this.k.getName();
    }

    @Override // androidx.navigation.i0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // androidx.navigation.i0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.k.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.k, ((f0) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
