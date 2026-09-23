package androidx.compose.runtime.saveable;

import androidx.appcompat.widget.r;
import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.foundation.b2;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.material3.t3;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.s2;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.media3.exoplayer.source.t0;
import com.app.mlounge.emulator.LibretroCore;
import java.util.Map;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public static final o B = new o(14, new b2(13), new t3(6));
    public final s2 A;
    public final Map e;
    public final o0 y;
    public g z;

    public e(Map map) {
        this.e = map;
        long[] jArr = w0.a;
        this.y = new o0();
        this.A = new s2(this, 1);
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void e(Object obj, androidx.compose.runtime.internal.f fVar, s sVar, int i) {
        int i2;
        sVar.c0(533563200);
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
            sVar.d0(obj);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar2 = n.a;
            if (objQ == fVar2) {
                s2 s2Var = this.A;
                if (!((Boolean) s2Var.invoke(obj)).booleanValue()) {
                    t0.g(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.e.get(obj);
                x2 x2Var = i.a;
                j jVar = new j(new h(map, s2Var));
                sVar.l0(jVar);
                objQ = jVar;
            }
            j jVar2 = (j) objQ;
            t.b(new r[]{i.a.a(jVar2), androidx.savedstate.compose.a.a.a(jVar2)}, fVar, sVar, (i2 & Token.ASSIGN_MOD) | 8);
            boolean zH = sVar.h(this) | sVar.h(obj) | sVar.h(jVar2);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == fVar2) {
                objQ2 = new androidx.compose.animation.core.a(14, this, obj, jVar2);
                sVar.l0(objQ2);
            }
            l0.b(y.a, (kotlin.jvm.functions.l) objQ2, sVar);
            if (sVar.y && sVar.G.i == sVar.z) {
                sVar.z = -1;
                sVar.y = false;
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(this, obj, fVar, i, 9);
        }
    }

    @Override // androidx.compose.runtime.saveable.d
    public final void f(Object obj) {
        if (this.y.k(obj) == null) {
            this.e.remove(obj);
        }
    }
}
