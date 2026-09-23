package kotlinx.serialization.json;

import kotlin.jvm.internal.a0;
import kotlinx.serialization.internal.h1;
import kotlinx.serialization.internal.s0;
import kotlinx.serialization.internal.t0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements kotlinx.serialization.a {
    public static final n a = new n();
    public static final s0 b;

    static {
        kotlinx.serialization.descriptors.d dVar = kotlinx.serialization.descriptors.d.j;
        if (kotlin.text.k.J("kotlinx.serialization.json.JsonLiteral")) {
            kotlinx.coroutines.future.a.q("Blank serial names are prohibited");
            return;
        }
        Object it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.h) t0.a.values()).iterator();
        while (((androidx.emoji2.text.flatbuffer.c) it).hasNext()) {
            kotlinx.serialization.a aVar = (kotlinx.serialization.a) ((kotlin.collections.builders.d) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.d().a())) {
                kotlinx.coroutines.future.a.q(kotlin.text.l.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + a0.a(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new s0("kotlinx.serialization.json.JsonLiteral", dVar);
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        i iVarK = kotlin.comparisons.a.b(bVar).K();
        if (iVarK instanceof m) {
            return (m) iVarK;
        }
        throw kotlinx.serialization.json.internal.i.b(-1, iVarK.toString(), "Unexpected JSON element, expected JsonLiteral, had " + a0.a(iVarK.getClass()));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        Boolean bool;
        m mVar = (m) obj;
        mVar.getClass();
        String str = mVar.y;
        kotlin.comparisons.a.a(nVar);
        if (mVar.e) {
            nVar.r(str);
            return;
        }
        Long lX = kotlin.text.r.x(str);
        if (lX != null) {
            nVar.k(lX.longValue());
            return;
        }
        kotlin.t tVarG = kotlin.enums.b.g(str);
        if (tVarG != null) {
            nVar.h(h1.b).k(tVarG.e);
            return;
        }
        Double dM = kotlin.text.q.m(str);
        if (dM != null) {
            nVar.e(dM.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            nVar.b(bool.booleanValue());
        } else {
            nVar.r(str);
        }
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
