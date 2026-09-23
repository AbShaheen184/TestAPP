package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o {
    public static final Parcelable.Creator<j1> CREATOR = new i1();
    public final f y;
    public o2 z;

    public j1(Object obj, f fVar) {
        this.y = fVar;
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        o2 o2Var = new o2(fVarJ.g(), obj);
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            o2Var.b = new o2(1, obj);
        }
        this.z = o2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.z = (o2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.z;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (this.y.b(((o2) yVar2).c, ((o2) yVar3).c)) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return ((o2) androidx.compose.runtime.snapshots.n.t(this.z, this)).c;
    }

    @Override // androidx.compose.runtime.a1
    public final void setValue(Object obj) {
        androidx.compose.runtime.snapshots.f fVarJ;
        o2 o2Var = (o2) androidx.compose.runtime.snapshots.n.h(this.z);
        if (this.y.b(o2Var.c, obj)) {
            return;
        }
        o2 o2Var2 = this.z;
        synchronized (androidx.compose.runtime.snapshots.n.c) {
            fVarJ = androidx.compose.runtime.snapshots.n.j();
            ((o2) androidx.compose.runtime.snapshots.n.o(o2Var2, this, fVarJ, o2Var)).c = obj;
        }
        androidx.compose.runtime.snapshots.n.n(fVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((o2) androidx.compose.runtime.snapshots.n.h(this.z)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        f fVar = f.A;
        f fVar2 = this.y;
        if (kotlin.jvm.internal.l.a(fVar2, fVar)) {
            i2 = 0;
        } else if (kotlin.jvm.internal.l.a(fVar2, f.D)) {
            i2 = 1;
        } else {
            if (!kotlin.jvm.internal.l.a(fVar2, f.B)) {
                kotlinx.coroutines.future.a.u("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
