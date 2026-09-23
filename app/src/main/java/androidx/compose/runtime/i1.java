package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Parcelable.ClassLoaderCreator {
    public static j1 a(Parcel parcel, ClassLoader classLoader) {
        f fVar;
        if (classLoader == null) {
            classLoader = i1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            fVar = f.A;
        } else if (i == 1) {
            fVar = f.D;
        } else {
            if (i != 2) {
                kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.q("Unsupported MutableState policy ", i, " was restored"));
                return null;
            }
            fVar = f.B;
        }
        return new j1(value, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new j1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
