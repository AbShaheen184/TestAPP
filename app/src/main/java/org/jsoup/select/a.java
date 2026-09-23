package org.jsoup.select;

import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ToIntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((p) obj).a();
            case 1:
                return ((org.schabi.newpipe.extractor.services.youtube.e) obj).c;
            default:
                return ((org.schabi.newpipe.extractor.services.youtube.e) obj).c;
        }
    }
}
