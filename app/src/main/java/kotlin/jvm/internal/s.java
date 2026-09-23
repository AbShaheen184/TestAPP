package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class s extends u implements kotlin.reflect.i {
    public s(Class cls, String str, String str2, int i) {
        super(c.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.c
    public final kotlin.reflect.b computeReflected() {
        a0.a.getClass();
        return this;
    }

    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    @Override // kotlin.reflect.i
    public final void getGetter() {
        ((kotlin.reflect.i) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
