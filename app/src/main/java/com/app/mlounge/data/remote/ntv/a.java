package com.app.mlounge.data.remote.ntv;

import java.net.URI;
import kotlin.collections.d0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ URI y;
    public final /* synthetic */ String z;

    public /* synthetic */ a(URI uri, String str, int i) {
        this.e = i;
        this.y = uri;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                str.getClass();
                String string = kotlin.text.k.g0(str).toString();
                if (string.length() == 0 || kotlin.text.r.u(string, "#EXTM3U", false)) {
                    return str;
                }
                boolean zU = kotlin.text.r.u(string, "#", false);
                URI uri = this.y;
                String str2 = this.z;
                return zU ? new kotlin.text.i("URI=\"([^\"]+)\"").f(str, new a(uri, str2, 1)) : d.f(uri, str2, string);
            default:
                kotlin.text.g gVar = (kotlin.text.g) obj;
                gVar.getClass();
                return androidx.privacysandbox.ads.adservices.java.internal.a.r("URI=\"", d.f(this.y, this.z, (String) ((d0) gVar.a()).get(1)), "\"");
        }
    }
}
