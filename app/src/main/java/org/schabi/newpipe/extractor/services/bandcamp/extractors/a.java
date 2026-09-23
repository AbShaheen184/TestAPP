package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.constraintlayout.core.g;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                org.schabi.newpipe.extractor.utils.c cVar = (org.schabi.newpipe.extractor.utils.c) obj;
                return new org.schabi.newpipe.extractor.a(cVar.y, g.c(this.b, cVar.e), cVar.z, cVar.A);
            case 1:
                return ((com.grack.nanojson.c) obj).e(this.b).f("url", "");
            case 2:
                com.grack.nanojson.c cVar2 = (com.grack.nanojson.c) obj;
                return new org.schabi.newpipe.extractor.a(-1, g.c(this.b, cVar2.f("path", null)), cVar2.c("width", -1), 4);
            case 3:
                org.schabi.newpipe.extractor.utils.c cVar3 = (org.schabi.newpipe.extractor.utils.c) obj;
                return new org.schabi.newpipe.extractor.a(cVar3.y, String.format(this.b, cVar3.e), cVar3.z, cVar3.A);
            case 4:
                return this.b;
            case 5:
                org.schabi.newpipe.extractor.utils.c cVar4 = (org.schabi.newpipe.extractor.utils.c) obj;
                return new org.schabi.newpipe.extractor.a(cVar4.y, this.b.concat(cVar4.e), cVar4.z, cVar4.A);
            default:
                return ((com.grack.nanojson.c) obj).e(this.b);
        }
    }
}
