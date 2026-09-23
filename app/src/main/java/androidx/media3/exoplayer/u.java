package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements androidx.media3.common.util.l {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ androidx.media3.common.f1 y;

    public /* synthetic */ u(androidx.media3.common.f1 f1Var) {
        this.y = f1Var;
    }

    @Override // androidx.media3.common.util.l
    public final void invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((androidx.media3.common.o0) obj).a(this.y);
                break;
            default:
                androidx.media3.exoplayer.analytics.j jVar = (androidx.media3.exoplayer.analytics.j) ((androidx.media3.exoplayer.analytics.b) obj);
                androidx.appcompat.widget.x xVar = jVar.p;
                androidx.media3.common.f1 f1Var = this.y;
                if (xVar != null) {
                    androidx.media3.common.r rVar = (androidx.media3.common.r) xVar.z;
                    if (rVar.w == -1) {
                        androidx.media3.common.q qVarA = rVar.a();
                        qVarA.u = f1Var.a;
                        qVarA.v = f1Var.b;
                        jVar.p = new androidx.appcompat.widget.x(xVar.y, (String) xVar.A, new androidx.media3.common.r(qVarA), 7);
                    }
                }
                int i = f1Var.a;
                break;
        }
    }

    public /* synthetic */ u(androidx.media3.exoplayer.analytics.a aVar, androidx.media3.common.f1 f1Var) {
        this.y = f1Var;
    }
}
