package androidx.room;

import android.content.Context;
import android.net.Uri;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.ui.screens.player.a1;
import com.app.mlounge.ui.screens.player.c1;
import com.app.mlounge.ui.screens.player.o0;
import com.app.mlounge.ui.viewmodel.b1;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.d2;
import com.app.mlounge.ui.viewmodel.w1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(kotlin.jvm.functions.p pVar, androidx.room.coroutines.o oVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 4;
        this.z = (kotlin.coroutines.jvm.internal.i) pVar;
        this.A = oVar;
    }

    private final Object e(Object obj) {
        String strZ;
        byte[] bArrI;
        a1 a1Var = (a1) this.A;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return obj;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        c1 c1Var = (c1) this.z;
        String str = c1Var.b;
        String str2 = c1Var.c;
        Context context = a1Var.f;
        context.getClass();
        okhttp3.y yVar = a1Var.x;
        ArrayList arrayList = a1Var.m;
        this.y = 1;
        String str3 = null;
        try {
            if (kotlin.text.r.n(str, ".zip", true)) {
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str);
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                if (yVar == null) {
                    okhttp3.x xVar = new okhttp3.x();
                    xVar.a(15L);
                    yVar = new okhttp3.y(xVar);
                }
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                try {
                    okhttp3.j0 j0Var = g0VarE.D;
                    j0Var.getClass();
                    byte[] bArrG = j0Var.g();
                    g0VarE.close();
                    File file = new File(context.getCacheDir(), "subs_" + System.currentTimeMillis());
                    file.mkdirs();
                    if (arrayList != null) {
                        arrayList.add(file);
                    }
                    ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArrG));
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        loop0: while (true) {
                            if (nextEntry == null) {
                                strZ = null;
                                break;
                            }
                            if (!nextEntry.isDirectory()) {
                                List<String> listK = kotlin.collections.q.k(".srt", ".vtt", ".ass", ".ssa", ".sub");
                                if (!listK.isEmpty()) {
                                    for (String str4 : listK) {
                                        String name = nextEntry.getName();
                                        name.getClass();
                                        String lowerCase = name.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        if (kotlin.text.r.n(lowerCase, str4, false)) {
                                            File file2 = new File(file, nextEntry.getName());
                                            File parentFile = file2.getParentFile();
                                            if (parentFile != null) {
                                                parentFile.mkdirs();
                                            }
                                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                            try {
                                                dagger.hilt.android.internal.b.c(zipInputStream, fileOutputStream);
                                                fileOutputStream.close();
                                                Charset charset = kotlin.text.a.a;
                                                charset.getClass();
                                                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
                                                try {
                                                    strZ = kotlin.collections.o.z(inputStreamReader);
                                                    inputStreamReader.close();
                                                    break loop0;
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        dagger.internal.d.b(inputStreamReader, th);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                try {
                                                    throw th3;
                                                } catch (Throwable th4) {
                                                    dagger.internal.d.b(fileOutputStream, th3);
                                                    throw th4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        }
                        zipInputStream.close();
                        str3 = strZ;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            dagger.internal.d.b(zipInputStream, th5);
                            throw th6;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        dagger.internal.d.b(g0VarE, th7);
                        throw th8;
                    }
                }
            } else {
                if (kotlin.text.r.u(str, "content://", false)) {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
                    if (inputStreamOpenInputStream != null) {
                        try {
                            bArrI = dagger.hilt.android.internal.b.g(inputStreamOpenInputStream);
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th9) {
                            try {
                                throw th9;
                            } catch (Throwable th10) {
                                dagger.internal.d.b(inputStreamOpenInputStream, th9);
                                throw th10;
                            }
                        }
                    } else {
                        bArrI = null;
                    }
                } else if (kotlin.text.r.u(str, "/", false) || kotlin.text.r.u(str, "file://", false)) {
                    bArrI = kotlin.io.j.i(new File(kotlin.text.k.P(str, "file://")));
                } else {
                    okhttp3.a0 a0Var2 = new okhttp3.a0();
                    a0Var2.d(str);
                    okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                    if (yVar == null) {
                        okhttp3.x xVar2 = new okhttp3.x();
                        xVar2.a(15L);
                        yVar = new okhttp3.y(xVar2);
                    }
                    okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar, b0Var2, false).e();
                    try {
                        okhttp3.j0 j0Var2 = g0VarE2.D;
                        bArrI = j0Var2 != null ? j0Var2.g() : null;
                        g0VarE2.close();
                    } catch (Throwable th11) {
                        try {
                            throw th11;
                        } catch (Throwable th12) {
                            dagger.internal.d.b(g0VarE2, th11);
                            throw th12;
                        }
                    }
                }
                if (bArrI != null) {
                    try {
                        CharsetDecoder charsetDecoderNewDecoder = kotlin.text.a.a.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        strZ = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArrI)).toString();
                        str3 = strZ;
                    } catch (Exception unused) {
                        str3 = new String(bArrI, o0.e(str2));
                    }
                }
            }
        } catch (Exception unused2) {
        }
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return str3 == aVar ? aVar : str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r10 == r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object f(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.A
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.z
            com.app.mlounge.ui.viewmodel.g r1 = (com.app.mlounge.ui.viewmodel.g) r1
            com.app.mlounge.data.repository.r r2 = r1.b
            kotlinx.coroutines.flow.MutableStateFlow r3 = r1.v
            int r4 = r9.y
            r5 = 2
            r6 = 1
            r7 = 0
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r4 == 0) goto L2d
            if (r4 == r6) goto L29
            if (r4 != r5) goto L22
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            goto L6c
        L1d:
            r10 = move-exception
            goto L96
        L20:
            r10 = move-exception
            goto L89
        L22:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r10)
            r10 = 0
            return r10
        L29:
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            goto L4b
        L2d:
            kotlin.a.e(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r3.setValue(r10)
            r9.y = r6     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.getClass()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            com.app.mlounge.data.repository.d r4 = new com.app.mlounge.data.repository.d     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r6 = 0
            r4.<init>(r6, r2, r0, r7)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r4, r9)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 != r8) goto L4b
            goto L6b
        L4b:
            com.app.mlounge.data.remote.model.HiAnimeResponse r10 = (com.app.mlounge.data.remote.model.HiAnimeResponse) r10     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.flow.MutableStateFlow r4 = r1.t     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r4.setValue(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r9.y = r5     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r2.getClass()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            com.app.mlounge.data.repository.d r4 = new com.app.mlounge.data.repository.d     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r5 = 2
            r4.<init>(r5, r2, r0, r7)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r4, r9)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 != r8) goto L6c
        L6b:
            return r8
        L6c:
            com.app.mlounge.data.remote.model.HiAnimeResponse r10 = (com.app.mlounge.data.remote.model.HiAnimeResponse) r10     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            kotlinx.coroutines.flow.MutableStateFlow r0 = r1.x     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            com.app.mlounge.data.remote.model.HiAnimeEpisodesData r10 = (com.app.mlounge.data.remote.model.HiAnimeEpisodesData) r10     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 == 0) goto L7e
            java.util.List r10 = r10.a()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            if (r10 != 0) goto L80
        L7e:
            kotlin.collections.w r10 = kotlin.collections.w.e     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
        L80:
            r0.setValue(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
        L83:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r3.setValue(r10)
            goto L93
        L89:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r1.n     // Catch: java.lang.Throwable -> L1d
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L1d
            r0.setValue(r10)     // Catch: java.lang.Throwable -> L1d
            goto L83
        L93:
            kotlin.y r10 = kotlin.y.a
            return r10
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.s.f(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[PHI: r2 r6
  0x006c: PHI (r2v6 kotlinx.coroutines.flow.MutableStateFlow) = (r2v3 kotlinx.coroutines.flow.MutableStateFlow), (r2v9 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:16:0x0069, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v0 java.lang.Object) binds: [B:16:0x0069, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[PHI: r2 r6
  0x007f: PHI (r2v10 kotlinx.coroutines.flow.MutableStateFlow) = (r2v7 kotlinx.coroutines.flow.MutableStateFlow), (r2v13 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:19:0x007c, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r6v9 java.lang.Object) = (r6v8 java.lang.Object), (r6v0 java.lang.Object) binds: [B:19:0x007c, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r2 r6
  0x0092: PHI (r2v14 kotlinx.coroutines.flow.MutableStateFlow) = (r2v11 kotlinx.coroutines.flow.MutableStateFlow), (r2v17 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:22:0x008f, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r6v12 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:22:0x008f, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5 A[PHI: r2 r6
  0x00a5: PHI (r2v18 kotlinx.coroutines.flow.MutableStateFlow) = (r2v15 kotlinx.coroutines.flow.MutableStateFlow), (r2v20 kotlinx.coroutines.flow.MutableStateFlow) binds: [B:25:0x00a2, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r6v15 java.lang.Object) = (r6v14 java.lang.Object), (r6v0 java.lang.Object) binds: [B:25:0x00a2, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r6 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.s.g(java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj) {
        int i = this.y;
        if (i == 0) {
            kotlin.a.e(obj);
            com.app.mlounge.data.repository.x xVar = ((com.app.mlounge.ui.viewmodel.s) this.z).b;
            String str = (String) this.A;
            this.y = 1;
            Object objD = xVar.d(str, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                s sVar = new s((kotlin.jvm.functions.l) this.A, dVar, 0);
                sVar.z = obj;
                return sVar;
            case 1:
                return new s((k0) this.z, (kotlin.jvm.functions.a) this.A, dVar, 1);
            case 2:
                return new s((kotlin.jvm.functions.p) this.z, (androidx.room.coroutines.a0) this.A, dVar, 2);
            case 3:
                return new s((kotlin.jvm.functions.p) this.z, (kotlin.jvm.internal.z) this.A, dVar, 3);
            case 4:
                return new s((kotlin.jvm.functions.p) this.z, (androidx.room.coroutines.o) this.A, dVar);
            case 5:
                return new s((androidx.work.impl.constraints.f) this.z, (ProducerScope) this.A, dVar, 5);
            case 6:
                s sVar2 = new s((androidx.work.impl.constraints.controllers.b) this.A, dVar, 6);
                sVar2.z = obj;
                return sVar2;
            case 7:
                return new s((coil3.p) this.z, (coil3.request.g) this.A, dVar, 7);
            case 8:
                s sVar3 = new s((coil3.network.n) this.A, dVar, 8);
                sVar3.z = obj;
                return sVar3;
            case 9:
                return new s((com.app.mlounge.data.local.dao.k) this.z, (String) this.A, dVar, 9);
            case 10:
                return new s((androidx.compose.runtime.a1) this.z, (androidx.compose.runtime.a1) this.A, dVar, 10);
            case 11:
                return new s((androidx.compose.foundation.lazy.y) this.z, (com.app.mlounge.ui.viewmodel.g) this.A, dVar, 11);
            case 12:
                return new s((androidx.compose.foundation.lazy.grid.x) this.z, (com.app.mlounge.ui.viewmodel.g) this.A, dVar, 12);
            case 13:
                return new s((com.app.mlounge.ui.viewmodel.a0) this.z, (Context) this.A, dVar, 13);
            case 14:
                return new s((com.app.mlounge.ui.viewmodel.j0) this.z, (Context) this.A, dVar, 14);
            case 15:
                return new s((a1) this.z, (String) this.A, dVar, 15);
            case 16:
                return new s((kotlin.jvm.internal.z) this.z, (kotlin.jvm.internal.z) this.A, dVar, 16);
            case 17:
                return new s((a1) this.z, (com.app.mlounge.data.local.entity.e) this.A, dVar, 17);
            case 18:
                return new s((c1) this.z, (a1) this.A, dVar, 18);
            case 19:
                return new s((androidx.compose.foundation.lazy.grid.x) this.z, (b1) this.A, dVar, 19);
            case 20:
                return new s((w1) this.z, (kotlin.jvm.functions.w) this.A, dVar, 20);
            case 21:
                return new s((w1) this.z, (Context) this.A, dVar, 21);
            case 22:
                return new s((androidx.compose.foundation.lazy.y) this.z, (b2) this.A, dVar, 22);
            case 23:
                return new s((androidx.compose.foundation.lazy.grid.x) this.z, (d2) this.A, dVar, 23);
            case 24:
                return new s((com.app.mlounge.ui.viewmodel.c) this.z, (com.app.mlounge.data.repository.a) this.A, dVar, 24);
            case 25:
                return new s((com.app.mlounge.ui.viewmodel.g) this.z, (String) this.A, dVar, 25);
            case 26:
                return new s((HiAnimeDetailData) this.z, (com.app.mlounge.ui.viewmodel.g) this.A, dVar, 26);
            case 27:
                return new s((com.app.mlounge.ui.viewmodel.k) this.A, dVar, 27);
            case 28:
                return new s((com.app.mlounge.ui.viewmodel.s) this.z, (String) this.A, dVar, 28);
            default:
                return new s((com.app.mlounge.ui.viewmodel.a0) this.z, (String) this.A, dVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws ProtocolException {
        switch (this.e) {
            case 0:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                return ((s) create((ProducerScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 7:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 8:
                return ((s) create((coil3.network.q) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 9:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 10:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 11:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 12:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 13:
                ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 14:
                ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 15:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 16:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 17:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 18:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 19:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 20:
                ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 21:
                ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
                return kotlin.coroutines.intrinsics.a.e;
            case 22:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 23:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 24:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 25:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 26:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 27:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 28:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((s) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x0435  */
    /* JADX WARN: Code duplicated, block: B:211:0x0459 A[Catch: Exception -> 0x047d, TryCatch #0 {Exception -> 0x047d, blocks: (B:209:0x043c, B:211:0x0459, B:212:0x0461, B:214:0x0467, B:217:0x0480, B:224:0x049f, B:228:0x04a7, B:230:0x04af, B:232:0x04bb, B:235:0x04c3, B:256:0x0518, B:222:0x0499), top: B:479:0x043c }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0467 A[Catch: Exception -> 0x047d, LOOP:2: B:212:0x0461->B:214:0x0467, LOOP_END, TryCatch #0 {Exception -> 0x047d, blocks: (B:209:0x043c, B:211:0x0459, B:212:0x0461, B:214:0x0467, B:217:0x0480, B:224:0x049f, B:228:0x04a7, B:230:0x04af, B:232:0x04bb, B:235:0x04c3, B:256:0x0518, B:222:0x0499), top: B:479:0x043c }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0494  */
    /* JADX WARN: Code duplicated, block: B:222:0x0499 A[Catch: Exception -> 0x047d, TryCatch #0 {Exception -> 0x047d, blocks: (B:209:0x043c, B:211:0x0459, B:212:0x0461, B:214:0x0467, B:217:0x0480, B:224:0x049f, B:228:0x04a7, B:230:0x04af, B:232:0x04bb, B:235:0x04c3, B:256:0x0518, B:222:0x0499), top: B:479:0x043c }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:227:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:230:0x04af A[Catch: Exception -> 0x047d, TryCatch #0 {Exception -> 0x047d, blocks: (B:209:0x043c, B:211:0x0459, B:212:0x0461, B:214:0x0467, B:217:0x0480, B:224:0x049f, B:228:0x04a7, B:230:0x04af, B:232:0x04bb, B:235:0x04c3, B:256:0x0518, B:222:0x0499), top: B:479:0x043c }] */
    /* JADX WARN: Code duplicated, block: B:235:0x04c3 A[Catch: Exception -> 0x047d, TRY_LEAVE, TryCatch #0 {Exception -> 0x047d, blocks: (B:209:0x043c, B:211:0x0459, B:212:0x0461, B:214:0x0467, B:217:0x0480, B:224:0x049f, B:228:0x04a7, B:230:0x04af, B:232:0x04bb, B:235:0x04c3, B:256:0x0518, B:222:0x0499), top: B:479:0x043c }] */
    /* JADX WARN: Code duplicated, block: B:237:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:241:0x04d2 A[Catch: Exception -> 0x04dc, TryCatch #1 {Exception -> 0x04dc, blocks: (B:239:0x04cc, B:241:0x04d2, B:245:0x04e1, B:247:0x04e7), top: B:481:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:244:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:247:0x04e7 A[Catch: Exception -> 0x04dc, TRY_LEAVE, TryCatch #1 {Exception -> 0x04dc, blocks: (B:239:0x04cc, B:241:0x04d2, B:245:0x04e1, B:247:0x04e7), top: B:481:0x04cc }] */
    /* JADX WARN: Code duplicated, block: B:251:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:263:0x0542  */
    /* JADX WARN: Code duplicated, block: B:481:0x04cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a5, code lost:
    
        if (r2 == r9) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05fa, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r2, r6, r60) == r4) goto L285;
     */
    /* JADX WARN: Type inference failed for: r2v21, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r61) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 2594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }
}
