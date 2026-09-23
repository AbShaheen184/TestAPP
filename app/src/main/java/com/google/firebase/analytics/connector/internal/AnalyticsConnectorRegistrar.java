package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.measurement.internal.y;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.tasks.r;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.j;
import com.google.firebase.components.l;
import com.google.firebase.g;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.analytics.connector.a lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        com.google.firebase.events.c cVar2 = (com.google.firebase.events.c) cVar.a(com.google.firebase.events.c.class);
        x.g(gVar);
        x.g(context);
        x.g(cVar2);
        x.g(context.getApplicationContext());
        if (com.google.firebase.analytics.connector.b.c == null) {
            synchronized (com.google.firebase.analytics.connector.b.class) {
                try {
                    if (com.google.firebase.analytics.connector.b.c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.b)) {
                            ((l) cVar2).a(r.y, z.U);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        com.google.firebase.analytics.connector.b.c = new com.google.firebase.analytics.connector.b(a7.c(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return com.google.firebase.analytics.connector.b.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.analytics.connector.a.class);
        aVarB.a(j.b(g.class));
        aVarB.a(j.b(Context.class));
        aVarB.a(j.b(com.google.firebase.events.c.class));
        aVarB.f = y.U;
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), coil3.network.g.j("fire-analytics", "23.2.0"));
    }
}
