package org.mozilla.javascript;

import java.lang.reflect.Method;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return JavaMembers.getMoreConcreteMethod((Method) obj, (Method) obj2);
    }
}
