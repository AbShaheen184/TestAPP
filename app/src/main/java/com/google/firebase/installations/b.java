package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.material.internal.k;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ c y;

    public /* synthetic */ b(c cVar, int i) {
        this.e = i;
        this.y = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.installations.local.b bVarZ;
        com.google.firebase.installations.local.b bVarG;
        switch (this.e) {
            case 0:
                this.y.a();
                return;
            case 1:
                this.y.a();
                return;
            default:
                c cVar = this.y;
                Object obj = c.m;
                synchronized (obj) {
                    try {
                        com.google.firebase.g gVar = cVar.a;
                        gVar.a();
                        k kVarC = k.c(gVar.a);
                        try {
                            bVarZ = cVar.c.z();
                            if (kVarC != null) {
                                kVarC.B();
                            }
                        } catch (Throwable th) {
                            if (kVarC != null) {
                                kVarC.B();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = bVarZ.b;
                    if (i == 5) {
                        bVarG = cVar.g(bVarZ);
                    } else {
                        if (i == 3) {
                            bVarG = cVar.g(bVarZ);
                        } else if (!cVar.d.a(bVarZ)) {
                            return;
                        } else {
                            bVarG = cVar.b(bVarZ);
                        }
                    }
                    synchronized (obj) {
                        try {
                            com.google.firebase.g gVar2 = cVar.a;
                            gVar2.a();
                            k kVarC2 = k.c(gVar2.a);
                            try {
                                cVar.c.u(bVarG);
                                if (kVarC2 != null) {
                                    kVarC2.B();
                                }
                            } catch (Throwable th3) {
                                if (kVarC2 != null) {
                                    kVarC2.B();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.k.size() != 0 && !TextUtils.equals(bVarZ.a, bVarG.a)) {
                                Iterator it = cVar.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (bVarG.b == 4) {
                        String str = bVarG.a;
                        synchronized (cVar) {
                            cVar.j = str;
                        }
                    }
                    int i2 = bVarG.b;
                    if (i2 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (e e) {
                    cVar.h(e);
                    return;
                }
        }
    }
}
