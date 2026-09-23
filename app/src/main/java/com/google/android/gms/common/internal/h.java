package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.caverock.androidsvg.x1;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends e implements com.google.android.gms.common.api.c {
    public final Set V;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, Looper looper, int i, x1 x1Var, com.google.android.gms.common.api.g gVar, com.google.android.gms.common.api.h hVar) {
        i0 i0VarA = i0.a(context);
        com.google.android.gms.common.e eVar = com.google.android.gms.common.e.d;
        x.g(gVar);
        x.g(hVar);
        super(context, looper, i0VarA, eVar, i, new androidx.media3.exoplayer.hls.c(gVar, 23), new androidx.media3.exoplayer.dash.manifest.t(hVar), (String) x1Var.d);
        Set set = (Set) x1Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                kotlinx.coroutines.future.a.u("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.V = set;
    }

    @Override // com.google.android.gms.common.api.c
    public final Set b() {
        return l() ? this.V : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.e
    public final Account p() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.e
    public final Set s() {
        return this.V;
    }
}
