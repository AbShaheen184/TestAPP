package androidx.compose.material3;

import android.view.View;
import com.app.mlounge.emulator.LibretroCore;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final androidx.compose.ui.layout.p a = new androidx.compose.ui.layout.p(0, null);
    public static final androidx.compose.ui.layout.p b = new androidx.compose.ui.layout.p(1, null);
    public static final androidx.compose.material.ripple.b c = new androidx.compose.material.ripple.b();

    /* JADX WARN: Code duplicated, block: B:111:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x017a  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    public static final void a(final kotlin.jvm.functions.a aVar, final androidx.compose.runtime.internal.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.p pVar2, final kotlin.jvm.functions.p pVar3, androidx.compose.ui.graphics.n0 n0Var, final long j, long j2, long j3, long j4, float f, androidx.compose.ui.window.w wVar, androidx.compose.runtime.s sVar, final int i, final int i2, final int i3) {
        int i4;
        androidx.compose.runtime.internal.f fVar2;
        kotlin.jvm.functions.p pVar4;
        int i5;
        androidx.compose.ui.graphics.n0 n0VarA;
        long jD;
        int i6;
        long jD2;
        int i7;
        boolean z;
        final float f2;
        final androidx.compose.ui.window.w wVar2;
        final long j5;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final long j6;
        final long j7;
        final kotlin.jvm.functions.p pVar5;
        final androidx.compose.ui.r rVar2;
        androidx.compose.runtime.s1 s1VarT;
        int i8;
        androidx.compose.ui.r rVar3;
        kotlin.jvm.functions.p pVar6;
        androidx.compose.ui.graphics.n0 n0Var3;
        long j8;
        float f3;
        long j9;
        long j10;
        androidx.compose.ui.window.w wVar3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        sVar.c0(94478519);
        if ((i & 6) == 0) {
            i4 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            fVar2 = fVar;
            i4 |= sVar.h(fVar2) ? 32 : 16;
        } else {
            fVar2 = fVar;
        }
        int i15 = i4 | 384;
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i & 3072) == 0) {
                pVar4 = pVar;
                i15 |= sVar.h(pVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i5 = i15 | 24576;
            if ((196608 & i) != 0) {
                if (sVar.h(pVar2)) {
                    i14 = 131072;
                } else {
                    i14 = Parser.ARGC_LIMIT;
                }
                i5 |= i14;
            }
            if ((1572864 & i) != 0) {
                if (sVar.h(pVar3)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0) {
                    n0VarA = n0Var;
                    int i17 = sVar.f(n0VarA) ? 8388608 : 4194304;
                    i5 |= i17;
                } else {
                    n0VarA = n0Var;
                }
                i5 |= i17;
            } else {
                n0VarA = n0Var;
            }
            if ((100663296 & i) == 0) {
                if (sVar.e(j)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i5 |= i12;
            }
            if ((i & 805306368) == 0) {
                i5 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                jD = j3;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 || !sVar.e(jD)) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                i6 = i2 | i11;
            } else {
                jD = j3;
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                jD2 = j4;
                if ((i3 & 2048) == 0 || !sVar.e(jD2)) {
                    i10 = 16;
                } else {
                    i10 = 32;
                }
                i6 |= i10;
            } else {
                jD2 = j4;
            }
            i7 = i6 | 3456;
            if ((i5 & 306783379) == 306783378 || (i7 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (sVar.T(i5 & 1, z)) {
                sVar.Y();
                if ((i & 1) != 0 || sVar.C()) {
                    if (i16 != 0) {
                        pVar4 = null;
                    }
                    if ((i3 & 128) != 0) {
                        float f4 = a.a;
                        i8 = i5 & (-29360129);
                        n0VarA = d5.a(androidx.compose.material3.tokens.g.c, sVar);
                    } else {
                        i8 = i5;
                    }
                    float f5 = a.a;
                    long jD3 = u0.d(androidx.compose.material3.tokens.g.h, sVar);
                    int i18 = i8 & (-1879048193);
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        jD = u0.d(androidx.compose.material3.tokens.g.d, sVar);
                        i7 &= -15;
                    }
                    if ((i3 & 2048) != 0) {
                        jD2 = u0.d(androidx.compose.material3.tokens.g.f, sVar);
                        i7 &= -113;
                    }
                    float f6 = a.a;
                    androidx.compose.ui.window.w wVar4 = new androidx.compose.ui.window.w(7, false, false);
                    rVar3 = androidx.compose.ui.o.b;
                    long j11 = jD2;
                    pVar6 = pVar4;
                    n0Var3 = n0VarA;
                    j8 = j11;
                    f3 = f6;
                    j9 = jD;
                    j10 = jD3;
                    wVar3 = wVar4;
                    i9 = i18;
                } else {
                    sVar.W();
                    i9 = ((i3 & 128) != 0 ? i5 & (-29360129) : i5) & (-1879048193);
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i7 &= -15;
                    }
                    if ((i3 & 2048) != 0) {
                        i7 &= -113;
                    }
                    long j12 = jD2;
                    pVar6 = pVar4;
                    n0Var3 = n0VarA;
                    j8 = j12;
                    rVar3 = rVar;
                    f3 = f;
                    wVar3 = wVar;
                    j9 = jD;
                    j10 = j2;
                }
                sVar.q();
                androidx.compose.ui.r rVar4 = rVar3;
                j.c(aVar, fVar2, rVar4, pVar6, pVar2, pVar3, n0Var3, j, j10, j9, j8, f3, wVar3, sVar, i9 & 2147483646, i7 & 8190);
                pVar5 = pVar6;
                n0Var2 = n0Var3;
                wVar2 = wVar3;
                rVar2 = rVar4;
                f2 = f3;
                j7 = j8;
                j5 = j9;
                j6 = j10;
            } else {
                sVar.W();
                f2 = f;
                wVar2 = wVar;
                j5 = jD;
                n0Var2 = n0VarA;
                j6 = j2;
                j7 = jD2;
                pVar5 = pVar4;
                rVar2 = rVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.k
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.t.A(i | 1);
                        int iA2 = androidx.compose.runtime.t.A(i2);
                        q.a(aVar, fVar, rVar2, pVar5, pVar2, pVar3, n0Var2, j, j6, j5, j7, f2, wVar2, (androidx.compose.runtime.s) obj, iA, iA2, i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i15 = i4 | 3456;
        pVar4 = pVar;
        i5 = i15 | 24576;
        if ((196608 & i) != 0) {
            if (sVar.h(pVar2)) {
                i14 = 131072;
            } else {
                i14 = Parser.ARGC_LIMIT;
            }
            i5 |= i14;
        }
        if ((1572864 & i) != 0) {
            if (sVar.h(pVar3)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                n0VarA = n0Var;
                if (sVar.f(n0VarA)) {
                }
                i5 |= i17;
            } else {
                n0VarA = n0Var;
            }
            i5 |= i17;
        } else {
            n0VarA = n0Var;
        }
        if ((100663296 & i) == 0) {
            if (sVar.e(j)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i5 |= i12;
        }
        if ((i & 805306368) == 0) {
            i5 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            jD = j3;
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                i11 = 2;
            } else {
                i11 = 2;
            }
            i6 = i2 | i11;
        } else {
            jD = j3;
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            jD2 = j4;
            if ((i3 & 2048) == 0) {
                i10 = 16;
            } else {
                i10 = 16;
            }
            i6 |= i10;
        } else {
            jD2 = j4;
        }
        i7 = i6 | 3456;
        if ((i5 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (sVar.T(i5 & 1, z)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    pVar4 = null;
                }
                if ((i3 & 128) != 0) {
                    float f7 = a.a;
                    i8 = i5 & (-29360129);
                    n0VarA = d5.a(androidx.compose.material3.tokens.g.c, sVar);
                } else {
                    i8 = i5;
                }
                float f8 = a.a;
                long jD4 = u0.d(androidx.compose.material3.tokens.g.h, sVar);
                int i19 = i8 & (-1879048193);
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    jD = u0.d(androidx.compose.material3.tokens.g.d, sVar);
                    i7 &= -15;
                }
                if ((i3 & 2048) != 0) {
                    jD2 = u0.d(androidx.compose.material3.tokens.g.f, sVar);
                    i7 &= -113;
                }
                float f9 = a.a;
                androidx.compose.ui.window.w wVar5 = new androidx.compose.ui.window.w(7, false, false);
                rVar3 = androidx.compose.ui.o.b;
                long j13 = jD2;
                pVar6 = pVar4;
                n0Var3 = n0VarA;
                j8 = j13;
                f3 = f9;
                j9 = jD;
                j10 = jD4;
                wVar3 = wVar5;
                i9 = i19;
            } else {
                if (i16 != 0) {
                    pVar4 = null;
                }
                if ((i3 & 128) != 0) {
                    float f10 = a.a;
                    i8 = i5 & (-29360129);
                    n0VarA = d5.a(androidx.compose.material3.tokens.g.c, sVar);
                } else {
                    i8 = i5;
                }
                float f11 = a.a;
                long jD5 = u0.d(androidx.compose.material3.tokens.g.h, sVar);
                int i110 = i8 & (-1879048193);
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    jD = u0.d(androidx.compose.material3.tokens.g.d, sVar);
                    i7 &= -15;
                }
                if ((i3 & 2048) != 0) {
                    jD2 = u0.d(androidx.compose.material3.tokens.g.f, sVar);
                    i7 &= -113;
                }
                float f12 = a.a;
                androidx.compose.ui.window.w wVar6 = new androidx.compose.ui.window.w(7, false, false);
                rVar3 = androidx.compose.ui.o.b;
                long j14 = jD2;
                pVar6 = pVar4;
                n0Var3 = n0VarA;
                j8 = j14;
                f3 = f12;
                j9 = jD;
                j10 = jD5;
                wVar3 = wVar6;
                i9 = i110;
            }
            sVar.q();
            androidx.compose.ui.r rVar5 = rVar3;
            j.c(aVar, fVar2, rVar5, pVar6, pVar2, pVar3, n0Var3, j, j10, j9, j8, f3, wVar3, sVar, i9 & 2147483646, i7 & 8190);
            pVar5 = pVar6;
            n0Var2 = n0Var3;
            wVar2 = wVar3;
            rVar2 = rVar5;
            f2 = f3;
            j7 = j8;
            j5 = j9;
            j6 = j10;
        } else {
            sVar.W();
            f2 = f;
            wVar2 = wVar;
            j5 = jD;
            n0Var2 = n0VarA;
            j6 = j2;
            j7 = jD2;
            pVar5 = pVar4;
            rVar2 = rVar;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.k
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(i | 1);
                    int iA2 = androidx.compose.runtime.t.A(i2);
                    q.a(aVar, fVar, rVar2, pVar5, pVar2, pVar3, n0Var2, j, j6, j5, j7, f2, wVar2, (androidx.compose.runtime.s) obj, iA, iA2, i3);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:156:0x020f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x022b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0244  */
    /* JADX WARN: Code duplicated, block: B:166:0x0247  */
    /* JADX WARN: Code duplicated, block: B:168:0x024b  */
    /* JADX WARN: Code duplicated, block: B:169:0x024e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0252  */
    /* JADX WARN: Code duplicated, block: B:172:0x0255  */
    /* JADX WARN: Code duplicated, block: B:174:0x0259  */
    /* JADX WARN: Code duplicated, block: B:175:0x025c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0264  */
    /* JADX WARN: Code duplicated, block: B:179:0x027b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0296  */
    /* JADX WARN: Code duplicated, block: B:184:0x029c  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:209:0x0303  */
    /* JADX WARN: Code duplicated, block: B:211:0x034d  */
    /* JADX WARN: Code duplicated, block: B:214:0x035f  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static final void b(kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, w wVar, b0 b0Var, androidx.compose.foundation.a0 a0Var, androidx.compose.foundation.layout.z0 z0Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.q qVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        androidx.compose.ui.r rVar2;
        int i4;
        boolean z2;
        int i5;
        androidx.compose.ui.graphics.n0 n0VarA;
        b0 b0Var2;
        int i6;
        androidx.compose.foundation.a0 a0Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        androidx.compose.foundation.layout.z0 z0Var2;
        androidx.compose.ui.r rVar3;
        androidx.compose.foundation.a0 a0Var3;
        boolean z4;
        androidx.compose.ui.graphics.n0 n0Var2;
        b0 b0Var3;
        androidx.compose.foundation.interaction.k kVar2;
        androidx.compose.runtime.s1 s1VarT;
        b0 b0Var4;
        androidx.compose.foundation.layout.z0 z0Var3;
        androidx.compose.foundation.a0 a0Var4;
        androidx.compose.foundation.interaction.k kVar3;
        androidx.compose.foundation.layout.z0 z0Var4;
        boolean z5;
        b0 b0Var5;
        Object obj;
        androidx.compose.foundation.interaction.k kVar4;
        long j;
        long j2;
        Object objQ;
        androidx.compose.runtime.snapshots.q qVar2;
        boolean zF;
        Object objQ2;
        androidx.compose.foundation.interaction.i iVar;
        float f;
        Object objQ3;
        androidx.compose.animation.core.d dVar;
        boolean zH;
        Object objQ4;
        boolean z6;
        androidx.compose.animation.core.n nVar;
        ?? r10;
        float f2;
        Object objQ5;
        Object objQ6;
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.functions.q qVar3 = qVar;
        sVar.c0(-1310015664);
        if ((i & 6) == 0) {
            i3 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= sVar.f(rVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (sVar.g(z2)) {
                        i5 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        n0VarA = n0Var;
                        if (sVar.f(n0VarA)) {
                            i15 = 2048;
                        }
                        i3 |= i15;
                    } else {
                        n0VarA = n0Var;
                    }
                    i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    i3 |= i15;
                } else {
                    n0VarA = n0Var;
                }
                if ((i & 24576) == 0) {
                    if (sVar.f(wVar)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i3 |= i14;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        b0Var2 = b0Var;
                        if (sVar.f(b0Var2)) {
                            i13 = 131072;
                        }
                        i3 |= i13;
                    } else {
                        b0Var2 = b0Var;
                    }
                    i13 = Parser.ARGC_LIMIT;
                    i3 |= i13;
                } else {
                    b0Var2 = b0Var;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    a0Var2 = a0Var;
                } else {
                    a0Var2 = a0Var;
                    if ((i & 1572864) == 0) {
                        if (sVar.f(a0Var2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (sVar.f(z0Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                i10 = i2 & LibretroCore.SCREEN_WIDTH;
                if (i10 != 0) {
                    if ((i & 100663296) == 0) {
                        if (sVar.f(kVar)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i & 805306368) == 0) {
                        if (sVar.h(qVar3)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (sVar.T(i3 & 1, z3)) {
                        sVar.Y();
                        if ((i & 1) != 0 || sVar.C()) {
                            if (i16 != 0) {
                                rVar2 = androidx.compose.ui.o.b;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                androidx.compose.foundation.layout.z0 z0Var5 = x.a;
                                i3 &= -7169;
                                n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                            }
                            if ((i2 & 32) != 0) {
                                androidx.compose.foundation.layout.z0 z0Var6 = x.a;
                                b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                                i3 &= -458753;
                            } else {
                                b0Var4 = b0Var2;
                            }
                            if (i6 != 0) {
                                a0Var2 = null;
                            }
                            if (i8 != 0) {
                                z0Var3 = x.a;
                            } else {
                                z0Var3 = z0Var;
                            }
                            a0Var4 = a0Var2;
                            if (i10 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            z0Var4 = z0Var3;
                            z5 = z2;
                            b0Var5 = b0Var4;
                        } else {
                            sVar.W();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            a0Var4 = a0Var2;
                            kVar3 = kVar;
                            i3 = i3;
                            b0Var5 = b0Var2;
                            z0Var4 = z0Var;
                            n0VarA = n0VarA;
                            z5 = z2;
                        }
                        sVar.q();
                        obj = androidx.compose.runtime.n.a;
                        if (kVar3 == null) {
                            sVar.b0(1691738187);
                            objQ6 = sVar.Q();
                            if (objQ6 == obj) {
                                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                            sVar.p(false);
                        } else {
                            sVar.b0(-499617780);
                            sVar.p(false);
                            kVar4 = kVar3;
                        }
                        if (z5) {
                            j = wVar.a;
                        } else {
                            j = wVar.c;
                        }
                        androidx.compose.foundation.layout.z0 z0Var7 = z0Var4;
                        if (z5) {
                            j2 = wVar.b;
                        } else {
                            j2 = wVar.d;
                        }
                        if (b0Var5 == null) {
                            sVar.b0(1691921830);
                            sVar.p(false);
                            j = j;
                            z6 = z5;
                            n0VarA = n0VarA;
                            kVar4 = kVar4;
                            r10 = 0;
                            nVar = null;
                        } else {
                            sVar.b0(-499611205);
                            int i17 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                            objQ = sVar.Q();
                            if (objQ == obj) {
                                objQ = new androidx.compose.runtime.snapshots.q();
                                sVar.l0(objQ);
                            }
                            qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                            zF = sVar.f(kVar4);
                            objQ2 = sVar.Q();
                            if (zF || objQ2 == obj) {
                                objQ2 = new z(kVar4, qVar2, null, 0);
                                sVar.l0(objQ2);
                            }
                            androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                            iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                            if (!z5) {
                                f = b0Var5.e;
                            } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                                f = b0Var5.b;
                            } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                                f = b0Var5.d;
                            } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                                f = b0Var5.c;
                            } else {
                                f = b0Var5.a;
                            }
                            objQ3 = sVar.Q();
                            if (objQ3 == obj) {
                                objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                                sVar.l0(objQ3);
                            }
                            dVar = (androidx.compose.animation.core.d) objQ3;
                            androidx.compose.ui.unit.f fVar = new androidx.compose.ui.unit.f(f);
                            zH = ((((i17 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i17 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i17 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i17 & 6) == 4) | sVar.h(iVar);
                            objQ4 = sVar.Q();
                            if (!zH || objQ4 == obj) {
                                z6 = z5;
                                objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                                sVar.l0(objQ4);
                            } else {
                                z6 = z5;
                            }
                            androidx.compose.runtime.l0.c(sVar, fVar, (kotlin.jvm.functions.p) objQ4);
                            nVar = dVar.c;
                            r10 = 0;
                            sVar.p(false);
                        }
                        if (nVar != null) {
                            f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                        } else {
                            f2 = (float) r10;
                        }
                        float f3 = f2;
                        objQ5 = sVar.Q();
                        if (objQ5 == obj) {
                            objQ5 = new androidx.compose.foundation.gestures.w1(24);
                            sVar.l0(objQ5);
                        }
                        androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
                        qVar3 = qVar;
                        androidx.compose.ui.graphics.n0 n0Var3 = n0VarA;
                        boolean z7 = z6;
                        p5.b(aVar, rVarA, z7, n0Var3, j, j2, f3, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var7, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                        kVar2 = kVar3;
                        b0Var3 = b0Var5;
                        z0Var2 = z0Var7;
                        rVar3 = rVar2;
                        n0Var2 = n0Var3;
                        a0Var3 = a0Var4;
                        z4 = z7;
                    } else {
                        sVar.W();
                        z0Var2 = z0Var;
                        rVar3 = rVar2;
                        a0Var3 = a0Var2;
                        z4 = z2;
                        n0Var2 = n0VarA;
                        b0Var3 = b0Var2;
                        kVar2 = kVar;
                    }
                    s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
                    }
                }
                i3 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (sVar.h(qVar3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i3 |= i12;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (sVar.T(i3 & 1, z3)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var8 = x.a;
                            i3 &= -7169;
                            n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var9 = x.a;
                            b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            b0Var4 = b0Var2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            z0Var3 = x.a;
                        } else {
                            z0Var3 = z0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        z0Var4 = z0Var3;
                        z5 = z2;
                        b0Var5 = b0Var4;
                    } else {
                        if (i16 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var10 = x.a;
                            i3 &= -7169;
                            n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var11 = x.a;
                            b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            b0Var4 = b0Var2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            z0Var3 = x.a;
                        } else {
                            z0Var3 = z0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        z0Var4 = z0Var3;
                        z5 = z2;
                        b0Var5 = b0Var4;
                    }
                    sVar.q();
                    obj = androidx.compose.runtime.n.a;
                    if (kVar3 == null) {
                        sVar.b0(1691738187);
                        objQ6 = sVar.Q();
                        if (objQ6 == obj) {
                            objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                        sVar.p(false);
                    } else {
                        sVar.b0(-499617780);
                        sVar.p(false);
                        kVar4 = kVar3;
                    }
                    if (z5) {
                        j = wVar.a;
                    } else {
                        j = wVar.c;
                    }
                    androidx.compose.foundation.layout.z0 z0Var12 = z0Var4;
                    if (z5) {
                        j2 = wVar.b;
                    } else {
                        j2 = wVar.d;
                    }
                    if (b0Var5 == null) {
                        sVar.b0(1691921830);
                        sVar.p(false);
                        j = j;
                        z6 = z5;
                        n0VarA = n0VarA;
                        kVar4 = kVar4;
                        r10 = 0;
                        nVar = null;
                    } else {
                        sVar.b0(-499611205);
                        int i18 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                        objQ = sVar.Q();
                        if (objQ == obj) {
                            objQ = new androidx.compose.runtime.snapshots.q();
                            sVar.l0(objQ);
                        }
                        qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                        zF = sVar.f(kVar4);
                        objQ2 = sVar.Q();
                        if (zF) {
                            objQ2 = new z(kVar4, qVar2, null, 0);
                            sVar.l0(objQ2);
                        } else {
                            objQ2 = new z(kVar4, qVar2, null, 0);
                            sVar.l0(objQ2);
                        }
                        androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                        if (!z5) {
                            f = b0Var5.e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                            f = b0Var5.b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f = b0Var5.d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f = b0Var5.c;
                        } else {
                            f = b0Var5.a;
                        }
                        objQ3 = sVar.Q();
                        if (objQ3 == obj) {
                            objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                            sVar.l0(objQ3);
                        }
                        dVar = (androidx.compose.animation.core.d) objQ3;
                        androidx.compose.ui.unit.f fVar2 = new androidx.compose.ui.unit.f(f);
                        zH = ((((i18 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i18 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i18 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i18 & 6) == 4) | sVar.h(iVar);
                        objQ4 = sVar.Q();
                        if (zH) {
                            z6 = z5;
                            objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                            sVar.l0(objQ4);
                        } else {
                            z6 = z5;
                            objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                            sVar.l0(objQ4);
                        }
                        androidx.compose.runtime.l0.c(sVar, fVar2, (kotlin.jvm.functions.p) objQ4);
                        nVar = dVar.c;
                        r10 = 0;
                        sVar.p(false);
                    }
                    if (nVar != null) {
                        f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                    } else {
                        f2 = (float) r10;
                    }
                    float f4 = f2;
                    objQ5 = sVar.Q();
                    if (objQ5 == obj) {
                        objQ5 = new androidx.compose.foundation.gestures.w1(24);
                        sVar.l0(objQ5);
                    }
                    androidx.compose.ui.r rVarA2 = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
                    qVar3 = qVar;
                    androidx.compose.ui.graphics.n0 n0Var4 = n0VarA;
                    boolean z8 = z6;
                    p5.b(aVar, rVarA2, z8, n0Var4, j, j2, f4, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var12, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                    kVar2 = kVar3;
                    b0Var3 = b0Var5;
                    z0Var2 = z0Var12;
                    rVar3 = rVar2;
                    n0Var2 = n0Var4;
                    a0Var3 = a0Var4;
                    z4 = z8;
                } else {
                    sVar.W();
                    z0Var2 = z0Var;
                    rVar3 = rVar2;
                    a0Var3 = a0Var2;
                    z4 = z2;
                    n0Var2 = n0VarA;
                    b0Var3 = b0Var2;
                    kVar2 = kVar;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    n0VarA = n0Var;
                    if (sVar.f(n0VarA)) {
                        i15 = 2048;
                    }
                    i3 |= i15;
                } else {
                    n0VarA = n0Var;
                }
                i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i15;
            } else {
                n0VarA = n0Var;
            }
            if ((i & 24576) == 0) {
                if (sVar.f(wVar)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i3 |= i14;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    b0Var2 = b0Var;
                    if (sVar.f(b0Var2)) {
                        i13 = 131072;
                    }
                    i3 |= i13;
                } else {
                    b0Var2 = b0Var;
                }
                i13 = Parser.ARGC_LIMIT;
                i3 |= i13;
            } else {
                b0Var2 = b0Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                a0Var2 = a0Var;
            } else {
                a0Var2 = a0Var;
                if ((i & 1572864) == 0) {
                    if (sVar.f(a0Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (sVar.f(z0Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    if (sVar.f(kVar)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i & 805306368) == 0) {
                    if (sVar.h(qVar3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i3 |= i12;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (sVar.T(i3 & 1, z3)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var13 = x.a;
                            i3 &= -7169;
                            n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var14 = x.a;
                            b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            b0Var4 = b0Var2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            z0Var3 = x.a;
                        } else {
                            z0Var3 = z0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        z0Var4 = z0Var3;
                        z5 = z2;
                        b0Var5 = b0Var4;
                    } else {
                        if (i16 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var15 = x.a;
                            i3 &= -7169;
                            n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var16 = x.a;
                            b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            b0Var4 = b0Var2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            z0Var3 = x.a;
                        } else {
                            z0Var3 = z0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        z0Var4 = z0Var3;
                        z5 = z2;
                        b0Var5 = b0Var4;
                    }
                    sVar.q();
                    obj = androidx.compose.runtime.n.a;
                    if (kVar3 == null) {
                        sVar.b0(1691738187);
                        objQ6 = sVar.Q();
                        if (objQ6 == obj) {
                            objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                        sVar.p(false);
                    } else {
                        sVar.b0(-499617780);
                        sVar.p(false);
                        kVar4 = kVar3;
                    }
                    if (z5) {
                        j = wVar.a;
                    } else {
                        j = wVar.c;
                    }
                    androidx.compose.foundation.layout.z0 z0Var17 = z0Var4;
                    if (z5) {
                        j2 = wVar.b;
                    } else {
                        j2 = wVar.d;
                    }
                    if (b0Var5 == null) {
                        sVar.b0(1691921830);
                        sVar.p(false);
                        j = j;
                        z6 = z5;
                        n0VarA = n0VarA;
                        kVar4 = kVar4;
                        r10 = 0;
                        nVar = null;
                    } else {
                        sVar.b0(-499611205);
                        int i19 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                        objQ = sVar.Q();
                        if (objQ == obj) {
                            objQ = new androidx.compose.runtime.snapshots.q();
                            sVar.l0(objQ);
                        }
                        qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                        zF = sVar.f(kVar4);
                        objQ2 = sVar.Q();
                        if (zF) {
                            objQ2 = new z(kVar4, qVar2, null, 0);
                            sVar.l0(objQ2);
                        } else {
                            objQ2 = new z(kVar4, qVar2, null, 0);
                            sVar.l0(objQ2);
                        }
                        androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                        if (!z5) {
                            f = b0Var5.e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                            f = b0Var5.b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f = b0Var5.d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f = b0Var5.c;
                        } else {
                            f = b0Var5.a;
                        }
                        objQ3 = sVar.Q();
                        if (objQ3 == obj) {
                            objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                            sVar.l0(objQ3);
                        }
                        dVar = (androidx.compose.animation.core.d) objQ3;
                        androidx.compose.ui.unit.f fVar3 = new androidx.compose.ui.unit.f(f);
                        zH = ((((i19 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i19 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i19 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i19 & 6) == 4) | sVar.h(iVar);
                        objQ4 = sVar.Q();
                        if (zH) {
                            z6 = z5;
                            objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                            sVar.l0(objQ4);
                        } else {
                            z6 = z5;
                            objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                            sVar.l0(objQ4);
                        }
                        androidx.compose.runtime.l0.c(sVar, fVar3, (kotlin.jvm.functions.p) objQ4);
                        nVar = dVar.c;
                        r10 = 0;
                        sVar.p(false);
                    }
                    if (nVar != null) {
                        f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                    } else {
                        f2 = (float) r10;
                    }
                    float f5 = f2;
                    objQ5 = sVar.Q();
                    if (objQ5 == obj) {
                        objQ5 = new androidx.compose.foundation.gestures.w1(24);
                        sVar.l0(objQ5);
                    }
                    androidx.compose.ui.r rVarA3 = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
                    qVar3 = qVar;
                    androidx.compose.ui.graphics.n0 n0Var5 = n0VarA;
                    boolean z9 = z6;
                    p5.b(aVar, rVarA3, z9, n0Var5, j, j2, f5, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var17, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                    kVar2 = kVar3;
                    b0Var3 = b0Var5;
                    z0Var2 = z0Var17;
                    rVar3 = rVar2;
                    n0Var2 = n0Var5;
                    a0Var3 = a0Var4;
                    z4 = z9;
                } else {
                    sVar.W();
                    z0Var2 = z0Var;
                    rVar3 = rVar2;
                    a0Var3 = a0Var2;
                    z4 = z2;
                    n0Var2 = n0VarA;
                    b0Var3 = b0Var2;
                    kVar2 = kVar;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
                }
            }
            i3 |= 100663296;
            if ((i & 805306368) == 0) {
                if (sVar.h(qVar3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i3 & 1, z3)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var18 = x.a;
                        i3 &= -7169;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var19 = x.a;
                        b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        b0Var4 = b0Var2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        z0Var3 = x.a;
                    } else {
                        z0Var3 = z0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    z0Var4 = z0Var3;
                    z5 = z2;
                    b0Var5 = b0Var4;
                } else {
                    if (i16 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var110 = x.a;
                        i3 &= -7169;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var111 = x.a;
                        b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        b0Var4 = b0Var2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        z0Var3 = x.a;
                    } else {
                        z0Var3 = z0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    z0Var4 = z0Var3;
                    z5 = z2;
                    b0Var5 = b0Var4;
                }
                sVar.q();
                obj = androidx.compose.runtime.n.a;
                if (kVar3 == null) {
                    sVar.b0(1691738187);
                    objQ6 = sVar.Q();
                    if (objQ6 == obj) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                    sVar.p(false);
                } else {
                    sVar.b0(-499617780);
                    sVar.p(false);
                    kVar4 = kVar3;
                }
                if (z5) {
                    j = wVar.a;
                } else {
                    j = wVar.c;
                }
                androidx.compose.foundation.layout.z0 z0Var112 = z0Var4;
                if (z5) {
                    j2 = wVar.b;
                } else {
                    j2 = wVar.d;
                }
                if (b0Var5 == null) {
                    sVar.b0(1691921830);
                    sVar.p(false);
                    j = j;
                    z6 = z5;
                    n0VarA = n0VarA;
                    kVar4 = kVar4;
                    r10 = 0;
                    nVar = null;
                } else {
                    sVar.b0(-499611205);
                    int i110 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                    objQ = sVar.Q();
                    if (objQ == obj) {
                        objQ = new androidx.compose.runtime.snapshots.q();
                        sVar.l0(objQ);
                    }
                    qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                    zF = sVar.f(kVar4);
                    objQ2 = sVar.Q();
                    if (zF) {
                        objQ2 = new z(kVar4, qVar2, null, 0);
                        sVar.l0(objQ2);
                    } else {
                        objQ2 = new z(kVar4, qVar2, null, 0);
                        sVar.l0(objQ2);
                    }
                    androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                    if (!z5) {
                        f = b0Var5.e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                        f = b0Var5.b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f = b0Var5.d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f = b0Var5.c;
                    } else {
                        f = b0Var5.a;
                    }
                    objQ3 = sVar.Q();
                    if (objQ3 == obj) {
                        objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                        sVar.l0(objQ3);
                    }
                    dVar = (androidx.compose.animation.core.d) objQ3;
                    androidx.compose.ui.unit.f fVar4 = new androidx.compose.ui.unit.f(f);
                    zH = ((((i110 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i110 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i110 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i110 & 6) == 4) | sVar.h(iVar);
                    objQ4 = sVar.Q();
                    if (zH) {
                        z6 = z5;
                        objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                        sVar.l0(objQ4);
                    } else {
                        z6 = z5;
                        objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                        sVar.l0(objQ4);
                    }
                    androidx.compose.runtime.l0.c(sVar, fVar4, (kotlin.jvm.functions.p) objQ4);
                    nVar = dVar.c;
                    r10 = 0;
                    sVar.p(false);
                }
                if (nVar != null) {
                    f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                } else {
                    f2 = (float) r10;
                }
                float f6 = f2;
                objQ5 = sVar.Q();
                if (objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.gestures.w1(24);
                    sVar.l0(objQ5);
                }
                androidx.compose.ui.r rVarA4 = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
                qVar3 = qVar;
                androidx.compose.ui.graphics.n0 n0Var6 = n0VarA;
                boolean z10 = z6;
                p5.b(aVar, rVarA4, z10, n0Var6, j, j2, f6, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var112, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                kVar2 = kVar3;
                b0Var3 = b0Var5;
                z0Var2 = z0Var112;
                rVar3 = rVar2;
                n0Var2 = n0Var6;
                a0Var3 = a0Var4;
                z4 = z10;
            } else {
                sVar.W();
                z0Var2 = z0Var;
                rVar3 = rVar2;
                a0Var3 = a0Var2;
                z4 = z2;
                n0Var2 = n0VarA;
                b0Var3 = b0Var2;
                kVar2 = kVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (sVar.g(z2)) {
                    i5 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    n0VarA = n0Var;
                    if (sVar.f(n0VarA)) {
                        i15 = 2048;
                    }
                    i3 |= i15;
                } else {
                    n0VarA = n0Var;
                }
                i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i15;
            } else {
                n0VarA = n0Var;
            }
            if ((i & 24576) == 0) {
                if (sVar.f(wVar)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i3 |= i14;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    b0Var2 = b0Var;
                    if (sVar.f(b0Var2)) {
                        i13 = 131072;
                    }
                    i3 |= i13;
                } else {
                    b0Var2 = b0Var;
                }
                i13 = Parser.ARGC_LIMIT;
                i3 |= i13;
            } else {
                b0Var2 = b0Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                a0Var2 = a0Var;
            } else {
                a0Var2 = a0Var;
                if ((i & 1572864) == 0) {
                    if (sVar.f(a0Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (sVar.f(z0Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i10 != 0) {
                if ((i & 100663296) == 0) {
                    if (sVar.f(kVar)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i & 805306368) == 0) {
                    if (sVar.h(qVar3)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i3 |= i12;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (sVar.T(i3 & 1, z3)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var113 = x.a;
                            i3 &= -7169;
                            n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var114 = x.a;
                            b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            b0Var4 = b0Var2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            z0Var3 = x.a;
                        } else {
                            z0Var3 = z0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        z0Var4 = z0Var3;
                        z5 = z2;
                        b0Var5 = b0Var4;
                    } else {
                        if (i16 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var115 = x.a;
                            i3 &= -7169;
                            n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        }
                        if ((i2 & 32) != 0) {
                            androidx.compose.foundation.layout.z0 z0Var116 = x.a;
                            b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                            i3 &= -458753;
                        } else {
                            b0Var4 = b0Var2;
                        }
                        if (i6 != 0) {
                            a0Var2 = null;
                        }
                        if (i8 != 0) {
                            z0Var3 = x.a;
                        } else {
                            z0Var3 = z0Var;
                        }
                        a0Var4 = a0Var2;
                        if (i10 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        z0Var4 = z0Var3;
                        z5 = z2;
                        b0Var5 = b0Var4;
                    }
                    sVar.q();
                    obj = androidx.compose.runtime.n.a;
                    if (kVar3 == null) {
                        sVar.b0(1691738187);
                        objQ6 = sVar.Q();
                        if (objQ6 == obj) {
                            objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                        sVar.p(false);
                    } else {
                        sVar.b0(-499617780);
                        sVar.p(false);
                        kVar4 = kVar3;
                    }
                    if (z5) {
                        j = wVar.a;
                    } else {
                        j = wVar.c;
                    }
                    androidx.compose.foundation.layout.z0 z0Var117 = z0Var4;
                    if (z5) {
                        j2 = wVar.b;
                    } else {
                        j2 = wVar.d;
                    }
                    if (b0Var5 == null) {
                        sVar.b0(1691921830);
                        sVar.p(false);
                        j = j;
                        z6 = z5;
                        n0VarA = n0VarA;
                        kVar4 = kVar4;
                        r10 = 0;
                        nVar = null;
                    } else {
                        sVar.b0(-499611205);
                        int i111 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                        objQ = sVar.Q();
                        if (objQ == obj) {
                            objQ = new androidx.compose.runtime.snapshots.q();
                            sVar.l0(objQ);
                        }
                        qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                        zF = sVar.f(kVar4);
                        objQ2 = sVar.Q();
                        if (zF) {
                            objQ2 = new z(kVar4, qVar2, null, 0);
                            sVar.l0(objQ2);
                        } else {
                            objQ2 = new z(kVar4, qVar2, null, 0);
                            sVar.l0(objQ2);
                        }
                        androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                        if (!z5) {
                            f = b0Var5.e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                            f = b0Var5.b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f = b0Var5.d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f = b0Var5.c;
                        } else {
                            f = b0Var5.a;
                        }
                        objQ3 = sVar.Q();
                        if (objQ3 == obj) {
                            objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                            sVar.l0(objQ3);
                        }
                        dVar = (androidx.compose.animation.core.d) objQ3;
                        androidx.compose.ui.unit.f fVar5 = new androidx.compose.ui.unit.f(f);
                        zH = ((((i111 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i111 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i111 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i111 & 6) == 4) | sVar.h(iVar);
                        objQ4 = sVar.Q();
                        if (zH) {
                            z6 = z5;
                            objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                            sVar.l0(objQ4);
                        } else {
                            z6 = z5;
                            objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                            sVar.l0(objQ4);
                        }
                        androidx.compose.runtime.l0.c(sVar, fVar5, (kotlin.jvm.functions.p) objQ4);
                        nVar = dVar.c;
                        r10 = 0;
                        sVar.p(false);
                    }
                    if (nVar != null) {
                        f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                    } else {
                        f2 = (float) r10;
                    }
                    float f7 = f2;
                    objQ5 = sVar.Q();
                    if (objQ5 == obj) {
                        objQ5 = new androidx.compose.foundation.gestures.w1(24);
                        sVar.l0(objQ5);
                    }
                    androidx.compose.ui.r rVarA5 = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
                    qVar3 = qVar;
                    androidx.compose.ui.graphics.n0 n0Var7 = n0VarA;
                    boolean z11 = z6;
                    p5.b(aVar, rVarA5, z11, n0Var7, j, j2, f7, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var117, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                    kVar2 = kVar3;
                    b0Var3 = b0Var5;
                    z0Var2 = z0Var117;
                    rVar3 = rVar2;
                    n0Var2 = n0Var7;
                    a0Var3 = a0Var4;
                    z4 = z11;
                } else {
                    sVar.W();
                    z0Var2 = z0Var;
                    rVar3 = rVar2;
                    a0Var3 = a0Var2;
                    z4 = z2;
                    n0Var2 = n0VarA;
                    b0Var3 = b0Var2;
                    kVar2 = kVar;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
                }
            }
            i3 |= 100663296;
            if ((i & 805306368) == 0) {
                if (sVar.h(qVar3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i3 & 1, z3)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var118 = x.a;
                        i3 &= -7169;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var119 = x.a;
                        b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        b0Var4 = b0Var2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        z0Var3 = x.a;
                    } else {
                        z0Var3 = z0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    z0Var4 = z0Var3;
                    z5 = z2;
                    b0Var5 = b0Var4;
                } else {
                    if (i16 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var1110 = x.a;
                        i3 &= -7169;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var1111 = x.a;
                        b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        b0Var4 = b0Var2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        z0Var3 = x.a;
                    } else {
                        z0Var3 = z0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    z0Var4 = z0Var3;
                    z5 = z2;
                    b0Var5 = b0Var4;
                }
                sVar.q();
                obj = androidx.compose.runtime.n.a;
                if (kVar3 == null) {
                    sVar.b0(1691738187);
                    objQ6 = sVar.Q();
                    if (objQ6 == obj) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                    sVar.p(false);
                } else {
                    sVar.b0(-499617780);
                    sVar.p(false);
                    kVar4 = kVar3;
                }
                if (z5) {
                    j = wVar.a;
                } else {
                    j = wVar.c;
                }
                androidx.compose.foundation.layout.z0 z0Var1112 = z0Var4;
                if (z5) {
                    j2 = wVar.b;
                } else {
                    j2 = wVar.d;
                }
                if (b0Var5 == null) {
                    sVar.b0(1691921830);
                    sVar.p(false);
                    j = j;
                    z6 = z5;
                    n0VarA = n0VarA;
                    kVar4 = kVar4;
                    r10 = 0;
                    nVar = null;
                } else {
                    sVar.b0(-499611205);
                    int i112 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                    objQ = sVar.Q();
                    if (objQ == obj) {
                        objQ = new androidx.compose.runtime.snapshots.q();
                        sVar.l0(objQ);
                    }
                    qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                    zF = sVar.f(kVar4);
                    objQ2 = sVar.Q();
                    if (zF) {
                        objQ2 = new z(kVar4, qVar2, null, 0);
                        sVar.l0(objQ2);
                    } else {
                        objQ2 = new z(kVar4, qVar2, null, 0);
                        sVar.l0(objQ2);
                    }
                    androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                    if (!z5) {
                        f = b0Var5.e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                        f = b0Var5.b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f = b0Var5.d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f = b0Var5.c;
                    } else {
                        f = b0Var5.a;
                    }
                    objQ3 = sVar.Q();
                    if (objQ3 == obj) {
                        objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                        sVar.l0(objQ3);
                    }
                    dVar = (androidx.compose.animation.core.d) objQ3;
                    androidx.compose.ui.unit.f fVar6 = new androidx.compose.ui.unit.f(f);
                    zH = ((((i112 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i112 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i112 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i112 & 6) == 4) | sVar.h(iVar);
                    objQ4 = sVar.Q();
                    if (zH) {
                        z6 = z5;
                        objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                        sVar.l0(objQ4);
                    } else {
                        z6 = z5;
                        objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                        sVar.l0(objQ4);
                    }
                    androidx.compose.runtime.l0.c(sVar, fVar6, (kotlin.jvm.functions.p) objQ4);
                    nVar = dVar.c;
                    r10 = 0;
                    sVar.p(false);
                }
                if (nVar != null) {
                    f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                } else {
                    f2 = (float) r10;
                }
                float f8 = f2;
                objQ5 = sVar.Q();
                if (objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.gestures.w1(24);
                    sVar.l0(objQ5);
                }
                androidx.compose.ui.r rVarA6 = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
                qVar3 = qVar;
                androidx.compose.ui.graphics.n0 n0Var8 = n0VarA;
                boolean z12 = z6;
                p5.b(aVar, rVarA6, z12, n0Var8, j, j2, f8, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var1112, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                kVar2 = kVar3;
                b0Var3 = b0Var5;
                z0Var2 = z0Var1112;
                rVar3 = rVar2;
                n0Var2 = n0Var8;
                a0Var3 = a0Var4;
                z4 = z12;
            } else {
                sVar.W();
                z0Var2 = z0Var;
                rVar3 = rVar2;
                a0Var3 = a0Var2;
                z4 = z2;
                n0Var2 = n0VarA;
                b0Var3 = b0Var2;
                kVar2 = kVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                n0VarA = n0Var;
                if (sVar.f(n0VarA)) {
                    i15 = 2048;
                }
                i3 |= i15;
            } else {
                n0VarA = n0Var;
            }
            i15 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i15;
        } else {
            n0VarA = n0Var;
        }
        if ((i & 24576) == 0) {
            if (sVar.f(wVar)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i3 |= i14;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                b0Var2 = b0Var;
                if (sVar.f(b0Var2)) {
                    i13 = 131072;
                }
                i3 |= i13;
            } else {
                b0Var2 = b0Var;
            }
            i13 = Parser.ARGC_LIMIT;
            i3 |= i13;
        } else {
            b0Var2 = b0Var;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            a0Var2 = a0Var;
        } else {
            a0Var2 = a0Var;
            if ((i & 1572864) == 0) {
                if (sVar.f(a0Var2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (sVar.f(z0Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        i10 = i2 & LibretroCore.SCREEN_WIDTH;
        if (i10 != 0) {
            if ((i & 100663296) == 0) {
                if (sVar.f(kVar)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i & 805306368) == 0) {
                if (sVar.h(qVar3)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i3 & 1, z3)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var1113 = x.a;
                        i3 &= -7169;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var1114 = x.a;
                        b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        b0Var4 = b0Var2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        z0Var3 = x.a;
                    } else {
                        z0Var3 = z0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    z0Var4 = z0Var3;
                    z5 = z2;
                    b0Var5 = b0Var4;
                } else {
                    if (i16 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var1115 = x.a;
                        i3 &= -7169;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    }
                    if ((i2 & 32) != 0) {
                        androidx.compose.foundation.layout.z0 z0Var1116 = x.a;
                        b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                        i3 &= -458753;
                    } else {
                        b0Var4 = b0Var2;
                    }
                    if (i6 != 0) {
                        a0Var2 = null;
                    }
                    if (i8 != 0) {
                        z0Var3 = x.a;
                    } else {
                        z0Var3 = z0Var;
                    }
                    a0Var4 = a0Var2;
                    if (i10 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    z0Var4 = z0Var3;
                    z5 = z2;
                    b0Var5 = b0Var4;
                }
                sVar.q();
                obj = androidx.compose.runtime.n.a;
                if (kVar3 == null) {
                    sVar.b0(1691738187);
                    objQ6 = sVar.Q();
                    if (objQ6 == obj) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                    sVar.p(false);
                } else {
                    sVar.b0(-499617780);
                    sVar.p(false);
                    kVar4 = kVar3;
                }
                if (z5) {
                    j = wVar.a;
                } else {
                    j = wVar.c;
                }
                androidx.compose.foundation.layout.z0 z0Var1117 = z0Var4;
                if (z5) {
                    j2 = wVar.b;
                } else {
                    j2 = wVar.d;
                }
                if (b0Var5 == null) {
                    sVar.b0(1691921830);
                    sVar.p(false);
                    j = j;
                    z6 = z5;
                    n0VarA = n0VarA;
                    kVar4 = kVar4;
                    r10 = 0;
                    nVar = null;
                } else {
                    sVar.b0(-499611205);
                    int i113 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                    objQ = sVar.Q();
                    if (objQ == obj) {
                        objQ = new androidx.compose.runtime.snapshots.q();
                        sVar.l0(objQ);
                    }
                    qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                    zF = sVar.f(kVar4);
                    objQ2 = sVar.Q();
                    if (zF) {
                        objQ2 = new z(kVar4, qVar2, null, 0);
                        sVar.l0(objQ2);
                    } else {
                        objQ2 = new z(kVar4, qVar2, null, 0);
                        sVar.l0(objQ2);
                    }
                    androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                    if (!z5) {
                        f = b0Var5.e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                        f = b0Var5.b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f = b0Var5.d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f = b0Var5.c;
                    } else {
                        f = b0Var5.a;
                    }
                    objQ3 = sVar.Q();
                    if (objQ3 == obj) {
                        objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                        sVar.l0(objQ3);
                    }
                    dVar = (androidx.compose.animation.core.d) objQ3;
                    androidx.compose.ui.unit.f fVar7 = new androidx.compose.ui.unit.f(f);
                    zH = ((((i113 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i113 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i113 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i113 & 6) == 4) | sVar.h(iVar);
                    objQ4 = sVar.Q();
                    if (zH) {
                        z6 = z5;
                        objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                        sVar.l0(objQ4);
                    } else {
                        z6 = z5;
                        objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                        sVar.l0(objQ4);
                    }
                    androidx.compose.runtime.l0.c(sVar, fVar7, (kotlin.jvm.functions.p) objQ4);
                    nVar = dVar.c;
                    r10 = 0;
                    sVar.p(false);
                }
                if (nVar != null) {
                    f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
                } else {
                    f2 = (float) r10;
                }
                float f9 = f2;
                objQ5 = sVar.Q();
                if (objQ5 == obj) {
                    objQ5 = new androidx.compose.foundation.gestures.w1(24);
                    sVar.l0(objQ5);
                }
                androidx.compose.ui.r rVarA7 = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
                qVar3 = qVar;
                androidx.compose.ui.graphics.n0 n0Var9 = n0VarA;
                boolean z13 = z6;
                p5.b(aVar, rVarA7, z13, n0Var9, j, j2, f9, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var1117, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
                kVar2 = kVar3;
                b0Var3 = b0Var5;
                z0Var2 = z0Var1117;
                rVar3 = rVar2;
                n0Var2 = n0Var9;
                a0Var3 = a0Var4;
                z4 = z13;
            } else {
                sVar.W();
                z0Var2 = z0Var;
                rVar3 = rVar2;
                a0Var3 = a0Var2;
                z4 = z2;
                n0Var2 = n0VarA;
                b0Var3 = b0Var2;
                kVar2 = kVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
            }
        }
        i3 |= 100663296;
        if ((i & 805306368) == 0) {
            if (sVar.h(qVar3)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i3 |= i12;
        }
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sVar.T(i3 & 1, z3)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    rVar2 = androidx.compose.ui.o.b;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    androidx.compose.foundation.layout.z0 z0Var1118 = x.a;
                    i3 &= -7169;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                }
                if ((i2 & 32) != 0) {
                    androidx.compose.foundation.layout.z0 z0Var1119 = x.a;
                    b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                    i3 &= -458753;
                } else {
                    b0Var4 = b0Var2;
                }
                if (i6 != 0) {
                    a0Var2 = null;
                }
                if (i8 != 0) {
                    z0Var3 = x.a;
                } else {
                    z0Var3 = z0Var;
                }
                a0Var4 = a0Var2;
                if (i10 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                z0Var4 = z0Var3;
                z5 = z2;
                b0Var5 = b0Var4;
            } else {
                if (i16 != 0) {
                    rVar2 = androidx.compose.ui.o.b;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    androidx.compose.foundation.layout.z0 z0Var11110 = x.a;
                    i3 &= -7169;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                }
                if ((i2 & 32) != 0) {
                    androidx.compose.foundation.layout.z0 z0Var11111 = x.a;
                    b0Var4 = new b0(androidx.compose.material3.tokens.j.b, androidx.compose.material3.tokens.j.k, androidx.compose.material3.tokens.j.h, androidx.compose.material3.tokens.j.i, androidx.compose.material3.tokens.j.d);
                    i3 &= -458753;
                } else {
                    b0Var4 = b0Var2;
                }
                if (i6 != 0) {
                    a0Var2 = null;
                }
                if (i8 != 0) {
                    z0Var3 = x.a;
                } else {
                    z0Var3 = z0Var;
                }
                a0Var4 = a0Var2;
                if (i10 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                z0Var4 = z0Var3;
                z5 = z2;
                b0Var5 = b0Var4;
            }
            sVar.q();
            obj = androidx.compose.runtime.n.a;
            if (kVar3 == null) {
                sVar.b0(1691738187);
                objQ6 = sVar.Q();
                if (objQ6 == obj) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                sVar.p(false);
            } else {
                sVar.b0(-499617780);
                sVar.p(false);
                kVar4 = kVar3;
            }
            if (z5) {
                j = wVar.a;
            } else {
                j = wVar.c;
            }
            androidx.compose.foundation.layout.z0 z0Var11112 = z0Var4;
            if (z5) {
                j2 = wVar.b;
            } else {
                j2 = wVar.d;
            }
            if (b0Var5 == null) {
                sVar.b0(1691921830);
                sVar.p(false);
                j = j;
                z6 = z5;
                n0VarA = n0VarA;
                kVar4 = kVar4;
                r10 = 0;
                nVar = null;
            } else {
                sVar.b0(-499611205);
                int i114 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                objQ = sVar.Q();
                if (objQ == obj) {
                    objQ = new androidx.compose.runtime.snapshots.q();
                    sVar.l0(objQ);
                }
                qVar2 = (androidx.compose.runtime.snapshots.q) objQ;
                zF = sVar.f(kVar4);
                objQ2 = sVar.Q();
                if (zF) {
                    objQ2 = new z(kVar4, qVar2, null, 0);
                    sVar.l0(objQ2);
                } else {
                    objQ2 = new z(kVar4, qVar2, null, 0);
                    sVar.l0(objQ2);
                }
                androidx.compose.runtime.l0.c(sVar, kVar4, (kotlin.jvm.functions.p) objQ2);
                iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.p.K(qVar2);
                if (!z5) {
                    f = b0Var5.e;
                } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                    f = b0Var5.b;
                } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                    f = b0Var5.d;
                } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                    f = b0Var5.c;
                } else {
                    f = b0Var5.a;
                }
                objQ3 = sVar.Q();
                if (objQ3 == obj) {
                    objQ3 = new androidx.compose.animation.core.d(new androidx.compose.ui.unit.f(f), androidx.compose.animation.core.e.l, null, 12);
                    sVar.l0(objQ3);
                }
                dVar = (androidx.compose.animation.core.d) objQ3;
                androidx.compose.ui.unit.f fVar8 = new androidx.compose.ui.unit.f(f);
                zH = ((((i114 & 896) ^ 384) <= 256 && sVar.f(b0Var5)) || (i114 & 384) == 256) | sVar.h(dVar) | sVar.c(f) | ((((i114 & 14) ^ 6) <= 4 && sVar.g(z5)) || (i114 & 6) == 4) | sVar.h(iVar);
                objQ4 = sVar.Q();
                if (zH) {
                    z6 = z5;
                    objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                    sVar.l0(objQ4);
                } else {
                    z6 = z5;
                    objQ4 = new a0(dVar, f, z6, b0Var5, iVar, (kotlin.coroutines.d) null);
                    sVar.l0(objQ4);
                }
                androidx.compose.runtime.l0.c(sVar, fVar8, (kotlin.jvm.functions.p) objQ4);
                nVar = dVar.c;
                r10 = 0;
                sVar.p(false);
            }
            if (nVar != null) {
                f2 = ((androidx.compose.ui.unit.f) nVar.y.getValue()).e;
            } else {
                f2 = (float) r10;
            }
            float f10 = f2;
            objQ5 = sVar.Q();
            if (objQ5 == obj) {
                objQ5 = new androidx.compose.foundation.gestures.w1(24);
                sVar.l0(objQ5);
            }
            androidx.compose.ui.r rVarA8 = androidx.compose.ui.semantics.q.a(rVar2, r10, (kotlin.jvm.functions.l) objQ5);
            qVar3 = qVar;
            androidx.compose.ui.graphics.n0 n0Var10 = n0VarA;
            boolean z14 = z6;
            p5.b(aVar, rVarA8, z14, n0Var10, j, j2, f10, a0Var4, kVar4, androidx.compose.runtime.internal.k.c(-535639973, new f0(j2, z0Var11112, qVar3), sVar), sVar, (i3 & 8078) | (234881024 & (i3 << 6)), 64);
            kVar2 = kVar3;
            b0Var3 = b0Var5;
            z0Var2 = z0Var11112;
            rVar3 = rVar2;
            n0Var2 = n0Var10;
            a0Var3 = a0Var4;
            z4 = z14;
        } else {
            sVar.W();
            z0Var2 = z0Var;
            rVar3 = rVar2;
            a0Var3 = a0Var2;
            z4 = z2;
            n0Var2 = n0VarA;
            b0Var3 = b0Var2;
            kVar2 = kVar;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, z4, n0Var2, wVar, b0Var3, a0Var3, z0Var2, kVar2, qVar3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void c(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, g0 g0Var, h0 h0Var, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        g0 g0Var2;
        h0 h0Var2;
        int i4;
        int i5;
        boolean z;
        androidx.compose.runtime.internal.f fVar2;
        g0 g0Var3;
        h0 h0Var3;
        androidx.compose.ui.r rVar2;
        androidx.compose.runtime.s1 s1VarT;
        g0 g0VarN;
        h0 h0VarK;
        androidx.compose.ui.r rVar3;
        g0 g0Var4;
        h0 h0Var4;
        float f;
        Object objQ;
        sVar.c0(1359693790);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (sVar.f(rVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i3 | (sVar.f(n0Var) ? 32 : 16);
        if ((i2 & 4) == 0) {
            g0Var2 = g0Var;
            int i8 = sVar.f(g0Var2) ? LibretroCore.SCREEN_WIDTH : 128;
            int i9 = i7 | i8;
            if ((i2 & 8) == 0) {
                h0Var2 = h0Var;
                if (sVar.f(h0Var2)) {
                    i4 = 2048;
                }
                i5 = i9 | i4 | 24576;
                if ((74899 & i5) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (sVar.T(i5 & 1, z)) {
                    sVar.Y();
                    if ((i & 1) != 0 || sVar.C()) {
                        if (i6 != 0) {
                            rVar = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            g0VarN = n((t0) sVar.j(u0.a));
                            i5 &= -897;
                        } else {
                            g0VarN = g0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            h0VarK = k(63, 0.0f);
                            i5 &= -7169;
                        } else {
                            h0VarK = h0Var2;
                        }
                        g0 g0Var5 = g0VarN;
                        rVar3 = rVar;
                        g0Var4 = g0Var5;
                        h0Var4 = h0VarK;
                    } else {
                        sVar.W();
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i5 &= -7169;
                        }
                        rVar3 = rVar;
                        g0Var4 = g0Var2;
                        h0Var4 = h0Var2;
                    }
                    sVar.q();
                    long j = g0Var4.a;
                    long j2 = g0Var4.b;
                    f = h0Var4.a;
                    sVar.b0(-1763481333);
                    sVar.b0(167751211);
                    objQ = sVar.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = androidx.compose.runtime.t.r(new androidx.compose.ui.unit.f(f));
                        sVar.l0(objQ);
                    }
                    sVar.p(false);
                    sVar.p(false);
                    fVar2 = fVar;
                    p5.a(rVar3, n0Var, j, j2, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.a1) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new j0(fVar2, 0), sVar), sVar, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
                    g0Var3 = g0Var4;
                    rVar2 = rVar3;
                    h0Var3 = h0Var4;
                } else {
                    fVar2 = fVar;
                    sVar.W();
                    g0Var3 = g0Var2;
                    h0Var3 = h0Var2;
                    rVar2 = rVar;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new i0(rVar2, n0Var, g0Var3, h0Var3, fVar2, i, i2);
                }
            }
            h0Var2 = h0Var;
            i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i5 = i9 | i4 | 24576;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (sVar.T(i5 & 1, z)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        g0VarN = n((t0) sVar.j(u0.a));
                        i5 &= -897;
                    } else {
                        g0VarN = g0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        h0VarK = k(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        h0VarK = h0Var2;
                    }
                    g0 g0Var6 = g0VarN;
                    rVar3 = rVar;
                    g0Var4 = g0Var6;
                    h0Var4 = h0VarK;
                } else {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        g0VarN = n((t0) sVar.j(u0.a));
                        i5 &= -897;
                    } else {
                        g0VarN = g0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        h0VarK = k(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        h0VarK = h0Var2;
                    }
                    g0 g0Var7 = g0VarN;
                    rVar3 = rVar;
                    g0Var4 = g0Var7;
                    h0Var4 = h0VarK;
                }
                sVar.q();
                long j3 = g0Var4.a;
                long j4 = g0Var4.b;
                f = h0Var4.a;
                sVar.b0(-1763481333);
                sVar.b0(167751211);
                objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = androidx.compose.runtime.t.r(new androidx.compose.ui.unit.f(f));
                    sVar.l0(objQ);
                }
                sVar.p(false);
                sVar.p(false);
                fVar2 = fVar;
                p5.a(rVar3, n0Var, j3, j4, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.a1) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new j0(fVar2, 0), sVar), sVar, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
                g0Var3 = g0Var4;
                rVar2 = rVar3;
                h0Var3 = h0Var4;
            } else {
                fVar2 = fVar;
                sVar.W();
                g0Var3 = g0Var2;
                h0Var3 = h0Var2;
                rVar2 = rVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new i0(rVar2, n0Var, g0Var3, h0Var3, fVar2, i, i2);
            }
        }
        g0Var2 = g0Var;
        int i10 = i7 | i8;
        if ((i2 & 8) == 0) {
            h0Var2 = h0Var;
            if (sVar.f(h0Var2)) {
                i4 = 2048;
            }
            i5 = i10 | i4 | 24576;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (sVar.T(i5 & 1, z)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        g0VarN = n((t0) sVar.j(u0.a));
                        i5 &= -897;
                    } else {
                        g0VarN = g0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        h0VarK = k(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        h0VarK = h0Var2;
                    }
                    g0 g0Var8 = g0VarN;
                    rVar3 = rVar;
                    g0Var4 = g0Var8;
                    h0Var4 = h0VarK;
                } else {
                    if (i6 != 0) {
                        rVar = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        g0VarN = n((t0) sVar.j(u0.a));
                        i5 &= -897;
                    } else {
                        g0VarN = g0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        h0VarK = k(63, 0.0f);
                        i5 &= -7169;
                    } else {
                        h0VarK = h0Var2;
                    }
                    g0 g0Var9 = g0VarN;
                    rVar3 = rVar;
                    g0Var4 = g0Var9;
                    h0Var4 = h0VarK;
                }
                sVar.q();
                long j5 = g0Var4.a;
                long j6 = g0Var4.b;
                f = h0Var4.a;
                sVar.b0(-1763481333);
                sVar.b0(167751211);
                objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = androidx.compose.runtime.t.r(new androidx.compose.ui.unit.f(f));
                    sVar.l0(objQ);
                }
                sVar.p(false);
                sVar.p(false);
                fVar2 = fVar;
                p5.a(rVar3, n0Var, j5, j6, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.a1) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new j0(fVar2, 0), sVar), sVar, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
                g0Var3 = g0Var4;
                rVar2 = rVar3;
                h0Var3 = h0Var4;
            } else {
                fVar2 = fVar;
                sVar.W();
                g0Var3 = g0Var2;
                h0Var3 = h0Var2;
                rVar2 = rVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new i0(rVar2, n0Var, g0Var3, h0Var3, fVar2, i, i2);
            }
        }
        h0Var2 = h0Var;
        i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        i5 = i10 | i4 | 24576;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sVar.T(i5 & 1, z)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                if ((i2 & 4) != 0) {
                    g0VarN = n((t0) sVar.j(u0.a));
                    i5 &= -897;
                } else {
                    g0VarN = g0Var2;
                }
                if ((i2 & 8) != 0) {
                    h0VarK = k(63, 0.0f);
                    i5 &= -7169;
                } else {
                    h0VarK = h0Var2;
                }
                g0 g0Var10 = g0VarN;
                rVar3 = rVar;
                g0Var4 = g0Var10;
                h0Var4 = h0VarK;
            } else {
                if (i6 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                if ((i2 & 4) != 0) {
                    g0VarN = n((t0) sVar.j(u0.a));
                    i5 &= -897;
                } else {
                    g0VarN = g0Var2;
                }
                if ((i2 & 8) != 0) {
                    h0VarK = k(63, 0.0f);
                    i5 &= -7169;
                } else {
                    h0VarK = h0Var2;
                }
                g0 g0Var11 = g0VarN;
                rVar3 = rVar;
                g0Var4 = g0Var11;
                h0Var4 = h0VarK;
            }
            sVar.q();
            long j7 = g0Var4.a;
            long j8 = g0Var4.b;
            f = h0Var4.a;
            sVar.b0(-1763481333);
            sVar.b0(167751211);
            objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.compose.runtime.t.r(new androidx.compose.ui.unit.f(f));
                sVar.l0(objQ);
            }
            sVar.p(false);
            sVar.p(false);
            fVar2 = fVar;
            p5.a(rVar3, n0Var, j7, j8, 0.0f, ((androidx.compose.ui.unit.f) ((androidx.compose.runtime.a1) objQ).getValue()).e, androidx.compose.runtime.internal.k.c(-97109725, new j0(fVar2, 0), sVar), sVar, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
            g0Var3 = g0Var4;
            rVar2 = rVar3;
            h0Var3 = h0Var4;
        } else {
            fVar2 = fVar;
            sVar.W();
            g0Var3 = g0Var2;
            h0Var3 = h0Var2;
            rVar2 = rVar;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new i0(rVar2, n0Var, g0Var3, h0Var3, fVar2, i, i2);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, final float f, final long j, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        sVar.c0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            i5 |= sVar.e(j) ? 256 : 128;
        }
        boolean z = true;
        if (sVar.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                if (i4 != 0) {
                    rVar = androidx.compose.ui.o.b;
                }
                f = h1.a;
            } else {
                sVar.W();
            }
            sVar.q();
            androidx.compose.ui.r rVarG = androidx.compose.foundation.layout.i1.g(androidx.compose.foundation.layout.i1.e(rVar, 1.0f), f);
            if ((((i5 & 896) ^ 384) <= 256 || !sVar.e(j)) && (i5 & 384) != 256) {
                z = false;
            }
            Object objQ = sVar.Q();
            if (z || objQ == androidx.compose.runtime.n.a) {
                objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.i1
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                        float f2 = f;
                        float fW = dVar.W(f2);
                        float f3 = 2;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(dVar.W(f2) / f3)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
                        dVar.y(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(dVar.W(f2) / f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fW, (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : 0);
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ);
            }
            androidx.compose.foundation.s.b(rVarG, (kotlin.jvm.functions.l) objQ, sVar, 0);
        } else {
            sVar.W();
        }
        final androidx.compose.ui.r rVar2 = rVar;
        final float f2 = f;
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.j1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.d(rVar2, f2, j, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0133  */
    /* JADX WARN: Code duplicated, block: B:94:0x0164  */
    /* JADX WARN: Code duplicated, block: B:97:0x0174  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void e(final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, l1 l1Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.graphics.n0 n0Var, final kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.r rVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        androidx.compose.foundation.interaction.k kVar2;
        int i7;
        kotlin.jvm.functions.p pVar2;
        boolean z3;
        final androidx.compose.ui.r rVar3;
        final boolean z4;
        final androidx.compose.foundation.interaction.k kVar3;
        final l1 l1Var2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        androidx.compose.runtime.s1 s1VarT;
        androidx.compose.ui.r rVar4;
        long j;
        t0 t0Var;
        l1 l1Var3;
        long j2;
        int i8;
        androidx.compose.ui.graphics.n0 n0VarA;
        androidx.compose.ui.r rVar5;
        long jB;
        long j3;
        int i9;
        float f = androidx.compose.material3.tokens.t.Q;
        sVar.c0(1413012038);
        if ((i & 6) == 0) {
            i3 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= sVar.f(rVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (sVar.g(z2)) {
                        i5 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        kVar2 = kVar;
                        if (sVar.f(kVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= Parser.ARGC_LIMIT;
                    }
                    if ((1572864 & i) == 0) {
                        pVar2 = pVar;
                        if (sVar.h(pVar2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    } else {
                        pVar2 = pVar;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (sVar.T(i3 & 1, z3)) {
                        sVar.Y();
                        if ((i & 1) != 0 || sVar.C()) {
                            if (i10 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                            t0Var = (t0) sVar.j(u0.a);
                            l1Var3 = t0Var.b0;
                            if (l1Var3 == null) {
                                long j4 = androidx.compose.ui.graphics.t.h;
                                l1Var3 = new l1(j4, j, j4, androidx.compose.ui.graphics.t.b(f, j));
                                t0Var.b0 = l1Var3;
                            }
                            int i11 = i3;
                            j2 = l1Var3.b;
                            if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                                jB = androidx.compose.ui.graphics.t.b(f, j);
                                long j5 = l1Var3.a;
                                long j6 = l1Var3.c;
                                if (j == 16) {
                                    j = j2;
                                }
                                if (jB != 16) {
                                    j3 = jB;
                                } else {
                                    j3 = l1Var3.d;
                                }
                                l1Var3 = new l1(j5, j, j6, j3);
                            }
                            if (i6 != 0) {
                                kVar2 = null;
                            }
                            i8 = i11 & (-465921);
                            androidx.compose.ui.r rVar6 = rVar4;
                            n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                            rVar5 = rVar6;
                            l1Var2 = l1Var3;
                        } else {
                            sVar.W();
                            n0VarA = n0Var;
                            i8 = i3 & (-465921);
                            rVar5 = rVar2;
                            l1Var2 = l1Var;
                        }
                        boolean z5 = z2;
                        kVar3 = kVar2;
                        sVar.q();
                        int i12 = i8 << 3;
                        f(rVar5, aVar, z5, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i12 & Token.ASSIGN_MOD) | (i8 & 896) | (i12 & 458752) | (i8 & 3670016));
                        n0Var2 = n0VarA;
                        z4 = z5;
                        rVar3 = rVar5;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        z4 = z2;
                        kVar3 = kVar2;
                        l1Var2 = l1Var;
                        n0Var2 = n0Var;
                    }
                    s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                kVar2 = kVar;
                if ((196608 & i) == 0) {
                    i3 |= Parser.ARGC_LIMIT;
                }
                if ((1572864 & i) == 0) {
                    pVar2 = pVar;
                    if (sVar.h(pVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    pVar2 = pVar;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (sVar.T(i3 & 1, z3)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                        t0Var = (t0) sVar.j(u0.a);
                        l1Var3 = t0Var.b0;
                        if (l1Var3 == null) {
                            long j7 = androidx.compose.ui.graphics.t.h;
                            l1Var3 = new l1(j7, j, j7, androidx.compose.ui.graphics.t.b(f, j));
                            t0Var.b0 = l1Var3;
                        }
                        int i13 = i3;
                        j2 = l1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j8 = l1Var3.a;
                            long j9 = l1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = l1Var3.d;
                            }
                            l1Var3 = new l1(j8, j, j9, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i13 & (-465921);
                        androidx.compose.ui.r rVar7 = rVar4;
                        n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                        rVar5 = rVar7;
                        l1Var2 = l1Var3;
                    } else {
                        if (i10 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                        t0Var = (t0) sVar.j(u0.a);
                        l1Var3 = t0Var.b0;
                        if (l1Var3 == null) {
                            long j10 = androidx.compose.ui.graphics.t.h;
                            l1Var3 = new l1(j10, j, j10, androidx.compose.ui.graphics.t.b(f, j));
                            t0Var.b0 = l1Var3;
                        }
                        int i14 = i3;
                        j2 = l1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j11 = l1Var3.a;
                            long j12 = l1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = l1Var3.d;
                            }
                            l1Var3 = new l1(j11, j, j12, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i14 & (-465921);
                        androidx.compose.ui.r rVar8 = rVar4;
                        n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                        rVar5 = rVar8;
                        l1Var2 = l1Var3;
                    }
                    boolean z6 = z2;
                    kVar3 = kVar2;
                    sVar.q();
                    int i15 = i8 << 3;
                    f(rVar5, aVar, z6, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i15 & Token.ASSIGN_MOD) | (i8 & 896) | (i15 & 458752) | (i8 & 3670016));
                    n0Var2 = n0VarA;
                    z4 = z6;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z4 = z2;
                    kVar3 = kVar2;
                    l1Var2 = l1Var;
                    n0Var2 = n0Var;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    kVar2 = kVar;
                    if (sVar.f(kVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    i3 |= Parser.ARGC_LIMIT;
                }
                if ((1572864 & i) == 0) {
                    pVar2 = pVar;
                    if (sVar.h(pVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    pVar2 = pVar;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (sVar.T(i3 & 1, z3)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                        t0Var = (t0) sVar.j(u0.a);
                        l1Var3 = t0Var.b0;
                        if (l1Var3 == null) {
                            long j13 = androidx.compose.ui.graphics.t.h;
                            l1Var3 = new l1(j13, j, j13, androidx.compose.ui.graphics.t.b(f, j));
                            t0Var.b0 = l1Var3;
                        }
                        int i16 = i3;
                        j2 = l1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j14 = l1Var3.a;
                            long j15 = l1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = l1Var3.d;
                            }
                            l1Var3 = new l1(j14, j, j15, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i16 & (-465921);
                        androidx.compose.ui.r rVar9 = rVar4;
                        n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                        rVar5 = rVar9;
                        l1Var2 = l1Var3;
                    } else {
                        if (i10 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                        t0Var = (t0) sVar.j(u0.a);
                        l1Var3 = t0Var.b0;
                        if (l1Var3 == null) {
                            long j16 = androidx.compose.ui.graphics.t.h;
                            l1Var3 = new l1(j16, j, j16, androidx.compose.ui.graphics.t.b(f, j));
                            t0Var.b0 = l1Var3;
                        }
                        int i17 = i3;
                        j2 = l1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j17 = l1Var3.a;
                            long j18 = l1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = l1Var3.d;
                            }
                            l1Var3 = new l1(j17, j, j18, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i17 & (-465921);
                        androidx.compose.ui.r rVar10 = rVar4;
                        n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                        rVar5 = rVar10;
                        l1Var2 = l1Var3;
                    }
                    boolean z7 = z2;
                    kVar3 = kVar2;
                    sVar.q();
                    int i18 = i8 << 3;
                    f(rVar5, aVar, z7, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i18 & Token.ASSIGN_MOD) | (i8 & 896) | (i18 & 458752) | (i8 & 3670016));
                    n0Var2 = n0VarA;
                    z4 = z7;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z4 = z2;
                    kVar3 = kVar2;
                    l1Var2 = l1Var;
                    n0Var2 = n0Var;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            kVar2 = kVar;
            if ((196608 & i) == 0) {
                i3 |= Parser.ARGC_LIMIT;
            }
            if ((1572864 & i) == 0) {
                pVar2 = pVar;
                if (sVar.h(pVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                pVar2 = pVar;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i3 & 1, z3)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                    t0Var = (t0) sVar.j(u0.a);
                    l1Var3 = t0Var.b0;
                    if (l1Var3 == null) {
                        long j19 = androidx.compose.ui.graphics.t.h;
                        l1Var3 = new l1(j19, j, j19, androidx.compose.ui.graphics.t.b(f, j));
                        t0Var.b0 = l1Var3;
                    }
                    int i19 = i3;
                    j2 = l1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j110 = l1Var3.a;
                        long j111 = l1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = l1Var3.d;
                        }
                        l1Var3 = new l1(j110, j, j111, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i19 & (-465921);
                    androidx.compose.ui.r rVar11 = rVar4;
                    n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                    rVar5 = rVar11;
                    l1Var2 = l1Var3;
                } else {
                    if (i10 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                    t0Var = (t0) sVar.j(u0.a);
                    l1Var3 = t0Var.b0;
                    if (l1Var3 == null) {
                        long j112 = androidx.compose.ui.graphics.t.h;
                        l1Var3 = new l1(j112, j, j112, androidx.compose.ui.graphics.t.b(f, j));
                        t0Var.b0 = l1Var3;
                    }
                    int i110 = i3;
                    j2 = l1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j113 = l1Var3.a;
                        long j114 = l1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = l1Var3.d;
                        }
                        l1Var3 = new l1(j113, j, j114, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i110 & (-465921);
                    androidx.compose.ui.r rVar12 = rVar4;
                    n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                    rVar5 = rVar12;
                    l1Var2 = l1Var3;
                }
                boolean z8 = z2;
                kVar3 = kVar2;
                sVar.q();
                int i111 = i8 << 3;
                f(rVar5, aVar, z8, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i111 & Token.ASSIGN_MOD) | (i8 & 896) | (i111 & 458752) | (i8 & 3670016));
                n0Var2 = n0VarA;
                z4 = z8;
                rVar3 = rVar5;
            } else {
                sVar.W();
                rVar3 = rVar2;
                z4 = z2;
                kVar3 = kVar2;
                l1Var2 = l1Var;
                n0Var2 = n0Var;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (sVar.g(z2)) {
                    i5 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    kVar2 = kVar;
                    if (sVar.f(kVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    i3 |= Parser.ARGC_LIMIT;
                }
                if ((1572864 & i) == 0) {
                    pVar2 = pVar;
                    if (sVar.h(pVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    pVar2 = pVar;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (sVar.T(i3 & 1, z3)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                        t0Var = (t0) sVar.j(u0.a);
                        l1Var3 = t0Var.b0;
                        if (l1Var3 == null) {
                            long j115 = androidx.compose.ui.graphics.t.h;
                            l1Var3 = new l1(j115, j, j115, androidx.compose.ui.graphics.t.b(f, j));
                            t0Var.b0 = l1Var3;
                        }
                        int i112 = i3;
                        j2 = l1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j116 = l1Var3.a;
                            long j117 = l1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = l1Var3.d;
                            }
                            l1Var3 = new l1(j116, j, j117, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i112 & (-465921);
                        androidx.compose.ui.r rVar13 = rVar4;
                        n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                        rVar5 = rVar13;
                        l1Var2 = l1Var3;
                    } else {
                        if (i10 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                        t0Var = (t0) sVar.j(u0.a);
                        l1Var3 = t0Var.b0;
                        if (l1Var3 == null) {
                            long j118 = androidx.compose.ui.graphics.t.h;
                            l1Var3 = new l1(j118, j, j118, androidx.compose.ui.graphics.t.b(f, j));
                            t0Var.b0 = l1Var3;
                        }
                        int i113 = i3;
                        j2 = l1Var3.b;
                        if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                            jB = androidx.compose.ui.graphics.t.b(f, j);
                            long j119 = l1Var3.a;
                            long j1110 = l1Var3.c;
                            if (j == 16) {
                                j = j2;
                            }
                            if (jB != 16) {
                                j3 = jB;
                            } else {
                                j3 = l1Var3.d;
                            }
                            l1Var3 = new l1(j119, j, j1110, j3);
                        }
                        if (i6 != 0) {
                            kVar2 = null;
                        }
                        i8 = i113 & (-465921);
                        androidx.compose.ui.r rVar14 = rVar4;
                        n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                        rVar5 = rVar14;
                        l1Var2 = l1Var3;
                    }
                    boolean z9 = z2;
                    kVar3 = kVar2;
                    sVar.q();
                    int i114 = i8 << 3;
                    f(rVar5, aVar, z9, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i114 & Token.ASSIGN_MOD) | (i8 & 896) | (i114 & 458752) | (i8 & 3670016));
                    n0Var2 = n0VarA;
                    z4 = z9;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z4 = z2;
                    kVar3 = kVar2;
                    l1Var2 = l1Var;
                    n0Var2 = n0Var;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            kVar2 = kVar;
            if ((196608 & i) == 0) {
                i3 |= Parser.ARGC_LIMIT;
            }
            if ((1572864 & i) == 0) {
                pVar2 = pVar;
                if (sVar.h(pVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                pVar2 = pVar;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i3 & 1, z3)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                    t0Var = (t0) sVar.j(u0.a);
                    l1Var3 = t0Var.b0;
                    if (l1Var3 == null) {
                        long j1111 = androidx.compose.ui.graphics.t.h;
                        l1Var3 = new l1(j1111, j, j1111, androidx.compose.ui.graphics.t.b(f, j));
                        t0Var.b0 = l1Var3;
                    }
                    int i115 = i3;
                    j2 = l1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j1112 = l1Var3.a;
                        long j1113 = l1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = l1Var3.d;
                        }
                        l1Var3 = new l1(j1112, j, j1113, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i115 & (-465921);
                    androidx.compose.ui.r rVar15 = rVar4;
                    n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                    rVar5 = rVar15;
                    l1Var2 = l1Var3;
                } else {
                    if (i10 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                    t0Var = (t0) sVar.j(u0.a);
                    l1Var3 = t0Var.b0;
                    if (l1Var3 == null) {
                        long j1114 = androidx.compose.ui.graphics.t.h;
                        l1Var3 = new l1(j1114, j, j1114, androidx.compose.ui.graphics.t.b(f, j));
                        t0Var.b0 = l1Var3;
                    }
                    int i116 = i3;
                    j2 = l1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j1115 = l1Var3.a;
                        long j1116 = l1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = l1Var3.d;
                        }
                        l1Var3 = new l1(j1115, j, j1116, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i116 & (-465921);
                    androidx.compose.ui.r rVar16 = rVar4;
                    n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                    rVar5 = rVar16;
                    l1Var2 = l1Var3;
                }
                boolean z10 = z2;
                kVar3 = kVar2;
                sVar.q();
                int i117 = i8 << 3;
                f(rVar5, aVar, z10, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i117 & Token.ASSIGN_MOD) | (i8 & 896) | (i117 & 458752) | (i8 & 3670016));
                n0Var2 = n0VarA;
                z4 = z10;
                rVar3 = rVar5;
            } else {
                sVar.W();
                rVar3 = rVar2;
                z4 = z2;
                kVar3 = kVar2;
                l1Var2 = l1Var;
                n0Var2 = n0Var;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                kVar2 = kVar;
                if (sVar.f(kVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                i3 |= Parser.ARGC_LIMIT;
            }
            if ((1572864 & i) == 0) {
                pVar2 = pVar;
                if (sVar.h(pVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                pVar2 = pVar;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (sVar.T(i3 & 1, z3)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                    t0Var = (t0) sVar.j(u0.a);
                    l1Var3 = t0Var.b0;
                    if (l1Var3 == null) {
                        long j1117 = androidx.compose.ui.graphics.t.h;
                        l1Var3 = new l1(j1117, j, j1117, androidx.compose.ui.graphics.t.b(f, j));
                        t0Var.b0 = l1Var3;
                    }
                    int i118 = i3;
                    j2 = l1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j1118 = l1Var3.a;
                        long j1119 = l1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = l1Var3.d;
                        }
                        l1Var3 = new l1(j1118, j, j1119, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i118 & (-465921);
                    androidx.compose.ui.r rVar17 = rVar4;
                    n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                    rVar5 = rVar17;
                    l1Var2 = l1Var3;
                } else {
                    if (i10 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                    t0Var = (t0) sVar.j(u0.a);
                    l1Var3 = t0Var.b0;
                    if (l1Var3 == null) {
                        long j11110 = androidx.compose.ui.graphics.t.h;
                        l1Var3 = new l1(j11110, j, j11110, androidx.compose.ui.graphics.t.b(f, j));
                        t0Var.b0 = l1Var3;
                    }
                    int i119 = i3;
                    j2 = l1Var3.b;
                    if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                        jB = androidx.compose.ui.graphics.t.b(f, j);
                        long j11111 = l1Var3.a;
                        long j11112 = l1Var3.c;
                        if (j == 16) {
                            j = j2;
                        }
                        if (jB != 16) {
                            j3 = jB;
                        } else {
                            j3 = l1Var3.d;
                        }
                        l1Var3 = new l1(j11111, j, j11112, j3);
                    }
                    if (i6 != 0) {
                        kVar2 = null;
                    }
                    i8 = i119 & (-465921);
                    androidx.compose.ui.r rVar18 = rVar4;
                    n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                    rVar5 = rVar18;
                    l1Var2 = l1Var3;
                }
                boolean z11 = z2;
                kVar3 = kVar2;
                sVar.q();
                int i1110 = i8 << 3;
                f(rVar5, aVar, z11, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i1110 & Token.ASSIGN_MOD) | (i8 & 896) | (i1110 & 458752) | (i8 & 3670016));
                n0Var2 = n0VarA;
                z4 = z11;
                rVar3 = rVar5;
            } else {
                sVar.W();
                rVar3 = rVar2;
                z4 = z2;
                kVar3 = kVar2;
                l1Var2 = l1Var;
                n0Var2 = n0Var;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 24576;
        kVar2 = kVar;
        if ((196608 & i) == 0) {
            i3 |= Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            pVar2 = pVar;
            if (sVar.h(pVar2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            pVar2 = pVar;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sVar.T(i3 & 1, z3)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                t0Var = (t0) sVar.j(u0.a);
                l1Var3 = t0Var.b0;
                if (l1Var3 == null) {
                    long j11113 = androidx.compose.ui.graphics.t.h;
                    l1Var3 = new l1(j11113, j, j11113, androidx.compose.ui.graphics.t.b(f, j));
                    t0Var.b0 = l1Var3;
                }
                int i1111 = i3;
                j2 = l1Var3.b;
                if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                    jB = androidx.compose.ui.graphics.t.b(f, j);
                    long j11114 = l1Var3.a;
                    long j11115 = l1Var3.c;
                    if (j == 16) {
                        j = j2;
                    }
                    if (jB != 16) {
                        j3 = jB;
                    } else {
                        j3 = l1Var3.d;
                    }
                    l1Var3 = new l1(j11114, j, j11115, j3);
                }
                if (i6 != 0) {
                    kVar2 = null;
                }
                i8 = i1111 & (-465921);
                androidx.compose.ui.r rVar19 = rVar4;
                n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                rVar5 = rVar19;
                l1Var2 = l1Var3;
            } else {
                if (i10 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                j = ((androidx.compose.ui.graphics.t) sVar.j(a1.a)).a;
                t0Var = (t0) sVar.j(u0.a);
                l1Var3 = t0Var.b0;
                if (l1Var3 == null) {
                    long j11116 = androidx.compose.ui.graphics.t.h;
                    l1Var3 = new l1(j11116, j, j11116, androidx.compose.ui.graphics.t.b(f, j));
                    t0Var.b0 = l1Var3;
                }
                int i1112 = i3;
                j2 = l1Var3.b;
                if (!androidx.compose.ui.graphics.t.c(j2, j)) {
                    jB = androidx.compose.ui.graphics.t.b(f, j);
                    long j11117 = l1Var3.a;
                    long j11118 = l1Var3.c;
                    if (j == 16) {
                        j = j2;
                    }
                    if (jB != 16) {
                        j3 = jB;
                    } else {
                        j3 = l1Var3.d;
                    }
                    l1Var3 = new l1(j11117, j, j11118, j3);
                }
                if (i6 != 0) {
                    kVar2 = null;
                }
                i8 = i1112 & (-465921);
                androidx.compose.ui.r rVar110 = rVar4;
                n0VarA = d5.a(androidx.compose.material3.tokens.z.b, sVar);
                rVar5 = rVar110;
                l1Var2 = l1Var3;
            }
            boolean z12 = z2;
            kVar3 = kVar2;
            sVar.q();
            int i1113 = i8 << 3;
            f(rVar5, aVar, z12, n0VarA, l1Var2, kVar3, pVar2, sVar, ((i8 >> 3) & 14) | (i1113 & Token.ASSIGN_MOD) | (i8 & 896) | (i1113 & 458752) | (i8 & 3670016));
            n0Var2 = n0VarA;
            z4 = z12;
            rVar3 = rVar5;
        } else {
            sVar.W();
            rVar3 = rVar2;
            z4 = z2;
            kVar3 = kVar2;
            l1Var2 = l1Var;
            n0Var2 = n0Var;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.m1
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.e(aVar, rVar3, z4, l1Var2, kVar3, n0Var2, pVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void f(androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, l1 l1Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        androidx.compose.foundation.interaction.k kVar2;
        sVar.c0(-1134296466);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(n0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.f(l1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.f(kVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.h(pVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (sVar.T(i3 & 1, (599187 & i3) != 599186)) {
            if (kVar == null) {
                sVar.b0(977045485);
                Object objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                kVar2 = (androidx.compose.foundation.interaction.k) objQ;
                sVar.p(false);
            } else {
                sVar.b0(862800938);
                sVar.p(false);
                kVar2 = kVar;
            }
            androidx.compose.ui.layout.n nVar = t1.a;
            androidx.compose.ui.r rVarD = rVar.d(o2.b);
            float f = androidx.compose.material3.tokens.z.c;
            long jB = android.support.v4.media.session.b.b(androidx.compose.material3.tokens.z.d + f + f, androidx.compose.material3.tokens.z.a);
            androidx.compose.foundation.layout.e0 e0Var = androidx.compose.foundation.layout.i1.a;
            androidx.compose.ui.r rVarF = androidx.compose.material3.internal.i.f(androidx.compose.foundation.s.j(androidx.compose.foundation.s.f(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.i1.n(rVarD, androidx.compose.ui.unit.h.b(jB), androidx.compose.ui.unit.h.a(jB)), n0Var), z ? l1Var.a : l1Var.c, n0Var), kVar2, x4.a(false, 0.0f, 7), z, new androidx.compose.ui.semantics.j(0), aVar, 8));
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarF);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.g;
            if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, sVar, iHashCode, eVar);
            }
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            androidx.compose.runtime.t.a(a1.a.a(new androidx.compose.ui.graphics.t(z ? l1Var.b : l1Var.d)), pVar, sVar, ((i3 >> 15) & Token.ASSIGN_MOD) | 8);
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new n1(rVar, aVar, z, n0Var, l1Var, kVar, pVar, i);
        }
    }

    public static final void g(final kotlin.jvm.functions.a aVar, final long j, final i3 i3Var, final androidx.compose.animation.core.d dVar, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        long j2;
        i3 i3Var2;
        androidx.compose.ui.unit.m mVar;
        boolean z;
        boolean z2;
        Object obj;
        sVar.c0(766784632);
        if ((i & 6) == 0) {
            i2 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= sVar.e(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i3Var2 = i3Var;
            i2 |= sVar.f(i3Var2) ? LibretroCore.SCREEN_WIDTH : 128;
        } else {
            i3Var2 = i3Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? sVar.f(dVar) : sVar.h(dVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(fVar) ? 16384 : 8192;
        }
        if (sVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) sVar.j(androidx.compose.ui.platform.m0.f);
            androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
            androidx.compose.ui.unit.m mVar2 = (androidx.compose.ui.unit.m) sVar.j(androidx.compose.ui.platform.l1.n);
            androidx.compose.runtime.q qVarU = androidx.compose.runtime.t.u(sVar);
            androidx.compose.runtime.a1 a1VarV = androidx.compose.runtime.t.v(fVar, sVar);
            Object[] objArr = new Object[0];
            Object objQ = sVar.Q();
            Object obj2 = androidx.compose.runtime.n.a;
            if (objQ == obj2) {
                objQ = new androidx.activity.compose.b(23);
                sVar.l0(objQ);
            }
            UUID uuid = (UUID) androidx.compose.runtime.saveable.l.e(objArr, (kotlin.jvm.functions.a) objQ, sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == obj2) {
                objQ2 = androidx.compose.runtime.l0.f(sVar);
                sVar.l0(objQ2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ2;
            boolean zF = sVar.f(view) | sVar.f(cVar);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == obj2) {
                mVar = mVar2;
                z = true;
                z2 = false;
                u2 u2Var = new u2(aVar, i3Var2, j2, view, mVar, cVar, uuid, dVar, coroutineScope);
                androidx.compose.runtime.internal.f fVar2 = new androidx.compose.runtime.internal.f(true, -1051373467, new b1(a1VarV, 2));
                q2 q2Var = u2Var.F;
                q2Var.setParentCompositionContext(qVarU);
                q2Var.F.setValue(fVar2);
                q2Var.G = true;
                q2Var.c();
                sVar.l0(u2Var);
                obj = u2Var;
            } else {
                mVar = mVar2;
                z = true;
                z2 = false;
                obj = objQ3;
            }
            final u2 u2Var2 = (u2) obj;
            boolean zH = sVar.h(u2Var2);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == obj2) {
                objQ4 = new androidx.activity.compose.g(u2Var2, 25);
                sVar.l0(objQ4);
            }
            androidx.compose.runtime.l0.b(u2Var2, (kotlin.jvm.functions.l) objQ4, sVar);
            int i3 = i2;
            boolean zH2 = sVar.h(u2Var2) | ((i3 & 14) == 4 ? z : z2) | ((i3 & 896) == 256 ? z : z2) | ((i3 & Token.ASSIGN_MOD) == 32 ? z : z2) | sVar.d(mVar.ordinal());
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == obj2) {
                final androidx.compose.ui.unit.m mVar3 = mVar;
                objQ5 = new kotlin.jvm.functions.a() { // from class: androidx.compose.material3.j3
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        u2Var2.d(aVar, i3Var, j, mVar3);
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ5);
            }
            androidx.compose.runtime.l0.e((kotlin.jvm.functions.a) objQ5, sVar);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.k3
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    q.g(aVar, j, i3Var, dVar, fVar, (androidx.compose.runtime.s) obj3, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void h(final kotlin.jvm.functions.a aVar, final androidx.compose.ui.r rVar, final boolean z, androidx.compose.ui.graphics.n0 n0Var, final w wVar, final androidx.compose.foundation.a0 a0Var, androidx.compose.foundation.layout.z0 z0Var, final androidx.compose.foundation.interaction.k kVar, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final androidx.compose.foundation.layout.z0 z0Var2;
        int i3;
        androidx.compose.ui.graphics.n0 n0Var3;
        sVar.c0(399974542);
        if ((i & 6) == 0) {
            i2 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.f(wVar) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= sVar.f(a0Var) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            i5 |= sVar.f(kVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= sVar.h(fVar) ? 536870912 : 268435456;
        }
        if (sVar.T(i5 & 1, (306783379 & i5) != 306783378)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                androidx.compose.foundation.layout.z0 z0Var3 = x.a;
                androidx.compose.ui.graphics.n0 n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                i3 = i5 & (-7169);
                z0Var2 = x.a;
                n0Var3 = n0VarA;
            } else {
                sVar.W();
                i3 = i5 & (-7169);
                n0Var3 = n0Var;
                z0Var2 = z0Var;
            }
            sVar.q();
            b(aVar, rVar, z, n0Var3, wVar, null, a0Var, z0Var2, kVar, fVar, sVar, i3 & 2147483646, 0);
            n0Var2 = n0Var3;
        } else {
            sVar.W();
            n0Var2 = n0Var;
            z0Var2 = z0Var;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.d0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.h(aVar, rVar, z, n0Var2, wVar, a0Var, z0Var2, kVar, fVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void i(final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, w wVar, androidx.compose.foundation.layout.z0 z0Var, androidx.compose.foundation.interaction.k kVar, final kotlin.jvm.functions.q qVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        kotlin.jvm.functions.a aVar2;
        int i3;
        androidx.compose.ui.r rVar2;
        int i4;
        int i5;
        androidx.compose.foundation.layout.z0 z0Var2;
        int i6;
        int i7;
        final androidx.compose.foundation.interaction.k kVar2;
        int i8;
        boolean z2;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final w wVar2;
        final androidx.compose.foundation.layout.z0 z0Var3;
        final androidx.compose.ui.r rVar3;
        final boolean z3;
        androidx.compose.runtime.s1 s1VarT;
        androidx.compose.ui.r rVar4;
        androidx.compose.ui.graphics.n0 n0VarA;
        t0 t0Var;
        w wVar3;
        int i9;
        int i10;
        androidx.compose.foundation.interaction.k kVar3;
        w wVar4;
        androidx.compose.foundation.layout.z0 z0Var4;
        androidx.compose.ui.r rVar5;
        boolean z4;
        sVar.c0(-1061374109);
        if ((i & 6) == 0) {
            aVar2 = aVar;
            i3 = i | (sVar.h(aVar2) ? 4 : 2);
        } else {
            aVar2 = aVar;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= sVar.f(rVar2) ? 32 : 16;
            }
            i4 = 1779072 | i3;
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((i & 12582912) == 0) {
                    z0Var2 = z0Var;
                    if (sVar.f(z0Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                i7 = i2 & LibretroCore.SCREEN_WIDTH;
                if (i7 != 0) {
                    if ((i & 100663296) == 0) {
                        kVar2 = kVar;
                        if (sVar.f(kVar2)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i4 |= i8;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (sVar.T(i4 & 1, z2)) {
                        sVar.Y();
                        if ((i & 1) != 0 || sVar.C()) {
                            if (i11 != 0) {
                                rVar4 = androidx.compose.ui.o.b;
                            } else {
                                rVar4 = rVar2;
                            }
                            androidx.compose.foundation.layout.z0 z0Var5 = x.a;
                            n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                            t0Var = (t0) sVar.j(u0.a);
                            wVar3 = t0Var.Y;
                            if (wVar3 == null) {
                                long j = androidx.compose.ui.graphics.t.h;
                                w wVar5 = new w(j, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                                t0Var.Y = wVar5;
                                wVar3 = wVar5;
                            }
                            i9 = i4 & (-64513);
                            if (i5 != 0) {
                                z0Var2 = x.b;
                            }
                            if (i7 != 0) {
                                z0Var4 = z0Var2;
                                rVar5 = rVar4;
                                kVar3 = null;
                                z4 = true;
                                i10 = i9;
                                wVar4 = wVar3;
                            } else {
                                i10 = i9;
                                kVar3 = kVar2;
                                wVar4 = wVar3;
                                z0Var4 = z0Var2;
                                rVar5 = rVar4;
                                z4 = true;
                            }
                        } else {
                            sVar.W();
                            int i12 = i4 & (-64513);
                            wVar4 = wVar;
                            i10 = i12;
                            kVar3 = kVar2;
                            z4 = z;
                            z0Var4 = z0Var2;
                            rVar5 = rVar2;
                            n0VarA = n0Var;
                        }
                        sVar.q();
                        b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
                        wVar2 = wVar4;
                        z0Var3 = z0Var4;
                        kVar2 = kVar3;
                        n0Var2 = n0VarA;
                        z3 = z4;
                        rVar3 = rVar5;
                    } else {
                        sVar.W();
                        n0Var2 = n0Var;
                        wVar2 = wVar;
                        z0Var3 = z0Var2;
                        rVar3 = rVar2;
                        z3 = z;
                    }
                    s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                kVar2 = kVar;
                if ((306783379 & i4) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (sVar.T(i4 & 1, z2)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        androidx.compose.foundation.layout.z0 z0Var6 = x.a;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        t0Var = (t0) sVar.j(u0.a);
                        wVar3 = t0Var.Y;
                        if (wVar3 == null) {
                            long j2 = androidx.compose.ui.graphics.t.h;
                            w wVar6 = new w(j2, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j2, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                            t0Var.Y = wVar6;
                            wVar3 = wVar6;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            z0Var2 = x.b;
                        }
                        if (i7 != 0) {
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            wVar4 = wVar3;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            wVar4 = wVar3;
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            z4 = true;
                        }
                    } else {
                        if (i11 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        androidx.compose.foundation.layout.z0 z0Var7 = x.a;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        t0Var = (t0) sVar.j(u0.a);
                        wVar3 = t0Var.Y;
                        if (wVar3 == null) {
                            long j3 = androidx.compose.ui.graphics.t.h;
                            w wVar7 = new w(j3, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j3, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                            t0Var.Y = wVar7;
                            wVar3 = wVar7;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            z0Var2 = x.b;
                        }
                        if (i7 != 0) {
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            wVar4 = wVar3;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            wVar4 = wVar3;
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            z4 = true;
                        }
                    }
                    sVar.q();
                    b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
                    wVar2 = wVar4;
                    z0Var3 = z0Var4;
                    kVar2 = kVar3;
                    n0Var2 = n0VarA;
                    z3 = z4;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    n0Var2 = n0Var;
                    wVar2 = wVar;
                    z0Var3 = z0Var2;
                    rVar3 = rVar2;
                    z3 = z;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i4 = 14361984 | i3;
            z0Var2 = z0Var;
            i7 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i7 != 0) {
                if ((i & 100663296) == 0) {
                    kVar2 = kVar;
                    if (sVar.f(kVar2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                if ((306783379 & i4) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (sVar.T(i4 & 1, z2)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        androidx.compose.foundation.layout.z0 z0Var8 = x.a;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        t0Var = (t0) sVar.j(u0.a);
                        wVar3 = t0Var.Y;
                        if (wVar3 == null) {
                            long j4 = androidx.compose.ui.graphics.t.h;
                            w wVar8 = new w(j4, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j4, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                            t0Var.Y = wVar8;
                            wVar3 = wVar8;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            z0Var2 = x.b;
                        }
                        if (i7 != 0) {
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            wVar4 = wVar3;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            wVar4 = wVar3;
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            z4 = true;
                        }
                    } else {
                        if (i11 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        androidx.compose.foundation.layout.z0 z0Var9 = x.a;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        t0Var = (t0) sVar.j(u0.a);
                        wVar3 = t0Var.Y;
                        if (wVar3 == null) {
                            long j5 = androidx.compose.ui.graphics.t.h;
                            w wVar9 = new w(j5, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j5, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                            t0Var.Y = wVar9;
                            wVar3 = wVar9;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            z0Var2 = x.b;
                        }
                        if (i7 != 0) {
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            wVar4 = wVar3;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            wVar4 = wVar3;
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            z4 = true;
                        }
                    }
                    sVar.q();
                    b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
                    wVar2 = wVar4;
                    z0Var3 = z0Var4;
                    kVar2 = kVar3;
                    n0Var2 = n0VarA;
                    z3 = z4;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    n0Var2 = n0Var;
                    wVar2 = wVar;
                    z0Var3 = z0Var2;
                    rVar3 = rVar2;
                    z3 = z;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            kVar2 = kVar;
            if ((306783379 & i4) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sVar.T(i4 & 1, z2)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    androidx.compose.foundation.layout.z0 z0Var10 = x.a;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    t0Var = (t0) sVar.j(u0.a);
                    wVar3 = t0Var.Y;
                    if (wVar3 == null) {
                        long j6 = androidx.compose.ui.graphics.t.h;
                        w wVar10 = new w(j6, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j6, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                        t0Var.Y = wVar10;
                        wVar3 = wVar10;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        z0Var2 = x.b;
                    }
                    if (i7 != 0) {
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        wVar4 = wVar3;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        wVar4 = wVar3;
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        z4 = true;
                    }
                } else {
                    if (i11 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    androidx.compose.foundation.layout.z0 z0Var11 = x.a;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    t0Var = (t0) sVar.j(u0.a);
                    wVar3 = t0Var.Y;
                    if (wVar3 == null) {
                        long j7 = androidx.compose.ui.graphics.t.h;
                        w wVar11 = new w(j7, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j7, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                        t0Var.Y = wVar11;
                        wVar3 = wVar11;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        z0Var2 = x.b;
                    }
                    if (i7 != 0) {
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        wVar4 = wVar3;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        wVar4 = wVar3;
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        z4 = true;
                    }
                }
                sVar.q();
                b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
                wVar2 = wVar4;
                z0Var3 = z0Var4;
                kVar2 = kVar3;
                n0Var2 = n0VarA;
                z3 = z4;
                rVar3 = rVar5;
            } else {
                sVar.W();
                n0Var2 = n0Var;
                wVar2 = wVar;
                z0Var3 = z0Var2;
                rVar3 = rVar2;
                z3 = z;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        i4 = 1779072 | i3;
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((i & 12582912) == 0) {
                z0Var2 = z0Var;
                if (sVar.f(z0Var2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            i7 = i2 & LibretroCore.SCREEN_WIDTH;
            if (i7 != 0) {
                if ((i & 100663296) == 0) {
                    kVar2 = kVar;
                    if (sVar.f(kVar2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                if ((306783379 & i4) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (sVar.T(i4 & 1, z2)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        androidx.compose.foundation.layout.z0 z0Var12 = x.a;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        t0Var = (t0) sVar.j(u0.a);
                        wVar3 = t0Var.Y;
                        if (wVar3 == null) {
                            long j8 = androidx.compose.ui.graphics.t.h;
                            w wVar12 = new w(j8, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j8, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                            t0Var.Y = wVar12;
                            wVar3 = wVar12;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            z0Var2 = x.b;
                        }
                        if (i7 != 0) {
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            wVar4 = wVar3;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            wVar4 = wVar3;
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            z4 = true;
                        }
                    } else {
                        if (i11 != 0) {
                            rVar4 = androidx.compose.ui.o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        androidx.compose.foundation.layout.z0 z0Var13 = x.a;
                        n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                        t0Var = (t0) sVar.j(u0.a);
                        wVar3 = t0Var.Y;
                        if (wVar3 == null) {
                            long j9 = androidx.compose.ui.graphics.t.h;
                            w wVar13 = new w(j9, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j9, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                            t0Var.Y = wVar13;
                            wVar3 = wVar13;
                        }
                        i9 = i4 & (-64513);
                        if (i5 != 0) {
                            z0Var2 = x.b;
                        }
                        if (i7 != 0) {
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            kVar3 = null;
                            z4 = true;
                            i10 = i9;
                            wVar4 = wVar3;
                        } else {
                            i10 = i9;
                            kVar3 = kVar2;
                            wVar4 = wVar3;
                            z0Var4 = z0Var2;
                            rVar5 = rVar4;
                            z4 = true;
                        }
                    }
                    sVar.q();
                    b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
                    wVar2 = wVar4;
                    z0Var3 = z0Var4;
                    kVar2 = kVar3;
                    n0Var2 = n0VarA;
                    z3 = z4;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    n0Var2 = n0Var;
                    wVar2 = wVar;
                    z0Var3 = z0Var2;
                    rVar3 = rVar2;
                    z3 = z;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            kVar2 = kVar;
            if ((306783379 & i4) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sVar.T(i4 & 1, z2)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    androidx.compose.foundation.layout.z0 z0Var14 = x.a;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    t0Var = (t0) sVar.j(u0.a);
                    wVar3 = t0Var.Y;
                    if (wVar3 == null) {
                        long j10 = androidx.compose.ui.graphics.t.h;
                        w wVar14 = new w(j10, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j10, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                        t0Var.Y = wVar14;
                        wVar3 = wVar14;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        z0Var2 = x.b;
                    }
                    if (i7 != 0) {
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        wVar4 = wVar3;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        wVar4 = wVar3;
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        z4 = true;
                    }
                } else {
                    if (i11 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    androidx.compose.foundation.layout.z0 z0Var15 = x.a;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    t0Var = (t0) sVar.j(u0.a);
                    wVar3 = t0Var.Y;
                    if (wVar3 == null) {
                        long j11 = androidx.compose.ui.graphics.t.h;
                        w wVar15 = new w(j11, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j11, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                        t0Var.Y = wVar15;
                        wVar3 = wVar15;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        z0Var2 = x.b;
                    }
                    if (i7 != 0) {
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        wVar4 = wVar3;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        wVar4 = wVar3;
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        z4 = true;
                    }
                }
                sVar.q();
                b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
                wVar2 = wVar4;
                z0Var3 = z0Var4;
                kVar2 = kVar3;
                n0Var2 = n0VarA;
                z3 = z4;
                rVar3 = rVar5;
            } else {
                sVar.W();
                n0Var2 = n0Var;
                wVar2 = wVar;
                z0Var3 = z0Var2;
                rVar3 = rVar2;
                z3 = z;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i4 = 14361984 | i3;
        z0Var2 = z0Var;
        i7 = i2 & LibretroCore.SCREEN_WIDTH;
        if (i7 != 0) {
            if ((i & 100663296) == 0) {
                kVar2 = kVar;
                if (sVar.f(kVar2)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((306783379 & i4) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sVar.T(i4 & 1, z2)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    androidx.compose.foundation.layout.z0 z0Var16 = x.a;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    t0Var = (t0) sVar.j(u0.a);
                    wVar3 = t0Var.Y;
                    if (wVar3 == null) {
                        long j12 = androidx.compose.ui.graphics.t.h;
                        w wVar16 = new w(j12, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j12, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                        t0Var.Y = wVar16;
                        wVar3 = wVar16;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        z0Var2 = x.b;
                    }
                    if (i7 != 0) {
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        wVar4 = wVar3;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        wVar4 = wVar3;
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        z4 = true;
                    }
                } else {
                    if (i11 != 0) {
                        rVar4 = androidx.compose.ui.o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    androidx.compose.foundation.layout.z0 z0Var17 = x.a;
                    n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                    t0Var = (t0) sVar.j(u0.a);
                    wVar3 = t0Var.Y;
                    if (wVar3 == null) {
                        long j13 = androidx.compose.ui.graphics.t.h;
                        w wVar17 = new w(j13, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j13, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                        t0Var.Y = wVar17;
                        wVar3 = wVar17;
                    }
                    i9 = i4 & (-64513);
                    if (i5 != 0) {
                        z0Var2 = x.b;
                    }
                    if (i7 != 0) {
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        kVar3 = null;
                        z4 = true;
                        i10 = i9;
                        wVar4 = wVar3;
                    } else {
                        i10 = i9;
                        kVar3 = kVar2;
                        wVar4 = wVar3;
                        z0Var4 = z0Var2;
                        rVar5 = rVar4;
                        z4 = true;
                    }
                }
                sVar.q();
                b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
                wVar2 = wVar4;
                z0Var3 = z0Var4;
                kVar2 = kVar3;
                n0Var2 = n0VarA;
                z3 = z4;
                rVar3 = rVar5;
            } else {
                sVar.W();
                n0Var2 = n0Var;
                wVar2 = wVar;
                z0Var3 = z0Var2;
                rVar3 = rVar2;
                z3 = z;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i4 |= 100663296;
        kVar2 = kVar;
        if ((306783379 & i4) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sVar.T(i4 & 1, z2)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar2;
                }
                androidx.compose.foundation.layout.z0 z0Var18 = x.a;
                n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                t0Var = (t0) sVar.j(u0.a);
                wVar3 = t0Var.Y;
                if (wVar3 == null) {
                    long j14 = androidx.compose.ui.graphics.t.h;
                    w wVar18 = new w(j14, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j14, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                    t0Var.Y = wVar18;
                    wVar3 = wVar18;
                }
                i9 = i4 & (-64513);
                if (i5 != 0) {
                    z0Var2 = x.b;
                }
                if (i7 != 0) {
                    z0Var4 = z0Var2;
                    rVar5 = rVar4;
                    kVar3 = null;
                    z4 = true;
                    i10 = i9;
                    wVar4 = wVar3;
                } else {
                    i10 = i9;
                    kVar3 = kVar2;
                    wVar4 = wVar3;
                    z0Var4 = z0Var2;
                    rVar5 = rVar4;
                    z4 = true;
                }
            } else {
                if (i11 != 0) {
                    rVar4 = androidx.compose.ui.o.b;
                } else {
                    rVar4 = rVar2;
                }
                androidx.compose.foundation.layout.z0 z0Var19 = x.a;
                n0VarA = d5.a(androidx.compose.material3.tokens.b.b, sVar);
                t0Var = (t0) sVar.j(u0.a);
                wVar3 = t0Var.Y;
                if (wVar3 == null) {
                    long j15 = androidx.compose.ui.graphics.t.h;
                    w wVar19 = new w(j15, u0.c(t0Var, androidx.compose.material3.tokens.f.H), j15, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.P, u0.c(t0Var, androidx.compose.material3.tokens.t.O)));
                    t0Var.Y = wVar19;
                    wVar3 = wVar19;
                }
                i9 = i4 & (-64513);
                if (i5 != 0) {
                    z0Var2 = x.b;
                }
                if (i7 != 0) {
                    z0Var4 = z0Var2;
                    rVar5 = rVar4;
                    kVar3 = null;
                    z4 = true;
                    i10 = i9;
                    wVar4 = wVar3;
                } else {
                    i10 = i9;
                    kVar3 = kVar2;
                    wVar4 = wVar3;
                    z0Var4 = z0Var2;
                    rVar5 = rVar4;
                    z4 = true;
                }
            }
            sVar.q();
            b(aVar2, rVar5, z4, n0VarA, wVar4, null, null, z0Var4, kVar3, qVar, sVar, i10 & 2147483646, 0);
            wVar2 = wVar4;
            z0Var3 = z0Var4;
            kVar2 = kVar3;
            n0Var2 = n0VarA;
            z3 = z4;
            rVar3 = rVar5;
        } else {
            sVar.W();
            n0Var2 = n0Var;
            wVar2 = wVar;
            z0Var3 = z0Var2;
            rVar3 = rVar2;
            z3 = z;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.material3.c0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.i(aVar, rVar3, z3, n0Var2, wVar2, z0Var3, kVar2, qVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static g0 j(long j, androidx.compose.runtime.s sVar, int i) {
        long jB = u0.b(j, sVar);
        long j2 = androidx.compose.ui.graphics.t.i;
        long jB2 = androidx.compose.ui.graphics.t.b(0.38f, jB);
        g0 g0VarN = n((t0) sVar.j(u0.a));
        long j3 = j != 16 ? j : g0VarN.a;
        if (jB == 16) {
            jB = g0VarN.b;
        }
        long j4 = jB;
        if (j2 == 16) {
            j2 = g0VarN.c;
        }
        long j5 = j2;
        if (jB2 == 16) {
            jB2 = g0VarN.d;
        }
        return new g0(j3, j4, j5, jB2);
    }

    public static h0 k(int i, float f) {
        if ((i & 1) != 0) {
            f = androidx.compose.material3.tokens.k.b;
        }
        return new h0(f, androidx.compose.material3.tokens.k.i, androidx.compose.material3.tokens.k.g, androidx.compose.material3.tokens.k.h, androidx.compose.material3.tokens.k.f, androidx.compose.material3.tokens.k.d);
    }

    public static q5 l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, androidx.compose.runtime.s sVar, int i) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13 = androidx.compose.ui.graphics.t.h;
        long jD = u0.d(androidx.compose.material3.tokens.a0.p, sVar);
        long jD2 = u0.d(androidx.compose.material3.tokens.a0.v, sVar);
        long jD3 = u0.d(androidx.compose.material3.tokens.a0.x, sVar);
        if ((i & LibretroCore.SCREEN_WIDTH) != 0) {
            j9 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.a0.b, u0.d(androidx.compose.material3.tokens.a0.a, sVar)), ((t0) sVar.j(u0.a)).p);
        } else {
            j9 = j5;
        }
        if ((i & 512) != 0) {
            j10 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.a0.f, u0.d(androidx.compose.material3.tokens.a0.e, sVar)), ((t0) sVar.j(u0.a)).p);
        } else {
            j10 = j6;
        }
        long jB = androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.a0.d, u0.d(androidx.compose.material3.tokens.a0.c, sVar));
        androidx.compose.runtime.x2 x2Var = u0.a;
        long j14 = androidx.compose.ui.graphics.a0.j(jB, ((t0) sVar.j(x2Var)).p);
        if ((i & 4096) != 0) {
            j11 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.a0.h, u0.d(androidx.compose.material3.tokens.a0.g, sVar)), ((t0) sVar.j(x2Var)).p);
        } else {
            j11 = j7;
        }
        if ((i & 8192) != 0) {
            j12 = androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.a0.f, u0.d(androidx.compose.material3.tokens.a0.k, sVar)), ((t0) sVar.j(x2Var)).p);
        } else {
            j12 = j8;
        }
        return new q5(j, j2, j13, jD, j3, j4, jD2, jD3, j9, j10, j13, j14, j11, j12, androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.a0.f, u0.d(androidx.compose.material3.tokens.a0.l, sVar)), ((t0) sVar.j(x2Var)).p), androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.a0.j, u0.d(androidx.compose.material3.tokens.a0.i, sVar)), ((t0) sVar.j(x2Var)).p));
    }

    public static t4 m(long j, long j2, androidx.compose.runtime.s sVar) {
        long j3 = androidx.compose.ui.graphics.t.i;
        t0 t0Var = (t0) sVar.j(u0.a);
        t4 t4Var = t0Var.f0;
        if (t4Var == null) {
            t4 t4Var2 = new t4(u0.c(t0Var, androidx.compose.material3.tokens.v.d), u0.c(t0Var, androidx.compose.material3.tokens.v.f), androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, androidx.compose.material3.tokens.v.a)), androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, androidx.compose.material3.tokens.v.b)));
            t0Var.f0 = t4Var2;
            t4Var = t4Var2;
        }
        long j4 = j != 16 ? j : t4Var.a;
        long j5 = j2 != 16 ? j2 : t4Var.b;
        long j6 = j3 != 16 ? j3 : t4Var.c;
        if (j3 == 16) {
            j3 = t4Var.d;
        }
        return new t4(j4, j5, j6, j3);
    }

    public static g0 n(t0 t0Var) {
        g0 g0Var = t0Var.Z;
        if (g0Var != null) {
            return g0Var;
        }
        androidx.compose.material3.tokens.f fVar = androidx.compose.material3.tokens.k.a;
        g0 g0Var2 = new g0(u0.c(t0Var, fVar), u0.a(t0Var, u0.c(t0Var, fVar)), androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.k.e, u0.c(t0Var, androidx.compose.material3.tokens.k.c)), u0.c(t0Var, fVar)), androidx.compose.ui.graphics.t.b(0.38f, u0.a(t0Var, u0.c(t0Var, fVar))));
        t0Var.Z = g0Var2;
        return g0Var2;
    }

    public static n3 o(t0 t0Var) {
        n3 n3Var = t0Var.e0;
        if (n3Var != null) {
            return n3Var;
        }
        long jC = u0.c(t0Var, androidx.compose.material3.tokens.r.a);
        long jC2 = u0.c(t0Var, androidx.compose.material3.tokens.r.d);
        long jC3 = u0.c(t0Var, androidx.compose.material3.tokens.r.b);
        androidx.compose.material3.tokens.f fVar = androidx.compose.material3.tokens.r.e;
        long jC4 = u0.c(t0Var, fVar);
        androidx.compose.material3.tokens.f fVar2 = androidx.compose.material3.tokens.r.f;
        n3 n3Var2 = new n3(jC, jC2, jC3, jC4, u0.c(t0Var, fVar2), androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, fVar)), androidx.compose.ui.graphics.t.b(0.38f, u0.c(t0Var, fVar2)));
        t0Var.e0 = n3Var2;
        return n3Var2;
    }

    public static m6 p(androidx.compose.runtime.s sVar) {
        return (m6) sVar.j(n6.a);
    }

    public static final boolean q(long j) {
        if (androidx.compose.ui.graphics.t.c(j, androidx.compose.ui.graphics.t.h)) {
            return false;
        }
        androidx.compose.ui.graphics.colorspace.c cVarF = androidx.compose.ui.graphics.t.f(j);
        if (!androidx.compose.ui.graphics.colorspace.b.a(cVarF.b, androidx.compose.ui.graphics.colorspace.b.a)) {
            androidx.compose.ui.graphics.d0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) androidx.compose.ui.graphics.colorspace.b.b(cVarF.b)));
        }
        androidx.compose.ui.graphics.colorspace.m mVar = ((androidx.compose.ui.graphics.colorspace.q) cVarF).p;
        float fA = (float) ((mVar.a(androidx.compose.ui.graphics.t.e(j)) * 0.0722d) + (mVar.a(androidx.compose.ui.graphics.t.g(j)) * 0.7152d) + (mVar.a(androidx.compose.ui.graphics.t.h(j)) * 0.2126d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            fA = 1.0f;
        }
        return ((double) fA) <= 0.5d;
    }

    public static final androidx.compose.animation.core.k1 r(androidx.compose.material3.tokens.p pVar, androidx.compose.runtime.s sVar) {
        l3 l3Var = (l3) sVar.j(g2.a);
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 0) {
            l3Var.getClass();
            androidx.compose.animation.core.k1 k1Var = l3.b;
            k1Var.getClass();
            return k1Var;
        }
        if (iOrdinal == 1) {
            l3Var.getClass();
            androidx.compose.animation.core.k1 k1Var2 = l3.c;
            k1Var2.getClass();
            return k1Var2;
        }
        if (iOrdinal == 2) {
            l3Var.getClass();
            androidx.compose.animation.core.k1 k1Var3 = l3.d;
            k1Var3.getClass();
            return k1Var3;
        }
        if (iOrdinal == 3) {
            l3Var.getClass();
            androidx.compose.animation.core.k1 k1Var4 = l3.e;
            k1Var4.getClass();
            return k1Var4;
        }
        if (iOrdinal == 4) {
            l3Var.getClass();
            androidx.compose.animation.core.k1 k1Var5 = l3.f;
            k1Var5.getClass();
            return k1Var5;
        }
        if (iOrdinal != 5) {
            coil3.g.a();
            return null;
        }
        l3Var.getClass();
        androidx.compose.animation.core.k1 k1Var6 = l3.g;
        k1Var6.getClass();
        return k1Var6;
    }
}
