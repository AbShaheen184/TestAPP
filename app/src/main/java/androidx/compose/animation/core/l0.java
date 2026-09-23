package androidx.compose.animation.core;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.PowerManager;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.widget.Toast;
import androidx.compose.material3.b3;
import androidx.compose.material3.j5;
import androidx.compose.material3.k5;
import androidx.work.impl.foreground.SystemForegroundService;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.emulator.EmulatorActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l0(Float f, h0 h0Var, Float f2, f0 f0Var) {
        this.e = 0;
        this.y = f;
        this.A = h0Var;
        this.z = f2;
        this.B = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        kotlin.coroutines.d dVar = null;
        switch (this.e) {
            case 0:
                Float f = (Float) this.y;
                h0 h0Var = (h0) this.A;
                Float f2 = (Float) this.z;
                f0 f0Var = (f0) this.B;
                if (!f.equals(h0Var.e) || !f2.equals(h0Var.y)) {
                    h0Var.e = f;
                    h0Var.y = f2;
                    h0Var.A = new t1(f0Var, e.j, f, f2, null);
                    h0Var.E.b.setValue(Boolean.TRUE);
                    h0Var.B = false;
                    h0Var.C = true;
                }
                return kotlin.y.a;
            case 1:
                j5 j5Var = (j5) this.y;
                k1 k1Var = (k1) this.z;
                k1 k1Var2 = (k1) this.A;
                k1 k1Var3 = (k1) this.B;
                j5Var.d = k1Var;
                j5Var.e = k1Var2;
                j5Var.b = k1Var3;
                break;
            case 2:
                j5 j5Var2 = (j5) this.y;
                CoroutineScope coroutineScope = (CoroutineScope) this.z;
                d dVar2 = (d) this.A;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.B;
                if (((k5) j5Var2.c.g.getValue()) == k5.y) {
                    if (j5Var2.c.d().a.containsKey(k5.z)) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c1(dVar2, dVar, 12), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b3(j5Var2, null, 0), 3, null);
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b3(j5Var2, null, 1), 3, null).invokeOnCompletion(new androidx.compose.foundation.text.selection.g1(1, aVar));
                    }
                } else {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b3(j5Var2, null, 1), 3, null).invokeOnCompletion(new androidx.compose.foundation.text.selection.g1(1, aVar));
                }
                return kotlin.y.a;
            case 3:
                return new j5((kotlin.jvm.functions.a) this.y, (kotlin.jvm.functions.a) this.z, (k5) this.A, (kotlin.jvm.functions.l) this.B);
            case 4:
                androidx.work.impl.utils.n nVar = (androidx.work.impl.utils.n) this.y;
                UUID uuid = (UUID) this.z;
                androidx.work.n nVar2 = (androidx.work.n) this.A;
                Context context = (Context) this.B;
                String string = uuid.toString();
                androidx.work.impl.model.p pVarC = nVar.c.c(string);
                if (pVarC == null || pVarC.b.a()) {
                    kotlinx.coroutines.future.a.u("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    androidx.work.impl.d dVar3 = nVar.b;
                    synchronized (dVar3.k) {
                        try {
                            androidx.work.y.e().f(androidx.work.impl.d.l, "Moving WorkSpec (" + string + ") to the foreground");
                            androidx.work.impl.h0 h0Var2 = (androidx.work.impl.h0) dVar3.g.remove(string);
                            if (h0Var2 != null) {
                                if (dVar3.a == null) {
                                    PowerManager.WakeLock wakeLockA = androidx.work.impl.utils.k.a(dVar3.b);
                                    dVar3.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                dVar3.f.put(string, h0Var2);
                                Intent intentA = androidx.work.impl.foreground.a.a(dVar3.b, coil3.svg.internal.a.q(h0Var2.a), nVar2);
                                Context context2 = dVar3.b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    androidx.media3.common.audio.h.x(context2, intentA);
                                } else {
                                    context2.startService(intentA);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    androidx.work.impl.model.j jVarQ = coil3.svg.internal.a.q(pVarC);
                    String str = androidx.work.impl.foreground.a.G;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", nVar2.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", nVar2.b);
                    intent.putExtra("KEY_NOTIFICATION", nVar2.c);
                    intent.putExtra("KEY_WORKSPEC_ID", jVarQ.a);
                    intent.putExtra("KEY_GENERATION", jVarQ.b);
                    context.startService(intent);
                }
                return null;
            case 5:
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                EpornerVideoDetail epornerVideoDetail = (EpornerVideoDetail) this.z;
                kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) this.A;
                String str2 = (String) this.B;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(cVar), null, null, new com.app.mlounge.ui.viewmodel.a(cVar, epornerVideoDetail, dVar, 0), 3, null);
                String strH = epornerVideoDetail.h();
                if (strH == null) {
                    strH = "";
                }
                qVar.invoke("adult", str2, strH);
                break;
            case 6:
                GameDetailResponse gameDetailResponse = (GameDetailResponse) this.y;
                String str3 = (String) this.z;
                com.app.mlounge.ui.viewmodel.r rVar = (com.app.mlounge.ui.viewmodel.r) this.A;
                Context context3 = (Context) this.B;
                String strJ = gameDetailResponse.j();
                if (strJ != null) {
                    str3 = strJ;
                }
                boolean zE = rVar.e(str3);
                MutableStateFlow mutableStateFlow = rVar.u;
                if (zE) {
                    com.app.mlounge.emulator.k kVar = EmulatorActivity.Companion;
                    GamePlatform gamePlatform = (GamePlatform) mutableStateFlow.getValue();
                    File file = new File(rVar.d.getFilesDir(), "roms");
                    file.mkdirs();
                    String absolutePath = new File(file, androidx.constraintlayout.core.g.c(str3, gamePlatform.g())).getAbsolutePath();
                    absolutePath.getClass();
                    String strD = gameDetailResponse.d();
                    if (strD == null) {
                        strD = "Game";
                    }
                    String strD2 = ((GamePlatform) mutableStateFlow.getValue()).d();
                    kVar.getClass();
                    context3.getClass();
                    strD2.getClass();
                    Intent intent2 = new Intent(context3, (Class<?>) EmulatorActivity.class);
                    intent2.putExtra("rom_path", absolutePath);
                    intent2.putExtra("game_title", strD);
                    intent2.putExtra("core_name", strD2);
                    context3.startActivity(intent2);
                } else {
                    Toast.makeText(context3, "Download the game first", 0).show();
                }
                return kotlin.y.a;
            default:
                List list = kotlin.collections.w.e;
                androidx.compose.ui.platform.h1 h1Var = (androidx.compose.ui.platform.h1) this.y;
                String str4 = (String) this.z;
                String str5 = (String) this.A;
                Context context4 = (Context) this.B;
                androidx.compose.ui.text.g gVar = new androidx.compose.ui.text.g(str4);
                ClipboardManager clipboardManager = ((androidx.compose.ui.platform.h) h1Var).a;
                String str6 = "plain text";
                ArrayList arrayList = gVar.z;
                CharSequence charSequence = str4;
                if (!(arrayList == null ? list : arrayList).isEmpty()) {
                    SpannableString spannableString = new SpannableString(str4);
                    androidx.compose.foundation.internal.a aVar2 = new androidx.compose.foundation.internal.a();
                    aVar2.a = Parcel.obtain();
                    if (arrayList != null) {
                        list = arrayList;
                    }
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        androidx.compose.ui.text.e eVar = (androidx.compose.ui.text.e) list.get(i);
                        androidx.compose.ui.text.e0 e0Var = (androidx.compose.ui.text.e0) eVar.a;
                        int i2 = eVar.b;
                        int i3 = eVar.c;
                        aVar2.a.recycle();
                        aVar2.a = Parcel.obtain();
                        androidx.compose.ui.text.style.o oVar = e0Var.a;
                        ClipboardManager clipboardManager2 = clipboardManager;
                        long j = e0Var.l;
                        long j2 = e0Var.h;
                        List list2 = list;
                        long j3 = e0Var.b;
                        String str7 = str5;
                        Context context5 = context4;
                        long jB = oVar.b();
                        int i4 = size;
                        String str8 = str6;
                        long j4 = androidx.compose.ui.graphics.t.i;
                        if (!androidx.compose.ui.graphics.t.c(jB, j4)) {
                            aVar2.c((byte) 1);
                            aVar2.f(e0Var.a.b());
                        }
                        long j5 = androidx.compose.ui.unit.o.c;
                        int i5 = i;
                        byte b = 2;
                        if (!androidx.compose.ui.unit.o.a(j3, j5)) {
                            aVar2.c((byte) 2);
                            aVar2.e(j3);
                        }
                        androidx.compose.ui.text.font.k kVar2 = e0Var.c;
                        if (kVar2 != null) {
                            aVar2.c((byte) 3);
                            aVar2.a.writeInt(kVar2.e);
                        }
                        androidx.compose.ui.text.font.i iVar = e0Var.d;
                        if (iVar != null) {
                            int i6 = iVar.a;
                            aVar2.c((byte) 4);
                            aVar2.c((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                        }
                        androidx.compose.ui.text.font.j jVar = e0Var.e;
                        if (jVar != null) {
                            int i7 = jVar.a;
                            aVar2.c((byte) 5);
                            if (i7 == 0) {
                                b = 0;
                            } else if (i7 == 65535) {
                                b = 1;
                            } else if (i7 != 1) {
                                if (i7 == 2) {
                                    b = 3;
                                } else {
                                    b = 0;
                                }
                            }
                            aVar2.c(b);
                        }
                        String str9 = e0Var.g;
                        if (str9 != null) {
                            aVar2.c((byte) 6);
                            aVar2.a.writeString(str9);
                        }
                        if (!androidx.compose.ui.unit.o.a(j2, j5)) {
                            aVar2.c((byte) 7);
                            aVar2.e(j2);
                        }
                        androidx.compose.ui.text.style.a aVar3 = e0Var.i;
                        if (aVar3 != null) {
                            float f3 = aVar3.a;
                            aVar2.c((byte) 8);
                            aVar2.d(f3);
                        }
                        androidx.compose.ui.text.style.p pVar = e0Var.j;
                        if (pVar != null) {
                            aVar2.c((byte) 9);
                            aVar2.d(pVar.a);
                            aVar2.d(pVar.b);
                        }
                        if (!androidx.compose.ui.graphics.t.c(j, j4)) {
                            aVar2.c((byte) 10);
                            aVar2.f(j);
                        }
                        androidx.compose.ui.text.style.l lVar = e0Var.m;
                        if (lVar != null) {
                            aVar2.c((byte) 11);
                            aVar2.a.writeInt(lVar.a);
                        }
                        androidx.compose.ui.graphics.m0 m0Var = e0Var.n;
                        if (m0Var != null) {
                            aVar2.c((byte) 12);
                            aVar2.f(m0Var.a);
                            long j6 = m0Var.b;
                            aVar2.d(Float.intBitsToFloat((int) (j6 >> 32)));
                            aVar2.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                            aVar2.d(m0Var.c);
                        }
                        spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(aVar2.a.marshall(), 0)), i2, i3, 33);
                        i = i5 + 1;
                        clipboardManager = clipboardManager2;
                        str6 = str8;
                        list = list2;
                        str5 = str7;
                        context4 = context5;
                        size = i4;
                    }
                    charSequence = spannableString;
                }
                String str10 = str5;
                Context context6 = context4;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str6, charSequence));
                context6.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str10)));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }
}
