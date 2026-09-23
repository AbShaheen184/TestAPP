package androidx.compose.animation;

import android.net.Uri;
import android.view.InputEvent;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.j2;
import androidx.compose.foundation.gestures.q2;
import androidx.compose.foundation.gestures.r2;
import androidx.compose.foundation.gestures.s1;
import androidx.compose.foundation.gestures.t1;
import androidx.compose.foundation.j1;
import androidx.compose.material3.j6;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.w2;
import androidx.compose.runtime.x1;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(kotlin.jvm.functions.q qVar, s1 s1Var, androidx.compose.ui.input.pointer.v vVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 10;
        this.z = (kotlin.coroutines.jvm.internal.i) qVar;
        this.A = s1Var;
        this.B = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    private final Object e(Object obj) throws Throwable {
        androidx.room.a0 a0Var;
        Object objC;
        androidx.room.j jVar;
        ReentrantLock reentrantLock;
        androidx.room.i[] iVarArr;
        androidx.room.i iVar;
        androidx.room.j jVar2;
        ReentrantLock reentrantLock2;
        boolean z;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.y;
        boolean z2 = false;
        if (i == 0) {
            kotlin.a.e(obj);
            a0Var = (androidx.room.a0) this.z;
            this.z = a0Var;
            this.y = 1;
            objC = a0Var.c(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            reentrantLock2 = (ReentrantLock) this.A;
            jVar2 = (androidx.room.j) this.z;
            try {
                kotlin.a.e(obj);
                reentrantLock = reentrantLock2;
                jVar = jVar2;
                jVar.f = false;
                reentrantLock.unlock();
                return yVar;
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    jVar2.f = z;
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock = reentrantLock2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        a0Var = (androidx.room.a0) this.z;
        kotlin.a.e(obj);
        objC = obj;
        if (((Boolean) objC).booleanValue()) {
            return yVar;
        }
        androidx.room.k0 k0Var = (androidx.room.k0) this.B;
        jVar = k0Var.h;
        reentrantLock = jVar.e;
        reentrantLock.lock();
        try {
            jVar.f = true;
            ReentrantLock reentrantLock3 = jVar.a;
            reentrantLock3.lock();
            try {
                if (jVar.d) {
                    jVar.d = false;
                    int length = jVar.b.length;
                    iVarArr = new androidx.room.i[length];
                    int i2 = 0;
                    boolean z3 = false;
                    while (i2 < length) {
                        boolean z4 = jVar.b[i2] > 0 ? true : z2;
                        boolean[] zArr = jVar.c;
                        if (z4 != zArr[i2]) {
                            zArr[i2] = z4;
                            iVar = z4 ? androidx.room.i.y : androidx.room.i.z;
                            z3 = true;
                        } else {
                            iVar = androidx.room.i.e;
                        }
                        iVarArr[i2] = iVar;
                        i2++;
                        z2 = false;
                    }
                    if (!z3) {
                        iVarArr = null;
                    }
                } else {
                    iVarArr = null;
                }
                reentrantLock3.unlock();
                if (iVarArr != null) {
                    try {
                        if (iVarArr.length != 0) {
                            androidx.room.z zVar = androidx.room.z.y;
                            androidx.room.j0 j0Var = new androidx.room.j0(iVarArr, k0Var, a0Var, null);
                            this.z = jVar;
                            this.A = reentrantLock;
                            this.y = 2;
                            if (a0Var.a(zVar, j0Var, this) != aVar) {
                                jVar2 = jVar;
                                reentrantLock2 = reentrantLock;
                                reentrantLock = reentrantLock2;
                                jVar = jVar2;
                            }
                            return aVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jVar2 = jVar;
                        reentrantLock2 = reentrantLock;
                        z = false;
                        jVar2.f = z;
                        throw th;
                    }
                }
                jVar.f = false;
                reentrantLock.unlock();
                return yVar;
            } catch (Throwable th4) {
                reentrantLock3.unlock();
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r1v34, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                b0 b0Var = new b0((e2) this.A, (androidx.compose.runtime.a1) this.B, dVar, 0);
                b0Var.z = obj;
                return b0Var;
            case 1:
                return new b0((j2) this.B, dVar, 1);
            case 2:
                return new b0((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.l) this.A, (DisposableHandle) this.B, dVar, 2);
            case 3:
                return new b0((androidx.compose.foundation.interaction.k) this.z, (androidx.compose.foundation.interaction.i) this.A, (DisposableHandle) this.B, dVar, 3);
            case 4:
                b0 b0Var2 = new b0((androidx.compose.foundation.gestures.n) this.A, (kotlin.jvm.functions.p) this.B, dVar, 4);
                b0Var2.z = obj;
                return b0Var2;
            case 5:
                return new b0((androidx.compose.foundation.gestures.n) this.z, (j1) this.A, (kotlin.jvm.functions.p) this.B, dVar, 5);
            case 6:
                b0 b0Var3 = new b0((androidx.compose.foundation.gestures.k0) this.A, (androidx.compose.foundation.gestures.q0) this.B, dVar, 6);
                b0Var3.z = obj;
                return b0Var3;
            case 7:
                b0 b0Var4 = new b0((androidx.compose.foundation.gestures.q0) this.A, (androidx.compose.foundation.gestures.w) this.B, dVar, 7);
                b0Var4.z = obj;
                return b0Var4;
            case 8:
                b0 b0Var5 = new b0((androidx.compose.foundation.gestures.k0) this.A, (r2) this.B, dVar, 8);
                b0Var5.z = obj;
                return b0Var5;
            case 9:
                b0 b0Var6 = new b0((r2) this.A, (kotlin.jvm.functions.p) this.B, dVar, 9);
                b0Var6.z = obj;
                return b0Var6;
            case 10:
                return new b0((kotlin.jvm.functions.q) this.z, (s1) this.A, (androidx.compose.ui.input.pointer.v) this.B, dVar);
            case 11:
                b0 b0Var7 = new b0((Job) this.A, (kotlin.jvm.functions.p) this.B, dVar);
                b0Var7.z = obj;
                return b0Var7;
            case 12:
                return new b0((androidx.compose.foundation.relocation.h) this.z, (androidx.compose.ui.node.d1) this.A, (androidx.compose.ui.draw.b) this.B, dVar, 12);
            case 13:
                return new b0((androidx.compose.foundation.text.contextmenu.modifier.j) this.A, (androidx.compose.foundation.text.contextmenu.provider.f) this.B, dVar, 13);
            case 14:
                b0 b0Var8 = new b0((w2) this.A, (androidx.compose.animation.core.d) this.B, dVar, 14);
                b0Var8.z = obj;
                return b0Var8;
            case 15:
                return new b0((kotlin.jvm.functions.p) this.A, this.z, (CoroutineScope) this.B, dVar);
            case 16:
                b0 b0Var9 = new b0((kotlin.jvm.functions.a) this.A, (kotlin.jvm.functions.p) this.B, dVar, 16);
                b0Var9.z = obj;
                return b0Var9;
            case 17:
                b0 b0Var10 = new b0((kotlin.jvm.functions.q) this.A, (androidx.compose.material3.internal.p) this.B, dVar, 17);
                b0Var10.z = obj;
                return b0Var10;
            case 18:
                b0 b0Var11 = new b0((kotlin.jvm.functions.r) this.A, (androidx.compose.material3.internal.p) this.B, dVar, 18);
                b0Var11.z = obj;
                return b0Var11;
            case 19:
                return new b0((MutableStateFlow) this.A, (j6) this.B, dVar, 19);
            case 20:
                b0 b0Var12 = new b0((x1) this.A, (androidx.compose.runtime.e) this.B, dVar, 20);
                b0Var12.z = obj;
                return b0Var12;
            case 21:
                b0 b0Var13 = new b0((kotlin.coroutines.j) this.A, (Flow) this.B, dVar, 21);
                b0Var13.z = obj;
                return b0Var13;
            case 22:
                return new b0((Channel) this.B, dVar, 22);
            case 23:
                b0 b0Var14 = new b0((androidx.datastore.core.z) this.B, dVar, 23);
                b0Var14.z = obj;
                return b0Var14;
            case 24:
                b0 b0Var15 = new b0((androidx.datastore.core.z) this.A, (kotlin.jvm.functions.p) this.B, dVar);
                b0Var15.z = obj;
                return b0Var15;
            case 25:
                b0 b0Var16 = new b0((File) this.B, dVar, 25);
                b0Var16.z = obj;
                return b0Var16;
            case 26:
                return new b0((androidx.compose.animation.core.h1) this.z, (androidx.compose.runtime.a1) this.B, (androidx.compose.runtime.f1) this.A, dVar);
            case 27:
                return new b0((androidx.privacysandbox.ads.adservices.java.measurement.a) this.z, (Uri) this.A, (InputEvent) this.B, dVar, 27);
            case 28:
                b0 b0Var17 = new b0((androidx.room.k0) this.B, dVar, 28);
                b0Var17.z = obj;
                return b0Var17;
            default:
                return new b0((kotlin.jvm.internal.z) this.A, (androidx.room.coroutines.t) this.B, dVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((b0) create((q1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((b0) create((t1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((b0) create((androidx.compose.material3.internal.o) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((b0) create((q2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((b0) create((t1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 12:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 17:
                return ((b0) create((androidx.compose.material3.internal.h0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                return ((b0) create((kotlin.k) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 19:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 21:
                return ((b0) create((q1) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 22:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                return ((b0) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 24:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 25:
                return ((b0) create((ProducerScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 26:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 27:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 28:
                return ((b0) create((androidx.room.a0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02db */
    /* JADX WARN: Code duplicated, block: B:143:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:146:0x0306 A[Catch: all -> 0x02db, TryCatch #4 {, blocks: (B:134:0x02d6, B:144:0x02fe, B:146:0x0306, B:147:0x0313, B:154:0x0323, B:141:0x02f0, B:156:0x0326, B:158:0x032b, B:159:0x032c, B:140:0x02ec, B:148:0x0314, B:150:0x031a), top: B:503:0x02ca, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x031a A[Catch: all -> 0x032a, TRY_LEAVE, TryCatch #3 {all -> 0x032a, blocks: (B:148:0x0314, B:150:0x031a), top: B:501:0x0314, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0326 A[Catch: all -> 0x02db, TryCatch #4 {, blocks: (B:134:0x02d6, B:144:0x02fe, B:146:0x0306, B:147:0x0313, B:154:0x0323, B:141:0x02f0, B:156:0x0326, B:158:0x032b, B:159:0x032c, B:140:0x02ec, B:148:0x0314, B:150:0x031a), top: B:503:0x02ca, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x058e  */
    /* JADX WARN: Code duplicated, block: B:342:0x0681  */
    /* JADX WARN: Code duplicated, block: B:501:0x0314 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:150:0x031a, B:153:0x0322], limit reached: 563 */
    /* JADX WARN: Type inference failed for: r1v34, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v41, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r2v56, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r2v58, types: [kotlinx.coroutines.channels.Channel, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r8v19, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x02fa -> B:144:0x02fe). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 2502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(androidx.datastore.core.z zVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 24;
        this.A = zVar;
        this.B = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlin.jvm.functions.p pVar, Object obj, CoroutineScope coroutineScope, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 15;
        this.A = pVar;
        this.z = obj;
        this.B = coroutineScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.compose.animation.core.h1 h1Var, androidx.compose.runtime.a1 a1Var, androidx.compose.runtime.f1 f1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 26;
        this.z = h1Var;
        this.B = a1Var;
        this.A = f1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(Job job, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 11;
        this.A = job;
        this.B = (kotlin.coroutines.jvm.internal.i) pVar;
    }
}
