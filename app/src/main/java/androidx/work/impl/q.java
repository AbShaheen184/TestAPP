package androidx.work.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.room.migration.a {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i) {
        super(14, 15);
        this.c = i;
        switch (i) {
            case 1:
                super(19, 20);
                this.d = new com.google.android.gms.common.internal.k(19);
                break;
            default:
                this.d = new androidx.work.impl.model.f(19);
                break;
        }
    }

    @Override // androidx.room.migration.a
    public final void a(androidx.sqlite.a aVar) {
        int i = this.c;
        aVar.getClass();
        switch (i) {
            case 0:
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                t1.t(aVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                t1.t(aVar, "DROP TABLE `WorkSpec`");
                t1.t(aVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                androidx.work.impl.model.f fVar = (androidx.work.impl.model.f) this.d;
                if (aVar instanceof androidx.sqlite.driver.a) {
                    androidx.sqlite.db.framework.b bVar = ((androidx.sqlite.driver.a) aVar).e;
                    fVar.getClass();
                    bVar.getClass();
                    bVar.A("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    Object[] objArr = new Object[0];
                    bVar.getClass();
                    if (contentValues.size() == 0) {
                        kotlinx.coroutines.future.a.q("Empty values");
                        return;
                    }
                    int size = contentValues.size();
                    int length = objArr.length + size;
                    Object[] objArr2 = new Object[length];
                    StringBuilder sb = new StringBuilder("UPDATE ");
                    sb.append(androidx.sqlite.db.framework.b.y[3]);
                    sb.append("WorkSpec SET ");
                    int i2 = 0;
                    for (String str : contentValues.keySet()) {
                        sb.append(i2 > 0 ? "," : "");
                        sb.append(str);
                        objArr2[i2] = contentValues.get(str);
                        sb.append("=?");
                        i2++;
                    }
                    for (int i3 = size; i3 < length; i3++) {
                        objArr2[i3] = objArr[i3 - size];
                    }
                    if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                        sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                    }
                    androidx.sqlite.db.framework.i iVarN = bVar.n(sb.toString());
                    int length2 = objArr2.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        Object obj = objArr2[i4];
                        i4++;
                        if (obj == null) {
                            iVarN.j(i4);
                        } else if (obj instanceof byte[]) {
                            iVarN.h((byte[]) obj, i4);
                        } else if (obj instanceof Float) {
                            iVarN.G(((Number) obj).floatValue(), i4);
                        } else if (obj instanceof Double) {
                            iVarN.G(((Number) obj).doubleValue(), i4);
                        } else if (obj instanceof Long) {
                            iVarN.f(i4, ((Number) obj).longValue());
                        } else if (obj instanceof Integer) {
                            iVarN.f(i4, ((Number) obj).intValue());
                        } else if (obj instanceof Short) {
                            iVarN.f(i4, ((Number) obj).shortValue());
                        } else if (obj instanceof Byte) {
                            iVarN.f(i4, ((Number) obj).byteValue());
                        } else if (obj instanceof String) {
                            iVarN.m(i4, (String) obj);
                        } else {
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i4 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            iVarN.f(i4, ((Boolean) obj).booleanValue() ? 1L : 0L);
                        }
                    }
                    iVarN.y.executeUpdateDelete();
                    return;
                }
                return;
            default:
                t1.t(aVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                t1.t(aVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                t1.t(aVar, "DROP TABLE `WorkSpec`");
                t1.t(aVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                t1.t(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                com.google.android.gms.common.internal.k kVar = (com.google.android.gms.common.internal.k) this.d;
                if (aVar instanceof androidx.sqlite.driver.a) {
                    androidx.sqlite.db.framework.b bVar2 = ((androidx.sqlite.driver.a) aVar).e;
                    kVar.getClass();
                    bVar2.getClass();
                    bVar2.A("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
                }
                return;
        }
    }
}
