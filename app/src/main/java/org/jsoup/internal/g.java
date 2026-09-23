package org.jsoup.internal;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ g(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new j(this.b);
            case 1:
                return new IllegalArgumentException("Not a localization code: ".concat(this.b));
            case 2:
                return new org.schabi.newpipe.extractor.exceptions.f(androidx.compose.runtime.j.i("Unable to parse the date: ", this.b));
            case 3:
                return new org.schabi.newpipe.extractor.exceptions.f("Cannot convert this language to a locale: ".concat(this.b));
            case 4:
                return new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.r("Could not parse upload date \"", this.b, "\""));
            default:
                return new org.schabi.newpipe.extractor.exceptions.f(androidx.compose.runtime.j.i("not a valid locale language code: ", this.b));
        }
    }
}
