package androidx.compose.runtime;

import java.util.ArrayList;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ n1(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.collection.j0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.u0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.collection.j0] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.e;
        Object obj = this.y;
        switch (i) {
            case 0:
                ArrayList arrayList = ((o1) obj).a;
                androidx.collection.o0 o0Var = new androidx.collection.o0(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r5 = (u0) arrayList.get(i2);
                    Object obj2 = r5.b;
                    int i3 = r5.a;
                    Object t0Var = obj2 != null ? new t0(Integer.valueOf(i3), r5.b) : Integer.valueOf(i3);
                    int iF = o0Var.f(t0Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : o0Var.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof androidx.collection.j0) {
                            ?? r9 = (androidx.collection.j0) obj3;
                            r9.a(r5);
                            r5 = r9;
                        } else {
                            Object[] objArr = androidx.collection.u0.a;
                            ?? j0Var = new androidx.collection.j0(2);
                            j0Var.a(obj3);
                            j0Var.a(r5);
                            r5 = j0Var;
                        }
                    }
                    if (z) {
                        int i4 = ~iF;
                        o0Var.b[i4] = t0Var;
                        o0Var.c[i4] = r5;
                    } else {
                        o0Var.c[iF] = r5;
                    }
                }
                return new androidx.compose.runtime.collection.a(o0Var);
            default:
                return new androidx.work.impl.constraints.c[((Flow[]) obj).length];
        }
    }
}
