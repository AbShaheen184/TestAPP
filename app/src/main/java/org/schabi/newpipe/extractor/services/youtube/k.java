package org.schabi.newpipe.extractor.services.youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final Pattern[] a = {Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\((\\d+,)decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\(decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\bm=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(h\\.s\\)\\)"), Pattern.compile("\\bc&&\\(c=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(c\\)\\)"), Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2,})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)"), Pattern.compile("([\\w$]+)\\s*=\\s*function\\((\\w+)\\)\\{\\s*\\2=\\s*\\2\\.split\\(\"\"\\)\\s*;")};
    public static final Pattern b = Pattern.compile("(var [A-z]=['\"].*['\"].split\\(\"[;{]\"\\))");
    public static final Pattern c = Pattern.compile("[;,]([A-Za-z0-9_$]{2,})\\[..");

    public static String a(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String string;
        try {
            try {
                Matcher matcherK = org.schabi.newpipe.extractor.utils.b.k(a, str);
                String strGroup = matcherK.group(1);
                String strGroup2 = matcherK.groupCount() > 1 ? matcherK.group(2) : "";
                try {
                    String str2 = strGroup + "=function";
                    string = str2.concat(kotlin.coroutines.intrinsics.h.g(str, str2));
                } catch (Exception unused) {
                    String strI = org.schabi.newpipe.extractor.utils.b.i("(" + Pattern.quote(strGroup) + "=function\\([a-zA-Z0-9_]+\\)\\{.+?\\})", 1, str);
                    StringBuilder sb = new StringBuilder("var ");
                    sb.append(strI);
                    string = sb.toString();
                }
                org.schabi.newpipe.extractor.utils.b.a(string);
                return org.schabi.newpipe.extractor.utils.b.j(b, str, 1) + ";" + org.schabi.newpipe.extractor.utils.b.i("(var " + Pattern.quote(org.schabi.newpipe.extractor.utils.b.j(c, string, 1)) + "=\\{(?>.|\\n)+?\\}\\};)", 1, str).replace("\n", "") + string + ";" + ("function deobfuscate(a){return " + strGroup + "(" + strGroup2 + "a);}");
            } catch (org.schabi.newpipe.extractor.utils.e e) {
                throw new org.schabi.newpipe.extractor.exceptions.f("Could not find deobfuscation function with any of the known patterns", e);
            }
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse deobfuscation function", e2);
            return null;
        }
    }
}
