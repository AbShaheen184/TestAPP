package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.compose.foundation.text.selection.q0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.tasks.s;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final Context a;
    public final String b;
    public final androidx.work.impl.k c;
    public final b d;
    public final com.google.android.gms.common.api.internal.b e;
    public final Looper f;
    public final int g;
    public final com.google.android.gms.common.api.internal.a h;
    public final com.google.android.gms.common.api.internal.e i;

    public f(Context context, androidx.work.impl.k kVar, b bVar, e eVar) {
        x.h(context, "Null context is not permitted.");
        x.h(kVar, "Api must not be null.");
        x.h(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        x.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = kVar;
        this.d = bVar;
        this.f = eVar.b;
        this.e = new com.google.android.gms.common.api.internal.b(kVar, bVar, attributionTag);
        com.google.android.gms.common.api.internal.e eVarE = com.google.android.gms.common.api.internal.e.e(applicationContext);
        this.i = eVarE;
        this.g = eVarE.E.getAndIncrement();
        this.h = eVar.a;
        com.google.android.gms.internal.base.g gVar = eVarE.J;
        gVar.sendMessage(gVar.obtainMessage(7, this));
    }

    public final com.google.android.datatransport.runtime.j a() {
        com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(4, false);
        Set set = Collections.EMPTY_SET;
        if (((androidx.collection.h) jVar.z) == null) {
            jVar.z = new androidx.collection.h(0);
        }
        ((androidx.collection.h) jVar.z).addAll(set);
        Context context = this.a;
        jVar.A = context.getClass().getName();
        jVar.y = context.getPackageName();
        return jVar;
    }

    public final s b(int i, q0 q0Var) {
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        com.google.android.gms.common.api.internal.e eVar = this.i;
        eVar.getClass();
        r rVar = new r(new w(i, q0Var, jVar, this.h), eVar.F.get(), this);
        com.google.android.gms.internal.base.g gVar = eVar.J;
        gVar.sendMessage(gVar.obtainMessage(4, rVar));
        return jVar.a;
    }
}
