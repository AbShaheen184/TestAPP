package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.v1;
import androidx.compose.runtime.s1;
import com.app.mlounge.emulator.LibretroCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements androidx.compose.foundation.lazy.layout.y {
    public final y a;
    public final j b;
    public final d c;
    public final androidx.appcompat.widget.x d;

    public l(y yVar, j jVar, d dVar, androidx.appcompat.widget.x xVar) {
        this.a = yVar;
        this.b = jVar;
        this.c = dVar;
        this.d = xVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int a() {
        return this.b.k().y;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final Object b(int i) {
        androidx.appcompat.widget.x xVar = this.d;
        Object[] objArr = (Object[]) xVar.A;
        int i2 = i - xVar.y;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.l(i) : obj;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final Object c(int i) {
        return this.b.j(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final void d(int i, Object obj, androidx.compose.runtime.s sVar, int i2) {
        sVar.c0(-462424778);
        int i3 = (sVar.d(i) ? 4 : 2) | i2 | (sVar.h(obj) ? 32 : 16) | (sVar.f(this) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            androidx.compose.foundation.lazy.layout.m.b(obj, i, this.a.r, androidx.compose.runtime.internal.k.c(-824725566, new k(this, i, 0), sVar), sVar, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & Token.ASSIGN_MOD));
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new v1(this, i, obj, i2, 2);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    public final int e(Object obj) {
        return this.d.k(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.b, ((l) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
