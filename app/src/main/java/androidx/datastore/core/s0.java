package androidx.datastore.core;

import java.util.LinkedHashMap;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements DisposableHandle {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.e) {
            case 0:
                String str = (String) this.y;
                androidx.compose.material3.internal.r0 r0Var = (androidx.compose.material3.internal.r0) this.z;
                synchronized (t0.b) {
                    LinkedHashMap linkedHashMap = t0.c;
                    t0 t0Var = (t0) linkedHashMap.get(str);
                    if (t0Var != null) {
                        t0Var.a.remove(r0Var);
                        if (t0Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            t0Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
            default:
                HandlerContext.invokeOnTimeout$lambda$3((HandlerContext) this.y, (Runnable) this.z);
                return;
        }
    }
}
