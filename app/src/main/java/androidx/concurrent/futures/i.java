package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public Object a;
    public l b;
    public n c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        l lVar = this.b;
        if (lVar == null || !lVar.y.l(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void b(Throwable th) {
        this.d = true;
        l lVar = this.b;
        if (lVar == null || !lVar.y.m(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        n nVar;
        l lVar = this.b;
        if (lVar != null) {
            k kVar = lVar.y;
            if (!kVar.isDone()) {
                kVar.m(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
            }
        }
        if (this.d || (nVar = this.c) == null) {
            return;
        }
        nVar.l(null);
    }
}
