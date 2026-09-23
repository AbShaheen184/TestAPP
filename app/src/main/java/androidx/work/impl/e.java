package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.room.migration.a {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public e(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // androidx.room.migration.a
    public final void b(androidx.sqlite.db.framework.b bVar) {
        int i = this.c;
        bVar.getClass();
        switch (i) {
            case 0:
                if (this.b >= 10) {
                    bVar.L(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.a();
                    try {
                        bVar.L(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        bVar.L(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        bVar.X();
                        bVar.x();
                    } catch (Throwable th) {
                        bVar.x();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.a();
                    try {
                        bVar.L(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        bVar.L(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.X();
                        return;
                    } finally {
                        bVar.x();
                    }
                }
                return;
        }
    }

    public e(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
