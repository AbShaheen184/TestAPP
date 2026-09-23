package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.caverock.androidsvg.x1;
import com.google.firebase.components.r;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements com.google.firebase.components.e {
    public final /* synthetic */ int e;
    public final /* synthetic */ r y;

    public /* synthetic */ b(r rVar, int i) {
        this.e = i;
        this.y = rVar;
    }

    @Override // com.google.firebase.components.e
    public final Object g(x1 x1Var) {
        switch (this.e) {
            case 0:
                return new d((Context) x1Var.a(Context.class), ((com.google.firebase.g) x1Var.a(com.google.firebase.g.class)).d(), x1Var.d(r.a(e.class)), x1Var.c(com.google.firebase.platforminfo.c.class), (Executor) x1Var.f(this.y));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.y, x1Var);
        }
    }
}
