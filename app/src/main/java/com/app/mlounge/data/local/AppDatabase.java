package com.app.mlounge.data.local;

import androidx.room.r;
import com.app.mlounge.data.local.dao.f;
import com.app.mlounge.data.local.dao.h;
import com.app.mlounge.data.local.dao.i;
import com.app.mlounge.data.local.dao.k;
import com.app.mlounge.data.local.dao.m;
import java.util.List;
import kotlin.collections.q;
import kotlin.collections.w;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends r {
    public static final b l;
    public static final b m;
    public static final b n;
    public static final List o;

    static {
        int i = 8;
        l = new b(7, i, 2);
        m = new b(5, i, 0);
        n = new b(6, i, 1);
        a aVar = new a("id", "INTEGER", true, true, true);
        int i2 = 24;
        String str = "url";
        String str2 = "TEXT";
        boolean z = true;
        a aVar2 = new a(i2, str, str2, z);
        a aVar3 = new a(i2, "fileName", str2, z);
        String str3 = "title";
        a aVar4 = new a(i2, str3, str2, z);
        String str4 = "contentType";
        a aVar5 = new a(i2, str4, str2, z);
        String str5 = "contentId";
        boolean z2 = false;
        a aVar6 = new a(i2, str5, str2, z2);
        String str6 = "posterPath";
        a aVar7 = new a(i2, str6, str2, z2);
        a aVar8 = new a(i2, "quality", str2, z2);
        a aVar9 = new a(i2, "size", str2, z2);
        boolean z3 = true;
        a aVar10 = new a(i2, "status", str2, z3);
        String str7 = "progress";
        String str8 = "INTEGER";
        a aVar11 = new a(i2, str7, str8, z3);
        a aVar12 = new a(i2, "downloadedBytes", str8, z3);
        a aVar13 = new a(i2, "totalBytes", str8, z3);
        boolean z4 = false;
        a aVar14 = new a(i2, "filePath", str2, z4);
        a aVar15 = new a(i2, "headers", str2, z4);
        String str9 = "addedAt";
        a aVar16 = new a(i2, str9, str8, true);
        a aVar17 = new a(i2, "completedAt", str8, false);
        boolean z5 = true;
        a aVar18 = new a(i2, "tmdbId", str8, z5);
        String str10 = "season";
        a aVar19 = new a(i2, str10, str8, z5);
        String str11 = "episode";
        boolean z6 = false;
        List listK = q.k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, new a(i2, str11, str8, z5), new a(i2, "failureReason", str2, z6));
        w wVar = w.e;
        c cVar = new c("downloads", listK, wVar);
        boolean z7 = true;
        a aVar20 = new a(16, str5, str2, z7);
        int i3 = 24;
        a aVar21 = new a(i3, str4, str2, z7);
        a aVar22 = new a(i3, str3, str2, z7);
        a aVar23 = new a(i3, str6, str2, z6);
        String str12 = "backdropPath";
        a aVar24 = new a(i3, str12, str2, z6);
        String str13 = "rating";
        String str14 = "REAL";
        a aVar25 = new a(i3, str13, str14, z6);
        String str15 = "releaseDate";
        a aVar26 = new a(i3, str15, str2, z6);
        String str16 = "overview";
        a aVar27 = new a(i3, str16, str2, z6);
        a aVar28 = new a(i3, str9, str8, true);
        String str17 = "externalId";
        boolean z8 = false;
        c cVar2 = new c("watchlist", q.k(aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, new a(i3, str17, str2, z8), new a(i3, "providerData", str2, z8)), wVar);
        boolean z9 = true;
        a aVar29 = new a(16, str5, str2, z9);
        a aVar30 = new a(i3, str4, str2, z9);
        a aVar31 = new a(i3, str3, str2, z9);
        boolean z10 = false;
        a aVar32 = new a(i3, str6, str2, z10);
        a aVar33 = new a(i3, str12, str2, z10);
        a aVar34 = new a(i3, str13, str14, z10);
        a aVar35 = new a(i3, str15, str2, z10);
        a aVar36 = new a(i3, str16, str2, z10);
        a aVar37 = new a(i3, "watchedAt", str8, true);
        boolean z11 = false;
        c cVar3 = new c("history", q.k(aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, new a(i3, str7, str8, z11), new a(i3, "duration", str8, z11), new a(i3, str17, str2, z11), new a(i3, str10, str8, z11), new a(i3, str11, str8, z11), new a(i3, "episodeTitle", str2, z11)), wVar);
        boolean z12 = true;
        String str18 = "name";
        boolean z13 = false;
        c cVar4 = new c("favourite_games", q.k(new a(16, "slug", str2, z12), new a(i3, "platform", str2, z12), new a(i3, str18, str2, z13), new a(i3, "posterUrl", str2, z13), new a(i3, "year", str2, z13), new a(i3, str9, str8, z12)), wVar);
        c cVar5 = new c("watch_progress", q.k(new a(16, "contentKey", str2, z12), new a(i3, "positionMs", str8, z12), new a(i3, "durationMs", str8, z12), new a(i3, "updatedAt", str8, z12)), wVar);
        boolean z14 = true;
        int i4 = 24;
        boolean z15 = false;
        o = q.k(cVar, cVar2, cVar3, cVar4, cVar5, new c("iptv_channels", q.k(new a("id", "INTEGER", true, true, true), new a(i4, str18, str2, z14), new a(i4, str, str2, z14), new a(i4, "logo", str2, z15), new a(i4, "groupName", str2, z15), new a(i4, "provider", str2, z14), new a(i4, "tvgId", str2, z15)), q.k("CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider` ON `iptv_channels` (`provider`)", "CREATE INDEX IF NOT EXISTS `index_iptv_channels_provider_groupName` ON `iptv_channels` (`provider`, `groupName`)", "CREATE INDEX IF NOT EXISTS `index_iptv_channels_name` ON `iptv_channels` (`name`)")));
    }

    public abstract com.app.mlounge.data.local.dao.d r();

    public abstract f s();

    public abstract h t();

    public abstract i u();

    public abstract k v();

    public abstract m w();
}
