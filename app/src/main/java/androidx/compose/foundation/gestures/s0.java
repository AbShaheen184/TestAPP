package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public Object y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(kotlin.coroutines.j jVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 0;
        this.A = jVar;
        this.B = (kotlin.coroutines.jvm.internal.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.h, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                s0 s0Var = new s0((kotlin.coroutines.j) this.A, (kotlin.jvm.functions.p) this.B, dVar);
                s0Var.y = obj;
                return s0Var;
            case 1:
                s0 s0Var2 = new s0((androidx.activity.w) this.B, dVar, 1);
                s0Var2.A = obj;
                return s0Var2;
            case 2:
                s0 s0Var3 = new s0((androidx.compose.ui.input.pointer.n) this.A, (kotlin.jvm.internal.z) this.B, dVar);
                s0Var3.y = obj;
                return s0Var3;
            default:
                s0 s0Var4 = new s0((androidx.compose.foundation.text.x0) this.B, dVar, 3);
                s0Var4.y = obj;
                return s0Var4;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((s0) create((androidx.compose.ui.input.pointer.k0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((s0) create((kotlin.sequences.j) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((s0) create((androidx.compose.ui.input.pointer.k0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((s0) create((androidx.compose.ui.input.pointer.k0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01db A[Catch: CancellationException -> 0x01c2, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01c2, blocks: (B:100:0x01db, B:103:0x01ea, B:89:0x01be, B:94:0x01c9), top: B:114:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.coroutines.jvm.internal.h, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01f2 -> B:98:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0203 -> B:98:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:18:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0125 -> B:58:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x018e -> B:78:0x018f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(androidx.compose.ui.input.pointer.n nVar, kotlin.jvm.internal.z zVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 2;
        this.A = nVar;
        this.B = zVar;
    }
}
