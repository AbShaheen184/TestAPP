package androidx.compose.ui.scrollcapture;

import androidx.compose.material3.d3;
import androidx.compose.ui.text.android.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public int a;
    public float b;
    public final Object c;

    public f(l lVar) {
        this.c = lVar;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        l lVar = (l) this.c;
        int i2 = 1;
        if (z) {
            int iN = com.imsdk.a.n(lVar.f, i, z);
            int lineStart = lVar.f.getLineStart(iN);
            int iF = lVar.f(iN);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fH = z3 ? lVar.h(i, z) : lVar.i(i, z);
        if (z2) {
            this.a = i4;
            this.b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.z = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objInvoke = eVar.e;
        int i2 = eVar.z;
        if (i2 == 0) {
            kotlin.a.e(objInvoke);
            d3 d3Var = (d3) this.c;
            Float f2 = new Float(f);
            eVar.z = 1;
            objInvoke = d3Var.invoke(f2, eVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objInvoke);
        }
        this.b += ((Number) objInvoke).floatValue();
        return y.a;
    }

    public f(int i, d3 d3Var) {
        this.a = i;
        this.c = d3Var;
    }
}
