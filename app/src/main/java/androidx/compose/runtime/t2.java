package androidx.compose.runtime;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.b3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e = 1;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(coil3.intercept.f fVar, coil3.request.g gVar, Object obj, coil3.request.n nVar, coil3.f fVar2, coil3.memory.a aVar, coil3.intercept.i iVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = fVar;
        this.C = gVar;
        this.z = obj;
        this.A = nVar;
        this.D = fVar2;
        this.E = aVar;
        this.F = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                t2 t2Var = new t2((kotlin.jvm.functions.a) this.F, dVar);
                t2Var.E = obj;
                return t2Var;
            case 1:
                t2 t2Var2 = new t2((ContentResolver) this.C, (Uri) this.D, (b3) this.E, (Channel) this.A, (Context) this.F, dVar);
                t2Var2.z = obj;
                return t2Var2;
            case 2:
                return new t2((coil3.intercept.f) this.B, (kotlin.jvm.internal.z) this.C, (kotlin.jvm.internal.z) this.A, (coil3.request.g) this.D, this.z, (kotlin.jvm.internal.z) this.E, (coil3.f) this.F, dVar);
            default:
                return new t2((coil3.intercept.f) this.B, (coil3.request.g) this.C, this.z, (coil3.request.n) this.A, (coil3.f) this.D, (coil3.memory.a) this.E, (coil3.intercept.i) this.F, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.e) {
            case 0:
                ((t2) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 1:
                return ((t2) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((t2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((t2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0318 A[Catch: all -> 0x03b5, TryCatch #6 {all -> 0x03b5, blocks: (B:136:0x02fa, B:139:0x0305, B:141:0x0318, B:143:0x0324, B:145:0x032e, B:149:0x033f, B:153:0x034b, B:157:0x0359, B:160:0x0368), top: B:206:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0349 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x034b A[Catch: all -> 0x03b5, LOOP:1: B:139:0x0305->B:153:0x034b, LOOP_END, TryCatch #6 {all -> 0x03b5, blocks: (B:136:0x02fa, B:139:0x0305, B:141:0x0318, B:143:0x0324, B:145:0x032e, B:149:0x033f, B:153:0x034b, B:157:0x0359, B:160:0x0368), top: B:206:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x03a3 -> B:172:0x03a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01fb -> B:78:0x018a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.t2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ContentResolver contentResolver, Uri uri, b3 b3Var, Channel channel, Context context, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = contentResolver;
        this.D = uri;
        this.E = b3Var;
        this.A = channel;
        this.F = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(coil3.intercept.f fVar, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.z zVar2, coil3.request.g gVar, Object obj, kotlin.jvm.internal.z zVar3, coil3.f fVar2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = fVar;
        this.C = zVar;
        this.A = zVar2;
        this.D = gVar;
        this.z = obj;
        this.E = zVar3;
        this.F = fVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(kotlin.jvm.functions.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = aVar;
    }
}
