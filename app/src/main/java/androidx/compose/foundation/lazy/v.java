package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.k0;
import androidx.work.f0;
import androidx.work.i0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int y;

    public /* synthetic */ v(int i) {
        this.y = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        int i = this.e;
        int i2 = this.y;
        switch (i) {
            case 0:
                k0 k0Var = (k0) obj;
                androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
                androidx.compose.runtime.snapshots.r.k(fVarE, androidx.compose.runtime.snapshots.r.h(fVarE), fVarE != null ? fVarE.e() : null);
                int i3 = k0Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    k0Var.a(i2 + i4);
                }
                return kotlin.y.a;
            default:
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    cVarU.f(1, i2);
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
                        int i5 = iU14;
                        int i6 = iU;
                        i0 i0VarE = com.google.android.gms.dynamite.g.E((int) cVarU.getLong(iU2));
                        String strF2 = cVarU.F(iU3);
                        String strF3 = cVarU.F(iU4);
                        byte[] blob = cVarU.getBlob(iU5);
                        androidx.work.i iVar = androidx.work.i.b;
                        androidx.work.i iVarL = android.support.v4.media.session.b.l(blob);
                        androidx.work.i iVarL2 = android.support.v4.media.session.b.l(cVarU.getBlob(iU6));
                        long j = cVarU.getLong(iU7);
                        long j2 = cVarU.getLong(iU8);
                        long j3 = cVarU.getLong(iU9);
                        int i7 = (int) cVarU.getLong(iU10);
                        androidx.work.a aVarB = com.google.android.gms.dynamite.g.B((int) cVarU.getLong(iU11));
                        long j4 = cVarU.getLong(iU12);
                        long j5 = cVarU.getLong(iU13);
                        long j6 = cVarU.getLong(i5);
                        int i8 = iU15;
                        long j7 = cVarU.getLong(i8);
                        int i9 = iU12;
                        int i10 = iU16;
                        int i11 = iU13;
                        boolean z = ((int) cVarU.getLong(i10)) != 0;
                        int i12 = iU17;
                        f0 f0VarD = com.google.android.gms.dynamite.g.D((int) cVarU.getLong(i12));
                        int i13 = iU2;
                        int i14 = iU18;
                        int i15 = iU3;
                        int i16 = (int) cVarU.getLong(i14);
                        int i17 = iU19;
                        int i18 = (int) cVarU.getLong(i17);
                        int i19 = iU20;
                        long j8 = cVarU.getLong(i19);
                        int i20 = iU21;
                        int i21 = (int) cVarU.getLong(i20);
                        int i22 = iU22;
                        int i23 = (int) cVarU.getLong(i22);
                        int i24 = iU23;
                        String strF4 = cVarU.isNull(i24) ? null : cVarU.F(i24);
                        int i25 = iU24;
                        Integer numValueOf = cVarU.isNull(i25) ? null : Integer.valueOf((int) cVarU.getLong(i25));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i26 = iU25;
                        androidx.work.z zVarC = com.google.android.gms.dynamite.g.C((int) cVarU.getLong(i26));
                        int i27 = iU26;
                        androidx.work.impl.utils.f fVarQ = com.google.android.gms.dynamite.g.Q(cVarU.getBlob(i27));
                        int i28 = iU27;
                        boolean z2 = ((int) cVarU.getLong(i28)) != 0;
                        int i29 = iU28;
                        boolean z3 = ((int) cVarU.getLong(i29)) != 0;
                        int i30 = iU29;
                        boolean z4 = ((int) cVarU.getLong(i30)) != 0;
                        iU29 = i30;
                        int i31 = iU30;
                        int i32 = iU31;
                        int i33 = iU32;
                        int i34 = iU33;
                        iU33 = i34;
                        arrayList.add(new androidx.work.impl.model.p(strF, i0VarE, strF2, strF3, iVarL, iVarL2, j, j2, j3, new androidx.work.e(fVarQ, zVarC, z2, z3, z4, ((int) cVarU.getLong(i31)) != 0, cVarU.getLong(i32), cVarU.getLong(i33), com.google.android.gms.dynamite.g.h(cVarU.getBlob(i34))), i7, aVarB, j4, j5, j6, j7, z, f0VarD, i16, i18, j8, i21, i23, strF4, boolValueOf));
                        iU31 = i32;
                        iU32 = i33;
                        iU12 = i9;
                        iU13 = i11;
                        iU15 = i8;
                        iU17 = i12;
                        iU16 = i10;
                        iU20 = i19;
                        iU19 = i17;
                        iU21 = i20;
                        iU22 = i22;
                        iU24 = i25;
                        iU14 = i5;
                        iU23 = i24;
                        iU30 = i31;
                        iU2 = i13;
                        iU25 = i26;
                        iU26 = i27;
                        iU27 = i28;
                        iU = i6;
                        iU28 = i29;
                        iU3 = i15;
                        iU18 = i14;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarU.close();
                }
        }
    }

    public /* synthetic */ v(y yVar, int i) {
        this.y = i;
    }
}
