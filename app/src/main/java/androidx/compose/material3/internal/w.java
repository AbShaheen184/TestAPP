package androidx.compose.material3.internal;

import androidx.compose.material3.j6;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;

    public /* synthetic */ w(j6 j6Var, int i) {
        this.a = i;
        this.b = j6Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        switch (this.a) {
            case 0:
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new v(yVar, this.b, null, 0), dVar);
                return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : kotlin.y.a;
            default:
                Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new v(yVar, this.b, null, 1), dVar);
                return objCoroutineScope2 == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope2 : kotlin.y.a;
        }
    }
}
