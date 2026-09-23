package androidx.work.impl;

import com.app.mlounge.data.local.AppDatabase_Impl;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.emoji2.text.g {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ androidx.room.r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AppDatabase_Impl appDatabase_Impl) {
        super("6d8b217e013c2ca315f8e3487153e796", 8, "1710a304ac77dd2342fbc64de7fbaddb");
        this.e = appDatabase_Impl;
    }

    @Override // androidx.emoji2.text.g
    public final void c(androidx.sqlite.a aVar) {
        int i = this.d;
        aVar.getClass();
        switch (i) {
            case 0:
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                t1.t(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
            default:
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `watchlist` (`contentId` TEXT NOT NULL, `contentType` TEXT NOT NULL, `title` TEXT NOT NULL, `posterPath` TEXT, `backdropPath` TEXT, `rating` REAL, `releaseDate` TEXT, `overview` TEXT, `addedAt` INTEGER NOT NULL, `externalId` TEXT, `providerData` TEXT, PRIMARY KEY(`contentId`))");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `history` (`contentId` TEXT NOT NULL, `contentType` TEXT NOT NULL, `title` TEXT NOT NULL, `posterPath` TEXT, `backdropPath` TEXT, `rating` REAL, `releaseDate` TEXT, `overview` TEXT, `watchedAt` INTEGER NOT NULL, `progress` INTEGER, `duration` INTEGER, `externalId` TEXT, `season` INTEGER, `episode` INTEGER, `episodeTitle` TEXT, PRIMARY KEY(`contentId`))");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `downloads` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT NOT NULL, `fileName` TEXT NOT NULL, `title` TEXT NOT NULL, `contentType` TEXT NOT NULL, `contentId` TEXT, `posterPath` TEXT, `quality` TEXT, `size` TEXT, `status` TEXT NOT NULL, `progress` INTEGER NOT NULL, `downloadedBytes` INTEGER NOT NULL, `totalBytes` INTEGER NOT NULL, `filePath` TEXT, `headers` TEXT, `addedAt` INTEGER NOT NULL, `completedAt` INTEGER, `tmdbId` INTEGER NOT NULL, `season` INTEGER NOT NULL, `episode` INTEGER NOT NULL, `failureReason` TEXT)");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `favourite_games` (`slug` TEXT NOT NULL, `platform` TEXT NOT NULL, `name` TEXT, `posterUrl` TEXT, `year` TEXT, `addedAt` INTEGER NOT NULL, PRIMARY KEY(`slug`))");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `watch_progress` (`contentKey` TEXT NOT NULL, `positionMs` INTEGER NOT NULL, `durationMs` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`contentKey`))");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `iptv_channels` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `url` TEXT NOT NULL, `logo` TEXT, `groupName` TEXT, `provider` TEXT NOT NULL, `tvgId` TEXT)");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider` ON `iptv_channels` (`provider`)");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider_groupName` ON `iptv_channels` (`provider`, `groupName`)");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_iptv_channels_name` ON `iptv_channels` (`name`)");
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                t1.t(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6d8b217e013c2ca315f8e3487153e796')");
                break;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void e(androidx.sqlite.a aVar) {
        int i = this.d;
        aVar.getClass();
        switch (i) {
            case 0:
                t1.t(aVar, "DROP TABLE IF EXISTS `Dependency`");
                t1.t(aVar, "DROP TABLE IF EXISTS `WorkSpec`");
                t1.t(aVar, "DROP TABLE IF EXISTS `WorkTag`");
                t1.t(aVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                t1.t(aVar, "DROP TABLE IF EXISTS `WorkName`");
                t1.t(aVar, "DROP TABLE IF EXISTS `WorkProgress`");
                t1.t(aVar, "DROP TABLE IF EXISTS `Preference`");
                break;
            default:
                t1.t(aVar, "DROP TABLE IF EXISTS `watchlist`");
                t1.t(aVar, "DROP TABLE IF EXISTS `history`");
                t1.t(aVar, "DROP TABLE IF EXISTS `downloads`");
                t1.t(aVar, "DROP TABLE IF EXISTS `favourite_games`");
                t1.t(aVar, "DROP TABLE IF EXISTS `watch_progress`");
                t1.t(aVar, "DROP TABLE IF EXISTS `iptv_channels`");
                break;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void v(androidx.sqlite.a aVar) {
        int i = this.d;
        aVar.getClass();
    }

    @Override // androidx.emoji2.text.g
    public final void w(androidx.sqlite.a aVar) {
        int i = this.d;
        androidx.room.r rVar = this.e;
        aVar.getClass();
        switch (i) {
            case 0:
                t1.t(aVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) rVar).m(aVar);
                break;
            default:
                int i2 = AppDatabase_Impl.v;
                ((AppDatabase_Impl) rVar).m(aVar);
                break;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void x(androidx.sqlite.a aVar) {
        int i = this.d;
        aVar.getClass();
    }

    @Override // androidx.emoji2.text.g
    public final void y(androidx.sqlite.a aVar) {
        int i = this.d;
        aVar.getClass();
        switch (i) {
            case 0:
                okhttp3.internal.platform.android.g.f(aVar);
                break;
            default:
                okhttp3.internal.platform.android.g.f(aVar);
                break;
        }
    }

    @Override // androidx.emoji2.text.g
    public final androidx.room.v z(androidx.sqlite.a aVar) {
        int i = this.d;
        aVar.getClass();
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new androidx.room.util.g(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap.put("prerequisite_id", new androidx.room.util.g(2, 1, "prerequisite_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new androidx.room.util.h("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("id")));
                linkedHashSet.add(new androidx.room.util.h("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.q.j("prerequisite_id"), kotlin.collections.q.j("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new androidx.room.util.i("index_Dependency_work_spec_id", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("ASC"), false));
                linkedHashSet2.add(new androidx.room.util.i("index_Dependency_prerequisite_id", kotlin.collections.q.j("prerequisite_id"), kotlin.collections.q.j("ASC"), false));
                androidx.room.util.j jVar = new androidx.room.util.j("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
                androidx.room.util.j jVarB = androidx.room.t.B(aVar, "Dependency");
                if (!jVar.equals(jVarB)) {
                    return new androidx.room.v("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + jVar + "\n Found:\n" + jVarB, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new androidx.room.util.g(1, 1, "id", "TEXT", null, true));
                linkedHashMap2.put("state", new androidx.room.util.g(0, 1, "state", "INTEGER", null, true));
                linkedHashMap2.put("worker_class_name", new androidx.room.util.g(0, 1, "worker_class_name", "TEXT", null, true));
                linkedHashMap2.put("input_merger_class_name", new androidx.room.util.g(0, 1, "input_merger_class_name", "TEXT", null, true));
                linkedHashMap2.put("input", new androidx.room.util.g(0, 1, "input", "BLOB", null, true));
                linkedHashMap2.put("output", new androidx.room.util.g(0, 1, "output", "BLOB", null, true));
                linkedHashMap2.put("initial_delay", new androidx.room.util.g(0, 1, "initial_delay", "INTEGER", null, true));
                linkedHashMap2.put("interval_duration", new androidx.room.util.g(0, 1, "interval_duration", "INTEGER", null, true));
                linkedHashMap2.put("flex_duration", new androidx.room.util.g(0, 1, "flex_duration", "INTEGER", null, true));
                linkedHashMap2.put("run_attempt_count", new androidx.room.util.g(0, 1, "run_attempt_count", "INTEGER", null, true));
                linkedHashMap2.put("backoff_policy", new androidx.room.util.g(0, 1, "backoff_policy", "INTEGER", null, true));
                linkedHashMap2.put("backoff_delay_duration", new androidx.room.util.g(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                linkedHashMap2.put("last_enqueue_time", new androidx.room.util.g(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                linkedHashMap2.put("minimum_retention_duration", new androidx.room.util.g(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                linkedHashMap2.put("schedule_requested_at", new androidx.room.util.g(0, 1, "schedule_requested_at", "INTEGER", null, true));
                linkedHashMap2.put("run_in_foreground", new androidx.room.util.g(0, 1, "run_in_foreground", "INTEGER", null, true));
                linkedHashMap2.put("out_of_quota_policy", new androidx.room.util.g(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                linkedHashMap2.put("period_count", new androidx.room.util.g(0, 1, "period_count", "INTEGER", "0", true));
                linkedHashMap2.put("generation", new androidx.room.util.g(0, 1, "generation", "INTEGER", "0", true));
                linkedHashMap2.put("next_schedule_time_override", new androidx.room.util.g(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                linkedHashMap2.put("next_schedule_time_override_generation", new androidx.room.util.g(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                linkedHashMap2.put("stop_reason", new androidx.room.util.g(0, 1, "stop_reason", "INTEGER", "-256", true));
                linkedHashMap2.put("trace_tag", new androidx.room.util.g(0, 1, "trace_tag", "TEXT", null, false));
                linkedHashMap2.put("backoff_on_system_interruptions", new androidx.room.util.g(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
                linkedHashMap2.put("required_network_type", new androidx.room.util.g(0, 1, "required_network_type", "INTEGER", null, true));
                linkedHashMap2.put("required_network_request", new androidx.room.util.g(0, 1, "required_network_request", "BLOB", "x''", true));
                linkedHashMap2.put("requires_charging", new androidx.room.util.g(0, 1, "requires_charging", "INTEGER", null, true));
                linkedHashMap2.put("requires_device_idle", new androidx.room.util.g(0, 1, "requires_device_idle", "INTEGER", null, true));
                linkedHashMap2.put("requires_battery_not_low", new androidx.room.util.g(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                linkedHashMap2.put("requires_storage_not_low", new androidx.room.util.g(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                linkedHashMap2.put("trigger_content_update_delay", new androidx.room.util.g(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                linkedHashMap2.put("trigger_max_content_delay", new androidx.room.util.g(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                linkedHashMap2.put("content_uri_triggers", new androidx.room.util.g(0, 1, "content_uri_triggers", "BLOB", null, true));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new androidx.room.util.i("index_WorkSpec_schedule_requested_at", kotlin.collections.q.j("schedule_requested_at"), kotlin.collections.q.j("ASC"), false));
                linkedHashSet4.add(new androidx.room.util.i("index_WorkSpec_last_enqueue_time", kotlin.collections.q.j("last_enqueue_time"), kotlin.collections.q.j("ASC"), false));
                androidx.room.util.j jVar2 = new androidx.room.util.j("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                androidx.room.util.j jVarB2 = androidx.room.t.B(aVar, "WorkSpec");
                if (!jVar2.equals(jVarB2)) {
                    return new androidx.room.v("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + jVar2 + "\n Found:\n" + jVarB2, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new androidx.room.util.g(1, 1, "tag", "TEXT", null, true));
                linkedHashMap3.put("work_spec_id", new androidx.room.util.g(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new androidx.room.util.h("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("id")));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new androidx.room.util.i("index_WorkTag_work_spec_id", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("ASC"), false));
                androidx.room.util.j jVar3 = new androidx.room.util.j("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                androidx.room.util.j jVarB3 = androidx.room.t.B(aVar, "WorkTag");
                if (!jVar3.equals(jVarB3)) {
                    return new androidx.room.v("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + jVar3 + "\n Found:\n" + jVarB3, false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new androidx.room.util.g(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap4.put("generation", new androidx.room.util.g(2, 1, "generation", "INTEGER", "0", true));
                linkedHashMap4.put("system_id", new androidx.room.util.g(0, 1, "system_id", "INTEGER", null, true));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new androidx.room.util.h("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("id")));
                androidx.room.util.j jVar4 = new androidx.room.util.j("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
                androidx.room.util.j jVarB4 = androidx.room.t.B(aVar, "SystemIdInfo");
                if (!jVar4.equals(jVarB4)) {
                    return new androidx.room.v("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + jVar4 + "\n Found:\n" + jVarB4, false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("name", new androidx.room.util.g(1, 1, "name", "TEXT", null, true));
                linkedHashMap5.put("work_spec_id", new androidx.room.util.g(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new androidx.room.util.h("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("id")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new androidx.room.util.i("index_WorkName_work_spec_id", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("ASC"), false));
                androidx.room.util.j jVar5 = new androidx.room.util.j("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
                androidx.room.util.j jVarB5 = androidx.room.t.B(aVar, "WorkName");
                if (!jVar5.equals(jVarB5)) {
                    return new androidx.room.v("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + jVar5 + "\n Found:\n" + jVarB5, false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new androidx.room.util.g(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap6.put("progress", new androidx.room.util.g(0, 1, "progress", "BLOB", null, true));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new androidx.room.util.h("WorkSpec", "CASCADE", "CASCADE", kotlin.collections.q.j("work_spec_id"), kotlin.collections.q.j("id")));
                androidx.room.util.j jVar6 = new androidx.room.util.j("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
                androidx.room.util.j jVarB6 = androidx.room.t.B(aVar, "WorkProgress");
                if (!jVar6.equals(jVarB6)) {
                    return new androidx.room.v("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + jVar6 + "\n Found:\n" + jVarB6, false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new androidx.room.util.g(1, 1, "key", "TEXT", null, true));
                linkedHashMap7.put("long_value", new androidx.room.util.g(0, 1, "long_value", "INTEGER", null, false));
                androidx.room.util.j jVar7 = new androidx.room.util.j("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                androidx.room.util.j jVarB7 = androidx.room.t.B(aVar, "Preference");
                if (jVar7.equals(jVarB7)) {
                    return new androidx.room.v(null, true);
                }
                return new androidx.room.v("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + jVar7 + "\n Found:\n" + jVarB7, false);
            default:
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("contentId", new androidx.room.util.g(1, 1, "contentId", "TEXT", null, true));
                linkedHashMap8.put("contentType", new androidx.room.util.g(0, 1, "contentType", "TEXT", null, true));
                linkedHashMap8.put("title", new androidx.room.util.g(0, 1, "title", "TEXT", null, true));
                linkedHashMap8.put("posterPath", new androidx.room.util.g(0, 1, "posterPath", "TEXT", null, false));
                linkedHashMap8.put("backdropPath", new androidx.room.util.g(0, 1, "backdropPath", "TEXT", null, false));
                linkedHashMap8.put("rating", new androidx.room.util.g(0, 1, "rating", "REAL", null, false));
                linkedHashMap8.put("releaseDate", new androidx.room.util.g(0, 1, "releaseDate", "TEXT", null, false));
                linkedHashMap8.put("overview", new androidx.room.util.g(0, 1, "overview", "TEXT", null, false));
                linkedHashMap8.put("addedAt", new androidx.room.util.g(0, 1, "addedAt", "INTEGER", null, true));
                linkedHashMap8.put("externalId", new androidx.room.util.g(0, 1, "externalId", "TEXT", null, false));
                linkedHashMap8.put("providerData", new androidx.room.util.g(0, 1, "providerData", "TEXT", null, false));
                androidx.room.util.j jVar8 = new androidx.room.util.j("watchlist", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
                androidx.room.util.j jVarB8 = androidx.room.t.B(aVar, "watchlist");
                if (!jVar8.equals(jVarB8)) {
                    return new androidx.room.v("watchlist(com.app.mlounge.data.local.entity.WatchlistEntity).\n Expected:\n" + jVar8 + "\n Found:\n" + jVarB8, false);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("contentId", new androidx.room.util.g(1, 1, "contentId", "TEXT", null, true));
                linkedHashMap9.put("contentType", new androidx.room.util.g(0, 1, "contentType", "TEXT", null, true));
                linkedHashMap9.put("title", new androidx.room.util.g(0, 1, "title", "TEXT", null, true));
                linkedHashMap9.put("posterPath", new androidx.room.util.g(0, 1, "posterPath", "TEXT", null, false));
                linkedHashMap9.put("backdropPath", new androidx.room.util.g(0, 1, "backdropPath", "TEXT", null, false));
                linkedHashMap9.put("rating", new androidx.room.util.g(0, 1, "rating", "REAL", null, false));
                linkedHashMap9.put("releaseDate", new androidx.room.util.g(0, 1, "releaseDate", "TEXT", null, false));
                linkedHashMap9.put("overview", new androidx.room.util.g(0, 1, "overview", "TEXT", null, false));
                linkedHashMap9.put("watchedAt", new androidx.room.util.g(0, 1, "watchedAt", "INTEGER", null, true));
                linkedHashMap9.put("progress", new androidx.room.util.g(0, 1, "progress", "INTEGER", null, false));
                linkedHashMap9.put("duration", new androidx.room.util.g(0, 1, "duration", "INTEGER", null, false));
                linkedHashMap9.put("externalId", new androidx.room.util.g(0, 1, "externalId", "TEXT", null, false));
                linkedHashMap9.put("season", new androidx.room.util.g(0, 1, "season", "INTEGER", null, false));
                linkedHashMap9.put("episode", new androidx.room.util.g(0, 1, "episode", "INTEGER", null, false));
                linkedHashMap9.put("episodeTitle", new androidx.room.util.g(0, 1, "episodeTitle", "TEXT", null, false));
                androidx.room.util.j jVar9 = new androidx.room.util.j("history", linkedHashMap9, new LinkedHashSet(), new LinkedHashSet());
                androidx.room.util.j jVarB9 = androidx.room.t.B(aVar, "history");
                if (!jVar9.equals(jVarB9)) {
                    return new androidx.room.v("history(com.app.mlounge.data.local.entity.HistoryEntity).\n Expected:\n" + jVar9 + "\n Found:\n" + jVarB9, false);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("id", new androidx.room.util.g(1, 1, "id", "INTEGER", null, true));
                linkedHashMap10.put("url", new androidx.room.util.g(0, 1, "url", "TEXT", null, true));
                linkedHashMap10.put("fileName", new androidx.room.util.g(0, 1, "fileName", "TEXT", null, true));
                linkedHashMap10.put("title", new androidx.room.util.g(0, 1, "title", "TEXT", null, true));
                linkedHashMap10.put("contentType", new androidx.room.util.g(0, 1, "contentType", "TEXT", null, true));
                linkedHashMap10.put("contentId", new androidx.room.util.g(0, 1, "contentId", "TEXT", null, false));
                linkedHashMap10.put("posterPath", new androidx.room.util.g(0, 1, "posterPath", "TEXT", null, false));
                linkedHashMap10.put("quality", new androidx.room.util.g(0, 1, "quality", "TEXT", null, false));
                linkedHashMap10.put("size", new androidx.room.util.g(0, 1, "size", "TEXT", null, false));
                linkedHashMap10.put("status", new androidx.room.util.g(0, 1, "status", "TEXT", null, true));
                linkedHashMap10.put("progress", new androidx.room.util.g(0, 1, "progress", "INTEGER", null, true));
                linkedHashMap10.put("downloadedBytes", new androidx.room.util.g(0, 1, "downloadedBytes", "INTEGER", null, true));
                linkedHashMap10.put("totalBytes", new androidx.room.util.g(0, 1, "totalBytes", "INTEGER", null, true));
                linkedHashMap10.put("filePath", new androidx.room.util.g(0, 1, "filePath", "TEXT", null, false));
                linkedHashMap10.put("headers", new androidx.room.util.g(0, 1, "headers", "TEXT", null, false));
                linkedHashMap10.put("addedAt", new androidx.room.util.g(0, 1, "addedAt", "INTEGER", null, true));
                linkedHashMap10.put("completedAt", new androidx.room.util.g(0, 1, "completedAt", "INTEGER", null, false));
                linkedHashMap10.put("tmdbId", new androidx.room.util.g(0, 1, "tmdbId", "INTEGER", null, true));
                linkedHashMap10.put("season", new androidx.room.util.g(0, 1, "season", "INTEGER", null, true));
                linkedHashMap10.put("episode", new androidx.room.util.g(0, 1, "episode", "INTEGER", null, true));
                linkedHashMap10.put("failureReason", new androidx.room.util.g(0, 1, "failureReason", "TEXT", null, false));
                androidx.room.util.j jVar10 = new androidx.room.util.j("downloads", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
                androidx.room.util.j jVarB10 = androidx.room.t.B(aVar, "downloads");
                if (!jVar10.equals(jVarB10)) {
                    return new androidx.room.v("downloads(com.app.mlounge.data.local.entity.DownloadEntity).\n Expected:\n" + jVar10 + "\n Found:\n" + jVarB10, false);
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("slug", new androidx.room.util.g(1, 1, "slug", "TEXT", null, true));
                linkedHashMap11.put("platform", new androidx.room.util.g(0, 1, "platform", "TEXT", null, true));
                linkedHashMap11.put("name", new androidx.room.util.g(0, 1, "name", "TEXT", null, false));
                linkedHashMap11.put("posterUrl", new androidx.room.util.g(0, 1, "posterUrl", "TEXT", null, false));
                linkedHashMap11.put("year", new androidx.room.util.g(0, 1, "year", "TEXT", null, false));
                linkedHashMap11.put("addedAt", new androidx.room.util.g(0, 1, "addedAt", "INTEGER", null, true));
                androidx.room.util.j jVar11 = new androidx.room.util.j("favourite_games", linkedHashMap11, new LinkedHashSet(), new LinkedHashSet());
                androidx.room.util.j jVarB11 = androidx.room.t.B(aVar, "favourite_games");
                if (!jVar11.equals(jVarB11)) {
                    return new androidx.room.v("favourite_games(com.app.mlounge.data.local.entity.FavouriteGameEntity).\n Expected:\n" + jVar11 + "\n Found:\n" + jVarB11, false);
                }
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                linkedHashMap12.put("contentKey", new androidx.room.util.g(1, 1, "contentKey", "TEXT", null, true));
                linkedHashMap12.put("positionMs", new androidx.room.util.g(0, 1, "positionMs", "INTEGER", null, true));
                linkedHashMap12.put("durationMs", new androidx.room.util.g(0, 1, "durationMs", "INTEGER", null, true));
                linkedHashMap12.put("updatedAt", new androidx.room.util.g(0, 1, "updatedAt", "INTEGER", null, true));
                androidx.room.util.j jVar12 = new androidx.room.util.j("watch_progress", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
                androidx.room.util.j jVarB12 = androidx.room.t.B(aVar, "watch_progress");
                if (!jVar12.equals(jVarB12)) {
                    return new androidx.room.v("watch_progress(com.app.mlounge.data.local.entity.WatchProgressEntity).\n Expected:\n" + jVar12 + "\n Found:\n" + jVarB12, false);
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                linkedHashMap13.put("id", new androidx.room.util.g(1, 1, "id", "INTEGER", null, true));
                linkedHashMap13.put("name", new androidx.room.util.g(0, 1, "name", "TEXT", null, true));
                linkedHashMap13.put("url", new androidx.room.util.g(0, 1, "url", "TEXT", null, true));
                linkedHashMap13.put("logo", new androidx.room.util.g(0, 1, "logo", "TEXT", null, false));
                linkedHashMap13.put("groupName", new androidx.room.util.g(0, 1, "groupName", "TEXT", null, false));
                linkedHashMap13.put("provider", new androidx.room.util.g(0, 1, "provider", "TEXT", null, true));
                linkedHashMap13.put("tvgId", new androidx.room.util.g(0, 1, "tvgId", "TEXT", null, false));
                LinkedHashSet linkedHashSet11 = new LinkedHashSet();
                LinkedHashSet linkedHashSet12 = new LinkedHashSet();
                linkedHashSet12.add(new androidx.room.util.i("index_iptv_channels_provider", kotlin.collections.q.j("provider"), kotlin.collections.q.j("ASC"), false));
                linkedHashSet12.add(new androidx.room.util.i("index_iptv_channels_provider_groupName", kotlin.collections.q.k("provider", "groupName"), kotlin.collections.q.k("ASC", "ASC"), false));
                linkedHashSet12.add(new androidx.room.util.i("index_iptv_channels_name", kotlin.collections.q.j("name"), kotlin.collections.q.j("ASC"), false));
                androidx.room.util.j jVar13 = new androidx.room.util.j("iptv_channels", linkedHashMap13, linkedHashSet11, linkedHashSet12);
                androidx.room.util.j jVarB13 = androidx.room.t.B(aVar, "iptv_channels");
                if (jVar13.equals(jVarB13)) {
                    return new androidx.room.v(null, true);
                }
                return new androidx.room.v("iptv_channels(com.app.mlounge.data.local.entity.IptvChannelEntity).\n Expected:\n" + jVar13 + "\n Found:\n" + jVarB13, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }
}
