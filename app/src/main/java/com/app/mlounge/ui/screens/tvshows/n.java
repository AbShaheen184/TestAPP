package com.app.mlounge.ui.screens.tvshows;

import com.app.mlounge.ui.t;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ kotlin.d z;

    public /* synthetic */ n(kotlin.d dVar, List list, int i) {
        this.e = i;
        this.z = dVar;
        this.y = list;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return ((t) this.z).invoke(((List) this.y).get(((Number) obj).intValue()));
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.sources.b) this.z).invoke(Integer.valueOf(iIntValue), ((List) this.y).get(iIntValue));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.sources.b) this.z).invoke(Integer.valueOf(iIntValue2), this.y.get(iIntValue2));
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.sources.b) this.z).invoke(Integer.valueOf(iIntValue3), ((List) this.y).get(iIntValue3));
            default:
                int iIntValue4 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.sources.b) this.z).invoke(Integer.valueOf(iIntValue4), ((List) this.y).get(iIntValue4));
        }
    }
}
