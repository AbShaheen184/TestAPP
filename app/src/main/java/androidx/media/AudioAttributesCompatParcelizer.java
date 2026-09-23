package androidx.media;

import androidx.versionedparcelable.a;
import androidx.versionedparcelable.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVarH = audioAttributesCompat.a;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) cVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
