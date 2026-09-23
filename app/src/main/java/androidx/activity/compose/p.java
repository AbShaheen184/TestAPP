package androidx.activity.compose;

import android.net.Uri;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.gestures.k2;
import androidx.compose.foundation.gestures.n1;
import androidx.compose.foundation.gestures.r2;
import androidx.compose.foundation.gestures.s1;
import androidx.compose.foundation.gestures.w;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.j6;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.y1;
import androidx.compose.ui.focus.c0;
import androidx.compose.ui.input.pointer.y;
import androidx.compose.ui.platform.c2;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.window.z;
import androidx.datastore.core.l0;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(TextClassifier textClassifier, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 13;
        this.z = textClassifier;
        this.A = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r1v26, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new p((q) this.A, dVar, 0);
            case 1:
                return new p((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.g) this.A, dVar, 1);
            case 2:
                return new p((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.h) this.A, dVar, 2);
            case 3:
                p pVar = new p((n1) this.A, dVar, 3);
                pVar.z = obj;
                return pVar;
            case 4:
                return new p((r2) this.z, (kotlin.jvm.functions.p) this.A, dVar, 4);
            case 5:
                return new p((w) this.z, (k2) this.A, dVar, 5);
            case 6:
                return new p((Job) this.z, (s1) this.A, dVar, 6);
            case 7:
                return new p((androidx.compose.foundation.interaction.j) this.z, (a1) this.A, dVar, 7);
            case 8:
                return new p((androidx.compose.foundation.relocation.h) this.z, (androidx.compose.foundation.gestures.g) this.A, dVar, 8);
            case 9:
                return new p((y) this.z, (b1) this.A, dVar, 9);
            case 10:
                return new p((androidx.compose.foundation.text.input.internal.c) this.z, (androidx.compose.foundation.text.input.internal.o) this.A, dVar, 10);
            case 11:
                return new p((Job) this.z, (androidx.compose.foundation.text.input.internal.l) this.A, dVar, 11);
            case 12:
                return new p((androidx.compose.foundation.text.input.internal.q) this.z, (androidx.compose.animation.core.f) this.A, dVar, 12);
            case 13:
                return new p((TextClassifier) this.z, (kotlin.jvm.functions.p) this.A, dVar);
            case 14:
                p pVar2 = new p((androidx.compose.material.ripple.a) this.A, dVar, 14);
                pVar2.z = obj;
                return pVar2;
            case 15:
                return new p((androidx.compose.material.ripple.g) this.z, (androidx.compose.animation.core.m) this.A, dVar, 15);
            case 16:
                return new p((c0) this.z, (j6) this.A, dVar, 16);
            case 17:
                return new p((Flow) this.z, (q1) this.A, dVar, 17);
            case 18:
                p pVar3 = new p((o0) this.A, dVar, 18);
                pVar3.z = obj;
                return pVar3;
            case 19:
                return new p((y1) this.z, (View) this.A, dVar, 19);
            case 20:
                return new p((StateFlow) this.z, (c2) this.A, dVar, 20);
            case 21:
                return new p((androidx.compose.ui.scrollcapture.c) this.z, (Runnable) this.A, dVar, 21);
            case 22:
                return new p((androidx.compose.ui.viewinterop.o) this.z, (androidx.compose.ui.geometry.c) this.A, dVar, 22);
            case 23:
                p pVar4 = new p((z) this.A, dVar, 23);
                pVar4.z = obj;
                return pVar4;
            case 24:
                p pVar5 = new p((List) this.A, dVar, 24);
                pVar5.z = obj;
                return pVar5;
            case 25:
                return new p((androidx.datastore.core.z) this.z, (l0) this.A, dVar, 25);
            case 26:
                return new p((kotlin.jvm.functions.p) this.z, (androidx.datastore.core.c) this.A, dVar);
            case 27:
                p pVar6 = new p((androidx.datastore.core.z) this.A, dVar, 27);
                pVar6.z = obj;
                return pVar6;
            case 28:
                return new p((androidx.datastore.core.b1) this.A, dVar, 28);
            default:
                return new p((androidx.privacysandbox.ads.adservices.java.measurement.a) this.z, (Uri) this.A, dVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.e) {
            case 0:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 12:
                ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 13:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 17:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                ((p) create((w1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 19:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 21:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 22:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 24:
                return ((p) create((androidx.datastore.core.i) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 25:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 26:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 27:
                return ((p) create((l0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 28:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:395:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:406:0x0723 A[Catch: all -> 0x0760, TryCatch #0 {all -> 0x0760, blocks: (B:404:0x0719, B:406:0x0723, B:410:0x0735), top: B:461:0x0719 }] */
    /* JADX WARN: Code duplicated, block: B:408:0x0731  */
    /* JADX WARN: Code duplicated, block: B:409:0x0732  */
    /* JADX WARN: Code duplicated, block: B:531:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v75, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r13v209, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r13v212, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r13v217, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01f7 -> B:116:0x01fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:30:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:294:0x0532 -> B:296:0x0535). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.compose.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(kotlin.jvm.functions.p pVar, androidx.datastore.core.c cVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 26;
        this.z = (kotlin.coroutines.jvm.internal.i) pVar;
        this.A = cVar;
    }
}
