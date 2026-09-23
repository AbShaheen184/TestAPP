package androidx.room;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.layout.q0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.g1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.w2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.platform.l1;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static androidx.room.util.j B(androidx.sqlite.a aVar, String str) {
        Map mapB;
        kotlin.collections.builders.h hVar;
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (cVarU.Q()) {
                int iH = _COROUTINE.b.h(cVarU, "name");
                int iH2 = _COROUTINE.b.h(cVarU, "type");
                int iH3 = _COROUTINE.b.h(cVarU, "notnull");
                int iH4 = _COROUTINE.b.h(cVarU, "pk");
                int iH5 = _COROUTINE.b.h(cVarU, "dflt_value");
                kotlin.collections.builders.f fVar = new kotlin.collections.builders.f();
                do {
                    String strF = cVarU.F(iH);
                    fVar.put(strF, new androidx.room.util.g((int) cVarU.getLong(iH4), 2, strF, cVarU.F(iH2), cVarU.isNull(iH5) ? null : cVarU.F(iH5), cVarU.getLong(iH3) != 0));
                } while (cVarU.Q());
                mapB = fVar.b();
                kotlin.collections.q.e(cVarU, null);
            } else {
                mapB = kotlin.collections.x.e;
                kotlin.collections.q.e(cVarU, null);
            }
            androidx.sqlite.c cVarU2 = aVar.U("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iH6 = _COROUTINE.b.h(cVarU2, "id");
                int iH7 = _COROUTINE.b.h(cVarU2, "seq");
                int iH8 = _COROUTINE.b.h(cVarU2, "table");
                int iH9 = _COROUTINE.b.h(cVarU2, "on_delete");
                int iH10 = _COROUTINE.b.h(cVarU2, "on_update");
                List listZ = android.support.v4.media.session.b.z(cVarU2);
                cVarU2.reset();
                kotlin.collections.builders.h hVar2 = new kotlin.collections.builders.h();
                while (cVarU2.Q()) {
                    if (cVarU2.getLong(iH7) == j) {
                        int i2 = (int) cVarU2.getLong(iH6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = iH6;
                        ArrayList<androidx.room.util.f> arrayList3 = new ArrayList();
                        for (Object obj : listZ) {
                            int i4 = iH7;
                            List list = listZ;
                            if (((androidx.room.util.f) obj).e == i2) {
                                arrayList3.add(obj);
                            }
                            iH7 = i4;
                            listZ = list;
                        }
                        int i5 = iH7;
                        List list2 = listZ;
                        for (androidx.room.util.f fVar2 : arrayList3) {
                            arrayList.add(fVar2.z);
                            arrayList2.add(fVar2.A);
                        }
                        hVar2.add(new androidx.room.util.h(cVarU2.F(iH8), cVarU2.F(iH9), cVarU2.F(iH10), arrayList, arrayList2));
                        iH6 = i3;
                        iH7 = i5;
                        listZ = list2;
                        j = 0;
                    }
                }
                kotlin.collections.builders.h hVarB = kotlin.collections.g0.b(hVar2);
                kotlin.collections.q.e(cVarU2, null);
                androidx.sqlite.c cVarU3 = aVar.U("PRAGMA index_list(`" + str + "`)");
                try {
                    int iH11 = _COROUTINE.b.h(cVarU3, "name");
                    int iH12 = _COROUTINE.b.h(cVarU3, "origin");
                    int iH13 = _COROUTINE.b.h(cVarU3, "unique");
                    if (iH11 == -1 || iH12 == -1 || iH13 == -1) {
                        kotlin.collections.q.e(cVarU3, null);
                        hVar = null;
                    } else {
                        kotlin.collections.builders.h hVar3 = new kotlin.collections.builders.h();
                        while (cVarU3.Q()) {
                            if ("c".equals(cVarU3.F(iH12))) {
                                androidx.room.util.i iVarA = android.support.v4.media.session.b.A(aVar, cVarU3.F(iH11), cVarU3.getLong(iH13) == 1);
                                if (iVarA == null) {
                                    kotlin.collections.q.e(cVarU3, null);
                                    hVar = null;
                                } else {
                                    hVar3.add(iVarA);
                                }
                            }
                        }
                        kotlin.collections.builders.h hVarB2 = kotlin.collections.g0.b(hVar3);
                        kotlin.collections.q.e(cVarU3, null);
                        hVar = hVarB2;
                    }
                    return new androidx.room.util.j(str, mapB, hVarB, hVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.collections.q.e(cVarU3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    kotlin.collections.q.e(cVarU2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                kotlin.collections.q.e(cVarU, th5);
                throw th6;
            }
        }
    }

    public static int C(androidx.media3.common.util.u uVar, int i2, int i3, int i4) {
        _COROUTINE.a.o(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        com.google.android.gms.dynamite.g.i(com.google.android.gms.dynamite.g.i(i5, i6), 1 << i4);
        if (uVar.b() < i2) {
            return -1;
        }
        int iG = uVar.g(i2);
        if (iG == i5) {
            if (uVar.b() < i3) {
                return -1;
            }
            int iG2 = uVar.g(i3);
            iG += iG2;
            if (iG2 == i6) {
                if (uVar.b() < i4) {
                    return -1;
                }
                return uVar.g(i4) + iG;
            }
        }
        return iG;
    }

    public static TypedValue D(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue E(int i2, Context context, String str) {
        TypedValue typedValueD = D(context, i2);
        if (typedValueD != null) {
            return typedValueD;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static final long F(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static void G(androidx.media3.common.util.u uVar) {
        uVar.o(3);
        uVar.o(8);
        boolean zF = uVar.f();
        boolean zF2 = uVar.f();
        if (zF) {
            uVar.o(5);
        }
        if (zF2) {
            uVar.o(6);
        }
    }

    public static void H(androidx.media3.common.util.u uVar) {
        int iG;
        int iG2 = uVar.g(2);
        if (iG2 == 0) {
            uVar.o(6);
            return;
        }
        int iC = C(uVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            uVar.o(iC * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = uVar.f();
            int i2 = zF ? 1 : 5;
            int i3 = zF ? 7 : 5;
            int i4 = zF ? 8 : 6;
            int i5 = 0;
            while (i5 < iC) {
                if (uVar.f()) {
                    uVar.o(7);
                    iG = 0;
                } else {
                    if (uVar.g(2) == 3 && uVar.g(i3) * i2 != 0) {
                        uVar.n();
                    }
                    iG = uVar.g(i4) * i2;
                    if (iG != 0 && iG != 180) {
                        uVar.n();
                    }
                    uVar.n();
                }
                if (iG != 0 && iG != 180 && uVar.f()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    public static final androidx.compose.ui.geometry.c I(androidx.compose.ui.layout.x xVar) {
        androidx.compose.ui.geometry.c cVarE = androidx.compose.ui.layout.a0.e(xVar, true);
        long jI = xVar.I(cVarE.d());
        float f2 = cVarE.c;
        float f3 = cVarE.d;
        long jI2 = xVar.I((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new androidx.compose.ui.geometry.c(Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jI & 4294967295L)), Float.intBitsToFloat((int) (jI2 >> 32)), Float.intBitsToFloat((int) (jI2 & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x022c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0232  */
    /* JADX WARN: Code duplicated, block: B:163:0x0244  */
    /* JADX WARN: Code duplicated, block: B:165:0x024a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x025b  */
    /* JADX WARN: Code duplicated, block: B:175:0x026c  */
    /* JADX WARN: Code duplicated, block: B:178:0x028d  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:191:0x02da  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:205:0x030b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0311  */
    /* JADX WARN: Code duplicated, block: B:213:0x032c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0332  */
    /* JADX WARN: Code duplicated, block: B:221:0x0346  */
    /* JADX WARN: Code duplicated, block: B:223:0x034c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0360  */
    /* JADX WARN: Code duplicated, block: B:231:0x0366  */
    /* JADX WARN: Code duplicated, block: B:237:0x037a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0380  */
    /* JADX WARN: Code duplicated, block: B:245:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x039c  */
    /* JADX WARN: Code duplicated, block: B:251:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:253:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:257:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:259:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:266:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:270:0x040b  */
    /* JADX WARN: Code duplicated, block: B:272:0x044d  */
    /* JADX WARN: Code duplicated, block: B:275:0x045b  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0169, please report this as an issue */
    public static final void a(final androidx.compose.ui.r rVar, androidx.compose.foundation.lazy.y yVar, final z0 z0Var, final boolean z, final androidx.compose.foundation.gestures.l lVar, final boolean z2, final androidx.compose.foundation.n nVar, androidx.compose.ui.d dVar, androidx.compose.foundation.layout.g gVar, androidx.compose.ui.i iVar, androidx.compose.foundation.layout.e eVar, final kotlin.jvm.functions.l lVar2, androidx.compose.runtime.s sVar, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.d dVar2;
        final androidx.compose.foundation.layout.g gVar2;
        int i6;
        boolean z3;
        androidx.compose.foundation.lazy.y yVar2;
        final androidx.compose.ui.i iVar2;
        s1 s1VarT;
        int i7;
        androidx.compose.ui.i iVar3;
        androidx.compose.ui.i iVar4;
        androidx.compose.ui.d dVar3;
        int i8;
        a1 a1VarV;
        boolean z4;
        Object objQ;
        Object obj;
        kotlin.reflect.h hVar;
        boolean z5;
        Object objQ2;
        Object objQ3;
        CoroutineScope coroutineScope;
        androidx.compose.ui.graphics.y yVar3;
        androidx.compose.foundation.lazy.layout.f0 f0Var;
        boolean zD;
        Object objQ4;
        Object obj2;
        int i9;
        kotlin.reflect.h hVar2;
        o1 o1Var;
        o1 o1Var2;
        androidx.compose.ui.r rVarM;
        boolean zD2;
        Object objQ5;
        sVar.c0(924924659);
        if ((i2 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= sVar.f(yVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= sVar.f(z0Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        int i10 = i2 & 3072;
        int i11 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i10 == 0) {
            i5 |= sVar.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= sVar.g(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= sVar.f(lVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= sVar.g(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= sVar.f(nVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= 33554432;
        }
        int i12 = i4 & 512;
        if (i12 != 0) {
            i5 |= 805306368;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i2 & 805306368) == 0) {
                i5 |= sVar.f(dVar2) ? 536870912 : 268435456;
            }
        }
        int i13 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i13 != 0) {
            i6 = i3 | 6;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((i3 & 6) == 0) {
                i6 = i3 | (sVar.f(gVar2) ? 4 : 2);
            } else {
                i6 = i3;
            }
        }
        int i14 = i5;
        int i15 = i4 & 2048;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= sVar.f(iVar) ? 32 : 16;
        }
        int i16 = i6;
        int i17 = i4 & 4096;
        if (i17 == 0) {
            if ((i3 & 384) == 0) {
                i16 |= sVar.f(eVar) ? LibretroCore.SCREEN_WIDTH : 128;
            }
            if ((i3 & 3072) != 0) {
                if (sVar.h(lVar2)) {
                    i11 = 2048;
                }
                i16 |= i11;
            }
            if ((i14 & 306783379) == 306783378 || (i16 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i14 & 1, z3)) {
                sVar.Y();
                if ((i2 & 1) != 0 || sVar.C()) {
                    i7 = i14 & (-234881025);
                    if (i12 != 0) {
                        dVar2 = null;
                    }
                    if (i13 != 0) {
                        gVar2 = null;
                    }
                    if (i15 != 0) {
                        iVar3 = null;
                    } else {
                        iVar3 = iVar;
                    }
                    if (i17 != 0) {
                        iVar4 = iVar3;
                        gVar2 = gVar2;
                        dVar3 = dVar2;
                        eVar = null;
                    } else {
                        iVar4 = iVar3;
                    }
                    sVar.q();
                    i8 = i7 >> 3;
                    int i18 = i8 & 14;
                    int i19 = ((i16 >> 6) & Token.ASSIGN_MOD) | i18;
                    int i20 = i7;
                    a1VarV = androidx.compose.runtime.t.v(lVar2, sVar);
                    int i21 = i16;
                    z4 = (((i19 & 14) ^ 6) <= 4 && sVar.f(yVar)) || (i19 & 6) == 4;
                    objQ = sVar.Q();
                    obj = androidx.compose.runtime.n.a;
                    if (z4 || objQ == obj) {
                        androidx.compose.foundation.lazy.d dVar4 = new androidx.compose.foundation.lazy.d();
                        dVar4.a = new g1(Integer.MAX_VALUE);
                        dVar4.b = new g1(Integer.MAX_VALUE);
                        androidx.compose.runtime.f fVar = androidx.compose.runtime.f.B;
                        objQ = new androidx.compose.foundation.lazy.n(0, 0, w2.class, androidx.compose.runtime.t.j(fVar, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.t.j(fVar, new androidx.compose.foundation.lazy.m(a1VarV, 0)), yVar, dVar4)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                        sVar.l0(objQ);
                    }
                    hVar = (kotlin.reflect.h) objQ;
                    int i22 = i20 >> 9;
                    int i23 = i18 | (i22 & Token.ASSIGN_MOD);
                    z5 = ((((i23 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.g(z)) || (i23 & 48) == 32) | ((((i23 & 14) ^ 6) <= 4 && sVar.f(yVar)) || (i23 & 6) == 4);
                    objQ2 = sVar.Q();
                    if (z5 || objQ2 == obj) {
                        objQ2 = new androidx.compose.foundation.lazy.f(yVar, z);
                        sVar.l0(objQ2);
                    }
                    q0 q0Var = (q0) objQ2;
                    objQ3 = sVar.Q();
                    if (objQ3 == obj) {
                        objQ3 = l0.f(sVar);
                        sVar.l0(objQ3);
                    }
                    coroutineScope = (CoroutineScope) objQ3;
                    yVar3 = (androidx.compose.ui.graphics.y) sVar.j(l1.g);
                    f0Var = ((Boolean) sVar.j(l1.v)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.g1.a;
                    int i24 = i21 << 18;
                    int i25 = (i20 & 65520) | (i22 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | ((i21 << 27) & 1879048192);
                    zD = ((((i25 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.f(yVar)) || (i25 & 48) == 32) | ((((i25 & 896) ^ 384) <= 256 && sVar.f(z0Var)) || (i25 & 384) == 256) | ((((i25 & 7168) ^ 3072) <= 2048 && sVar.g(false)) || (i25 & 3072) == 2048) | ((((57344 & i25) ^ 24576) <= 16384 && sVar.g(z)) || (i25 & 24576) == 16384) | sVar.d(0) | ((((i25 & 3670016) ^ 1572864) <= 1048576 && sVar.f(dVar3)) || (i25 & 1572864) == 1048576) | ((((i25 & 29360128) ^ 12582912) <= 8388608 && sVar.f(iVar4)) || (i25 & 12582912) == 8388608) | ((((i25 & 234881024) ^ 100663296) <= 67108864 && sVar.f(eVar)) || (i25 & 100663296) == 67108864) | ((((i25 & 1879048192) ^ 805306368) <= 536870912 && sVar.f(gVar2)) || (i25 & 805306368) == 536870912) | sVar.f(yVar3) | sVar.f(f0Var);
                    objQ4 = sVar.Q();
                    if (!zD || objQ4 == obj) {
                        obj2 = obj;
                        i9 = 4;
                        Object qVar = new androidx.compose.foundation.lazy.q(yVar, z, z0Var, hVar, gVar2, eVar, coroutineScope, yVar3, f0Var, dVar3, iVar4);
                        hVar2 = hVar;
                        sVar.l0(qVar);
                        objQ4 = qVar;
                    } else {
                        hVar2 = hVar;
                        obj2 = obj;
                        i9 = 4;
                    }
                    androidx.compose.foundation.lazy.layout.c0 c0Var = (androidx.compose.foundation.lazy.layout.c0) objQ4;
                    if (z) {
                        o1Var = o1.e;
                    } else {
                        o1Var = o1.y;
                    }
                    o1Var2 = o1Var;
                    if (z2) {
                        sVar.b0(-2077147368);
                        zD2 = ((((i8 & 14) ^ 6) <= i9 && sVar.f(yVar)) || (i8 & 6) == i9) | sVar.d(0);
                        objQ5 = sVar.Q();
                        if (zD2 || objQ5 == obj2) {
                            objQ5 = new androidx.compose.foundation.lazy.g(yVar);
                            sVar.l0(objQ5);
                        }
                        rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.g) objQ5, yVar.o, o1Var2);
                        sVar.p(false);
                    } else {
                        sVar.b0(-2076718545);
                        sVar.p(false);
                        rVarM = androidx.compose.ui.o.b;
                    }
                    yVar2 = yVar;
                    androidx.compose.foundation.lazy.layout.m.a(hVar2, androidx.compose.foundation.s.r(androidx.compose.foundation.lazy.layout.m.n(rVar.d(yVar.l).d(yVar.m), hVar2, q0Var, o1Var2, z2).d(rVarM).d(yVar.n.i), yVar, o1Var2, nVar, z2, lVar, yVar.g), yVar2.p, c0Var, sVar, 0);
                    dVar2 = dVar3;
                    iVar2 = iVar4;
                } else {
                    sVar.W();
                    i7 = i14 & (-234881025);
                    iVar4 = iVar;
                }
                gVar2 = gVar2;
                dVar3 = dVar2;
                sVar.q();
                i8 = i7 >> 3;
                int i110 = i8 & 14;
                int i111 = ((i16 >> 6) & Token.ASSIGN_MOD) | i110;
                int i26 = i7;
                a1VarV = androidx.compose.runtime.t.v(lVar2, sVar);
                int i27 = i16;
                if (((i111 & 14) ^ 6) <= 4) {
                }
                objQ = sVar.Q();
                obj = androidx.compose.runtime.n.a;
                if (z4) {
                    androidx.compose.foundation.lazy.d dVar5 = new androidx.compose.foundation.lazy.d();
                    dVar5.a = new g1(Integer.MAX_VALUE);
                    dVar5.b = new g1(Integer.MAX_VALUE);
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.f.B;
                    objQ = new androidx.compose.foundation.lazy.n(0, 0, w2.class, androidx.compose.runtime.t.j(fVar2, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.t.j(fVar2, new androidx.compose.foundation.lazy.m(a1VarV, 0)), yVar, dVar5)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                    sVar.l0(objQ);
                } else {
                    androidx.compose.foundation.lazy.d dVar6 = new androidx.compose.foundation.lazy.d();
                    dVar6.a = new g1(Integer.MAX_VALUE);
                    dVar6.b = new g1(Integer.MAX_VALUE);
                    androidx.compose.runtime.f fVar3 = androidx.compose.runtime.f.B;
                    objQ = new androidx.compose.foundation.lazy.n(0, 0, w2.class, androidx.compose.runtime.t.j(fVar3, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.t.j(fVar3, new androidx.compose.foundation.lazy.m(a1VarV, 0)), yVar, dVar6)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                    sVar.l0(objQ);
                }
                hVar = (kotlin.reflect.h) objQ;
                int i28 = i26 >> 9;
                int i29 = i110 | (i28 & Token.ASSIGN_MOD);
                z5 = ((((i29 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.g(z)) || (i29 & 48) == 32) | ((((i29 & 14) ^ 6) <= 4 && sVar.f(yVar)) || (i29 & 6) == 4);
                objQ2 = sVar.Q();
                if (z5) {
                    objQ2 = new androidx.compose.foundation.lazy.f(yVar, z);
                    sVar.l0(objQ2);
                } else {
                    objQ2 = new androidx.compose.foundation.lazy.f(yVar, z);
                    sVar.l0(objQ2);
                }
                q0 q0Var2 = (q0) objQ2;
                objQ3 = sVar.Q();
                if (objQ3 == obj) {
                    objQ3 = l0.f(sVar);
                    sVar.l0(objQ3);
                }
                coroutineScope = (CoroutineScope) objQ3;
                yVar3 = (androidx.compose.ui.graphics.y) sVar.j(l1.g);
                f0Var = ((Boolean) sVar.j(l1.v)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.g1.a;
                int i210 = i27 << 18;
                int i211 = (i26 & 65520) | (i28 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | ((i27 << 27) & 1879048192);
                zD = ((((i211 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.f(yVar)) || (i211 & 48) == 32) | ((((i211 & 896) ^ 384) <= 256 && sVar.f(z0Var)) || (i211 & 384) == 256) | ((((i211 & 7168) ^ 3072) <= 2048 && sVar.g(false)) || (i211 & 3072) == 2048) | ((((57344 & i211) ^ 24576) <= 16384 && sVar.g(z)) || (i211 & 24576) == 16384) | sVar.d(0) | ((((i211 & 3670016) ^ 1572864) <= 1048576 && sVar.f(dVar3)) || (i211 & 1572864) == 1048576) | ((((i211 & 29360128) ^ 12582912) <= 8388608 && sVar.f(iVar4)) || (i211 & 12582912) == 8388608) | ((((i211 & 234881024) ^ 100663296) <= 67108864 && sVar.f(eVar)) || (i211 & 100663296) == 67108864) | ((((i211 & 1879048192) ^ 805306368) <= 536870912 && sVar.f(gVar2)) || (i211 & 805306368) == 536870912) | sVar.f(yVar3) | sVar.f(f0Var);
                objQ4 = sVar.Q();
                if (zD) {
                    obj2 = obj;
                    i9 = 4;
                    Object qVar2 = new androidx.compose.foundation.lazy.q(yVar, z, z0Var, hVar, gVar2, eVar, coroutineScope, yVar3, f0Var, dVar3, iVar4);
                    hVar2 = hVar;
                    sVar.l0(qVar2);
                    objQ4 = qVar2;
                } else {
                    obj2 = obj;
                    i9 = 4;
                    Object qVar3 = new androidx.compose.foundation.lazy.q(yVar, z, z0Var, hVar, gVar2, eVar, coroutineScope, yVar3, f0Var, dVar3, iVar4);
                    hVar2 = hVar;
                    sVar.l0(qVar3);
                    objQ4 = qVar3;
                }
                androidx.compose.foundation.lazy.layout.c0 c0Var2 = (androidx.compose.foundation.lazy.layout.c0) objQ4;
                if (z) {
                    o1Var = o1.e;
                } else {
                    o1Var = o1.y;
                }
                o1Var2 = o1Var;
                if (z2) {
                    sVar.b0(-2077147368);
                    zD2 = ((((i8 & 14) ^ 6) <= i9 && sVar.f(yVar)) || (i8 & 6) == i9) | sVar.d(0);
                    objQ5 = sVar.Q();
                    if (zD2) {
                        objQ5 = new androidx.compose.foundation.lazy.g(yVar);
                        sVar.l0(objQ5);
                    } else {
                        objQ5 = new androidx.compose.foundation.lazy.g(yVar);
                        sVar.l0(objQ5);
                    }
                    rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.g) objQ5, yVar.o, o1Var2);
                    sVar.p(false);
                } else {
                    sVar.b0(-2076718545);
                    sVar.p(false);
                    rVarM = androidx.compose.ui.o.b;
                }
                yVar2 = yVar;
                androidx.compose.foundation.lazy.layout.m.a(hVar2, androidx.compose.foundation.s.r(androidx.compose.foundation.lazy.layout.m.n(rVar.d(yVar.l).d(yVar.m), hVar2, q0Var2, o1Var2, z2).d(rVarM).d(yVar.n.i), yVar, o1Var2, nVar, z2, lVar, yVar.g), yVar2.p, c0Var2, sVar, 0);
                dVar2 = dVar3;
                iVar2 = iVar4;
            } else {
                yVar2 = yVar;
                sVar.W();
                iVar2 = iVar;
                eVar = eVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                final androidx.compose.foundation.lazy.y yVar4 = yVar2;
                final androidx.compose.ui.d dVar7 = dVar2;
                final androidx.compose.foundation.layout.e eVar2 = eVar;
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.o
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iA = androidx.compose.runtime.t.A(i2 | 1);
                        int iA2 = androidx.compose.runtime.t.A(i3);
                        androidx.room.t.a(rVar, yVar4, z0Var, z, lVar, z2, nVar, dVar7, gVar2, iVar2, eVar2, lVar2, (androidx.compose.runtime.s) obj3, iA, iA2, i4);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i16 |= 384;
        if ((i3 & 3072) != 0) {
            if (sVar.h(lVar2)) {
                i11 = 2048;
            }
            i16 |= i11;
        }
        if ((i14 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (sVar.T(i14 & 1, z3)) {
            sVar.Y();
            if ((i2 & 1) != 0) {
                i7 = i14 & (-234881025);
                if (i12 != 0) {
                    dVar2 = null;
                }
                if (i13 != 0) {
                    gVar2 = null;
                }
                if (i15 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                if (i17 != 0) {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                    eVar = null;
                } else {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                }
            } else {
                i7 = i14 & (-234881025);
                if (i12 != 0) {
                    dVar2 = null;
                }
                if (i13 != 0) {
                    gVar2 = null;
                }
                if (i15 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                if (i17 != 0) {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                    eVar = null;
                } else {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                }
            }
            sVar.q();
            i8 = i7 >> 3;
            int i112 = i8 & 14;
            int i113 = ((i16 >> 6) & Token.ASSIGN_MOD) | i112;
            int i212 = i7;
            a1VarV = androidx.compose.runtime.t.v(lVar2, sVar);
            int i213 = i16;
            if (((i113 & 14) ^ 6) <= 4) {
            }
            objQ = sVar.Q();
            obj = androidx.compose.runtime.n.a;
            if (z4) {
                androidx.compose.foundation.lazy.d dVar8 = new androidx.compose.foundation.lazy.d();
                dVar8.a = new g1(Integer.MAX_VALUE);
                dVar8.b = new g1(Integer.MAX_VALUE);
                androidx.compose.runtime.f fVar4 = androidx.compose.runtime.f.B;
                objQ = new androidx.compose.foundation.lazy.n(0, 0, w2.class, androidx.compose.runtime.t.j(fVar4, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.t.j(fVar4, new androidx.compose.foundation.lazy.m(a1VarV, 0)), yVar, dVar8)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                sVar.l0(objQ);
            } else {
                androidx.compose.foundation.lazy.d dVar9 = new androidx.compose.foundation.lazy.d();
                dVar9.a = new g1(Integer.MAX_VALUE);
                dVar9.b = new g1(Integer.MAX_VALUE);
                androidx.compose.runtime.f fVar5 = androidx.compose.runtime.f.B;
                objQ = new androidx.compose.foundation.lazy.n(0, 0, w2.class, androidx.compose.runtime.t.j(fVar5, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.t.j(fVar5, new androidx.compose.foundation.lazy.m(a1VarV, 0)), yVar, dVar9)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                sVar.l0(objQ);
            }
            hVar = (kotlin.reflect.h) objQ;
            int i214 = i212 >> 9;
            int i215 = i112 | (i214 & Token.ASSIGN_MOD);
            z5 = ((((i215 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.g(z)) || (i215 & 48) == 32) | ((((i215 & 14) ^ 6) <= 4 && sVar.f(yVar)) || (i215 & 6) == 4);
            objQ2 = sVar.Q();
            if (z5) {
                objQ2 = new androidx.compose.foundation.lazy.f(yVar, z);
                sVar.l0(objQ2);
            } else {
                objQ2 = new androidx.compose.foundation.lazy.f(yVar, z);
                sVar.l0(objQ2);
            }
            q0 q0Var3 = (q0) objQ2;
            objQ3 = sVar.Q();
            if (objQ3 == obj) {
                objQ3 = l0.f(sVar);
                sVar.l0(objQ3);
            }
            coroutineScope = (CoroutineScope) objQ3;
            yVar3 = (androidx.compose.ui.graphics.y) sVar.j(l1.g);
            f0Var = ((Boolean) sVar.j(l1.v)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.g1.a;
            int i216 = i213 << 18;
            int i217 = (i212 & 65520) | (i214 & 3670016) | (i216 & 29360128) | (i216 & 234881024) | ((i213 << 27) & 1879048192);
            zD = ((((i217 & Token.ASSIGN_MOD) ^ 48) <= 32 && sVar.f(yVar)) || (i217 & 48) == 32) | ((((i217 & 896) ^ 384) <= 256 && sVar.f(z0Var)) || (i217 & 384) == 256) | ((((i217 & 7168) ^ 3072) <= 2048 && sVar.g(false)) || (i217 & 3072) == 2048) | ((((57344 & i217) ^ 24576) <= 16384 && sVar.g(z)) || (i217 & 24576) == 16384) | sVar.d(0) | ((((i217 & 3670016) ^ 1572864) <= 1048576 && sVar.f(dVar3)) || (i217 & 1572864) == 1048576) | ((((i217 & 29360128) ^ 12582912) <= 8388608 && sVar.f(iVar4)) || (i217 & 12582912) == 8388608) | ((((i217 & 234881024) ^ 100663296) <= 67108864 && sVar.f(eVar)) || (i217 & 100663296) == 67108864) | ((((i217 & 1879048192) ^ 805306368) <= 536870912 && sVar.f(gVar2)) || (i217 & 805306368) == 536870912) | sVar.f(yVar3) | sVar.f(f0Var);
            objQ4 = sVar.Q();
            if (zD) {
                obj2 = obj;
                i9 = 4;
                Object qVar4 = new androidx.compose.foundation.lazy.q(yVar, z, z0Var, hVar, gVar2, eVar, coroutineScope, yVar3, f0Var, dVar3, iVar4);
                hVar2 = hVar;
                sVar.l0(qVar4);
                objQ4 = qVar4;
            } else {
                obj2 = obj;
                i9 = 4;
                Object qVar5 = new androidx.compose.foundation.lazy.q(yVar, z, z0Var, hVar, gVar2, eVar, coroutineScope, yVar3, f0Var, dVar3, iVar4);
                hVar2 = hVar;
                sVar.l0(qVar5);
                objQ4 = qVar5;
            }
            androidx.compose.foundation.lazy.layout.c0 c0Var3 = (androidx.compose.foundation.lazy.layout.c0) objQ4;
            if (z) {
                o1Var = o1.e;
            } else {
                o1Var = o1.y;
            }
            o1Var2 = o1Var;
            if (z2) {
                sVar.b0(-2077147368);
                zD2 = ((((i8 & 14) ^ 6) <= i9 && sVar.f(yVar)) || (i8 & 6) == i9) | sVar.d(0);
                objQ5 = sVar.Q();
                if (zD2) {
                    objQ5 = new androidx.compose.foundation.lazy.g(yVar);
                    sVar.l0(objQ5);
                } else {
                    objQ5 = new androidx.compose.foundation.lazy.g(yVar);
                    sVar.l0(objQ5);
                }
                rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.g) objQ5, yVar.o, o1Var2);
                sVar.p(false);
            } else {
                sVar.b0(-2076718545);
                sVar.p(false);
                rVarM = androidx.compose.ui.o.b;
            }
            yVar2 = yVar;
            androidx.compose.foundation.lazy.layout.m.a(hVar2, androidx.compose.foundation.s.r(androidx.compose.foundation.lazy.layout.m.n(rVar.d(yVar.l).d(yVar.m), hVar2, q0Var3, o1Var2, z2).d(rVarM).d(yVar.n.i), yVar, o1Var2, nVar, z2, lVar, yVar.g), yVar2.p, c0Var3, sVar, 0);
            dVar2 = dVar3;
            iVar2 = iVar4;
        } else {
            yVar2 = yVar;
            sVar.W();
            iVar2 = iVar;
            eVar = eVar;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            final androidx.compose.foundation.lazy.y yVar5 = yVar2;
            final androidx.compose.ui.d dVar10 = dVar2;
            final androidx.compose.foundation.layout.e eVar3 = eVar;
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.o
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = androidx.compose.runtime.t.A(i2 | 1);
                    int iA2 = androidx.compose.runtime.t.A(i3);
                    androidx.room.t.a(rVar, yVar5, z0Var, z, lVar, z2, nVar, dVar10, gVar2, iVar2, eVar3, lVar2, (androidx.compose.runtime.s) obj3, iA, iA2, i4);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(boolean z, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i2) {
        int i3;
        sVar.c0(-642000585);
        if ((i2 & 6) == 0) {
            i3 = (sVar.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(pVar) ? 32 : 16;
        }
        if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
            Object objA = androidx.navigationevent.compose.a.a(sVar);
            if (objA == null) {
                sVar.b0(1512740606);
                objA = androidx.activity.compose.s.a(sVar);
            } else {
                sVar.b0(1512737723);
            }
            sVar.p(false);
            if (objA == null) {
                kotlinx.coroutines.future.a.u("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = sVar.f(objA);
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (zF || objQ == obj) {
                androidx.navigationevent.d dVar = objA instanceof androidx.navigationevent.d ? (androidx.navigationevent.d) objA : null;
                androidx.navigationevent.c navigationEventDispatcher = dVar != null ? dVar.getNavigationEventDispatcher() : null;
                androidx.activity.e0 e0Var = objA instanceof androidx.activity.e0 ? (androidx.activity.e0) objA : null;
                objQ = new androidx.activity.compose.internal.c(navigationEventDispatcher, e0Var != null ? e0Var.getOnBackPressedDispatcher() : null);
                sVar.l0(objQ);
            }
            Object obj2 = (androidx.activity.compose.internal.c) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = l0.f(sVar);
                sVar.l0(objQ2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ2;
            long j = sVar.T;
            boolean zF2 = sVar.f(obj2) | sVar.e(j);
            Object objQ3 = sVar.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new androidx.activity.compose.q(coroutineScope, new androidx.activity.compose.u(j, objA));
                sVar.l0(objQ3);
            }
            androidx.activity.compose.q qVar = (androidx.activity.compose.q) objQ3;
            sVar.b0(-348514256);
            boolean zH = sVar.h(qVar) | sVar.h(pVar);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == obj) {
                objQ4 = new androidx.activity.compose.f(1, qVar, pVar);
                sVar.l0(objQ4);
            }
            l0.e((kotlin.jvm.functions.a) objQ4, sVar);
            int i4 = i3;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean zH2 = sVar.h(qVar) | (i5 == 4);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == obj) {
                objQ5 = new androidx.activity.compose.v(qVar, z);
                sVar.l0(objQ5);
            }
            _COROUTINE.a.a(boolValueOf, qVar, null, (kotlin.jvm.functions.l) objQ5, sVar, i5);
            boolean zH3 = sVar.h(obj2) | sVar.h(qVar);
            Object objQ6 = sVar.Q();
            if (zH3 || objQ6 == obj) {
                objQ6 = new androidx.activity.compose.h(1, obj2, qVar);
                sVar.l0(objQ6);
            }
            l0.a(obj2, qVar, (kotlin.jvm.functions.l) objQ6, sVar);
            sVar.p(false);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.l(z, pVar, i2);
        }
    }

    public static final void c(com.google.firebase.platforminfo.d dVar, androidx.compose.ui.input.pointer.v vVar, long j) {
        androidx.compose.ui.input.pointer.util.b bVar = (androidx.compose.ui.input.pointer.util.b) dVar.e;
        bVar.getClass();
        androidx.compose.ui.input.pointer.util.e eVar = (androidx.compose.ui.input.pointer.util.e) bVar.c;
        androidx.compose.ui.input.pointer.util.e eVar2 = (androidx.compose.ui.input.pointer.util.e) bVar.b;
        boolean zB = androidx.compose.ui.input.pointer.u.b(vVar);
        long j2 = vVar.b;
        if (zB) {
            kotlin.collections.o.p(eVar2.d, null);
            eVar2.e = 0;
            kotlin.collections.o.p(eVar.d, null);
            eVar.e = 0;
            bVar.a = 0L;
        }
        if (!androidx.compose.ui.input.pointer.u.d(vVar)) {
            List list = vVar.k;
            if (list == null) {
                list = kotlin.collections.w.e;
            }
            int i2 = 0;
            for (int size = list.size(); i2 < size; size = size) {
                androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) list.get(i2);
                bVar.a(cVar.a, androidx.compose.ui.geometry.b.e(cVar.c, j));
                i2++;
            }
            bVar.a(j2, androidx.compose.ui.geometry.b.e(vVar.l, j));
        }
        if (androidx.compose.ui.input.pointer.u.d(vVar) && j2 - bVar.a > 40) {
            kotlin.collections.o.p(eVar2.d, null);
            eVar2.e = 0;
            kotlin.collections.o.p(eVar.d, null);
            eVar.e = 0;
            bVar.a = 0L;
        }
        bVar.a = j2;
    }

    public static final void d(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            com.google.firebase.platforminfo.b.l(androidx.compose.runtime.j.g("index: ", i2, ", size: ", i3));
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.firebase.platforminfo.b.h(str);
    }

    public static final void f(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            com.google.firebase.platforminfo.b.l(androidx.compose.runtime.j.g("index: ", i2, ", size: ", i3));
        }
    }

    public static final void g(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.w("fromIndex: ", ", toIndex: ", i2, ", size: ", i3), i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.g("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }

    public static int h(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static int i(androidx.recyclerview.widget.l0 l0Var, androidx.emoji2.text.g gVar, View view, View view2, androidx.recyclerview.widget.c0 c0Var, boolean z) {
        if (c0Var.u() == 0 || l0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(androidx.recyclerview.widget.c0.G(view) - androidx.recyclerview.widget.c0.G(view2)) + 1;
        }
        return Math.min(gVar.r(), gVar.g(view2) - gVar.j(view));
    }

    public static int j(androidx.recyclerview.widget.l0 l0Var, androidx.emoji2.text.g gVar, View view, View view2, androidx.recyclerview.widget.c0 c0Var, boolean z, boolean z2) {
        if (c0Var.u() == 0 || l0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (l0Var.b() - Math.max(androidx.recyclerview.widget.c0.G(view), androidx.recyclerview.widget.c0.G(view2))) - 1) : Math.max(0, Math.min(androidx.recyclerview.widget.c0.G(view), androidx.recyclerview.widget.c0.G(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(gVar.g(view2) - gVar.j(view)) / (Math.abs(androidx.recyclerview.widget.c0.G(view) - androidx.recyclerview.widget.c0.G(view2)) + 1))) + (gVar.q() - gVar.j(view)));
        }
        return iMax;
    }

    public static int k(androidx.recyclerview.widget.l0 l0Var, androidx.emoji2.text.g gVar, View view, View view2, androidx.recyclerview.widget.c0 c0Var, boolean z) {
        if (c0Var.u() == 0 || l0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return l0Var.b();
        }
        return (int) (((gVar.g(view2) - gVar.j(view)) / (Math.abs(androidx.recyclerview.widget.c0.G(view) - androidx.recyclerview.widget.c0.G(view2)) + 1)) * l0Var.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (com.google.firebase.b.i(r11.getWidth(), r11.getHeight(), (int) (r2 >> 32), (int) (r2 & 4294967295L), r4, r20) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap l(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, coil3.size.h r18, coil3.size.g r19, coil3.size.h r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = com.google.android.gms.common.wrappers.a.d(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = com.google.firebase.b.h(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = com.google.firebase.b.i(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = coil3.util.m.b(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = coil3.util.m.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = com.google.firebase.b.h(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = com.google.firebase.b.i(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = kotlin.math.a.G(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = kotlin.math.a.G(r2)
            if (r17 == 0) goto L9b
            boolean r2 = com.google.android.gms.common.wrappers.a.d(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.t.l(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, coil3.size.h, coil3.size.g, coil3.size.h, boolean):android.graphics.Bitmap");
    }

    public static void m(String str, String str2, Object obj) {
        String strW = w(str);
        if (Log.isLoggable(strW, 3)) {
            Log.d(strW, String.format(str2, obj));
        }
    }

    public static final float o(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    public static void p(String str, String str2, Exception exc) {
        String strW = w(str);
        if (Log.isLoggable(strW, 6)) {
            Log.e(strW, str2, exc);
        }
    }

    public static float r(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final float s(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = androidx.compose.ui.text.android.m.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : androidx.compose.ui.text.android.style.d.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float t(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = androidx.compose.ui.text.android.m.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? androidx.compose.ui.text.android.style.d.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final androidx.compose.ui.graphics.vector.f u() {
        androidx.compose.ui.graphics.vector.f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Movie", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(18.0f, 4.0f);
        gVar.u(2.0f, 4.0f);
        gVar.s(-3.0f);
        gVar.u(-2.0f, -4.0f);
        gVar.s(-2.0f);
        gVar.u(2.0f, 4.0f);
        gVar.s(-3.0f);
        gVar.u(-2.0f, -4.0f);
        gVar.r(8.0f);
        gVar.u(2.0f, 4.0f);
        gVar.r(7.0f);
        gVar.t(5.0f, 4.0f);
        gVar.r(4.0f);
        gVar.n(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        gVar.t(2.0f, 18.0f);
        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.s(16.0f);
        gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.z(4.0f);
        gVar.s(-4.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f v() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Replay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(12.0f, 5.0f);
        gVar.z(1.0f);
        gVar.t(7.0f, 6.0f);
        gVar.u(5.0f, 5.0f);
        gVar.z(7.0f);
        gVar.n(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        gVar.x(-2.69f, 6.0f, -6.0f, 6.0f);
        gVar.x(-6.0f, -2.69f, -6.0f, -6.0f);
        gVar.r(4.0f);
        gVar.n(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        gVar.x(8.0f, -3.58f, 8.0f, -8.0f);
        gVar.x(-3.58f, -8.0f, -8.0f, -8.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static String w(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static float x(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.b.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final long y(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final void z(float[] fArr, float[] fArr2, int i2, float[] fArr3) {
        if (i2 == 0) {
            androidx.compose.ui.internal.a.a("At least one point must be provided");
        }
        int i3 = 2 >= i2 ? i2 - 1 : 2;
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i2];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i2];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            float[] fArr8 = fArr4[i10];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i2);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr9 = fArr5[i11];
                float fO = o(fArr7, fArr9);
                for (int i12 = 0; i12 < i2; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr9[i12] * fO);
                }
            }
            float fSqrt = (float) Math.sqrt(o(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i13 = 0; i13 < i2; i13++) {
                fArr7[i13] = fArr7[i13] * f2;
            }
            float[] fArr10 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr10[i14] = i14 < i10 ? 0.0f : o(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float fO2 = o(fArr5[i15], fArr2);
            float[] fArr11 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    fO2 -= fArr11[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = fO2 / fArr11[i15];
        }
    }

    public abstract long A();

    public abstract String n(byte[] bArr, int i2, int i3);

    public abstract int q(String str, byte[] bArr, int i2, int i3);
}
