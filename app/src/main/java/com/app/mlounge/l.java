package com.app.mlounge;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity y;
    public final /* synthetic */ SharedPreferences z;

    public /* synthetic */ l(MainActivity mainActivity, SharedPreferences sharedPreferences, int i) {
        this.e = i;
        this.y = mainActivity;
        this.z = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0218  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v9 java.lang.Object, still in use, count: 2, list:
          (r7v9 java.lang.Object) from 0x01e9: PHI (r7 I:??) = (r7v4 java.lang.Object), (r7v9 java.lang.Object) binds: [B:55:0x01e8, B:73:0x01e9] A[DONT_GENERATE, DONT_INLINE]
          (r7v9 java.lang.Object) from 0x01d5: CHECK_CAST (com.app.mlounge.ui.theme.a) (r7v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.p
    public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.l.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
