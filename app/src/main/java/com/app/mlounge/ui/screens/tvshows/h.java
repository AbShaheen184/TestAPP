package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.runtime.t;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.b2;
import kotlin.jvm.functions.s;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ h(String str, String str2, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, String str3, String str4, kotlin.jvm.functions.a aVar2, int i, int i2) {
        this.e = 2;
        this.A = str;
        this.B = str2;
        this.z = aVar;
        this.C = rVar;
        this.D = str3;
        this.E = str4;
        this.F = aVar2;
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = t.A(1);
                a.c(this.y, this.z, (kotlin.jvm.functions.l) this.A, (kotlin.jvm.functions.l) this.B, (kotlin.jvm.functions.q) this.C, (s) this.D, (s) this.E, (b2) this.F, (androidx.compose.runtime.s) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = t.A(1);
                a.c(this.y, this.z, (kotlin.jvm.functions.l) this.A, (kotlin.jvm.functions.l) this.B, (kotlin.jvm.functions.q) this.C, (s) this.D, (s) this.E, (b2) this.F, (androidx.compose.runtime.s) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = t.A(1);
                b0.f((String) this.A, (String) this.B, this.z, (androidx.compose.ui.r) this.C, (String) this.D, (String) this.E, (kotlin.jvm.functions.a) this.F, (androidx.compose.runtime.s) obj, iA3, this.y);
                break;
        }
        return y.a;
    }

    public /* synthetic */ h(int i, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.q qVar, s sVar, s sVar2, b2 b2Var, int i2, int i3) {
        this.e = i3;
        this.y = i;
        this.z = aVar;
        this.A = lVar;
        this.B = lVar2;
        this.C = qVar;
        this.D = sVar;
        this.E = sVar2;
        this.F = b2Var;
    }
}
