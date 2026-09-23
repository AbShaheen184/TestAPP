package org.schabi.newpipe.extractor.services.bandcamp.extractors;

import androidx.appcompat.widget.x;
import j$.util.stream.DesugarCollectors;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.g0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.nodes.j;
import org.jsoup.parser.e0;
import org.mozilla.javascript.Context;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final List a;

    static {
        org.schabi.newpipe.extractor.utils.c[] cVarArr = {new org.schabi.newpipe.extractor.utils.c(-1, "10.jpg", 1200, 1), new org.schabi.newpipe.extractor.utils.c(90, "101.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.c(422, "170.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.c(646, "171.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.c(-1, "20.jpg", LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1), new org.schabi.newpipe.extractor.utils.c(420, "200.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.c(280, "201.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.c(140, "202.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.c(360, "204.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.c(240, "205.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.c(180, "206.jpg", -1, 2), new org.schabi.newpipe.extractor.utils.c(120, "207.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.c(100, "43.jpg", -1, 3), new org.schabi.newpipe.extractor.utils.c(Context.VERSION_ES6, "44.jpg", -1, 2)};
        ArrayList arrayList = new ArrayList(14);
        for (int i = 0; i < 14; i++) {
            org.schabi.newpipe.extractor.utils.c cVar = cVarArr[i];
            Objects.requireNonNull(cVar);
            arrayList.add(cVar);
        }
        a = Collections.unmodifiableList(arrayList);
    }

    public static com.grack.nanojson.c a(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            com.google.android.material.behavior.d dVarP = x.p();
            com.app.mlounge.data.music.e eVar = g0.a;
            Map map = Collections.EMPTY_MAP;
            try {
                com.grack.nanojson.e eVar2 = new com.grack.nanojson.e();
                eVar2.g();
                eVar2.p("band_id", str);
                eVar2.d();
                return (com.grack.nanojson.c) dVarP.m((String) eVar.w("https://bandcamp.com/api/mobile/22/band_details", map, eVar2.b().getBytes(StandardCharsets.UTF_8)).B);
            } catch (com.grack.nanojson.d e) {
                e = e;
                org.mozilla.javascript.typedarrays.c.d("Could not download band details", e);
                return null;
            }
        } catch (com.grack.nanojson.d | IOException e2) {
            e = e2;
        }
    }

    public static List b(long j, boolean z) {
        if (j == 0) {
            return Collections.EMPTY_LIST;
        }
        return (List) a.stream().map(new a("https://f4.bcbits.com/img/" + (z ? 'a' : "") + j + "_", 0)).collect(DesugarCollectors.toUnmodifiableList());
    }

    public static List c(String str) {
        if (g.h(str)) {
            return Collections.EMPTY_LIST;
        }
        return (List) a.stream().map(new a(str.replaceFirst("_\\d+\\.\\w+", "_"), 0)).collect(DesugarCollectors.toUnmodifiableList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        if (str.toLowerCase().matches("https?://.+\\.bandcamp\\.com(/.*)?")) {
            return true;
        }
        if (str.toLowerCase().matches("https?://bandcamp\\.com(/.*)?")) {
            return false;
        }
        try {
            return ((j) ((j) e0.a((String) g0.a.r(g.l(str)).B, "").V("cart-wrapper").get(0)).W("a").get(0)).d("href").equals("https://bandcamp.com/cart");
        } catch (IOException unused) {
            org.mozilla.javascript.typedarrays.c.b("Could not determine whether URL is custom domain (not available? network error?)");
            return false;
        } catch (IndexOutOfBoundsException | NullPointerException unused2) {
            return false;
        }
    }
}
