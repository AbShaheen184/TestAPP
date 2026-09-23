package com.google.firebase.components;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements com.google.firebase.inject.b {
    public static final com.google.firebase.i c = new com.google.firebase.i(4);
    public static final f d = new f(1);
    public com.google.firebase.inject.a a;
    public volatile com.google.firebase.inject.b b;

    public p(com.google.firebase.i iVar, com.google.firebase.inject.b bVar) {
        this.a = iVar;
        this.b = bVar;
    }

    public final void a(com.google.firebase.inject.a aVar) {
        com.google.firebase.inject.b bVar;
        com.google.firebase.inject.b bVar2;
        com.google.firebase.inject.b bVar3 = this.b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.a = new androidx.media3.exoplayer.analytics.c(9, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override // com.google.firebase.inject.b
    public final Object get() {
        return this.b.get();
    }
}
