package kotlin.comparisons;

import com.grack.nanojson.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import kotlin.jvm.internal.a0;
import kotlin.ranges.d;
import kotlin.z;
import kotlinx.serialization.json.internal.m;
import kotlinx.serialization.json.internal.n;
import org.schabi.newpipe.extractor.exceptions.f;
import org.schabi.newpipe.extractor.services.youtube.i;
import org.schabi.newpipe.extractor.utils.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(n nVar) {
        nVar.getClass();
        if ((nVar instanceof n ? nVar : null) != null) {
            return;
        }
        com.google.firebase.platforminfo.b.o(a0.a(nVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final m b(kotlinx.serialization.encoding.b bVar) {
        bVar.getClass();
        m mVar = bVar instanceof m ? (m) bVar : null;
        if (mVar != null) {
            return mVar;
        }
        com.google.firebase.platforminfo.b.o(a0.a(bVar.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static void c(int i) {
        if (2 > i || i >= 37) {
            com.google.firebase.platforminfo.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("radix ", i, " was not in valid range "), new d(2, 36, 1));
        }
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final boolean e(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static ArrayList f(com.grack.nanojson.b bVar) throws f {
        String string;
        String strQ;
        boolean zAnyMatch;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.containsKey("itemSectionRenderer")) {
                for (c cVar2 : cVar.e("itemSectionRenderer").a("contents")) {
                    if (cVar2.containsKey("infoPanelContentRenderer")) {
                        c cVarE = cVar2.e("infoPanelContentRenderer");
                        z zVar = new z(1);
                        StringBuilder sb = new StringBuilder();
                        for (Object obj : cVarE.a("paragraphs")) {
                            if (sb.length() != 0) {
                                sb.append("<br>");
                            }
                            sb.append(i.n((c) obj, false));
                        }
                        if (cVarE.containsKey("sourceEndpoint")) {
                            try {
                                String strB = i.b(i.q(cVarE.e("sourceEndpoint")));
                                Objects.requireNonNull(strB);
                                ((ArrayList) zVar.y).add(new URL(strB));
                                String strN = cVarE.containsKey("inlineSource") ? i.n(cVarE.e("inlineSource"), false) : i.n(cVarE.e("disclaimer"), false);
                                if (g.h(strN)) {
                                    org.mozilla.javascript.typedarrays.c.b("Could not get metadata info link text.");
                                    return null;
                                }
                                ((ArrayList) zVar.z).add(strN);
                            } catch (NullPointerException | MalformedURLException e) {
                                org.mozilla.javascript.typedarrays.c.d("Could not get metadata info URL", e);
                                return null;
                            }
                        }
                        arrayList.add(zVar);
                    }
                    if (cVar2.containsKey("clarificationRenderer")) {
                        c cVarE2 = cVar2.e("clarificationRenderer");
                        z zVar2 = new z(1);
                        String strN2 = i.n(cVarE2.e("contentTitle"), false);
                        String strN3 = i.n(cVarE2.e("text"), false);
                        if (strN2 == null || strN3 == null) {
                            org.mozilla.javascript.typedarrays.c.b("Could not extract clarification renderer content");
                            return null;
                        }
                        if (cVarE2.containsKey("actionButton")) {
                            c cVarE3 = cVarE2.e("actionButton").e("buttonRenderer");
                            try {
                                String strB2 = i.b(i.q(cVarE3.e("command")));
                                Objects.requireNonNull(strB2);
                                ((ArrayList) zVar2.y).add(new URL(strB2));
                                String strN4 = i.n(cVarE3.e("text"), false);
                                if (g.h(strN4)) {
                                    org.mozilla.javascript.typedarrays.c.b("Could not get metadata info link text.");
                                    return null;
                                }
                                ((ArrayList) zVar2.z).add(strN4);
                            } catch (NullPointerException | MalformedURLException e2) {
                                org.mozilla.javascript.typedarrays.c.d("Could not get metadata info URL", e2);
                                return null;
                            }
                        }
                        if (cVarE2.containsKey("secondaryEndpoint") && cVarE2.containsKey("secondarySource") && (strQ = i.q(cVarE2.e("secondaryEndpoint"))) != null) {
                            try {
                                zAnyMatch = i.h.stream().anyMatch(new net.luminis.quic.ack.a(new URL(i.b(strQ)), 3));
                            } catch (MalformedURLException unused) {
                                zAnyMatch = false;
                            }
                            if (!zAnyMatch) {
                                try {
                                    ((ArrayList) zVar2.y).add(new URL(strQ));
                                    String strN5 = i.n(cVarE2.e("secondarySource"), false);
                                    if (strN5 != null) {
                                        strQ = strN5;
                                    }
                                    ((ArrayList) zVar2.z).add(strQ);
                                } catch (MalformedURLException e3) {
                                    org.mozilla.javascript.typedarrays.c.d("Could not get metadata info secondary URL", e3);
                                    return null;
                                }
                            }
                        }
                        arrayList.add(zVar2);
                    }
                    if (cVar2.containsKey("emergencyOneboxRenderer")) {
                        int i = 7;
                        List<c> list = (List) cVar2.e("emergencyOneboxRenderer").values().stream().filter(new com.grack.nanojson.a(i)).map(new org.schabi.newpipe.extractor.services.youtube.b(i)).collect(Collectors.toList());
                        if (list.isEmpty()) {
                            org.mozilla.javascript.typedarrays.c.b("Could not extract any meta info from emergency renderer");
                            return null;
                        }
                        for (c cVar3 : list) {
                            z zVar3 = new z(1);
                            i.o(cVar3.e("title"), "title");
                            if (cVar3.containsKey("actionText")) {
                                string = "\n".concat(i.o(cVar3.e("actionText"), "action"));
                            } else if (cVar3.containsKey("contacts")) {
                                com.grack.nanojson.b bVarA = cVar3.a("contacts");
                                StringBuilder sb2 = new StringBuilder();
                                for (int i2 = 0; i2 < bVarA.size(); i2++) {
                                    sb2.append("\n");
                                    sb2.append(i.o(bVarA.b(i2).e("actionText"), "contacts.actionText"));
                                }
                                string = sb2.toString();
                            } else {
                                string = "";
                            }
                            String strO = i.o(cVar3.e("detailsText"), "details");
                            String strO2 = i.o(cVar3.e("navigationText"), "urlText");
                            strO.concat(string);
                            ((ArrayList) zVar3.z).add(strO2);
                            String strQ2 = i.q(cVar3.e("navigationEndpoint"));
                            if (strQ2 == null) {
                                org.mozilla.javascript.typedarrays.c.b("Could not extract emergency renderer url");
                                return null;
                            }
                            try {
                                ((ArrayList) zVar3.y).add(new URL(g.l(strQ2)));
                                arrayList.add(zVar3);
                            } catch (MalformedURLException e4) {
                                org.mozilla.javascript.typedarrays.c.d("Could not parse emergency renderer url", e4);
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean g(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean h(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
