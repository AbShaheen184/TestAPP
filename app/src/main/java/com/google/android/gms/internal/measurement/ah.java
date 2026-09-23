package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public final /* synthetic */ int a;

    public /* synthetic */ ah(int i) {
        this.a = i;
    }

    public final void a(kg kgVar, Iterator it, wg wgVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (!kgVar.c) {
                    kotlinx.coroutines.future.a.u("non repeating key");
                } else if (kgVar.d && ((f0) f0.y.get()).e > 20) {
                    while (it.hasNext()) {
                        wgVar.a(it.next(), kgVar.a);
                    }
                } else {
                    kgVar.a(it, wgVar);
                }
                break;
        }
    }

    private final void b(kg kgVar, Iterator it, wg wgVar) {
    }
}
