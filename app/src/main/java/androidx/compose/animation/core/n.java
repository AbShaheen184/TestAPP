package androidx.compose.animation.core;

import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements w2 {
    public long A;
    public long B;
    public boolean C;
    public final l2 e;
    public final androidx.compose.runtime.j1 y;
    public s z;

    public n(l2 l2Var, Object obj, s sVar, long j, long j2, boolean z) {
        s sVarG;
        this.e = l2Var;
        this.y = androidx.compose.runtime.t.r(obj);
        if (sVar != null) {
            sVarG = e.g(sVar);
        } else {
            sVarG = (s) l2Var.a.invoke(obj);
            sVarG.d();
        }
        this.z = sVarG;
        this.A = j;
        this.B = j2;
        this.C = z;
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return this.y.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.y.getValue() + ", velocity=" + this.e.b.invoke(this.z) + ", isRunning=" + this.C + ", lastFrameTimeNanos=" + this.A + ", finishedTimeNanos=" + this.B + ')';
    }

    public /* synthetic */ n(l2 l2Var, Object obj, s sVar, int i) {
        this(l2Var, obj, (i & 4) != 0 ? null : sVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
