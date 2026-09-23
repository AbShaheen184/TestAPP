package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.s2;
import androidx.lifecycle.t;
import androidx.transition.k;
import androidx.work.impl.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.e.get(str);
        if ((eVar != null ? eVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                eVar.a.c(eVar.b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new a(intent, i2));
        return true;
    }

    public abstract void b(int i, androidx.activity.result.contract.a aVar, Object obj);

    public final void c(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        androidx.activity.compose.b bVar = new androidx.activity.compose.b(4);
        for (Number number : new kotlin.sequences.a(new kotlin.io.h(2, bVar, new s2(bVar, 26)))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        k.m("Sequence contains no element matching the predicate.");
    }

    public final void d(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Dropping pending result for request ", str, ": ");
            sbX.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbX.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) v.A(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        f fVar = (f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.a.b((t) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
