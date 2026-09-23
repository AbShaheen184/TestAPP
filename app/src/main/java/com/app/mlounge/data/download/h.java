package com.app.mlounge.data.download;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import androidx.compose.animation.core.c1;
import androidx.room.coroutines.j;
import androidx.work.impl.v;
import com.app.mlounge.data.local.prefs.y1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.k;
import kotlin.text.r;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final Context a;
    public final com.app.mlounge.data.local.dao.d b;
    public final y1 c;
    public final y d;
    public final CoroutineScope e;
    public final ConcurrentHashMap f;
    public final j g;

    public h(Context context, com.app.mlounge.data.local.dao.d dVar, y1 y1Var, y yVar) {
        y1Var.getClass();
        yVar.getClass();
        this.a = context;
        this.b = dVar;
        this.c = y1Var;
        this.d = yVar;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.e = CoroutineScope;
        this.f = new ConcurrentHashMap();
        this.g = dVar.a();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c1(this, null, 22), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(h hVar, String str, kotlin.coroutines.jvm.internal.c cVar) throws IOException {
        c cVar2;
        String str2;
        v vVar;
        Uri uriCreateDocument;
        Context context = hVar.a;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.A = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(hVar, cVar);
            }
        } else {
            cVar2 = new c(hVar, cVar);
        }
        Object objFirst = cVar2.y;
        int i2 = cVar2.A;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.a.e(objFirst);
            Flow flow = hVar.c.K;
            cVar2.e = str;
            cVar2.A = 1;
            objFirst = FlowKt.first(flow, cVar2);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cVar2.e;
            kotlin.a.e(objFirst);
        }
        String str3 = (String) objFirst;
        if (str3 == null) {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "CinemaHQ");
            file.mkdirs();
            File fileJ = j(new File(file, str));
            FileOutputStream fileOutputStream = new FileOutputStream(fileJ);
            String absolutePath = fileJ.getAbsolutePath();
            absolutePath.getClass();
            return new a(fileOutputStream, absolutePath);
        }
        if (!r.u(str3, "content://", false)) {
            File file2 = new File(str3);
            file2.mkdirs();
            File fileJ2 = j(new File(file2, str));
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileJ2);
            String absolutePath2 = fileJ2.getAbsolutePath();
            absolutePath2.getClass();
            return new a(fileOutputStream2, absolutePath2);
        }
        androidx.documentfile.provider.a aVarP = v.p(context, Uri.parse(str3));
        if (r.n(str, ".mp4", true)) {
            str2 = "video/mp4";
        } else {
            str2 = r.n(str, ".mkv", true) ? "video/x-matroska" : "application/octet-stream";
        }
        String str4 = str;
        while (true) {
            v[] vVarArrU = aVarP.U();
            int length = vVarArrU.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    vVar = null;
                    break;
                }
                vVar = vVarArrU[i4];
                if (str4.equals(vVar.y())) {
                    break;
                }
                i4++;
            }
            if (vVar == null) {
                break;
            }
            String strD0 = k.d0(str, ".");
            String strY = k.Y(str, ".", "");
            if (strY.length() > 0) {
                str4 = strD0 + " (" + i3 + ")." + strY;
            } else {
                str4 = strD0 + " (" + i3 + ")";
            }
            i3++;
        }
        String strD1 = k.d0(str4, ".");
        Context context2 = aVarP.H;
        try {
            uriCreateDocument = DocumentsContract.createDocument(context2.getContentResolver(), aVarP.I, str2, strD1);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        androidx.documentfile.provider.a aVar2 = uriCreateDocument != null ? new androidx.documentfile.provider.a(context2, uriCreateDocument) : null;
        if (aVar2 == null) {
            kotlinx.coroutines.future.a.w("Failed to create file in custom directory");
            return null;
        }
        Uri uri = aVar2.I;
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
        if (outputStreamOpenOutputStream == null) {
            kotlinx.coroutines.future.a.w("Failed to open output stream");
            return null;
        }
        String string = uri.toString();
        string.getClass();
        return new a(outputStreamOpenOutputStream, string);
    }

    public static final void b(h hVar, String str) {
        hVar.getClass();
        if (str != null) {
            try {
                if (r.u(str, "content://", false)) {
                    try {
                        DocumentsContract.deleteDocument(hVar.a.getContentResolver(), Uri.parse(str));
                    } catch (Exception unused) {
                    }
                } else {
                    File file = new File(str);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r9 == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.app.mlounge.data.download.h r8, kotlin.coroutines.jvm.internal.c r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.download.h.h(com.app.mlounge.data.download.h, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public static void i(h hVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i, int i2, int i3, int i4) {
        String str9 = (i4 & 32) != 0 ? null : str6;
        int i5 = (i4 & 512) != 0 ? 0 : i;
        int i6 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i2;
        int i7 = (i4 & 2048) != 0 ? 0 : i3;
        hVar.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        BuildersKt__Builders_commonKt.launch$default(hVar.e, null, null, new d(map, hVar, str2, str, str3, str4, str5, str9, str7, str8, i5, i6, i7, (kotlin.coroutines.d) null), 3, null);
    }

    public static File j(File file) {
        File file2;
        if (!file.exists()) {
            return file;
        }
        String strH = kotlin.io.j.h(file);
        String name = file.getName();
        name.getClass();
        String strX = k.X('.', name, "");
        int i = 1;
        do {
            file2 = new File(file.getParent(), strH + " (" + i + ")." + strX);
            i++;
        } while (file2.exists());
        return file2;
    }

    public final void k(long j) {
        if (this.f.containsKey(Long.valueOf(j))) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new f(this, j, null), 3, null);
    }
}
