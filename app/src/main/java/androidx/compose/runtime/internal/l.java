package androidx.compose.runtime.internal;

import android.os.Trace;
import androidx.collection.o0;
import androidx.collection.p0;
import androidx.collection.x0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public Set a;
    public androidx.compose.runtime.tooling.d b;
    public final androidx.compose.runtime.collection.b c;
    public p0 d;
    public androidx.compose.runtime.collection.b e;
    public final androidx.compose.runtime.collection.b f;
    public final androidx.compose.runtime.collection.b g;
    public p0 h;
    public o0 i;
    public ArrayList j;
    public p0 k;

    public l() {
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new c2[16]);
        this.c = bVar;
        p0 p0Var = x0.a;
        this.d = new p0();
        this.e = bVar;
        this.f = new androidx.compose.runtime.collection.b(new Object[16]);
        this.g = new androidx.compose.runtime.collection.b(new kotlin.jvm.functions.a[16]);
    }

    public static final boolean f(c2 c2Var, androidx.compose.runtime.collection.b bVar) {
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            b2 b2Var = ((c2) objArr[i2]).a;
            if (b2Var instanceof h) {
                androidx.compose.runtime.collection.b bVar2 = ((h) b2Var).y;
                if (bVar2.j(c2Var) || f(c2Var, bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        androidx.compose.runtime.collection.b bVar = this.c;
        bVar.g();
        this.d.b();
        this.e = bVar;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b2 b2Var = (b2) it.next();
                it.remove();
                b2Var.a();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        androidx.compose.runtime.collection.b bVar = this.f;
        if (bVar.z != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                p0 p0Var = this.h;
                int i = bVar.z;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = bVar.e[i];
                    try {
                        if (obj instanceof c2) {
                            b2 b2Var = ((c2) obj).a;
                            set.remove(b2Var);
                            b2Var.b();
                        }
                        if (obj instanceof androidx.compose.runtime.i) {
                            if (p0Var == null || !p0Var.c(obj)) {
                                ((androidx.compose.runtime.i) obj).b();
                            } else {
                                ((androidx.compose.runtime.i) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        androidx.compose.runtime.tooling.d dVar = this.b;
                        if (dVar != null) {
                            coil3.network.g.G(th, new androidx.activity.compose.f(18, dVar, obj));
                        }
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        androidx.compose.runtime.collection.b bVar2 = this.c;
        if (bVar2.z != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = bVar2.e;
                    int i2 = bVar2.z;
                    for (int i3 = 0; i3 < i2; i3++) {
                        c2 c2Var = (c2) objArr[i3];
                        b2 b2Var2 = c2Var.a;
                        set2.remove(b2Var2);
                        try {
                            b2Var2.c();
                        } catch (Throwable th3) {
                            androidx.compose.runtime.tooling.d dVar2 = this.b;
                            if (dVar2 != null) {
                                coil3.network.g.G(th3, new androidx.activity.compose.f(18, dVar2, c2Var));
                            }
                            throw th3;
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public final void d() {
        androidx.compose.runtime.collection.b bVar = this.g;
        if (bVar.z != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = bVar.e;
                int i = bVar.z;
                for (int i2 = 0; i2 < i; i2++) {
                    ((kotlin.jvm.functions.a) objArr[i2]).invoke();
                }
                bVar.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(c2 c2Var) {
        if (!this.d.c(c2Var)) {
            p0 p0Var = this.k;
            if (p0Var == null || !p0Var.c(c2Var)) {
                this.f.b(c2Var);
                return;
            }
            return;
        }
        this.d.l(c2Var);
        if (!this.e.j(c2Var)) {
            androidx.compose.runtime.collection.b bVar = this.c;
            if (!bVar.j(c2Var)) {
                f(c2Var, bVar);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(c2Var.a);
    }

    public final void g(Set set, androidx.compose.runtime.tooling.d dVar) {
        a();
        this.a = set;
        this.b = dVar;
    }
}
