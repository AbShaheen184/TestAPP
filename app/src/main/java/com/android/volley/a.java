package com.android.volley;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.work.impl.k;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    public static final boolean A = g.a;
    public final BlockingQueue e;
    public final androidx.compose.ui.input.pointer.util.b y;
    public volatile boolean z = false;

    public a(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, androidx.compose.ui.input.pointer.util.b bVar, com.google.android.material.shape.f fVar) {
        this.e = priorityBlockingQueue;
        this.y = bVar;
        new HashMap();
    }

    private void a() {
        this.e.take().getClass();
        throw new ClassCastException();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        androidx.compose.ui.input.pointer.util.b bVar;
        androidx.compose.ui.input.pointer.util.b bVar2 = null;
        if (A) {
            g.b("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        androidx.compose.ui.input.pointer.util.b bVar3 = this.y;
        synchronized (bVar3) {
            try {
                try {
                    k kVar = (k) bVar3.c;
                    if (((File) kVar.y) == null) {
                        kVar.y = new File(((Context) kVar.z).getCacheDir(), "volley");
                    }
                    File file = (File) kVar.y;
                    if (file.exists()) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            int length = fileArrListFiles.length;
                            int i = 0;
                            while (i < length) {
                                File file2 = fileArrListFiles[i];
                                try {
                                    long length2 = file2.length();
                                    com.android.volley.toolbox.b bVar4 = new com.android.volley.toolbox.b(new BufferedInputStream(new FileInputStream(file2)), length2);
                                    try {
                                        com.android.volley.toolbox.a aVarA = com.android.volley.toolbox.a.a(bVar4);
                                        aVarA.a = length2;
                                        String str = aVarA.b;
                                        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar3.b;
                                        if (linkedHashMap.containsKey(str)) {
                                            androidx.compose.ui.input.pointer.util.b bVar5 = bVar3;
                                            try {
                                                bVar = bVar5;
                                                bVar.a = (aVarA.a - ((com.android.volley.toolbox.a) linkedHashMap.get(str)).a) + bVar3.a;
                                            } catch (Throwable th) {
                                                th = th;
                                                bVar = bVar5;
                                                bVar4.close();
                                                throw th;
                                            }
                                        } else {
                                            bVar3.a += aVarA.a;
                                            bVar = bVar3;
                                        }
                                        try {
                                            linkedHashMap.put(str, aVarA);
                                            try {
                                                bVar4.close();
                                            } catch (IOException unused) {
                                                file2.delete();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVar4.close();
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bVar = bVar3;
                                    }
                                } catch (IOException unused2) {
                                    bVar = bVar3;
                                }
                                i++;
                                bVar3 = bVar;
                            }
                        }
                    } else if (!file.mkdirs()) {
                        Log.e("Volley", g.a("Unable to create cache dir %s", file.getAbsolutePath()));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bVar2 = bVar3;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
        while (true) {
            try {
                a();
            } catch (InterruptedException unused3) {
                if (this.z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                Log.e("Volley", g.a("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]));
            }
        }
    }
}
