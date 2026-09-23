package com.google.firebase.crashlytics.internal.concurrency;

import androidx.media3.exoplayer.source.a0;
import com.google.android.gms.tasks.i;
import com.google.android.gms.tasks.j;
import com.google.android.gms.tasks.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.arch.core.executor.a a = new androidx.arch.core.executor.a(2);

    public static s a(i iVar, i iVar2) {
        com.google.android.gms.tasks.a aVar = new com.google.android.gms.tasks.a();
        j jVar = new j(aVar.a);
        a0 a0Var = new a0(8, jVar, new AtomicBoolean(false), aVar);
        androidx.arch.core.executor.a aVar2 = a;
        iVar.d(aVar2, a0Var);
        iVar2.d(aVar2, a0Var);
        return jVar.a;
    }
}
