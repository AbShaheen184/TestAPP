package androidx.compose.ui.focus;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ e0 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ androidx.compose.animation.h C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int y;
    public final /* synthetic */ e0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(e0 e0Var, e0 e0Var2, Object obj, int i, androidx.compose.animation.h hVar, int i2) {
        super(1);
        this.y = i2;
        this.z = e0Var;
        this.A = e0Var2;
        this.D = obj;
        this.B = i;
        this.C = hVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                androidx.compose.ui.layout.e eVar = (androidx.compose.ui.layout.e) obj;
                e0 e0Var = this.A;
                if (this.z != ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.l.w(e0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zC = d.C(e0Var, (e0) this.D, this.B, this.C);
                Boolean boolValueOf = Boolean.valueOf(zC);
                if (zC || !eVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                androidx.compose.ui.layout.e eVar2 = (androidx.compose.ui.layout.e) obj;
                e0 e0Var2 = this.A;
                if (this.z != ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.l.w(e0Var2)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zB = d.B(this.B, this.C, e0Var2, (androidx.compose.ui.geometry.c) this.D);
                Boolean boolValueOf2 = Boolean.valueOf(zB);
                if (zB || !eVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
