package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements kotlinx.serialization.a {
    public static final r a = new r();
    public static final s0 b = new s0("kotlin.time.Duration", kotlinx.serialization.descriptors.d.j);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlin.time.g gVar = kotlin.time.a.y;
        String strM = bVar.m();
        strM.getClass();
        try {
            long jG = dagger.hilt.android.internal.a.g(strM);
            if (jG == kotlin.time.a.B) {
                throw new IllegalStateException("invariant failed");
            }
            return new kotlin.time.a(jG);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(androidx.privacysandbox.ads.adservices.java.internal.a.r("Invalid ISO duration string format: '", strM, "'."), e);
        }
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        long j = ((kotlin.time.a) obj).e;
        kotlin.time.g gVar = kotlin.time.a.y;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jL = j < 0 ? kotlin.time.a.l(j) : j;
        long j2 = kotlin.time.a.j(jL, kotlin.time.c.HOURS);
        boolean z = false;
        int iJ = kotlin.time.a.h(jL) ? 0 : (int) (kotlin.time.a.j(jL, kotlin.time.c.MINUTES) % ((long) 60));
        int iJ2 = kotlin.time.a.h(jL) ? 0 : (int) (kotlin.time.a.j(jL, kotlin.time.c.SECONDS) % ((long) 60));
        int iG = kotlin.time.a.g(jL);
        if (kotlin.time.a.h(j)) {
            j2 = 9999999999999L;
        }
        boolean z2 = j2 != 0;
        boolean z3 = (iJ2 == 0 && iG == 0) ? false : true;
        if (iJ != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j2);
            sb.append('H');
        }
        if (z) {
            sb.append(iJ);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            kotlin.time.a.d(sb, iJ2, iG, 9, "S", true);
        }
        nVar.r(sb.toString());
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
