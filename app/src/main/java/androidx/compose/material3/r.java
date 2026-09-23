package androidx.compose.material3;

import java.util.ArrayList;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;

    public /* synthetic */ r(String str, int i) {
        this.e = i;
        this.y = str;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x033a  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        boolean z;
        boolean z2;
        Long lValueOf;
        androidx.work.impl.model.p pVar;
        androidx.work.i0 i0VarE;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        String str = this.y;
        switch (i) {
            case 0:
                androidx.compose.ui.semantics.y.c((androidx.compose.ui.semantics.a0) obj, str);
                return yVar;
            case 1:
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.w.d;
                kotlin.reflect.j jVar = androidx.compose.ui.semantics.y.a[2];
                ((androidx.compose.ui.semantics.a0) obj).b(zVar, str);
                return yVar;
            case 2:
                androidx.compose.ui.semantics.a0 a0Var = (androidx.compose.ui.semantics.a0) obj;
                androidx.compose.ui.semantics.y.c(a0Var, str);
                androidx.compose.ui.semantics.y.d(a0Var, 5);
                return yVar;
            case 3:
                androidx.compose.ui.semantics.a0 a0Var2 = (androidx.compose.ui.semantics.a0) obj;
                kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.y.a;
                androidx.compose.ui.semantics.z zVar2 = androidx.compose.ui.semantics.w.d;
                kotlin.reflect.j[] jVarArr3 = androidx.compose.ui.semantics.y.a;
                kotlin.reflect.j jVar2 = jVarArr3[2];
                a0Var2.b(zVar2, str);
                androidx.compose.ui.semantics.z zVar3 = androidx.compose.ui.semantics.w.t;
                kotlin.reflect.j jVar3 = jVarArr3[11];
                a0Var2.b(zVar3, Float.valueOf(0.0f));
                return yVar;
            case 4:
                androidx.compose.ui.semantics.a0 a0Var3 = (androidx.compose.ui.semantics.a0) obj;
                kotlin.reflect.j[] jVarArr4 = androidx.compose.ui.semantics.y.a;
                androidx.compose.ui.semantics.z zVar4 = androidx.compose.ui.semantics.w.j;
                kotlin.reflect.j[] jVarArr5 = androidx.compose.ui.semantics.y.a;
                kotlin.reflect.j jVar4 = jVarArr5[3];
                a0Var3.b(zVar4, new androidx.compose.ui.semantics.g());
                androidx.compose.ui.semantics.z zVar5 = androidx.compose.ui.semantics.w.d;
                kotlin.reflect.j jVar5 = jVarArr5[2];
                a0Var3.b(zVar5, str);
                return yVar;
            case 5:
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    cVarU.s(1, str);
                    if (cVarU.Q()) {
                        z = false;
                        if (((int) cVarU.getLong(0)) != 0) {
                            z2 = true;
                        }
                        cVarU.close();
                        return Boolean.valueOf(z2);
                    }
                    z = false;
                    z2 = z;
                    cVarU.close();
                    return Boolean.valueOf(z2);
                } catch (Throwable th) {
                    cVarU.close();
                    throw th;
                }
            case 6:
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    cVarU2.s(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cVarU2.Q()) {
                        arrayList.add(cVarU2.F(0));
                    }
                    cVarU2.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cVarU2.close();
                    throw th2;
                }
            case 7:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    cVarU3.s(1, str);
                    return Boolean.valueOf(cVarU3.Q() && ((int) cVarU3.getLong(0)) != 0);
                } finally {
                    cVarU3.close();
                }
            case 8:
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("SELECT long_value FROM Preference where `key`=?");
                try {
                    cVarU4.s(1, str);
                    if (cVarU4.Q() && !cVarU4.isNull(0)) {
                        lValueOf = Long.valueOf(cVarU4.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    cVarU4.close();
                }
            case 9:
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.sqlite.c cVarU5 = aVar5.U("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    cVarU5.s(1, str);
                    cVarU5.Q();
                    return yVar;
                } finally {
                    cVarU5.close();
                }
            case 10:
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                androidx.sqlite.c cVarU6 = aVar6.U("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    cVarU6.s(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarU6.Q()) {
                        arrayList2.add(cVarU6.F(0));
                    }
                    cVarU6.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    cVarU6.close();
                    throw th3;
                }
            case 11:
                androidx.sqlite.a aVar7 = (androidx.sqlite.a) obj;
                aVar7.getClass();
                androidx.sqlite.c cVarU7 = aVar7.U("DELETE from WorkProgress where work_spec_id=?");
                try {
                    cVarU7.s(1, str);
                    cVarU7.Q();
                    return yVar;
                } finally {
                    cVarU7.close();
                }
            case 12:
                androidx.sqlite.a aVar8 = (androidx.sqlite.a) obj;
                aVar8.getClass();
                androidx.sqlite.c cVarU8 = aVar8.U("SELECT * FROM workspec WHERE id=?");
                try {
                    cVarU8.s(1, str);
                    int iU = _COROUTINE.b.u(cVarU8, "id");
                    int iU2 = _COROUTINE.b.u(cVarU8, "state");
                    int iU3 = _COROUTINE.b.u(cVarU8, "worker_class_name");
                    int iU4 = _COROUTINE.b.u(cVarU8, "input_merger_class_name");
                    int iU5 = _COROUTINE.b.u(cVarU8, "input");
                    int iU6 = _COROUTINE.b.u(cVarU8, "output");
                    int iU7 = _COROUTINE.b.u(cVarU8, "initial_delay");
                    int iU8 = _COROUTINE.b.u(cVarU8, "interval_duration");
                    int iU9 = _COROUTINE.b.u(cVarU8, "flex_duration");
                    int iU10 = _COROUTINE.b.u(cVarU8, "run_attempt_count");
                    int iU11 = _COROUTINE.b.u(cVarU8, "backoff_policy");
                    int iU12 = _COROUTINE.b.u(cVarU8, "backoff_delay_duration");
                    int iU13 = _COROUTINE.b.u(cVarU8, "last_enqueue_time");
                    int iU14 = _COROUTINE.b.u(cVarU8, "minimum_retention_duration");
                    int iU15 = _COROUTINE.b.u(cVarU8, "schedule_requested_at");
                    int iU16 = _COROUTINE.b.u(cVarU8, "run_in_foreground");
                    int iU17 = _COROUTINE.b.u(cVarU8, "out_of_quota_policy");
                    int iU18 = _COROUTINE.b.u(cVarU8, "period_count");
                    int iU19 = _COROUTINE.b.u(cVarU8, "generation");
                    int iU20 = _COROUTINE.b.u(cVarU8, "next_schedule_time_override");
                    int iU21 = _COROUTINE.b.u(cVarU8, "next_schedule_time_override_generation");
                    int iU22 = _COROUTINE.b.u(cVarU8, "stop_reason");
                    int iU23 = _COROUTINE.b.u(cVarU8, "trace_tag");
                    int iU24 = _COROUTINE.b.u(cVarU8, "backoff_on_system_interruptions");
                    int iU25 = _COROUTINE.b.u(cVarU8, "required_network_type");
                    int iU26 = _COROUTINE.b.u(cVarU8, "required_network_request");
                    int iU27 = _COROUTINE.b.u(cVarU8, "requires_charging");
                    int iU28 = _COROUTINE.b.u(cVarU8, "requires_device_idle");
                    int iU29 = _COROUTINE.b.u(cVarU8, "requires_battery_not_low");
                    int iU30 = _COROUTINE.b.u(cVarU8, "requires_storage_not_low");
                    int iU31 = _COROUTINE.b.u(cVarU8, "trigger_content_update_delay");
                    int iU32 = _COROUTINE.b.u(cVarU8, "trigger_max_content_delay");
                    int iU33 = _COROUTINE.b.u(cVarU8, "content_uri_triggers");
                    if (cVarU8.Q()) {
                        String strF = cVarU8.F(iU);
                        androidx.work.i0 i0VarE2 = com.google.android.gms.dynamite.g.E((int) cVarU8.getLong(iU2));
                        String strF2 = cVarU8.F(iU3);
                        String strF3 = cVarU8.F(iU4);
                        byte[] blob = cVarU8.getBlob(iU5);
                        androidx.work.i iVar = androidx.work.i.b;
                        androidx.work.i iVarL = android.support.v4.media.session.b.l(blob);
                        androidx.work.i iVarL2 = android.support.v4.media.session.b.l(cVarU8.getBlob(iU6));
                        long j = cVarU8.getLong(iU7);
                        long j2 = cVarU8.getLong(iU8);
                        long j3 = cVarU8.getLong(iU9);
                        int i2 = (int) cVarU8.getLong(iU10);
                        androidx.work.a aVarB = com.google.android.gms.dynamite.g.B((int) cVarU8.getLong(iU11));
                        long j4 = cVarU8.getLong(iU12);
                        long j5 = cVarU8.getLong(iU13);
                        long j6 = cVarU8.getLong(iU14);
                        long j7 = cVarU8.getLong(iU15);
                        boolean z3 = ((int) cVarU8.getLong(iU16)) != 0;
                        androidx.work.f0 f0VarD = com.google.android.gms.dynamite.g.D((int) cVarU8.getLong(iU17));
                        int i3 = (int) cVarU8.getLong(iU18);
                        int i4 = (int) cVarU8.getLong(iU19);
                        long j8 = cVarU8.getLong(iU20);
                        int i5 = (int) cVarU8.getLong(iU21);
                        int i6 = (int) cVarU8.getLong(iU22);
                        String strF4 = cVarU8.isNull(iU23) ? null : cVarU8.F(iU23);
                        Integer numValueOf = cVarU8.isNull(iU24) ? null : Integer.valueOf((int) cVarU8.getLong(iU24));
                        pVar = new androidx.work.impl.model.p(strF, i0VarE2, strF2, strF3, iVarL, iVarL2, j, j2, j3, new androidx.work.e(com.google.android.gms.dynamite.g.Q(cVarU8.getBlob(iU26)), com.google.android.gms.dynamite.g.C((int) cVarU8.getLong(iU25)), ((int) cVarU8.getLong(iU27)) != 0, ((int) cVarU8.getLong(iU28)) != 0, ((int) cVarU8.getLong(iU29)) != 0, ((int) cVarU8.getLong(iU30)) != 0, cVarU8.getLong(iU31), cVarU8.getLong(iU32), com.google.android.gms.dynamite.g.h(cVarU8.getBlob(iU33))), i2, aVarB, j4, j5, j6, j7, z3, f0VarD, i3, i4, j8, i5, i6, strF4, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        pVar = null;
                    }
                    return pVar;
                } finally {
                    cVarU8.close();
                }
            case 13:
                androidx.sqlite.a aVar9 = (androidx.sqlite.a) obj;
                aVar9.getClass();
                androidx.sqlite.c cVarU9 = aVar9.U("SELECT state FROM workspec WHERE id=?");
                try {
                    cVarU9.s(1, str);
                    if (cVarU9.Q()) {
                        Integer numValueOf2 = cVarU9.isNull(0) ? null : Integer.valueOf((int) cVarU9.getLong(0));
                        if (numValueOf2 != null) {
                            i0VarE = com.google.android.gms.dynamite.g.E(numValueOf2.intValue());
                        } else {
                            i0VarE = null;
                        }
                        break;
                    } else {
                        i0VarE = null;
                    }
                    return i0VarE;
                } finally {
                    cVarU9.close();
                }
            case 14:
                androidx.sqlite.a aVar10 = (androidx.sqlite.a) obj;
                aVar10.getClass();
                androidx.sqlite.c cVarU10 = aVar10.U("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarU10.s(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarU10.Q()) {
                        arrayList3.add(cVarU10.F(0));
                    }
                    cVarU10.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    cVarU10.close();
                    throw th4;
                }
            case 15:
                androidx.sqlite.a aVar11 = (androidx.sqlite.a) obj;
                aVar11.getClass();
                androidx.sqlite.c cVarU11 = aVar11.U("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    cVarU11.s(1, str);
                    cVarU11.Q();
                    return Integer.valueOf(_COROUTINE.a.S(aVar11));
                } finally {
                    cVarU11.close();
                }
            case 16:
                androidx.sqlite.a aVar12 = (androidx.sqlite.a) obj;
                aVar12.getClass();
                androidx.sqlite.c cVarU12 = aVar12.U("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    cVarU12.s(1, str);
                    cVarU12.Q();
                    return Integer.valueOf(_COROUTINE.a.S(aVar12));
                } finally {
                    cVarU12.close();
                }
            case 17:
                androidx.sqlite.a aVar13 = (androidx.sqlite.a) obj;
                aVar13.getClass();
                androidx.sqlite.c cVarU13 = aVar13.U("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    cVarU13.s(1, str);
                    cVarU13.Q();
                    return yVar;
                } finally {
                    cVarU13.close();
                }
            case 18:
                androidx.sqlite.a aVar14 = (androidx.sqlite.a) obj;
                aVar14.getClass();
                androidx.sqlite.c cVarU14 = aVar14.U("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    cVarU14.s(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarU14.Q()) {
                        byte[] blob2 = cVarU14.getBlob(0);
                        androidx.work.i iVar2 = androidx.work.i.b;
                        arrayList4.add(android.support.v4.media.session.b.l(blob2));
                    }
                    cVarU14.close();
                    return arrayList4;
                } catch (Throwable th5) {
                    cVarU14.close();
                    throw th5;
                }
            case 19:
                androidx.sqlite.a aVar15 = (androidx.sqlite.a) obj;
                aVar15.getClass();
                androidx.sqlite.c cVarU15 = aVar15.U("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    cVarU15.s(1, str);
                    cVarU15.Q();
                    return Integer.valueOf(_COROUTINE.a.S(aVar15));
                } finally {
                    cVarU15.close();
                }
            case 20:
                androidx.sqlite.a aVar16 = (androidx.sqlite.a) obj;
                aVar16.getClass();
                androidx.sqlite.c cVarU16 = aVar16.U("DELETE FROM workspec WHERE id=?");
                try {
                    cVarU16.s(1, str);
                    cVarU16.Q();
                    return yVar;
                } finally {
                    cVarU16.close();
                }
            case 21:
                androidx.sqlite.a aVar17 = (androidx.sqlite.a) obj;
                aVar17.getClass();
                androidx.sqlite.c cVarU17 = aVar17.U("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarU17.s(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarU17.Q()) {
                        String strF5 = cVarU17.F(0);
                        androidx.work.i0 i0VarE3 = com.google.android.gms.dynamite.g.E((int) cVarU17.getLong(1));
                        strF5.getClass();
                        androidx.work.impl.model.o oVar = new androidx.work.impl.model.o();
                        oVar.a = strF5;
                        oVar.b = i0VarE3;
                        arrayList5.add(oVar);
                    }
                    cVarU17.close();
                    return arrayList5;
                } catch (Throwable th6) {
                    cVarU17.close();
                    throw th6;
                }
            case 22:
                androidx.sqlite.a aVar18 = (androidx.sqlite.a) obj;
                aVar18.getClass();
                androidx.sqlite.c cVarU18 = aVar18.U("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    cVarU18.s(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (cVarU18.Q()) {
                        arrayList6.add(cVarU18.F(0));
                    }
                    cVarU18.close();
                    return arrayList6;
                } catch (Throwable th7) {
                    cVarU18.close();
                    throw th7;
                }
            case 23:
                androidx.sqlite.a aVar19 = (androidx.sqlite.a) obj;
                aVar19.getClass();
                androidx.sqlite.c cVarU19 = aVar19.U("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    cVarU19.s(1, str);
                    cVarU19.Q();
                    return yVar;
                } finally {
                    cVarU19.close();
                }
            case 24:
                androidx.sqlite.a aVar20 = (androidx.sqlite.a) obj;
                aVar20.getClass();
                androidx.sqlite.c cVarU20 = aVar20.U("DELETE FROM history WHERE contentId = ?");
                try {
                    cVarU20.s(1, str);
                    cVarU20.Q();
                    return yVar;
                } finally {
                    cVarU20.close();
                }
            case 25:
                androidx.sqlite.a aVar21 = (androidx.sqlite.a) obj;
                aVar21.getClass();
                androidx.sqlite.c cVarU21 = aVar21.U("DELETE FROM iptv_channels WHERE provider = ?");
                try {
                    cVarU21.s(1, str);
                    cVarU21.Q();
                    return yVar;
                } finally {
                    cVarU21.close();
                }
            case 26:
                androidx.sqlite.a aVar22 = (androidx.sqlite.a) obj;
                aVar22.getClass();
                androidx.sqlite.c cVarU22 = aVar22.U("SELECT DISTINCT groupName FROM iptv_channels WHERE provider = ? ORDER BY groupName ASC");
                try {
                    cVarU22.s(1, str);
                    ArrayList arrayList7 = new ArrayList();
                    while (cVarU22.Q()) {
                        arrayList7.add(cVarU22.isNull(0) ? null : cVarU22.F(0));
                        break;
                    }
                    return arrayList7;
                } finally {
                    cVarU22.close();
                }
            case 27:
                androidx.sqlite.a aVar23 = (androidx.sqlite.a) obj;
                aVar23.getClass();
                androidx.sqlite.c cVarU23 = aVar23.U("SELECT * FROM iptv_channels WHERE name LIKE '%' || ? || '%' LIMIT ?");
                try {
                    cVarU23.s(1, str);
                    cVarU23.f(2, Context.VERSION_ES6);
                    int iU34 = _COROUTINE.b.u(cVarU23, "id");
                    int iU35 = _COROUTINE.b.u(cVarU23, "name");
                    int iU36 = _COROUTINE.b.u(cVarU23, "url");
                    int iU37 = _COROUTINE.b.u(cVarU23, "logo");
                    int iU38 = _COROUTINE.b.u(cVarU23, "groupName");
                    int iU39 = _COROUTINE.b.u(cVarU23, "provider");
                    int iU40 = _COROUTINE.b.u(cVarU23, "tvgId");
                    ArrayList arrayList8 = new ArrayList();
                    while (cVarU23.Q()) {
                        arrayList8.add(new com.app.mlounge.data.local.entity.d(cVarU23.getLong(iU34), cVarU23.F(iU35), cVarU23.F(iU36), cVarU23.isNull(iU37) ? null : cVarU23.F(iU37), cVarU23.isNull(iU38) ? null : cVarU23.F(iU38), cVarU23.F(iU39), cVarU23.isNull(iU40) ? null : cVarU23.F(iU40)));
                        break;
                    }
                    return arrayList8;
                } finally {
                    cVarU23.close();
                }
            case 28:
                androidx.sqlite.a aVar24 = (androidx.sqlite.a) obj;
                aVar24.getClass();
                androidx.sqlite.c cVarU24 = aVar24.U("DELETE FROM watch_progress WHERE contentKey = ?");
                try {
                    cVarU24.s(1, str);
                    cVarU24.Q();
                    return yVar;
                } finally {
                    cVarU24.close();
                }
            default:
                androidx.sqlite.a aVar25 = (androidx.sqlite.a) obj;
                aVar25.getClass();
                androidx.sqlite.c cVarU25 = aVar25.U("SELECT * FROM watch_progress WHERE contentKey = ? LIMIT 1");
                try {
                    cVarU25.s(1, str);
                    return cVarU25.Q() ? new com.app.mlounge.data.local.entity.e(cVarU25.F(_COROUTINE.b.u(cVarU25, "contentKey")), cVarU25.getLong(_COROUTINE.b.u(cVarU25, "positionMs")), cVarU25.getLong(_COROUTINE.b.u(cVarU25, "durationMs")), cVarU25.getLong(_COROUTINE.b.u(cVarU25, "updatedAt"))) : null;
                } finally {
                    cVarU25.close();
                }
        }
    }
}
