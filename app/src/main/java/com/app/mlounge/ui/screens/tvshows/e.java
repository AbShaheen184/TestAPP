package com.app.mlounge.ui.screens.tvshows;

import com.app.mlounge.ui.components.u0;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.l {
    public final /* synthetic */ b2 A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ List y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ e(List list, b2 b2Var, kotlin.jvm.functions.l lVar) {
        this.y = list;
        this.A = b2Var;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj;
        switch (this.e) {
            case 0:
                jVar.getClass();
                com.app.mlounge.ui.screens.sources.b bVar = new com.app.mlounge.ui.screens.sources.b(3);
                List list = this.y;
                jVar.q(list.size(), new n(bVar, list, 1), new u0(24, list), new androidx.compose.runtime.internal.f(true, 2039820996, new p(list, this.A, this.z)));
                break;
            default:
                jVar.getClass();
                com.app.mlounge.ui.screens.sources.b bVar2 = new com.app.mlounge.ui.screens.sources.b(4);
                List list2 = this.y;
                jVar.q(list2.size(), new n(bVar2, list2, 3), new u0(25, list2), new androidx.compose.runtime.internal.f(true, 2039820996, new p(list2, this.z, this.A)));
                break;
        }
        return y.a;
    }

    public /* synthetic */ e(List list, kotlin.jvm.functions.l lVar, b2 b2Var) {
        this.y = list;
        this.z = lVar;
        this.A = b2Var;
    }
}
