package androidx.compose.foundation.layout;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ n0(int i, int i2, androidx.compose.ui.layout.d1 d1Var) {
        this.e = 2;
        this.z = i;
        this.y = d1Var;
        this.A = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.c1.i((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.d1) this.y, this.z, this.A);
                break;
            case 1:
                androidx.compose.ui.layout.c1.i((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.d1) this.y, this.z, this.A);
                break;
            case 2:
                androidx.compose.ui.layout.d1 d1Var = (androidx.compose.ui.layout.d1) this.y;
                androidx.compose.ui.layout.c1.i((androidx.compose.ui.layout.c1) obj, d1Var, kotlin.math.a.H((this.z - d1Var.e) / 2.0f), kotlin.math.a.H((this.A - d1Var.y) / 2.0f));
                break;
            default:
                androidx.compose.ui.graphics.j jVar = (androidx.compose.ui.graphics.j) this.y;
                androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) obj;
                androidx.compose.ui.text.a aVar = pVar.a;
                int iD = pVar.d(this.z);
                int iD2 = pVar.d(this.A);
                CharSequence charSequence = aVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("start(", ") or end(", iD, ") is out of range [0..", iD2);
                    sbW.append(charSequence.length());
                    sbW.append("], or start > end!");
                    androidx.compose.ui.text.internal.a.a(sbW.toString());
                }
                Path path = new Path();
                androidx.compose.ui.text.android.l lVar = aVar.d;
                lVar.f.getSelectionPath(iD, iD2, path);
                int i = lVar.h;
                if (i != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i);
                }
                androidx.compose.ui.graphics.j jVar2 = new androidx.compose.ui.graphics.j(path);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(pVar.f)) & 4294967295L);
                Matrix matrix = jVar2.d;
                if (matrix == null) {
                    jVar2.d = new Matrix();
                } else {
                    matrix.reset();
                }
                Matrix matrix2 = jVar2.d;
                matrix2.getClass();
                matrix2.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                Matrix matrix3 = jVar2.d;
                matrix3.getClass();
                path.transform(matrix3);
                androidx.compose.ui.graphics.j.a(jVar, jVar2);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ n0(int i, int i2, int i3, Object obj) {
        this.e = i3;
        this.y = obj;
        this.z = i;
        this.A = i2;
    }
}
