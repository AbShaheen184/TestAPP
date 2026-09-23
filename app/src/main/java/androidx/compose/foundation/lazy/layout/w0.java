package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.s1;
import androidx.compose.runtime.x2;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements androidx.compose.runtime.saveable.g, androidx.compose.runtime.saveable.d {
    public final androidx.compose.runtime.saveable.h e;
    public final androidx.compose.runtime.saveable.d y;
    public final androidx.collection.p0 z;

    public w0(androidx.compose.runtime.saveable.g gVar, Map map, androidx.compose.runtime.saveable.d dVar) {
        androidx.activity.compose.g gVar2 = new androidx.activity.compose.g(gVar, 14);
        x2 x2Var = androidx.compose.runtime.saveable.i.a;
        this.e = new androidx.compose.runtime.saveable.h(map, gVar2);
        this.y = dVar;
        androidx.collection.p0 p0Var = androidx.collection.x0.a;
        this.z = new androidx.collection.p0();
    }

    @Override // androidx.compose.runtime.saveable.g
    public final boolean a(Object obj) {
        return this.e.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // androidx.compose.runtime.saveable.g
    public final Map b() {
        androidx.collection.p0 p0Var = this.z;
        Object[] objArr = p0Var.b;
        long[] jArr = p0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.y.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.e.b();
    }

    @Override // androidx.compose.runtime.saveable.g
    public final Object c(String str) {
        return this.e.c(str);
    }

    @Override // androidx.compose.runtime.saveable.g
    public final androidx.compose.runtime.saveable.f d(String str, kotlin.jvm.functions.a aVar) {
        return this.e.d(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void e(Object obj, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(-858296452);
        if ((i & 6) == 0) {
            i2 = (sVar.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(this) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            this.y.e(obj, fVar, sVar, i2 & Token.ELSE);
            boolean zH = sVar.h(this) | sVar.h(obj);
            Object objQ = sVar.Q();
            if (zH || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.activity.compose.h(20, this, obj);
                sVar.l0(objQ);
            }
            androidx.compose.runtime.l0.b(obj, (kotlin.jvm.functions.l) objQ, sVar);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(this, obj, fVar, i, 3);
        }
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void f(Object obj) {
        this.y.f(obj);
    }
}
