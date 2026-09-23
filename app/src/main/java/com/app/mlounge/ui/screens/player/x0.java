package com.app.mlounge.ui.screens.player;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(a1 a1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new x0(this.z, dVar, 0);
            case 1:
                return new x0(this.z, dVar, 1);
            case 2:
                return new x0(this.z, dVar, 2);
            default:
                return new x0(this.z, dVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                return ((x0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((x0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((x0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
            default:
                ((x0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00eb -> B:12:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:33:0x00bc
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.player.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
