package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.h1;
import kotlinx.serialization.internal.k1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final Set a = kotlin.collections.o.D(new kotlinx.serialization.descriptors.e[]{e1.b, h1.b, b1.b, k1.b});

    public static final boolean a(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        return eVar.isInline() && a.contains(eVar);
    }
}
