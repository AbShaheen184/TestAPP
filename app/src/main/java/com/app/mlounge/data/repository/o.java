package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public r A;
    public String B;
    public Iterator C;
    public ChqStream D;
    public String E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ r M;
    public final /* synthetic */ String N;
    public final /* synthetic */ String O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;
    public List e;
    public okhttp3.y y;
    public ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, String str, String str2, int i, int i2, String str3, String str4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.M = rVar;
        this.N = str;
        this.O = str2;
        this.P = i;
        this.Q = i2;
        this.R = str3;
        this.S = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        o oVar = new o(this.M, this.N, this.O, this.P, this.Q, this.R, this.S, dVar);
        oVar.L = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ProducerScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0428  */
    /* JADX WARN: Code duplicated, block: B:118:0x0430  */
    /* JADX WARN: Code duplicated, block: B:120:0x0440  */
    /* JADX WARN: Code duplicated, block: B:124:0x0473  */
    /* JADX WARN: Code duplicated, block: B:130:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:148:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:161:0x0556 A[Catch: Exception -> 0x0586, TRY_LEAVE, TryCatch #7 {Exception -> 0x0586, blocks: (B:159:0x0550, B:161:0x0556), top: B:208:0x0550 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x058b  */
    /* JADX WARN: Code duplicated, block: B:200:0x04d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0488 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.ArrayList, java.util.List, okhttp3.y] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v45, types: [com.app.mlounge.data.remote.model.ChqStream, com.app.mlounge.data.repository.r, java.lang.Object, java.lang.String, java.util.ArrayList, java.util.Iterator, java.util.List, okhttp3.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0587 -> B:186:0x05cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x05c8 -> B:186:0x05cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.repository.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
