package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o, w2, a1 {
    public static final Parcelable.Creator<f1> CREATOR = new e1(0);
    public l2 y;

    public f1(float f) {
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        l2 l2Var = new l2(f, fVarJ.g());
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            l2Var.b = new l2(f, 1);
        }
        this.y = l2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return f.D;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.y = (l2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (((l2) yVar2).c == ((l2) yVar3).c) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((l2) androidx.compose.runtime.snapshots.n.t(this.y, this)).c;
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        androidx.compose.runtime.snapshots.f fVarJ;
        l2 l2Var = (l2) androidx.compose.runtime.snapshots.n.h(this.y);
        if (l2Var.c == f) {
            return;
        }
        l2 l2Var2 = this.y;
        synchronized (androidx.compose.runtime.snapshots.n.c) {
            fVarJ = androidx.compose.runtime.snapshots.n.j();
            ((l2) androidx.compose.runtime.snapshots.n.o(l2Var2, this, fVarJ, l2Var)).c = f;
        }
        androidx.compose.runtime.snapshots.n.n(fVarJ, this);
    }

    @Override // androidx.compose.runtime.a1
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((l2) androidx.compose.runtime.snapshots.n.h(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
