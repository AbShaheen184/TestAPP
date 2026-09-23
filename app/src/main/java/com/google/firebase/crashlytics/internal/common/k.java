package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.appsalt.internal.k0;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ k0 d;
    public final /* synthetic */ m e;

    public k(m mVar, long j, Throwable th, Thread thread, k0 k0Var) {
        this.e = mVar;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = k0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.a;
        long j2 = j / 1000;
        m mVar = this.e;
        String strE = mVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return org.jsoup.helper.n.o(null);
        }
        mVar.c.p();
        com.google.firebase.crashlytics.internal.persistence.c cVar = mVar.m;
        cVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        cVar.h(this.b, this.c, "crash", new com.google.firebase.crashlytics.internal.metadata.c(strE, j2, x.e), true);
        try {
            com.google.firebase.crashlytics.internal.persistence.c cVar2 = mVar.g;
            String str = ".ae" + j;
            cVar2.getClass();
            if (!new File((File) cVar2.c, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        k0 k0Var = this.d;
        mVar.b(false, k0Var, false);
        mVar.c(new e().a, Boolean.FALSE);
        return !mVar.b.a() ? org.jsoup.helper.n.o(null) : ((com.google.android.gms.tasks.j) ((AtomicReference) k0Var.i).get()).a.i(mVar.e.a, new com.google.android.material.behavior.d(this, strE));
    }
}
