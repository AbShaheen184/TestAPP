package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.appcompat.view.menu.n {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ j m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context, androidx.appcompat.view.menu.t tVar, View view) {
        super(context, tVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = jVar;
        if ((tVar.x.x & 32) != 32) {
            View view2 = jVar.E;
            this.e = view2 == null ? jVar.D : view2;
        }
        com.app.mlounge.data.music.e eVar = jVar.S;
        this.h = eVar;
        androidx.appcompat.view.menu.l lVar = this.i;
        if (lVar != null) {
            lVar.c(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void c() {
        switch (this.l) {
            case 0:
                this.m.P = null;
                super.c();
                break;
            default:
                j jVar = this.m;
                androidx.appcompat.view.menu.j jVar2 = jVar.z;
                if (jVar2 != null) {
                    jVar2.c(true);
                }
                jVar.O = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context, androidx.appcompat.view.menu.j jVar2, View view) {
        super(context, jVar2, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = jVar;
        this.f = 8388613;
        com.app.mlounge.data.music.e eVar = jVar.S;
        this.h = eVar;
        androidx.appcompat.view.menu.l lVar = this.i;
        if (lVar != null) {
            lVar.c(eVar);
        }
    }
}
