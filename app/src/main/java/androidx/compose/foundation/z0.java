package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float y;
    public final /* synthetic */ Object z;

    public /* synthetic */ z0(androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.r rVar, androidx.compose.ui.e eVar, androidx.compose.ui.layout.j jVar, float f, int i) {
        this.z = bVar;
        this.A = rVar;
        this.B = eVar;
        this.C = jVar;
        this.y = f;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.t.A(441);
                s.c((androidx.compose.ui.graphics.painter.b) this.z, (androidx.compose.ui.r) this.A, (androidx.compose.ui.e) this.B, (androidx.compose.ui.layout.j) this.C, this.y, (androidx.compose.runtime.s) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.t.A(1);
                com.app.mlounge.ui.screens.player.k0.q((androidx.compose.ui.graphics.vector.f) this.z, (String) this.A, (String) this.B, this.y, (kotlin.jvm.functions.a) this.C, (androidx.compose.runtime.s) obj, iA2);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ z0(androidx.compose.ui.graphics.vector.f fVar, String str, String str2, float f, kotlin.jvm.functions.a aVar, int i) {
        this.z = fVar;
        this.A = str;
        this.B = str2;
        this.y = f;
        this.C = aVar;
    }
}
