package com.app.mlounge.ui.screens.adult;

import androidx.activity.compose.t;
import androidx.lifecycle.m0;
import androidx.room.s;
import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.ui.viewmodel.a1;
import com.app.mlounge.ui.viewmodel.b1;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.c0;
import com.app.mlounge.ui.viewmodel.f0;
import com.app.mlounge.ui.viewmodel.g0;
import com.app.mlounge.ui.viewmodel.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.text.i;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.o;
import okhttp3.internal.http2.b0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        String[] strArrNames;
        long jA;
        int i = 26;
        int i2 = 4;
        int i3 = 24;
        int i4 = 0;
        int i5 = 1;
        Object[] objArr = 0;
        objArr = 0;
        switch (this.e) {
            case 0:
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) this.z;
                aVar.getClass();
                MutableStateFlow mutableStateFlow = cVar.o;
                if (mutableStateFlow.getValue() != aVar) {
                    mutableStateFlow.setValue(aVar);
                    MutableStateFlow mutableStateFlow2 = cVar.e;
                    w wVar = w.e;
                    mutableStateFlow2.setValue(wVar);
                    cVar.g.setValue(wVar);
                    cVar.q.setValue(null);
                    cVar.m.setValue(null);
                    cVar.E = 1;
                    cVar.F = true;
                    BuildersKt__Builders_commonKt.launch$default(m0.g(cVar), null, null, new s(cVar, aVar, objArr, i3), 3, null);
                }
                return y.a;
            case 1:
                com.app.mlounge.ui.viewmodel.c cVar2 = (com.app.mlounge.ui.viewmodel.c) this.y;
                String str = (String) this.z;
                str.getClass();
                cVar2.q.setValue(str);
                cVar2.e();
                return y.a;
            case 2:
                com.app.mlounge.ui.viewmodel.g gVar = (com.app.mlounge.ui.viewmodel.g) this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(gVar), null, null, new s((HiAnimeDetailData) this.z, gVar, objArr, i), 3, null);
                return y.a;
            case 3:
                com.app.mlounge.ui.viewmodel.g gVar2 = (com.app.mlounge.ui.viewmodel.g) this.y;
                String str2 = (String) this.z;
                str2.getClass();
                gVar2.r.setValue(str2);
                gVar2.e();
                return y.a;
            case 4:
                p pVar = (p) this.y;
                com.app.mlounge.data.local.entity.b bVar = (com.app.mlounge.data.local.entity.b) this.z;
                pVar.invoke(bVar.b, bVar.a);
                return y.a;
            case 5:
                ((l) this.y).invoke((GamePlatform) this.z);
                return y.a;
            case 6:
                f0 f0Var = (f0) this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(f0Var), null, null, new c0(f0Var, (TmdbMovieDetailResponse) this.z, objArr, i5), 3, null);
                return y.a;
            case 7:
                ((l) this.y).invoke(Integer.valueOf(((TmdbMovie) this.z).a()));
                return y.a;
            case 8:
                j0 j0Var = (j0) this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var), null, null, new g0(j0Var, (MusicAlbumDetail) this.z, (kotlin.coroutines.d) objArr, i4), 3, null);
                return y.a;
            case 9:
                ((l) this.y).invoke((MusicTrack) this.z);
                return y.a;
            case 10:
                j0 j0Var2 = (j0) this.y;
                MusicTrack musicTrack = (MusicTrack) this.z;
                musicTrack.getClass();
                BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var2), null, null, new androidx.room.coroutines.c0(j0Var2, musicTrack, objArr, i), 3, null);
                return y.a;
            case 11:
                ((l) this.y).invoke(((MusicAlbum) this.z).d());
                return y.a;
            case 12:
                ((l) this.y).invoke(((MusicArtist) this.z).c());
                return y.a;
            case 13:
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) this.y;
                kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) this.z;
                aVar2.invoke();
                aVar3.invoke();
                return y.a;
            case 14:
                b1 b1Var = (b1) this.y;
                String str3 = (String) this.z;
                str3.getClass();
                MutableStateFlow mutableStateFlow3 = b1Var.J;
                if (!kotlin.jvm.internal.l.a(mutableStateFlow3.getValue(), str3)) {
                    mutableStateFlow3.setValue(str3);
                    b1Var.d.b(str3);
                    String str4 = (String) b1Var.h.getValue();
                    if (str4.length() >= 2 && ((Number) b1Var.F.getValue()).intValue() == 5) {
                        Job job = b1Var.O;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        b1Var.r.setValue(w.e);
                        b1Var.O = BuildersKt__Builders_commonKt.launch$default(m0.g(b1Var), null, null, new a1(b1Var, str4, null, 2), 3, null);
                    }
                }
                return y.a;
            case 15:
                b1 b1Var2 = (b1) this.y;
                com.app.mlounge.data.repository.a aVar4 = (com.app.mlounge.data.repository.a) this.z;
                aVar4.getClass();
                MutableStateFlow mutableStateFlow4 = b1Var2.L;
                if (mutableStateFlow4.getValue() != aVar4) {
                    mutableStateFlow4.setValue(aVar4);
                    String str5 = (String) b1Var2.h.getValue();
                    if (str5.length() >= 2 && ((Number) b1Var2.F.getValue()).intValue() == 5) {
                        Job job2 = b1Var2.O;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        b1Var2.t.setValue(w.e);
                        b1Var2.O = BuildersKt__Builders_commonKt.launch$default(m0.g(b1Var2), null, null, new a1(b1Var2, str5, null, 0), 3, null);
                    }
                }
                return y.a;
            case 16:
                t tVar = (t) this.y;
                ((androidx.compose.runtime.a1) this.z).setValue(null);
                tVar.a(null);
                return y.a;
            case 17:
                ((l) this.y).invoke((com.app.mlounge.ui.viewmodel.l) this.z);
                return y.a;
            case 18:
                b2 b2Var = (b2) this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(b2Var), null, null, new g0(b2Var, (TmdbTvDetailResponse) this.z, (kotlin.coroutines.d) objArr, i2), 3, null);
                return y.a;
            case 19:
                ((l) this.y).invoke(Integer.valueOf(((TmdbTvShow) this.z).b()));
                return y.a;
            case 20:
                return ((i) this.y).a((CharSequence) this.z);
            case 21:
                kotlinx.serialization.descriptors.e eVar = (kotlinx.serialization.descriptors.e) this.y;
                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) this.z;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar2.a.getClass();
                kotlinx.serialization.json.internal.i.h(eVar, bVar2);
                int iF = eVar.f();
                for (int i6 = 0; i6 < iF; i6++) {
                    List listH = eVar.h(i6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof o) {
                            arrayList.add(obj);
                        }
                    }
                    o oVar = (o) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (oVar != null && (strArrNames = oVar.names()) != null) {
                        for (String str6 : strArrNames) {
                            String str7 = kotlin.jvm.internal.l.a(eVar.e(), kotlinx.serialization.descriptors.h.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str6)) {
                                throw new kotlinx.serialization.e("The suggested name '" + str6 + "' for " + str7 + ' ' + eVar.g(i6) + " is already one of the names for " + str7 + ' ' + eVar.g(((Number) kotlin.collections.c0.g(str6, linkedHashMap)).intValue()) + " in " + eVar);
                            }
                            linkedHashMap.put(str6, Integer.valueOf(i6));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? x.e : linkedHashMap;
            case 22:
                okhttp3.internal.http2.p pVar2 = (okhttp3.internal.http2.p) this.y;
                okhttp3.internal.http2.x xVar = (okhttp3.internal.http2.x) this.z;
                try {
                    pVar2.e.b(xVar);
                    break;
                } catch (IOException e) {
                    okhttp3.internal.platform.e eVar2 = okhttp3.internal.platform.e.a;
                    okhttp3.internal.platform.e.a.i(4, "Http2Connection.Listener failure for " + pVar2.z, e);
                    try {
                        xVar.e(okhttp3.internal.http2.b.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return y.a;
            case 23:
                com.app.mlounge.ui.screens.downloads.e eVar3 = (com.app.mlounge.ui.screens.downloads.e) this.y;
                b0 b0Var = (b0) this.z;
                z zVar = new z();
                okhttp3.internal.http2.p pVar3 = (okhttp3.internal.http2.p) eVar3.z;
                synchronized (pVar3.U) {
                    try {
                        synchronized (pVar3) {
                            try {
                                b0 b0Var2 = pVar3.P;
                                b0 b0Var3 = new b0();
                                b0Var2.getClass();
                                for (int i7 = 0; i7 < 10; i7++) {
                                    if (((1 << i7) & b0Var2.a) != 0) {
                                        b0Var3.b(i7, b0Var2.b[i7]);
                                    }
                                }
                                for (int i8 = 0; i8 < 10; i8++) {
                                    if (((1 << i8) & b0Var.a) != 0) {
                                        b0Var3.b(i8, b0Var.b[i8]);
                                    }
                                }
                                zVar.e = b0Var3;
                                jA = ((long) b0Var3.a()) - ((long) b0Var2.a());
                                if (jA != 0 && !pVar3.y.isEmpty()) {
                                    objArr = (okhttp3.internal.http2.x[]) pVar3.y.values().toArray(new okhttp3.internal.http2.x[0]);
                                }
                                b0 b0Var4 = (b0) zVar.e;
                                b0Var4.getClass();
                                pVar3.P = b0Var4;
                                okhttp3.internal.concurrent.c.c(pVar3.G, pVar3.z + " onSettings", 0L, new b(i3, pVar3, zVar), 6);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            pVar3.U.a((b0) zVar.e);
                        } catch (IOException e2) {
                            okhttp3.internal.http2.b bVar3 = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                            pVar3.a(bVar3, bVar3, e2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (objArr != 0) {
                    int length = objArr.length;
                    while (i4 < length) {
                        okhttp3.internal.http2.x xVar2 = objArr[i4];
                        synchronized (xVar2) {
                            xVar2.B += jA;
                            if (jA > 0) {
                                xVar2.notifyAll();
                            }
                            break;
                        }
                        i4++;
                    }
                }
                return y.a;
            default:
                okhttp3.internal.http2.p pVar4 = (okhttp3.internal.http2.p) this.y;
                pVar4.e.a(pVar4, (b0) ((z) this.z).e);
                return y.a;
        }
    }

    public /* synthetic */ b(j0 j0Var, Object obj, Object obj2, int i) {
        this.e = i;
        this.y = j0Var;
        this.z = obj;
    }
}
