package org.mozilla.javascript;

import java.io.Serializable;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ r(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((NativeError.ProtoProps) this.b).getStackTraceLimit();
            case 1:
                return ((NativeError.ProtoProps) this.b).getPrepareStackTrace();
            default:
                return ((NativeError) this.b).getStackDelegated();
        }
    }
}
