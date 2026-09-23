package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Callable {
    public final /* synthetic */ int e;

    public /* synthetic */ h0(int i) {
        this.e = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativeSymbol.js_keyFor(context, scriptable, scriptable2, objArr);
            case 1:
                return NativeSymbol.js_toString(context, scriptable, scriptable2, objArr);
            case 2:
                return NativeSymbol.js_valueOf(context, scriptable, scriptable2, objArr);
            default:
                return ScriptRuntimeES6.lambda$addSymbolSpecies$0(context, scriptable, scriptable2, objArr);
        }
    }
}
