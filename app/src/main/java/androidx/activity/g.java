package androidx.activity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.savedstate.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.d
    public final Bundle a() {
        kotlin.k[] kVarArr;
        switch (this.a) {
            case 0:
                return p.b((p) this.b);
            case 1:
                Map mapB = ((androidx.compose.runtime.saveable.h) this.b).b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapB.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                androidx.compose.runtime.internal.c cVar = (androidx.compose.runtime.internal.c) this.b;
                for (Map.Entry entry2 : kotlin.collections.c0.o((LinkedHashMap) cVar.A).entrySet()) {
                    cVar.F(((MutableStateFlow) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : kotlin.collections.c0.o((LinkedHashMap) cVar.y).entrySet()) {
                    cVar.F(((androidx.savedstate.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.e;
                if (linkedHashMap.isEmpty()) {
                    kVarArr = new kotlin.k[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new kotlin.k((String) entry4.getKey(), entry4.getValue()));
                    }
                    kVarArr = (kotlin.k[]) arrayList.toArray(new kotlin.k[0]);
                }
                return coil3.network.g.f((kotlin.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        }
    }
}
