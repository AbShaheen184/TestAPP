package androidx.room.coroutines;

import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.measurement.internal.i1;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.u0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.collection.u {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i1 i1Var) {
        super(20);
        this.i = i1Var;
    }

    @Override // androidx.collection.u
    public final Object c(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.h) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((h) this.i).e.U(str);
            default:
                String str2 = (String) obj;
                com.google.android.gms.common.internal.x.d(str2);
                i1 i1Var = (i1) this.i;
                i1Var.w();
                com.google.android.gms.common.internal.x.d(str2);
                com.google.android.gms.measurement.internal.m mVar = i1Var.y.z;
                j4.U(mVar);
                com.google.android.datatransport.runtime.j jVarD0 = mVar.D0(str2);
                if (jVarD0 == null) {
                    return null;
                }
                u0 u0Var = ((p1) i1Var.e).C;
                p1.m(u0Var);
                u0Var.K.b(str2, "Populate EES config from database on cache miss. appId");
                i1Var.D(str2, i1Var.E(str2, (byte[]) jVarD0.z));
                g gVar = i1Var.H;
                synchronized (((com.google.android.gms.common.internal.k) gVar.g)) {
                    Set setEntrySet = ((androidx.collection.internal.b) gVar.f).e.entrySet();
                    setEntrySet.getClass();
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ((androidx.collection.internal.b) gVar.f).e.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (t5) linkedHashMap.get(str2);
        }
    }

    @Override // androidx.collection.u
    public void d(Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.h) {
            case 0:
                ((String) obj).getClass();
                ((androidx.sqlite.c) obj2).close();
                break;
            default:
                super.d(obj, obj2, obj3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(25);
        this.i = hVar;
    }
}
