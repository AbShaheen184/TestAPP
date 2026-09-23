package com.app.mlounge.ui;

import android.content.Context;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import com.appsalt.internal.e3;
import com.appsalt.internal.i3;
import com.appsalt.internal.j4;
import com.google.firebase.sessions.p0;
import com.google.firebase.sessions.t0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int e = 0;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.app.mlounge.data.remote.ntv.e eVar, com.app.mlounge.data.remote.ntv.q qVar, Context context, androidx.navigation.y yVar, String str, a1 a1Var, a1 a1Var2, w2 w2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = eVar;
        this.B = qVar;
        this.C = context;
        this.D = yVar;
        this.z = str;
        this.E = a1Var;
        this.F = a1Var2;
        this.G = w2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c0((com.app.mlounge.data.remote.ntv.e) this.A, (com.app.mlounge.data.remote.ntv.q) this.B, (Context) this.C, (androidx.navigation.y) this.D, (String) this.z, (a1) this.E, (a1) this.F, (w2) this.G, dVar);
            case 1:
                return new c0((com.app.mlounge.ui.viewmodel.a0) this.A, (String) this.z, (String) this.B, (String) this.C, (String) this.D, (String) this.E, (com.app.mlounge.ui.screens.livetv.h) this.F, (String) this.G, dVar);
            case 2:
                return new c0((i3) this.E, (j4) this.F, (e3) this.G, dVar);
            default:
                return new c0((t0) this.F, (p0) this.G, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0208 A[EXC_TOP_SPLITTER, PHI: r0 r1 r2 r11 r13
  0x0208: PHI (r0v47 com.appsalt.internal.i3) = (r0v44 com.appsalt.internal.i3), (r0v51 com.appsalt.internal.i3) binds: [B:60:0x0204, B:52:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r1v26 com.appsalt.internal.m4) = (r1v22 com.appsalt.internal.m4), (r1v30 com.appsalt.internal.m4) binds: [B:60:0x0204, B:52:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r2v19 kotlinx.coroutines.sync.Mutex) = (r2v18 kotlinx.coroutines.sync.Mutex), (r2v24 kotlinx.coroutines.sync.Mutex) binds: [B:60:0x0204, B:52:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r11v4 com.appsalt.internal.e3) = (r11v3 com.appsalt.internal.e3), (r11v6 com.appsalt.internal.e3) binds: [B:60:0x0204, B:52:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r13v4 com.appsalt.internal.j4) = (r13v3 com.appsalt.internal.j4), (r13v6 com.appsalt.internal.j4) binds: [B:60:0x0204, B:52:0x019c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0241  */
    /* JADX WARN: Code duplicated, block: B:74:0x026f A[PHI: r0 r1
  0x026f: PHI (r0v64 kotlinx.coroutines.channels.ChannelIterator) = 
  (r0v57 kotlinx.coroutines.channels.ChannelIterator)
  (r0v63 kotlinx.coroutines.channels.ChannelIterator)
  (r0v66 kotlinx.coroutines.channels.ChannelIterator)
 binds: [B:73:0x0266, B:80:0x0299, B:48:0x0153] A[DONT_GENERATE, DONT_INLINE]
  0x026f: PHI (r1v43 com.appsalt.internal.i3) = (r1v36 com.appsalt.internal.i3), (r1v42 com.appsalt.internal.i3), (r1v45 com.appsalt.internal.i3) binds: [B:73:0x0266, B:80:0x0299, B:48:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0281 A[PHI: r0 r1 r2
  0x0281: PHI (r0v63 kotlinx.coroutines.channels.ChannelIterator) = (r0v62 kotlinx.coroutines.channels.ChannelIterator), (r0v64 kotlinx.coroutines.channels.ChannelIterator) binds: [B:49:0x0160, B:75:0x027e] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r1v42 com.appsalt.internal.i3) = (r1v41 com.appsalt.internal.i3), (r1v43 com.appsalt.internal.i3) binds: [B:49:0x0160, B:75:0x027e] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r2v36 java.lang.Object) = (r2v35 java.lang.Object), (r2v43 java.lang.Object) binds: [B:49:0x0160, B:75:0x027e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0289  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r2v20, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0299 -> B:74:0x026f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.app.mlounge.ui.viewmodel.a0 a0Var, String str, String str2, String str3, String str4, String str5, com.app.mlounge.ui.screens.livetv.h hVar, String str6, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = a0Var;
        this.z = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = str5;
        this.F = hVar;
        this.G = str6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t0 t0Var, p0 p0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = t0Var;
        this.G = p0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i3 i3Var, j4 j4Var, e3 e3Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.E = i3Var;
        this.F = j4Var;
        this.G = e3Var;
    }
}
