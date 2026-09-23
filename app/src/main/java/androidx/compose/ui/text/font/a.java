package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {
    public final int e;

    public a(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.e == ((a) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.e, ')');
    }
}
