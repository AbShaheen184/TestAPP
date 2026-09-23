package androidx.room.coroutines;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.lifecycle.m0;
import androidx.work.impl.h0;
import com.app.mlounge.data.providers.l0;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.MusicStreamResult;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.f0;
import com.app.mlounge.ui.viewmodel.h1;
import com.app.mlounge.ui.viewmodel.j0;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i, com.app.mlounge.data.repository.r rVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 6;
        this.z = rVar;
        this.B = str;
        this.y = i;
        this.A = str2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x0117 A[RETURN] */
    private final Object e(Object obj) {
        kotlin.coroutines.intrinsics.a aVar;
        Object objWithContext;
        MusicStreamResult musicStreamResult;
        Object objFirst;
        String str;
        String str2;
        String strC;
        j0 j0Var = (j0) this.B;
        MutableSharedFlow mutableSharedFlow = j0Var.B;
        MusicTrack musicTrack = (MusicTrack) this.A;
        int i = this.y;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.d dVar = null;
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
        if (i == 0) {
            kotlin.a.e(obj);
            com.app.mlounge.data.repository.a0 a0Var = j0Var.c;
            String strD = musicTrack.d();
            String strF = musicTrack.f();
            this.y = 1;
            a0Var.getClass();
            aVar = aVar2;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new c0(a0Var, strD, strF, dVar, 8), this);
            if (objWithContext != aVar) {
            }
            return aVar;
        }
        if (i == 1) {
            kotlin.a.e(obj);
            objWithContext = obj;
            aVar = aVar2;
        } else {
            if (i == 2) {
                kotlin.a.e(obj);
                return yVar;
            }
            if (i != 3) {
                if (i == 4) {
                    kotlin.a.e(obj);
                    return yVar;
                }
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            musicStreamResult = (MusicStreamResult) this.z;
            kotlin.a.e(obj);
            objFirst = obj;
            aVar = aVar2;
        }
        str = (String) objFirst;
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var), null, null, new androidx.compose.animation.core.f(j0Var, str, musicStreamResult.b(), musicTrack.g(), null, 21), 3, null);
            return yVar;
        }
        if (kotlin.jvm.internal.l.a(musicStreamResult.a(), "aac")) {
            str2 = ".m4a";
        } else {
            str2 = ".mp3";
        }
        com.app.mlounge.data.download.h.i(j0Var.d, musicStreamResult.b(), musicTrack.b() + " - " + musicTrack.g() + str2, musicTrack.g(), "music", musicTrack.d(), musicTrack.e(), "HQ", null, null, 0, 0, 0, 3584);
        strC = androidx.constraintlayout.core.g.c(musicTrack.g(), " started");
        this.z = null;
        this.y = 4;
        if (mutableSharedFlow.emit(strC, this) != aVar) {
            return aVar;
        }
        return yVar;
        musicStreamResult = (MusicStreamResult) objWithContext;
        if (musicStreamResult == null) {
            this.z = null;
            this.y = 2;
            if (mutableSharedFlow.emit("Failed to resolve download link", this) != aVar) {
                return yVar;
            }
        } else {
            Flow flow = j0Var.e.M;
            this.z = musicStreamResult;
            this.y = 3;
            objFirst = FlowKt.first(flow, this);
            if (objFirst != aVar) {
                str = (String) objFirst;
                if (str != null) {
                    BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var), null, null, new androidx.compose.animation.core.f(j0Var, str, musicStreamResult.b(), musicTrack.g(), null, 21), 3, null);
                    return yVar;
                }
                if (kotlin.jvm.internal.l.a(musicStreamResult.a(), "aac")) {
                    str2 = ".m4a";
                } else {
                    str2 = ".mp3";
                }
                com.app.mlounge.data.download.h.i(j0Var.d, musicStreamResult.b(), musicTrack.b() + " - " + musicTrack.g() + str2, musicTrack.g(), "music", musicTrack.d(), musicTrack.e(), "HQ", null, null, 0, 0, 0, 3584);
                strC = androidx.constraintlayout.core.g.c(musicTrack.g(), " started");
                this.z = null;
                this.y = 4;
                if (mutableSharedFlow.emit(strC, this) != aVar) {
                    return yVar;
                }
            }
        }
        return aVar;
    }

    private final Object f(Object obj) {
        String str = (String) this.B;
        MusicArtistDetail musicArtistDetail = (MusicArtistDetail) this.A;
        j0 j0Var = (j0) this.z;
        int i = this.y;
        if (i == 0) {
            kotlin.a.e(obj);
            com.app.mlounge.data.repository.a0 a0Var = j0Var.c;
            com.app.mlounge.data.local.entity.f fVar = new com.app.mlounge.data.local.entity.f("music_artist_".concat(str), "music_artist", musicArtistDetail.d(), musicArtistDetail.c(), null, null, null, "Artist", 0L, str, (String) j0Var.r.getValue(), 368);
            this.y = 1;
            Object objF = a0Var.a.f(fVar, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objF == aVar) {
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

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c0 c0Var = new c0((CompletableDeferred) this.B, (kotlin.jvm.functions.p) this.A, dVar);
                c0Var.z = obj;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0((kotlin.jvm.functions.p) this.A, (androidx.concurrent.futures.i) this.B, dVar);
                c0Var2.z = obj;
                return c0Var2;
            case 2:
                return new c0((h0) this.z, (androidx.work.x) this.B, (androidx.work.impl.utils.n) this.A, dVar, 2);
            case 3:
                return new c0((androidx.media3.exoplayer.dash.manifest.t) this.z, (androidx.work.impl.model.p) this.B, (androidx.work.impl.constraints.h) this.A, dVar, 3);
            case 4:
                c0 c0Var3 = new c0((coil3.p) this.B, (coil3.request.g) this.A, dVar, 4);
                c0Var3.z = obj;
                return c0Var3;
            case 5:
                return new c0((coil3.compose.i) this.B, (coil3.compose.c) this.A, dVar, 5);
            case 6:
                return new c0(this.y, (com.app.mlounge.data.repository.r) this.z, (String) this.B, (String) this.A, dVar);
            case 7:
                c0 c0Var4 = new c0((l0) this.B, (String) this.A, dVar, 7);
                c0Var4.z = obj;
                return c0Var4;
            case 8:
                return new c0((com.app.mlounge.data.repository.a0) this.z, (String) this.B, (String) this.A, dVar, 8);
            case 9:
                return new c0((j0) this.z, (MusicTrack) this.B, (kotlin.jvm.functions.w) this.A, dVar, 9);
            case 10:
                return new c0((kotlin.jvm.functions.a) this.z, (a1) this.B, (a1) this.A, dVar, 10);
            case 11:
                return new c0((androidx.compose.foundation.lazy.grid.x) this.z, (com.app.mlounge.ui.viewmodel.c) this.B, (w2) this.A, dVar, 11);
            case 12:
                return new c0((com.app.mlounge.ui.viewmodel.g) this.z, (androidx.compose.ui.focus.y) this.B, (a1) this.A, dVar, 12);
            case 13:
                return new c0((com.app.mlounge.ui.viewmodel.g) this.z, (Map) this.B, (a1) this.A, dVar, 13);
            case 14:
                return new c0((androidx.compose.foundation.lazy.grid.x) this.z, (f0) this.B, (w2) this.A, dVar, 14);
            case 15:
                return new c0((androidx.compose.foundation.lazy.grid.x) this.z, (j0) this.B, (w2) this.A, dVar, 15);
            case 16:
                return new c0((b2) this.z, (androidx.compose.ui.focus.y) this.B, (a1) this.A, dVar, 16);
            case 17:
                return new c0((androidx.compose.foundation.lazy.grid.x) this.z, (b2) this.B, (w2) this.A, dVar, 17);
            case 18:
                return new c0((HiAnimeDetailData) this.z, (com.app.mlounge.ui.viewmodel.g) this.B, (String) this.A, dVar, 18);
            case 19:
                return new c0((com.app.mlounge.ui.viewmodel.g) this.z, (String) this.B, (String) this.A, dVar, 19);
            case 20:
                return new c0((com.app.mlounge.ui.viewmodel.r) this.B, (String) this.A, dVar, 20);
            case 21:
                return new c0((GameDetailResponse) this.z, (com.app.mlounge.ui.viewmodel.r) this.B, (String) this.A, dVar, 21);
            case 22:
                return new c0((com.app.mlounge.ui.viewmodel.r) this.z, (String) this.B, (String) this.A, dVar, 22);
            case 23:
                return new c0((com.app.mlounge.ui.viewmodel.a0) this.z, (String) this.B, (String) this.A, dVar, 23);
            case 24:
                c0 c0Var5 = new c0((com.app.mlounge.ui.viewmodel.a0) this.B, (String) this.A, dVar, 24);
                c0Var5.z = obj;
                return c0Var5;
            case 25:
                c0 c0Var6 = new c0((List) this.B, (com.app.mlounge.ui.viewmodel.a0) this.A, dVar, 25);
                c0Var6.z = obj;
                return c0Var6;
            case 26:
                return new c0((j0) this.B, (MusicTrack) this.A, dVar, 26);
            case 27:
                return new c0((j0) this.z, (String) this.B, (MusicAlbumDetail) this.A, dVar, 27);
            case 28:
                return new c0((j0) this.z, (String) this.B, (MusicArtistDetail) this.A, dVar, 28);
            default:
                return new c0((h1) this.z, (String) this.B, (String) this.A, dVar, 29);
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
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:347:0x0751  */
    /* JADX WARN: Code duplicated, block: B:349:0x0766  */
    /* JADX WARN: Code duplicated, block: B:351:0x076a  */
    /* JADX WARN: Code duplicated, block: B:353:0x0772  */
    /* JADX WARN: Code duplicated, block: B:354:0x077d  */
    /* JADX WARN: Code duplicated, block: B:357:0x0786  */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x072d, code lost:
    
        if (r0 == r14) goto L343;
     */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 2386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.B = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.B = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(kotlin.jvm.functions.p pVar, androidx.concurrent.futures.i iVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 1;
        this.A = (kotlin.coroutines.jvm.internal.i) pVar;
        this.B = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(CompletableDeferred completableDeferred, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 0;
        this.B = completableDeferred;
        this.A = (kotlin.coroutines.jvm.internal.i) pVar;
    }
}
