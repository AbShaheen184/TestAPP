package org.schabi.newpipe.extractor.linkhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.i0;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends i0 {
    public /* synthetic */ c() {
        super(4);
    }

    @Override // kotlin.collections.i0
    public final a g(String str, String str2) {
        Objects.requireNonNull(str, "URL may not be null");
        return new b(super.g(str, str2));
    }

    @Override // kotlin.collections.i0
    public String h(String str) {
        return i(str);
    }

    @Override // kotlin.collections.i0
    public final String i(String str) {
        return r(str, new ArrayList(0));
    }

    @Override // kotlin.collections.i0
    public final String j(String str, String str2) {
        return q(str, str2, new ArrayList(0));
    }

    public final b o(String str, String str2) {
        String strJ = j(str, str2);
        return new b(new a(strJ, strJ, str));
    }

    @Override // kotlin.collections.i0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b f(String str) throws f {
        String strB = g.b(str);
        String strC = g.c(strB);
        Objects.requireNonNull(strB, "URL may not be null");
        return new b(super.g(strB, strC));
    }

    public String q(String str, String str2, List list) {
        return r(str, list);
    }

    public abstract String r(String str, List list);
}
