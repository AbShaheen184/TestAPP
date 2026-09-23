package kotlinx.coroutines.selects;

import kotlin.jvm.functions.l;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class OnTimeoutKt {
    @ExperimentalCoroutinesApi
    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j, l lVar) {
        selectBuilder.invoke(new OnTimeout(j).getSelectClause(), lVar);
    }

    @ExperimentalCoroutinesApi
    /* JADX INFO: renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m98onTimeout8Mi8wO0(SelectBuilder<? super R> selectBuilder, long j, l lVar) {
        onTimeout(selectBuilder, DelayKt.m18toDelayMillisLRDsOJo(j), lVar);
    }
}
