package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum h0 implements k1 {
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_UNKNOWN(0),
    IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE(1),
    IAB_TCF_PURPOSE_SELECT_BASIC_ADS(2),
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE(3),
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS(4),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE(5),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT(6),
    IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE(7),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE(8),
    IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS(9),
    IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS(10),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT(11),
    UNRECOGNIZED(-1);

    public final int e;

    h0(int i) {
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
