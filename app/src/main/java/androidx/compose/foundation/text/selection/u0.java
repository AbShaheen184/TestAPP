package androidx.compose.foundation.text.selection;

import androidx.compose.material3.l6;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, kotlin.coroutines.d dVar, int i) {
        super(1, dVar);
        this.e = i;
        this.z = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new u0((b1) this.z, dVar, 0);
            case 1:
                return new u0((l6) this.z, dVar, 1);
            case 2:
                return new u0((androidx.datastore.migrations.c) this.z, dVar, 2);
            case 3:
                return new u0((androidx.datastore.core.w) this.z, dVar, 3);
            default:
                return new u0((com.app.mlounge.ui.screens.player.a1) this.z, dVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((u0) create(dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0169, code lost:
    
        if (r15 == r3) goto L86;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
