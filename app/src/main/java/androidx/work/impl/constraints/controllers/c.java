package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.navigation.u;
import androidx.work.impl.constraints.g;
import androidx.work.impl.model.p;
import androidx.work.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar, int i) {
        super(uVar);
        this.b = i;
        uVar.getClass();
        switch (i) {
            case 4:
                super(uVar);
                this.c = 9;
                break;
            default:
                this.c = 6;
                break;
        }
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean b(p pVar) {
        int i = this.b;
        pVar.getClass();
        switch (i) {
            case 0:
                return pVar.j.c;
            case 1:
                return pVar.j.e;
            case 2:
                return pVar.j.a == z.y;
            case 3:
                return pVar.j.a == z.z;
            default:
                return pVar.j.f;
        }
    }

    @Override // androidx.work.impl.constraints.controllers.b
    public final int d() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.c;
    }

    @Override // androidx.work.impl.constraints.controllers.b
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                g gVar = (g) obj;
                gVar.getClass();
                return gVar.e || !gVar.a || (Build.VERSION.SDK_INT >= 26 && !gVar.b);
            case 3:
                g gVar2 = (g) obj;
                gVar2.getClass();
                return !gVar2.a || gVar2.c || gVar2.e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.work.impl.constraints.trackers.a aVar) {
        super(aVar);
        this.b = 1;
        aVar.getClass();
        this.c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.work.impl.constraints.trackers.g gVar, int i) {
        super(gVar);
        this.b = i;
        gVar.getClass();
        switch (i) {
            case 3:
                super(gVar);
                this.c = 7;
                break;
            default:
                this.c = 7;
                break;
        }
    }
}
