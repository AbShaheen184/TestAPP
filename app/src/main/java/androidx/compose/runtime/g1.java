package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o, w2, a1 {
    public static final Parcelable.Creator<g1> CREATOR = new e1(1);
    public m2 y;

    public g1(int i) {
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        m2 m2Var = new m2(fVarJ.g(), i);
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            m2Var.b = new m2(1, i);
        }
        this.y = m2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return f.D;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.y = (m2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (((m2) yVar2).c == ((m2) yVar3).c) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((m2) androidx.compose.runtime.snapshots.n.t(this.y, this)).c;
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        androidx.compose.runtime.snapshots.f fVarJ;
        m2 m2Var = (m2) androidx.compose.runtime.snapshots.n.h(this.y);
        if (m2Var.c != i) {
            m2 m2Var2 = this.y;
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                fVarJ = androidx.compose.runtime.snapshots.n.j();
                ((m2) androidx.compose.runtime.snapshots.n.o(m2Var2, this, fVarJ, m2Var)).c = i;
            }
            androidx.compose.runtime.snapshots.n.n(fVarJ, this);
        }
    }

    @Override // androidx.compose.runtime.a1
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((m2) androidx.compose.runtime.snapshots.n.h(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
