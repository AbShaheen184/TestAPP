package org.schabi.newpipe.extractor.stream;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public String a;
    public String b;
    public boolean c;
    public org.schabi.newpipe.extractor.i e;
    public String g;
    public Locale h;
    public int i;
    public org.schabi.newpipe.extractor.services.youtube.a j;
    public int d = 1;
    public int f = -1;

    public final b a() {
        if (this.a == null) {
            kotlinx.coroutines.future.a.u("The identifier of the audio stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
            return null;
        }
        if (this.b == null) {
            kotlinx.coroutines.future.a.u("The content of the audio stream has been not set or is null. Please specify a non-null one with setContent.");
            return null;
        }
        if (this.d != 0) {
            return new b(this);
        }
        kotlinx.coroutines.future.a.u("The delivery method of the audio stream has been set as null, which is not allowed. Pass a valid one instead with setDeliveryMethod.");
        return null;
    }
}
