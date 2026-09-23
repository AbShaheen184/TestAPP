package androidx.work.impl;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.q2;
import io.hopmonsdk.report.BandwidthOptReporter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(q2 q2Var, String str, Map map, List list) {
        this.e = 3;
        this.z = q2Var;
        this.A = str;
        this.B = map;
        this.y = list;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedWriter bufferedWriter;
        switch (this.e) {
            case 0:
                List list = (List) this.y;
                androidx.work.impl.model.j jVar = (androidx.work.impl.model.j) this.z;
                androidx.work.b bVar = (androidx.work.b) this.A;
                WorkDatabase workDatabase = (WorkDatabase) this.B;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).e(jVar.a);
                }
                i.b(bVar, workDatabase, list);
                return;
            case 1:
                Context context = (Context) this.y;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.A;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.B;
                try {
                    URLConnection uRLConnectionOpenConnection = new URL("https://chq-api.ddns.me/chqdl/release.apk").openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.connect();
                    long contentLength = httpURLConnection.getContentLength();
                    File file = new File(context.getExternalFilesDir(null), "update.apk");
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            long j = 0;
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    fileOutputStream.close();
                                    inputStream.close();
                                    httpURLConnection.disconnect();
                                    lVar.invoke(Float.valueOf(1.0f));
                                    lVar2.invoke(file);
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i);
                                j += (long) i;
                                if (contentLength > 0) {
                                    lVar.invoke(Float.valueOf(j / contentLength));
                                }
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    dagger.internal.d.b(inputStream, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                dagger.internal.d.b(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Exception e) {
                    lVar3.invoke("Download failed: " + e.getMessage());
                    return;
                }
            case 2:
                com.google.android.datatransport.runtime.scheduling.a aVar = (com.google.android.datatransport.runtime.scheduling.a) this.y;
                com.google.android.datatransport.runtime.k kVar = (com.google.android.datatransport.runtime.k) this.z;
                String str = kVar.a;
                com.google.android.datatransport.g gVar = (com.google.android.datatransport.g) this.A;
                com.google.android.datatransport.runtime.i iVar = (com.google.android.datatransport.runtime.i) this.B;
                aVar.getClass();
                Logger logger = com.google.android.datatransport.runtime.scheduling.a.f;
                try {
                    com.google.android.datatransport.runtime.backends.g gVarA = aVar.c.a(str);
                    if (gVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.f(new IllegalArgumentException(str2));
                    } else {
                        aVar.e.L(new androidx.media3.exoplayer.source.a0(4, aVar, kVar, ((com.google.android.datatransport.cct.b) gVarA).a(iVar)));
                        gVar.f(null);
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    gVar.f(e2);
                    return;
                }
            case 3:
                q2 q2Var = (q2) this.z;
                String str3 = (String) this.A;
                Map map = (Map) this.B;
                List list2 = (List) this.y;
                com.google.firebase.crashlytics.internal.metadata.h hVar = (com.google.firebase.crashlytics.internal.metadata.h) q2Var.a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) q2Var.g;
                BufferedWriter bufferedWriter2 = null;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str4 = (String) atomicMarkableReference.getReference();
                    File fileF = hVar.a.f(str3, "user-data");
                    try {
                        com.google.firebase.crashlytics.internal.metadata.g gVar2 = new com.google.firebase.crashlytics.internal.metadata.g();
                        gVar2.put("userId", str4);
                        String string = gVar2.toString();
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileF), com.google.firebase.crashlytics.internal.metadata.h.b));
                        try {
                            try {
                                bufferedWriter.write(string);
                                bufferedWriter.flush();
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedWriter2 = bufferedWriter;
                                com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter2, "Failed to close user metadata file.");
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        bufferedWriter = null;
                    } catch (Throwable th6) {
                        th = th6;
                        com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter2, "Failed to close user metadata file.");
                        throw th;
                    }
                    com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter, "Failed to close user metadata file.");
                    break;
                }
                if (!map.isEmpty()) {
                    hVar.h(str3, map, false);
                }
                if (list2.isEmpty()) {
                    return;
                }
                File fileF2 = hVar.a.f(str3, "rollouts-state");
                try {
                    if (list2.isEmpty()) {
                        com.google.firebase.crashlytics.internal.metadata.h.g(fileF2, "Rollout state is empty for session: " + str3);
                        return;
                    }
                    try {
                        String strE = com.google.firebase.crashlytics.internal.metadata.h.e(list2);
                        BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileF2), com.google.firebase.crashlytics.internal.metadata.h.b));
                        try {
                            bufferedWriter3.write(strE);
                            bufferedWriter3.flush();
                            com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter3, "Failed to close rollouts state file.");
                        } catch (Exception e5) {
                            e = e5;
                            bufferedWriter2 = bufferedWriter3;
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                            com.google.firebase.crashlytics.internal.metadata.h.f(fileF2);
                            com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                        } catch (Throwable th7) {
                            th = th7;
                            bufferedWriter2 = bufferedWriter3;
                        }
                    } catch (Exception e6) {
                        e = e6;
                    }
                    return;
                } catch (Throwable th8) {
                    th = th8;
                }
                com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                throw th;
            default:
                BandwidthOptReporter.lambda$postIp$0((Context) this.y, (String) this.z, (String) this.A, (String) this.B);
                return;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }
}
