package androidx.work.impl.model;

import androidx.work.f0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends coil3.network.g {
    public final /* synthetic */ int j;

    public /* synthetic */ b(int i) {
        this.j = i;
    }

    @Override // coil3.network.g
    public final void e(androidx.sqlite.c cVar, Object obj) {
        int i;
        int i2 = 1;
        switch (this.j) {
            case 0:
                a aVar = (a) obj;
                cVar.getClass();
                aVar.getClass();
                cVar.s(1, aVar.a);
                cVar.s(2, aVar.b);
                break;
            case 1:
                d dVar = (d) obj;
                cVar.getClass();
                dVar.getClass();
                cVar.s(1, dVar.a);
                cVar.f(2, dVar.b.longValue());
                break;
            case 2:
                g gVar = (g) obj;
                cVar.getClass();
                gVar.getClass();
                cVar.s(1, gVar.a);
                cVar.f(2, gVar.b);
                cVar.f(3, gVar.c);
                break;
            case 3:
                k kVar = (k) obj;
                cVar.getClass();
                kVar.getClass();
                cVar.s(1, kVar.a);
                cVar.s(2, kVar.b);
                break;
            case 4:
                m mVar = (m) obj;
                cVar.getClass();
                mVar.getClass();
                cVar.s(1, mVar.a);
                androidx.work.i iVar = androidx.work.i.b;
                cVar.h(android.support.v4.media.session.b.G(mVar.b), 2);
                break;
            case 5:
                p pVar = (p) obj;
                cVar.getClass();
                pVar.getClass();
                cVar.s(1, pVar.a);
                cVar.f(2, com.google.android.gms.dynamite.g.P(pVar.b));
                cVar.s(3, pVar.c);
                cVar.s(4, pVar.d);
                androidx.work.i iVar2 = androidx.work.i.b;
                cVar.h(android.support.v4.media.session.b.G(pVar.e), 5);
                cVar.h(android.support.v4.media.session.b.G(pVar.f), 6);
                cVar.f(7, pVar.g);
                cVar.f(8, pVar.h);
                cVar.f(9, pVar.i);
                cVar.f(10, pVar.k);
                androidx.work.a aVar2 = pVar.l;
                aVar2.getClass();
                int iOrdinal = aVar2.ordinal();
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
                String str = pVar.x;
                if (str == null) {
                    cVar.j(23);
                } else {
                    cVar.s(23, str);
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
                break;
            case 6:
                u uVar = (u) obj;
                cVar.getClass();
                uVar.getClass();
                cVar.s(1, uVar.a);
                cVar.s(2, uVar.b);
                break;
            case 7:
                com.app.mlounge.data.local.entity.a aVar3 = (com.app.mlounge.data.local.entity.a) obj;
                cVar.getClass();
                aVar3.getClass();
                cVar.f(1, aVar3.a);
                cVar.s(2, aVar3.b);
                cVar.s(3, aVar3.c);
                cVar.s(4, aVar3.d);
                cVar.s(5, aVar3.e);
                String str2 = aVar3.f;
                if (str2 == null) {
                    cVar.j(6);
                } else {
                    cVar.s(6, str2);
                }
                String str3 = aVar3.g;
                if (str3 == null) {
                    cVar.j(7);
                } else {
                    cVar.s(7, str3);
                }
                String str4 = aVar3.h;
                if (str4 == null) {
                    cVar.j(8);
                } else {
                    cVar.s(8, str4);
                }
                String str5 = aVar3.i;
                if (str5 == null) {
                    cVar.j(9);
                } else {
                    cVar.s(9, str5);
                }
                cVar.s(10, aVar3.j);
                cVar.f(11, aVar3.k);
                cVar.f(12, aVar3.l);
                cVar.f(13, aVar3.m);
                String str6 = aVar3.n;
                if (str6 == null) {
                    cVar.j(14);
                } else {
                    cVar.s(14, str6);
                }
                String str7 = aVar3.o;
                if (str7 == null) {
                    cVar.j(15);
                } else {
                    cVar.s(15, str7);
                }
                cVar.f(16, aVar3.p);
                Long l = aVar3.q;
                if (l == null) {
                    cVar.j(17);
                } else {
                    cVar.f(17, l.longValue());
                }
                cVar.f(18, aVar3.r);
                cVar.f(19, aVar3.s);
                cVar.f(20, aVar3.t);
                String str8 = aVar3.u;
                if (str8 != null) {
                    cVar.s(21, str8);
                } else {
                    cVar.j(21);
                }
                break;
            case 8:
                com.app.mlounge.data.local.entity.b bVar = (com.app.mlounge.data.local.entity.b) obj;
                cVar.getClass();
                bVar.getClass();
                cVar.s(1, bVar.a);
                cVar.s(2, bVar.b);
                String str9 = bVar.c;
                if (str9 == null) {
                    cVar.j(3);
                } else {
                    cVar.s(3, str9);
                }
                String str10 = bVar.d;
                if (str10 == null) {
                    cVar.j(4);
                } else {
                    cVar.s(4, str10);
                }
                String str11 = bVar.e;
                if (str11 == null) {
                    cVar.j(5);
                } else {
                    cVar.s(5, str11);
                }
                cVar.f(6, bVar.f);
                break;
            case 9:
                com.app.mlounge.data.local.entity.c cVar2 = (com.app.mlounge.data.local.entity.c) obj;
                cVar.getClass();
                cVar2.getClass();
                cVar.s(1, cVar2.a);
                cVar.s(2, cVar2.b);
                cVar.s(3, cVar2.c);
                String str12 = cVar2.d;
                if (str12 == null) {
                    cVar.j(4);
                } else {
                    cVar.s(4, str12);
                }
                String str13 = cVar2.e;
                if (str13 == null) {
                    cVar.j(5);
                } else {
                    cVar.s(5, str13);
                }
                Double d = cVar2.f;
                if (d == null) {
                    cVar.j(6);
                } else {
                    cVar.v(d.doubleValue());
                }
                String str14 = cVar2.g;
                if (str14 == null) {
                    cVar.j(7);
                } else {
                    cVar.s(7, str14);
                }
                String str15 = cVar2.h;
                if (str15 == null) {
                    cVar.j(8);
                } else {
                    cVar.s(8, str15);
                }
                cVar.f(9, cVar2.i);
                Long l2 = cVar2.j;
                if (l2 == null) {
                    cVar.j(10);
                } else {
                    cVar.f(10, l2.longValue());
                }
                Long l3 = cVar2.k;
                if (l3 == null) {
                    cVar.j(11);
                } else {
                    cVar.f(11, l3.longValue());
                }
                String str16 = cVar2.l;
                if (str16 == null) {
                    cVar.j(12);
                } else {
                    cVar.s(12, str16);
                }
                Integer num = cVar2.m;
                if (num == null) {
                    cVar.j(13);
                } else {
                    cVar.f(13, num.intValue());
                }
                Integer num2 = cVar2.n;
                if (num2 == null) {
                    cVar.j(14);
                } else {
                    cVar.f(14, num2.intValue());
                }
                String str17 = cVar2.o;
                if (str17 != null) {
                    cVar.s(15, str17);
                } else {
                    cVar.j(15);
                }
                break;
            case 10:
                com.app.mlounge.data.local.entity.d dVar2 = (com.app.mlounge.data.local.entity.d) obj;
                cVar.getClass();
                dVar2.getClass();
                cVar.f(1, dVar2.a);
                cVar.s(2, dVar2.b);
                cVar.s(3, dVar2.c);
                String str18 = dVar2.d;
                if (str18 == null) {
                    cVar.j(4);
                } else {
                    cVar.s(4, str18);
                }
                String str19 = dVar2.e;
                if (str19 == null) {
                    cVar.j(5);
                } else {
                    cVar.s(5, str19);
                }
                cVar.s(6, dVar2.f);
                String str20 = dVar2.g;
                if (str20 != null) {
                    cVar.s(7, str20);
                } else {
                    cVar.j(7);
                }
                break;
            case 11:
                com.app.mlounge.data.local.entity.e eVar2 = (com.app.mlounge.data.local.entity.e) obj;
                cVar.getClass();
                eVar2.getClass();
                cVar.s(1, eVar2.a);
                cVar.f(2, eVar2.b);
                cVar.f(3, eVar2.c);
                cVar.f(4, eVar2.d);
                break;
            default:
                com.app.mlounge.data.local.entity.f fVar = (com.app.mlounge.data.local.entity.f) obj;
                cVar.getClass();
                fVar.getClass();
                cVar.s(1, fVar.a);
                cVar.s(2, fVar.b);
                cVar.s(3, fVar.c);
                String str21 = fVar.d;
                if (str21 == null) {
                    cVar.j(4);
                } else {
                    cVar.s(4, str21);
                }
                String str22 = fVar.e;
                if (str22 == null) {
                    cVar.j(5);
                } else {
                    cVar.s(5, str22);
                }
                Double d2 = fVar.f;
                if (d2 == null) {
                    cVar.j(6);
                } else {
                    cVar.v(d2.doubleValue());
                }
                String str23 = fVar.g;
                if (str23 == null) {
                    cVar.j(7);
                } else {
                    cVar.s(7, str23);
                }
                String str24 = fVar.h;
                if (str24 == null) {
                    cVar.j(8);
                } else {
                    cVar.s(8, str24);
                }
                cVar.f(9, fVar.i);
                String str25 = fVar.j;
                if (str25 == null) {
                    cVar.j(10);
                } else {
                    cVar.s(10, str25);
                }
                String str26 = fVar.k;
                if (str26 != null) {
                    cVar.s(11, str26);
                } else {
                    cVar.j(11);
                }
                break;
        }
    }

    @Override // coil3.network.g
    public final String m() {
        switch (this.j) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `downloads` (`id`,`url`,`fileName`,`title`,`contentType`,`contentId`,`posterPath`,`quality`,`size`,`status`,`progress`,`downloadedBytes`,`totalBytes`,`filePath`,`headers`,`addedAt`,`completedAt`,`tmdbId`,`season`,`episode`,`failureReason`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `favourite_games` (`slug`,`platform`,`name`,`posterUrl`,`year`,`addedAt`) VALUES (?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `history` (`contentId`,`contentType`,`title`,`posterPath`,`backdropPath`,`rating`,`releaseDate`,`overview`,`watchedAt`,`progress`,`duration`,`externalId`,`season`,`episode`,`episodeTitle`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `iptv_channels` (`id`,`name`,`url`,`logo`,`groupName`,`provider`,`tvgId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            case 11:
                return "INSERT INTO `watch_progress` (`contentKey`,`positionMs`,`durationMs`,`updatedAt`) VALUES (?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `watchlist` (`contentId`,`contentType`,`title`,`posterPath`,`backdropPath`,`rating`,`releaseDate`,`overview`,`addedAt`,`externalId`,`providerData`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
