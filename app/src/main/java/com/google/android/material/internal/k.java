package com.google.android.material.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s;
import androidx.core.view.w1;
import androidx.core.view.z1;
import com.appsalt.internal.k0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.q;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.d0;
import com.google.common.util.concurrent.e0;
import com.google.common.util.concurrent.f0;
import com.google.common.util.concurrent.m0;
import com.google.common.util.concurrent.n0;
import com.google.common.util.concurrent.p0;
import com.google.common.util.concurrent.x0;
import com.google.common.util.concurrent.y;
import com.google.common.util.concurrent.y0;
import com.google.common.util.concurrent.z0;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.time.LocalDateTime;
import j$.time.temporal.ChronoUnit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.internal.connection.m;
import okhttp3.r;
import okio.h0;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.n;
import retrofit2.r0;
import retrofit2.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class k implements s, y, com.google.android.gms.tasks.h, com.google.firebase.crashlytics.internal.stacktrace.a, okhttp3.h, retrofit2.f, retrofit2.g {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public k(int i) {
        this.e = i;
        switch (i) {
            case 9:
                this.y = new AtomicInteger();
                this.z = new AtomicInteger();
                break;
            case 16:
                this.y = new okhttp3.y();
                this.z = "https://api.themoviedb.org/3";
                break;
            case 19:
                this.y = new ArrayList();
                this.z = new ArrayList();
                break;
            default:
                this.y = new AtomicReference(p0.y);
                this.z = new com.google.android.datatransport.runtime.j(16, false);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static k c(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new k(12, channel, fileLockLock);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    public static void m(String str, StringBuilder sb, boolean z) {
        int i = 0;
        while (i < str.length()) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 32) {
                sb.append(z ? '+' : "%20");
            } else if (iCodePointAt == 37) {
                if (i < str.length() - 2) {
                    int i2 = i + 1;
                    if (v(str.charAt(i2))) {
                        int i3 = i + 2;
                        if (v(str.charAt(i3))) {
                            sb.append('%');
                            sb.append(str.charAt(i2));
                            sb.append(str.charAt(i3));
                            i = i3;
                        } else {
                            sb.append("%25");
                        }
                    } else {
                        sb.append("%25");
                    }
                } else {
                    sb.append("%25");
                }
            } else if (iCodePointAt > 127 || "<>\"{}|\\^[]`".indexOf(iCodePointAt) != -1) {
                sb.append(URLEncoder.encode(new String(Character.toChars(iCodePointAt)), org.jsoup.helper.b.b.name()));
                if (Character.charCount(iCodePointAt) == 2) {
                    i++;
                }
            } else {
                sb.append((char) iCodePointAt);
            }
            i++;
        }
    }

    public static boolean v(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    public void A(Object obj) {
        org.jsoup.internal.f fVar = (org.jsoup.internal.f) this.y;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) fVar.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            fVar.set(new SoftReference(arrayDeque));
        }
        if (arrayDeque.size() < 12) {
            arrayDeque.push(obj);
        }
    }

    public void B() {
        try {
            ((FileLock) this.z).release();
            ((FileChannel) this.y).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void C() {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb != null) {
            String[] strArr = org.jsoup.internal.k.a;
            if (sb.length() <= 8192) {
                sb.delete(0, sb.length());
                org.jsoup.internal.k.e.A(sb);
            }
            this.z = null;
        }
        this.y = null;
    }

    public ListenableFuture D(y yVar, Executor executor) {
        executor.getClass();
        f0 f0Var = new f0(e0.e);
        f0Var.y = executor;
        f0Var.e = this;
        k kVar = new k(2, f0Var, yVar);
        x0 x0Var = new x0();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.y).getAndSet(x0Var);
        z0 z0Var = new z0();
        z0Var.F = new y0(z0Var, kVar);
        listenableFuture.a(z0Var, f0Var);
        ListenableFuture listenableFutureE = m0.e(z0Var);
        androidx.compose.foundation.text.j jVar = new androidx.compose.foundation.text.j(z0Var, x0Var, listenableFuture, listenableFutureE, f0Var, 2);
        d0 d0Var = d0.e;
        listenableFutureE.a(jVar, d0Var);
        z0Var.a(jVar, d0Var);
        return listenableFutureE;
    }

    public boolean E(String str, String str2) {
        String str3 = ((org.schabi.newpipe.extractor.timeago.b) this.y).a;
        if (str.equals(str2)) {
            return true;
        }
        if (str3.isEmpty()) {
            return str.toLowerCase().contains(str2.toLowerCase());
        }
        String strQuote = Pattern.quote(str2.toLowerCase());
        String strQuote2 = str3.equals(" ") ? "[ \\t\\xA0\\u1680\\u180e\\u2000-\\u200a\\u202f\\u205f\\u3000\\d]" : Pattern.quote(str3);
        return Pattern.compile(androidx.privacysandbox.ads.adservices.java.internal.a.u(androidx.compose.runtime.j.q("(^|", strQuote2, ")", strQuote, "($|"), strQuote2, ")")).matcher(str.toLowerCase()).find();
    }

    public String F() {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb == null) {
            String str = (String) this.y;
            return str != null ? str : "";
        }
        this.y = sb.toString();
        org.jsoup.internal.k.l((StringBuilder) this.z);
        this.z = null;
        return (String) this.y;
    }

    public void G(Object obj, String str) {
        try {
            ((com.grack.nanojson.c) ((Stack) this.y).peek()).put(str, obj);
        } catch (ClassCastException unused) {
            throw new androidx.compose.ui.res.e("Attempted to write a keyed value to a JsonArray", 9);
        }
    }

    public void H(String str, boolean z) {
        G(Boolean.valueOf(z), str);
    }

    @Override // retrofit2.f
    public Type a() {
        return (Type) this.y;
    }

    @Override // retrofit2.f
    public Object b(z zVar) {
        Executor executor = (Executor) this.z;
        return executor == null ? zVar : new n(executor, zVar);
    }

    @Override // com.google.common.util.concurrent.y
    public ListenableFuture call() {
        f0 f0Var = (f0) this.y;
        int i = f0.B;
        if (f0Var.compareAndSet(e0.e, e0.z)) {
            return ((y) this.z).call();
        }
        n0 n0Var = n0.E;
        return n0Var != null ? n0Var : new n0();
    }

    @Override // okhttp3.h
    public void d(m mVar, g0 g0Var) {
        h0 h0VarC;
        okio.f0 f0VarD;
        int iIntValue;
        switch (this.e) {
            case 21:
                int i = 4;
                try {
                    okio.g0 g0VarA = ((okhttp3.internal.ws.e) this.y).a(g0Var);
                    r rVar = g0Var.C;
                    int size = rVar.size();
                    int i2 = 0;
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    Integer numW = null;
                    Integer numW2 = null;
                    while (i3 < size) {
                        if (rVar.c(i3).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                            String strF = rVar.f(i3);
                            int i4 = i2;
                            while (i4 < strF.length()) {
                                int iG = okhttp3.internal.e.g(strF, ',', i4, i2, i);
                                int iE = okhttp3.internal.e.e(strF, ';', i4, iG);
                                String strQ = okhttp3.internal.e.q(i4, iE, strF);
                                int i5 = iE + 1;
                                if (strQ.equalsIgnoreCase("permessage-deflate")) {
                                    if (z) {
                                        z4 = true;
                                    }
                                    i4 = i5;
                                    while (i4 < iG) {
                                        int iE2 = okhttp3.internal.e.e(strF, ';', i4, iG);
                                        int iE3 = okhttp3.internal.e.e(strF, '=', i4, iE2);
                                        String strQ2 = okhttp3.internal.e.q(i4, iE3, strF);
                                        String strR = iE3 < iE2 ? kotlin.text.k.R(okhttp3.internal.e.q(iE3 + 1, iE2, strF)) : null;
                                        i4 = iE2 + 1;
                                        if (strQ2.equalsIgnoreCase("client_max_window_bits")) {
                                            if (numW != null) {
                                                z4 = true;
                                            }
                                            numW = strR != null ? kotlin.text.r.w(strR) : null;
                                            if (numW == null) {
                                                z4 = true;
                                            }
                                        } else if (strQ2.equalsIgnoreCase("client_no_context_takeover")) {
                                            if (z2) {
                                                z4 = true;
                                            }
                                            if (strR != null) {
                                                z4 = true;
                                            }
                                            z2 = true;
                                        } else {
                                            if (strQ2.equalsIgnoreCase("server_max_window_bits")) {
                                                if (numW2 != null) {
                                                    z4 = true;
                                                }
                                                numW2 = strR != null ? kotlin.text.r.w(strR) : null;
                                                if (numW2 == null) {
                                                }
                                            } else if (strQ2.equalsIgnoreCase("server_no_context_takeover")) {
                                                if (z3) {
                                                    z4 = true;
                                                }
                                                if (strR != null) {
                                                    z4 = true;
                                                }
                                                z3 = true;
                                            }
                                            z4 = true;
                                        }
                                    }
                                    z = true;
                                } else {
                                    i4 = i5;
                                    z4 = true;
                                }
                                i = 4;
                                i2 = 0;
                            }
                        }
                        i3++;
                        i = 4;
                        i2 = 0;
                    }
                    ((okhttp3.internal.ws.e) this.y).d = new okhttp3.internal.ws.f(z, numW, z2, numW2, z3, z4);
                    if (z4 || numW != null || (numW2 != null && (8 > (iIntValue = numW2.intValue()) || iIntValue >= 16))) {
                        okhttp3.internal.ws.e eVar = (okhttp3.internal.ws.e) this.y;
                        synchronized (eVar) {
                            eVar.p.clear();
                            eVar.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    String str = okhttp3.internal.g.b + " WebSocket " + ((b0) this.z).a.h();
                    okhttp3.internal.ws.e eVar2 = (okhttp3.internal.ws.e) this.y;
                    com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(g0VarA);
                    okhttp3.internal.ws.f fVar = eVar2.d;
                    fVar.getClass();
                    synchronized (eVar2) {
                        try {
                            eVar2.m = str;
                            eVar2.n = jVar;
                            eVar2.k = new okhttp3.internal.ws.h((okio.z) jVar.A, eVar2.b, fVar.a, fVar.c, eVar2.e);
                            eVar2.i = new okhttp3.internal.cache.f(eVar2);
                            long j = eVar2.c;
                            if (j != 0) {
                                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                                okhttp3.internal.concurrent.c cVar = eVar2.l;
                                String strConcat = str.concat(" ping");
                                androidx.compose.ui.text.platform.e eVar3 = new androidx.compose.ui.text.platform.e(eVar2, nanos, 2);
                                cVar.getClass();
                                cVar.d(new okhttp3.internal.concurrent.b(strConcat, eVar3), nanos);
                            }
                            if (!eVar2.p.isEmpty()) {
                                eVar2.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    eVar2.j = new okhttp3.internal.ws.g((okio.b0) jVar.z, eVar2, fVar.a, fVar.e);
                    okhttp3.internal.ws.e eVar4 = (okhttp3.internal.ws.e) this.y;
                    try {
                        eVar4.a.b(eVar4);
                        while (eVar4.s == -1) {
                            okhttp3.internal.ws.g gVar = eVar4.j;
                            gVar.getClass();
                            gVar.a();
                        }
                    } catch (Exception e) {
                        okhttp3.internal.ws.e.c(eVar4, e, 6);
                    } finally {
                        eVar4.d();
                    }
                    return;
                } catch (IOException e2) {
                    okhttp3.internal.ws.e.c((okhttp3.internal.ws.e) this.y, e2, 4);
                    okhttp3.internal.e.b(g0Var);
                    okio.g0 g0Var2 = g0Var.E;
                    if (g0Var2 != null && (f0VarD = g0Var2.d()) != null) {
                        okhttp3.internal.e.b(f0VarD);
                    }
                    okio.g0 g0Var3 = g0Var.E;
                    if (g0Var3 == null || (h0VarC = g0Var3.c()) == null) {
                        return;
                    }
                    okhttp3.internal.e.b(h0VarC);
                    return;
                }
            default:
                retrofit2.g gVar2 = (retrofit2.g) this.y;
                z zVar = (z) this.z;
                try {
                    try {
                        gVar2.i(zVar, zVar.c(g0Var));
                        return;
                    } catch (Throwable th2) {
                        retrofit2.z0.q(th2);
                        th2.printStackTrace();
                        return;
                    }
                } catch (Throwable th3) {
                    retrofit2.z0.q(th3);
                    try {
                        gVar2.e(zVar, th3);
                        return;
                    } catch (Throwable th4) {
                        retrofit2.z0.q(th4);
                        th4.printStackTrace();
                        return;
                    }
                }
        }
    }

    @Override // retrofit2.g
    public void e(retrofit2.d dVar, Throwable th) {
        ((n) this.z).e.execute(new androidx.compose.foundation.text.contextmenu.internal.g(11, this, (retrofit2.g) this.y, th));
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        com.google.firebase.crashlytics.internal.stacktrace.a[] aVarArr = (com.google.firebase.crashlytics.internal.stacktrace.a[]) this.y;
        StackTraceElement[] stackTraceElementArrF = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            com.google.firebase.crashlytics.internal.stacktrace.a aVar = aVarArr[i];
            if (stackTraceElementArrF.length <= 1024) {
                break;
            }
            stackTraceElementArrF = aVar.f(stackTraceElementArr);
        }
        return stackTraceElementArrF.length > 1024 ? ((com.google.android.gms.measurement.internal.z) this.z).f(stackTraceElementArrF) : stackTraceElementArrF;
    }

    @Override // com.google.android.gms.tasks.h
    public com.google.android.gms.tasks.s g(Object obj) throws Throwable {
        FileWriter fileWriter;
        switch (this.e) {
            case 7:
                Boolean bool = (Boolean) obj;
                com.google.firebase.crashlytics.internal.common.m mVar = (com.google.firebase.crashlytics.internal.common.m) this.z;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    com.google.android.gms.common.api.internal.m mVar2 = mVar.b;
                    if (zBooleanValue) {
                        ((com.google.android.gms.tasks.j) mVar2.C).d(null);
                        return ((com.google.android.gms.tasks.i) this.y).i(mVar.e.a, new q(this));
                    }
                    mVar2.getClass();
                    kotlinx.coroutines.future.a.u("An invalid data collection token was used.");
                    return null;
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = com.google.firebase.crashlytics.internal.persistence.c.k(((File) mVar.g.c).listFiles(com.google.firebase.crashlytics.internal.common.m.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                com.google.firebase.crashlytics.internal.persistence.c cVar = ((com.google.firebase.crashlytics.internal.persistence.a) mVar.m.b).b;
                com.google.firebase.crashlytics.internal.persistence.a.a(com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.e).listFiles()));
                com.google.firebase.crashlytics.internal.persistence.a.a(com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.f).listFiles()));
                com.google.firebase.crashlytics.internal.persistence.a.a(com.google.firebase.crashlytics.internal.persistence.c.k(((File) cVar.g).listFiles()));
                mVar.q.d(null);
                return org.jsoup.helper.n.o(null);
            default:
                k0 k0Var = (k0) this.z;
                JSONObject jSONObject = (JSONObject) ((com.google.firebase.crashlytics.internal.concurrency.d) this.y).c.e.submit(new coil3.decode.y(this, 2)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    com.google.firebase.crashlytics.internal.settings.a aVarJ = ((q) k0Var.c).j(jSONObject);
                    q qVar = (q) k0Var.e;
                    long j = aVarJ.c;
                    qVar.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j);
                        fileWriter = new FileWriter((File) qVar.e);
                        try {
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Exception e) {
                                e = e;
                                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            }
                            com.google.firebase.crashlytics.internal.common.g.b(fileWriter, "Failed to close settings writer.");
                            k0.d(jSONObject, "Loaded settings: ");
                            String str = ((com.google.firebase.crashlytics.internal.settings.c) k0Var.b).f;
                            SharedPreferences.Editor editorEdit = ((Context) k0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            editorEdit.putString("existing_instance_identifier", str);
                            editorEdit.apply();
                            ((AtomicReference) k0Var.h).set(aVarJ);
                            ((com.google.android.gms.tasks.j) ((AtomicReference) k0Var.i).get()).d(aVarJ);
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            com.google.firebase.crashlytics.internal.common.g.b(fileWriter2, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.google.firebase.crashlytics.internal.common.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                    break;
                }
                return org.jsoup.helper.n.o(null);
        }
    }

    @Override // okhttp3.h
    public void h(m mVar, IOException iOException) {
        switch (this.e) {
            case 21:
                okhttp3.internal.ws.e.c((okhttp3.internal.ws.e) this.y, iOException, 6);
                break;
            default:
                try {
                    ((retrofit2.g) this.y).e((z) this.z, iOException);
                } catch (Throwable th) {
                    retrofit2.z0.q(th);
                    th.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // retrofit2.g
    public void i(retrofit2.d dVar, r0 r0Var) {
        ((n) this.z).e.execute(new androidx.compose.foundation.text.contextmenu.internal.g(10, this, (retrofit2.g) this.y, r0Var));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    @Override // androidx.core.view.s
    public z1 j(View view, z1 z1Var) {
        boolean z;
        boolean z2;
        androidx.core.text.f fVar = (androidx.core.text.f) this.y;
        androidx.media3.container.j jVar = (androidx.media3.container.j) this.z;
        int i = jVar.a;
        int i2 = jVar.b;
        int i3 = jVar.c;
        w1 w1Var = z1Var.a;
        androidx.core.graphics.c cVarI = w1Var.i(519);
        androidx.core.graphics.c cVarI2 = w1Var.i(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar.b;
        int i4 = cVarI.b;
        int i5 = cVarI.c;
        int i6 = cVarI.a;
        bottomSheetBehavior.w = i4;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.o;
        if (z4) {
            int i7 = w1Var.n().d;
            bottomSheetBehavior.v = i7;
            paddingBottom = i3 + i7;
        }
        int i8 = paddingBottom;
        if (bottomSheetBehavior.p) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        int i9 = paddingLeft;
        if (bottomSheetBehavior.q) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i10 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i11 = marginLayoutParams.topMargin;
            int i12 = cVarI.b;
            if (i11 != i12) {
                marginLayoutParams.topMargin = i12;
                z2 = true;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(i9, view.getPaddingTop(), i10, i8);
        boolean z5 = fVar.a;
        if (z5) {
            bottomSheetBehavior.m = cVarI2.d;
        }
        if (!z4 && !z5) {
            return z1Var;
        }
        bottomSheetBehavior.I();
        return z1Var;
    }

    public void k(char c) {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb != null) {
            sb.append(c);
            return;
        }
        if (((String) this.y) == null) {
            this.y = String.valueOf(c);
            return;
        }
        StringBuilder sbB = org.jsoup.internal.k.b();
        this.z = sbB;
        sbB.append((String) this.y);
        this.y = null;
        ((StringBuilder) this.z).append(c);
    }

    public void l(String str) {
        StringBuilder sb = (StringBuilder) this.z;
        if (sb != null) {
            sb.append(str);
            return;
        }
        if (((String) this.y) == null) {
            this.y = str;
            return;
        }
        StringBuilder sbB = org.jsoup.internal.k.b();
        this.z = sbB;
        sbB.append((String) this.y);
        this.y = null;
        ((StringBuilder) this.z).append(str);
    }

    public Object n() {
        org.jsoup.internal.f fVar = (org.jsoup.internal.f) this.y;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) fVar.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            fVar.set(new SoftReference(arrayDeque));
        }
        return !arrayDeque.isEmpty() ? arrayDeque.pop() : ((Supplier) this.z).get();
    }

    public URL o() {
        String strDecode;
        try {
            String protocol = ((URL) this.y).getProtocol();
            String userInfo = ((URL) this.y).getUserInfo();
            try {
                strDecode = URLDecoder.decode(((URL) this.y).getHost(), org.jsoup.helper.b.b.name());
            } catch (UnsupportedEncodingException e) {
                kotlinx.coroutines.future.a.l(e);
                strDecode = null;
            }
            URI uri = new URI(protocol, userInfo, IDN.toASCII(strDecode), ((URL) this.y).getPort(), null, null, null);
            StringBuilder sbB = org.jsoup.internal.k.b();
            sbB.append(uri.toASCIIString());
            m(((URL) this.y).getPath(), sbB, false);
            if (((StringBuilder) this.z) != null) {
                sbB.append('?');
                m(org.jsoup.internal.k.l((StringBuilder) this.z), sbB, true);
            }
            if (((URL) this.y).getRef() != null) {
                sbB.append('#');
                m(((URL) this.y).getRef(), sbB, false);
            }
            URL url = new URL(org.jsoup.internal.k.l(sbB));
            this.y = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return (URL) this.y;
        }
    }

    public void p() {
        String str = (String) this.y;
        try {
            com.google.firebase.crashlytics.internal.persistence.c cVar = (com.google.firebase.crashlytics.internal.persistence.c) this.z;
            cVar.getClass();
            new File((File) cVar.c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public void q() {
        Stack stack = (Stack) this.y;
        if (stack.size() == 1) {
            throw new androidx.compose.ui.res.e("Cannot end the root object or array", 9);
        }
        stack.pop();
    }

    public File r() {
        if (((File) this.y) == null) {
            synchronized (this) {
                try {
                    if (((File) this.y) == null) {
                        com.google.firebase.g gVar = (com.google.firebase.g) this.z;
                        gVar.a();
                        this.y = new File(gVar.a.getFilesDir(), "PersistedInstallation." + ((com.google.firebase.g) this.z).d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.y;
    }

    public org.schabi.newpipe.extractor.localization.b s(int i, ChronoUnit chronoUnit) {
        ChronoUnit chronoUnit2 = ChronoUnit.YEARS;
        LocalDateTime localDateTime = (LocalDateTime) this.z;
        LocalDateTime localDateTimeMinusDays = chronoUnit == chronoUnit2 ? localDateTime.minusYears(i).minusDays(1L) : localDateTime.a(i, chronoUnit);
        boolean zIsDateBased = chronoUnit.isDateBased();
        if (zIsDateBased) {
            localDateTimeMinusDays = localDateTimeMinusDays.truncatedTo(ChronoUnit.DAYS);
        }
        return new org.schabi.newpipe.extractor.localization.b(localDateTimeMinusDays, zIsDateBased);
    }

    public boolean t() {
        return (((StringBuilder) this.z) == null && ((String) this.y) == null) ? false : true;
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return ((y) this.z).toString();
            case 18:
                return String.format("%s|%s", (net.luminis.quic.impl.n) this.y, (ArrayList) this.z);
            case 24:
                StringBuilder sb = (StringBuilder) this.z;
                if (sb != null) {
                    return sb.toString();
                }
                String str = (String) this.y;
                return str != null ? str : "";
            default:
                return super.toString();
        }
    }

    public void u(com.google.firebase.installations.local.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", androidx.constraintlayout.core.g.e(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            com.google.firebase.g gVar = (com.google.firebase.g) this.z;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(r())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void w(String str) {
        com.grack.nanojson.c cVar = new com.grack.nanojson.c();
        G(cVar, str);
        ((Stack) this.y).push(cVar);
    }

    public void x(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            com.google.firebase.crashlytics.internal.analytics.b bVar = "clx".equals(bundle2.getString("_o")) ? (com.google.android.datatransport.runtime.j) this.y : (q) this.z;
            if (bVar == null) {
                return;
            }
            bVar.e(string, bundle2);
        }
    }

    public org.schabi.newpipe.extractor.localization.b y(String str) {
        int i;
        org.schabi.newpipe.extractor.timeago.b bVar = (org.schabi.newpipe.extractor.timeago.b) this.y;
        for (Map.Entry entry : bVar.i.entrySet()) {
            ChronoUnit chronoUnit = (ChronoUnit) entry.getKey();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str2 = (String) entry2.getKey();
                int iIntValue = ((Integer) entry2.getValue()).intValue();
                if (E(str, str2)) {
                    return s(iIntValue, chronoUnit);
                }
            }
        }
        try {
            i = Integer.parseInt(str.replaceAll("\\D+", ""));
        } catch (NumberFormatException unused) {
            i = 1;
        }
        EnumMap enumMap = new EnumMap(ChronoUnit.class);
        enumMap.put(ChronoUnit.SECONDS, bVar.b);
        enumMap.put(ChronoUnit.MINUTES, bVar.c);
        enumMap.put(ChronoUnit.HOURS, bVar.d);
        enumMap.put(ChronoUnit.DAYS, bVar.e);
        enumMap.put(ChronoUnit.WEEKS, bVar.f);
        enumMap.put(ChronoUnit.MONTHS, bVar.g);
        enumMap.put(ChronoUnit.YEARS, bVar.h);
        return s(i, (ChronoUnit) enumMap.entrySet().stream().filter(new org.schabi.newpipe.extractor.localization.d(this, str, 0)).map(new androidx.media3.exoplayer.audio.f(17)).findFirst().orElseThrow(new org.jsoup.internal.g(str, 2)));
    }

    public com.google.firebase.installations.local.b z() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(r());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = androidx.constraintlayout.core.g.f(5)[iOptInt];
        if (i2 == 0) {
            com.google.firebase.platforminfo.b.h("Null registrationStatus");
            return null;
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new com.google.firebase.installations.local.b(strOptString, i2, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        kotlinx.coroutines.future.a.u("Missing required properties:".concat(str));
        return null;
    }

    public /* synthetic */ k(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = obj2;
    }

    public /* synthetic */ k(int i, boolean z) {
        this.e = i;
    }

    public k(AppMeasurementSdk appMeasurementSdk, k kVar) {
        this.e = 4;
        this.z = kVar;
        appMeasurementSdk.a(new com.google.firebase.analytics.connector.internal.b(this, 0));
        this.y = new HashSet();
    }

    public k(URL url) {
        this.e = 22;
        this.y = url;
        if (url.getQuery() != null) {
            StringBuilder sbB = org.jsoup.internal.k.b();
            sbB.append(((URL) this.y).getQuery());
            this.z = sbB;
        }
    }

    public k(com.google.firebase.crashlytics.internal.stacktrace.a[] aVarArr) {
        this.e = 11;
        this.y = aVarArr;
        this.z = new com.google.android.gms.measurement.internal.z(24);
    }

    public k(Supplier supplier) {
        this.e = 23;
        this.z = supplier;
        this.y = new org.jsoup.internal.f(new org.jsoup.internal.c(1), 0);
    }

    public k(Context context) {
        this.e = 6;
        this.y = context;
        this.z = null;
    }

    public k(com.google.firebase.g gVar) {
        this.e = 13;
        this.z = gVar;
    }

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
