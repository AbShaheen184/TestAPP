package org.schabi.newpipe.extractor.services.youtube.extractors;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends c0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.grack.nanojson.c cVar, com.google.android.material.internal.k kVar, boolean z, p pVar) {
        super(cVar, kVar);
        this.i = z;
        this.j = pVar;
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.c0, org.schabi.newpipe.extractor.stream.h
    public final String b() {
        return this.i ? this.j.X() : super.b();
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.c0, org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return this.i ? this.j.V() : super.e();
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.c0
    public final boolean v() {
        return this.i;
    }
}
