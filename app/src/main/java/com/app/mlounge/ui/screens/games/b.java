package com.app.mlounge.ui.screens.games;

import androidx.compose.runtime.j0;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.ui.viewmodel.r;
import kotlin.jvm.functions.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ r y;

    public /* synthetic */ b(r rVar, int i) {
        this.e = i;
        this.y = rVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((j0) obj).getClass();
                return new androidx.activity.compose.d(this.y, 15);
            case 1:
                GamePlatform gamePlatform = (GamePlatform) obj;
                gamePlatform.getClass();
                this.y.g(gamePlatform);
                return y.a;
            case 2:
                r rVar = this.y;
                rVar.C.setValue((String) obj);
                rVar.f();
                return y.a;
            default:
                r rVar2 = this.y;
                rVar2.E.setValue((String) obj);
                rVar2.f();
                return y.a;
        }
    }
}
