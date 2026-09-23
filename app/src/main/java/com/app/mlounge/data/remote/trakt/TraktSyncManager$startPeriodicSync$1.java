package com.app.mlounge.data.remote.trakt;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.trakt.TraktSyncManager$startPeriodicSync$1", f = "TraktSyncManager.kt", l = {Token.SETPROP, Token.GETELEM, Token.SETELEM_SUPER, Token.NAME, Token.THIS, Token.ENUM_INIT_VALUES}, m = "invokeSuspend", v = 2)
final class TraktSyncManager$startPeriodicSync$1 extends i implements p {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ TraktSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraktSyncManager$startPeriodicSync$1(TraktSyncManager traktSyncManager, d dVar) {
        super(2, dVar);
        this.this$0 = traktSyncManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        TraktSyncManager$startPeriodicSync$1 traktSyncManager$startPeriodicSync$1 = new TraktSyncManager$startPeriodicSync$1(this.this$0, dVar);
        traktSyncManager$startPeriodicSync$1.L$0 = obj;
        return traktSyncManager$startPeriodicSync$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TraktSyncManager$startPeriodicSync$1) create((CoroutineScope) obj, (d) obj2)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: Exception -> 0x0020, TRY_ENTER, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: Exception -> 0x0020, PHI: r12
  0x0082: PHI (r12v6 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:28:0x007e, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: Exception -> 0x0020, TRY_ENTER, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: Exception -> 0x0020, PHI: r12
  0x00a2: PHI (r12v2 java.lang.Object) = (r12v10 java.lang.Object), (r12v0 java.lang.Object) binds: [B:35:0x009e, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:72:0x0153, B:27:0x006f, B:30:0x0082, B:33:0x008c, B:34:0x0091, B:37:0x00a2, B:40:0x00a8, B:42:0x00b4, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00d2, B:54:0x00e6, B:56:0x00ec, B:58:0x00f6, B:60:0x0102, B:62:0x0108, B:69:0x011a, B:10:0x0023, B:11:0x0028), top: B:76:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a7 -> B:22:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0118 -> B:22:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0150 -> B:72:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x015a -> B:22:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktSyncManager$startPeriodicSync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
