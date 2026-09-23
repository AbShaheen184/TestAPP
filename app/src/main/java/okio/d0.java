package okio;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public static final c0 a = new c0(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(c0 c0Var) {
        c0Var.getClass();
        if (c0Var.f != null || c0Var.g != null) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            return;
        }
        if (c0Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        c0 c0Var2 = a;
        c0 c0Var3 = (c0) atomicReference.getAndSet(c0Var2);
        if (c0Var3 == c0Var2) {
            return;
        }
        int i = c0Var3 != null ? c0Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(c0Var3);
            return;
        }
        c0Var.f = c0Var3;
        c0Var.b = 0;
        c0Var.c = i + 8192;
        atomicReference.set(c0Var);
    }

    public static final c0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        c0 c0Var = a;
        c0 c0Var2 = (c0) atomicReference.getAndSet(c0Var);
        if (c0Var2 == c0Var) {
            return new c0();
        }
        if (c0Var2 == null) {
            atomicReference.set(null);
            return new c0();
        }
        atomicReference.set(c0Var2.f);
        c0Var2.f = null;
        c0Var2.c = 0;
        return c0Var2;
    }
}
