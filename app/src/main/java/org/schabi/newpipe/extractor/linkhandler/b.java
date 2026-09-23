package org.schabi.newpipe.extractor.linkhandler;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public final List A;

    public b(a aVar) {
        this(aVar.e, aVar.y, aVar.z, Collections.EMPTY_LIST, "");
    }

    public b(String str, String str2, String str3, List list, String str4) {
        super(str, str2, str3);
        this.A = Collections.unmodifiableList(list);
    }
}
