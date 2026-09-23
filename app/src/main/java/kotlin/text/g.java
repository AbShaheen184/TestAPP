package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.d0;
import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final Matcher a;
    public final CharSequence b;
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k c;
    public d0 d;

    public g(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k(this, 1);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new d0(this);
        }
        d0 d0Var = this.d;
        d0Var.getClass();
        return d0Var;
    }

    public final kotlin.ranges.d b() {
        Matcher matcher = this.a;
        return i0.n(matcher.start(), matcher.end());
    }

    public final g c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return kotlin.coroutines.g.a(matcher2, iEnd, charSequence);
    }
}
