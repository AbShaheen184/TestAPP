package kotlinx.coroutines.time;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectBuilder;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TimeKt {
    private static final long coerceToMillis(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Duration duration) {
        return FlowKt.debounce(flow, coerceToMillis(duration));
    }

    public static final Object delay(Duration duration, d<? super y> dVar) {
        Object objDelay = DelayKt.delay(coerceToMillis(duration), dVar);
        return objDelay == a.e ? objDelay : y.a;
    }

    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, Duration duration, l lVar) {
        OnTimeoutKt.onTimeout(selectBuilder, coerceToMillis(duration), lVar);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, Duration duration) {
        return FlowKt.sample(flow, coerceToMillis(duration));
    }

    public static final <T> Object withTimeout(Duration duration, p pVar, d<? super T> dVar) {
        return TimeoutKt.withTimeout(coerceToMillis(duration), pVar, dVar);
    }

    public static final <T> Object withTimeoutOrNull(Duration duration, p pVar, d<? super T> dVar) {
        return TimeoutKt.withTimeoutOrNull(coerceToMillis(duration), pVar, dVar);
    }
}
