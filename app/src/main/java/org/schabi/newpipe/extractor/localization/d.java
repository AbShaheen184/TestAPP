package org.schabi.newpipe.extractor.localization;

import com.google.android.material.internal.k;
import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(k kVar, String str, int i) {
        this.a = i;
        this.b = kVar;
        this.c = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.getClass();
                return ((Collection) ((Map.Entry) obj).getValue()).stream().anyMatch(new d(kVar, this.c, 1));
            default:
                return this.b.E(this.c, (String) obj);
        }
    }
}
