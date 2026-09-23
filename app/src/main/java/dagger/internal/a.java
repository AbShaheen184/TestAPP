package dagger.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    public e a;

    @Override // javax.inject.a
    public final Object get() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.get();
        }
        org.mozilla.javascript.c.a();
        return null;
    }
}
