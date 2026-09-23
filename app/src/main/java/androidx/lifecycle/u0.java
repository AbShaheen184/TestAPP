package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface u0 {
    default s0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default s0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        return a(cls);
    }

    default s0 c(kotlin.jvm.internal.e eVar, androidx.lifecycle.viewmodel.e eVar2) {
        Class clsA = eVar.a();
        clsA.getClass();
        return b(clsA, eVar2);
    }
}
