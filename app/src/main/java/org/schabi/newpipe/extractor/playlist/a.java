package org.schabi.newpipe.extractor.playlist;

import java.util.Collections;
import java.util.List;
import org.schabi.newpipe.extractor.f;
import org.schabi.newpipe.extractor.linkhandler.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f {
    @Override // org.schabi.newpipe.extractor.f
    public abstract List D();

    @Override // org.schabi.newpipe.extractor.f
    public void J() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // org.schabi.newpipe.extractor.f
    public abstract List Q();

    @Override // org.schabi.newpipe.extractor.f
    public abstract List U();

    @Override // org.schabi.newpipe.extractor.f
    public abstract String V();

    @Override // org.schabi.newpipe.extractor.f
    public abstract String X();

    public e c0() {
        return (e) ((org.schabi.newpipe.extractor.linkhandler.b) ((org.schabi.newpipe.extractor.linkhandler.a) this.d));
    }

    public abstract String e0();

    public abstract long f0();

    public abstract boolean g0();

    @Override // org.schabi.newpipe.extractor.f
    public abstract org.schabi.newpipe.extractor.stream.c s();

    @Override // org.schabi.newpipe.extractor.f
    public void K() {
    }

    @Override // org.schabi.newpipe.extractor.f
    public void L() {
    }

    public void d0() {
    }
}
