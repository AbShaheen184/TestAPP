package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ t(String str, androidx.compose.ui.graphics.vector.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, int i, int i2) {
        this.y = str;
        this.D = fVar;
        this.z = aVar;
        this.E = rVar;
        this.A = z;
        this.B = i;
        this.C = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                b0.s(this.y, (String) this.D, this.A, (kotlin.jvm.functions.p) this.E, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1), this.C);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.movies.a.b(this.y, (androidx.compose.ui.graphics.vector.f) this.D, this.z, (androidx.compose.ui.r) this.E, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1), this.C);
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.player.k0.i(this.y, (androidx.compose.ui.graphics.vector.f) this.E, this.A, (String) this.D, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1), this.C);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ t(String str, androidx.compose.ui.graphics.vector.f fVar, boolean z, String str2, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.y = str;
        this.E = fVar;
        this.A = z;
        this.D = str2;
        this.z = aVar;
        this.B = i;
        this.C = i2;
    }

    public /* synthetic */ t(String str, String str2, boolean z, kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.y = str;
        this.D = str2;
        this.A = z;
        this.E = pVar;
        this.z = aVar;
        this.B = i;
        this.C = i2;
    }
}
