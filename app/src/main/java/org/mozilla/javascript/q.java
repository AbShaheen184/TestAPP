package org.mozilla.javascript;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Scriptable b;

    public /* synthetic */ q(Scriptable scriptable, int i) {
        this.a = i;
        this.b = scriptable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((NativeError) this.b).setStackDelegated(obj);
                break;
            default:
                ScriptRuntime.lambda$evalSpecial$0(this.b, (CompilerEnvirons) obj);
                break;
        }
    }
}
