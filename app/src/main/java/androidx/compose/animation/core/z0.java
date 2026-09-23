package androidx.compose.animation.core;

import com.app.mlounge.data.remote.model.ChqStream;
import com.appsalt.internal.c3;
import com.appsalt.internal.e3;
import com.appsalt.internal.n4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(androidx.compose.ui.input.pointer.y yVar, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.l lVar, androidx.compose.foundation.gestures.s1 s1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 1;
        this.A = yVar;
        this.B = (kotlin.coroutines.jvm.internal.i) qVar;
        this.C = lVar;
        this.D = s1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x0024, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:8:0x0020, B:25:0x0072, B:28:0x007a, B:36:0x00d0, B:24:0x0068), top: B:44:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cc -> B:25:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object e(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.z0.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new z0((h1) this.C, this.z, (e2) this.D, dVar);
            case 1:
                z0 z0Var = new z0((androidx.compose.ui.input.pointer.y) this.A, (kotlin.coroutines.jvm.internal.i) this.B, (kotlin.jvm.functions.l) this.C, (androidx.compose.foundation.gestures.s1) this.D, dVar);
                z0Var.z = obj;
                return z0Var;
            case 2:
                return new z0((androidx.compose.foundation.text.r0) this.A, (androidx.compose.runtime.a1) this.B, (androidx.compose.ui.text.input.y) this.C, (androidx.compose.foundation.text.selection.b1) this.z, (androidx.compose.ui.text.input.k) this.D, dVar, 2);
            case 3:
                return new z0((androidx.compose.foundation.relocation.c) this.A, (androidx.compose.ui.text.input.x) this.B, (androidx.compose.foundation.text.r0) this.C, (androidx.compose.foundation.text.k1) this.z, (androidx.compose.ui.text.input.q) this.D, dVar, 3);
            case 4:
                z0 z0Var2 = new z0((androidx.compose.ui.platform.o0) this.A, (kotlin.jvm.functions.l) this.B, (androidx.compose.foundation.text.input.internal.c) this.C, (androidx.compose.foundation.text.input.internal.q) this.D, dVar, 4);
                z0Var2.z = obj;
                return z0Var2;
            case 5:
                z0 z0Var3 = new z0((androidx.compose.runtime.y1) this.B, (androidx.compose.runtime.x1) this.C, (androidx.compose.runtime.e) this.D, dVar);
                z0Var3.z = obj;
                return z0Var3;
            case 6:
                z0 z0Var4 = new z0((androidx.navigation.compose.i) this.A, (androidx.compose.runtime.a1) this.B, (androidx.compose.runtime.f1) this.C, (androidx.compose.runtime.a1) this.D, dVar, 6);
                z0Var4.z = obj;
                return z0Var4;
            case 7:
                return new z0((coil3.request.g) this.A, (coil3.p) this.B, (coil3.size.h) this.C, (coil3.f) this.z, (coil3.j) this.D, dVar, 7);
            case 8:
                return new z0((com.app.mlounge.data.repository.r) this.A, (String) this.B, (Integer) this.C, (ProducerScope) this.z, (String) this.D, dVar, 8);
            case 9:
                return new z0((com.app.mlounge.ui.viewmodel.w1) this.z, (ChqStream) this.D, dVar);
            case 10:
                z0 z0Var5 = new z0((c3) this.D, dVar, 10);
                z0Var5.z = obj;
                return z0Var5;
            case 11:
                return new z0((e3) this.D, dVar, 11);
            default:
                z0 z0Var6 = new z0((androidx.work.impl.z) this.C, (n4) this.D, dVar);
                z0Var6.z = obj;
                return z0Var6;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.e) {
            case 0:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 5:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((z0) create((Flow) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                z0 z0Var = new z0((c3) this.D, (kotlin.coroutines.d) obj2, 10);
                z0Var.z = (CoroutineScope) obj;
                return z0Var.invokeSuspend(kotlin.y.a);
            case 11:
                return new z0((e3) this.D, (kotlin.coroutines.d) obj2, 11).invokeSuspend(kotlin.y.a);
            default:
                return ((z0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0095  */
    /* JADX WARN: Code duplicated, block: B:207:0x04cb A[Catch: all -> 0x03fb, LOOP:1: B:206:0x04c9->B:207:0x04cb, LOOP_END, TryCatch #12 {all -> 0x03fb, blocks: (B:171:0x03f6, B:201:0x04b9, B:202:0x04bf, B:204:0x04c4, B:205:0x04c5, B:207:0x04cb, B:208:0x04d7, B:225:0x051c, B:226:0x051d, B:203:0x04c0), top: B:428:0x03e8, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0 A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x076b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8 A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:349:0x079e  */
    /* JADX WARN: Code duplicated, block: B:357:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:359:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:364:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x010b A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:395:0x0877 A[PHI: r7 r14 r20
  0x0877: PHI (r7v14 kotlin.coroutines.intrinsics.a) = (r7v8 kotlin.coroutines.intrinsics.a), (r7v17 kotlin.coroutines.intrinsics.a) binds: [B:393:0x0874, B:326:0x070c] A[DONT_GENERATE, DONT_INLINE]
  0x0877: PHI (r14v18 androidx.compose.animation.core.h1) = (r14v6 androidx.compose.animation.core.h1), (r14v22 androidx.compose.animation.core.h1) binds: [B:393:0x0874, B:326:0x070c] A[DONT_GENERATE, DONT_INLINE]
  0x0877: PHI (r20v7 float) = (r20v6 float), (r20v11 float) binds: [B:393:0x0874, B:326:0x070c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:398:0x0884  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x011c A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:426:0x04c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0120 A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0137 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #10 {all -> 0x0039, blocks: (B:8:0x0033, B:20:0x0098, B:22:0x00a0, B:24:0x00aa, B:25:0x00af, B:17:0x0087, B:27:0x00b3, B:29:0x00c2, B:31:0x00cd, B:33:0x00d8, B:34:0x00dd, B:36:0x00fb, B:37:0x0100, B:38:0x010b, B:40:0x010f, B:41:0x011c, B:43:0x0120, B:44:0x0137, B:16:0x007f), top: B:424:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x020c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [androidx.navigation.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r10v13, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26, types: [androidx.activity.y] */
    /* JADX WARN: Type inference failed for: r2v44, types: [androidx.activity.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [androidx.activity.y] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r4v25, types: [androidx.navigation.compose.i] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01fc -> B:70:0x01bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.compose.runtime.y1 y1Var, androidx.compose.runtime.x1 x1Var, androidx.compose.runtime.e eVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 5;
        this.B = y1Var;
        this.C = x1Var;
        this.D = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(h1 h1Var, Object obj, e2 e2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 0;
        this.C = h1Var;
        this.z = obj;
        this.D = e2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.app.mlounge.ui.viewmodel.w1 w1Var, ChqStream chqStream, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 9;
        this.z = w1Var;
        this.D = chqStream;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.z = obj4;
        this.D = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, Object obj2, Object obj3, Object obj4, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.D = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.work.impl.z zVar, n4 n4Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 12;
        this.C = zVar;
        this.D = n4Var;
    }
}
