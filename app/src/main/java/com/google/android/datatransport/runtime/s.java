package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.room.b0;
import com.appsalt.internal.k0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static volatile l e;
    public final com.google.android.datatransport.runtime.time.a a;
    public final com.google.android.datatransport.runtime.time.a b;
    public final com.google.android.datatransport.runtime.scheduling.a c;
    public final k0 d;

    public s(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.a aVar3, k0 k0Var, com.google.firebase.messaging.n nVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = k0Var;
        ((Executor) nVar.y).execute(new androidx.work.p(nVar, 1));
    }

    public static s a() {
        l lVar = e;
        if (lVar != null) {
            return (s) lVar.C.get();
        }
        kotlinx.coroutines.future.a.u("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        androidx.media3.exoplayer.mediacodec.g gVar = new androidx.media3.exoplayer.mediacodec.g();
                        context.getClass();
                        gVar.e = context;
                        e = gVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final r c(com.google.android.datatransport.cct.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar instanceof com.google.android.datatransport.cct.a ? Collections.unmodifiableSet(com.google.android.datatransport.cct.a.d) : Collections.singleton(new com.google.android.datatransport.c("proto"));
        j jVarA = k.a();
        aVar.getClass();
        jVarA.y = "cct";
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = b0.e("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        jVarA.z = bytes;
        return new r(setUnmodifiableSet, jVarA.n(), this);
    }
}
