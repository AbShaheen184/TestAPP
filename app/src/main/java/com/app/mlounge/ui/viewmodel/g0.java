package com.app.mlounge.ui.viewmodel;

import android.app.Application;
import android.util.Log;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.appsalt.internal.b3;
import com.appsalt.internal.b4;
import com.appsalt.internal.c3;
import com.appsalt.internal.e3;
import com.appsalt.internal.g3;
import com.appsalt.internal.g4;
import com.appsalt.internal.h2;
import com.appsalt.internal.h5;
import com.appsalt.internal.j4;
import com.appsalt.internal.k4;
import com.appsalt.internal.k5;
import com.appsalt.internal.n3;
import com.appsalt.internal.n5;
import com.appsalt.internal.p3;
import com.appsalt.internal.s4;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i, com.google.android.material.internal.k kVar, com.i4studio.subslib.model.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 17;
        this.z = bVar;
        this.A = kVar;
        this.y = i;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x030d  */
    private final Object e(Object obj) {
        Object lVar;
        h2 h2Var;
        int i;
        p3 b3Var;
        String str;
        com.appsalt.internal.t tVar;
        Object lVar2;
        int i2;
        p3 b3Var2;
        com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) this.A;
        com.appsalt.internal.p0 p0Var = (com.appsalt.internal.p0) nVar.A;
        int i3 = this.y;
        if (i3 == 0) {
            kotlin.a.e(obj);
            byte[] bArr = (byte[]) this.z;
            switch (((com.appsalt.internal.j0) nVar.B).a) {
                case 2:
                    try {
                        com.google.protobuf.i0 i0Var = (com.google.protobuf.i0) s4.i();
                        i0Var.getClass();
                        GeneratedMessageLite partialFrom = GeneratedMessageLite.parsePartialFrom(i0Var.a, bArr, 0, bArr.length, com.google.protobuf.i0.b);
                        if (partialFrom != null && !partialFrom.isInitialized()) {
                            throw new com.google.protobuf.x0(partialFrom.newUninitializedMessageException().getMessage());
                        }
                        s4 s4Var = (s4) partialFrom;
                        int iG = s4Var.g();
                        try {
                            if (iG == 0) {
                                i = -1;
                            } else {
                                int[] iArr = k5.d;
                                if (iG == 0) {
                                    throw null;
                                }
                                i = iArr[iG - 1];
                            }
                            com.appsalt.internal.t tVar2 = com.appsalt.internal.t.V4;
                            com.appsalt.internal.t tVar3 = com.appsalt.internal.t.V6;
                            switch (i) {
                                case 1:
                                    obj = null;
                                    b3Var = com.appsalt.internal.c2.a;
                                    lVar = new h2(s4Var.f(), -1, b3Var);
                                    if (lVar instanceof kotlin.l) {
                                        lVar = obj;
                                    }
                                    h2Var = (h2) lVar;
                                    break;
                                case 2:
                                    obj = null;
                                    b3Var = new b3(s4Var.h().c(), s4Var.h().d());
                                    lVar = new h2(s4Var.f(), -1, b3Var);
                                    if (lVar instanceof kotlin.l) {
                                        lVar = obj;
                                    }
                                    h2Var = (h2) lVar;
                                    break;
                                case 3:
                                    obj = null;
                                    com.google.protobuf.t0<b4> t0VarC = s4Var.b().c();
                                    ArrayList arrayList = new ArrayList(kotlin.collections.r.p(t0VarC, 10));
                                    for (b4 b4Var : t0VarC) {
                                        arrayList.add(new com.appsalt.internal.o(new com.appsalt.internal.e(b4Var.b().toByteArray(), tVar2), new com.appsalt.internal.e(b4Var.c().toByteArray(), tVar2)));
                                    }
                                    com.google.protobuf.t0<b4> t0VarD = s4Var.b().d();
                                    ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(t0VarD, 10));
                                    for (b4 b4Var2 : t0VarD) {
                                        arrayList2.add(new com.appsalt.internal.o(new com.appsalt.internal.e(b4Var2.b().toByteArray(), tVar3), new com.appsalt.internal.e(b4Var2.c().toByteArray(), tVar3)));
                                    }
                                    b3Var = new com.appsalt.internal.y1(new com.appsalt.internal.i(arrayList, arrayList2));
                                    lVar = new h2(s4Var.f(), -1, b3Var);
                                    if (lVar instanceof kotlin.l) {
                                        lVar = obj;
                                    }
                                    h2Var = (h2) lVar;
                                    break;
                                case 4:
                                    String strG = s4Var.e().g();
                                    String strC = s4Var.e().c();
                                    int iE = s4Var.e().e();
                                    int i4 = k5.a[androidx.constraintlayout.core.g.e(s4Var.e().f())];
                                    int i5 = (i4 == 1 || i4 != 2) ? 2 : 1;
                                    obj = null;
                                    int i6 = k5.b[androidx.constraintlayout.core.g.e(s4Var.e().d())];
                                    if (i6 == 1) {
                                        str = strC;
                                        tVar = tVar2;
                                    } else if (i6 != 2) {
                                        str = strC;
                                        tVar = com.appsalt.internal.t.ANY;
                                    } else {
                                        tVar = tVar3;
                                        str = strC;
                                    }
                                    new com.appsalt.internal.e1(strG, str, iE, i5, tVar);
                                    b3Var = r6;
                                    lVar = new h2(s4Var.f(), -1, b3Var);
                                    if (lVar instanceof kotlin.l) {
                                        lVar = obj;
                                    }
                                    h2Var = (h2) lVar;
                                    break;
                                case 5:
                                    String strC2 = s4Var.d().c();
                                    int i7 = k5.c[androidx.constraintlayout.core.g.e(s4Var.d().d())];
                                    if (i7 != 1 && i7 != 2) {
                                        throw new androidx.compose.ui.res.e(11);
                                    }
                                    b3Var = new com.appsalt.internal.x0(strC2, 1);
                                    obj = null;
                                    lVar = new h2(s4Var.f(), -1, b3Var);
                                    if (lVar instanceof kotlin.l) {
                                        lVar = obj;
                                    }
                                    h2Var = (h2) lVar;
                                    break;
                                case 6:
                                    b3Var = new com.appsalt.internal.u0(s4Var.c().d(), s4Var.c().c().toByteArray());
                                    obj = null;
                                    lVar = new h2(s4Var.f(), -1, b3Var);
                                    if (lVar instanceof kotlin.l) {
                                        lVar = obj;
                                    }
                                    h2Var = (h2) lVar;
                                    break;
                                default:
                                    b3Var = n3.a;
                                    obj = null;
                                    lVar = new h2(s4Var.f(), -1, b3Var);
                                    if (lVar instanceof kotlin.l) {
                                        lVar = obj;
                                    }
                                    h2Var = (h2) lVar;
                                    break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            lVar = new kotlin.l(th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                    }
                    break;
                default:
                    try {
                        com.google.protobuf.i0 i0Var2 = (com.google.protobuf.i0) h5.f();
                        i0Var2.getClass();
                        GeneratedMessageLite partialFrom2 = GeneratedMessageLite.parsePartialFrom(i0Var2.a, bArr, 0, bArr.length, com.google.protobuf.i0.b);
                        if (partialFrom2 != null && !partialFrom2.isInitialized()) {
                            throw new com.google.protobuf.x0(partialFrom2.newUninitializedMessageException().getMessage());
                        }
                        h5 h5Var = (h5) partialFrom2;
                        int iD = h5Var.d();
                        if (iD == 0) {
                            i2 = -1;
                        } else {
                            int[] iArr2 = n5.a;
                            if (iD == 0) {
                                throw null;
                            }
                            i2 = iArr2[iD - 1];
                        }
                        if (i2 == 1) {
                            b3Var2 = com.appsalt.internal.c2.a;
                        } else if (i2 == 2) {
                            b3Var2 = new b3(h5Var.e().c(), h5Var.e().d());
                        } else if (i2 != 3) {
                            b3Var2 = g3.a;
                        } else {
                            com.google.protobuf.t0<k4> t0VarC2 = h5Var.b().c();
                            ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(t0VarC2, 10));
                            for (k4 k4Var : t0VarC2) {
                                byte[] byteArray = k4Var.b().toByteArray();
                                com.appsalt.internal.t tVar4 = com.appsalt.internal.t.V4;
                                arrayList3.add(new com.appsalt.internal.o(new com.appsalt.internal.e(byteArray, tVar4), new com.appsalt.internal.e(k4Var.c().toByteArray(), tVar4)));
                            }
                            com.google.protobuf.t0<k4> t0VarD2 = h5Var.b().d();
                            ArrayList arrayList4 = new ArrayList(kotlin.collections.r.p(t0VarD2, 10));
                            for (k4 k4Var2 : t0VarD2) {
                                byte[] byteArray2 = k4Var2.b().toByteArray();
                                com.appsalt.internal.t tVar5 = com.appsalt.internal.t.V6;
                                arrayList4.add(new com.appsalt.internal.o(new com.appsalt.internal.e(byteArray2, tVar5), new com.appsalt.internal.e(k4Var2.c().toByteArray(), tVar5)));
                            }
                            b3Var2 = new com.appsalt.internal.y1(new com.appsalt.internal.i(arrayList3, arrayList4));
                        }
                        lVar2 = new h2(h5Var.c(), -1, b3Var2);
                    } catch (Throwable th3) {
                        lVar2 = new kotlin.l(th3);
                    }
                    h2Var = (h2) (lVar2 instanceof kotlin.l ? null : lVar2);
                    break;
            }
            if (h2Var == null) {
                p0Var.a.getClass();
            } else {
                h2Var.b = ((c3) nVar.y).j;
                p0Var.getClass();
                g4 g4Var = p0Var.a;
                if (h2Var.c instanceof com.appsalt.internal.c2) {
                    g4Var.getClass();
                    if (g4.b) {
                        g4Var.a(3, "I'm alive...");
                    }
                }
                g4Var.getClass();
                Channel channel = (Channel) nVar.z;
                this.y = 1;
                Object objSend = channel.send(h2Var, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objSend == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return kotlin.y.a;
    }

    private final Object f(Object obj) throws JSONException {
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Double d2;
        Boolean bool2;
        com.google.firebase.sessions.settings.c cVar = (com.google.firebase.sessions.settings.c) this.A;
        int i = this.y;
        if (i == 0) {
            kotlin.a.e(obj);
            JSONObject jSONObject = (JSONObject) this.z;
            Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
            Integer num3 = null;
            if (jSONObject.has("app_quality")) {
                Object obj2 = jSONObject.get("app_quality");
                obj2.getClass();
                JSONObject jSONObject2 = (JSONObject) obj2;
                try {
                    bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            try {
                                if (jSONObject2.has("cache_duration")) {
                                    num3 = (Integer) jSONObject2.get("cache_duration");
                                }
                            } catch (JSONException e) {
                                e = e;
                                kotlin.coroutines.jvm.internal.f.b(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            num2 = null;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        num2 = null;
                        d2 = null;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    num2 = null;
                    d2 = null;
                    bool2 = null;
                }
                num = num2;
                d = d2;
                bool = bool2;
            } else {
                bool = null;
                d = null;
                num = null;
            }
            com.google.firebase.sessions.settings.n nVar = cVar.e;
            int iIntValue = num3 != null ? num3.intValue() : com.google.firebase.sessions.settings.c.g;
            cVar.a.getClass();
            com.google.firebase.sessions.settings.g gVar = new com.google.firebase.sessions.settings.g(bool, d, num, new Integer(iIntValue), new Long(com.google.firebase.sessions.j1.a().c));
            this.y = 1;
            Object objC = nVar.c(gVar, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return kotlin.y.a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new g0((j0) this.z, (MusicAlbumDetail) this.A, dVar, 0);
            case 1:
                return new g0((w1) this.A, dVar, 1);
            case 2:
                g0 g0Var = new g0((b2) this.A, dVar, 2);
                g0Var.z = obj;
                return g0Var;
            case 3:
                return new g0((b2) this.A, dVar, 3);
            case 4:
                return new g0((b2) this.z, (TmdbTvDetailResponse) this.A, dVar, 4);
            case 5:
                g0 g0Var2 = new g0((d2) this.A, dVar, 5);
                g0Var2.z = obj;
                return g0Var2;
            case 6:
                return new g0((d2) this.z, (String) this.A, dVar, 6);
            case 7:
                g0 g0Var3 = new g0((Application) this.A, dVar, 7);
                g0Var3.z = obj;
                return g0Var3;
            case 8:
                return new g0((e3) this.z, (j4) this.A, dVar, 8);
            case 9:
                return new g0((c3) this.z, (byte[]) this.A, dVar, 9);
            case 10:
                g0 g0Var4 = new g0((com.google.firebase.messaging.n) this.A, dVar, 10);
                g0Var4.z = obj;
                return g0Var4;
            case 11:
                g0 g0Var5 = new g0((com.appsalt.internal.f) this.A, dVar, 11);
                g0Var5.z = obj;
                return g0Var5;
            case 12:
                return new g0((com.google.firebase.datastorage.b) this.z, (kotlin.jvm.functions.l) this.A, dVar, 12);
            case 13:
                return new g0((com.google.firebase.datastorage.b) this.z, (androidx.datastore.preferences.core.d) this.A, dVar, 13);
            case 14:
                return new g0((com.google.firebase.sessions.o) this.z, (com.google.firebase.sessions.y0) this.A, dVar, 14);
            case 15:
                return new g0((com.google.firebase.sessions.e1) this.z, (com.google.firebase.sessions.k0) this.A, dVar, 15);
            case 16:
                g0 g0Var6 = new g0((com.google.firebase.sessions.settings.c) this.A, dVar, 16);
                g0Var6.z = obj;
                return g0Var6;
            default:
                com.i4studio.subslib.model.b bVar = (com.i4studio.subslib.model.b) this.z;
                return new g0(this.y, (com.google.android.material.internal.k) this.A, bVar, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.e) {
            case 0:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 3:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 6:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                ((Boolean) obj).getClass();
                return new g0((e3) this.z, (j4) this.A, (kotlin.coroutines.d) obj2, 8).invokeSuspend(kotlin.y.a);
            case 9:
                return new g0((c3) this.z, (byte[]) this.A, (kotlin.coroutines.d) obj2, 9).invokeSuspend(kotlin.y.a);
            case 10:
                g0 g0Var = new g0((com.google.firebase.messaging.n) this.A, (kotlin.coroutines.d) obj2, 10);
                g0Var.z = (byte[]) obj;
                return g0Var.invokeSuspend(kotlin.y.a);
            case 11:
                g0 g0Var2 = new g0((com.appsalt.internal.f) this.A, (kotlin.coroutines.d) obj2, 11);
                g0Var2.z = (h2) obj;
                return g0Var2.invokeSuspend(kotlin.y.a);
            case 12:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 14:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 15:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((g0) create((JSONObject) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((g0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0333  */
    /* JADX WARN: Code duplicated, block: B:162:0x033f  */
    /* JADX WARN: Code duplicated, block: B:261:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:303:0x0666 A[Catch: all -> 0x0671, Exception -> 0x067a, LOOP:1: B:301:0x0660->B:303:0x0666, LOOP_END, TryCatch #11 {Exception -> 0x067a, all -> 0x0671, blocks: (B:294:0x0648, B:296:0x064c, B:298:0x0652, B:300:0x0658, B:301:0x0660, B:303:0x0666, B:309:0x0685, B:310:0x0696, B:312:0x069c, B:316:0x06bb, B:320:0x06c6, B:324:0x06d1, B:325:0x06f0, B:336:0x0745, B:340:0x0768, B:290:0x063b, B:330:0x0727, B:333:0x073a), top: B:388:0x04b6 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x069c A[Catch: all -> 0x0671, Exception -> 0x067a, TryCatch #11 {Exception -> 0x067a, all -> 0x0671, blocks: (B:294:0x0648, B:296:0x064c, B:298:0x0652, B:300:0x0658, B:301:0x0660, B:303:0x0666, B:309:0x0685, B:310:0x0696, B:312:0x069c, B:316:0x06bb, B:320:0x06c6, B:324:0x06d1, B:325:0x06f0, B:336:0x0745, B:340:0x0768, B:290:0x063b, B:330:0x0727, B:333:0x073a), top: B:388:0x04b6 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:315:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:318:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:319:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:322:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:323:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r6v9, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r8v12, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x033d -> B:163:0x0341). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
    }
}
