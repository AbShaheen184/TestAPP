package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.google.android.material.internal.k b;

    public /* synthetic */ g(com.google.android.material.internal.k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        com.grack.nanojson.c cVar = (com.grack.nanojson.c) obj;
        switch (this.a) {
            case 0:
                return new a0(cVar.e("playlistPanelVideoRenderer"), this.b);
            default:
                boolean zContainsKey = cVar.containsKey("compactVideoRenderer");
                com.google.android.material.internal.k kVar = this.b;
                if (zContainsKey) {
                    return new a0(cVar.e("compactVideoRenderer"), kVar);
                }
                if (cVar.containsKey("compactRadioRenderer")) {
                    return new e(cVar.e("compactRadioRenderer"));
                }
                if (cVar.containsKey("compactPlaylistRenderer")) {
                    return new e(cVar.e("compactPlaylistRenderer"));
                }
                if (cVar.containsKey("lockupViewModel")) {
                    com.grack.nanojson.c cVarE = cVar.e("lockupViewModel");
                    String strF = cVarE.f("contentType", null);
                    if ("LOCKUP_CONTENT_TYPE_PLAYLIST".equals(strF) || "LOCKUP_CONTENT_TYPE_PODCAST".equals(strF)) {
                        return new f(cVarE);
                    }
                    if ("LOCKUP_CONTENT_TYPE_VIDEO".equals(strF)) {
                        return new c0(cVarE, kVar);
                    }
                }
                return null;
        }
    }
}
