package org.schabi.newpipe.extractor.services.youtube.extractors;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ p g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.grack.nanojson.c cVar, com.google.android.material.internal.k kVar, boolean z, p pVar) {
        super(cVar, kVar);
        this.f = z;
        this.g = pVar;
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.a0, org.schabi.newpipe.extractor.stream.h
    public final String b() {
        return this.f ? this.g.X() : super.b();
    }

    @Override // org.schabi.newpipe.extractor.services.youtube.extractors.a0, org.schabi.newpipe.extractor.stream.h
    public final String e() {
        return this.f ? this.g.V() : super.e();
    }
}
