package androidx.activity;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public u(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(boolean z) {
        this.b = z;
        for (t tVar : this.a) {
            tVar.f(tVar.e && z);
        }
    }

    public void a() {
    }

    public void c(a aVar) {
    }

    public void d(a aVar) {
    }
}
