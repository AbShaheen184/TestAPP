package com.app.mlounge.data.local;

import androidx.work.impl.model.f;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.room.migration.a {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // androidx.room.migration.a
    public final void b(androidx.sqlite.db.framework.b bVar) throws IOException {
        int i = this.c;
        bVar.getClass();
        switch (i) {
            case 0:
                b bVar2 = AppDatabase.l;
                f.p(bVar);
                break;
            case 1:
                b bVar3 = AppDatabase.l;
                f.p(bVar);
                break;
            default:
                bVar.A("CREATE TABLE IF NOT EXISTS `iptv_channels` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `name` TEXT NOT NULL, \n    `url` TEXT NOT NULL, \n    `logo` TEXT, \n    `groupName` TEXT, \n    `provider` TEXT NOT NULL, \n    `tvgId` TEXT\n)");
                bVar.A("CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider` ON `iptv_channels` (`provider`)");
                bVar.A("CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider_groupName` ON `iptv_channels` (`provider`, `groupName`)");
                bVar.A("CREATE INDEX IF NOT EXISTS `index_iptv_channels_name` ON `iptv_channels` (`name`)");
                break;
        }
    }
}
