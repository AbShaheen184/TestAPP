package androidx.compose.animation.core;

import androidx.compose.material3.c5;
import androidx.compose.material3.l3;
import androidx.compose.material3.m6;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g2 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g2(androidx.compose.runtime.internal.f fVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = 2;
        this.z = fVar;
        this.B = obj;
        this.C = obj2;
        this.A = obj3;
        this.D = obj4;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                i2.a((e2) this.z, (a2) this.A, this.B, this.C, (b0) this.D, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.material3.g2.a((androidx.compose.material3.t0) this.z, (l3) this.A, (c5) this.B, (m6) this.C, (androidx.compose.runtime.internal.f) this.D, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((androidx.compose.runtime.internal.f) this.z).j(this.B, this.C, this.A, this.D, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y) | 1);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = obj5;
        this.y = i;
    }
}
