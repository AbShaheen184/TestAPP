package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.c3;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.gestures.s1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements PointerInputEventHandler {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ androidx.compose.runtime.a1 b;
    public final /* synthetic */ androidx.compose.foundation.interaction.k c;
    public final /* synthetic */ androidx.compose.runtime.a1 d;

    public e1(CoroutineScope coroutineScope, androidx.compose.runtime.a1 a1Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.a1 a1Var2) {
        this.a = coroutineScope;
        this.b = a1Var;
        this.c = kVar;
        this.d = a1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        d1 d1Var = new d1(this.a, this.b, this.c, null);
        m2 m2Var = new m2(this.d, 1);
        androidx.compose.foundation.gestures.n0 n0Var = c3.a;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.z0(yVar, d1Var, m2Var, new s1(yVar), null), dVar);
        kotlin.y yVar2 = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objCoroutineScope != aVar) {
            objCoroutineScope = yVar2;
        }
        return objCoroutineScope == aVar ? objCoroutineScope : yVar2;
    }
}
