package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.internal.z;
import kotlin.r;
import kotlin.t;
import kotlin.w;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.collections.builders.c {
    public final androidx.fragment.app.h a;
    public final z b;

    public f(androidx.fragment.app.h hVar, kotlinx.serialization.json.b bVar) {
        bVar.getClass();
        this.a = hVar;
        this.b = bVar.b;
    }

    @Override // kotlin.collections.builders.c, kotlinx.serialization.encoding.b
    public final int j() {
        androidx.fragment.app.h hVar = this.a;
        String strM = hVar.m();
        try {
            strM.getClass();
            r rVarF = kotlin.enums.b.f(strM);
            if (rVarF != null) {
                return rVarF.e;
            }
            kotlin.text.r.p(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.m('\'', "Failed to parse type 'UInt' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a
    public final z l() {
        return this.b;
    }

    @Override // kotlin.collections.builders.c, kotlinx.serialization.encoding.b
    public final long o() {
        androidx.fragment.app.h hVar = this.a;
        String strM = hVar.m();
        try {
            strM.getClass();
            t tVarG = kotlin.enums.b.g(strM);
            if (tVarG != null) {
                return tVarG.e;
            }
            kotlin.text.r.p(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.m('\'', "Failed to parse type 'ULong' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a
    public final int s(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlin.collections.builders.c, kotlinx.serialization.encoding.b
    public final byte y() {
        kotlin.p pVar;
        androidx.fragment.app.h hVar = this.a;
        String strM = hVar.m();
        try {
            strM.getClass();
            r rVarF = kotlin.enums.b.f(strM);
            if (rVarF != null) {
                int i = rVarF.e;
                pVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new kotlin.p((byte) i);
            }
            if (pVar != null) {
                return pVar.e;
            }
            kotlin.text.r.p(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.m('\'', "Failed to parse type 'UByte' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlin.collections.builders.c, kotlinx.serialization.encoding.b
    public final short z() {
        w wVar;
        androidx.fragment.app.h hVar = this.a;
        String strM = hVar.m();
        try {
            strM.getClass();
            r rVarF = kotlin.enums.b.f(strM);
            if (rVarF != null) {
                int i = rVarF.e;
                wVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new w((short) i);
            }
            if (wVar != null) {
                return wVar.e;
            }
            kotlin.text.r.p(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            androidx.fragment.app.h.x(hVar, androidx.privacysandbox.ads.adservices.java.internal.a.m('\'', "Failed to parse type 'UShort' for input '", strM), 0, null, 6);
            throw null;
        }
    }
}
