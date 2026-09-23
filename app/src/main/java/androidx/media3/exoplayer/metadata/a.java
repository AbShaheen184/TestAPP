package androidx.media3.exoplayer.metadata;

import androidx.compose.runtime.j;
import androidx.media3.common.r;
import androidx.media3.extractor.metadata.id3.h;
import androidx.media3.extractor.metadata.scte35.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final _COROUTINE.a a(r rVar) {
        String str = rVar.o;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new androidx.media3.extractor.metadata.dvbsi.b(0);
                case "application/x-icy":
                    return new androidx.media3.extractor.metadata.icy.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new androidx.media3.extractor.metadata.dvbsi.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        kotlinx.coroutines.future.a.q(j.i("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public final boolean b(r rVar) {
        String str = rVar.o;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
