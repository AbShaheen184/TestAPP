package org.schabi.newpipe.extractor.stream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e {
    public final boolean B;
    public final String C;

    public i(String str, boolean z, org.schabi.newpipe.extractor.i iVar, String str2, boolean z2) {
        super(str, z, iVar, 1);
        this.C = str2;
        this.B = z2;
    }

    @Override // org.schabi.newpipe.extractor.stream.e
    public final boolean b(e eVar) {
        if (!super.b(eVar) || !(eVar instanceof i)) {
            return false;
        }
        i iVar = (i) eVar;
        return this.C.equals(iVar.C) && this.B == iVar.B;
    }
}
