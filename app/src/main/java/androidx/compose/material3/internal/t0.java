package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.o implements kotlin.reflect.h {
    @Override // kotlin.jvm.internal.c
    public final kotlin.reflect.b computeReflected() {
        kotlin.jvm.internal.a0.a.getClass();
        return this;
    }

    @Override // kotlin.reflect.h
    public final Object get() {
        return ((androidx.compose.runtime.a1) this.receiver).getValue();
    }

    @Override // kotlin.reflect.h
    public final Object getDelegate() {
        return ((t0) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.h
    /* JADX INFO: renamed from: getGetter */
    public final kotlin.reflect.g mo15getGetter() {
        ((t0) getReflected()).mo15getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return get();
    }
}
