package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ContinuationPending extends RuntimeException {
    private static final long serialVersionUID = 4956008116771118856L;
    private Object applicationState;
    private NativeContinuation continuationState;

    public ContinuationPending(NativeContinuation nativeContinuation) {
        this.continuationState = nativeContinuation;
    }

    public Object getApplicationState() {
        return this.applicationState;
    }

    public Object getContinuation() {
        return this.continuationState;
    }

    public NativeContinuation getContinuationState() {
        return this.continuationState;
    }

    public void setApplicationState(Object obj) {
        this.applicationState = obj;
    }

    public void setContinuation(NativeContinuation nativeContinuation) {
        this.continuationState = nativeContinuation;
    }
}
