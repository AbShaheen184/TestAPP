package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.platforminfo.c.class);
        aVarB.a(new com.google.firebase.components.j(2, 0, com.google.firebase.platforminfo.a.class));
        aVarB.f = new com.google.firebase.platforminfo.b(0);
        arrayList.add(aVarB.b());
        r rVar = new r(com.google.firebase.annotations.concurrent.a.class, Executor.class);
        com.google.firebase.components.a aVar = new com.google.firebase.components.a(com.google.firebase.heartbeatinfo.d.class, new Class[]{com.google.firebase.heartbeatinfo.f.class, com.google.firebase.heartbeatinfo.g.class});
        aVar.a(com.google.firebase.components.j.b(Context.class));
        aVar.a(com.google.firebase.components.j.b(g.class));
        aVar.a(new com.google.firebase.components.j(2, 0, com.google.firebase.heartbeatinfo.e.class));
        aVar.a(new com.google.firebase.components.j(1, 1, com.google.firebase.platforminfo.c.class));
        aVar.a(new com.google.firebase.components.j(rVar, 1, 0));
        aVar.f = new com.google.firebase.heartbeatinfo.b(rVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(coil3.network.g.j("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(coil3.network.g.j("fire-core", "22.0.1"));
        arrayList.add(coil3.network.g.j("device-name", a(Build.PRODUCT)));
        arrayList.add(coil3.network.g.j("device-model", a(Build.DEVICE)));
        arrayList.add(coil3.network.g.j("device-brand", a(Build.BRAND)));
        arrayList.add(coil3.network.g.p("android-target-sdk", new i(0)));
        arrayList.add(coil3.network.g.p("android-min-sdk", new i(1)));
        arrayList.add(coil3.network.g.p("android-platform", new i(2)));
        arrayList.add(coil3.network.g.p("android-installer", new i(3)));
        try {
            kotlin.g.y.getClass();
            str = "2.3.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(coil3.network.g.j("kotlin", str));
        }
        return arrayList;
    }
}
