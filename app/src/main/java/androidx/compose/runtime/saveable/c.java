package androidx.compose.runtime.saveable;

import androidx.activity.w;
import androidx.appcompat.widget.c2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.snapshots.o;
import androidx.media3.exoplayer.source.t0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b2 {
    public Object A;
    public Object[] B;
    public f C;
    public final w D = new w(this, 21);
    public k e;
    public g y;
    public String z;

    public c(k kVar, g gVar, String str, Object obj, Object[] objArr) {
        this.e = kVar;
        this.y = gVar;
        this.z = str;
        this.A = obj;
        this.B = objArr;
    }

    @Override // androidx.compose.runtime.b2
    public final void a() {
        f fVar = this.C;
        if (fVar != null) {
            ((c2) fVar).e0();
        }
    }

    @Override // androidx.compose.runtime.b2
    public final void b() {
        f fVar = this.C;
        if (fVar != null) {
            ((c2) fVar).e0();
        }
    }

    @Override // androidx.compose.runtime.b2
    public final void c() {
        d();
    }

    public final void d() {
        String strA;
        g gVar = this.y;
        if (this.C != null) {
            t0.g(this.C, ") is not null", "entry(");
            return;
        }
        if (gVar != null) {
            w wVar = this.D;
            Object objInvoke = wVar.invoke();
            if (objInvoke == null || gVar.a(objInvoke)) {
                this.C = gVar.d(this.z, wVar);
                return;
            }
            if (objInvoke instanceof o) {
                o oVar = (o) objInvoke;
                if (oVar.a() == androidx.compose.runtime.f.A || oVar.a() == androidx.compose.runtime.f.D || oVar.a() == androidx.compose.runtime.f.B) {
                    strA = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = l.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }
}
