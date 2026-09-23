package org.schabi.newpipe.extractor.services.youtube.linkHandler;

import androidx.compose.runtime.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.i0;
import org.schabi.newpipe.extractor.exceptions.e;
import org.schabi.newpipe.extractor.exceptions.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i0 {
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9_-]{11})");
    public static final c c = new c(4);
    public static final List d;

    static {
        Object[] objArr = {"embed/", "live/", "shorts/", "watch/", "v/", "w/"};
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        d = Collections.unmodifiableList(arrayList);
    }

    public static String o(String str) throws f {
        String strGroup = null;
        if (str != null) {
            Matcher matcher = b.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            }
        }
        if (strGroup != null) {
            return strGroup;
        }
        org.mozilla.javascript.typedarrays.c.b("The given string is not a YouTube video ID");
        return null;
    }

    public static String p(String str) {
        for (String str2 : d) {
            if (str.startsWith(str2)) {
                return o(str.substring(str2.length()));
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r1.getHost().equalsIgnoreCase("y2u.be") == false) goto L233;
     */
    @Override // kotlin.collections.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(java.lang.String r11) throws org.schabi.newpipe.extractor.exceptions.f {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.schabi.newpipe.extractor.services.youtube.linkHandler.c.h(java.lang.String):java.lang.String");
    }

    @Override // kotlin.collections.i0
    public final String i(String str) {
        return j.i("https://www.youtube.com/watch?v=", str);
    }

    @Override // kotlin.collections.i0
    public final boolean k(String str) throws e {
        try {
            h(str);
            return true;
        } catch (e e) {
            throw e;
        } catch (f unused) {
            return false;
        }
    }
}
