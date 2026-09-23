package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ec implements com.google.common.base.q {
    public s5 A;
    public final String e;
    public final com.appsalt.internal.r0 y;
    public volatile int z = -1;

    public ec(String str, com.appsalt.internal.r0 r0Var) {
        this.e = str;
        this.y = r0Var;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    @Override // com.google.common.base.q
    public final Object get() {
        pc pcVarD;
        Object objA;
        androidx.collection.y0 y0Var;
        na naVar;
        if (ea.e == null) {
            Object obj = na.j;
            ea.e = new androidx.compose.runtime.snapshots.g(6);
        }
        Context context = (Context) na.k.get();
        Object objC = null;
        if (context == null) {
            synchronized (ea.c) {
            }
            kotlinx.coroutines.future.a.u("Must call PhenotypeContext.setContext() first");
            return null;
        }
        na naVar2 = na.l;
        if (naVar2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (na.j) {
                    try {
                        if (na.l != null) {
                            naVar = na.l;
                        } else {
                            naVar = (na) new oa(applicationContext, 0).get();
                            na.l = naVar;
                            h.h(Level.CONFIG, naVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        naVar2 = naVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        int i = this.z;
        if (i == -1 || i < ((AtomicInteger) this.A.y).get()) {
            synchronized (this) {
                try {
                    int i2 = this.z;
                    if (i2 == -1) {
                        na.b();
                        naVar2.getClass();
                        pcVarD = this.y.d(naVar2);
                        this.A = pcVarD.g;
                    } else {
                        pcVarD = null;
                    }
                    int i3 = ((AtomicInteger) this.A.y).get();
                    if (i2 < i3) {
                        na.b();
                        naVar2.getClass();
                        com.google.common.base.f fVarC = ka.c(naVar2.b);
                        if (fVarC.b()) {
                            ja jaVar = (ja) fVarC.a();
                            Uri uriA = la.a();
                            String str = this.e;
                            if (uriA != null) {
                                y0Var = (androidx.collection.y0) jaVar.a.get(uriA.toString());
                            } else {
                                jaVar.getClass();
                                y0Var = null;
                            }
                            String str2 = y0Var == null ? null : (String) y0Var.get(str);
                            if (str2 == null) {
                                objA = null;
                            } else {
                                try {
                                    objA = b(str2);
                                } catch (IOException | IllegalArgumentException e) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.e), e);
                                    objA = null;
                                }
                            }
                        } else {
                            objA = null;
                        }
                        if (pcVarD == null) {
                            pcVarD = this.y.d(naVar2);
                        }
                        String str3 = pcVarD.c;
                        int i4 = 1;
                        if (Build.VERSION.SDK_INT >= 26 && !naVar2.b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ListenableFuture listenableFutureA = naVar2.a().a(new rc(naVar2, str3));
                            listenableFutureA.a(new vc(listenableFutureA, i4), com.google.common.util.concurrent.d0.e);
                        }
                        Object obj2 = ((com.google.common.collect.f1) pcVarD.a().d).get(this.e);
                        if (obj2 != null) {
                            try {
                                objC = c(obj2);
                            } catch (IOException | ClassCastException e2) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.e), e2);
                            }
                        }
                        if (true != fVarC.b()) {
                            objA = objC;
                        }
                        if (objA == null) {
                            objA = a();
                        }
                        if (objA != null) {
                            e(objA);
                            this.z = i3;
                        }
                    } else {
                        objA = d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objA = d();
        }
        objA.getClass();
        return objA;
    }
}
