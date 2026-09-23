package androidx.compose.foundation.internal;

import androidx.compose.runtime.internal.k;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends CancellationException {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i) {
        super(str);
        this.e = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.e) {
            case 0:
                setStackTrace(d.a);
                break;
            case 1:
                setStackTrace(k.a);
                break;
            default:
                setStackTrace(androidx.compose.ui.internal.b.a);
                break;
        }
        return this;
    }
}
