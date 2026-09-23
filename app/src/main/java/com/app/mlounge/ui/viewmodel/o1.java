package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.ChqStream;
import com.appsalt.internal.e3;
import com.appsalt.internal.j4;
import com.appsalt.internal.n4;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(w1 w1Var, String str, ChqStream chqStream, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 3;
        this.z = w1Var;
        this.B = str;
        this.A = chqStream;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new o1((p1) this.z, (com.app.mlounge.ui.screens.settings.d) this.A, (String) this.B, dVar, 0);
            case 1:
                o1 o1Var = new o1((ArrayList) this.A, (w1) this.B, dVar, 1);
                o1Var.z = obj;
                return o1Var;
            case 2:
                o1 o1Var2 = new o1((com.app.mlounge.data.repository.b0) this.A, (w1) this.B, dVar, 2);
                o1Var2.z = obj;
                return o1Var2;
            case 3:
                return new o1((w1) this.z, (String) this.B, (ChqStream) this.A, dVar);
            case 4:
                return new o1((w1) this.z, (ChqStream) this.A, (l) this.B, dVar, 4);
            case 5:
                return new o1((com.appsalt.internal.a2) this.z, (com.appsalt.internal.a2) this.A, (com.appsalt.internal.k0) this.B, dVar, 5);
            case 6:
                o1 o1Var3 = new o1((e3) this.A, (j4) this.B, dVar, 6);
                o1Var3.z = obj;
                return o1Var3;
            case 7:
                o1 o1Var4 = new o1((e3) this.B, dVar, 7);
                o1Var4.A = obj;
                return o1Var4;
            case 8:
                o1 o1Var5 = new o1((n4) this.B, dVar, 8);
                o1Var5.A = obj;
                return o1Var5;
            default:
                return new o1((com.google.firebase.datastorage.b) this.z, (androidx.datastore.preferences.core.d) this.A, (Long) this.B, dVar, 9);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((o1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((o1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((o1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((o1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((o1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((o1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((o1) create((byte[]) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                o1 o1Var = new o1((e3) this.B, (kotlin.coroutines.d) obj2, 7);
                o1Var.A = (CoroutineScope) obj;
                return o1Var.invokeSuspend(kotlin.y.a);
            case 8:
                o1 o1Var2 = new o1((n4) this.B, (kotlin.coroutines.d) obj2, 8);
                o1Var2.A = (CoroutineScope) obj;
                return o1Var2.invokeSuspend(kotlin.y.a);
            default:
                return ((o1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0122 A[PHI: r0 r6
  0x0122: PHI (r0v54 kotlinx.coroutines.channels.ChannelIterator) = 
  (r0v88 kotlinx.coroutines.channels.ChannelIterator)
  (r0v89 kotlinx.coroutines.channels.ChannelIterator)
  (r0v90 kotlinx.coroutines.channels.ChannelIterator)
  (r0v91 kotlinx.coroutines.channels.ChannelIterator)
  (r0v92 kotlinx.coroutines.channels.ChannelIterator)
  (r0v93 kotlinx.coroutines.channels.ChannelIterator)
 binds: [B:64:0x0114, B:84:0x0170, B:86:0x0180, B:81:0x016b, B:76:0x0154, B:62:0x00fa] A[DONT_GENERATE, DONT_INLINE]
  0x0122: PHI (r6v16 kotlinx.coroutines.CoroutineScope) = 
  (r6v14 kotlinx.coroutines.CoroutineScope)
  (r6v15 kotlinx.coroutines.CoroutineScope)
  (r6v15 kotlinx.coroutines.CoroutineScope)
  (r6v15 kotlinx.coroutines.CoroutineScope)
  (r6v15 kotlinx.coroutines.CoroutineScope)
  (r6v20 kotlinx.coroutines.CoroutineScope)
 binds: [B:64:0x0114, B:84:0x0170, B:86:0x0180, B:81:0x016b, B:76:0x0154, B:62:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x012f A[PHI: r0 r6 r10
  0x012f: PHI (r0v53 kotlinx.coroutines.channels.ChannelIterator) = (r0v94 kotlinx.coroutines.channels.ChannelIterator), (r0v95 kotlinx.coroutines.channels.ChannelIterator) binds: [B:66:0x012c, B:63:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x012f: PHI (r6v15 kotlinx.coroutines.CoroutineScope) = (r6v16 kotlinx.coroutines.CoroutineScope), (r6v18 kotlinx.coroutines.CoroutineScope) binds: [B:66:0x012c, B:63:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x012f: PHI (r10v4 java.lang.Object) = (r10v17 java.lang.Object), (r10v18 java.lang.Object) binds: [B:66:0x012c, B:63:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0172  */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0080 -> B:19:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0154 -> B:65:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x016b -> B:65:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0170 -> B:65:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0180 -> B:65:0x0122). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
    }
}
