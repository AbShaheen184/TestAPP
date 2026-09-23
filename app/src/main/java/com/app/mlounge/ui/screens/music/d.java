package com.app.mlounge.ui.screens.music;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.app.mlounge.ui.viewmodel.j0;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ l A;
    public final /* synthetic */ j0 B;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ d(String str, kotlin.jvm.functions.a aVar, l lVar, j0 j0Var, int i, int i2) {
        this.e = i2;
        this.y = str;
        this.z = aVar;
        this.A = lVar;
        this.B = j0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = t.A(1);
                b.a(this.y, this.z, this.A, this.B, (s) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = t.A(1);
                b.a(this.y, this.z, this.A, this.B, (s) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = t.A(1);
                b.b(this.y, this.z, this.A, this.B, (s) obj, iA3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = t.A(1);
                b.b(this.y, this.z, this.A, this.B, (s) obj, iA4);
                break;
        }
        return y.a;
    }
}
