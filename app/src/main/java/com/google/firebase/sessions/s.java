package com.google.firebase.sessions;

import android.content.Context;
import androidx.compose.runtime.s2;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a = 1;
    public final com.google.firebase.sessions.dagger.internal.c b;
    public final com.google.firebase.sessions.dagger.internal.c c;
    public final com.google.firebase.sessions.dagger.internal.c d;

    public s(com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2, com.google.firebase.sessions.dagger.internal.c cVar3) {
        this.b = cVar;
        this.c = cVar2;
        this.d = cVar3;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) ((m0) this.d).b;
                kotlin.coroutines.j jVar = (kotlin.coroutines.j) this.b.get();
                l0 l0Var = (l0) this.c.get();
                context.getClass();
                jVar.getClass();
                l0Var.getClass();
                return p.a(l0Var, new androidx.compose.ui.draw.i(new s2(l0Var, 23)), CoroutineScopeKt.CoroutineScope(jVar), new androidx.navigation.compose.o(context, 5));
            default:
                return new com.google.firebase.sessions.settings.n((kotlin.coroutines.j) this.b.get(), (j1) this.c.get(), (androidx.datastore.core.e) this.d.get());
        }
    }

    public s(m0 m0Var, com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2) {
        this.d = m0Var;
        this.b = cVar;
        this.c = cVar2;
    }
}
