package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function {
    public final /* synthetic */ y a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ v(y yVar, boolean z) {
        this.a = yVar;
        this.b = z;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        a aVar = (a) obj;
        org.schabi.newpipe.extractor.services.youtube.a aVar2 = aVar.y;
        String strValueOf = String.valueOf(aVar2.y);
        String str = aVar.e;
        boolean z = aVar.z;
        org.schabi.newpipe.extractor.i iVar = aVar2.e;
        String str2 = aVar2.A;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        int i = 2;
        if (this.a.r == 2 && z) {
            i = 1;
        }
        if (strValueOf != null) {
            return new org.schabi.newpipe.extractor.stream.j(str, z, iVar, i, str3, this.b, aVar2);
        }
        kotlinx.coroutines.future.a.u("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
        return null;
    }
}
