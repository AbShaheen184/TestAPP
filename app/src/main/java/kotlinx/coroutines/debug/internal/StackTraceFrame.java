package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class StackTraceFrame implements d {
    private final d callerFrame;
    private final StackTraceElement stackTraceElement;

    public StackTraceFrame(d dVar, StackTraceElement stackTraceElement) {
        this.callerFrame = dVar;
        this.stackTraceElement = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public d getCallerFrame() {
        return this.callerFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
