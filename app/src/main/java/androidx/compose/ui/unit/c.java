package androidx.compose.ui.unit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default long H(float f) {
        return n(P(f));
    }

    default float M(int i) {
        return i / a();
    }

    default float P(float f) {
        return f / a();
    }

    float U();

    default float W(float f) {
        return a() * f;
    }

    float a();

    default int f0(long j) {
        return Math.round(t0(j));
    }

    default int i0(float f) {
        float fW = W(f);
        if (Float.isInfinite(fW)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fW);
    }

    default long m0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fW = W(h.b(j));
        return (((long) Float.floatToRawIntBits(W(h.a(j)))) & 4294967295L) | (Float.floatToRawIntBits(fW) << 32);
    }

    default long n(float f) {
        float[] fArr = androidx.compose.ui.unit.fontscaling.b.a;
        if (U() < 1.03f) {
            return coil3.svg.internal.a.H(f / U(), 4294967296L);
        }
        androidx.compose.ui.unit.fontscaling.a aVarA = androidx.compose.ui.unit.fontscaling.b.a(U());
        return coil3.svg.internal.a.H(aVarA != null ? aVarA.a(f) : f / U(), 4294967296L);
    }

    default long o(long j) {
        if (j != 9205357640488583168L) {
            return android.support.v4.media.session.b.b(P(Float.intBitsToFloat((int) (j >> 32))), P(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float t(long j) {
        float fC;
        float fU;
        if (!p.a(o.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = androidx.compose.ui.unit.fontscaling.b.a;
        if (U() >= 1.03f) {
            androidx.compose.ui.unit.fontscaling.a aVarA = androidx.compose.ui.unit.fontscaling.b.a(U());
            fC = o.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fU = U();
        } else {
            fC = o.c(j);
            fU = U();
        }
        return fU * fC;
    }

    default float t0(long j) {
        if (!p.a(o.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return W(t(j));
    }
}
