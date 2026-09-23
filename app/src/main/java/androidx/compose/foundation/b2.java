package androidx.compose.foundation;

import androidx.compose.material3.j5;
import androidx.compose.material3.k5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;

    public /* synthetic */ b2(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x01e4 A[LOOP:1: B:41:0x019d->B:54:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return Integer.valueOf(((c2) obj2).a.g());
            case 1:
                return Integer.valueOf(Math.round((1 + (((androidx.compose.ui.unit.m) obj2) != androidx.compose.ui.unit.m.e ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 2:
                return Integer.valueOf(((androidx.compose.foundation.layout.u1) obj).c((androidx.compose.ui.unit.c) obj2));
            case 3:
                androidx.compose.foundation.lazy.y yVar = (androidx.compose.foundation.lazy.y) obj2;
                return kotlin.collections.q.k(Integer.valueOf(yVar.g()), Integer.valueOf(yVar.h()));
            case 4:
                ((Integer) obj2).intValue();
                return new androidx.compose.foundation.lazy.grid.b(coil3.svg.internal.a.a(1));
            case 5:
                androidx.compose.foundation.lazy.grid.x xVar = (androidx.compose.foundation.lazy.grid.x) obj2;
                return kotlin.collections.q.k(Integer.valueOf(xVar.g()), Integer.valueOf(xVar.d.c.g()));
            case 6:
                Map mapB = ((androidx.compose.foundation.lazy.layout.w0) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case 7:
                androidx.compose.foundation.text.i1 i1Var = (androidx.compose.foundation.text.i1) obj2;
                return kotlin.collections.q.k(Float.valueOf(i1Var.a.g()), Boolean.valueOf(((androidx.compose.foundation.gestures.o1) i1Var.f.getValue()) == androidx.compose.foundation.gestures.o1.e));
            case 8:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).a0(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).B(((Integer) obj2).intValue()));
            case 10:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).b(((Integer) obj2).intValue()));
            case 11:
                return Integer.valueOf(((androidx.compose.ui.layout.p0) obj).v(((Integer) obj2).intValue()));
            case 12:
                return (k5) ((j5) obj2).c.g.getValue();
            case 13:
                androidx.compose.runtime.saveable.e eVar = (androidx.compose.runtime.saveable.e) obj2;
                Map map = eVar.e;
                androidx.collection.o0 o0Var = eVar.y;
                Object[] objArr = o0Var.b;
                Object[] objArr2 = o0Var.c;
                long[] jArr = o0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapB2 = ((androidx.compose.runtime.saveable.g) objArr2[i4]).b();
                                    if (mapB2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapB2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 14:
                return obj2;
            case 15:
                androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) obj2;
                return kotlin.collections.q.a(gVar.y, androidx.compose.ui.text.c0.a(gVar.e, androidx.compose.ui.text.c0.a, (androidx.compose.runtime.saveable.c) obj));
            case 16:
                return Integer.valueOf(((androidx.compose.ui.text.style.l) obj2).a);
            case 17:
                androidx.compose.ui.text.style.p pVar = (androidx.compose.ui.text.style.p) obj2;
                return kotlin.collections.q.a(Float.valueOf(pVar.a), Float.valueOf(pVar.b));
            case 18:
                androidx.compose.runtime.saveable.c cVar = (androidx.compose.runtime.saveable.c) obj;
                androidx.compose.ui.text.style.q qVar = (androidx.compose.ui.text.style.q) obj2;
                androidx.compose.ui.unit.o oVar = new androidx.compose.ui.unit.o(qVar.a);
                androidx.compose.ui.text.b0 b0Var = androidx.compose.ui.text.c0.v;
                return kotlin.collections.q.a(androidx.compose.ui.text.c0.a(oVar, b0Var, cVar), androidx.compose.ui.text.c0.a(new androidx.compose.ui.unit.o(qVar.b), b0Var, cVar));
            case 19:
                return Integer.valueOf(((androidx.compose.ui.text.font.k) obj2).e);
            case 20:
                androidx.compose.ui.text.l lVar = (androidx.compose.ui.text.l) obj2;
                return kotlin.collections.q.a(lVar.a, androidx.compose.ui.text.c0.a(lVar.b, androidx.compose.ui.text.c0.i, (androidx.compose.runtime.saveable.c) obj));
            case 21:
                return Float.valueOf(((androidx.compose.ui.text.style.a) obj2).a);
            case 22:
                androidx.compose.runtime.saveable.c cVar2 = (androidx.compose.runtime.saveable.c) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(androidx.compose.ui.text.c0.a((androidx.compose.ui.text.e) list.get(i5), androidx.compose.ui.text.c0.b, cVar2));
                }
                return arrayList;
            case 23:
                androidx.compose.ui.text.l0 l0Var = (androidx.compose.ui.text.l0) obj2;
                return kotlin.collections.q.a(Integer.valueOf((int) (l0Var.a >> 32)), Integer.valueOf((int) (l0Var.a & 4294967295L)));
            case 24:
                androidx.compose.runtime.saveable.c cVar3 = (androidx.compose.runtime.saveable.c) obj;
                androidx.compose.ui.graphics.m0 m0Var = (androidx.compose.ui.graphics.m0) obj2;
                return kotlin.collections.q.a(androidx.compose.ui.text.c0.a(new androidx.compose.ui.graphics.t(m0Var.a), androidx.compose.ui.text.c0.p, cVar3), androidx.compose.ui.text.c0.a(new androidx.compose.ui.geometry.b(m0Var.b), androidx.compose.ui.text.c0.x, cVar3), Float.valueOf(m0Var.c));
            case 25:
                return Integer.valueOf(((androidx.compose.ui.text.style.k) obj2).a);
            case 26:
                return Integer.valueOf(((androidx.compose.ui.text.style.m) obj2).a);
            case 27:
                return Integer.valueOf(((androidx.compose.ui.text.style.d) obj2).a);
            case 28:
                return Integer.valueOf(((androidx.compose.ui.text.font.i) obj2).a);
            default:
                return Integer.valueOf(((androidx.compose.ui.text.font.j) obj2).a);
        }
    }
}
