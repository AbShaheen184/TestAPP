package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final androidx.compose.foundation.relocation.f a;
    public final CancellableContinuationImpl b;

    public f(androidx.compose.foundation.relocation.f fVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = fVar;
        this.b = cancellableContinuationImpl;
    }

    public final String toString() {
        CancellableContinuationImpl cancellableContinuationImpl = this.b;
        CoroutineName coroutineName = (CoroutineName) cancellableContinuationImpl.getContext().get(CoroutineName.Key);
        String name = coroutineName != null ? coroutineName.getName() : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        kotlin.comparisons.a.c(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(name != null ? androidx.privacysandbox.ads.adservices.java.internal.a.r("[", name, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(cancellableContinuationImpl);
        sb.append(')');
        return sb.toString();
    }
}
