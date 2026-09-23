package com.google.firebase.sessions;

import android.content.Context;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a;
    public final m0 b;
    public final com.google.firebase.sessions.dagger.internal.c c;

    public r(com.google.firebase.sessions.dagger.internal.c cVar, m0 m0Var) {
        this.a = 2;
        this.c = cVar;
        this.b = m0Var;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.b;
                kotlin.coroutines.j jVar = (kotlin.coroutines.j) this.c.get();
                context.getClass();
                jVar.getClass();
                return p.a(com.google.firebase.sessions.settings.h.a, new androidx.compose.ui.draw.i(new com.app.mlounge.ui.viewmodel.q0(11)), CoroutineScopeKt.CoroutineScope(jVar), new androidx.navigation.compose.o(context, 4));
            case 1:
                return new f0((Context) this.b.b, (k1) this.c.get());
            default:
                return new com.google.firebase.sessions.settings.d((b) this.c.get(), (kotlin.coroutines.j) this.b.b);
        }
    }

    public /* synthetic */ r(m0 m0Var, com.google.firebase.sessions.dagger.internal.c cVar, int i) {
        this.a = i;
        this.b = m0Var;
        this.c = cVar;
    }
}
