package androidx.compose.material3.internal;

import androidx.compose.material3.j6;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ CoroutineScope C;
    public final /* synthetic */ j6 D;
    public MutableStateFlow e;
    public androidx.compose.ui.input.pointer.n y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CoroutineScope coroutineScope, j6 j6Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = coroutineScope;
        this.D = j6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        u uVar = new u(this.C, this.D, dVar);
        uVar.B = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((androidx.compose.ui.input.pointer.k0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r14 == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.MutableSharedFlow] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
