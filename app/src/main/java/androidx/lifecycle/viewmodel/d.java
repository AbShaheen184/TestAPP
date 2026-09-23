package androidx.lifecycle.viewmodel;

import androidx.appcompat.widget.x;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.work.impl.k;
import com.app.mlounge.MainActivity;
import com.app.mlounge.h;
import com.app.mlounge.j;
import com.google.common.collect.f1;
import com.google.common.collect.q;
import dagger.hilt.android.internal.lifecycle.g;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x013d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0141  */
    /* JADX WARN: Code duplicated, block: B:22:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.lifecycle.u0
    public final s0 b(Class cls, e eVar) {
        f fVar;
        l lVar;
        s0 s0Var;
        Closeable closeable;
        androidx.lifecycle.viewmodel.internal.d dVar;
        s0 s0Var2 = null;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.e eVarA = a0.a(cls);
                f[] fVarArr = (f[]) this.b;
                f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
                int length = fVarArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        fVar = fVarArr2[i];
                        if (!fVar.a.equals(eVarA)) {
                            i++;
                        }
                    } else {
                        fVar = null;
                    }
                }
                s0 s0Var3 = (fVar == null || (lVar = fVar.b) == null) ? null : (s0) lVar.invoke(eVar);
                if (s0Var3 != null) {
                    return s0Var3;
                }
                kotlinx.coroutines.future.a.p(eVarA.b(), "No initializer set for given class ");
                return null;
            case 1:
                final g gVar = new g();
                k kVar = (k) this.b;
                j jVar = new j((h) kVar.y, (com.app.mlounge.f) kVar.z, m0.b(eVar));
                j jVar2 = (j) ((dagger.hilt.android.internal.lifecycle.d) n.r(jVar, dagger.hilt.android.internal.lifecycle.d.class));
                jVar2.getClass();
                q.f(17, "expectedSize");
                x xVar = new x(17);
                xVar.q("com.app.mlounge.ui.viewmodel.c", jVar2.b);
                xVar.q("com.app.mlounge.ui.viewmodel.g", jVar2.c);
                xVar.q("com.app.mlounge.ui.viewmodel.k", jVar2.d);
                xVar.q("com.app.mlounge.ui.viewmodel.o", jVar2.e);
                xVar.q("com.app.mlounge.ui.viewmodel.r", jVar2.f);
                xVar.q("com.app.mlounge.ui.viewmodel.s", jVar2.g);
                xVar.q("com.app.mlounge.ui.viewmodel.a0", jVar2.h);
                xVar.q("com.app.mlounge.ui.viewmodel.f0", jVar2.i);
                xVar.q("com.app.mlounge.ui.viewmodel.j0", jVar2.j);
                xVar.q("com.app.mlounge.ui.viewmodel.k0", jVar2.k);
                xVar.q("com.app.mlounge.ui.screens.player.a1", jVar2.l);
                xVar.q("com.app.mlounge.ui.viewmodel.b1", jVar2.m);
                xVar.q("com.app.mlounge.ui.viewmodel.h1", jVar2.n);
                xVar.q("com.app.mlounge.ui.viewmodel.p1", jVar2.o);
                xVar.q("com.app.mlounge.ui.viewmodel.w1", jVar2.p);
                xVar.q("com.app.mlounge.ui.viewmodel.b2", jVar2.q);
                xVar.q("com.app.mlounge.ui.viewmodel.d2", jVar2.r);
                javax.inject.a aVar = (javax.inject.a) xVar.e(true).get(cls.getName());
                l lVar2 = (l) eVar.a.get(dagger.hilt.android.internal.lifecycle.e.d);
                ((dagger.hilt.android.internal.lifecycle.d) n.r(jVar, dagger.hilt.android.internal.lifecycle.d.class)).getClass();
                Object obj = f1.D.get(cls);
                if (obj == null) {
                    if (lVar2 != null) {
                        com.google.firebase.platforminfo.b.e(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                    } else if (aVar != null) {
                        s0Var = (s0) aVar.get();
                        s0Var2 = s0Var;
                        closeable = new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.b
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                gVar.a();
                            }
                        };
                        s0Var2.getClass();
                        dVar = s0Var2.a;
                        if (dVar != null) {
                            if (dVar.d) {
                                androidx.lifecycle.viewmodel.internal.d.a(closeable);
                            } else {
                                synchronized (dVar.a) {
                                    dVar.c.add(closeable);
                                }
                            }
                        }
                    } else {
                        com.google.firebase.platforminfo.b.e(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                    }
                } else {
                    if (aVar != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (lVar2 != null) {
                        s0Var = (s0) lVar2.invoke(obj);
                        s0Var2 = s0Var;
                        closeable = new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.b
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                gVar.a();
                            }
                        };
                        s0Var2.getClass();
                        dVar = s0Var2.a;
                        if (dVar != null) {
                            if (dVar.d) {
                                androidx.lifecycle.viewmodel.internal.d.a(closeable);
                            } else {
                                synchronized (dVar.a) {
                                    dVar.c.add(closeable);
                                }
                            }
                        }
                    } else {
                        com.google.firebase.platforminfo.b.e(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                    }
                }
                return s0Var2;
            default:
                return new dagger.hilt.android.internal.managers.d(new com.app.mlounge.f(((h) ((dagger.hilt.android.internal.managers.c) n.r(dagger.hilt.android.internal.a.c(((MainActivity) this.b).getApplicationContext()), dagger.hilt.android.internal.managers.c.class))).b), new androidx.core.text.f(eVar));
        }
    }
}
