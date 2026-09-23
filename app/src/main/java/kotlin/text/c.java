package kotlin.text;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements kotlin.sequences.h {
    public final CharSequence a;
    public final int b;
    public final kotlin.jvm.functions.p c;

    public c(CharSequence charSequence, int i, kotlin.jvm.functions.p pVar) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = pVar;
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new b(this);
    }
}
