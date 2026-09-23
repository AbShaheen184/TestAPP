package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum i0 implements k1 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    public final int e;

    i0(int i) {
        this.e = i;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        kotlinx.coroutines.future.a.q("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
