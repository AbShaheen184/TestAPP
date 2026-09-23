package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.impl.constraints.trackers.g;
import androidx.work.impl.model.p;
import androidx.work.y;
import androidx.work.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public static final String c = y.g("NetworkMeteredCtrlr");
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(gVar);
        gVar.getClass();
        this.b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean b(p pVar) {
        pVar.getClass();
        return pVar.j.a == z.B;
    }

    @Override // androidx.work.impl.constraints.controllers.b
    public final int d() {
        return this.b;
    }

    @Override // androidx.work.impl.constraints.controllers.b
    public final boolean e(Object obj) {
        androidx.work.impl.constraints.g gVar = (androidx.work.impl.constraints.g) obj;
        gVar.getClass();
        boolean z = gVar.e;
        boolean z2 = gVar.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z2 && gVar.c && !z) ? false : true;
        }
        y.e().a(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z2 || z;
    }
}
