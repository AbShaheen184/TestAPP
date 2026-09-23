package okhttp3.internal.idn;

import com.google.android.gms.measurement.internal.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final y a = new y(28);

    public static final int a(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }
}
