package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements kotlin.sequences.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(kotlin.jvm.functions.p pVar) {
        this.a = 1;
        this.b = (kotlin.coroutines.jvm.internal.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.coroutines.jvm.internal.h, kotlin.jvm.functions.p] */
    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.b).iterator();
            case 1:
                return kotlin.collections.builders.c.I((kotlin.coroutines.jvm.internal.h) this.b);
            case 2:
                return (Iterator) this.b;
            default:
                return new kotlin.text.e((CharSequence) this.b);
        }
    }

    public /* synthetic */ u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
