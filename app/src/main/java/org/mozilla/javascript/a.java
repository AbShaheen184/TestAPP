package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Function {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractEcmaObjectOperations.lambda$groupBy$0(obj);
            case 1:
                return NativeConsole.lambda$count$0((String) obj);
            default:
                return NativeSymbol.js_description((Scriptable) obj);
        }
    }
}
