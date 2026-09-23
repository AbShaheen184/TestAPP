package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.q;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.b> getComponents() {
        com.google.firebase.components.a aVarA = com.google.firebase.components.b.a(new r(com.google.firebase.annotations.concurrent.a.class, CoroutineDispatcher.class));
        aVarA.a(new com.google.firebase.components.j(new r(com.google.firebase.annotations.concurrent.a.class, Executor.class), 1, 0));
        aVarA.f = h.y;
        com.google.firebase.components.b bVarB = aVarA.b();
        com.google.firebase.components.a aVarA2 = com.google.firebase.components.b.a(new r(com.google.firebase.annotations.concurrent.c.class, CoroutineDispatcher.class));
        aVarA2.a(new com.google.firebase.components.j(new r(com.google.firebase.annotations.concurrent.c.class, Executor.class), 1, 0));
        aVarA2.f = h.z;
        com.google.firebase.components.b bVarB2 = aVarA2.b();
        com.google.firebase.components.a aVarA3 = com.google.firebase.components.b.a(new r(com.google.firebase.annotations.concurrent.b.class, CoroutineDispatcher.class));
        aVarA3.a(new com.google.firebase.components.j(new r(com.google.firebase.annotations.concurrent.b.class, Executor.class), 1, 0));
        aVarA3.f = h.A;
        com.google.firebase.components.b bVarB3 = aVarA3.b();
        com.google.firebase.components.a aVarA4 = com.google.firebase.components.b.a(new r(com.google.firebase.annotations.concurrent.d.class, CoroutineDispatcher.class));
        aVarA4.a(new com.google.firebase.components.j(new r(com.google.firebase.annotations.concurrent.d.class, Executor.class), 1, 0));
        aVarA4.f = h.B;
        return q.k(bVarB, bVarB2, bVarB3, aVarA4.b());
    }
}
