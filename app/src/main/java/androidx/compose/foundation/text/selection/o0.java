package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.w2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList y;

    public /* synthetic */ o0(int i, ArrayList arrayList) {
        this.e = i;
        this.y = arrayList;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    androidx.compose.ui.layout.c1.i(c1Var, (androidx.compose.ui.layout.d1) arrayList.get(i), 0, 0);
                }
                break;
            default:
                androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                dVar.getClass();
                char c = ' ';
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
                long j = 4294967295L;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
                float f = 4;
                float fW = (fIntBitsToFloat - (dVar.W(f) * 47)) / 48;
                float fW2 = dVar.W(f);
                int i2 = 0;
                for (int i3 = 48; i2 < i3; i3 = 48) {
                    float fFloatValue = ((Number) ((w2) this.y.get(i2)).getValue()).floatValue();
                    float f2 = fFloatValue * fIntBitsToFloat2 * 0.4f;
                    float fW3 = dVar.W(f);
                    float f3 = f2 < fW3 ? fW3 : f2;
                    float f4 = (fW + fW2) * i2;
                    float f5 = 2;
                    float f6 = (fIntBitsToFloat2 - f3) / f5;
                    long j2 = com.app.mlounge.ui.theme.b.h;
                    long jB = androidx.compose.ui.graphics.t.b(fFloatValue * 0.1f, j2);
                    char c2 = c;
                    long j3 = j;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4 - dVar.W(f5))) << c2) | (((long) Float.floatToRawIntBits(f6 - dVar.W(f5))) & j3);
                    androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(dVar.W(f) + fW)) << c2) | (((long) Float.floatToRawIntBits(dVar.W(f) + f3)) & j3);
                    float f7 = fW / f5;
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << c2) | (((long) Float.floatToRawIntBits(f7)) & j3);
                    if ((240 & 2) != 0) {
                        jFloatToRawIntBits = 0;
                    }
                    float f8 = fIntBitsToFloat2;
                    float f9 = f;
                    int i4 = i2;
                    dVar = dVar2;
                    dVar.r(jB, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (240 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.g.a : null);
                    androidx.compose.ui.graphics.drawscope.d.z(dVar, androidx.work.impl.model.f.t(kotlin.collections.q.k(new androidx.compose.ui.graphics.t(j2), new androidx.compose.ui.graphics.t(com.app.mlounge.ui.theme.b.f)), f6, f6 + f3, 8), (((long) Float.floatToRawIntBits(f4)) << c2) | (((long) Float.floatToRawIntBits(f6)) & j3), (((long) Float.floatToRawIntBits(fW)) << c2) | (((long) Float.floatToRawIntBits(f3)) & j3), (((long) Float.floatToRawIntBits(f7)) << c2) | (((long) Float.floatToRawIntBits(f7)) & j3), null, 240);
                    i2 = i4 + 1;
                    fIntBitsToFloat2 = f8;
                    f = f9;
                    c = c2;
                    j = j3;
                }
                break;
        }
        return kotlin.y.a;
    }
}
