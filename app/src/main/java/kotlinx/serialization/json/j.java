package kotlinx.serialization.json;

import kotlin.jvm.internal.a0;
import kotlinx.serialization.internal.m0;
import kotlinx.serialization.internal.y0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final kotlinx.serialization.internal.x a = m0.a("kotlinx.serialization.json.JsonUnquotedLiteral", y0.a);

    public static final w a(i iVar) {
        w wVar = iVar instanceof w ? (w) iVar : null;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException("Element " + a0.a(iVar.getClass()) + " is not a JsonPrimitive");
    }
}
