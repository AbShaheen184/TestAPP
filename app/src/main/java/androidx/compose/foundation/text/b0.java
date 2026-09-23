package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements PointerInputEventHandler {
    public final /* synthetic */ x0 a;
    public final /* synthetic */ androidx.compose.foundation.text.selection.b1 b;

    public b0(x0 x0Var, androidx.compose.foundation.text.selection.b1 b1Var) {
        this.a = x0Var;
        this.b = b1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a0(yVar, this.a, this.b, (kotlin.coroutines.d) null, 0), dVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : kotlin.y.a;
    }
}
