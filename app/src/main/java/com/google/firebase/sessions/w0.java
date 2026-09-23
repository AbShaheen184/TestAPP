package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements com.google.firebase.sessions.dagger.internal.b {
    public final /* synthetic */ int a;
    public final com.google.firebase.sessions.dagger.internal.c b;
    public final com.google.firebase.sessions.dagger.internal.c c;

    public /* synthetic */ w0(com.google.firebase.sessions.dagger.internal.c cVar, com.google.firebase.sessions.dagger.internal.c cVar2, int i) {
        this.a = i;
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new v0((j1) this.b.get(), (k1) this.c.get());
            default:
                return new com.google.firebase.sessions.settings.j((com.google.firebase.sessions.settings.o) this.b.get(), (com.google.firebase.sessions.settings.o) this.c.get());
        }
    }
}
