package kotlinx.coroutines.stream;

import java.util.stream.Stream;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class StreamKt {
    public static final <T> Flow<T> consumeAsFlow(Stream<T> stream) {
        return new StreamFlow(stream);
    }
}
