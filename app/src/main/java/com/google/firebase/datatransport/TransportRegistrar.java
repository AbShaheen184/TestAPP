package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import coil3.network.g;
import com.google.android.datatransport.f;
import com.google.android.datatransport.runtime.s;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.j;
import com.google.firebase.components.r;
import com.google.firebase.i;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(com.google.android.datatransport.cct.a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(com.google.android.datatransport.cct.a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(com.google.android.datatransport.cct.a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(f.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(j.b(Context.class));
        aVarB.f = new i(20);
        com.google.firebase.components.b bVarB = aVarB.b();
        com.google.firebase.components.a aVarA = com.google.firebase.components.b.a(new r(a.class, f.class));
        aVarA.a(j.b(Context.class));
        aVarA.f = new i(21);
        com.google.firebase.components.b bVarB2 = aVarA.b();
        com.google.firebase.components.a aVarA2 = com.google.firebase.components.b.a(new r(b.class, f.class));
        aVarA2.a(j.b(Context.class));
        aVarA2.f = new i(22);
        return Arrays.asList(bVarB, bVarB2, aVarA2.b(), g.j(LIBRARY_NAME, "19.0.0"));
    }
}
