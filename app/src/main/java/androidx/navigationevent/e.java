package androidx.navigationevent;

import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public n a;
    public boolean b;
    public c c;

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public final void e() {
        c cVar = this.c;
        if (cVar == null || !cVar.c.remove(this)) {
            return;
        }
        h hVar = cVar.b;
        hVar.getClass();
        if (equals(hVar.g)) {
            if (hVar.h == -1) {
                a();
            }
            hVar.g = null;
            hVar.h = 0;
            hVar.i = null;
        }
        hVar.e.remove(this);
        hVar.f.remove(this);
        this.c = null;
        hVar.b();
    }

    public final void f(boolean z) {
        h hVar;
        if (this.b == z) {
            return;
        }
        this.b = z;
        c cVar = this.c;
        if (cVar == null || (hVar = cVar.b) == null) {
            return;
        }
        hVar.b();
    }
}
