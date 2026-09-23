package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o, w2, a1 {
    public static final Parcelable.Creator<h1> CREATOR = new e1(2);
    public n2 y;

    public h1(long j) {
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        n2 n2Var = new n2(fVarJ.g(), j);
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            n2Var.b = new n2(1, j);
        }
        this.y = n2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return f.D;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.y = (n2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (((n2) yVar2).c == ((n2) yVar3).c) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((n2) androidx.compose.runtime.snapshots.n.t(this.y, this)).c;
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        androidx.compose.runtime.snapshots.f fVarJ;
        n2 n2Var = (n2) androidx.compose.runtime.snapshots.n.h(this.y);
        if (n2Var.c != j) {
            n2 n2Var2 = this.y;
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                fVarJ = androidx.compose.runtime.snapshots.n.j();
                ((n2) androidx.compose.runtime.snapshots.n.o(n2Var2, this, fVarJ, n2Var)).c = j;
            }
            androidx.compose.runtime.snapshots.n.n(fVarJ, this);
        }
    }

    @Override // androidx.compose.runtime.a1
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((n2) androidx.compose.runtime.snapshots.n.h(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
