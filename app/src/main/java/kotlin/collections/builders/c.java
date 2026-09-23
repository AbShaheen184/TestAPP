package kotlin.collections.builders;

import androidx.room.b0;
import java.util.ArrayList;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlin.sequences.i;
import kotlin.text.k;
import kotlinx.serialization.internal.q0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.a {
    public static final String C(Object[] objArr, int i, int i2, kotlin.collections.g gVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == gVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void D(com.grack.nanojson.c cVar) throws org.schabi.newpipe.extractor.exceptions.b {
        if (org.schabi.newpipe.extractor.utils.g.j(cVar.e("error"))) {
            return;
        }
        com.grack.nanojson.c cVarE = cVar.e("error");
        if (cVarE.c("code", 0) != 404) {
            throw new org.schabi.newpipe.extractor.exceptions.b(b0.e("Got error:\"", cVarE.f("status", null), "\": ", cVarE.f("message", null)));
        }
        throw new org.schabi.newpipe.extractor.exceptions.b("This channel doesn't exist.");
    }

    public static final void E(androidx.compose.ui.graphics.vector.g gVar, String str, String str2) {
        gVar.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = gVar.b;
        arrayList.add(str);
        arrayList.add(k.g0(str2).toString());
    }

    public static final void G(String str) {
        str.getClass();
        if (str.length() <= 0) {
            kotlinx.coroutines.future.a.q("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                kotlin.comparisons.a.c(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void H(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                kotlin.comparisons.a.c(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(okhttp3.internal.e.m(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static i I(p pVar) {
        i iVar = new i();
        iVar.A = kotlin.coroutines.intrinsics.h.d(pVar, iVar, iVar);
        return iVar;
    }

    public static final void J(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    @Override // kotlinx.serialization.encoding.b
    public float A() {
        F();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.b
    public double B() {
        F();
        throw null;
    }

    public void F() {
        throw new kotlinx.serialization.d(a0.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.a
    public short a(q0 q0Var, int i) {
        q0Var.getClass();
        return z();
    }

    @Override // kotlinx.serialization.encoding.a
    public float b(q0 q0Var, int i) {
        q0Var.getClass();
        return A();
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean c() {
        F();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a
    public char d(q0 q0Var, int i) {
        q0Var.getClass();
        return e();
    }

    @Override // kotlinx.serialization.encoding.b
    public char e() {
        F();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a
    public long f(kotlinx.serialization.descriptors.e eVar, int i) {
        eVar.getClass();
        return o();
    }

    @Override // kotlinx.serialization.encoding.a
    public byte g(q0 q0Var, int i) {
        q0Var.getClass();
        return y();
    }

    @Override // kotlinx.serialization.encoding.a
    public void h(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
    }

    @Override // kotlinx.serialization.encoding.a
    public boolean i(q0 q0Var, int i) {
        q0Var.getClass();
        return c();
    }

    @Override // kotlinx.serialization.encoding.b
    public abstract int j();

    @Override // kotlinx.serialization.encoding.a
    public int k(kotlinx.serialization.descriptors.e eVar, int i) {
        eVar.getClass();
        return j();
    }

    @Override // kotlinx.serialization.encoding.b
    public String m() {
        F();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.b
    public kotlinx.serialization.encoding.a n(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.b
    public abstract long o();

    @Override // kotlinx.serialization.encoding.b
    public Object p(kotlinx.serialization.a aVar) {
        aVar.getClass();
        return aVar.a(this);
    }

    @Override // kotlinx.serialization.encoding.a
    public String q(kotlinx.serialization.descriptors.e eVar, int i) {
        eVar.getClass();
        return m();
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean r() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.a
    public Object t(kotlinx.serialization.descriptors.e eVar, int i, kotlinx.serialization.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        if (aVar.d().c() || r()) {
            return p(aVar);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.b
    public kotlinx.serialization.encoding.b u(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.a
    public kotlinx.serialization.encoding.b v(q0 q0Var, int i) {
        q0Var.getClass();
        return u(q0Var.i(i));
    }

    @Override // kotlinx.serialization.encoding.a
    public Object w(kotlinx.serialization.descriptors.e eVar, int i, kotlinx.serialization.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        return p(aVar);
    }

    @Override // kotlinx.serialization.encoding.a
    public double x(q0 q0Var, int i) {
        q0Var.getClass();
        return B();
    }

    @Override // kotlinx.serialization.encoding.b
    public abstract byte y();

    @Override // kotlinx.serialization.encoding.b
    public abstract short z();
}
