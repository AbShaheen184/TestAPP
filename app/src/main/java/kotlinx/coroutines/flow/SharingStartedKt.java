package kotlinx.coroutines.flow;

import kotlin.time.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SharingStartedKt {
    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m73WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j, long j2) {
        return new StartedWhileSubscribed(kotlin.time.a.f(j), kotlin.time.a.f(j2));
    }

    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static SharingStarted m74WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            g gVar = kotlin.time.a.y;
            j = 0;
        }
        if ((i & 2) != 0) {
            g gVar2 = kotlin.time.a.y;
            j2 = kotlin.time.a.z;
        }
        return m73WhileSubscribed5qebJ5I(companion, j, j2);
    }
}
