package androidx.sqlite.driver;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements androidx.sqlite.c {
    public final androidx.sqlite.db.framework.b e;
    public final String y;
    public boolean z;

    public f(androidx.sqlite.db.framework.b bVar, String str) {
        this.e = bVar;
        this.y = str;
    }

    public final void a() {
        if (this.z) {
            t1.B(21, "statement is closed");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public void k() {
        a();
    }

    @Override // androidx.sqlite.c
    public void reset() {
        a();
    }
}
