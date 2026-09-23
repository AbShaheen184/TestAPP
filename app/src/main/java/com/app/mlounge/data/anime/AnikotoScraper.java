package com.app.mlounge.data.anime;

import android.content.Context;
import android.net.Uri;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.app.mlounge.data.remote.model.HiAnimeAnimeData;
import com.app.mlounge.data.remote.model.HiAnimeCategoryData;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpCount;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.HiAnimeEpisodesData;
import com.app.mlounge.data.remote.model.HiAnimeGenresData;
import com.app.mlounge.data.remote.model.HiAnimeHome;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.remote.model.HiAnimeResponse;
import com.app.mlounge.data.remote.model.HiAnimeSearchData;
import com.app.mlounge.data.remote.model.HiAnimeServer;
import com.app.mlounge.data.remote.model.HiAnimeServersData;
import com.app.mlounge.data.remote.model.HiAnimeSource;
import com.app.mlounge.data.remote.model.HiAnimeSourcesData;
import com.app.mlounge.data.remote.model.HiAnimeStats;
import com.app.mlounge.data.remote.model.HiAnimeTrack;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.i;
import com.google.gson.j;
import dagger.internal.d;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.c0;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.w;
import kotlin.h;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.text.r;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.internal.connection.m;
import okhttp3.x;
import okhttp3.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AnikotoScraper {
    private static final String API_BASE = "https://anikoto.ddns.me/api";
    private static final String TAG = "AnikotoScraper";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/124.0 Safari/537.36";
    private final y client;
    private final e gson;
    private final Map<String, j> watchCache;
    private final h watchClient$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> GENRES = q.k("Action", "Adventure", "Cars", "Comedy", "Dementia", "Demons", "Drama", "Ecchi", "Fantasy", "Game", "Harem", "Historical", "Horror", "Isekai", "Josei", "Kids", "Magic", "Mahou Shoujo", "Martial Arts", "Mecha", "Military", "Music", "Mystery", "Parody", "Police", "Psychological", "Romance", "Samurai", "School", "Sci-Fi", "Seinen", "Shoujo", "Shoujo Ai", "Shounen", "Shounen Ai", "Slice of Life", "Space", "Sports", "Super Power", "Supernatural", "Thriller", "unknown", "Vampire", "Movie", "ONA", "OVA", "Special", "TV", "Updated", "Added", "Most Viewed", "Upcoming", "Ongoing");
    private static final Map<String, Integer> GENRE_ID_MAP = c0.k(new k("Action", 1), new k("Adventure", 2), new k("Cars", 538), new k("Comedy", 8), new k("Dementia", 453), new k("Demons", Integer.valueOf(Token.INC)), new k("Drama", 62), new k("Ecchi", 214), new k("Fantasy", 3), new k("Game", 180), new k("Harem", 215), new k("Historical", 70), new k("Horror", 222), new k("Isekai", 74), new k("Josei", 404), new k("Kids", 46), new k("Magic", 203), new k("Martial Arts", 114), new k("Mecha", Integer.valueOf(Token.EXPORT)), new k("Military", Integer.valueOf(Token.IF)), new k("Music", 242), new k("Mystery", 57), new k("Parody", Integer.valueOf(Token.XMLEND)), new k("Police", Integer.valueOf(Token.WITH)), new k("Psychological", 73), new k("Romance", 28), new k("Samurai", Integer.valueOf(Token.TO_OBJECT)), new k("School", 14), new k("Sci-Fi", 12), new k("Seinen", 50), new k("Shoujo", 252), new k("Shoujo Ai", 235), new k("Shounen", 15), new k("Shounen Ai", 233), new k("Slice of Life", 35), new k("Space", Integer.valueOf(Token.IMPORT)), new k("Sports", 29), new k("Super Power", 16), new k("Supernatural", 9), new k("Thriller", 54), new k("Vampire", 58));
    private static final Set<String> TYPE_CHIPS = o.D(new String[]{"Movie", "Music", "ONA", "OVA", "Special", "TV"});
    private static final Map<String, String> CATEGORY_SORT_MAP = c0.k(new k("Updated", "latest-updated"), new k("Added", "latest-added"), new k("Most Viewed", "most-viewed"));
    private static final Map<String, String> CATEGORY_STATUS_MAP = c0.k(new k("Ongoing", "currently-airing"), new k("Upcoming", "not-yet-aired"));
    private static final Map<String, String> TYPE_NORMALIZE_MAP = c0.k(new k("tv", "TV"), new k("movie", "Movie"), new k("ova", "OVA"), new k("ona", "ONA"), new k("special", "Special"));

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Envelope {
        private final g data;
        private final Boolean ok;

        public Envelope(Boolean bool, g gVar) {
            this.ok = bool;
            this.data = gVar;
        }

        public static /* synthetic */ Envelope copy$default(Envelope envelope, Boolean bool, g gVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = envelope.ok;
            }
            if ((i & 2) != 0) {
                gVar = envelope.data;
            }
            return envelope.copy(bool, gVar);
        }

        public final Boolean component1() {
            return this.ok;
        }

        public final g component2() {
            return this.data;
        }

        public final Envelope copy(Boolean bool, g gVar) {
            return new Envelope(bool, gVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Envelope)) {
                return false;
            }
            Envelope envelope = (Envelope) obj;
            return l.a(this.ok, envelope.ok) && l.a(this.data, envelope.data);
        }

        public final g getData() {
            return this.data;
        }

        public final Boolean getOk() {
            return this.ok;
        }

        public int hashCode() {
            Boolean bool = this.ok;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            g gVar = this.data;
            return iHashCode + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Envelope(ok=" + this.ok + ", data=" + this.data + ")";
        }
    }

    public AnikotoScraper(y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.gson = new e();
        this.watchClient$delegate = new kotlin.o(new androidx.navigation.internal.h(this, 17));
        this.watchCache = Collections.synchronizedMap(new LinkedHashMap<String, j>() { // from class: com.app.mlounge.data.anime.AnikotoScraper$watchCache$1
            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof String) {
                    return containsKey((String) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof j) {
                    return containsValue((j) obj);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, j>> entrySet() {
                return getEntries();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ j get(Object obj) {
                if (obj instanceof String) {
                    return get((String) obj);
                }
                return null;
            }

            public /* bridge */ Set<Map.Entry<String, j>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (j) obj2);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<j> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof String) && (obj2 instanceof j)) {
                    return remove((String) obj, (j) obj2);
                }
                return false;
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, j> entry) {
                entry.getClass();
                return size() > 100;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<j> values() {
                return getValues();
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(j jVar) {
                return super.containsValue((Object) jVar);
            }

            public /* bridge */ j get(String str) {
                return (j) super.get((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (obj instanceof String) {
                    return get((String) obj);
                }
                return null;
            }

            public /* bridge */ j getOrDefault(String str, j jVar) {
                return (j) super.getOrDefault((Object) str, jVar);
            }

            public final /* bridge */ j getOrDefault(Object obj, j jVar) {
                return !(obj instanceof String) ? jVar : getOrDefault((String) obj, jVar);
            }

            public /* bridge */ j remove(String str) {
                return (j) super.remove((Object) str);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (obj instanceof String) {
                    return remove((String) obj);
                }
                return null;
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ j remove(Object obj) {
                if (obj instanceof String) {
                    return remove((String) obj);
                }
                return null;
            }

            public /* bridge */ boolean remove(String str, j jVar) {
                return super.remove((Object) str, (Object) jVar);
            }
        });
    }

    private final String buildFilterUrl(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(a.n(i, "https://anikoto.ddns.me/api/filter?page="));
        Map<String, String> map = CATEGORY_SORT_MAP;
        String lowerCase = null;
        if (map.containsKey(str)) {
            sb.append("&sort=" + ((Object) map.get(str)));
            Map<String, String> map2 = TYPE_NORMALIZE_MAP;
            if (str2 != null) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            String str3 = map2.get(lowerCase);
            if (str3 != null) {
                sb.append("&term_type[]=".concat(str3));
            }
        } else {
            Map<String, String> map3 = CATEGORY_STATUS_MAP;
            if (map3.containsKey(str)) {
                sb.append("&status[]=" + ((Object) map3.get(str)) + "&sort=latest-updated");
                Map<String, String> map4 = TYPE_NORMALIZE_MAP;
                if (str2 != null) {
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                String str4 = map4.get(lowerCase);
                if (str4 != null) {
                    sb.append("&term_type[]=".concat(str4));
                }
            } else if (TYPE_CHIPS.contains(str)) {
                sb.append("&term_type[]=" + str + "&sort=latest-updated");
            } else {
                Integer num = GENRE_ID_MAP.get(str);
                if (num != null) {
                    sb.append("&genre[]=" + num.intValue());
                }
                sb.append("&sort=latest-updated");
                Map<String, String> map5 = TYPE_NORMALIZE_MAP;
                if (str2 != null) {
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                String str5 = map5.get(lowerCase);
                if (str5 != null) {
                    sb.append("&term_type[]=".concat(str5));
                }
            }
        }
        return sb.toString();
    }

    private final HiAnimeResponse<HiAnimeHome> emptyHome() {
        w wVar = w.e;
        return new HiAnimeResponse<>(new HiAnimeHome(wVar, wVar, wVar));
    }

    private final String fetch(String str) {
        try {
            a0 a0Var = new a0();
            a0Var.d(str);
            a0Var.b("User-Agent", UA);
            b0 b0Var = new b0(a0Var);
            y yVar = this.client;
            yVar.getClass();
            g0 g0VarE = new m(yVar, b0Var, false).e();
            try {
                String strA = g0VarE.N ? g0VarE.D.A() : null;
                g0VarE.close();
                return strA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private final j fetchWatch(String str, String str2) {
        j watchSse;
        g data;
        String strJ = androidx.compose.runtime.j.j(str, "|", str2);
        j jVar = this.watchCache.get(strJ);
        if (jVar != null) {
            return jVar;
        }
        try {
            a0 a0Var = new a0();
            a0Var.d("https://anikoto.ddns.me/api/watch/" + str + "?ep=" + str2);
            a0Var.b("User-Agent", UA);
            b0 b0Var = new b0(a0Var);
            y watchClient = getWatchClient();
            watchClient.getClass();
            g0 g0VarE = new m(watchClient, b0Var, false).e();
            try {
                String strA = g0VarE.N ? g0VarE.D.A() : null;
                g0VarE.close();
                if (strA != null) {
                    String string = kotlin.text.k.g0(strA).toString();
                    if (r.u(string, "data:", false) || kotlin.text.k.z(string, "\"type\":\"episode\"", false)) {
                        watchSse = parseWatchSse(strA);
                    } else {
                        Envelope envelope = (Envelope) this.gson.d(Envelope.class, strA);
                        watchSse = (l.a(envelope.getOk(), Boolean.TRUE) && (data = envelope.getData()) != null) ? data.e() : null;
                    }
                    if (watchSse != null) {
                        Map<String, j> map = this.watchCache;
                        map.getClass();
                        map.put(strJ, watchSse);
                        return watchSse;
                    }
                }
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("fetchWatch: ", e.getMessage(), "E", TAG);
            return null;
        }
    }

    public static /* synthetic */ HiAnimeResponse getAnimeByCategory$default(AnikotoScraper anikotoScraper, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return anikotoScraper.getAnimeByCategory(str, i);
    }

    public static /* synthetic */ HiAnimeResponse getAnimeByGenre$default(AnikotoScraper anikotoScraper, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return anikotoScraper.getAnimeByGenre(str, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getAnimeDetail$lambda$14(g gVar) {
        String strH = gVar.h();
        strH.getClass();
        return strH;
    }

    public static /* synthetic */ HiAnimeResponse getAnimeEpisodeSources$default(AnikotoScraper anikotoScraper, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "HD-1";
        }
        if ((i & 4) != 0) {
            str3 = "sub";
        }
        return anikotoScraper.getAnimeEpisodeSources(str, str2, str3);
    }

    public static /* synthetic */ HiAnimeResponse getHomePage$default(AnikotoScraper anikotoScraper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return anikotoScraper.getHomePage(str);
    }

    private final y getWatchClient() {
        return (y) this.watchClient$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x010e  */
    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x004e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0063  */
    /* JADX WARN: Code duplicated, block: B:50:0x007a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0091  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:96:0x00f2  */
    private final HiAnimeItem parseCard(j jVar) {
        g gVarL;
        String strH;
        String strH2;
        String strH3;
        String strH4;
        String strH5;
        String strH6;
        String strH7;
        String strH8;
        Integer numValueOf;
        Integer numValueOf2;
        g gVarL2;
        g gVarL3;
        g gVarL4 = jVar.l("slug");
        String strH9 = null;
        if (gVarL4 == null) {
            gVarL = jVar.l("id");
            if (gVarL == null) {
                strH = null;
            } else {
                if (gVarL instanceof i) {
                    gVarL = null;
                }
                if (gVarL != null) {
                    strH = gVarL.h();
                } else {
                    strH = null;
                }
            }
            if (strH == null) {
                return null;
            }
        } else {
            if (gVarL4 instanceof i) {
                gVarL4 = null;
            }
            if (gVarL4 == null || (strH = gVarL4.h()) == null) {
                gVarL = jVar.l("id");
                if (gVarL == null) {
                    strH = null;
                } else {
                    if (gVarL instanceof i) {
                        gVarL = null;
                    }
                    if (gVarL != null) {
                        strH = gVarL.h();
                    } else {
                        strH = null;
                    }
                }
                if (strH == null) {
                    return null;
                }
            }
        }
        String str = strH;
        j jVarO = jVar.o("episodes");
        g gVarL5 = jVar.l("title");
        if (gVarL5 == null) {
            strH2 = null;
        } else {
            if (gVarL5 instanceof i) {
                gVarL5 = null;
            }
            if (gVarL5 != null) {
                strH2 = gVarL5.h();
            } else {
                strH2 = null;
            }
        }
        g gVarL6 = jVar.l("title");
        if (gVarL6 == null) {
            strH3 = null;
        } else {
            if (gVarL6 instanceof i) {
                gVarL6 = null;
            }
            if (gVarL6 != null) {
                strH3 = gVarL6.h();
            } else {
                strH3 = null;
            }
        }
        g gVarL7 = jVar.l("image");
        if (gVarL7 == null) {
            strH4 = null;
        } else {
            if (gVarL7 instanceof i) {
                gVarL7 = null;
            }
            if (gVarL7 != null) {
                strH4 = gVarL7.h();
            } else {
                strH4 = null;
            }
        }
        g gVarL8 = jVar.l("titleJp");
        if (gVarL8 == null) {
            strH5 = null;
        } else {
            if (gVarL8 instanceof i) {
                gVarL8 = null;
            }
            if (gVarL8 != null) {
                strH5 = gVarL8.h();
            } else {
                strH5 = null;
            }
        }
        g gVarL9 = jVar.l("type");
        if (gVarL9 == null) {
            strH6 = null;
        } else {
            if (gVarL9 instanceof i) {
                gVarL9 = null;
            }
            if (gVarL9 != null) {
                strH6 = gVarL9.h();
            } else {
                strH6 = null;
            }
        }
        g gVarL10 = jVar.l("date");
        if (gVarL10 == null) {
            strH7 = null;
        } else {
            if (gVarL10 instanceof i) {
                gVarL10 = null;
            }
            if (gVarL10 != null) {
                strH7 = gVarL10.h();
            } else {
                strH7 = null;
            }
        }
        g gVarL11 = jVar.l("score");
        if (gVarL11 == null) {
            strH8 = null;
        } else {
            if (gVarL11 instanceof i) {
                gVarL11 = null;
            }
            if (gVarL11 != null) {
                strH8 = gVarL11.h();
            } else {
                strH8 = null;
            }
        }
        if (jVarO == null || (gVarL3 = jVarO.l("sub")) == null) {
            numValueOf = null;
        } else {
            if (gVarL3 instanceof i) {
                gVarL3 = null;
            }
            if (gVarL3 != null) {
                numValueOf = Integer.valueOf(gVarL3.c());
            } else {
                numValueOf = null;
            }
        }
        if (jVarO == null || (gVarL2 = jVarO.l("dub")) == null) {
            numValueOf2 = null;
        } else {
            if (gVarL2 instanceof i) {
                gVarL2 = null;
            }
            if (gVarL2 != null) {
                numValueOf2 = Integer.valueOf(gVarL2.c());
            } else {
                numValueOf2 = null;
            }
        }
        HiAnimeEpCount hiAnimeEpCount = new HiAnimeEpCount(numValueOf, numValueOf2);
        g gVarL12 = jVar.l("synopsis");
        if (gVarL12 != null) {
            if (gVarL12 instanceof i) {
                gVarL12 = null;
            }
            if (gVarL12 != null) {
                strH9 = gVarL12.h();
            }
        }
        return new HiAnimeItem(str, strH2, strH3, strH4, strH5, strH6, strH7, strH8, hiAnimeEpCount, strH9);
    }

    private final k parseEpisodeId(String str) {
        int iK = kotlin.text.k.K(str, '|', 0, 6);
        return iK >= 0 ? new k(str.substring(0, iK), str.substring(iK + 1)) : new k(str, "1");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, kotlin.collections.w] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    private final HiAnimeResponse<HiAnimeCategoryData> parseFilterResponse(g gVar, int i) {
        g gVarL;
        Integer numValueOf;
        g gVarL2;
        Integer numValueOf2;
        ?? arrayList = w.e;
        boolean zB = true;
        if (gVar == null) {
            return new HiAnimeResponse<>(new HiAnimeCategoryData(arrayList, Integer.valueOf(i), 1, Boolean.FALSE));
        }
        j jVarE = gVar.e();
        f fVarM = jVarE.m("results");
        if (fVarM != null) {
            arrayList = new ArrayList();
            Iterator it = fVarM.e.iterator();
            while (it.hasNext()) {
                HiAnimeItem card = parseCard(((g) it.next()).e());
                if (card != null) {
                    arrayList.add(card);
                }
            }
        }
        g gVarL3 = jVarE.l("hasNextPage");
        if (gVarL3 == null && (gVarL3 = jVarE.l("has_next_page")) == null) {
            gVarL3 = jVarE.l("nextPage");
        }
        if (gVarL3 == null) {
            gVarL = jVarE.l("totalPages");
            if (gVarL == null && (gVarL = jVarE.l("total_pages")) == null) {
                gVarL = jVarE.l("lastPage");
            }
            if (gVarL == null) {
                numValueOf = null;
            } else {
                if (gVarL instanceof i) {
                    gVarL = null;
                }
                if (gVarL != null) {
                    numValueOf = Integer.valueOf(gVarL.c());
                } else {
                    numValueOf = null;
                }
            }
            gVarL2 = jVarE.l("total");
            if (gVarL2 == null && (gVarL2 = jVarE.l("totalResults")) == null) {
                gVarL2 = jVarE.l("totalCount");
            }
            if (gVarL2 == null) {
                numValueOf2 = null;
            } else {
                if (gVarL2 instanceof i) {
                    gVarL2 = null;
                }
                if (gVarL2 != null) {
                    numValueOf2 = Integer.valueOf(gVarL2.c());
                } else {
                    numValueOf2 = null;
                }
            }
            if (numValueOf != null ? numValueOf2 == null || arrayList.isEmpty() ? arrayList.size() < 20 : arrayList.size() * i >= numValueOf2.intValue() : i >= numValueOf.intValue()) {
            }
        } else {
            if (gVarL3 instanceof i) {
                gVarL3 = null;
            }
            if (gVarL3 != null) {
                zB = gVarL3.b();
            } else {
                gVarL = jVarE.l("totalPages");
                if (gVarL == null) {
                    gVarL = jVarE.l("lastPage");
                }
                if (gVarL == null) {
                    numValueOf = null;
                } else {
                    if (gVarL instanceof i) {
                        gVarL = null;
                    }
                    if (gVarL != null) {
                        numValueOf = Integer.valueOf(gVarL.c());
                    } else {
                        numValueOf = null;
                    }
                }
                gVarL2 = jVarE.l("total");
                if (gVarL2 == null) {
                    gVarL2 = jVarE.l("totalCount");
                }
                if (gVarL2 == null) {
                    numValueOf2 = null;
                } else {
                    if (gVarL2 instanceof i) {
                        gVarL2 = null;
                    }
                    if (gVarL2 != null) {
                        numValueOf2 = Integer.valueOf(gVarL2.c());
                    } else {
                        numValueOf2 = null;
                    }
                }
                zB = numValueOf != null ? false : false;
            }
        }
        g gVarL4 = jVarE.l("currentPage");
        if (gVarL4 == null && (gVarL4 = jVarE.l("current_page")) == null) {
            gVarL4 = jVarE.l("page");
        }
        if (gVarL4 != null) {
            g gVar2 = gVarL4 instanceof i ? null : gVarL4;
            if (gVar2 != null) {
                i = gVar2.c();
            }
        }
        Integer numValueOf3 = Integer.valueOf(i);
        if (zB) {
            i++;
        }
        return new HiAnimeResponse<>(new HiAnimeCategoryData(arrayList, numValueOf3, Integer.valueOf(i), Boolean.valueOf(zB)));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    private final j parseWatchSse(String str) {
        j jVar;
        String strH;
        j jVarO;
        try {
            f fVar = new f();
            ArrayList arrayList = fVar.e;
            str.getClass();
            kotlin.text.e eVar = new kotlin.text.e(str);
            f fVar2 = null;
            while (eVar.hasNext()) {
                String string = kotlin.text.k.g0((String) eVar.next()).toString();
                if (r.u(string, "data:", false)) {
                    String string2 = kotlin.text.k.g0(kotlin.text.k.P(string, "data:")).toString();
                    if (string2.length() != 0 && !string2.equals("[DONE]")) {
                        try {
                            jVar = (j) this.gson.d(j.class, string2);
                        } catch (Exception unused) {
                            jVar = null;
                        }
                        if (jVar != null) {
                            g gVarL = jVar.l("type");
                            if (gVarL == null) {
                                strH = null;
                            } else {
                                if (gVarL instanceof i) {
                                    gVarL = null;
                                }
                                if (gVarL != null) {
                                    strH = gVarL.h();
                                } else {
                                    strH = null;
                                }
                            }
                            if (l.a(strH, "servers")) {
                                f fVarM = jVar.m("servers");
                                if (fVarM != null) {
                                    fVar2 = fVarM;
                                }
                            } else if (l.a(strH, "source") && (jVarO = jVar.o("source")) != null) {
                                arrayList.add(jVarO);
                            }
                        }
                    }
                }
            }
            if (fVar2 == null && arrayList.size() == 0) {
                return null;
            }
            j jVar2 = new j();
            if (fVar2 != null) {
                jVar2.i("servers", fVar2);
            }
            jVar2.i("sources", fVar);
            return jVar2;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("parseWatchSse: ", e.getMessage(), "E", TAG);
            return null;
        }
    }

    public static /* synthetic */ HiAnimeResponse searchAnime$default(AnikotoScraper anikotoScraper, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return anikotoScraper.searchAnime(str, i, str2, str3);
    }

    private final String unwrapProxyUrl(String str) {
        if ((kotlin.text.k.z(str, "/api/proxy", false) || kotlin.text.k.z(str, "workers.dev", false)) && kotlin.text.k.z(str, "url=", false)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("url");
                if (queryParameter != null) {
                    if (kotlin.text.k.J(queryParameter)) {
                        queryParameter = null;
                    }
                    if (queryParameter != null) {
                        return queryParameter;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y watchClient_delegate$lambda$0(AnikotoScraper anikotoScraper) {
        x xVarA = anikotoScraper.client.a();
        xVarA.a(90L);
        xVarA.c(90L);
        TimeUnit.SECONDS.getClass();
        xVarA.A = okhttp3.internal.g.b("timeout", 90L);
        return new y(xVarA);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final HiAnimeResponse<HiAnimeCategoryData> getAnimeByCategory(String str, int i) {
        String str2;
        w wVar = w.e;
        str.getClass();
        try {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -895216422:
                    if (!lowerCase.equals("new-release")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "latest-added";
                    }
                    break;
                case -320414065:
                    if (!lowerCase.equals("most-popular")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "most-viewed";
                    }
                    break;
                case 937145160:
                    if (!lowerCase.equals("new-on-site")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "latest-added";
                    }
                    break;
                case 1394955557:
                    if (!lowerCase.equals("trending")) {
                        str2 = "latest-updated";
                    } else {
                        str2 = "most-viewed";
                    }
                    break;
                default:
                    str2 = "latest-updated";
                    break;
            }
            String strFetch = fetch("https://anikoto.ddns.me/api/filter?page=" + i + "&sort=" + str2);
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeCategoryData(wVar, Integer.valueOf(i), 1, Boolean.FALSE));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            return !l.a(envelope.getOk(), Boolean.TRUE) ? new HiAnimeResponse<>(new HiAnimeCategoryData(wVar, Integer.valueOf(i), 1, Boolean.FALSE)) : parseFilterResponse(envelope.getData(), i);
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, "getAnimeByCategory: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeCategoryData(wVar, Integer.valueOf(i), 1, Boolean.FALSE));
        }
    }

    public final HiAnimeResponse<HiAnimeCategoryData> getAnimeByGenre(String str, int i, String str2) {
        w wVar = w.e;
        str.getClass();
        try {
            String strFetch = fetch(buildFilterUrl(str, i, str2));
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeCategoryData(wVar, Integer.valueOf(i), 1, Boolean.FALSE));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            return !l.a(envelope.getOk(), Boolean.TRUE) ? new HiAnimeResponse<>(new HiAnimeCategoryData(wVar, Integer.valueOf(i), 1, Boolean.FALSE)) : parseFilterResponse(envelope.getData(), i);
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, "getAnimeByGenre: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeCategoryData(wVar, Integer.valueOf(i), 1, Boolean.FALSE));
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x015b A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x0025, B:11:0x003b, B:13:0x0041, B:15:0x0047, B:17:0x0053, B:20:0x005a, B:22:0x0062, B:27:0x006a, B:29:0x0074, B:31:0x007c, B:36:0x0084, B:38:0x008a, B:40:0x0092, B:45:0x009a, B:47:0x00a0, B:49:0x00a8, B:51:0x00ae, B:53:0x00b6, B:55:0x00bc, B:57:0x00c4, B:59:0x00ca, B:61:0x00d2, B:66:0x00da, B:68:0x00e1, B:70:0x00e9, B:75:0x00f1, B:77:0x00f8, B:79:0x0100, B:84:0x0108, B:86:0x010f, B:88:0x0115, B:93:0x011d, B:95:0x0124, B:102:0x012f, B:104:0x014a, B:109:0x0152, B:119:0x0171, B:121:0x0179, B:126:0x0181, B:128:0x0188, B:130:0x0190, B:135:0x0198, B:137:0x019f, B:139:0x01a5, B:144:0x01ad, B:146:0x01b4, B:148:0x01bc, B:153:0x01c4, B:155:0x01cb, B:157:0x01d3, B:162:0x01db, B:164:0x01e2, B:166:0x01ec, B:167:0x01fb, B:169:0x0201, B:171:0x0210, B:173:0x0218, B:175:0x022f, B:177:0x0237, B:178:0x0246, B:180:0x024c, B:183:0x025d, B:113:0x015b, B:115:0x0163, B:117:0x016b, B:185:0x0272), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0187  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0123  */
    public final HiAnimeResponse<HiAnimeDetailData> getAnimeDetail(String str) {
        String strH;
        Integer numValueOf;
        boolean zB;
        boolean zB2;
        String strH2;
        String strH3;
        String strH4;
        String strH5;
        f fVarM;
        String str2;
        g gVar;
        String strH6;
        String strH7;
        String strH8;
        String strH9;
        String strH10;
        ArrayList arrayList;
        ArrayList arrayList2;
        str.getClass();
        try {
            String strB0 = kotlin.text.k.b0(str, "|");
            String strFetch = fetch("https://anikoto.ddns.me/api/anime/".concat(strB0));
            if (strFetch == null) {
                return new HiAnimeResponse<>(null);
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return new HiAnimeResponse<>(null);
            }
            g data = envelope.getData();
            if (data == null) {
                return new HiAnimeResponse<>(null);
            }
            j jVarE = data.e();
            g gVarL = jVarE.l("slug");
            if (gVarL == null || (strH = gVarL.h()) == null) {
                strH = strB0;
            }
            g gVarL2 = jVarE.l("episodeCount");
            if (gVarL2 == null) {
                numValueOf = null;
            } else {
                if (gVarL2 instanceof i) {
                    gVarL2 = null;
                }
                if (gVarL2 != null) {
                    numValueOf = Integer.valueOf(gVarL2.c());
                } else {
                    numValueOf = null;
                }
            }
            g gVarL3 = jVarE.l("hasSub");
            if (gVarL3 == null) {
                zB = true;
            } else {
                if (gVarL3 instanceof i) {
                    gVarL3 = null;
                }
                if (gVarL3 != null) {
                    zB = gVarL3.b();
                } else {
                    zB = true;
                }
            }
            g gVarL4 = jVarE.l("hasDub");
            if (gVarL4 == null) {
                zB2 = false;
            } else {
                if (gVarL4 instanceof i) {
                    gVarL4 = null;
                }
                if (gVarL4 != null) {
                    zB2 = gVarL4.b();
                } else {
                    zB2 = false;
                }
            }
            g gVarL5 = jVarE.l("title");
            String strH11 = gVarL5 != null ? gVarL5.h() : null;
            g gVarL6 = jVarE.l("image");
            String strH12 = gVarL6 != null ? gVarL6.h() : null;
            g gVarL7 = jVarE.l("synopsis");
            String strH13 = gVarL7 != null ? gVarL7.h() : null;
            g gVarL8 = jVarE.l("rating");
            if (gVarL8 == null) {
                strH2 = null;
            } else {
                if (gVarL8 instanceof i) {
                    gVarL8 = null;
                }
                if (gVarL8 != null) {
                    strH2 = gVarL8.h();
                } else {
                    strH2 = null;
                }
            }
            g gVarL9 = jVarE.l("quality");
            if (gVarL9 == null) {
                strH3 = null;
            } else {
                if (gVarL9 instanceof i) {
                    gVarL9 = null;
                }
                if (gVarL9 != null) {
                    strH3 = gVarL9.h();
                } else {
                    strH3 = null;
                }
            }
            g gVarL10 = jVarE.l("type");
            if (gVarL10 == null) {
                strH4 = null;
            } else {
                if (gVarL10 instanceof i) {
                    gVarL10 = null;
                }
                if (gVarL10 != null) {
                    strH4 = gVarL10.h();
                } else {
                    strH4 = null;
                }
            }
            g gVarL11 = jVarE.l("duration");
            if (gVarL11 == null) {
                strH5 = null;
            } else {
                if (gVarL11 instanceof i) {
                    gVarL11 = null;
                }
                if (gVarL11 != null) {
                    strH5 = gVarL11.h();
                } else {
                    strH5 = null;
                }
            }
            Integer num = zB ? numValueOf : null;
            if (!zB2) {
                numValueOf = null;
            }
            HiAnimeInfo hiAnimeInfo = new HiAnimeInfo(strH, strH11, strH12, strH13, new HiAnimeStats(strH2, strH3, strH4, strH5, new HiAnimeEpCount(num, numValueOf)));
            g gVarL12 = jVarE.l("titleJp");
            if (gVarL12 == null) {
                fVarM = jVarE.m("alternativeTitles");
                if (fVarM != null || (gVar = (g) p.C(fVarM)) == null) {
                    str2 = null;
                } else {
                    String strH14 = gVar.h();
                    str2 = strH14;
                }
            } else {
                if (gVarL12 instanceof i) {
                    gVarL12 = null;
                }
                if (gVarL12 == null || (strH14 = gVarL12.h()) == null) {
                    fVarM = jVarE.m("alternativeTitles");
                    if (fVarM != null) {
                    }
                    str2 = null;
                } else {
                    str2 = strH14;
                }
            }
            g gVarL13 = jVarE.l("aired");
            if (gVarL13 == null) {
                strH6 = null;
            } else {
                if (gVarL13 instanceof i) {
                    gVarL13 = null;
                }
                if (gVarL13 != null) {
                    strH6 = gVarL13.h();
                } else {
                    strH6 = null;
                }
            }
            g gVarL14 = jVarE.l("premiered");
            if (gVarL14 == null) {
                strH7 = null;
            } else {
                if (gVarL14 instanceof i) {
                    gVarL14 = null;
                }
                if (gVarL14 != null) {
                    strH7 = gVarL14.h();
                } else {
                    strH7 = null;
                }
            }
            g gVarL15 = jVarE.l("duration");
            if (gVarL15 == null) {
                strH8 = null;
            } else {
                if (gVarL15 instanceof i) {
                    gVarL15 = null;
                }
                if (gVarL15 != null) {
                    strH8 = gVarL15.h();
                } else {
                    strH8 = null;
                }
            }
            g gVarL16 = jVarE.l("status");
            if (gVarL16 == null) {
                strH9 = null;
            } else {
                if (gVarL16 instanceof i) {
                    gVarL16 = null;
                }
                if (gVarL16 != null) {
                    strH9 = gVarL16.h();
                } else {
                    strH9 = null;
                }
            }
            g gVarL17 = jVarE.l("malScore");
            if (gVarL17 == null) {
                strH10 = null;
            } else {
                if (gVarL17 instanceof i) {
                    gVarL17 = null;
                }
                if (gVarL17 != null) {
                    strH10 = gVarL17.h();
                } else {
                    strH10 = null;
                }
            }
            f fVarM2 = jVarE.m("genres");
            if (fVarM2 != null) {
                arrayList = new ArrayList(kotlin.collections.r.p(fVarM2, 10));
                Iterator it = fVarM2.e.iterator();
                while (it.hasNext()) {
                    arrayList.add(((g) it.next()).h());
                }
            } else {
                arrayList = null;
            }
            f fVarM3 = jVarE.m("studios");
            String strI = fVarM3 != null ? p.I(fVarM3, ", ", null, null, new androidx.navigation.compose.r(24), 30) : null;
            f fVarM4 = jVarE.m("producers");
            if (fVarM4 != null) {
                ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(fVarM4, 10));
                Iterator it2 = fVarM4.e.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((g) it2.next()).h());
                }
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            return new HiAnimeResponse<>(new HiAnimeDetailData(new HiAnimeAnimeData(hiAnimeInfo, new HiAnimeMoreInfo(str2, strH6, strH7, strH8, strH9, strH10, arrayList, strI, arrayList2))));
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, "getAnimeDetail: " + e.getMessage());
            return new HiAnimeResponse<>(null);
        }
    }

    public final HiAnimeResponse<HiAnimeServersData> getAnimeEpisodeServers(String str) {
        String strH;
        str.getClass();
        try {
            k episodeId = parseEpisodeId(str);
            String str2 = (String) episodeId.e;
            String str3 = (String) episodeId.y;
            j jVarFetchWatch = fetchWatch(str2, str3);
            if (jVarFetchWatch == null) {
                return new HiAnimeResponse<>(new HiAnimeServersData(str, null, null, null));
            }
            f fVarM = jVarFetchWatch.m("servers");
            if (fVarM == null) {
                return new HiAnimeResponse<>(new HiAnimeServersData(str, null, null, null));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = fVarM.e.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                j jVarE = ((g) it.next()).e();
                g gVarL = jVarE.l("name");
                if (gVarL != null && (strH = gVarL.h()) != null) {
                    g gVarL2 = jVarE.l("type");
                    String strH2 = gVarL2 != null ? gVarL2.h() : null;
                    if (l.a(strH2, "sub")) {
                        arrayList.add(new HiAnimeServer(Integer.valueOf(i), strH));
                        i++;
                    } else if (l.a(strH2, "dub")) {
                        arrayList2.add(new HiAnimeServer(Integer.valueOf(i2), strH));
                        i2++;
                    }
                }
            }
            Integer numW = r.w(str3);
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            return new HiAnimeResponse<>(new HiAnimeServersData(str, numW, arrayList, arrayList2));
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, "getAnimeEpisodeServers: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeServersData(str, null, null, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x017e A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0184 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0188  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x019f A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:163:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:184:0x022d A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0235 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0239  */
    /* JADX WARN: Code duplicated, block: B:189:0x023a  */
    /* JADX WARN: Code duplicated, block: B:191:0x023d A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:196:0x024a  */
    /* JADX WARN: Code duplicated, block: B:198:0x024d  */
    /* JADX WARN: Code duplicated, block: B:199:0x024f A[Catch: Exception -> 0x0027, PHI: r4
  0x024f: PHI (r4v14 java.lang.String) = (r4v10 java.lang.String), (r4v20 java.lang.String) binds: [B:197:0x024b, B:183:0x022c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:201:0x025b A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:203:0x025f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0260  */
    /* JADX WARN: Code duplicated, block: B:206:0x0263 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0268  */
    /* JADX WARN: Code duplicated, block: B:210:0x0271 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0275  */
    /* JADX WARN: Code duplicated, block: B:213:0x0276  */
    /* JADX WARN: Code duplicated, block: B:215:0x0279 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:217:0x027f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0289 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:222:0x028d  */
    /* JADX WARN: Code duplicated, block: B:223:0x028e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0291 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:226:0x029a  */
    /* JADX WARN: Code duplicated, block: B:247:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00be A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00df A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x000a, B:5:0x001c, B:9:0x002a, B:11:0x0032, B:13:0x003d, B:14:0x0043, B:17:0x004b, B:19:0x005e, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:27:0x0076, B:31:0x007e, B:34:0x0086, B:110:0x015f, B:112:0x0165, B:117:0x016d, B:119:0x0173, B:143:0x01aa, B:145:0x01b7, B:148:0x01c0, B:150:0x01c8, B:155:0x01d0, B:157:0x01d6, B:162:0x01e0, B:164:0x01eb, B:166:0x01f3, B:167:0x01fe, B:169:0x0204, B:171:0x0214, B:176:0x021c, B:178:0x0222, B:199:0x024f, B:201:0x025b, B:206:0x0263, B:208:0x0269, B:210:0x0271, B:215:0x0279, B:218:0x0281, B:220:0x0289, B:225:0x0291, B:227:0x029b, B:229:0x02a2, B:184:0x022d, B:186:0x0235, B:191:0x023d, B:193:0x0243, B:231:0x02a8, B:125:0x017e, B:127:0x0184, B:132:0x018c, B:134:0x0192, B:141:0x019f, B:35:0x008c, B:36:0x0090, B:38:0x0097, B:40:0x00a8, B:45:0x00b0, B:47:0x00b6, B:61:0x00d9, B:63:0x00df, B:65:0x00e5, B:69:0x00ed, B:71:0x00f1, B:74:0x00f9, B:75:0x00fd, B:77:0x0103, B:79:0x0114, B:84:0x011c, B:86:0x0122, B:102:0x0147, B:104:0x014b, B:107:0x0153, B:89:0x012a, B:91:0x0130, B:96:0x0138, B:98:0x013e, B:50:0x00be, B:52:0x00c4, B:57:0x00cc, B:59:0x00d2), top: B:235:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    public final HiAnimeResponse<HiAnimeSourcesData> getAnimeEpisodeSources(String str, String str2, String str3) {
        Object next;
        Object next2;
        j jVarE;
        Object next3;
        g gVarL;
        String strH;
        String strH2;
        g gVarL2;
        String strH3;
        g gVarL3;
        String strH4;
        String strH5;
        g gVarL4;
        String strH6;
        String strH7;
        Map mapSingletonMap;
        ArrayList arrayList;
        g gVarL5;
        String strH8;
        HiAnimeTrack hiAnimeTrack;
        g gVarL6;
        String strH9;
        g gVarL7;
        String strH10;
        g gVarL8;
        Boolean boolValueOf;
        g gVarL9;
        String strH11;
        str.getClass();
        str2.getClass();
        str3.getClass();
        try {
            k episodeId = parseEpisodeId(str);
            j jVarFetchWatch = fetchWatch((String) episodeId.e, (String) episodeId.y);
            if (jVarFetchWatch == null) {
                return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
            }
            f fVarM = jVarFetchWatch.m("sources");
            if (fVarM == null) {
                return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
            }
            ArrayList arrayList2 = fVarM.e;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                j jVarE2 = ((g) next).e();
                g gVarL10 = jVarE2.l("server");
                if (l.a(gVarL10 != null ? gVarL10.h() : null, str2)) {
                    g gVarL11 = jVarE2.l("type");
                    if (l.a(gVarL11 != null ? gVarL11.h() : null, str3)) {
                        break;
                    }
                }
            }
            g gVar = (g) next;
            if (gVar != null) {
                jVarE = gVar.e();
            } else {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    j jVarE3 = ((g) next2).e();
                    g gVarL12 = jVarE3.l("proxyUrl");
                    if (gVarL12 == null) {
                        gVarL2 = jVarE3.l("m3u8");
                        if (gVarL2 == null) {
                            continue;
                        } else {
                            if (!(gVarL2 instanceof i)) {
                                gVarL2 = null;
                            }
                            if (gVarL2 != null && (strH3 = gVarL2.h()) != null && (!kotlin.text.k.J(strH3))) {
                                gVarL3 = jVarE3.l("type");
                                if (gVarL3 != null) {
                                    strH4 = gVarL3.h();
                                } else {
                                    strH4 = null;
                                }
                                if (l.a(strH4, str3)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        if (gVarL12 instanceof i) {
                            gVarL12 = null;
                        }
                        if (gVarL12 == null || (strH5 = gVarL12.h()) == null || !(!kotlin.text.k.J(strH5))) {
                            gVarL2 = jVarE3.l("m3u8");
                            if (gVarL2 == null) {
                                continue;
                            } else {
                                if (!(gVarL2 instanceof i)) {
                                    gVarL2 = null;
                                }
                                if (gVarL2 != null) {
                                    continue;
                                }
                            }
                        }
                        gVarL3 = jVarE3.l("type");
                        if (gVarL3 != null) {
                            strH4 = gVarL3.h();
                        } else {
                            strH4 = null;
                        }
                        if (l.a(strH4, str3)) {
                            break;
                            break;
                        }
                    }
                }
                g gVar2 = (g) next2;
                j jVarE4 = gVar2 != null ? gVar2.e() : null;
                if (jVarE4 == null) {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        j jVarE5 = ((g) next3).e();
                        g gVarL13 = jVarE5.l("proxyUrl");
                        if (gVarL13 != null) {
                            if (gVarL13 instanceof i) {
                                gVarL13 = null;
                            }
                            if (gVarL13 != null && (strH2 = gVarL13.h()) != null && (!kotlin.text.k.J(strH2))) {
                                break;
                            }
                            gVarL = jVarE5.l("m3u8");
                            if (gVarL == null) {
                                if (!(gVarL instanceof i)) {
                                    gVarL = null;
                                }
                                if (gVarL != null) {
                                    continue;
                                }
                            }
                        } else {
                            gVarL = jVarE5.l("m3u8");
                            if (gVarL == null) {
                                if (!(gVarL instanceof i)) {
                                    gVarL = null;
                                }
                                if (gVarL != null && (strH = gVarL.h()) != null && (!kotlin.text.k.J(strH))) {
                                    break;
                                }
                            }
                        }
                    }
                    g gVar3 = (g) next3;
                    jVarE = gVar3 != null ? gVar3.e() : null;
                    if (jVarE == null) {
                        return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                    }
                } else {
                    jVarE = jVarE4;
                }
            }
            g gVarL14 = jVarE.l("proxyUrl");
            if (gVarL14 == null) {
                gVarL4 = jVarE.l("m3u8");
                if (gVarL4 == null) {
                    strH6 = null;
                } else {
                    if (gVarL4 instanceof i) {
                        gVarL4 = null;
                    }
                    if (gVarL4 != null || (strH7 = gVarL4.h()) == null) {
                        strH6 = null;
                    } else {
                        if (kotlin.text.k.J(strH7)) {
                            strH7 = null;
                        }
                        strH6 = strH7;
                    }
                }
                if (strH6 == null) {
                    return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                }
            } else {
                if (gVarL14 instanceof i) {
                    gVarL14 = null;
                }
                if (gVarL14 == null || (strH6 = gVarL14.h()) == null) {
                    gVarL4 = jVarE.l("m3u8");
                    if (gVarL4 == null) {
                        strH6 = null;
                    } else {
                        if (gVarL4 instanceof i) {
                            gVarL4 = null;
                        }
                        if (gVarL4 != null) {
                            strH6 = null;
                        } else {
                            strH6 = null;
                        }
                    }
                    if (strH6 == null) {
                        return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                    }
                } else {
                    if (kotlin.text.k.J(strH6)) {
                        strH6 = null;
                    }
                    if (strH6 == null) {
                        gVarL4 = jVarE.l("m3u8");
                        if (gVarL4 == null) {
                            strH6 = null;
                        } else {
                            if (gVarL4 instanceof i) {
                                gVarL4 = null;
                            }
                            if (gVarL4 != null) {
                                strH6 = null;
                            } else {
                                strH6 = null;
                            }
                        }
                        if (strH6 == null) {
                            return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
                        }
                    }
                }
            }
            String strUnwrapProxyUrl = unwrapProxyUrl(strH6);
            if (kotlin.text.k.z(strUnwrapProxyUrl, "/api/proxy", false) || kotlin.text.k.z(strUnwrapProxyUrl, "workers.dev", false) || (gVarL9 = jVarE.l("referer")) == null) {
                mapSingletonMap = null;
            } else {
                if (gVarL9 instanceof i) {
                    gVarL9 = null;
                }
                if (gVarL9 == null || (strH11 = gVarL9.h()) == null) {
                    mapSingletonMap = null;
                } else {
                    if (kotlin.text.k.J(strH11)) {
                        strH11 = null;
                    }
                    if (strH11 != null) {
                        mapSingletonMap = Collections.singletonMap("Referer", strH11);
                        mapSingletonMap.getClass();
                    } else {
                        mapSingletonMap = null;
                    }
                }
            }
            f fVarM2 = jVarE.m("tracks");
            if (fVarM2 != null) {
                arrayList = new ArrayList();
                Iterator it4 = fVarM2.e.iterator();
                while (it4.hasNext()) {
                    j jVarE6 = ((g) it4.next()).e();
                    g gVarL15 = jVarE6.l("proxyUrl");
                    if (gVarL15 == null) {
                        gVarL5 = jVarE6.l("file");
                        if (gVarL5 == null) {
                            strH8 = null;
                        } else {
                            if (gVarL5 instanceof i) {
                                gVarL5 = null;
                            }
                            if (gVarL5 != null || (strH8 = gVarL5.h()) == null || kotlin.text.k.J(strH8)) {
                                strH8 = null;
                            }
                        }
                        if (strH8 == null) {
                            hiAnimeTrack = null;
                        } else {
                            String strUnwrapProxyUrl2 = unwrapProxyUrl(strH8);
                            gVarL6 = jVarE6.l("label");
                            if (gVarL6 == null) {
                                strH9 = null;
                            } else {
                                if (gVarL6 instanceof i) {
                                    gVarL6 = null;
                                }
                                if (gVarL6 != null) {
                                    strH9 = gVarL6.h();
                                } else {
                                    strH9 = null;
                                }
                            }
                            gVarL7 = jVarE6.l("kind");
                            if (gVarL7 == null) {
                                strH10 = "captions";
                            } else {
                                if (gVarL7 instanceof i) {
                                    gVarL7 = null;
                                }
                                if (gVarL7 != null || (strH10 = gVarL7.h()) == null) {
                                    strH10 = "captions";
                                }
                            }
                            gVarL8 = jVarE6.l("default");
                            if (gVarL8 == null) {
                                boolValueOf = null;
                            } else {
                                if (gVarL8 instanceof i) {
                                    gVarL8 = null;
                                }
                                if (gVarL8 != null) {
                                    boolValueOf = Boolean.valueOf(gVarL8.b());
                                } else {
                                    boolValueOf = null;
                                }
                            }
                            hiAnimeTrack = new HiAnimeTrack(strUnwrapProxyUrl2, strH9, strH10, boolValueOf);
                        }
                    } else {
                        if (gVarL15 instanceof i) {
                            gVarL15 = null;
                        }
                        if (gVarL15 == null || (strH8 = gVarL15.h()) == null) {
                            gVarL5 = jVarE6.l("file");
                            if (gVarL5 == null) {
                                strH8 = null;
                            } else {
                                if (gVarL5 instanceof i) {
                                    gVarL5 = null;
                                }
                                if (gVarL5 != null) {
                                    strH8 = null;
                                } else {
                                    strH8 = null;
                                }
                            }
                            if (strH8 == null) {
                                hiAnimeTrack = null;
                            } else {
                                String strUnwrapProxyUrl3 = unwrapProxyUrl(strH8);
                                gVarL6 = jVarE6.l("label");
                                if (gVarL6 == null) {
                                    strH9 = null;
                                } else {
                                    if (gVarL6 instanceof i) {
                                        gVarL6 = null;
                                    }
                                    if (gVarL6 != null) {
                                        strH9 = gVarL6.h();
                                    } else {
                                        strH9 = null;
                                    }
                                }
                                gVarL7 = jVarE6.l("kind");
                                if (gVarL7 == null) {
                                    strH10 = "captions";
                                } else {
                                    if (gVarL7 instanceof i) {
                                        gVarL7 = null;
                                    }
                                    if (gVarL7 != null) {
                                        strH10 = "captions";
                                    } else {
                                        strH10 = "captions";
                                    }
                                }
                                gVarL8 = jVarE6.l("default");
                                if (gVarL8 == null) {
                                    boolValueOf = null;
                                } else {
                                    if (gVarL8 instanceof i) {
                                        gVarL8 = null;
                                    }
                                    if (gVarL8 != null) {
                                        boolValueOf = Boolean.valueOf(gVarL8.b());
                                    } else {
                                        boolValueOf = null;
                                    }
                                }
                                hiAnimeTrack = new HiAnimeTrack(strUnwrapProxyUrl3, strH9, strH10, boolValueOf);
                            }
                        } else {
                            if (kotlin.text.k.J(strH8)) {
                                strH8 = null;
                            }
                            if (strH8 == null) {
                                gVarL5 = jVarE6.l("file");
                                if (gVarL5 == null) {
                                    strH8 = null;
                                } else {
                                    if (gVarL5 instanceof i) {
                                        gVarL5 = null;
                                    }
                                    if (gVarL5 != null) {
                                        strH8 = null;
                                    } else {
                                        strH8 = null;
                                    }
                                }
                                if (strH8 == null) {
                                    hiAnimeTrack = null;
                                }
                            }
                            String strUnwrapProxyUrl4 = unwrapProxyUrl(strH8);
                            gVarL6 = jVarE6.l("label");
                            if (gVarL6 == null) {
                                strH9 = null;
                            } else {
                                if (gVarL6 instanceof i) {
                                    gVarL6 = null;
                                }
                                if (gVarL6 != null) {
                                    strH9 = gVarL6.h();
                                } else {
                                    strH9 = null;
                                }
                            }
                            gVarL7 = jVarE6.l("kind");
                            if (gVarL7 == null) {
                                strH10 = "captions";
                            } else {
                                if (gVarL7 instanceof i) {
                                    gVarL7 = null;
                                }
                                if (gVarL7 != null) {
                                    strH10 = "captions";
                                } else {
                                    strH10 = "captions";
                                }
                            }
                            gVarL8 = jVarE6.l("default");
                            if (gVarL8 == null) {
                                boolValueOf = null;
                            } else {
                                if (gVarL8 instanceof i) {
                                    gVarL8 = null;
                                }
                                if (gVarL8 != null) {
                                    boolValueOf = Boolean.valueOf(gVarL8.b());
                                } else {
                                    boolValueOf = null;
                                }
                            }
                            hiAnimeTrack = new HiAnimeTrack(strUnwrapProxyUrl4, strH9, strH10, boolValueOf);
                        }
                    }
                    if (hiAnimeTrack != null) {
                        arrayList.add(hiAnimeTrack);
                    }
                }
            } else {
                arrayList = null;
            }
            return new HiAnimeResponse<>(new HiAnimeSourcesData(arrayList, q.j(new HiAnimeSource(strUnwrapProxyUrl)), mapSingletonMap));
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, "getAnimeEpisodeSources: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeSourcesData(null, null, null));
        }
    }

    public final HiAnimeResponse<HiAnimeEpisodesData> getAnimeEpisodes(String str) {
        String strH;
        Integer numW;
        w wVar = w.e;
        str.getClass();
        try {
            String strB0 = kotlin.text.k.b0(str, "|");
            String strFetch = fetch("https://anikoto.ddns.me/api/anime/" + strB0 + "/episodes");
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, wVar));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, wVar));
            }
            g data = envelope.getData();
            if (data == null) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, wVar));
            }
            f fVarM = data.e().m("episodes");
            if (fVarM == null) {
                return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, wVar));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = fVarM.e.iterator();
            while (it.hasNext()) {
                j jVarE = ((g) it.next()).e();
                g gVarL = jVarE.l("number");
                HiAnimeEpisode hiAnimeEpisode = null;
                strH = null;
                String strH2 = null;
                hiAnimeEpisode = null;
                hiAnimeEpisode = null;
                if (gVarL != null && (strH = gVarL.h()) != null && (numW = r.w(strH)) != null) {
                    String str2 = strB0 + "|" + numW.intValue();
                    g gVarL2 = jVarE.l("title");
                    if (gVarL2 != null) {
                        if (gVarL2 instanceof i) {
                            gVarL2 = null;
                        }
                        if (gVarL2 != null) {
                            strH2 = gVarL2.h();
                        }
                    }
                    hiAnimeEpisode = new HiAnimeEpisode(str2, numW, strH2);
                }
                if (hiAnimeEpisode != null) {
                    arrayList.add(hiAnimeEpisode);
                }
            }
            return new HiAnimeResponse<>(new HiAnimeEpisodesData(Integer.valueOf(arrayList.size()), arrayList));
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, "getAnimeEpisodes: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeEpisodesData(0, wVar));
        }
    }

    public final HiAnimeResponse<HiAnimeGenresData> getGenres() {
        List<String> list = GENRES;
        return new HiAnimeResponse<>(new HiAnimeGenresData(Integer.valueOf(list.size()), list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.w] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public final HiAnimeResponse<HiAnimeHome> getHomePage(String str) {
        ?? arrayList;
        ?? arrayList2;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        ?? arrayList3 = w.e;
        try {
            String strFetch = fetch("https://anikoto.ddns.me/api/home");
            if (strFetch == null) {
                return emptyHome();
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return emptyHome();
            }
            g data = envelope.getData();
            if (data == null) {
                return emptyHome();
            }
            j jVarE = data.e();
            f fVarM = jVarE.m("spotlight");
            if (fVarM != null) {
                arrayList = new ArrayList();
                Iterator it = fVarM.e.iterator();
                while (it.hasNext()) {
                    HiAnimeItem card = parseCard(((g) it.next()).e());
                    if (card != null) {
                        arrayList.add(card);
                    }
                }
            } else {
                arrayList = arrayList3;
            }
            f fVarM2 = jVarE.m("latestEpisodes");
            if (fVarM2 != null) {
                arrayList2 = new ArrayList();
                Iterator it2 = fVarM2.e.iterator();
                while (it2.hasNext()) {
                    HiAnimeItem card2 = parseCard(((g) it2.next()).e());
                    if (card2 != null) {
                        arrayList2.add(card2);
                    }
                }
            } else {
                arrayList2 = arrayList3;
            }
            f fVarM3 = jVarE.m("topWeek");
            if (fVarM3 == null) {
                fVarM3 = jVarE.m("topDay");
            }
            if (fVarM3 != null) {
                arrayList3 = new ArrayList();
                Iterator it3 = fVarM3.e.iterator();
                while (it3.hasNext()) {
                    HiAnimeItem card3 = parseCard(((g) it3.next()).e());
                    if (card3 != null) {
                        arrayList3.add(card3);
                    }
                }
            }
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    String strD = ((HiAnimeItem) obj).d();
                    if (strD != null) {
                        lowerCase4 = strD.toLowerCase(Locale.ROOT);
                        lowerCase4.getClass();
                    } else {
                        lowerCase4 = null;
                    }
                    if (l.a(lowerCase4, lowerCase)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList3 = arrayList4;
            }
            if (lowerCase != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    String strD2 = ((HiAnimeItem) obj2).d();
                    if (strD2 != null) {
                        lowerCase3 = strD2.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                    } else {
                        lowerCase3 = null;
                    }
                    if (l.a(lowerCase3, lowerCase)) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList2 = arrayList5;
            }
            if (lowerCase != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList) {
                    String strD3 = ((HiAnimeItem) obj3).d();
                    if (strD3 != null) {
                        lowerCase2 = strD3.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    } else {
                        lowerCase2 = null;
                    }
                    if (l.a(lowerCase2, lowerCase)) {
                        arrayList6.add(obj3);
                    }
                }
                arrayList = arrayList6;
            }
            return new HiAnimeResponse<>(new HiAnimeHome(arrayList3, arrayList2, arrayList));
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            androidx.room.b0.h("getHomePage: ", e.getMessage(), "E", TAG);
            return emptyHome();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    public final HiAnimeResponse<HiAnimeSearchData> searchAnime(String str, int i, String str2, String str3) {
        ?? arrayList;
        f fVarM;
        w wVar = w.e;
        str.getClass();
        try {
            String strFetch = fetch("https://anikoto.ddns.me/api/search?keyword=" + URLEncoder.encode(str, "UTF-8"));
            if (strFetch == null) {
                return new HiAnimeResponse<>(new HiAnimeSearchData(wVar));
            }
            Envelope envelope = (Envelope) this.gson.d(Envelope.class, strFetch);
            if (!l.a(envelope.getOk(), Boolean.TRUE)) {
                return new HiAnimeResponse<>(new HiAnimeSearchData(wVar));
            }
            g data = envelope.getData();
            j jVarE = data != null ? data.e() : null;
            if (jVarE == null || (fVarM = jVarE.m("results")) == null) {
                arrayList = wVar;
            } else {
                arrayList = new ArrayList();
                Iterator it = fVarM.e.iterator();
                while (it.hasNext()) {
                    HiAnimeItem card = parseCard(((g) it.next()).e());
                    if (card != null) {
                        arrayList.add(card);
                    }
                }
            }
            if (str2 != null && str2.length() != 0 && !str2.equals("all")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (r.o(((HiAnimeItem) obj).d(), str2, true)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            return new HiAnimeResponse<>(new HiAnimeSearchData(arrayList));
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, "searchAnime: " + e.getMessage());
            return new HiAnimeResponse<>(new HiAnimeSearchData(wVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<String> getGENRES() {
            return AnikotoScraper.GENRES;
        }

        private Companion() {
        }
    }
}
