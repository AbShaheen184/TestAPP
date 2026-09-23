package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class v0 implements u0 {
    public static v0 a;

    @Override // androidx.lifecycle.u0
    public s0 a(Class cls) {
        return android.support.v4.media.session.b.j(cls);
    }

    @Override // androidx.lifecycle.u0
    public s0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        return a(cls);
    }

    @Override // androidx.lifecycle.u0
    public final s0 c(kotlin.jvm.internal.e eVar, androidx.lifecycle.viewmodel.e eVar2) {
        Class clsA = eVar.a();
        clsA.getClass();
        return b(clsA, eVar2);
    }
}
