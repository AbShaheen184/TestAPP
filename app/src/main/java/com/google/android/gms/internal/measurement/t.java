package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparator {
    public final /* synthetic */ int e;

    public /* synthetic */ t(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                int iH = com.google.android.datatransport.runtime.a.h(obj);
                int iH2 = com.google.android.datatransport.runtime.a.h(obj2);
                if (iH != iH2) {
                    if (iH == 0 || iH2 == 0) {
                        throw null;
                    }
                    return iH - iH2;
                }
                int iE = androidx.constraintlayout.core.g.e(iH);
                if (iE == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iE == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iE == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iE == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
