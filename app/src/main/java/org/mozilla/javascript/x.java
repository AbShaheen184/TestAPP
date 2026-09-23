package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ Scriptable A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ NativePromise.Reaction y;
    public final /* synthetic */ Context z;

    public /* synthetic */ x(NativePromise.Reaction reaction, Context context, Scriptable scriptable, Object obj, int i) {
        this.e = i;
        this.y = reaction;
        this.z = context;
        this.A = scriptable;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.invoke(this.z, this.A, this.B);
                break;
            default:
                this.y.invoke(this.z, this.A, this.B);
                break;
        }
    }
}
