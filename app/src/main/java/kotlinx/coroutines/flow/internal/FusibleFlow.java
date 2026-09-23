package kotlinx.coroutines.flow.internal;

import com.google.firebase.platforminfo.b;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface FusibleFlow<T> extends Flow<T> {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow fuse$default(FusibleFlow fusibleFlow, j jVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj != null) {
                b.n("Super calls with default arguments not supported in this target, function: fuse");
                return null;
            }
            if ((i2 & 1) != 0) {
                jVar = k.e;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return fusibleFlow.fuse(jVar, i, bufferOverflow);
        }
    }

    Flow<T> fuse(j jVar, int i, BufferOverflow bufferOverflow);
}
