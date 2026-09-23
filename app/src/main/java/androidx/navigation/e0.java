package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends i0 {
    public final Class k;

    public e0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            kotlinx.coroutines.future.a.d(cls, " does not implement Parcelable.");
            throw null;
        }
        try {
            this.k = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            kotlinx.coroutines.future.a.l(e);
            throw null;
        }
    }

    @Override // androidx.navigation.i0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        return (Parcelable[]) bundle.get(str);
    }

    @Override // androidx.navigation.i0
    public final String b() {
        return this.k.getName();
    }

    @Override // androidx.navigation.i0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // androidx.navigation.i0
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.k.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e0.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.k, ((e0) obj).k);
    }

    @Override // androidx.navigation.i0
    public final boolean f(Object obj, Object obj2) {
        return kotlin.collections.o.d((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
