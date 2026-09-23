package androidx.compose.animation.core;

import androidx.compose.material3.c6;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.app.mlounge.CinemaHQApp;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 10;
        this.z = (kotlin.coroutines.jvm.internal.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.l] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c1((h1) this.z, dVar, 0);
            case 1:
                return new c1((androidx.compose.foundation.l0) this.z, dVar, 1);
            case 2:
                return new c1((androidx.compose.foundation.n0) this.z, dVar, 2);
            case 3:
                return new c1((androidx.compose.foundation.u0) this.z, dVar, 3);
            case 4:
                return new c1((androidx.compose.foundation.h1) this.z, dVar, 4);
            case 5:
                return new c1((androidx.compose.foundation.gestures.n1) this.z, dVar, 5);
            case 6:
                return new c1((androidx.compose.foundation.lazy.y) this.z, this.y, dVar, 6);
            case 7:
                return new c1((androidx.compose.foundation.lazy.grid.x) this.z, this.y, dVar, 7);
            case 8:
                return new c1((androidx.compose.foundation.lazy.layout.o0) this.z, dVar, 8);
            case 9:
                return new c1((androidx.compose.foundation.text.input.internal.l) this.z, dVar, 9);
            case 10:
                return new c1((kotlin.coroutines.jvm.internal.i) this.z, dVar);
            case 11:
                return new c1((androidx.compose.material3.t2) this.z, dVar, 11);
            case 12:
                return new c1((d) this.z, dVar, 12);
            case 13:
                return new c1((c6) this.z, dVar, 13);
            case 14:
                return new c1((androidx.compose.foundation.text.selection.u0) this.z, dVar, 14);
            case 15:
                return new c1((androidx.compose.ui.input.pointer.l0) this.z, dVar, 15);
            case 16:
                return new c1((androidx.privacysandbox.ads.adservices.java.measurement.a) this.z, dVar, 16);
            case 17:
                return new c1((androidx.room.f) this.z, dVar, 17);
            case 18:
                return new c1((androidx.room.k0) this.z, dVar, 18);
            case 19:
                return new c1((CompletableDeferred) this.z, dVar, 19);
            case 20:
                return new c1((ConstraintTrackingWorker) this.z, dVar, 20);
            case 21:
                return new c1((CinemaHQApp) this.z, dVar, 21);
            case 22:
                return new c1((com.app.mlounge.data.download.h) this.z, dVar, 22);
            case 23:
                return new c1((com.app.mlounge.ui.viewmodel.k0) this.z, this.y, dVar, 23);
            case 24:
                return new c1((com.i4studio.subslib.model.a) this.z, dVar, 24);
            case 25:
                return new c1((com.app.mlounge.ui.viewmodel.k) this.z, dVar, 25);
            case 26:
                return new c1((com.app.mlounge.ui.viewmodel.s) this.z, dVar, 26);
            case 27:
                return new c1((com.appsalt.internal.f) this.z, dVar, 27);
            case 28:
                return new c1((com.google.firebase.messaging.n) this.z, dVar, 28);
            default:
                return new c1((com.google.firebase.messaging.n) this.z, dVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 5:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                c1 c1Var = (c1) create((androidx.compose.foundation.gestures.t1) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                c1Var.invokeSuspend(yVar);
                return yVar;
            case 7:
                c1 c1Var2 = (c1) create((androidx.compose.foundation.gestures.t1) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                c1Var2.invokeSuspend(yVar2);
                return yVar2;
            case 8:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 12:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 17:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 19:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 21:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 22:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                c1 c1Var3 = (c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar3 = kotlin.y.a;
                c1Var3.invokeSuspend(yVar3);
                return yVar3;
            case 24:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 25:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 26:
                return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 27:
                return new c1((com.appsalt.internal.f) this.z, (kotlin.coroutines.d) obj2, 27).invokeSuspend(kotlin.y.a);
            case 28:
                return new c1((com.google.firebase.messaging.n) this.z, (kotlin.coroutines.d) obj2, 28).invokeSuspend(kotlin.y.a);
            default:
                return new c1((com.google.firebase.messaging.n) this.z, (kotlin.coroutines.d) obj2, 29).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:317:0x0522  */
    /* JADX WARN: Code duplicated, block: B:319:0x0526  */
    /* JADX WARN: Code duplicated, block: B:322:0x052f  */
    /* JADX WARN: Code duplicated, block: B:324:0x0533  */
    /* JADX WARN: Type inference failed for: r2v31, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:323:0x0531 -> B:317:0x0522). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:325:0x054d -> B:328:0x0551). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Object obj, int i, kotlin.coroutines.d dVar, int i2) {
        super(2, dVar);
        this.e = i2;
        this.z = obj;
        this.y = i;
    }
}
