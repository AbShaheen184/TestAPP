package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Constructable {
    public final /* synthetic */ int e;

    public /* synthetic */ g0(int i) {
        this.e = i;
    }

    @Override // org.mozilla.javascript.Constructable
    public final Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativeProxy.constructor(context, scriptable, objArr);
            case 1:
                return NativePromise.constructor(context, scriptable, objArr);
            default:
                return NativeSymbol.js_constructor(context, scriptable, objArr);
        }
    }
}
