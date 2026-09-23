package org.jsoup.helper;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j {
    public final Matcher a;

    public i(Matcher matcher) {
        this.a = matcher;
    }

    @Override // org.jsoup.helper.j
    public final boolean a() {
        return this.a.find();
    }
}
