package androidx.media3.ui;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
