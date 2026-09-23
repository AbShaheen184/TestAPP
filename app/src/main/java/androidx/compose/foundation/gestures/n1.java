package androidx.compose.foundation.gestures;

import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Serializable d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable] */
    public n1(AssetManager assetManager, Executor executor, androidx.profileinstaller.b bVar, String str, File file) {
        ?? r1;
        this.a = false;
        this.b = executor;
        this.c = bVar;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    r1 = androidx.profileinstaller.c.h;
                    break;
                case 26:
                    r1 = androidx.profileinstaller.c.g;
                    break;
                case 27:
                    r1 = androidx.profileinstaller.c.f;
                    break;
                case 28:
                case 29:
                case 30:
                    r1 = androidx.profileinstaller.c.e;
                    break;
                default:
                    r1 = 0;
                    break;
            }
        } else {
            r1 = androidx.profileinstaller.c.d;
        }
        this.d = r1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static final Object a(n1 n1Var, r2 r2Var, g1 g1Var, float f, float f2, kotlin.coroutines.jvm.internal.c cVar) {
        j1 j1Var;
        kotlin.jvm.internal.w wVar;
        float f3;
        r2 r2Var2;
        n1Var.getClass();
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i = j1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                j1Var.C = i - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(n1Var, cVar);
            }
        } else {
            j1Var = new j1(n1Var, cVar);
        }
        j1 j1Var2 = j1Var;
        Object obj = j1Var2.A;
        int i2 = j1Var2.C;
        Object obj2 = kotlin.y.a;
        Object obj3 = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            zVar.e = g1Var;
            n1Var.h(g1Var);
            g1 g1VarG = g((Channel) n1Var.f);
            if (g1VarG != null) {
                n1Var.h(g1VarG);
                zVar.e = ((g1) zVar.e).a(g1VarG);
            }
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            float fG = r2Var.g(r2Var.e(((g1) zVar.e).a));
            wVar2.e = fG;
            if (!f1.a(fG)) {
                kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                zVar2.e = androidx.compose.animation.core.e.b(30, 0.0f);
                k1 k1Var = new k1(wVar2, zVar2, zVar, f, n1Var, f2, r2Var, null);
                j1Var2.e = r2Var;
                j1Var2.y = wVar2;
                j1Var2.z = f2;
                j1Var2.C = 1;
                if (n1Var.i(r2Var, k1Var, j1Var2) != obj3) {
                    wVar = wVar2;
                    f3 = f2;
                    r2Var2 = r2Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return obj2;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = j1Var2.z;
        wVar = j1Var2.y;
        r2Var2 = j1Var2.e;
        kotlin.a.e(obj);
        androidx.compose.foundation.text.input.internal.o oVar = (androidx.compose.foundation.text.input.internal.o) n1Var.h;
        long jD = com.google.android.gms.dynamite.g.d(((androidx.compose.ui.input.pointer.util.e) oVar.y).b(Float.MAX_VALUE), ((androidx.compose.ui.input.pointer.util.e) oVar.z).b(Float.MAX_VALUE));
        if (jD == 0) {
            float fD = r2Var2.d(Math.signum(wVar.e)) * Math.min(Math.abs(wVar.e) / 100, f3) * 1000;
            if (fD == 0.0f) {
                jD = 0;
            } else {
                jD = r2Var2.d == o1.y ? com.google.android.gms.dynamite.g.d(fD, 0.0f) : com.google.android.gms.dynamite.g.d(0.0f, fD);
            }
        }
        g2 g2Var = (g2) n1Var.d;
        j1Var2.e = null;
        j1Var2.y = null;
        j1Var2.C = 2;
        k2 k2Var = (k2) g2Var.e;
        BuildersKt__Builders_commonKt.launch$default(k2Var.h0.c(), null, null, new i2(k2Var, jD, null, 1), 3, null);
        return obj2 == obj3 ? obj3 : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(n1 n1Var, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.w wVar, r2 r2Var, kotlin.jvm.internal.z zVar2, long j, kotlin.coroutines.jvm.internal.c cVar) {
        l1 l1Var;
        kotlin.jvm.internal.w wVar2;
        r2 r2Var2;
        kotlin.jvm.internal.z zVar3;
        boolean z;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i = l1Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1Var.D = i - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(cVar);
            }
        } else {
            l1Var = new l1(cVar);
        }
        Object objWithTimeoutOrNull = l1Var.C;
        int i2 = l1Var.D;
        if (i2 == 0) {
            kotlin.a.e(objWithTimeoutOrNull);
            if (j < 0) {
                return Boolean.FALSE;
            }
            androidx.compose.animation.core.c1 c1Var = new androidx.compose.animation.core.c1(n1Var, null, 5);
            l1Var.e = n1Var;
            l1Var.y = zVar;
            l1Var.z = wVar;
            l1Var.A = r2Var;
            l1Var.B = zVar2;
            l1Var.D = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, c1Var, l1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objWithTimeoutOrNull == aVar) {
                return aVar;
            }
            wVar2 = wVar;
            r2Var2 = r2Var;
            zVar3 = zVar2;
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.jvm.internal.z zVar4 = l1Var.B;
            r2 r2Var3 = l1Var.A;
            wVar2 = l1Var.z;
            kotlin.jvm.internal.z zVar5 = l1Var.y;
            n1 n1Var2 = l1Var.e;
            kotlin.a.e(objWithTimeoutOrNull);
            zVar3 = zVar4;
            r2Var2 = r2Var3;
            zVar = zVar5;
            n1Var = n1Var2;
        }
        g1 g1Var = (g1) objWithTimeoutOrNull;
        if (g1Var != null) {
            boolean z2 = ((g1) zVar.e).c;
            long j2 = g1Var.a;
            zVar.e = new g1(j2, g1Var.b, z2);
            wVar2.e = r2Var2.i(r2Var2.e(j2));
            zVar3.e = androidx.compose.animation.core.e.b(30, 0.0f);
            n1Var.h(g1Var);
            z = !f1.a(wVar2.e);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static g1 g(Channel channel) {
        g1 g1Var = null;
        kotlin.sequences.i iVarI = kotlin.collections.builders.c.I(new s0((Object) new androidx.activity.w(channel, 5), (kotlin.coroutines.d) (0 == true ? 1 : 0), 1));
        while (iVarI.hasNext()) {
            g1 g1VarA = (g1) iVarI.next();
            if (g1Var != null) {
                g1VarA = g1Var.a(g1VarA);
            }
            g1Var = g1VarA;
        }
        return g1Var;
    }

    public float c(q2 q2Var, float f) {
        r2 r2Var = (r2) this.b;
        long jH = r2Var.h(r2Var.d(f));
        r2 r2Var2 = q2Var.a;
        return r2Var.g(r2Var.e(r2Var2.c(r2Var2.k, jH, 1)));
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public boolean d(androidx.compose.ui.input.pointer.m mVar) {
        long j;
        com.google.firebase.platforminfo.d dVar = (com.google.firebase.platforminfo.d) this.c;
        androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) this.e;
        ViewConfiguration viewConfiguration = (ViewConfiguration) dVar.e;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? androidx.media3.common.audio.h.p(viewConfiguration) : cVar.W(64));
        float f2 = -(i > 26 ? androidx.media3.common.audio.h.m(viewConfiguration) : cVar.W(64));
        ?? r1 = mVar.a;
        androidx.compose.ui.geometry.b bVar = new androidx.compose.ui.geometry.b(0L);
        int size = r1.size();
        boolean zD = false;
        int i2 = 0;
        while (true) {
            j = bVar.a;
            if (i2 >= size) {
                break;
            }
            bVar = new androidx.compose.ui.geometry.b(androidx.compose.ui.geometry.b.e(j, ((androidx.compose.ui.input.pointer.v) r1.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        r2 r2Var = (r2) this.b;
        float fI = r2Var.i(r2Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            l2 l2Var = r2Var.a;
            zD = fI > 0.0f ? l2Var.d() : l2Var.b();
        }
        return zD ? ChannelResult.m52isSuccessimpl(((Channel) this.f).mo28trySendJP2dKIU(new g1(jFloatToRawIntBits, ((androidx.compose.ui.input.pointer.v) kotlin.collections.p.B(mVar.a)).b, false))) : this.a;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((androidx.profileinstaller.b) this.c).i();
            return null;
        }
    }

    public void f(int i, Serializable serializable) {
        ((Executor) this.b).execute(new androidx.activity.n(this, i, serializable, 3));
    }

    public void h(g1 g1Var) {
        androidx.compose.foundation.text.input.internal.o oVar = (androidx.compose.foundation.text.input.internal.o) this.h;
        long j = g1Var.b;
        long j2 = g1Var.a;
        ((androidx.compose.ui.input.pointer.util.e) oVar.y).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((androidx.compose.ui.input.pointer.util.e) oVar.z).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(r2 r2Var, k1 k1Var, kotlin.coroutines.jvm.internal.c cVar) {
        m1 m1Var;
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i = m1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1Var.z = i - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(this, cVar);
            }
        } else {
            m1Var = new m1(this, cVar);
        }
        Object obj = m1Var.e;
        int i2 = m1Var.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            this.a = true;
            androidx.activity.compose.p pVar = new androidx.activity.compose.p(r2Var, k1Var, null, 4);
            m1Var.z = 1;
            Object objSupervisorScope = SupervisorKt.supervisorScope(pVar, m1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objSupervisorScope == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        this.a = false;
        return kotlin.y.a;
    }

    public n1(r2 r2Var, com.google.firebase.platforminfo.d dVar, g2 g2Var, androidx.compose.ui.unit.c cVar) {
        this.b = r2Var;
        this.c = dVar;
        this.d = g2Var;
        this.e = cVar;
        this.f = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.h = new androidx.compose.foundation.text.input.internal.o(4);
    }
}
