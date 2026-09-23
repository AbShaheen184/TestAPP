package androidx.compose.material3.internal;

import androidx.compose.runtime.j1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ p y;

    public /* synthetic */ j(p pVar, int i) {
        this.e = i;
        this.y = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        float f;
        switch (this.e) {
            case 0:
                p pVar = this.y;
                Object value = pVar.l.getValue();
                if (value != null) {
                    return value;
                }
                float fG = pVar.j.g();
                boolean zIsNaN = Float.isNaN(fG);
                j1 j1Var = pVar.g;
                return !zIsNaN ? pVar.c(fG, 0.0f, j1Var.getValue()) : j1Var.getValue();
            case 1:
                p pVar2 = this.y;
                Object value2 = pVar2.l.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fG2 = pVar2.j.g();
                boolean zIsNaN2 = Float.isNaN(fG2);
                j1 j1Var2 = pVar2.g;
                if (zIsNaN2) {
                    return j1Var2.getValue();
                }
                Object value3 = j1Var2.getValue();
                h0 h0VarD = pVar2.d();
                float fD = h0VarD.d(value3);
                if (fD != fG2 && !Float.isNaN(fD)) {
                    if (fD < fG2) {
                        Object objB = h0VarD.b(fG2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = h0VarD.b(fG2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value3;
            case 2:
                p pVar3 = this.y;
                float fD2 = pVar3.d().d(pVar3.g.getValue());
                float fD3 = pVar3.d().d(pVar3.i.getValue()) - fD2;
                float fAbs = Math.abs(fD3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    f = 1.0f;
                } else {
                    f = (pVar3.f() - fD2) / fD3;
                    if (f < 1.0E-6f) {
                        f = 0.0f;
                    } else if (f > 0.999999f) {
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 3:
                return this.y.d();
            default:
                p pVar4 = this.y;
                return new kotlin.k(pVar4.d(), pVar4.h.getValue());
        }
    }
}
