package kotlinx.coroutines.channels;

import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@ObsoleteCoroutinesApi
public enum TickerMode {
    FIXED_PERIOD,
    FIXED_DELAY;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.b.a(values());

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }
}
