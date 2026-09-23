package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ l0 C;
    public final /* synthetic */ int e = 1;
    public kotlin.jvm.internal.z y;
    public kotlin.jvm.internal.z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.z zVar, l0 l0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = zVar;
        this.C = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                k0 k0Var = new k0(this.z, this.C, dVar);
                k0Var.B = obj;
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.C, dVar);
                k0Var2.B = obj;
                return k0Var2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((k0) create((kotlin.jvm.functions.l) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((k0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[PHI: r5
  0x005b: PHI (r5v7 kotlinx.coroutines.CoroutineScope) = 
  (r5v0 kotlinx.coroutines.CoroutineScope)
  (r5v3 kotlinx.coroutines.CoroutineScope)
  (r5v3 kotlinx.coroutines.CoroutineScope)
  (r5v3 kotlinx.coroutines.CoroutineScope)
  (r5v5 kotlinx.coroutines.CoroutineScope)
  (r5v8 kotlinx.coroutines.CoroutineScope)
 binds: [B:19:0x0053, B:46:0x00ca, B:48:0x00d7, B:42:0x00c3, B:31:0x0087, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:39:0x00b0, B:41:0x00b6, B:45:0x00c8, B:47:0x00cc), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:39:0x00b0, B:41:0x00b6, B:45:0x00c8, B:47:0x00cc), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[Catch: CancellationException -> 0x00c6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:39:0x00b0, B:41:0x00b6, B:45:0x00c8, B:47:0x00cc), top: B:87:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0087 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c3 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ca -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d7 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e5 -> B:12:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x013b -> B:77:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0140 -> B:79:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x006a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = l0Var;
    }
}
