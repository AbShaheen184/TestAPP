package androidx.datastore.core;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.coroutines.jvm.internal.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ r0 C;
    public int D;
    public Mutex e;
    public FileInputStream y;
    public FileLock z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.C = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, this);
    }
}
