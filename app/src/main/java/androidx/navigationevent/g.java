package androidx.navigationevent;

import androidx.activity.c0;
import androidx.activity.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public c a;
    public boolean b;

    public final void a() {
        c cVar = this.a;
        if (cVar == null) {
            kotlinx.coroutines.future.a.u("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            cVar.d(this, null);
        }
        h hVar = cVar.b;
        y yVar = cVar.a;
        hVar.getClass();
        if (equals(hVar.i) && -1 == hVar.h) {
            e eVarC = hVar.g;
            if (eVarC == null) {
                eVarC = hVar.c(-1);
            }
            hVar.g = null;
            hVar.h = 0;
            hVar.i = null;
            if (eVarC == null) {
                ((c0) yVar.y).a.run();
            } else {
                eVarC.b();
            }
            hVar.a.setValue(i.m);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
