package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.a aVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(aVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.a aVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, aVar);
    }
}
