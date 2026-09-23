package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import androidx.compose.foundation.text.selection.u0;
import androidx.room.b0;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.c0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.a0;
import okhttp3.g0;
import okhttp3.j0;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final y a;
    public final u0 b;
    public volatile String c;
    public volatile Map d;
    public final AtomicInteger e;
    public ServerSocket f;
    public final ExecutorService g;

    public d(y yVar, String str, Map map, u0 u0Var) {
        yVar.getClass();
        this.a = yVar;
        this.b = u0Var;
        this.c = str;
        this.d = map;
        this.e = new AtomicInteger(0);
        this.g = Executors.newCachedThreadPool();
    }

    public static boolean c(Integer num) {
        return num.intValue() == 401 || num.intValue() == 403 || num.intValue() == 410;
    }

    public static String e(String str, String str2) {
        try {
            URI uri = new URI(str2);
            return kotlin.collections.p.I(kotlin.text.k.U(str, new String[]{"\n"}, 6), "\n", null, null, new a(uri, uri.getQuery(), 0), 30);
        } catch (Exception unused) {
            return str;
        }
    }

    public static final String f(URI uri, String str, String str2) {
        try {
            String string = kotlin.text.k.g0(str2).toString();
            if (string.length() == 0) {
                return str2;
            }
            if (!kotlin.text.r.u(string, "data:", false)) {
                String string2 = uri.resolve(string).toString();
                string2.getClass();
                if (!kotlin.text.k.z(string2, "?", false) && str != null) {
                    string2 = string2 + "?" + str;
                }
                return "/seg?u=" + URLEncoder.encode(string2, "UTF-8");
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public static void g(OutputStream outputStream, int i, String str, Map map) throws IOException {
        StringBuilder sb = new StringBuilder("HTTP/1.1 ");
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        sb.append("\r\n");
        for (Map.Entry entry : map.entrySet()) {
            b0.i(sb, (String) entry.getKey(), ": ", (String) entry.getValue(), "\r\n");
        }
        sb.append("\r\n");
        byte[] bytes = sb.toString().getBytes(kotlin.text.a.a);
        bytes.getClass();
        outputStream.write(bytes);
    }

    public static void h(OutputStream outputStream, int i, String str) throws IOException {
        g(outputStream, i, str, c0.k(new kotlin.k("Connection", "close"), new kotlin.k("Content-Length", "0")));
    }

    public final b a(String str, String str2) {
        Long l;
        try {
            a0 a0Var = new a0();
            a0Var.d(str);
            for (Map.Entry entry : this.d.entrySet()) {
                a0Var.b((String) entry.getKey(), (String) entry.getValue());
            }
            if (str2 != null) {
                a0Var.b("Range", str2);
            }
            y yVar = this.a;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                j0 j0Var = g0VarE.D;
                byte[] bArrG = j0Var != null ? j0Var.g() : null;
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", "upstream " + g0VarE.A + " " + kotlin.text.k.f0(70, str));
                int i = g0VarE.A;
                String strG = g0.g("Content-Type", g0VarE);
                String strG2 = g0.g("Content-Range", g0VarE);
                String strG3 = g0.g("Content-Length", g0VarE);
                if (strG3 != null && (lValueOf = kotlin.text.r.x(strG3)) != null) {
                    l = lValueOf;
                } else if (bArrG != null) {
                    Long lValueOf = Long.valueOf(bArrG.length);
                    l = lValueOf;
                } else {
                    l = null;
                }
                b bVar = new b(i, strG, strG2, l, bArrG);
                g0VarE.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Context context2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", b0.e("upstream error ", kotlin.text.k.f0(70, str), ": ", e.getMessage()));
            return null;
        }
    }

    public final void b(Socket socket) {
        Object obj;
        int i;
        b bVarA;
        byte[] bArr;
        String strDecode;
        byte[] bArr2;
        Object lVar;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = bufferedReader.readLine();
            if (line == null) {
                socket.close();
                return;
            }
            List listU = kotlin.text.k.U(line, new String[]{" "}, 6);
            if (listU.size() < 2) {
                socket.close();
                return;
            }
            boolean z = false;
            String upperCase = ((String) listU.get(0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String str = (String) listU.get(1);
            int i2 = 0;
            String string = null;
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null || line2.length() == 0) {
                    break;
                    break;
                }
                if (kotlin.text.r.u(line2, "Range:", true)) {
                    string = kotlin.text.k.g0(kotlin.text.k.W(line2, ":", line2)).toString();
                }
                int i3 = i2 + 1;
                if (i3 > 64) {
                    break;
                }
                i2 = i3;
                z = z;
            }
            OutputStream outputStream = socket.getOutputStream();
            if (kotlin.jvm.internal.l.a(str, "/watch.m3u8")) {
                obj = "HEAD";
                i = 0;
            } else {
                if (!kotlin.text.r.u(str, "/watch.m3u8?", false)) {
                    if (!kotlin.text.r.u(str, "/seg?u=", false)) {
                        outputStream.getClass();
                        h(outputStream, 404, "Not Found");
                        socket.close();
                        return;
                    }
                    try {
                        strDecode = URLDecoder.decode(kotlin.text.k.W(str, "/seg?u=", str), "UTF-8");
                    } catch (Exception unused) {
                        strDecode = null;
                    }
                    if (strDecode != null && (kotlin.text.r.u(strDecode, "http://", false) || kotlin.text.r.u(strDecode, "https://", false))) {
                        b bVarA2 = a(strDecode, string);
                        if ((bVarA2 == null || c(Integer.valueOf(bVarA2.a))) && d()) {
                            bVarA2 = a(strDecode, string);
                        }
                        b bVar = bVarA2;
                        if (bVar == null) {
                            outputStream.getClass();
                            h(outputStream, 502, "Bad Gateway");
                            socket.close();
                            return;
                        }
                        if (upperCase.equals("HEAD") || (bArr2 = bVar.e) == null) {
                            String str2 = bVar.b;
                            kotlin.k[] kVarArr = {new kotlin.k("Content-Type", str2 == null ? "application/octet-stream" : str2), new kotlin.k("Connection", "close")};
                            LinkedHashMap linkedHashMap = new LinkedHashMap(c0.j(2));
                            c0.m(linkedHashMap, kVarArr);
                            Long l = bVar.d;
                            if (l != null) {
                                linkedHashMap.put("Content-Length", String.valueOf(l.longValue()));
                            }
                            String str3 = bVar.c;
                            if (str3 != null) {
                                linkedHashMap.put("Content-Range", str3);
                            }
                            int i4 = bVar.a;
                            kotlin.k kVar = i4 == 206 ? new kotlin.k(206, "Partial Content") : new kotlin.k(Integer.valueOf(i4), "OK");
                            outputStream.getClass();
                            g(outputStream, ((Number) kVar.e).intValue(), (String) kVar.y, linkedHashMap);
                        } else {
                            try {
                                lVar = kotlin.text.k.P(kotlin.text.k.i0(new String(bArr2, kotlin.text.a.a)).toString(), "\ufeff");
                            } catch (Throwable th) {
                                lVar = new kotlin.l(th);
                            }
                            if (lVar instanceof kotlin.l) {
                                lVar = null;
                            }
                            String str4 = (String) lVar;
                            if (str4 == null || !kotlin.text.r.u(str4, "#EXTM3U", false)) {
                                String str5 = bVar.b;
                                kotlin.k[] kVarArr2 = {new kotlin.k("Content-Type", str5 == null ? "application/octet-stream" : str5), new kotlin.k("Content-Length", String.valueOf(bArr2.length)), new kotlin.k("Connection", "close")};
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c0.j(3));
                                c0.m(linkedHashMap2, kVarArr2);
                                String str6 = bVar.c;
                                if (str6 != null) {
                                    linkedHashMap2.put("Content-Range", str6);
                                }
                                kotlin.k kVar2 = bVar.a == 206 ? new kotlin.k(206, "Partial Content") : new kotlin.k(Integer.valueOf(org.mozilla.javascript.Context.VERSION_ES6), "OK");
                                outputStream.getClass();
                                g(outputStream, ((Number) kVar2.e).intValue(), (String) kVar2.y, linkedHashMap2);
                                outputStream.write(bArr2);
                            } else {
                                Context context = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", "rewriting nested playlist (" + bArr2.length + "B)");
                                byte[] bytes = e(str4, strDecode).getBytes(kotlin.text.a.a);
                                bytes.getClass();
                                outputStream.getClass();
                                g(outputStream, org.mozilla.javascript.Context.VERSION_ES6, "OK", c0.k(new kotlin.k("Content-Type", "application/vnd.apple.mpegurl"), new kotlin.k("Content-Length", String.valueOf(bytes.length)), new kotlin.k("Connection", "close")));
                                outputStream.write(bytes);
                            }
                        }
                        outputStream.flush();
                        socket.close();
                        return;
                    }
                    outputStream.getClass();
                    h(outputStream, 400, "Bad Request");
                    socket.close();
                    return;
                }
                i = 0;
                obj = "HEAD";
            }
            String str7 = this.c;
            while (true) {
                if (i >= 4) {
                    bVarA = a(str7, null);
                    break;
                }
                bVarA = a(str7, null);
                if ((bVarA != null && !c(Integer.valueOf(bVarA.a))) || !d()) {
                    break;
                    break;
                } else {
                    str7 = this.c;
                    i++;
                }
            }
            if (bVarA != null && bVarA.a == 200 && (bArr = bVarA.e) != null) {
                Charset charset = kotlin.text.a.a;
                byte[] bytes2 = e(new String(bArr, charset), this.c).getBytes(charset);
                bytes2.getClass();
                if (upperCase.equals(obj)) {
                    outputStream.getClass();
                    g(outputStream, org.mozilla.javascript.Context.VERSION_ES6, "OK", c0.k(new kotlin.k("Content-Type", "application/vnd.apple.mpegurl"), new kotlin.k("Content-Length", String.valueOf(bytes2.length)), new kotlin.k("Connection", "close")));
                } else {
                    outputStream.getClass();
                    g(outputStream, org.mozilla.javascript.Context.VERSION_ES6, "OK", c0.k(new kotlin.k("Content-Type", "application/vnd.apple.mpegurl"), new kotlin.k("Content-Length", String.valueOf(bytes2.length)), new kotlin.k("Connection", "close")));
                    outputStream.write(bytes2);
                }
                outputStream.flush();
                socket.close();
                return;
            }
            outputStream.getClass();
            h(outputStream, bVarA != null ? bVarA.a : 502, "Bad Gateway");
            socket.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                dagger.internal.d.b(socket, th2);
                throw th3;
            }
        }
    }

    public final boolean d() {
        if (this.e.getAndIncrement() >= 3) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", "refresh budget exhausted");
            return false;
        }
        Context context2 = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", "refreshing upstream URL (attempt " + this.e.get() + ")");
        try {
            r rVar = (r) BuildersKt__BuildersKt.runBlocking$default(null, new c(this, null, 1), 1, null);
            if (rVar == null || kotlin.text.k.J(rVar.a)) {
                com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", "refresh produced nothing");
                return false;
            }
            this.c = rVar.a;
            if (!rVar.b.isEmpty()) {
                this.d = rVar.b;
            }
            com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", "upstream refreshed: ".concat(kotlin.text.k.f0(70, rVar.a)));
            return true;
        } catch (Exception e) {
            Context context3 = com.app.mlounge.util.a.a;
            b0.h("refresh failed: ", e.getMessage(), "D", "LoopbackHlsProxy");
            return false;
        }
    }
}
