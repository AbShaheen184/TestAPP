package coil3.compose;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.core.r1;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.platform.x1;
import androidx.room.b0;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final j a = new j();
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e b;
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e c;

    static {
        Boolean bool = Boolean.FALSE;
        b = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e(bool);
        c = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e(bool);
    }

    public static final void a(Object obj, String str, androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar, androidx.compose.ui.layout.j jVar, androidx.compose.runtime.s sVar, int i, int i2) {
        kotlin.jvm.functions.l lVar2 = (i2 & 16) != 0 ? null : lVar;
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.B;
        coil3.p pVarA = coil3.s.a((Context) sVar.j(m0.b));
        int i3 = i << 3;
        int i4 = (i & Token.ELSE) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        b(new coil3.compose.internal.a(obj, (b) sVar.j(r.a), pVarA), str, rVar, i.T, lVar2, jVar2, jVar, sVar, (i4 & Token.ASSIGN_MOD) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x019a  */
    /* JADX WARN: Code duplicated, block: B:112:0x019e  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x0211  */
    /* JADX WARN: Code duplicated, block: B:127:0x0215  */
    /* JADX WARN: Code duplicated, block: B:132:0x023d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0244  */
    /* JADX WARN: Code duplicated, block: B:136:0x024a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0250  */
    /* JADX WARN: Code duplicated, block: B:140:0x0256  */
    /* JADX WARN: Code duplicated, block: B:142:0x025c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0262  */
    public static final void b(final coil3.compose.internal.a aVar, final String str, final androidx.compose.ui.r rVar, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.l lVar2, final androidx.compose.ui.e eVar, final androidx.compose.ui.layout.j jVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        String str2;
        androidx.compose.ui.layout.j jVar2;
        int i4;
        coil3.request.g gVar;
        Object obj;
        m mVar;
        int iHashCode;
        kotlin.jvm.functions.a aVar2;
        androidx.compose.ui.node.e eVar2;
        sVar.c0(1236588022);
        if ((i & 6) == 0) {
            i3 = (sVar.f(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= sVar.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.h(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.f(eVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            jVar2 = jVar;
            i3 |= sVar.f(jVar2) ? 1048576 : 524288;
        } else {
            jVar2 = jVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= sVar.c(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= sVar.f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= sVar.d(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar.g(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (sVar.T(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object obj2 = aVar.a;
            int i5 = coil3.compose.internal.g.b;
            sVar.b0(-329318062);
            boolean z = obj2 instanceof coil3.request.g;
            Object obj3 = androidx.compose.runtime.n.a;
            if (z) {
                sVar.b0(-1008942344);
                gVar = (coil3.request.g) obj2;
                if (gVar.s.g != null) {
                    sVar.b0(-1008902292);
                    sVar.p(false);
                    sVar.p(false);
                } else {
                    sVar.b0(-1008854118);
                    coil3.size.i iVarA = coil3.compose.internal.g.a(jVar, sVar);
                    boolean zF = sVar.f(obj2) | sVar.f(iVarA);
                    Object objQ = sVar.Q();
                    if (zF || objQ == obj3) {
                        coil3.request.d dVarA = coil3.request.g.a(gVar);
                        dVarA.l = iVarA;
                        objQ = dVarA.a();
                        sVar.l0(objQ);
                    }
                    gVar = (coil3.request.g) objQ;
                    b0.g(sVar, false, false, false);
                }
                obj = gVar.b;
                if (!(obj instanceof coil3.request.d)) {
                    kotlinx.coroutines.future.a.q("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                    return;
                }
                if (!(obj instanceof androidx.compose.ui.graphics.g)) {
                    coil3.compose.internal.g.c("ImageBitmap");
                    throw null;
                }
                if (!(obj instanceof androidx.compose.ui.graphics.vector.f)) {
                    coil3.compose.internal.g.c("ImageVector");
                    throw null;
                }
                if (!(obj instanceof androidx.compose.ui.graphics.painter.b)) {
                    coil3.compose.internal.g.c("Painter");
                    throw null;
                }
                if (gVar.c == null) {
                    kotlinx.coroutines.future.a.q("request.target must be null.");
                    return;
                }
                if (((androidx.lifecycle.p) coil3.l.d(gVar, coil3.request.i.e)) == null) {
                    kotlinx.coroutines.future.a.q("request.lifecycle must be null.");
                    return;
                }
                coil3.p pVar = aVar.c;
                b bVar = aVar.b;
                if (((Boolean) sVar.j(x1.a)).booleanValue()) {
                    sVar.b0(2019030948);
                    m mVar2 = (m) sVar.j(s.a);
                    sVar.p(false);
                    mVar = mVar2;
                } else {
                    sVar.b0(2019088453);
                    sVar.p(false);
                    mVar = null;
                }
                androidx.compose.ui.r rVarD = rVar.d(new coil3.compose.internal.b(gVar, pVar, bVar, lVar, lVar2, eVar, jVar2, mVar, str2));
                iHashCode = Long.hashCode(sVar.T);
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarD);
                androidx.compose.runtime.internal.j jVarL = sVar.l();
                androidx.compose.ui.node.h.b.getClass();
                aVar2 = androidx.compose.ui.node.g.b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(aVar2);
                } else {
                    sVar.o0();
                }
                t.x(sVar, coil3.compose.internal.f.a, androidx.compose.ui.node.g.f);
                t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                eVar2 = androidx.compose.ui.node.g.g;
                if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar2);
                }
                sVar.p(true);
            } else {
                sVar.b0(-1008595950);
                Context context = (Context) sVar.j(m0.b);
                coil3.size.i iVarA2 = coil3.compose.internal.g.a(jVar, sVar);
                boolean zF2 = sVar.f(context) | sVar.f(obj2) | sVar.f(iVarA2);
                Object objQ2 = sVar.Q();
                if (zF2 || objQ2 == obj3) {
                    coil3.request.d dVar = new coil3.request.d(context);
                    dVar.c = obj2;
                    dVar.l = iVarA2;
                    objQ2 = dVar.a();
                    sVar.l0(objQ2);
                }
                gVar = (coil3.request.g) objQ2;
                sVar.p(false);
            }
            sVar.p(false);
            obj = gVar.b;
            if (!(obj instanceof coil3.request.d)) {
                kotlinx.coroutines.future.a.q("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            if (!(obj instanceof androidx.compose.ui.graphics.g)) {
                coil3.compose.internal.g.c("ImageBitmap");
                throw null;
            }
            if (!(obj instanceof androidx.compose.ui.graphics.vector.f)) {
                coil3.compose.internal.g.c("ImageVector");
                throw null;
            }
            if (!(obj instanceof androidx.compose.ui.graphics.painter.b)) {
                coil3.compose.internal.g.c("Painter");
                throw null;
            }
            if (gVar.c == null) {
                kotlinx.coroutines.future.a.q("request.target must be null.");
                return;
            }
            if (((androidx.lifecycle.p) coil3.l.d(gVar, coil3.request.i.e)) == null) {
                kotlinx.coroutines.future.a.q("request.lifecycle must be null.");
                return;
            }
            coil3.p pVar2 = aVar.c;
            b bVar2 = aVar.b;
            if (((Boolean) sVar.j(x1.a)).booleanValue()) {
                sVar.b0(2019030948);
                m mVar3 = (m) sVar.j(s.a);
                sVar.p(false);
                mVar = mVar3;
            } else {
                sVar.b0(2019088453);
                sVar.p(false);
                mVar = null;
            }
            androidx.compose.ui.r rVarD2 = rVar.d(new coil3.compose.internal.b(gVar, pVar2, bVar2, lVar, lVar2, eVar, jVar2, mVar, str2));
            iHashCode = Long.hashCode(sVar.T);
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarD2);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            androidx.compose.ui.node.h.b.getClass();
            aVar2 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(aVar2);
            } else {
                sVar.o0();
            }
            t.x(sVar, coil3.compose.internal.f.a, androidx.compose.ui.node.g.f);
            t.x(sVar, jVarL2, androidx.compose.ui.node.g.e);
            t.x(sVar, rVarC2, androidx.compose.ui.node.g.d);
            eVar2 = androidx.compose.ui.node.g.g;
            if (sVar.S) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar2);
            } else {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar2);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: coil3.compose.a
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    k.b(aVar, str, rVar, lVar, lVar2, eVar, jVar, (androidx.compose.runtime.s) obj4, t.A(i | 1), t.A(i2));
                    return y.a;
                }
            };
        }
    }

    public static final void c(Object obj, String str, androidx.compose.ui.r rVar, androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.painter.b bVar2, kotlin.jvm.functions.l lVar, androidx.compose.ui.layout.j jVar, androidx.compose.runtime.s sVar, int i, int i2, int i3) {
        if ((i3 & LibretroCore.SCREEN_WIDTH) != 0) {
            lVar = null;
        }
        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.B;
        coil3.p pVarA = coil3.s.a((Context) sVar.j(m0.b));
        int i4 = (i2 << 3) & Token.ASSIGN_MOD;
        coil3.compose.internal.a aVar = new coil3.compose.internal.a(obj, (b) sVar.j(r.a), pVarA);
        int i5 = coil3.compose.internal.g.b;
        b(aVar, str, rVar, (bVar == null && bVar2 == null && bVar2 == null) ? i.T : new androidx.compose.animation.core.a(18, bVar, bVar2, bVar2), lVar != null ? new r1(2, lVar) : null, jVar2, jVar, sVar, (i4 << 15) & 3670016, 0);
    }

    public static final androidx.compose.ui.graphics.painter.b d(coil3.j jVar, Context context, int i) {
        if (!(jVar instanceof coil3.a)) {
            return jVar instanceof coil3.e ? new com.google.accompanist.drawablepainter.b(coil3.l.b(jVar, context.getResources()).mutate()) : new q(jVar);
        }
        Bitmap bitmap = ((coil3.a) jVar).a;
        androidx.compose.ui.graphics.painter.a aVar = new androidx.compose.ui.graphics.painter.a(new androidx.compose.ui.graphics.g(bitmap), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.E = i;
        return aVar;
    }
}
