package kotlinx.serialization.json;

import androidx.media3.common.util.l0;
import com.google.android.gms.measurement.internal.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b d = new b();
    public final l0 a = new l0();
    public final z b = kotlinx.serialization.modules.a.a;
    public final com.google.android.material.behavior.d c = new com.google.android.material.behavior.d(11, false);

    public final Object a(String str, kotlinx.serialization.a aVar) {
        aVar.getClass();
        this.a.getClass();
        androidx.fragment.app.h hVar = new androidx.fragment.app.h(str);
        Object objP = new kotlinx.serialization.json.internal.m(this, kotlinx.serialization.json.internal.q.OBJ, hVar, aVar.d()).p(aVar);
        if (hVar.h() == 10) {
            return objP;
        }
        androidx.fragment.app.h.x(hVar, "Expected EOF after parsing, but had " + str.charAt(hVar.y - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(kotlinx.serialization.a aVar, Object obj) {
        char[] cArr;
        aVar.getClass();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l((char) 0, 12);
        kotlinx.serialization.json.internal.b bVar = kotlinx.serialization.json.internal.b.c;
        synchronized (bVar) {
            kotlin.collections.l lVar2 = bVar.a;
            cArr = null;
            char[] cArr2 = (char[]) (lVar2.isEmpty() ? null : lVar2.removeLast());
            if (cArr2 != null) {
                bVar.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        lVar.z = cArr;
        try {
            kotlinx.serialization.json.internal.q qVar = kotlinx.serialization.json.internal.q.OBJ;
            kotlinx.serialization.json.internal.n[] nVarArr = new kotlinx.serialization.json.internal.n[kotlinx.serialization.json.internal.q.E.b()];
            this.a.getClass();
            new kotlinx.serialization.json.internal.n(new androidx.core.text.f(lVar), this, qVar, nVarArr).p(aVar, obj);
            return lVar.toString();
        } finally {
            lVar.m();
        }
    }
}
