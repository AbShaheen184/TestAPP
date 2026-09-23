package androidx.work.impl.model;

import androidx.work.f0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.work.impl.v {
    public final /* synthetic */ int G;

    public /* synthetic */ s(int i) {
        this.G = i;
    }

    @Override // androidx.work.impl.v
    public final void d(androidx.sqlite.c cVar, Object obj) {
        int i;
        int i2 = 1;
        switch (this.G) {
            case 0:
                p pVar = (p) obj;
                cVar.getClass();
                String str = pVar.a;
                cVar.s(1, str);
                cVar.f(2, com.google.android.gms.dynamite.g.P(pVar.b));
                cVar.s(3, pVar.c);
                cVar.s(4, pVar.d);
                androidx.work.i iVar = androidx.work.i.b;
                cVar.h(android.support.v4.media.session.b.G(pVar.e), 5);
                cVar.h(android.support.v4.media.session.b.G(pVar.f), 6);
                cVar.f(7, pVar.g);
                cVar.f(8, pVar.h);
                cVar.f(9, pVar.i);
                cVar.f(10, pVar.k);
                androidx.work.a aVar = pVar.l;
                aVar.getClass();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal != 1) {
                    coil3.g.a();
                } else {
                    i = 1;
                }
                cVar.f(11, i);
                cVar.f(12, pVar.m);
                cVar.f(13, pVar.n);
                cVar.f(14, pVar.o);
                cVar.f(15, pVar.p);
                cVar.f(16, pVar.q ? 1L : 0L);
                f0 f0Var = pVar.r;
                f0Var.getClass();
                int iOrdinal2 = f0Var.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                } else if (iOrdinal2 != 1) {
                    coil3.g.a();
                }
                cVar.f(17, i2);
                cVar.f(18, pVar.s);
                cVar.f(19, pVar.t);
                cVar.f(20, pVar.u);
                cVar.f(21, pVar.v);
                cVar.f(22, pVar.w);
                String str2 = pVar.x;
                if (str2 == null) {
                    cVar.j(23);
                } else {
                    cVar.s(23, str2);
                }
                Boolean bool = pVar.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    cVar.j(24);
                } else {
                    cVar.f(24, numValueOf.intValue());
                }
                androidx.work.e eVar = pVar.j;
                cVar.f(25, com.google.android.gms.dynamite.g.H(eVar.a));
                cVar.h(com.google.android.gms.dynamite.g.q(eVar.b), 26);
                cVar.f(27, eVar.c ? 1L : 0L);
                cVar.f(28, eVar.d ? 1L : 0L);
                cVar.f(29, eVar.e ? 1L : 0L);
                cVar.f(30, eVar.f ? 1L : 0L);
                cVar.f(31, eVar.g);
                cVar.f(32, eVar.h);
                cVar.h(com.google.android.gms.dynamite.g.N(eVar.i), 33);
                cVar.s(34, str);
                break;
            case 1:
                com.app.mlounge.data.local.entity.a aVar2 = (com.app.mlounge.data.local.entity.a) obj;
                cVar.getClass();
                long j = aVar2.a;
                cVar.f(1, j);
                cVar.s(2, aVar2.b);
                cVar.s(3, aVar2.c);
                cVar.s(4, aVar2.d);
                cVar.s(5, aVar2.e);
                String str3 = aVar2.f;
                if (str3 == null) {
                    cVar.j(6);
                } else {
                    cVar.s(6, str3);
                }
                String str4 = aVar2.g;
                if (str4 == null) {
                    cVar.j(7);
                } else {
                    cVar.s(7, str4);
                }
                String str5 = aVar2.h;
                if (str5 == null) {
                    cVar.j(8);
                } else {
                    cVar.s(8, str5);
                }
                String str6 = aVar2.i;
                if (str6 == null) {
                    cVar.j(9);
                } else {
                    cVar.s(9, str6);
                }
                cVar.s(10, aVar2.j);
                cVar.f(11, aVar2.k);
                cVar.f(12, aVar2.l);
                cVar.f(13, aVar2.m);
                String str7 = aVar2.n;
                if (str7 == null) {
                    cVar.j(14);
                } else {
                    cVar.s(14, str7);
                }
                String str8 = aVar2.o;
                if (str8 == null) {
                    cVar.j(15);
                } else {
                    cVar.s(15, str8);
                }
                cVar.f(16, aVar2.p);
                Long l = aVar2.q;
                if (l == null) {
                    cVar.j(17);
                } else {
                    cVar.f(17, l.longValue());
                }
                cVar.f(18, aVar2.r);
                cVar.f(19, aVar2.s);
                cVar.f(20, aVar2.t);
                String str9 = aVar2.u;
                if (str9 == null) {
                    cVar.j(21);
                } else {
                    cVar.s(21, str9);
                }
                cVar.f(22, j);
                break;
            default:
                com.app.mlounge.data.local.entity.e eVar2 = (com.app.mlounge.data.local.entity.e) obj;
                cVar.getClass();
                String str10 = eVar2.a;
                cVar.s(1, str10);
                cVar.f(2, eVar2.b);
                cVar.f(3, eVar2.c);
                cVar.f(4, eVar2.d);
                cVar.s(5, str10);
                break;
        }
    }

    @Override // androidx.work.impl.v
    public final String i() {
        switch (this.G) {
            case 0:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `downloads` SET `id` = ?,`url` = ?,`fileName` = ?,`title` = ?,`contentType` = ?,`contentId` = ?,`posterPath` = ?,`quality` = ?,`size` = ?,`status` = ?,`progress` = ?,`downloadedBytes` = ?,`totalBytes` = ?,`filePath` = ?,`headers` = ?,`addedAt` = ?,`completedAt` = ?,`tmdbId` = ?,`season` = ?,`episode` = ?,`failureReason` = ? WHERE `id` = ?";
            default:
                return "UPDATE `watch_progress` SET `contentKey` = ?,`positionMs` = ?,`durationMs` = ?,`updatedAt` = ? WHERE `contentKey` = ?";
        }
    }
}
