package androidx.navigation.compose;

import androidx.lifecycle.m0;
import androidx.room.b0;
import androidx.work.f0;
import androidx.work.i0;
import androidx.work.z;
import com.app.mlounge.ChqMessagingService;
import com.app.mlounge.data.anime.AnikotoScraper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.y;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ r(androidx.room.r rVar) {
        this.e = 5;
    }

    private final Object e(Object obj) throws Exception {
        androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
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
                int i = iU14;
                ArrayList arrayList2 = arrayList;
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
                int i2 = (int) cVarU.getLong(iU10);
                int i3 = iU2;
                int i4 = iU3;
                androidx.work.a aVarB = com.google.android.gms.dynamite.g.B((int) cVarU.getLong(iU11));
                long j4 = cVarU.getLong(iU12);
                long j5 = cVarU.getLong(iU13);
                long j6 = cVarU.getLong(i);
                int i5 = iU15;
                long j7 = cVarU.getLong(i5);
                int i6 = iU;
                int i7 = iU16;
                boolean z = ((int) cVarU.getLong(i7)) != 0;
                int i8 = iU17;
                int i9 = iU4;
                f0 f0VarD = com.google.android.gms.dynamite.g.D((int) cVarU.getLong(i8));
                int i10 = iU18;
                int i11 = iU5;
                int i12 = (int) cVarU.getLong(i10);
                int i13 = iU19;
                int i14 = (int) cVarU.getLong(i13);
                int i15 = iU20;
                long j8 = cVarU.getLong(i15);
                int i16 = iU21;
                int i17 = (int) cVarU.getLong(i16);
                int i18 = iU22;
                int i19 = (int) cVarU.getLong(i18);
                int i20 = iU23;
                Boolean boolValueOf = null;
                String strF4 = cVarU.isNull(i20) ? null : cVarU.F(i20);
                int i21 = iU24;
                Integer numValueOf = cVarU.isNull(i21) ? null : Integer.valueOf((int) cVarU.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iU25;
                Boolean bool = boolValueOf;
                z zVarC = com.google.android.gms.dynamite.g.C((int) cVarU.getLong(i22));
                int i23 = iU26;
                androidx.work.impl.utils.f fVarQ = com.google.android.gms.dynamite.g.Q(cVarU.getBlob(i23));
                iU25 = i22;
                iU26 = i23;
                int i24 = iU27;
                boolean z2 = ((int) cVarU.getLong(i24)) != 0;
                iU27 = i24;
                int i25 = iU28;
                boolean z3 = ((int) cVarU.getLong(i25)) != 0;
                int i26 = iU29;
                boolean z4 = ((int) cVarU.getLong(i26)) != 0;
                iU29 = i26;
                int i27 = iU30;
                int i28 = iU31;
                int i29 = iU32;
                int i30 = iU33;
                iU33 = i30;
                arrayList2.add(new androidx.work.impl.model.p(strF, i0VarE, strF2, strF3, iVarL, iVarL2, j, j2, j3, new androidx.work.e(fVarQ, zVarC, z2, z3, z4, ((int) cVarU.getLong(i27)) != 0, cVarU.getLong(i28), cVarU.getLong(i29), com.google.android.gms.dynamite.g.h(cVarU.getBlob(i30))), i2, aVarB, j4, j5, j6, j7, z, f0VarD, i12, i14, j8, i17, i19, strF4, bool));
                iU30 = i27;
                iU4 = i9;
                iU17 = i8;
                iU19 = i13;
                iU22 = i18;
                iU24 = i21;
                iU31 = i28;
                iU32 = i29;
                iU2 = i3;
                iU14 = i;
                iU3 = i4;
                arrayList = arrayList2;
                iU = i6;
                iU15 = i5;
                iU16 = i7;
                iU20 = i15;
                iU21 = i16;
                iU23 = i20;
                iU28 = i25;
                iU5 = i11;
                iU18 = i10;
            }
            return arrayList;
        } finally {
            cVarU.close();
        }
    }

    private final Object f(Object obj) throws Exception {
        androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            cVarU.f(1, Context.VERSION_ES6);
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
                int i = iU13;
                int i2 = iU14;
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
                int i3 = (int) cVarU.getLong(iU10);
                int i4 = iU;
                int i5 = iU2;
                androidx.work.a aVarB = com.google.android.gms.dynamite.g.B((int) cVarU.getLong(iU11));
                long j4 = cVarU.getLong(iU12);
                long j5 = cVarU.getLong(i);
                long j6 = cVarU.getLong(i2);
                int i6 = iU15;
                long j7 = cVarU.getLong(i6);
                iU15 = i6;
                int i7 = iU16;
                int i8 = iU3;
                boolean z = ((int) cVarU.getLong(i7)) != 0;
                int i9 = iU17;
                int i10 = iU4;
                f0 f0VarD = com.google.android.gms.dynamite.g.D((int) cVarU.getLong(i9));
                int i11 = iU18;
                int i12 = (int) cVarU.getLong(i11);
                int i13 = iU19;
                int i14 = (int) cVarU.getLong(i13);
                int i15 = iU20;
                long j8 = cVarU.getLong(i15);
                int i16 = iU21;
                int i17 = (int) cVarU.getLong(i16);
                iU21 = i16;
                iU22 = iU22;
                int i18 = (int) cVarU.getLong(iU22);
                int i19 = iU23;
                Boolean boolValueOf = null;
                String strF4 = cVarU.isNull(i19) ? null : cVarU.F(i19);
                int i20 = iU24;
                Integer numValueOf = cVarU.isNull(i20) ? null : Integer.valueOf((int) cVarU.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iU25;
                z zVarC = com.google.android.gms.dynamite.g.C((int) cVarU.getLong(i21));
                int i22 = iU26;
                androidx.work.impl.utils.f fVarQ = com.google.android.gms.dynamite.g.Q(cVarU.getBlob(i22));
                int i23 = iU27;
                boolean z2 = ((int) cVarU.getLong(i23)) != 0;
                int i24 = iU28;
                boolean z3 = ((int) cVarU.getLong(i24)) != 0;
                int i25 = iU29;
                boolean z4 = ((int) cVarU.getLong(i25)) != 0;
                iU29 = i25;
                int i26 = iU30;
                int i27 = iU31;
                int i28 = iU32;
                iU31 = i27;
                int i29 = iU33;
                arrayList.add(new androidx.work.impl.model.p(strF, i0VarE, strF2, strF3, iVarL, iVarL2, j, j2, j3, new androidx.work.e(fVarQ, zVarC, z2, z3, z4, ((int) cVarU.getLong(i26)) != 0, cVarU.getLong(i27), cVarU.getLong(i28), com.google.android.gms.dynamite.g.h(cVarU.getBlob(i29))), i3, aVarB, j4, j5, j6, j7, z, f0VarD, i12, i14, j8, i17, i18, strF4, bool));
                iU28 = i24;
                iU4 = i10;
                iU17 = i9;
                iU18 = i11;
                iU19 = i13;
                iU20 = i15;
                iU23 = i19;
                iU24 = i20;
                iU25 = i21;
                iU26 = i22;
                iU27 = i23;
                iU33 = i29;
                iU32 = i28;
                iU30 = i26;
                iU = i4;
                iU3 = i8;
                iU13 = i;
                iU14 = i2;
                iU2 = i5;
                iU16 = i7;
            }
            return arrayList;
        } finally {
            cVarU.close();
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z = false;
        switch (this.e) {
            case 0:
                return ((androidx.navigation.i) obj).C;
            case 1:
                androidx.lifecycle.viewmodel.c cVar = (androidx.lifecycle.viewmodel.c) obj;
                cVar.getClass();
                return new androidx.navigation.internal.b(m0.b(cVar));
            case 2:
                androidx.navigation.t tVar = (androidx.navigation.t) obj;
                tVar.getClass();
                androidx.navigation.v vVar = tVar.z;
                if (vVar == null || vVar.C.y != tVar.y.a) {
                    return null;
                }
                return vVar;
            case 3:
                androidx.navigation.t tVar2 = (androidx.navigation.t) obj;
                tVar2.getClass();
                androidx.navigation.v vVar2 = tVar2.z;
                if (vVar2 == null || vVar2.C.y != tVar2.y.a) {
                    return null;
                }
                return vVar2;
            case 4:
                androidx.navigation.t tVar3 = (androidx.navigation.t) obj;
                tVar3.getClass();
                return Integer.valueOf(tVar3.y.a);
            case 5:
                ((androidx.room.a) obj).getClass();
                throw new kotlin.j(0);
            case 6:
                androidx.sqlite.c cVar2 = (androidx.sqlite.c) obj;
                cVar2.getClass();
                return Boolean.valueOf(cVar2.Q());
            case 7:
                androidx.sqlite.c cVar3 = (androidx.sqlite.c) obj;
                cVar3.getClass();
                kotlin.collections.builders.h hVar = new kotlin.collections.builders.h();
                while (cVar3.Q()) {
                    hVar.add(Integer.valueOf((int) cVar3.getLong(0)));
                }
                return g0.b(hVar);
            case 8:
                androidx.window.layout.c cVar4 = (androidx.window.layout.c) obj;
                cVar4.getClass();
                return cVar4;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbD = androidx.constraintlayout.core.g.d(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sbD.append(value);
                return sbD.toString();
            case 10:
                androidx.work.impl.constraints.controllers.d dVar = (androidx.work.impl.constraints.controllers.d) obj;
                dVar.getClass();
                return dVar.getClass().getSimpleName();
            case 11:
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cVarU.Q()) {
                        arrayList.add(cVarU.F(0));
                    }
                    cVarU.close();
                    return arrayList;
                } catch (Throwable th) {
                    cVarU.close();
                    throw th;
                }
            case 12:
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("DELETE FROM WorkProgress");
                try {
                    cVarU2.Q();
                    return y.a;
                } finally {
                    cVarU2.close();
                }
            case 13:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iU = _COROUTINE.b.u(cVarU3, "id");
                    int iU2 = _COROUTINE.b.u(cVarU3, "state");
                    int iU3 = _COROUTINE.b.u(cVarU3, "worker_class_name");
                    int iU4 = _COROUTINE.b.u(cVarU3, "input_merger_class_name");
                    int iU5 = _COROUTINE.b.u(cVarU3, "input");
                    int iU6 = _COROUTINE.b.u(cVarU3, "output");
                    int iU7 = _COROUTINE.b.u(cVarU3, "initial_delay");
                    int iU8 = _COROUTINE.b.u(cVarU3, "interval_duration");
                    int iU9 = _COROUTINE.b.u(cVarU3, "flex_duration");
                    int iU10 = _COROUTINE.b.u(cVarU3, "run_attempt_count");
                    int iU11 = _COROUTINE.b.u(cVarU3, "backoff_policy");
                    int iU12 = _COROUTINE.b.u(cVarU3, "backoff_delay_duration");
                    int iU13 = _COROUTINE.b.u(cVarU3, "last_enqueue_time");
                    int iU14 = _COROUTINE.b.u(cVarU3, "minimum_retention_duration");
                    int iU15 = _COROUTINE.b.u(cVarU3, "schedule_requested_at");
                    int iU16 = _COROUTINE.b.u(cVarU3, "run_in_foreground");
                    int iU17 = _COROUTINE.b.u(cVarU3, "out_of_quota_policy");
                    int iU18 = _COROUTINE.b.u(cVarU3, "period_count");
                    int iU19 = _COROUTINE.b.u(cVarU3, "generation");
                    int iU20 = _COROUTINE.b.u(cVarU3, "next_schedule_time_override");
                    int iU21 = _COROUTINE.b.u(cVarU3, "next_schedule_time_override_generation");
                    int iU22 = _COROUTINE.b.u(cVarU3, "stop_reason");
                    int iU23 = _COROUTINE.b.u(cVarU3, "trace_tag");
                    int iU24 = _COROUTINE.b.u(cVarU3, "backoff_on_system_interruptions");
                    int iU25 = _COROUTINE.b.u(cVarU3, "required_network_type");
                    int iU26 = _COROUTINE.b.u(cVarU3, "required_network_request");
                    int iU27 = _COROUTINE.b.u(cVarU3, "requires_charging");
                    int iU28 = _COROUTINE.b.u(cVarU3, "requires_device_idle");
                    int iU29 = _COROUTINE.b.u(cVarU3, "requires_battery_not_low");
                    int iU30 = _COROUTINE.b.u(cVarU3, "requires_storage_not_low");
                    int iU31 = _COROUTINE.b.u(cVarU3, "trigger_content_update_delay");
                    int iU32 = _COROUTINE.b.u(cVarU3, "trigger_max_content_delay");
                    int iU33 = _COROUTINE.b.u(cVarU3, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarU3.Q()) {
                        String strF = cVarU3.F(iU);
                        int i = iU14;
                        int i2 = iU13;
                        i0 i0VarE = com.google.android.gms.dynamite.g.E((int) cVarU3.getLong(iU2));
                        String strF2 = cVarU3.F(iU3);
                        String strF3 = cVarU3.F(iU4);
                        byte[] blob = cVarU3.getBlob(iU5);
                        androidx.work.i iVar = androidx.work.i.b;
                        androidx.work.i iVarL = android.support.v4.media.session.b.l(blob);
                        androidx.work.i iVarL2 = android.support.v4.media.session.b.l(cVarU3.getBlob(iU6));
                        long j = cVarU3.getLong(iU7);
                        long j2 = cVarU3.getLong(iU8);
                        long j3 = cVarU3.getLong(iU9);
                        int i3 = (int) cVarU3.getLong(iU10);
                        int i4 = iU3;
                        int i5 = iU2;
                        androidx.work.a aVarB = com.google.android.gms.dynamite.g.B((int) cVarU3.getLong(iU11));
                        long j4 = cVarU3.getLong(iU12);
                        long j5 = cVarU3.getLong(i2);
                        long j6 = cVarU3.getLong(i);
                        int i6 = iU15;
                        long j7 = cVarU3.getLong(i6);
                        iU15 = i6;
                        int i7 = iU4;
                        int i8 = iU16;
                        int i9 = iU;
                        boolean z2 = ((int) cVarU3.getLong(i8)) != 0;
                        int i10 = iU17;
                        f0 f0VarD = com.google.android.gms.dynamite.g.D((int) cVarU3.getLong(i10));
                        int i11 = iU18;
                        int i12 = (int) cVarU3.getLong(i11);
                        int i13 = iU19;
                        int i14 = (int) cVarU3.getLong(i13);
                        int i15 = iU20;
                        long j8 = cVarU3.getLong(i15);
                        int i16 = iU21;
                        int i17 = (int) cVarU3.getLong(i16);
                        int i18 = iU22;
                        int i19 = (int) cVarU3.getLong(i18);
                        int i20 = iU23;
                        String strF4 = cVarU3.isNull(i20) ? null : cVarU3.F(i20);
                        int i21 = iU24;
                        Integer numValueOf = cVarU3.isNull(i21) ? null : Integer.valueOf((int) cVarU3.getLong(i21));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        iU24 = i21;
                        int i22 = iU25;
                        z zVarC = com.google.android.gms.dynamite.g.C((int) cVarU3.getLong(i22));
                        int i23 = iU26;
                        androidx.work.impl.utils.f fVarQ = com.google.android.gms.dynamite.g.Q(cVarU3.getBlob(i23));
                        iU25 = i22;
                        int i24 = iU27;
                        boolean z3 = ((int) cVarU3.getLong(i24)) != 0;
                        iU27 = i24;
                        int i25 = iU28;
                        boolean z4 = ((int) cVarU3.getLong(i25)) != 0;
                        iU28 = i25;
                        int i26 = iU29;
                        boolean z5 = ((int) cVarU3.getLong(i26)) != 0;
                        iU29 = i26;
                        int i27 = iU30;
                        int i28 = iU31;
                        int i29 = iU32;
                        iU31 = i28;
                        int i30 = iU33;
                        arrayList2.add(new androidx.work.impl.model.p(strF, i0VarE, strF2, strF3, iVarL, iVarL2, j, j2, j3, new androidx.work.e(fVarQ, zVarC, z3, z4, z5, ((int) cVarU3.getLong(i27)) != 0, cVarU3.getLong(i28), cVarU3.getLong(i29), com.google.android.gms.dynamite.g.h(cVarU3.getBlob(i30))), i3, aVarB, j4, j5, j6, j7, z2, f0VarD, i12, i14, j8, i17, i19, strF4, boolValueOf));
                        iU33 = i30;
                        iU32 = i29;
                        iU30 = i27;
                        iU2 = i5;
                        iU = i9;
                        iU14 = i;
                        iU18 = i11;
                        iU19 = i13;
                        iU20 = i15;
                        iU21 = i16;
                        iU22 = i18;
                        iU23 = i20;
                        iU13 = i2;
                        iU3 = i4;
                        iU26 = i23;
                        iU16 = i8;
                        iU4 = i7;
                        iU17 = i10;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarU3.close();
                }
            case 14:
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("SELECT * FROM workspec WHERE state=1");
                try {
                    int iU34 = _COROUTINE.b.u(cVarU4, "id");
                    int iU35 = _COROUTINE.b.u(cVarU4, "state");
                    int iU36 = _COROUTINE.b.u(cVarU4, "worker_class_name");
                    int iU37 = _COROUTINE.b.u(cVarU4, "input_merger_class_name");
                    int iU38 = _COROUTINE.b.u(cVarU4, "input");
                    int iU39 = _COROUTINE.b.u(cVarU4, "output");
                    int iU40 = _COROUTINE.b.u(cVarU4, "initial_delay");
                    int iU41 = _COROUTINE.b.u(cVarU4, "interval_duration");
                    int iU42 = _COROUTINE.b.u(cVarU4, "flex_duration");
                    int iU43 = _COROUTINE.b.u(cVarU4, "run_attempt_count");
                    int iU44 = _COROUTINE.b.u(cVarU4, "backoff_policy");
                    int iU45 = _COROUTINE.b.u(cVarU4, "backoff_delay_duration");
                    int iU46 = _COROUTINE.b.u(cVarU4, "last_enqueue_time");
                    int iU47 = _COROUTINE.b.u(cVarU4, "minimum_retention_duration");
                    int iU48 = _COROUTINE.b.u(cVarU4, "schedule_requested_at");
                    int iU49 = _COROUTINE.b.u(cVarU4, "run_in_foreground");
                    int iU50 = _COROUTINE.b.u(cVarU4, "out_of_quota_policy");
                    int iU51 = _COROUTINE.b.u(cVarU4, "period_count");
                    int iU52 = _COROUTINE.b.u(cVarU4, "generation");
                    int iU53 = _COROUTINE.b.u(cVarU4, "next_schedule_time_override");
                    int iU54 = _COROUTINE.b.u(cVarU4, "next_schedule_time_override_generation");
                    int iU55 = _COROUTINE.b.u(cVarU4, "stop_reason");
                    int iU56 = _COROUTINE.b.u(cVarU4, "trace_tag");
                    int iU57 = _COROUTINE.b.u(cVarU4, "backoff_on_system_interruptions");
                    int iU58 = _COROUTINE.b.u(cVarU4, "required_network_type");
                    int iU59 = _COROUTINE.b.u(cVarU4, "required_network_request");
                    int iU60 = _COROUTINE.b.u(cVarU4, "requires_charging");
                    int iU61 = _COROUTINE.b.u(cVarU4, "requires_device_idle");
                    int iU62 = _COROUTINE.b.u(cVarU4, "requires_battery_not_low");
                    int iU63 = _COROUTINE.b.u(cVarU4, "requires_storage_not_low");
                    int iU64 = _COROUTINE.b.u(cVarU4, "trigger_content_update_delay");
                    int iU65 = _COROUTINE.b.u(cVarU4, "trigger_max_content_delay");
                    int iU66 = _COROUTINE.b.u(cVarU4, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarU4.Q()) {
                        String strF5 = cVarU4.F(iU34);
                        ArrayList arrayList4 = arrayList3;
                        int i31 = iU46;
                        i0 i0VarE2 = com.google.android.gms.dynamite.g.E((int) cVarU4.getLong(iU35));
                        String strF6 = cVarU4.F(iU36);
                        String strF7 = cVarU4.F(iU37);
                        byte[] blob2 = cVarU4.getBlob(iU38);
                        androidx.work.i iVar2 = androidx.work.i.b;
                        androidx.work.i iVarL3 = android.support.v4.media.session.b.l(blob2);
                        androidx.work.i iVarL4 = android.support.v4.media.session.b.l(cVarU4.getBlob(iU39));
                        long j9 = cVarU4.getLong(iU40);
                        long j10 = cVarU4.getLong(iU41);
                        long j11 = cVarU4.getLong(iU42);
                        int i32 = (int) cVarU4.getLong(iU43);
                        int i33 = iU36;
                        int i34 = iU35;
                        androidx.work.a aVarB2 = com.google.android.gms.dynamite.g.B((int) cVarU4.getLong(iU44));
                        long j12 = cVarU4.getLong(iU45);
                        long j13 = cVarU4.getLong(i31);
                        long j14 = cVarU4.getLong(iU47);
                        int i35 = iU48;
                        long j15 = cVarU4.getLong(i35);
                        iU48 = i35;
                        int i36 = iU49;
                        boolean z6 = ((int) cVarU4.getLong(i36)) != 0;
                        int i37 = iU37;
                        int i38 = iU50;
                        int i39 = iU34;
                        f0 f0VarD2 = com.google.android.gms.dynamite.g.D((int) cVarU4.getLong(i38));
                        int i40 = iU51;
                        int i41 = (int) cVarU4.getLong(i40);
                        iU51 = i40;
                        int i42 = iU52;
                        int i43 = (int) cVarU4.getLong(i42);
                        long j16 = cVarU4.getLong(iU53);
                        int i44 = iU54;
                        int i45 = (int) cVarU4.getLong(i44);
                        int i46 = iU55;
                        int i47 = (int) cVarU4.getLong(i46);
                        int i48 = iU56;
                        String strF8 = cVarU4.isNull(i48) ? null : cVarU4.F(i48);
                        int i49 = iU57;
                        Integer numValueOf2 = cVarU4.isNull(i49) ? null : Integer.valueOf((int) cVarU4.getLong(i49));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        iU57 = i49;
                        int i50 = iU58;
                        z zVarC2 = com.google.android.gms.dynamite.g.C((int) cVarU4.getLong(i50));
                        int i51 = iU59;
                        androidx.work.impl.utils.f fVarQ2 = com.google.android.gms.dynamite.g.Q(cVarU4.getBlob(i51));
                        iU58 = i50;
                        int i52 = iU60;
                        boolean z7 = ((int) cVarU4.getLong(i52)) != 0;
                        iU60 = i52;
                        int i53 = iU61;
                        boolean z8 = ((int) cVarU4.getLong(i53)) != 0;
                        iU61 = i53;
                        int i54 = iU62;
                        boolean z9 = ((int) cVarU4.getLong(i54)) != 0;
                        iU62 = i54;
                        int i55 = iU63;
                        int i56 = iU64;
                        int i57 = iU65;
                        iU64 = i56;
                        int i58 = iU66;
                        iU66 = i58;
                        arrayList4.add(new androidx.work.impl.model.p(strF5, i0VarE2, strF6, strF7, iVarL3, iVarL4, j9, j10, j11, new androidx.work.e(fVarQ2, zVarC2, z7, z8, z9, ((int) cVarU4.getLong(i55)) != 0, cVarU4.getLong(i56), cVarU4.getLong(i57), com.google.android.gms.dynamite.g.h(cVarU4.getBlob(i58))), i32, aVarB2, j12, j13, j14, j15, z6, f0VarD2, i41, i43, j16, i45, i47, strF8, boolValueOf2));
                        arrayList3 = arrayList4;
                        iU65 = i57;
                        iU63 = i55;
                        iU34 = i39;
                        iU50 = i38;
                        iU52 = i42;
                        iU54 = i44;
                        iU55 = i46;
                        iU56 = i48;
                        iU35 = i34;
                        iU36 = i33;
                        iU59 = i51;
                        iU37 = i37;
                        iU49 = i36;
                        iU46 = i31;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarU4.close();
                }
            case 15:
                return e(obj);
            case 16:
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.sqlite.c cVarU5 = aVar5.U("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    return Integer.valueOf(cVarU5.Q() ? (int) cVarU5.getLong(0) : 0);
                } finally {
                    cVarU5.close();
                }
            case 17:
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                androidx.sqlite.c cVarU6 = aVar6.U("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (cVarU6.Q()) {
                        z = ((int) cVarU6.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    cVarU6.close();
                }
            case 18:
                return f(obj);
            case 19:
                androidx.sqlite.a aVar7 = (androidx.sqlite.a) obj;
                aVar7.getClass();
                androidx.sqlite.c cVarU7 = aVar7.U("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    cVarU7.Q();
                    return Integer.valueOf(_COROUTINE.a.S(aVar7));
                } finally {
                    cVarU7.close();
                }
            case 20:
                return (coil3.compose.h) obj;
            case 21:
                return Float.valueOf(1.0f);
            case 22:
                return Float.valueOf(((android.content.Context) obj).getResources().getDisplayMetrics().density);
            case 23:
                int i59 = ChqMessagingService.E;
                android.content.Context context = com.app.mlounge.util.a.a;
                b0.h("FCM token: ", (String) obj, "D", "ChqFCM");
                return y.a;
            case 24:
                return AnikotoScraper.getAnimeDetail$lambda$14((com.google.gson.g) obj);
            case 25:
                Map.Entry entry2 = (Map.Entry) obj;
                return entry2.getKey() + "=" + entry2.getValue();
            case 26:
                com.app.mlounge.data.local.a aVar8 = (com.app.mlounge.data.local.a) obj;
                aVar8.getClass();
                return androidx.privacysandbox.ads.adservices.java.internal.a.r("`", aVar8.a, "`");
            case 27:
                com.app.mlounge.data.local.a aVar9 = (com.app.mlounge.data.local.a) obj;
                aVar9.getClass();
                return androidx.privacysandbox.ads.adservices.java.internal.a.r("`", aVar9.a, "`");
            case 28:
                androidx.sqlite.a aVar10 = (androidx.sqlite.a) obj;
                aVar10.getClass();
                androidx.sqlite.c cVarU8 = aVar10.U("SELECT * FROM downloads ORDER BY addedAt DESC");
                try {
                    int iU67 = _COROUTINE.b.u(cVarU8, "id");
                    int iU68 = _COROUTINE.b.u(cVarU8, "url");
                    int iU69 = _COROUTINE.b.u(cVarU8, "fileName");
                    int iU70 = _COROUTINE.b.u(cVarU8, "title");
                    int iU71 = _COROUTINE.b.u(cVarU8, "contentType");
                    int iU72 = _COROUTINE.b.u(cVarU8, "contentId");
                    int iU73 = _COROUTINE.b.u(cVarU8, "posterPath");
                    int iU74 = _COROUTINE.b.u(cVarU8, "quality");
                    int iU75 = _COROUTINE.b.u(cVarU8, "size");
                    int iU76 = _COROUTINE.b.u(cVarU8, "status");
                    int iU77 = _COROUTINE.b.u(cVarU8, "progress");
                    int iU78 = _COROUTINE.b.u(cVarU8, "downloadedBytes");
                    int iU79 = _COROUTINE.b.u(cVarU8, "totalBytes");
                    int iU80 = _COROUTINE.b.u(cVarU8, "filePath");
                    int iU81 = _COROUTINE.b.u(cVarU8, "headers");
                    int iU82 = _COROUTINE.b.u(cVarU8, "addedAt");
                    int iU83 = _COROUTINE.b.u(cVarU8, "completedAt");
                    int iU84 = _COROUTINE.b.u(cVarU8, "tmdbId");
                    int iU85 = _COROUTINE.b.u(cVarU8, "season");
                    int iU86 = _COROUTINE.b.u(cVarU8, "episode");
                    int iU87 = _COROUTINE.b.u(cVarU8, "failureReason");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarU8.Q()) {
                        long j17 = cVarU8.getLong(iU67);
                        String strF9 = cVarU8.F(iU68);
                        String strF10 = cVarU8.F(iU69);
                        String strF11 = cVarU8.F(iU70);
                        String strF12 = cVarU8.F(iU71);
                        String strF13 = cVarU8.isNull(iU72) ? null : cVarU8.F(iU72);
                        String strF14 = cVarU8.isNull(iU73) ? null : cVarU8.F(iU73);
                        String strF15 = cVarU8.isNull(iU74) ? null : cVarU8.F(iU74);
                        String strF16 = cVarU8.isNull(iU75) ? null : cVarU8.F(iU75);
                        String strF17 = cVarU8.F(iU76);
                        int i60 = iU69;
                        int i61 = iU70;
                        int i62 = (int) cVarU8.getLong(iU77);
                        long j18 = cVarU8.getLong(iU78);
                        long j19 = cVarU8.getLong(iU79);
                        int i63 = iU80;
                        String strF18 = cVarU8.isNull(i63) ? null : cVarU8.F(i63);
                        String strF19 = cVarU8.isNull(iU81) ? null : cVarU8.F(iU81);
                        int i64 = iU67;
                        int i65 = iU82;
                        long j20 = cVarU8.getLong(i65);
                        iU82 = i65;
                        iU83 = iU83;
                        Long lValueOf = cVarU8.isNull(iU83) ? null : Long.valueOf(cVarU8.getLong(iU83));
                        int i66 = iU84;
                        int i67 = (int) cVarU8.getLong(i66);
                        int i68 = iU72;
                        int i69 = iU85;
                        int i70 = iU71;
                        int i71 = (int) cVarU8.getLong(i69);
                        int i72 = iU86;
                        int i73 = iU87;
                        arrayList5.add(new com.app.mlounge.data.local.entity.a(j17, strF9, strF10, strF11, strF12, strF13, strF14, strF15, strF16, strF17, i62, j18, j19, strF18, strF19, j20, lValueOf, i67, i71, (int) cVarU8.getLong(i72), cVarU8.isNull(i73) ? null : cVarU8.F(i73)));
                        iU67 = i64;
                        iU80 = i63;
                        iU84 = i66;
                        iU87 = i73;
                        iU71 = i70;
                        iU85 = i69;
                        iU69 = i60;
                        iU70 = i61;
                        iU86 = i72;
                        iU72 = i68;
                        break;
                    }
                    return arrayList5;
                } finally {
                    cVarU8.close();
                }
            default:
                androidx.sqlite.a aVar11 = (androidx.sqlite.a) obj;
                aVar11.getClass();
                androidx.sqlite.c cVarU9 = aVar11.U("SELECT * FROM favourite_games ORDER BY addedAt DESC");
                try {
                    int iU88 = _COROUTINE.b.u(cVarU9, "slug");
                    int iU89 = _COROUTINE.b.u(cVarU9, "platform");
                    int iU90 = _COROUTINE.b.u(cVarU9, "name");
                    int iU91 = _COROUTINE.b.u(cVarU9, "posterUrl");
                    int iU92 = _COROUTINE.b.u(cVarU9, "year");
                    int iU93 = _COROUTINE.b.u(cVarU9, "addedAt");
                    ArrayList arrayList6 = new ArrayList();
                    while (cVarU9.Q()) {
                        arrayList6.add(new com.app.mlounge.data.local.entity.b(cVarU9.F(iU88), cVarU9.F(iU89), cVarU9.isNull(iU90) ? null : cVarU9.F(iU90), cVarU9.isNull(iU91) ? null : cVarU9.F(iU91), cVarU9.isNull(iU92) ? null : cVarU9.F(iU92), cVarU9.getLong(iU93)));
                        break;
                    }
                    return arrayList6;
                } finally {
                    cVarU9.close();
                }
        }
    }

    public /* synthetic */ r(int i) {
        this.e = i;
    }
}
