package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) {
        if (aVar.n0() != 9) {
            return this.a.b(aVar);
        }
        aVar.j0();
        return null;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        if (obj == null) {
            bVar.Y();
        } else {
            this.a.c(bVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}
