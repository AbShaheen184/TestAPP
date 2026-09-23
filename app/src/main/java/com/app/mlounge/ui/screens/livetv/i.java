package com.app.mlounge.ui.screens.livetv;

import java.util.Map;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.s;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ s y;

    public /* synthetic */ i(s sVar, int i) {
        this.e = i;
        this.y = sVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                Map map = (Map) obj3;
                str.getClass();
                str2.getClass();
                map.getClass();
                this.y.d(str, str2, map, "hls", null);
                break;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                Map map2 = (Map) obj3;
                str3.getClass();
                str4.getClass();
                map2.getClass();
                this.y.d(str3, str4, map2, "hls", null);
                break;
        }
        return y.a;
    }
}
