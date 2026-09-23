package com.appsalt.internal;

import java.io.InputStream;
import java.net.Socket;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public byte[] A;
    public byte[] B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ l0 E;
    public final /* synthetic */ Socket F;
    public final /* synthetic */ l0 G;
    public l0 e;
    public CoroutineScope y;
    public InputStream z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, Socket socket, l0 l0Var2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.E = l0Var;
        this.F = socket;
        this.G = l0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        i0 i0Var = new i0(this.E, this.F, this.G, dVar);
        i0Var.D = obj;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:27:0x0071, B:29:0x0077, B:31:0x0085, B:35:0x00a1, B:38:0x00b2, B:42:0x00d5, B:18:0x004b, B:19:0x0050, B:22:0x0058, B:25:0x0066), top: B:63:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:27:0x0071, B:29:0x0077, B:31:0x0085, B:35:0x00a1, B:38:0x00b2, B:42:0x00d5, B:18:0x004b, B:19:0x0050, B:22:0x0058, B:25:0x0066), top: B:63:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0036, B:27:0x0071, B:29:0x0077, B:31:0x0085, B:35:0x00a1, B:38:0x00b2, B:42:0x00d5, B:18:0x004b, B:19:0x0050, B:22:0x0058, B:25:0x0066), top: B:63:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Type inference failed for: r12v11, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r12v13, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ee -> B:27:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
