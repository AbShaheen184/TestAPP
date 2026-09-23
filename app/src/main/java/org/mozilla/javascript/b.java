package org.mozilla.javascript;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return CodeGenerator.lambda$visitObjectLiteral$0(obj);
            default:
                return NativeProxy.lambda$getIds$0(obj);
        }
    }
}
