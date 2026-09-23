package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends CancellationException {
    public e() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(i.b);
        return this;
    }
}
