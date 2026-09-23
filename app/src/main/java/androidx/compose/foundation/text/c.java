package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.e3;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;

    public /* synthetic */ c(long j, int i) {
        this.e = i;
        this.y = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        CancellableContinuationImpl cancellableContinuationImpl;
        Object lVar;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        long j = this.y;
        switch (i) {
            case 0:
                androidx.compose.ui.draw.d dVar = (androidx.compose.ui.draw.d) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.e.d() >> 32)) / 2.0f;
                return dVar.b(new e3(fIntBitsToFloat, kotlin.math.a.k(dVar, fIntBitsToFloat), new androidx.compose.ui.graphics.m(j, 5)));
            case 1:
                ((androidx.compose.ui.semantics.a0) obj).b(androidx.compose.foundation.text.selection.j0.c, new androidx.compose.foundation.text.selection.i0(f0.e, this.y, androidx.compose.foundation.text.selection.h0.y, true));
                return yVar;
            case 2:
                androidx.compose.runtime.d dVar2 = (androidx.compose.runtime.d) obj;
                kotlin.jvm.functions.l lVar2 = dVar2.b;
                if (lVar2 != null && (cancellableContinuationImpl = dVar2.a) != null) {
                    try {
                        lVar = lVar2.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        lVar = new kotlin.l(th);
                    }
                    cancellableContinuationImpl.resumeWith(lVar);
                    break;
                }
                return yVar;
            case 3:
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    cVarU.f(1, j);
                    int iU = _COROUTINE.b.u(cVarU, "id");
                    int iU2 = _COROUTINE.b.u(cVarU, "state");
                    int iU3 = _COROUTINE.b.u(cVarU, "worker_class_name");
                    int iU4 = _COROUTINE.b.u(cVarU, "input_merger_class_name");
                    int iU5 = _COROUTINE.b.u(cVarU, "input");
                    int iU6 = _COROUTINE.b.u(cVarU, "output");
                    int iU7 = _COROUTINE.b.u(cVarU, "initial_delay");
                    int iU8 = _COROUTINE.b.u(cVarU, "interval_duration");
                    int iU9 = _COROUTINE.b.u(cVarU, "flex_duration");
                    int iU10 = _COROUTINE.b.u(cVarU, "run_attempt_count");
                    int iU11 = _COROUTINE.b.u(cVarU, "backoff_policy");
                    int iU12 = _COROUTINE.b.u(cVarU, "backoff_delay_duration");
                    int iU13 = _COROUTINE.b.u(cVarU, "last_enqueue_time");
                    int iU14 = _COROUTINE.b.u(cVarU, "minimum_retention_duration");
                    int iU15 = _COROUTINE.b.u(cVarU, "schedule_requested_at");
                    int iU16 = _COROUTINE.b.u(cVarU, "run_in_foreground");
                    int iU17 = _COROUTINE.b.u(cVarU, "out_of_quota_policy");
                    int iU18 = _COROUTINE.b.u(cVarU, "period_count");
                    int iU19 = _COROUTINE.b.u(cVarU, "generation");
                    int iU20 = _COROUTINE.b.u(cVarU, "next_schedule_time_override");
                    int iU21 = _COROUTINE.b.u(cVarU, "next_schedule_time_override_generation");
                    int iU22 = _COROUTINE.b.u(cVarU, "stop_reason");
                    int iU23 = _COROUTINE.b.u(cVarU, "trace_tag");
                    int iU24 = _COROUTINE.b.u(cVarU, "backoff_on_system_interruptions");
                    int iU25 = _COROUTINE.b.u(cVarU, "required_network_type");
                    int iU26 = _COROUTINE.b.u(cVarU, "required_network_request");
                    int iU27 = _COROUTINE.b.u(cVarU, "requires_charging");
                    int iU28 = _COROUTINE.b.u(cVarU, "requires_device_idle");
                    int iU29 = _COROUTINE.b.u(cVarU, "requires_battery_not_low");
                    int iU30 = _COROUTINE.b.u(cVarU, "requires_storage_not_low");
                    int iU31 = _COROUTINE.b.u(cVarU, "trigger_content_update_delay");
                    int iU32 = _COROUTINE.b.u(cVarU, "trigger_max_content_delay");
                    int iU33 = _COROUTINE.b.u(cVarU, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cVarU.Q()) {
                        String strF = cVarU.F(iU);
                        int i2 = iU13;
                        int i3 = iU14;
                        androidx.work.i0 i0VarE = com.google.android.gms.dynamite.g.E((int) cVarU.getLong(iU2));
                        String strF2 = cVarU.F(iU3);
                        String strF3 = cVarU.F(iU4);
                        byte[] blob = cVarU.getBlob(iU5);
                        androidx.work.i iVar = androidx.work.i.b;
                        androidx.work.i iVarL = android.support.v4.media.session.b.l(blob);
                        androidx.work.i iVarL2 = android.support.v4.media.session.b.l(cVarU.getBlob(iU6));
                        long j2 = cVarU.getLong(iU7);
                        long j3 = cVarU.getLong(iU8);
                        long j4 = cVarU.getLong(iU9);
                        int i4 = (int) cVarU.getLong(iU10);
                        int i5 = iU2;
                        int i6 = iU3;
                        androidx.work.a aVarB = com.google.android.gms.dynamite.g.B((int) cVarU.getLong(iU11));
                        long j5 = cVarU.getLong(iU12);
                        long j6 = cVarU.getLong(i2);
                        long j7 = cVarU.getLong(i3);
                        int i7 = iU;
                        int i8 = iU15;
                        long j8 = cVarU.getLong(i8);
                        iU15 = i8;
                        int i9 = iU16;
                        boolean z = ((int) cVarU.getLong(i9)) != 0;
                        int i10 = iU17;
                        int i11 = iU4;
                        androidx.work.f0 f0VarD = com.google.android.gms.dynamite.g.D((int) cVarU.getLong(i10));
                        int i12 = iU18;
                        int i13 = iU5;
                        int i14 = (int) cVarU.getLong(i12);
                        int i15 = iU19;
                        int i16 = (int) cVarU.getLong(i15);
                        int i17 = iU20;
                        long j9 = cVarU.getLong(i17);
                        int i18 = iU21;
                        int i19 = (int) cVarU.getLong(i18);
                        int i20 = iU22;
                        int i21 = (int) cVarU.getLong(i20);
                        int i22 = iU23;
                        String strF4 = cVarU.isNull(i22) ? null : cVarU.F(i22);
                        int i23 = iU24;
                        Integer numValueOf = cVarU.isNull(i23) ? null : Integer.valueOf((int) cVarU.getLong(i23));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i24 = iU25;
                        androidx.work.z zVarC = com.google.android.gms.dynamite.g.C((int) cVarU.getLong(i24));
                        int i25 = iU26;
                        androidx.work.impl.utils.f fVarQ = com.google.android.gms.dynamite.g.Q(cVarU.getBlob(i25));
                        iU25 = i24;
                        iU26 = i25;
                        int i26 = iU27;
                        boolean z2 = ((int) cVarU.getLong(i26)) != 0;
                        iU27 = i26;
                        int i27 = iU28;
                        boolean z3 = ((int) cVarU.getLong(i27)) != 0;
                        int i28 = iU29;
                        boolean z4 = ((int) cVarU.getLong(i28)) != 0;
                        iU29 = i28;
                        int i29 = iU30;
                        int i30 = iU31;
                        int i31 = iU32;
                        int i32 = iU33;
                        arrayList.add(new androidx.work.impl.model.p(strF, i0VarE, strF2, strF3, iVarL, iVarL2, j2, j3, j4, new androidx.work.e(fVarQ, zVarC, z2, z3, z4, ((int) cVarU.getLong(i29)) != 0, cVarU.getLong(i30), cVarU.getLong(i31), com.google.android.gms.dynamite.g.h(cVarU.getBlob(i32))), i4, aVarB, j5, j6, j7, j8, z, f0VarD, i14, i16, j9, i19, i21, strF4, boolValueOf));
                        iU30 = i29;
                        iU4 = i11;
                        iU17 = i10;
                        iU19 = i15;
                        iU22 = i20;
                        iU24 = i23;
                        iU33 = i32;
                        iU31 = i30;
                        iU32 = i31;
                        iU2 = i5;
                        iU13 = i2;
                        iU16 = i9;
                        iU20 = i17;
                        iU21 = i18;
                        iU23 = i22;
                        iU = i7;
                        iU14 = i3;
                        iU3 = i6;
                        iU28 = i27;
                        iU5 = i13;
                        iU18 = i12;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarU.close();
                }
            case 4:
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("UPDATE downloads SET status = 'cancelled' WHERE id = ?");
                try {
                    cVarU2.f(1, j);
                    cVarU2.Q();
                    return yVar;
                } finally {
                    cVarU2.close();
                }
            case 5:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT * FROM downloads WHERE id = ?");
                try {
                    cVarU3.f(1, j);
                    int iU34 = _COROUTINE.b.u(cVarU3, "id");
                    int iU35 = _COROUTINE.b.u(cVarU3, "url");
                    int iU36 = _COROUTINE.b.u(cVarU3, "fileName");
                    int iU37 = _COROUTINE.b.u(cVarU3, "title");
                    int iU38 = _COROUTINE.b.u(cVarU3, "contentType");
                    int iU39 = _COROUTINE.b.u(cVarU3, "contentId");
                    int iU40 = _COROUTINE.b.u(cVarU3, "posterPath");
                    int iU41 = _COROUTINE.b.u(cVarU3, "quality");
                    int iU42 = _COROUTINE.b.u(cVarU3, "size");
                    int iU43 = _COROUTINE.b.u(cVarU3, "status");
                    int iU44 = _COROUTINE.b.u(cVarU3, "progress");
                    int iU45 = _COROUTINE.b.u(cVarU3, "downloadedBytes");
                    int iU46 = _COROUTINE.b.u(cVarU3, "totalBytes");
                    int iU47 = _COROUTINE.b.u(cVarU3, "filePath");
                    int iU48 = _COROUTINE.b.u(cVarU3, "headers");
                    int iU49 = _COROUTINE.b.u(cVarU3, "addedAt");
                    int iU50 = _COROUTINE.b.u(cVarU3, "completedAt");
                    int iU51 = _COROUTINE.b.u(cVarU3, "tmdbId");
                    int iU52 = _COROUTINE.b.u(cVarU3, "season");
                    int iU53 = _COROUTINE.b.u(cVarU3, "episode");
                    int iU54 = _COROUTINE.b.u(cVarU3, "failureReason");
                    return cVarU3.Q() ? new com.app.mlounge.data.local.entity.a(cVarU3.getLong(iU34), cVarU3.F(iU35), cVarU3.F(iU36), cVarU3.F(iU37), cVarU3.F(iU38), cVarU3.isNull(iU39) ? null : cVarU3.F(iU39), cVarU3.isNull(iU40) ? null : cVarU3.F(iU40), cVarU3.isNull(iU41) ? null : cVarU3.F(iU41), cVarU3.isNull(iU42) ? null : cVarU3.F(iU42), cVarU3.F(iU43), (int) cVarU3.getLong(iU44), cVarU3.getLong(iU45), cVarU3.getLong(iU46), cVarU3.isNull(iU47) ? null : cVarU3.F(iU47), cVarU3.isNull(iU48) ? null : cVarU3.F(iU48), cVarU3.getLong(iU49), cVarU3.isNull(iU50) ? null : Long.valueOf(cVarU3.getLong(iU50)), (int) cVarU3.getLong(iU51), (int) cVarU3.getLong(iU52), (int) cVarU3.getLong(iU53), cVarU3.isNull(iU54) ? null : cVarU3.F(iU54)) : null;
                } finally {
                    cVarU3.close();
                }
            case 6:
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("DELETE FROM downloads WHERE id = ?");
                try {
                    cVarU4.f(1, j);
                    cVarU4.Q();
                    return yVar;
                } finally {
                    cVarU4.close();
                }
            case 7:
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.sqlite.c cVarU5 = aVar5.U("UPDATE downloads SET status = 'pending' WHERE id = ?");
                try {
                    cVarU5.f(1, j);
                    cVarU5.Q();
                    return yVar;
                } finally {
                    cVarU5.close();
                }
            case 8:
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                androidx.sqlite.c cVarU6 = aVar6.U("UPDATE downloads SET status = 'paused' WHERE id = ?");
                try {
                    cVarU6.f(1, j);
                    cVarU6.Q();
                    return yVar;
                } finally {
                    cVarU6.close();
                }
            case 9:
                kotlin.text.g gVar = (kotlin.text.g) obj;
                gVar.getClass();
                int i33 = Integer.parseInt((String) ((kotlin.collections.d0) gVar.a()).get(1));
                int i34 = Integer.parseInt((String) ((kotlin.collections.d0) gVar.a()).get(2));
                int i35 = Integer.parseInt((String) ((kotlin.collections.d0) gVar.a()).get(3));
                String str = (String) ((kotlin.collections.d0) gVar.a()).get(4);
                long j10 = (((long) i35) * 1000) + (((long) i34) * 60000) + (((long) i33) * 3600000) + ((long) Integer.parseInt((String) ((kotlin.collections.d0) gVar.a()).get(5))) + j;
                if (j10 < 0) {
                    j10 = 0;
                }
                long j11 = 3600000;
                Long lValueOf = Long.valueOf(j10 / j11);
                long j12 = 60000;
                Long lValueOf2 = Long.valueOf((j10 % j11) / j12);
                long j13 = j10 % j12;
                long j14 = 1000;
                return String.format("%02d:%02d:%02d%s%03d", Arrays.copyOf(new Object[]{lValueOf, lValueOf2, Long.valueOf(j13 / j14), str, Long.valueOf(j10 % j14)}, 5));
            default:
                ((androidx.datastore.preferences.core.a) obj).e(com.google.firebase.heartbeatinfo.h.b, Long.valueOf(j));
                return null;
        }
    }
}
