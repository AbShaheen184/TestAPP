package org.schabi.newpipe.extractor.stream;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends org.schabi.newpipe.extractor.d {
    String b();

    boolean c();

    String e();

    long f();

    boolean g();

    long getDuration();

    default void h() {
        List list = Collections.EMPTY_LIST;
    }

    String m();

    org.schabi.newpipe.extractor.localization.b n();

    int p();

    default void k() {
    }

    default void l() {
    }

    default void r() {
    }
}
