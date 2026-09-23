package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static final androidx.compose.ui.r a = androidx.compose.foundation.layout.i1.m(androidx.compose.ui.o.b, androidx.compose.material3.tokens.z.d);

    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    public static final void a(final androidx.compose.ui.graphics.painter.b bVar, final String str, final androidx.compose.ui.r rVar, final long j, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        androidx.compose.ui.r rVarA;
        sVar.c0(-2142239481);
        if ((i & 6) == 0) {
            i2 = (sVar.h(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.e(j) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            sVar.Y();
            if ((i & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && sVar.e(j)) || (i2 & 3072) == 2048;
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (z || objQ == fVar) {
                objQ = androidx.compose.ui.graphics.t.c(j, androidx.compose.ui.graphics.t.i) ? null : new androidx.compose.ui.graphics.m(j, 5);
                sVar.l0(objQ);
            }
            androidx.compose.ui.graphics.m mVar = (androidx.compose.ui.graphics.m) objQ;
            androidx.compose.ui.r rVar2 = androidx.compose.ui.o.b;
            if (str != null) {
                sVar.b0(-536990979);
                boolean z2 = (i2 & Token.ASSIGN_MOD) == 32;
                Object objQ2 = sVar.Q();
                if (z2 || objQ2 == fVar) {
                    objQ2 = new r(str, 2);
                    sVar.l0(objQ2);
                }
                rVarA = androidx.compose.ui.semantics.q.a(rVar2, false, (kotlin.jvm.functions.l) objQ2);
                sVar.p(false);
            } else {
                sVar.b0(-536832197);
                sVar.p(false);
                rVarA = rVar2;
            }
            if (androidx.compose.ui.geometry.e.a(bVar.h(), 9205357640488583168L)) {
                rVar2 = a;
            } else {
                long jH = bVar.h();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jH >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jH & 4294967295L)))) {
                    rVar2 = a;
                }
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.ui.draw.h.f(rVar.d(rVar2), bVar, 0.0f, mVar, 22).d(rVarA), sVar, 0);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.p1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q1.a(bVar, str, rVar, j, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.graphics.vector.f fVar, String str, androidx.compose.ui.r rVar, long j, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        String str2;
        androidx.compose.runtime.s sVar2;
        final long j2;
        final androidx.compose.ui.r rVar2;
        sVar.c0(-126890956);
        if ((i & 6) == 0) {
            i3 = (sVar.f(fVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= sVar.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && sVar.e(j)) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (sVar.T(i3 & 1, (i3 & 1171) != 1170)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                if (i4 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                if ((i2 & 8) != 0) {
                    j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                    i3 &= -7169;
                }
            } else {
                sVar.W();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            androidx.compose.ui.r rVar3 = rVar;
            long j3 = j;
            sVar.q();
            str2 = str;
            sVar2 = sVar;
            a(androidx.compose.ui.graphics.vector.b.d(fVar, sVar), str2, rVar3, j3, sVar2, (i3 & Token.ASSIGN_MOD) | 8 | (i3 & 896) | (i3 & 7168));
            rVar2 = rVar3;
            j2 = j3;
        } else {
            str2 = str;
            sVar2 = sVar;
            sVar2.W();
            j2 = j;
            rVar2 = rVar;
        }
        androidx.compose.runtime.s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            final String str3 = str2;
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.o1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q1.b(fVar, str3, rVar2, j2, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }
}
