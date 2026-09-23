package com.app.mlounge.ui.screens.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import android.widget.Toast;
import androidx.compose.animation.core.c1;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.lazy.layout.x0;
import androidx.compose.foundation.text.q0;
import androidx.compose.material3.b4;
import androidx.compose.material3.h4;
import androidx.compose.material3.i0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.t5;
import androidx.compose.material3.u5;
import androidx.compose.material3.x2;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.g1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.w2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.m0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.n0;
import com.app.mlounge.ui.components.v0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static final List a = kotlin.collections.q.k(new kotlin.k(30000L, "30s"), new kotlin.k(60000L, "1m"), new kotlin.k(90000L, "1m 30s"), new kotlin.k(120000L, "2m"), new kotlin.k(300000L, "5m"));
    public static final List b = kotlin.collections.q.k(new kotlin.k(10000L, "10s"), new kotlin.k(15000L, "15s"), new kotlin.k(20000L, "20s"), new kotlin.k(30000L, "30s"), new kotlin.k(60000L, "1m"), new kotlin.k(120000L, "2m"), new kotlin.k(300000L, "5m"));
    public static final List c = kotlin.collections.q.k(new f0("internal", "Built-in Player"), new f0("com.mxtech.videoplayer.ad", "MX Player"), new f0("com.mxtech.videoplayer.pro", "MX Player Pro"), new f0("org.videolan.vlc", "VLC"), new f0("com.brouken.player", "Just (Video) Player"), new f0("com.hbplayer.HBvideoplayer", "HB Video Player"), new f0("com.player.bear", "Bear/Fluid Video Player"));
    public static final List d = kotlin.collections.q.k(new f0("internal", "Built-in Downloader"), new f0("com.dv.adm", "ADM"), new f0("idm.internet.download.manager", "1DM"), new f0("idm.internet.download.manager.plus", "1DM+"));

    public static void a(a1 a1Var, a1 a1Var2) {
        if (Build.VERSION.SDK_INT < 30) {
            a1Var.setValue(Boolean.TRUE);
        } else if (Environment.isExternalStorageManager()) {
            a1Var.setValue(Boolean.TRUE);
        } else {
            a1Var2.setValue(Boolean.TRUE);
        }
    }

    public static void b(Context context, androidx.activity.compose.t tVar, androidx.activity.compose.t tVar2, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, g1 g1Var) throws Exception {
        String string = kotlin.text.k.g0((String) a1Var.getValue()).toString();
        if (string.length() > 0) {
            File file = new File((File) a1Var2.getValue(), string);
            if (file.mkdirs() || file.isDirectory()) {
                a1Var2.setValue(file);
                g1Var.h(g1Var.g() + 1);
            } else {
                a1Var3.setValue(string);
                if (Build.VERSION.SDK_INT < 30) {
                    tVar2.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else if (!Environment.isExternalStorageManager()) {
                    try {
                        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                        intent.setData(Uri.parse("package:" + context.getPackageName()));
                        tVar.a(intent);
                    } catch (Exception unused) {
                        tVar.a(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                    }
                }
            }
        }
        a1Var4.setValue(Boolean.FALSE);
    }

    public static void c(Context context, a1 a1Var, a1 a1Var2, g1 g1Var, androidx.activity.result.a aVar) {
        aVar.getClass();
        if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
            Toast.makeText(context, "Storage permission required to create folders", 0).show();
            a1Var.setValue("");
        } else if (((String) a1Var.getValue()).length() > 0) {
            File file = new File((File) a1Var2.getValue(), (String) a1Var.getValue());
            if (file.mkdirs() || file.isDirectory()) {
                a1Var2.setValue(file);
                g1Var.h(g1Var.g() + 1);
            } else {
                Toast.makeText(context, "Could not create folder", 0).show();
            }
            a1Var.setValue("");
        }
    }

    public static final void d(String str, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(-649355299);
        int i2 = i | (sVar.f(str) ? 4 : 2) | (sVar.h(lVar) ? 32 : 16);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            List listK = kotlin.collections.q.k(new kotlin.k("fit", "Fit to Screen"), new kotlin.k("4:3", "4:3 (Original)"), new kotlin.k("16:9", "16:9 (Widescreen)"), new kotlin.k("stretch", "Stretch to Fill"));
            androidx.compose.material3.q.a(aVar, androidx.compose.runtime.internal.k.c(-1015995867, new com.app.mlounge.ui.components.h(3, aVar), sVar), null, null, b.f, androidx.compose.runtime.internal.k.c(-1405947222, new b2(14, listK, lVar, str), sVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, sVar, 1769526, 0, 16028);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new b2(str, lVar, aVar, i, 15);
        }
    }

    public static final void e(final com.app.mlounge.ui.viewmodel.k kVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.c0(-602393566);
        if ((i & 6) == 0) {
            i2 = i | (sVar.h(kVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (sVar.T(i2 & 1, (i2 & 3) != 2)) {
            final Context context = (Context) sVar.j(m0.b);
            final a1 a1VarG = androidx.compose.runtime.t.g(kVar.d, sVar);
            final a1 a1VarG2 = androidx.compose.runtime.t.g(kVar.f, sVar);
            final a1 a1VarG3 = androidx.compose.runtime.t.g(kVar.h, sVar);
            final a1 a1VarG4 = androidx.compose.runtime.t.g(kVar.j, sVar);
            final a1 a1VarG5 = androidx.compose.runtime.t.g(kVar.l, sVar);
            final a1 a1VarG6 = androidx.compose.runtime.t.g(kVar.n, sVar);
            final a1 a1VarG7 = androidx.compose.runtime.t.g(kVar.p, sVar);
            final a1 a1VarG8 = androidx.compose.runtime.t.g(kVar.q, sVar);
            final a1 a1VarG9 = androidx.compose.runtime.t.g(kVar.r, sVar);
            final a1 a1VarG10 = androidx.compose.runtime.t.g(kVar.s, sVar);
            final a1 a1VarG11 = androidx.compose.runtime.t.g(kVar.x, sVar);
            final a1 a1VarG12 = androidx.compose.runtime.t.g(kVar.z, sVar);
            final a1 a1VarG13 = androidx.compose.runtime.t.g(kVar.B, sVar);
            final a1 a1VarG14 = androidx.compose.runtime.t.g(kVar.v, sVar);
            final a1 a1VarG15 = androidx.compose.runtime.t.g(kVar.t, sVar);
            final a1 a1VarG16 = androidx.compose.runtime.t.g(kVar.u, sVar);
            String str = ((Number) a1VarG9.getValue()).longValue() > 0 ? new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(((Number) a1VarG9.getValue()).longValue())) : "Never";
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = new androidx.compose.ui.focus.y();
                sVar.l0(objQ);
            }
            final androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = new androidx.compose.ui.focus.y();
                sVar.l0(objQ2);
            }
            final androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) objQ2;
            androidx.activity.result.contract.b bVar = new androidx.activity.result.contract.b(0);
            boolean zH = sVar.h(context) | sVar.h(kVar);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == obj) {
                final int i3 = 0;
                objQ3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.y
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                Context context2 = context;
                                com.app.mlounge.ui.viewmodel.k kVar2 = kVar;
                                Uri uri = (Uri) obj2;
                                if (uri != null) {
                                    try {
                                        context2.getContentResolver().takePersistableUriPermission(uri, 1);
                                        String string = uri.toString();
                                        string.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string, null, 2), 3, null);
                                    } catch (Exception e) {
                                        Context context3 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("E", "Settings", "Failed to take M3U permission: " + e.getMessage());
                                        String string2 = uri.toString();
                                        string2.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string2, null, 2), 3, null);
                                    }
                                }
                                break;
                            default:
                                Context context4 = context;
                                com.app.mlounge.ui.viewmodel.k kVar3 = kVar;
                                Uri uri2 = (Uri) obj2;
                                if (uri2 != null) {
                                    try {
                                        context4.getContentResolver().takePersistableUriPermission(uri2, 1);
                                        String string3 = uri2.toString();
                                        string3.getClass();
                                        kVar3.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar3), null, null, new com.app.mlounge.ui.viewmodel.j(kVar3, string3, null, 1), 3, null);
                                    } catch (Exception e2) {
                                        Context context5 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("E", "Settings", "Failed to take EPG permission: " + e2.getMessage());
                                        String string4 = uri2.toString();
                                        string4.getClass();
                                        kVar3.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar3), null, null, new com.app.mlounge.ui.viewmodel.j(kVar3, string4, null, 1), 3, null);
                                    }
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ3);
            }
            final androidx.activity.compose.t tVarH = _COROUTINE.b.H(bVar, (kotlin.jvm.functions.l) objQ3, sVar, 0);
            androidx.activity.result.contract.b bVar2 = new androidx.activity.result.contract.b(0);
            boolean zH2 = sVar.h(context) | sVar.h(kVar);
            Object objQ4 = sVar.Q();
            if (zH2 || objQ4 == obj) {
                final int i4 = 1;
                objQ4 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.y
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        switch (i4) {
                            case 0:
                                Context context2 = context;
                                com.app.mlounge.ui.viewmodel.k kVar2 = kVar;
                                Uri uri = (Uri) obj2;
                                if (uri != null) {
                                    try {
                                        context2.getContentResolver().takePersistableUriPermission(uri, 1);
                                        String string = uri.toString();
                                        string.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string, null, 2), 3, null);
                                    } catch (Exception e) {
                                        Context context3 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("E", "Settings", "Failed to take M3U permission: " + e.getMessage());
                                        String string2 = uri.toString();
                                        string2.getClass();
                                        kVar2.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar2), null, null, new com.app.mlounge.ui.viewmodel.j(kVar2, string2, null, 2), 3, null);
                                    }
                                }
                                break;
                            default:
                                Context context4 = context;
                                com.app.mlounge.ui.viewmodel.k kVar3 = kVar;
                                Uri uri2 = (Uri) obj2;
                                if (uri2 != null) {
                                    try {
                                        context4.getContentResolver().takePersistableUriPermission(uri2, 1);
                                        String string3 = uri2.toString();
                                        string3.getClass();
                                        kVar3.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar3), null, null, new com.app.mlounge.ui.viewmodel.j(kVar3, string3, null, 1), 3, null);
                                    } catch (Exception e2) {
                                        Context context5 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.a("E", "Settings", "Failed to take EPG permission: " + e2.getMessage());
                                        String string4 = uri2.toString();
                                        string4.getClass();
                                        kVar3.getClass();
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar3), null, null, new com.app.mlounge.ui.viewmodel.j(kVar3, string4, null, 1), 3, null);
                                    }
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ4);
            }
            final androidx.activity.compose.t tVarH2 = _COROUTINE.b.H(bVar2, (kotlin.jvm.functions.l) objQ4, sVar, 0);
            final String str2 = str;
            q("Custom IPTV Provider", true, androidx.compose.runtime.internal.k.c(-582480857, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.settings.z
                /* JADX WARN: Code duplicated, block: B:103:0x0785  */
                /* JADX WARN: Code duplicated, block: B:107:0x079e  */
                /* JADX WARN: Code duplicated, block: B:110:0x09a4  */
                /* JADX WARN: Code duplicated, block: B:111:0x09a8  */
                /* JADX WARN: Code duplicated, block: B:114:0x0a00  */
                /* JADX WARN: Code duplicated, block: B:115:0x0a04  */
                /* JADX WARN: Code duplicated, block: B:118:0x0a8d  */
                /* JADX WARN: Code duplicated, block: B:119:0x0a90  */
                /* JADX WARN: Code duplicated, block: B:122:0x0ae2  */
                /* JADX WARN: Code duplicated, block: B:125:0x0ae7  */
                /* JADX WARN: Code duplicated, block: B:130:0x0b89  */
                /* JADX WARN: Code duplicated, block: B:131:0x0b8d  */
                /* JADX WARN: Code duplicated, block: B:134:0x0c11  */
                /* JADX WARN: Code duplicated, block: B:136:0x0c3f  */
                /* JADX WARN: Code duplicated, block: B:137:0x0c43  */
                /* JADX WARN: Code duplicated, block: B:139:0x0ccd  */
                /* JADX WARN: Code duplicated, block: B:141:0x0d00  */
                /* JADX WARN: Code duplicated, block: B:142:0x0d04  */
                /* JADX WARN: Code duplicated, block: B:145:0x0d57  */
                /* JADX WARN: Code duplicated, block: B:146:0x0d5b  */
                /* JADX WARN: Code duplicated, block: B:149:0x0d93  */
                /* JADX WARN: Code duplicated, block: B:151:0x0d98  */
                /* JADX WARN: Code duplicated, block: B:154:0x0da7  */
                /* JADX WARN: Code duplicated, block: B:158:0x0dc6  */
                /* JADX WARN: Code duplicated, block: B:161:0x0de5  */
                /* JADX WARN: Code duplicated, block: B:164:0x0df7  */
                /* JADX WARN: Code duplicated, block: B:166:0x0e10  */
                /* JADX WARN: Code duplicated, block: B:169:0x0e2b  */
                /* JADX WARN: Code duplicated, block: B:170:0x0e86  */
                /* JADX WARN: Code duplicated, block: B:173:0x0e9e  */
                /* JADX WARN: Code duplicated, block: B:174:0x0eef  */
                /* JADX WARN: Code duplicated, block: B:182:0x0f2a  */
                /* JADX WARN: Code duplicated, block: B:184:0x0f75  */
                /* JADX WARN: Code duplicated, block: B:185:0x0f79  */
                /* JADX WARN: Code duplicated, block: B:188:0x0fe4  */
                /* JADX WARN: Code duplicated, block: B:189:0x0fe8  */
                /* JADX WARN: Code duplicated, block: B:192:0x1059  */
                /* JADX WARN: Code duplicated, block: B:193:0x105c  */
                /* JADX WARN: Code duplicated, block: B:94:0x0674  */
                /* JADX WARN: Code duplicated, block: B:97:0x0686  */
                /* JADX WARN: Code duplicated, block: B:99:0x068e  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Object obj5;
                    final int i5;
                    Object obj6;
                    char c2;
                    char c3;
                    boolean z;
                    int i6;
                    float f;
                    androidx.compose.ui.focus.y yVar3;
                    androidx.compose.ui.focus.y yVar4;
                    Object obj7;
                    Object obj8;
                    boolean zH3;
                    Object obj9;
                    androidx.compose.ui.graphics.vector.f fVarB;
                    char c4;
                    char c5;
                    int i7;
                    int i8;
                    boolean zH4;
                    Object obj10;
                    androidx.compose.ui.graphics.vector.f fVarB2;
                    kotlin.jvm.functions.a aVarB;
                    kotlin.jvm.functions.a aVarB2;
                    float f2;
                    Object obj11;
                    androidx.compose.ui.i iVar;
                    w2 w2Var;
                    String str3;
                    boolean zH5;
                    Object objQ5;
                    Object obj12;
                    com.app.mlounge.ui.viewmodel.k kVar2;
                    Object obj13;
                    String strY;
                    String strY2;
                    androidx.compose.ui.focus.y yVar5;
                    Object obj14;
                    androidx.compose.ui.focus.y yVar6;
                    androidx.compose.runtime.s sVar2;
                    float f3;
                    androidx.compose.ui.o oVar;
                    androidx.compose.foundation.layout.c cVar;
                    kotlin.jvm.functions.a aVarB3;
                    Object obj15;
                    androidx.compose.ui.h hVar;
                    androidx.compose.runtime.s sVar3;
                    boolean zBooleanValue;
                    w2 w2Var2;
                    w2 w2Var3;
                    w2 w2Var4;
                    kotlin.jvm.functions.a aVarB4;
                    kotlin.jvm.functions.a aVarB5;
                    String str4;
                    Object objQ6;
                    Object obj16;
                    final com.app.mlounge.ui.viewmodel.k kVar3;
                    boolean zH6;
                    Object obj17;
                    final int i9;
                    int i10;
                    androidx.compose.ui.o oVar2;
                    androidx.compose.runtime.s sVar4;
                    w2 w2Var5;
                    androidx.compose.ui.o oVar3;
                    androidx.compose.runtime.s sVar5;
                    boolean zH7;
                    Object objQ7;
                    Object obj18;
                    androidx.compose.runtime.s sVar6;
                    kotlin.jvm.functions.a aVarB6;
                    androidx.compose.runtime.s sVar7;
                    kotlin.jvm.functions.a aVarB7;
                    String str5;
                    kotlin.jvm.functions.a aVarB8;
                    androidx.compose.runtime.s sVar8;
                    com.app.mlounge.ui.viewmodel.k kVar4;
                    androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    androidx.compose.ui.i iVar2 = androidx.compose.ui.c.H;
                    ((androidx.compose.foundation.layout.x) obj2).getClass();
                    if (sVar9.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        float f4 = 16;
                        float f5 = 12;
                        androidx.compose.ui.o oVar4 = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(oVar4, f4, f5);
                        androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.h.c;
                        androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
                        androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(cVar2, hVar2, sVar9, 0);
                        int iHashCode = Long.hashCode(sVar9.T);
                        androidx.compose.runtime.internal.j jVarL = sVar9.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar9, rVarR);
                        androidx.compose.ui.node.h.b.getClass();
                        kotlin.jvm.functions.a aVar = androidx.compose.ui.node.g.b;
                        sVar9.e0();
                        if (sVar9.S) {
                            sVar9.k(aVar);
                        } else {
                            sVar9.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                        androidx.compose.runtime.t.x(sVar9, wVarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                        androidx.compose.runtime.t.x(sVar9, jVarL, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                        androidx.compose.runtime.t.p(sVar9, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        androidx.compose.runtime.t.t(sVar9, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                        androidx.compose.runtime.t.x(sVar9, rVarC, eVar4);
                        float f6 = 8;
                        androidx.compose.foundation.layout.c cVar3 = cVar2;
                        androidx.compose.ui.i iVar3 = iVar2;
                        androidx.compose.ui.o oVar5 = oVar4;
                        androidx.compose.ui.h hVar3 = hVar2;
                        z5.b("Source Type", androidx.compose.foundation.layout.b.u(oVar4, 0.0f, 0.0f, 0.0f, f6, 7), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, androidx.compose.material3.q.p(sVar9).n, sVar9, 54, 0, 131064);
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f6);
                        androidx.compose.ui.i iVar4 = androidx.compose.ui.c.G;
                        f1 f1VarA = d1.a(fVarG, iVar4, sVar9, 6);
                        int iHashCode2 = Long.hashCode(sVar9.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar9.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar9, oVar5);
                        sVar9.e0();
                        if (sVar9.S) {
                            sVar9.k(aVar);
                        } else {
                            sVar9.o0();
                        }
                        androidx.compose.runtime.t.x(sVar9, f1VarA, eVar);
                        androidx.compose.runtime.t.x(sVar9, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar9, eVar3, sVar9, dVar);
                        androidx.compose.runtime.t.x(sVar9, rVarC2, eVar4);
                        w2 w2Var6 = a1VarG;
                        boolean zA = kotlin.jvm.internal.l.a((String) w2Var6.getValue(), "m3u");
                        final com.app.mlounge.ui.viewmodel.k kVar5 = kVar;
                        boolean zH8 = sVar9.h(kVar5);
                        Object objQ8 = sVar9.Q();
                        Object obj19 = androidx.compose.runtime.n.a;
                        if (zH8 || objQ8 == obj19) {
                            final int i11 = 0;
                            Object obj20 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.j
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            kVar5.h("m3u");
                                            break;
                                        case 1:
                                            kVar5.h("xtream");
                                            break;
                                        case 2:
                                            kVar5.h("local");
                                            break;
                                        case 3:
                                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar5;
                                            kVar6.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar6), null, null, new com.app.mlounge.ui.viewmodel.i(kVar6, null), 3, null);
                                            break;
                                        default:
                                            com.app.mlounge.ui.viewmodel.k kVar7 = kVar5;
                                            kVar7.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar7), null, null, new c1(kVar7, null, 25), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar9.l0(obj20);
                            obj5 = obj20;
                        } else {
                            obj5 = objQ8;
                        }
                        e0.k("M3U Playlist", zA, null, (kotlin.jvm.functions.a) obj5, sVar9, 6, 4);
                        boolean zA2 = kotlin.jvm.internal.l.a((String) w2Var6.getValue(), "xtream");
                        boolean zH9 = sVar9.h(kVar5);
                        Object objQ9 = sVar9.Q();
                        if (zH9 || objQ9 == obj19) {
                            i5 = 1;
                            Object obj21 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.j
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            kVar5.h("m3u");
                                            break;
                                        case 1:
                                            kVar5.h("xtream");
                                            break;
                                        case 2:
                                            kVar5.h("local");
                                            break;
                                        case 3:
                                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar5;
                                            kVar6.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar6), null, null, new com.app.mlounge.ui.viewmodel.i(kVar6, null), 3, null);
                                            break;
                                        default:
                                            com.app.mlounge.ui.viewmodel.k kVar7 = kVar5;
                                            kVar7.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar7), null, null, new c1(kVar7, null, 25), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar9.l0(obj21);
                            obj6 = obj21;
                        } else {
                            i5 = 1;
                            obj6 = objQ9;
                        }
                        boolean z2 = i5;
                        e0.k("Xtream Codes", zA2, null, (kotlin.jvm.functions.a) obj6, sVar9, 6, 4);
                        boolean zA3 = kotlin.jvm.internal.l.a((String) w2Var6.getValue(), "local");
                        boolean zH10 = sVar9.h(kVar5);
                        Object objQ10 = sVar9.Q();
                        final int i12 = 2;
                        Object obj22 = objQ10;
                        if (zH10 || objQ10 == obj19) {
                            Object obj23 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.j
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            kVar5.h("m3u");
                                            break;
                                        case 1:
                                            kVar5.h("xtream");
                                            break;
                                        case 2:
                                            kVar5.h("local");
                                            break;
                                        case 3:
                                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar5;
                                            kVar6.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar6), null, null, new com.app.mlounge.ui.viewmodel.i(kVar6, null), 3, null);
                                            break;
                                        default:
                                            com.app.mlounge.ui.viewmodel.k kVar7 = kVar5;
                                            kVar7.getClass();
                                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(kVar7), null, null, new c1(kVar7, null, 25), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar9.l0(obj23);
                            obj22 = obj23;
                        }
                        e0.k("Local File", zA3, null, (kotlin.jvm.functions.a) obj22, sVar9, 6, 4);
                        sVar9.p(z2);
                        sVar9.p(z2);
                        androidx.compose.material3.q.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.08f, androidx.compose.ui.graphics.t.d), sVar9, 384, 3);
                        boolean zA4 = kotlin.jvm.internal.l.a((String) w2Var6.getValue(), "m3u");
                        androidx.compose.ui.focus.y yVar7 = yVar2;
                        androidx.compose.ui.focus.y yVar8 = yVar;
                        if (zA4) {
                            sVar9.b0(-1018547986);
                            String str6 = (String) a1VarG2.getValue();
                            boolean zH11 = sVar9.h(kVar5);
                            Object objQ11 = sVar9.Q();
                            if (zH11 || objQ11 == obj19) {
                                kVar4 = kVar5;
                                objQ11 = new androidx.compose.foundation.c(1, kVar4, com.app.mlounge.ui.viewmodel.k.class, "setM3uUrl", "setM3uUrl(Ljava/lang/String;)V", 0, 16);
                                sVar9.l0(objQ11);
                            } else {
                                kVar4 = kVar5;
                            }
                            com.app.mlounge.ui.viewmodel.k kVar6 = kVar4;
                            yVar6 = yVar8;
                            e0.s("M3U Playlist URL", str6, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ11), okhttp3.internal.platform.android.g.m(), androidx.compose.foundation.layout.b.s(oVar5, f4, 0.0f, 2), "http://example.com/playlist.m3u", null, new q0(5, Token.EXPORT), sVar9, 12804102, 64);
                            String str7 = (String) a1VarG3.getValue();
                            boolean zH12 = sVar9.h(kVar6);
                            Object objQ12 = sVar9.Q();
                            if (zH12 || objQ12 == obj19) {
                                objQ12 = new androidx.compose.foundation.c(1, kVar6, com.app.mlounge.ui.viewmodel.k.class, "setEpgUrl", "setEpgUrl(Ljava/lang/String;)V", 0, 17);
                                sVar9.l0(objQ12);
                            }
                            e0.s("EPG URL (optional)", str7, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ12), _COROUTINE.a.M(), androidx.compose.foundation.layout.b.s(oVar5, f4, 0.0f, 2), "http://example.com/epg.xml.gz", null, new q0(5, Token.EXPORT), sVar9, 12804102, 64);
                            androidx.compose.runtime.s sVar10 = sVar9;
                            sVar10.p(false);
                            f2 = f4;
                            kVar2 = kVar6;
                            obj13 = obj19;
                            obj11 = "local";
                            iVar = iVar4;
                            yVar3 = yVar7;
                            sVar8 = sVar10;
                        } else {
                            final int i13 = 0;
                            if (kotlin.jvm.internal.l.a((String) w2Var6.getValue(), "local")) {
                                sVar9.b0(-1017616839);
                                w2 w2Var7 = a1VarG15;
                                if (kotlin.text.k.J((String) w2Var7.getValue())) {
                                    strY = "Choose .m3u file";
                                } else {
                                    String str8 = (String) w2Var7.getValue();
                                    strY = kotlin.text.k.Y(str8, "%2F", str8);
                                }
                                String str9 = strY;
                                androidx.compose.ui.graphics.vector.f fVarT = org.jsoup.helper.n.t();
                                final androidx.activity.compose.t tVar = tVarH;
                                boolean zH13 = sVar9.h(tVar);
                                Object objQ13 = sVar9.Q();
                                Object obj24 = objQ13;
                                if (zH13 || objQ13 == obj19) {
                                    Object obj25 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.k
                                        @Override // kotlin.jvm.functions.a
                                        public final Object invoke() throws Exception {
                                            switch (i13) {
                                                case 0:
                                                    tVar.a(new String[]{"*/*"});
                                                    break;
                                                default:
                                                    tVar.a(new String[]{"*/*"});
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    sVar9.l0(obj25);
                                    obj24 = obj25;
                                }
                                e0.o("Select Local M3U", str9, fVarT, null, (kotlin.jvm.functions.a) obj24, sVar9, 6, 8);
                                w2 w2Var8 = a1VarG16;
                                if (kotlin.text.k.J((String) w2Var8.getValue())) {
                                    strY2 = "Choose .xml or .gz file";
                                } else {
                                    String str10 = (String) w2Var8.getValue();
                                    strY2 = kotlin.text.k.Y(str10, "%2F", str10);
                                }
                                String str11 = strY2;
                                androidx.compose.ui.graphics.vector.f fVarM = _COROUTINE.a.M();
                                androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(oVar5, yVar7);
                                Object objQ14 = sVar9.Q();
                                if (objQ14 == obj19) {
                                    yVar5 = yVar8;
                                    Object v0Var = new v0(yVar5, z2 ? 1 : 0);
                                    sVar9.l0(v0Var);
                                    obj14 = v0Var;
                                } else {
                                    yVar5 = yVar8;
                                    obj14 = objQ14;
                                }
                                androidx.compose.ui.r rVarI = androidx.compose.ui.focus.d.i(rVarK, (kotlin.jvm.functions.l) obj14);
                                final androidx.activity.compose.t tVar2 = tVarH2;
                                boolean zH14 = sVar9.h(tVar2);
                                Object objQ15 = sVar9.Q();
                                Object obj26 = objQ15;
                                if (zH14 || objQ15 == obj19) {
                                    final int i14 = z2 ? 1 : 0;
                                    Object obj27 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.k
                                        @Override // kotlin.jvm.functions.a
                                        public final Object invoke() throws Exception {
                                            switch (i14) {
                                                case 0:
                                                    tVar2.a(new String[]{"*/*"});
                                                    break;
                                                default:
                                                    tVar2.a(new String[]{"*/*"});
                                                    break;
                                            }
                                            return kotlin.y.a;
                                        }
                                    };
                                    sVar9.l0(obj27);
                                    obj26 = obj27;
                                }
                                yVar6 = yVar5;
                                e0.o("Select Local EPG (optional)", str11, fVarM, rVarI, (kotlin.jvm.functions.a) obj26, sVar9, 6, 0);
                                androidx.compose.runtime.s sVar11 = sVar9;
                                sVar11.p(false);
                                yVar3 = yVar7;
                                obj11 = "local";
                                f2 = f4;
                                kVar2 = kVar5;
                                obj13 = obj19;
                                iVar = iVar4;
                                sVar8 = sVar11;
                            } else {
                                sVar9.b0(-1016681786);
                                String str12 = (String) a1VarG4.getValue();
                                boolean zH15 = sVar9.h(kVar5);
                                Object objQ16 = sVar9.Q();
                                if (zH15 || objQ16 == obj19) {
                                    objQ16 = new androidx.compose.foundation.c(1, kVar5, com.app.mlounge.ui.viewmodel.k.class, "setXtreamHost", "setXtreamHost(Ljava/lang/String;)V", 0, 18);
                                    sVar9.l0(objQ16);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ16);
                                androidx.compose.ui.graphics.vector.f fVarB3 = android.support.v4.media.session.b.b;
                                if (fVarB3 != null) {
                                    c3 = 0;
                                    c2 = 0;
                                    z = false;
                                    i6 = 2;
                                    f = 0.0f;
                                } else {
                                    androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Dns", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i15 = h0.a;
                                    p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                                    androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                                    gVar.v(20.0f, 13.0f);
                                    gVar.r(4.0f);
                                    gVar.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                                    gVar.A(6.0f);
                                    gVar.n(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                                    gVar.s(16.0f);
                                    gVar.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                                    gVar.A(-6.0f);
                                    gVar.n(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                                    gVar.l();
                                    gVar.v(7.0f, 19.0f);
                                    gVar.n(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                                    gVar.x(0.9f, -2.0f, 2.0f, -2.0f);
                                    gVar.x(2.0f, 0.9f, 2.0f, 2.0f);
                                    gVar.x(-0.9f, 2.0f, -2.0f, 2.0f);
                                    gVar.l();
                                    gVar.v(20.0f, 3.0f);
                                    gVar.r(4.0f);
                                    gVar.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                                    gVar.A(6.0f);
                                    gVar.n(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                                    gVar.s(16.0f);
                                    gVar.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                                    gVar.z(4.0f);
                                    gVar.n(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                                    gVar.l();
                                    c2 = 0;
                                    gVar.v(7.0f, 9.0f);
                                    gVar.n(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                                    c3 = 0;
                                    gVar.x(0.9f, -2.0f, 2.0f, -2.0f);
                                    gVar.x(2.0f, 0.9f, 2.0f, 2.0f);
                                    gVar.x(-0.9f, 2.0f, -2.0f, 2.0f);
                                    gVar.l();
                                    z = false;
                                    androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.b, 0, p0Var);
                                    fVarB3 = eVar5.b();
                                    android.support.v4.media.session.b.b = fVarB3;
                                    i6 = 2;
                                    f = 0.0f;
                                }
                                yVar3 = yVar7;
                                yVar4 = yVar8;
                                e0.s("Server Host", str12, lVar, fVarB3, androidx.compose.foundation.layout.b.s(oVar5, f4, f, i6), "http://yourserver.com", null, new q0(5, Token.EXPORT), 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05a0: INVOKE 
                                      ("Server Host")
                                      (r3v17 'str12' java.lang.String)
                                      (r4v19 'lVar' kotlin.jvm.functions.l)
                                      (r5v18 'fVarB3' androidx.compose.ui.graphics.vector.f)
                                      (wrap androidx.compose.ui.r:0x0574: INVOKE (r0v1 'oVar5' androidx.compose.ui.o), (r1v7 'f4' float), (r9v12 'f' float), (r2v36 'i6' int) STATIC call: androidx.compose.foundation.layout.b.s(androidx.compose.ui.r, float, float, int):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float, float, int):androidx.compose.ui.r (m), WRAPPED] (LINE:1397))
                                      ("http://yourserver.com")
                                      (null androidx.compose.ui.text.input.g0)
                                      (wrap androidx.compose.foundation.text.q0:0x057f: CONSTRUCTOR (5 int), (wrap int:SGET  A[WRAPPED] org.mozilla.javascript.Token.EXPORT int) A[MD:(int, int):void (m), WRAPPED] (LINE:1408) call: androidx.compose.foundation.text.q0.<init>(int, int):void type: CONSTRUCTOR)
                                      (r6v3 ?? I:??[OBJECT, ARRAY])
                                      (12804102 int)
                                      (64 int)
                                     STATIC call: com.app.mlounge.ui.screens.settings.e0.s(java.lang.String, java.lang.String, kotlin.jvm.functions.l, androidx.compose.ui.graphics.vector.f, androidx.compose.ui.r, java.lang.String, androidx.compose.ui.text.input.g0, androidx.compose.foundation.text.q0, androidx.compose.runtime.s, int, int):void A[MD:(java.lang.String, java.lang.String, kotlin.jvm.functions.l, androidx.compose.ui.graphics.vector.f, androidx.compose.ui.r, java.lang.String, androidx.compose.ui.text.input.g0, androidx.compose.foundation.text.q0, androidx.compose.runtime.s, int, int):void (m)] (LINE:1441) in method: com.app.mlounge.ui.screens.settings.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v3 ??
                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                    */
                                /*
                                    Method dump skipped, instruction units count: 4257
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.settings.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, sVar), sVar, 438, 0);
                    } else {
                        sVar.W();
                    }
                    s1 s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new androidx.compose.foundation.lazy.k(kVar, i, 2);
                    }
                }

                public static final void f(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
                    sVar.c0(367734490);
                    int i2 = i | (sVar.h(pVar) ? 4 : 2);
                    if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
                        Context context = (Context) sVar.j(m0.b);
                        PackageManager packageManager = context.getPackageManager();
                        Object objQ = sVar.Q();
                        if (objQ == androidx.compose.runtime.n.a) {
                            List list = c;
                            ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((f0) it.next()).a);
                            }
                            Set setF0 = kotlin.collections.p.f0(arrayList);
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setType("video/*");
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setType("video/*");
                            intent2.setData(Uri.parse("https://example.com/video.m3u8"));
                            Intent intent3 = new Intent("android.intent.action.VIEW");
                            intent3.setType("video/*");
                            intent3.setData(Uri.parse("file:///sdcard/video.mp4"));
                            List listK = kotlin.collections.q.k(intent, intent2, intent3);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = listK.iterator();
                            while (it2.hasNext()) {
                                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities((Intent) it2.next(), 0);
                                listQueryIntentActivities.getClass();
                                ArrayList arrayList3 = new ArrayList();
                                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                                    String str = resolveInfo.activityInfo.packageName;
                                    kotlin.k kVar = (setF0.contains(str) || kotlin.jvm.internal.l.a(str, context.getPackageName())) ? null : new kotlin.k(str, resolveInfo.loadLabel(packageManager).toString());
                                    if (kVar != null) {
                                        arrayList3.add(kVar);
                                    }
                                }
                                kotlin.collections.p.t(arrayList2, arrayList3);
                            }
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (hashSet.add((String) ((kotlin.k) obj).e)) {
                                    arrayList4.add(obj);
                                }
                            }
                            objQ = kotlin.collections.p.W(arrayList4, new androidx.constraintlayout.core.e(15));
                            sVar.l0(objQ);
                        }
                        androidx.compose.material3.q.a(aVar, androidx.compose.runtime.internal.k.c(-506329310, new com.app.mlounge.ui.components.h(5, aVar), sVar), null, null, b.l, androidx.compose.runtime.internal.k.c(843571047, new androidx.compose.foundation.contextmenu.f(27, (List) objQ, pVar), sVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, sVar, 1769526, 0, 16028);
                    } else {
                        sVar.W();
                    }
                    s1 s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new w(pVar, aVar, i, 0);
                    }
                }

                public static final void g(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
                    sVar.c0(943054088);
                    int i2 = i | (sVar.h(pVar) ? 4 : 2);
                    if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
                        Context context = (Context) sVar.j(m0.b);
                        PackageManager packageManager = context.getPackageManager();
                        androidx.compose.material3.q.a(aVar, androidx.compose.runtime.internal.k.c(576413520, new com.app.mlounge.ui.components.h(7, aVar), sVar), null, null, b.n, androidx.compose.runtime.internal.k.c(186462165, new b2(17, pVar, packageManager, context), sVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, sVar, 1769526, 0, 16028);
                    } else {
                        sVar.W();
                    }
                    s1 s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new w(pVar, aVar, i, 1);
                    }
                }

                public static final void h(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, androidx.compose.runtime.s sVar, int i) {
                    sVar.c0(-1638198208);
                    int i2 = i | (sVar.h(pVar) ? 4 : 2);
                    if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                        Context context = (Context) sVar.j(m0.b);
                        PackageManager packageManager = context.getPackageManager();
                        androidx.compose.material3.q.a(aVar2, androidx.compose.runtime.internal.k.c(1670889608, new com.app.mlounge.ui.components.h(6, aVar2), sVar), null, null, b.j, androidx.compose.runtime.internal.k.c(-2091230899, new androidx.compose.foundation.text.contextmenu.provider.d(aVar, pVar, packageManager, context, 5), sVar), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, sVar, 1769526, 0, 16028);
                    } else {
                        sVar.W();
                    }
                    s1 s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new b2(pVar, aVar, aVar2, i, 16);
                    }
                }

                public static final void i(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
                    androidx.compose.runtime.s sVar2;
                    Object obj;
                    boolean z;
                    Context context;
                    androidx.compose.runtime.f fVar;
                    androidx.compose.runtime.s sVar3;
                    a1 a1Var;
                    File externalStorageDirectory;
                    File[] fileArrListFiles;
                    File file;
                    sVar.c0(-1623262251);
                    int i2 = i | (sVar.h(lVar) ? 4 : 2);
                    if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
                        final Context context2 = (Context) sVar.j(m0.b);
                        Object objQ = sVar.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                        if (objQ == fVar2) {
                            ArrayList arrayList = new ArrayList();
                            File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
                            if (externalStorageDirectory2.exists()) {
                                obj = objQ;
                                arrayList.add(new kotlin.k(externalStorageDirectory2, "Internal"));
                            }
                            obj = objQ;
                            Object systemService = context2.getSystemService("storage");
                            systemService.getClass();
                            List<StorageVolume> storageVolumes = ((StorageManager) systemService).getStorageVolumes();
                            storageVolumes.getClass();
                            for (StorageVolume storageVolume : storageVolumes) {
                                if (!storageVolume.isPrimary()) {
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        file = storageVolume.getDirectory();
                                    } else {
                                        try {
                                            Object objInvoke = storageVolume.getClass().getMethod("getPath", null).invoke(storageVolume, null);
                                            objInvoke.getClass();
                                            file = new File((String) objInvoke);
                                        } catch (Exception unused) {
                                            file = null;
                                        }
                                    }
                                    if (file != null && file.exists() && file.canRead()) {
                                        String description = storageVolume.getDescription(context2);
                                        if (description == null) {
                                            description = "External Drive";
                                        }
                                        if (!arrayList.isEmpty()) {
                                            Iterator it = arrayList.iterator();
                                            do {
                                                if (it.hasNext()) {
                                                }
                                            } while (!kotlin.jvm.internal.l.a(((File) ((kotlin.k) it.next()).e).getAbsolutePath(), file.getAbsolutePath()));
                                        }
                                        arrayList.add(new kotlin.k(file, description));
                                        break;
                                    }
                                }
                            }
                            if (arrayList.size() <= 1 && (fileArrListFiles = new File("/storage").listFiles()) != null) {
                                for (File file2 : fileArrListFiles) {
                                    if (file2.isDirectory() && file2.canRead() && !kotlin.jvm.internal.l.a(file2.getName(), "emulated") && !kotlin.jvm.internal.l.a(file2.getName(), "self")) {
                                        if (arrayList.isEmpty()) {
                                            arrayList.add(new kotlin.k(file2, file2.getName()));
                                            break;
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        do {
                                            if (!it2.hasNext()) {
                                                arrayList.add(new kotlin.k(file2, file2.getName()));
                                                break;
                                                break;
                                            }
                                        } while (!kotlin.jvm.internal.l.a(((File) ((kotlin.k) it2.next()).e).getAbsolutePath(), file2.getAbsolutePath()));
                                    }
                                }
                            }
                            sVar.l0(arrayList);
                            obj = arrayList;
                        }
                        obj = objQ;
                        List list = (List) obj;
                        Object objQ2 = sVar.Q();
                        if (objQ2 == fVar2) {
                            kotlin.k kVar = (kotlin.k) kotlin.collections.p.D(list);
                            if (kVar == null || (externalStorageDirectory = (File) kVar.e) == null) {
                                externalStorageDirectory = Environment.getExternalStorageDirectory();
                            }
                            objQ2 = androidx.compose.runtime.t.r(externalStorageDirectory);
                            sVar.l0(objQ2);
                        }
                        final a1 a1Var2 = (a1) objQ2;
                        Object objQ3 = sVar.Q();
                        if (objQ3 == fVar2) {
                            objQ3 = androidx.compose.runtime.t.r(kotlin.collections.w.e);
                            sVar.l0(objQ3);
                        }
                        a1 a1Var3 = (a1) objQ3;
                        Object objQ4 = sVar.Q();
                        if (objQ4 == fVar2) {
                            objQ4 = new g1(0);
                            sVar.l0(objQ4);
                        }
                        final g1 g1Var = (g1) objQ4;
                        Object objQ5 = sVar.Q();
                        if (objQ5 == fVar2) {
                            objQ5 = androidx.compose.runtime.t.r(Boolean.FALSE);
                            sVar.l0(objQ5);
                        }
                        a1 a1Var4 = (a1) objQ5;
                        Object objQ6 = sVar.Q();
                        if (objQ6 == fVar2) {
                            objQ6 = androidx.compose.runtime.t.r("");
                            sVar.l0(objQ6);
                        }
                        final a1 a1Var5 = (a1) objQ6;
                        Object objQ7 = sVar.Q();
                        if (objQ7 == fVar2) {
                            objQ7 = androidx.compose.runtime.t.r(null);
                            sVar.l0(objQ7);
                        }
                        a1 a1Var6 = (a1) objQ7;
                        androidx.activity.result.contract.b bVar = new androidx.activity.result.contract.b(3);
                        boolean zH = sVar.h(context2);
                        Object objQ8 = sVar.Q();
                        if (zH || objQ8 == fVar2) {
                            final int i3 = 0;
                            kotlin.jvm.functions.l lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.c0
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    switch (i3) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                            Context context3 = context2;
                                            a1 a1Var7 = a1Var5;
                                            if (zBooleanValue && ((String) a1Var7.getValue()).length() > 0) {
                                                a1 a1Var8 = a1Var2;
                                                File file3 = new File((File) a1Var8.getValue(), (String) a1Var7.getValue());
                                                if (file3.mkdirs() || file3.isDirectory()) {
                                                    a1Var8.setValue(file3);
                                                    g1 g1Var2 = g1Var;
                                                    g1Var2.h(g1Var2.g() + 1);
                                                } else {
                                                    Toast.makeText(context3, "Could not create folder", 0).show();
                                                }
                                                a1Var7.setValue("");
                                            } else if (!zBooleanValue) {
                                                Toast.makeText(context3, "Storage permission required to create folders", 0).show();
                                                a1Var7.setValue("");
                                            }
                                            break;
                                        default:
                                            e0.c(context2, a1Var5, a1Var2, g1Var, (androidx.activity.result.a) obj2);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar.l0(lVar2);
                            objQ8 = lVar2;
                        }
                        androidx.activity.compose.t tVarH = _COROUTINE.b.H(bVar, (kotlin.jvm.functions.l) objQ8, sVar, 0);
                        androidx.activity.result.contract.b bVar2 = new androidx.activity.result.contract.b(4);
                        boolean zH2 = sVar.h(context2);
                        Object objQ9 = sVar.Q();
                        if (zH2 || objQ9 == fVar2) {
                            final int i4 = 1;
                            objQ9 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.c0
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    switch (i4) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                            Context context3 = context2;
                                            a1 a1Var7 = a1Var5;
                                            if (zBooleanValue && ((String) a1Var7.getValue()).length() > 0) {
                                                a1 a1Var8 = a1Var2;
                                                File file3 = new File((File) a1Var8.getValue(), (String) a1Var7.getValue());
                                                if (file3.mkdirs() || file3.isDirectory()) {
                                                    a1Var8.setValue(file3);
                                                    g1 g1Var2 = g1Var;
                                                    g1Var2.h(g1Var2.g() + 1);
                                                } else {
                                                    Toast.makeText(context3, "Could not create folder", 0).show();
                                                }
                                                a1Var7.setValue("");
                                            } else if (!zBooleanValue) {
                                                Toast.makeText(context3, "Storage permission required to create folders", 0).show();
                                                a1Var7.setValue("");
                                            }
                                            break;
                                        default:
                                            e0.c(context2, a1Var5, a1Var2, g1Var, (androidx.activity.result.a) obj2);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar.l0(objQ9);
                        }
                        androidx.activity.compose.t tVarH2 = _COROUTINE.b.H(bVar2, (kotlin.jvm.functions.l) objQ9, sVar, 0);
                        androidx.activity.result.contract.b bVar3 = new androidx.activity.result.contract.b(1);
                        boolean zH3 = ((i2 & 14) == 4) | sVar.h(context2);
                        Object objQ10 = sVar.Q();
                        if (zH3 || objQ10 == fVar2) {
                            objQ10 = new com.app.mlounge.ui.screens.player.s(2, context2, lVar);
                            sVar.l0(objQ10);
                        }
                        androidx.activity.compose.t tVarH3 = _COROUTINE.b.H(bVar3, (kotlin.jvm.functions.l) objQ10, sVar, 0);
                        File file3 = (File) a1Var2.getValue();
                        Integer numValueOf = Integer.valueOf(g1Var.g());
                        Object objQ11 = sVar.Q();
                        if (objQ11 == fVar2) {
                            objQ11 = new androidx.compose.foundation.text.input.internal.k(a1Var2, a1Var3, null, 13);
                            sVar.l0(objQ11);
                        }
                        l0.d(file3, numValueOf, (kotlin.jvm.functions.p) objQ11, sVar);
                        boolean zF = sVar.f((File) a1Var2.getValue());
                        Object objQ12 = sVar.Q();
                        if (zF || objQ12 == fVar2) {
                            try {
                                StatFs statFs = new StatFs(((File) a1Var2.getValue()).getAbsolutePath());
                                long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                                objQ12 = availableBlocksLong < 1048576 ? (availableBlocksLong / ((long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) + " KB free" : availableBlocksLong < 1073741824 ? String.format(Locale.US, "%.1f MB free", Arrays.copyOf(new Object[]{Double.valueOf(availableBlocksLong / 1048576.0d)}, 1)) : String.format(Locale.US, "%.1f GB free", Arrays.copyOf(new Object[]{Double.valueOf(availableBlocksLong / 1.073741824E9d)}, 1));
                            } catch (Exception unused2) {
                                objQ12 = "";
                            }
                            sVar.l0(objQ12);
                        }
                        androidx.compose.runtime.s sVar4 = sVar;
                        t1.a(aVar, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(1667885598, new com.app.mlounge.ui.components.l0((String) objQ12, list, aVar, a1Var4, a1Var2, a1Var6, a1Var3, lVar), sVar), sVar4, 438, 0);
                        if (((kotlin.k) a1Var6.getValue()) != null) {
                            sVar4.b0(-1552940510);
                            kotlin.k kVar2 = (kotlin.k) a1Var6.getValue();
                            kVar2.getClass();
                            long j = com.app.mlounge.ui.theme.b.d;
                            Object objQ13 = sVar4.Q();
                            if (objQ13 == fVar2) {
                                objQ13 = new q(a1Var6, 17);
                                sVar4.l0(objQ13);
                            }
                            context = context2;
                            fVar = fVar2;
                            androidx.compose.material3.q.a((kotlin.jvm.functions.a) objQ13, androidx.compose.runtime.internal.k.c(-999182302, new androidx.compose.foundation.contextmenu.f(29, tVarH3, a1Var6), sVar4), null, androidx.compose.runtime.internal.k.c(1507915172, new androidx.compose.material3.m(a1Var6, 10), sVar4), b.v, androidx.compose.runtime.internal.k.c(-1173889561, new g0(kVar2, 25), sVar4), null, j, 0L, 0L, 0L, 0.0f, null, sVar, 1772598, 0, 16020);
                            androidx.compose.runtime.s sVar5 = sVar;
                            z = false;
                            sVar5.p(false);
                            sVar3 = sVar5;
                        } else {
                            z = false;
                            context = context2;
                            fVar = fVar2;
                            sVar4.b0(-1551945875);
                            sVar4.p(false);
                            sVar3 = sVar4;
                        }
                        if (((Boolean) a1Var4.getValue()).booleanValue()) {
                            sVar3.b0(-1551861834);
                            Object objQ14 = sVar3.Q();
                            androidx.compose.runtime.f fVar3 = fVar;
                            if (objQ14 == fVar3) {
                                objQ14 = androidx.compose.runtime.t.r("");
                                sVar3.l0(objQ14);
                            }
                            a1 a1Var7 = (a1) objQ14;
                            long j2 = com.app.mlounge.ui.theme.b.b;
                            Object objQ15 = sVar3.Q();
                            if (objQ15 == fVar3) {
                                a1Var = a1Var4;
                                objQ15 = new q(a1Var, 18);
                                sVar3.l0(objQ15);
                            } else {
                                a1Var = a1Var4;
                            }
                            androidx.compose.material3.q.a((kotlin.jvm.functions.a) objQ15, androidx.compose.runtime.internal.k.c(-1516001141, new com.app.mlounge.ui.components.l0(context, tVarH2, tVarH, a1Var7, a1Var2, a1Var5, a1Var, g1Var), sVar3), null, androidx.compose.runtime.internal.k.c(-1671981683, new androidx.compose.material3.m(a1Var, 8), sVar3), b.y, androidx.compose.runtime.internal.k.c(-1905952496, new androidx.compose.material3.m(a1Var7, 9), sVar3), null, j2, 0L, 0L, 0L, 0.0f, null, sVar, 1772598, 0, 16020);
                            androidx.compose.runtime.s sVar6 = sVar;
                            sVar6.p(false);
                            sVar2 = sVar6;
                        } else {
                            sVar3.b0(-1550209875);
                            sVar3.p(z);
                            sVar2 = sVar3;
                        }
                    } else {
                        androidx.compose.runtime.s sVar7 = sVar;
                        sVar7.W();
                        sVar2 = sVar7;
                    }
                    s1 s1VarT = sVar2.t();
                    if (s1VarT != null) {
                        s1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, aVar, i, 28);
                    }
                }

                public static final void j(String str, androidx.compose.ui.graphics.vector.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
                    int i2;
                    androidx.compose.runtime.s sVar2 = sVar;
                    sVar2.c0(1083507135);
                    if ((i & 6) == 0) {
                        i2 = (sVar2.f(str) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    int i3 = i2 | (sVar2.f(fVar) ? 32 : 16);
                    if ((i & 384) == 0) {
                        i3 |= sVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128;
                    }
                    if (sVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                        Object objQ = sVar2.Q();
                        if (objQ == androidx.compose.runtime.n.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        float f = 12;
                        androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(androidx.compose.foundation.s.g(i1.e(oVar, 1.0f), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8)), kVar, null, false, null, aVar, 28), kVar, 1), f, 10);
                        f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                        int iHashCode = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL = sVar2.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarR);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                        q1.b(fVar, null, i1.m(oVar, 22), com.app.mlounge.ui.theme.b.f, sVar2, ((i3 >> 3) & 14) | 432, 0);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, f));
                        z5.b(str, null, androidx.compose.ui.graphics.t.d, coil3.svg.internal.a.x(14), null, 0L, null, 0L, 0, false, 1, 0, null, sVar, (i3 & 14) | 24960, 24576, 245738);
                        sVar2 = sVar;
                        sVar2.p(true);
                    } else {
                        sVar2.W();
                    }
                    s1 s1VarT = sVar2.t();
                    if (s1VarT != null) {
                        s1VarT.d = new androidx.compose.foundation.contextmenu.j(str, fVar, aVar, i, 11);
                    }
                }

                public static final void k(final String str, final boolean z, androidx.compose.ui.r rVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
                    int i3;
                    androidx.compose.ui.r rVar2;
                    int i4;
                    final androidx.compose.ui.r rVar3;
                    long j;
                    sVar.c0(418683773);
                    if ((i & 6) == 0) {
                        i3 = i | (sVar.f(str) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= sVar.g(z) ? 32 : 16;
                    }
                    int i5 = i2 & 4;
                    if (i5 != 0) {
                        i4 = i3 | 384;
                        rVar2 = rVar;
                    } else {
                        rVar2 = rVar;
                        i4 = i3 | (sVar.f(rVar2) ? LibretroCore.SCREEN_WIDTH : 128);
                    }
                    int i6 = i4 | (sVar.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    if (sVar.T(i6 & 1, (i6 & 1171) != 1170)) {
                        androidx.compose.ui.r rVar4 = i5 != 0 ? androidx.compose.ui.o.b : rVar2;
                        Object objQ = sVar.Q();
                        if (objQ == androidx.compose.runtime.n.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        float f = 2;
                        if (((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue()) {
                            j = com.app.mlounge.ui.theme.b.q;
                        } else {
                            j = z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.h;
                        }
                        float f2 = 8;
                        p5.b(aVar, androidx.compose.foundation.s.g(rVar4, f, j, androidx.compose.foundation.shape.e.a(f2)), false, androidx.compose.foundation.shape.e.a(f2), z ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, null, kVar, androidx.compose.runtime.internal.k.c(1584325778, new com.app.mlounge.ui.screens.adult.c(3, str, z), sVar), sVar, ((i6 >> 9) & 14) | 805306368, 484);
                        rVar3 = rVar4;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                    }
                    s1 s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.p
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                e0.k(str, z, rVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }

                /* JADX WARN: Code duplicated, block: B:109:0x03e7  */
                /* JADX WARN: Code duplicated, block: B:110:0x03eb  */
                /* JADX WARN: Code duplicated, block: B:113:0x0403  */
                /* JADX WARN: Code duplicated, block: B:114:0x0407  */
                /* JADX WARN: Code duplicated, block: B:117:0x0489  */
                /* JADX WARN: Code duplicated, block: B:119:0x0491  */
                /* JADX WARN: Code duplicated, block: B:124:0x04de  */
                /* JADX WARN: Code duplicated, block: B:127:0x04f2  */
                /* JADX WARN: Code duplicated, block: B:128:0x04f4  */
                /* JADX WARN: Code duplicated, block: B:134:0x0501  */
                /* JADX WARN: Code duplicated, block: B:137:0x053f  */
                /* JADX WARN: Code duplicated, block: B:138:0x0543  */
                /* JADX WARN: Code duplicated, block: B:142:0x055d  */
                /* JADX WARN: Code duplicated, block: B:144:0x05f0  */
                /* JADX WARN: Code duplicated, block: B:146:0x05f5  */
                public static final void l(final com.app.mlounge.ui.navigation.w wVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, androidx.compose.runtime.s sVar, final int i) {
                    kotlin.jvm.functions.a aVar4;
                    androidx.compose.runtime.s sVar2;
                    long j;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    androidx.compose.ui.o oVar;
                    androidx.compose.ui.node.f fVar;
                    androidx.compose.runtime.f fVar2;
                    androidx.compose.ui.graphics.vector.f fVarB;
                    long j2;
                    long jB;
                    long j3;
                    boolean z8;
                    Object objQ;
                    androidx.compose.ui.graphics.vector.f fVarB2;
                    long jB2;
                    sVar.c0(2024860169);
                    int i2 = i | (sVar.f(wVar) ? 4 : 2) | (sVar.g(z) ? 32 : 16) | (sVar.g(z2) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.g(z3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.g(z4) ? 16384 : 8192) | (sVar.h(aVar) ? 131072 : Parser.ARGC_LIMIT) | (sVar.h(aVar2) ? 1048576 : 524288) | (sVar.h(aVar3) ? 8388608 : 4194304);
                    if (sVar.T(i2 & 1, (i2 & 4793491) != 4793490)) {
                        Object objQ2 = sVar.Q();
                        androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                        if (objQ2 == fVar3) {
                            objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
                        a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
                        Object objQ3 = sVar.Q();
                        if (objQ3 == fVar3) {
                            objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ3;
                        a1 a1VarB2 = _COROUTINE.a.B(kVar2, sVar, 6);
                        Object objQ4 = sVar.Q();
                        if (objQ4 == fVar3) {
                            objQ4 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ4;
                        a1 a1VarB3 = _COROUTINE.a.B(kVar3, sVar, 6);
                        float f = (!z2 || z) ? 1.0f : 0.4f;
                        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                        float f2 = 4;
                        androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(i1.e(oVar2, 1.0f), 16, f2);
                        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                        androidx.compose.foundation.layout.t tVar = androidx.compose.foundation.layout.h.a;
                        f1 f1VarA = d1.a(tVar, iVar, sVar, 48);
                        int iHashCode = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL = sVar.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarR);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar4);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                        androidx.compose.runtime.t.x(sVar, f1VarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                        androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                        androidx.compose.runtime.t.p(sVar, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        androidx.compose.runtime.t.t(sVar, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                        androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
                        androidx.compose.foundation.layout.g1 g1Var = androidx.compose.foundation.layout.g1.a;
                        float f3 = 2;
                        float f4 = 8;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.g1.a(g1Var, oVar2, 1.0f), f3, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4));
                        boolean z9 = (i2 & 458752) == 131072;
                        Object objQ5 = sVar.Q();
                        if (z9 || objQ5 == fVar3) {
                            objQ5 = new x2(20, aVar);
                            sVar.l0(objQ5);
                        }
                        androidx.compose.ui.r rVarR2 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.m(androidx.compose.foundation.s.j(rVarG, kVar, null, z2, null, (kotlin.jvm.functions.a) objQ5, 24), z2, kVar), f4, f4);
                        f1 f1VarA2 = d1.a(tVar, iVar, sVar, 48);
                        int iHashCode2 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarR2);
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar4);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.runtime.t.x(sVar, f1VarA2, eVar);
                        androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                        androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
                        androidx.compose.ui.graphics.vector.f fVar5 = wVar.c;
                        long j4 = com.app.mlounge.ui.theme.b.m;
                        float f5 = f;
                        float f6 = 20;
                        q1.b(fVar5, null, i1.m(oVar2, f6), androidx.compose.ui.graphics.t.b(f5, j4), sVar, 432, 0);
                        androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar2, 12));
                        androidx.compose.ui.r rVarA = androidx.compose.foundation.layout.g1.a(g1Var, oVar2, 1.0f);
                        androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                        int iHashCode3 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar, rVarA);
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar4);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.runtime.t.x(sVar, wVarA, eVar);
                        androidx.compose.runtime.t.x(sVar, jVarL3, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar3, sVar, dVar);
                        androidx.compose.runtime.t.x(sVar, rVarC3, eVar4);
                        String str = wVar.b;
                        androidx.compose.runtime.x2 x2Var = n6.a;
                        z5.b(str, null, androidx.compose.ui.graphics.t.b(f5, com.app.mlounge.ui.theme.b.l), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).k, sVar, 0, 0, 131066);
                        sVar2 = sVar;
                        if (z2) {
                            sVar2.b0(-241003836);
                            androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var)).l;
                            j = j4;
                            z5.b("Show in sidebar", null, androidx.compose.ui.graphics.t.b(f5, j), 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 6, 0, 131066);
                            z5 = false;
                            sVar2.p(false);
                        } else {
                            j = j4;
                            z5 = false;
                            sVar2.b0(-240783209);
                            sVar2.p(false);
                        }
                        sVar2.p(true);
                        if (z2) {
                            sVar2.b0(-1844454645);
                            long j5 = com.app.mlounge.ui.theme.b.f;
                            z7 = true;
                            oVar = oVar2;
                            sVar2 = sVar;
                            z6 = z5;
                            fVar = fVar4;
                            t5.a(z, null, null, false, androidx.compose.material3.q.l(j5, androidx.compose.ui.graphics.t.b(0.3f, j5), com.app.mlounge.ui.theme.b.n, com.app.mlounge.ui.theme.b.c, 0L, 0L, 0L, 0L, sVar2, 65484), sVar2, ((i2 >> 3) & 14) | 48, 92);
                            sVar2.p(z6);
                        } else {
                            z6 = z5;
                            z7 = true;
                            oVar = oVar2;
                            fVar = fVar4;
                            sVar2.b0(-1844002975);
                            sVar2.p(z6);
                        }
                        sVar2.p(z7);
                        androidx.compose.ui.o oVar3 = oVar;
                        androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar3, f2));
                        float f7 = 32;
                        androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(i1.m(oVar3, f7), f3, (!((Boolean) a1VarB2.getValue()).booleanValue() || z3) ? androidx.compose.ui.graphics.t.h : com.app.mlounge.ui.theme.b.q, androidx.compose.foundation.shape.e.a(f4));
                        boolean z10 = !z3;
                        boolean z11 = (i2 & 3670016) == 1048576 ? true : z6;
                        Object objQ6 = sVar2.Q();
                        if (z11) {
                            fVar2 = fVar3;
                        } else {
                            fVar2 = fVar3;
                            if (objQ6 == fVar2) {
                            }
                            androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.j(rVarG2, kVar2, null, z10, null, (kotlin.jvm.functions.a) objQ6, 24), z10, kVar2);
                            androidx.compose.ui.j jVar = androidx.compose.ui.c.B;
                            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar, z6);
                            int iHashCode4 = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL4 = sVar2.l();
                            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar2, rVarM);
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(fVar);
                            } else {
                                sVar2.o0();
                            }
                            androidx.compose.runtime.t.x(sVar2, q0VarD, eVar);
                            androidx.compose.runtime.t.x(sVar2, jVarL4, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar2, eVar3, sVar2, dVar);
                            androidx.compose.runtime.t.x(sVar2, rVarC4, eVar4);
                            fVarB = kotlin.math.a.A;
                            if (fVarB != null) {
                                androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i3 = h0.a;
                                p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                                ArrayList arrayList = new ArrayList(32);
                                arrayList.add(new androidx.compose.ui.graphics.vector.o(7.41f, 15.41f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.n(12.0f, 10.83f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.v(4.59f, 4.58f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.n(18.0f, 14.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.v(-6.0f, -6.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.v(-6.0f, 6.0f));
                                arrayList.add(androidx.compose.ui.graphics.vector.k.c);
                                androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList, 0, p0Var);
                                fVarB = eVar5.b();
                                kotlin.math.a.A = fVarB;
                            }
                            j2 = j;
                            if (z3) {
                                jB = androidx.compose.ui.graphics.t.b(0.3f, j2);
                            } else {
                                jB = j2;
                            }
                            androidx.compose.runtime.f fVar6 = fVar2;
                            q1.b(fVarB, "Move up", i1.m(oVar3, f6), jB, sVar2, 432, 0);
                            sVar2.p(true);
                            androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar3, f3));
                            androidx.compose.ui.r rVarM2 = i1.m(oVar3, f7);
                            if (((Boolean) a1VarB3.getValue()).booleanValue() || z4) {
                                j3 = androidx.compose.ui.graphics.t.h;
                            } else {
                                j3 = com.app.mlounge.ui.theme.b.q;
                            }
                            androidx.compose.ui.r rVarG3 = androidx.compose.foundation.s.g(rVarM2, f3, j3, androidx.compose.foundation.shape.e.a(f4));
                            boolean z12 = !z4;
                            if ((i2 & 29360128) == 8388608) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            objQ = sVar2.Q();
                            if (!z8 || objQ == fVar6) {
                                aVar4 = aVar3;
                                objQ = new x2(22, aVar4);
                                sVar2.l0(objQ);
                            } else {
                                aVar4 = aVar3;
                            }
                            androidx.compose.ui.r rVarM3 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.j(rVarG3, kVar3, null, z12, null, (kotlin.jvm.functions.a) objQ, 24), z12, kVar3);
                            androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(jVar, false);
                            int iHashCode5 = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL5 = sVar2.l();
                            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar2, rVarM3);
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(fVar);
                            } else {
                                sVar2.o0();
                            }
                            androidx.compose.runtime.t.x(sVar2, q0VarD2, eVar);
                            androidx.compose.runtime.t.x(sVar2, jVarL5, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar2, eVar3, sVar2, dVar);
                            androidx.compose.runtime.t.x(sVar2, rVarC5, eVar4);
                            fVarB2 = com.imsdk.a.d;
                            if (fVarB2 == null) {
                                androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i4 = h0.a;
                                p0 p0Var2 = new p0(androidx.compose.ui.graphics.t.b);
                                ArrayList arrayList2 = new ArrayList(32);
                                arrayList2.add(new androidx.compose.ui.graphics.vector.o(7.41f, 8.59f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.n(12.0f, 13.17f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.v(4.59f, -4.58f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.n(18.0f, 10.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.v(-6.0f, 6.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.v(-6.0f, -6.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.v(1.41f, -1.41f));
                                arrayList2.add(androidx.compose.ui.graphics.vector.k.c);
                                androidx.compose.ui.graphics.vector.e.a(eVar6, arrayList2, 0, p0Var2);
                                fVarB2 = eVar6.b();
                                com.imsdk.a.d = fVarB2;
                            }
                            androidx.compose.ui.graphics.vector.f fVar7 = fVarB2;
                            if (z4) {
                                jB2 = androidx.compose.ui.graphics.t.b(0.3f, j2);
                            } else {
                                jB2 = j2;
                            }
                            q1.b(fVar7, "Move down", i1.m(oVar3, f6), jB2, sVar2, 432, 0);
                            sVar2.p(true);
                            sVar2.p(true);
                        }
                        objQ6 = new x2(21, aVar2);
                        sVar2.l0(objQ6);
                        androidx.compose.ui.r rVarM4 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.j(rVarG2, kVar2, null, z10, null, (kotlin.jvm.functions.a) objQ6, 24), z10, kVar2);
                        androidx.compose.ui.j jVar2 = androidx.compose.ui.c.B;
                        androidx.compose.ui.layout.q0 q0VarD3 = androidx.compose.foundation.layout.p.d(jVar2, z6);
                        int iHashCode6 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL6 = sVar2.l();
                        androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(sVar2, rVarM4);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, q0VarD3, eVar);
                        androidx.compose.runtime.t.x(sVar2, jVarL6, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, sVar2, eVar3, sVar2, dVar);
                        androidx.compose.runtime.t.x(sVar2, rVarC6, eVar4);
                        fVarB = kotlin.math.a.A;
                        if (fVarB != null) {
                            androidx.compose.ui.graphics.vector.e eVar7 = new androidx.compose.ui.graphics.vector.e("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i5 = h0.a;
                            p0 p0Var3 = new p0(androidx.compose.ui.graphics.t.b);
                            ArrayList arrayList3 = new ArrayList(32);
                            arrayList3.add(new androidx.compose.ui.graphics.vector.o(7.41f, 15.41f));
                            arrayList3.add(new androidx.compose.ui.graphics.vector.n(12.0f, 10.83f));
                            arrayList3.add(new androidx.compose.ui.graphics.vector.v(4.59f, 4.58f));
                            arrayList3.add(new androidx.compose.ui.graphics.vector.n(18.0f, 14.0f));
                            arrayList3.add(new androidx.compose.ui.graphics.vector.v(-6.0f, -6.0f));
                            arrayList3.add(new androidx.compose.ui.graphics.vector.v(-6.0f, 6.0f));
                            arrayList3.add(androidx.compose.ui.graphics.vector.k.c);
                            androidx.compose.ui.graphics.vector.e.a(eVar7, arrayList3, 0, p0Var3);
                            fVarB = eVar7.b();
                            kotlin.math.a.A = fVarB;
                        }
                        j2 = j;
                        if (z3) {
                            jB = j2;
                        } else {
                            jB = androidx.compose.ui.graphics.t.b(0.3f, j2);
                        }
                        androidx.compose.runtime.f fVar8 = fVar2;
                        q1.b(fVarB, "Move up", i1.m(oVar3, f6), jB, sVar2, 432, 0);
                        sVar2.p(true);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar3, f3));
                        androidx.compose.ui.r rVarM5 = i1.m(oVar3, f7);
                        if (((Boolean) a1VarB3.getValue()).booleanValue()) {
                            j3 = androidx.compose.ui.graphics.t.h;
                        } else {
                            j3 = androidx.compose.ui.graphics.t.h;
                        }
                        androidx.compose.ui.r rVarG4 = androidx.compose.foundation.s.g(rVarM5, f3, j3, androidx.compose.foundation.shape.e.a(f4));
                        boolean z13 = !z4;
                        if ((i2 & 29360128) == 8388608) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objQ = sVar2.Q();
                        if (z8) {
                            aVar4 = aVar3;
                            objQ = new x2(22, aVar4);
                            sVar2.l0(objQ);
                        } else {
                            aVar4 = aVar3;
                            objQ = new x2(22, aVar4);
                            sVar2.l0(objQ);
                        }
                        androidx.compose.ui.r rVarM6 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.j(rVarG4, kVar3, null, z13, null, (kotlin.jvm.functions.a) objQ, 24), z13, kVar3);
                        androidx.compose.ui.layout.q0 q0VarD4 = androidx.compose.foundation.layout.p.d(jVar2, false);
                        int iHashCode7 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL7 = sVar2.l();
                        androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(sVar2, rVarM6);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, q0VarD4, eVar);
                        androidx.compose.runtime.t.x(sVar2, jVarL7, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode7, sVar2, eVar3, sVar2, dVar);
                        androidx.compose.runtime.t.x(sVar2, rVarC7, eVar4);
                        fVarB2 = com.imsdk.a.d;
                        if (fVarB2 == null) {
                            androidx.compose.ui.graphics.vector.e eVar8 = new androidx.compose.ui.graphics.vector.e("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i6 = h0.a;
                            p0 p0Var4 = new p0(androidx.compose.ui.graphics.t.b);
                            ArrayList arrayList4 = new ArrayList(32);
                            arrayList4.add(new androidx.compose.ui.graphics.vector.o(7.41f, 8.59f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.n(12.0f, 13.17f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.v(4.59f, -4.58f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.n(18.0f, 10.0f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.v(-6.0f, 6.0f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.v(-6.0f, -6.0f));
                            arrayList4.add(new androidx.compose.ui.graphics.vector.v(1.41f, -1.41f));
                            arrayList4.add(androidx.compose.ui.graphics.vector.k.c);
                            androidx.compose.ui.graphics.vector.e.a(eVar8, arrayList4, 0, p0Var4);
                            fVarB2 = eVar8.b();
                            com.imsdk.a.d = fVarB2;
                        }
                        androidx.compose.ui.graphics.vector.f fVar9 = fVarB2;
                        if (z4) {
                            jB2 = j2;
                        } else {
                            jB2 = androidx.compose.ui.graphics.t.b(0.3f, j2);
                        }
                        q1.b(fVar9, "Move down", i1.m(oVar3, f6), jB2, sVar2, 432, 0);
                        sVar2.p(true);
                        sVar2.p(true);
                    } else {
                        aVar4 = aVar3;
                        sVar2 = sVar;
                        sVar2.W();
                    }
                    s1 s1VarT = sVar2.t();
                    if (s1VarT != null) {
                        final kotlin.jvm.functions.a aVar5 = aVar4;
                        s1VarT.d = new kotlin.jvm.functions.p(z, z2, z3, z4, aVar, aVar2, aVar5, i) { // from class: com.app.mlounge.ui.screens.settings.l
                            public final /* synthetic */ boolean A;
                            public final /* synthetic */ boolean B;
                            public final /* synthetic */ kotlin.jvm.functions.a C;
                            public final /* synthetic */ kotlin.jvm.functions.a D;
                            public final /* synthetic */ kotlin.jvm.functions.a E;
                            public final /* synthetic */ boolean y;
                            public final /* synthetic */ boolean z;

                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = androidx.compose.runtime.t.A(1);
                                e0.l(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (androidx.compose.runtime.s) obj, iA);
                                return kotlin.y.a;
                            }
                        };
                    }
                }

                public static final void m(float f, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
                    Object obj;
                    androidx.compose.runtime.s sVar2 = sVar;
                    sVar2.c0(851347622);
                    int i2 = i | (sVar2.c(f) ? 4 : 2) | (sVar2.h(lVar) ? 32 : 16);
                    if (sVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                        List listK = kotlin.collections.q.k(new kotlin.k(Float.valueOf(0.1f), "Very Low (10%)"), new kotlin.k(Float.valueOf(0.25f), "Low (25%)"), new kotlin.k(Float.valueOf(0.4f), "Medium-Low (40%)"), new kotlin.k(Float.valueOf(0.5f), "Medium (50%)"), new kotlin.k(Float.valueOf(0.65f), "Medium-High (65%)"), new kotlin.k(Float.valueOf(0.8f), "High (80%)"), new kotlin.k(Float.valueOf(1.0f), "Full (100%)"));
                        Iterator it = listK.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (it.hasNext()) {
                                float fAbs = Math.abs(((Number) ((kotlin.k) next).e).floatValue() - f);
                                while (true) {
                                    Object next2 = it.next();
                                    float fAbs2 = Math.abs(((Number) ((kotlin.k) next2).e).floatValue() - f);
                                    if (Float.compare(fAbs, fAbs2) > 0) {
                                        next = next2;
                                        fAbs = fAbs2;
                                    }
                                    if (!it.hasNext()) {
                                        break;
                                    } else {
                                        sVar2 = sVar;
                                    }
                                }
                            }
                            obj = next;
                        } else {
                            obj = null;
                        }
                        kotlin.k kVar = (kotlin.k) obj;
                        float fFloatValue = kVar != null ? ((Number) kVar.e).floatValue() : 0.5f;
                        androidx.compose.material3.q.a(aVar, androidx.compose.runtime.internal.k.c(-474826402, new com.app.mlounge.ui.components.h(4, aVar), sVar2), null, null, b.h, androidx.compose.runtime.internal.k.c(-1577588295, new v(listK, lVar, fFloatValue), sVar2), null, com.app.mlounge.ui.theme.b.d, 0L, 0L, 0L, 0.0f, null, sVar, 1769526, 0, 16028);
                    } else {
                        sVar.W();
                    }
                    s1 s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new v(f, lVar, aVar, i);
                    }
                }

                public static final void n(String str, String str2, androidx.compose.ui.graphics.vector.f fVar, List list, String str3, kotlin.jvm.functions.l lVar, androidx.compose.runtime.s sVar, int i) {
                    String str4;
                    androidx.compose.runtime.s sVar2 = sVar;
                    sVar2.c0(131670199);
                    int i2 = (sVar2.f(fVar) ? LibretroCore.SCREEN_WIDTH : 128) | i;
                    if ((i & 3072) == 0) {
                        i2 |= sVar2.h(list) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    int i3 = i2 | (sVar2.f(str3) ? 16384 : 8192) | (sVar2.h(lVar) ? 131072 : Parser.ARGC_LIMIT);
                    if (sVar2.T(i3 & 1, (74899 & i3) != 74898)) {
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        float f = 12;
                        androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(i1.e(oVar, 1.0f), 16, f);
                        f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                        int iHashCode = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL = sVar2.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarR);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                        androidx.compose.runtime.t.x(sVar2, f1VarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                        androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                        androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        androidx.compose.runtime.t.t(sVar2, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                        androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
                        long j = com.app.mlounge.ui.theme.b.m;
                        q1.b(fVar, null, i1.m(oVar, 20), j, sVar2, ((i3 >> 6) & 14) | 432, 0);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, f));
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        t0 t0Var = new t0(1.0f, true);
                        androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, t0Var);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
                        androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
                        androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
                        androidx.compose.runtime.x2 x2Var = n6.a;
                        boolean z = true;
                        z5.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).k, sVar, 6, 0, 131066);
                        z5.b(str2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).l, sVar, 6, 0, 131066);
                        sVar2 = sVar;
                        sVar2.p(true);
                        int i4 = 6;
                        f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.G, sVar2, 6);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar2, oVar);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, f1VarA2, eVar);
                        androidx.compose.runtime.t.x(sVar2, jVarL3, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar);
                        androidx.compose.runtime.t.x(sVar2, rVarC3, eVar4);
                        sVar2.b0(1929706138);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str5 = (String) it.next();
                            boolean zA = kotlin.jvm.internal.l.a(str5, str3);
                            Object objQ = sVar2.Q();
                            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                            if (objQ == fVar3) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                            }
                            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                            a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, i4);
                            float f2 = 8;
                            int i5 = i4;
                            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(f2);
                            long j2 = zA ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.c;
                            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar, 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
                            boolean zF = ((i3 & 458752) == 131072) | sVar2.f(str5);
                            Object objQ2 = sVar2.Q();
                            if (zF || objQ2 == fVar3) {
                                objQ2 = new n0(lVar, str5, 1);
                                sVar2.l0(objQ2);
                            }
                            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), dVarA, j2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-105591980, new com.app.mlounge.ui.screens.adult.c(2, str5, zA), sVar2), sVar, 12582912, 120);
                            i4 = i5;
                            sVar2 = sVar;
                            z = true;
                        }
                        str4 = str3;
                        boolean z2 = z;
                        androidx.room.b0.g(sVar2, false, z2, z2);
                    } else {
                        str4 = str3;
                        sVar2.W();
                    }
                    s1 s1VarT = sVar2.t();
                    if (s1VarT != null) {
                        s1VarT.d = new androidx.compose.runtime.internal.d(str, str2, fVar, list, str4, lVar, i, 2);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:37:0x0069  */
                /* JADX WARN: Code duplicated, block: B:38:0x006b  */
                /* JADX WARN: Code duplicated, block: B:41:0x0074  */
                /* JADX WARN: Code duplicated, block: B:43:0x0078  */
                /* JADX WARN: Code duplicated, block: B:44:0x007a  */
                /* JADX WARN: Code duplicated, block: B:46:0x007d  */
                /* JADX WARN: Code duplicated, block: B:49:0x0087  */
                /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
                /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
                /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
                /* JADX WARN: Code duplicated, block: B:66:0x0103  */
                /* JADX WARN: Code duplicated, block: B:69:0x0138  */
                /* JADX WARN: Code duplicated, block: B:70:0x013c  */
                /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
                /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
                /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
                /* JADX WARN: Code duplicated, block: B:81:0x024a  */
                /* JADX WARN: Code duplicated, block: B:82:0x0268  */
                /* JADX WARN: Code duplicated, block: B:84:0x027a  */
                /* JADX WARN: Code duplicated, block: B:87:0x0284  */
                /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
                public static final void o(String str, String str2, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i, int i2) {
                    int i3;
                    androidx.compose.ui.r rVar2;
                    int i4;
                    kotlin.jvm.functions.a aVar2;
                    int i5;
                    boolean z;
                    kotlin.jvm.functions.a aVar3;
                    s1 s1VarT;
                    androidx.compose.ui.o oVar;
                    androidx.compose.ui.r rVar3;
                    Object objQ;
                    androidx.compose.runtime.f fVar2;
                    androidx.compose.foundation.interaction.k kVar;
                    a1 a1VarB;
                    androidx.compose.ui.r rVarN;
                    androidx.compose.ui.node.f fVar3;
                    long j;
                    float f;
                    kotlin.jvm.functions.a aVar4;
                    long j2;
                    boolean z2;
                    Object objQ2;
                    sVar.c0(-251330597);
                    if ((i & 48) == 0) {
                        i3 = (sVar.f(str2) ? 32 : 16) | i;
                    } else {
                        i3 = i;
                    }
                    int i6 = i3 | (sVar.f(fVar) ? LibretroCore.SCREEN_WIDTH : 128);
                    int i7 = i2 & 8;
                    if (i7 != 0) {
                        i4 = i6 | 3072;
                        rVar2 = rVar;
                    } else {
                        rVar2 = rVar;
                        i4 = i6 | (sVar.f(rVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    }
                    int i8 = i2 & 16;
                    if (i8 == 0) {
                        if ((i & 24576) == 0) {
                            aVar2 = aVar;
                            i4 |= sVar.h(aVar2) ? 16384 : 8192;
                        }
                        i5 = i4;
                        if ((i5 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (sVar.T(i5 & 1, z)) {
                            oVar = androidx.compose.ui.o.b;
                            if (i7 != 0) {
                                rVar3 = oVar;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i8 != 0) {
                                aVar2 = null;
                            }
                            objQ = sVar.Q();
                            fVar2 = androidx.compose.runtime.n.a;
                            if (objQ == fVar2) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                            }
                            kVar = (androidx.compose.foundation.interaction.k) objQ;
                            a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
                            float f2 = 12;
                            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(i1.e(rVar3, 1.0f), 16, f2);
                            if (aVar2 != null) {
                                sVar.b0(-1010514709);
                                float f3 = 2;
                                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                                    j2 = com.app.mlounge.ui.theme.b.q;
                                } else {
                                    j2 = androidx.compose.ui.graphics.t.h;
                                }
                                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar, f3, j2, androidx.compose.foundation.shape.e.a(8));
                                if ((57344 & i5) == 16384) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objQ2 = sVar.Q();
                                if (z2 || objQ2 == fVar2) {
                                    objQ2 = new x2(19, aVar2);
                                    sVar.l0(objQ2);
                                }
                                rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
                                sVar.p(false);
                            } else {
                                sVar.b0(-1010512765);
                                sVar.p(false);
                                rVarN = oVar;
                            }
                            androidx.compose.ui.r rVarD = rVarR.d(rVarN);
                            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
                            int iHashCode = Long.hashCode(sVar.T);
                            androidx.compose.runtime.internal.j jVarL = sVar.l();
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarD);
                            androidx.compose.ui.node.h.b.getClass();
                            fVar3 = androidx.compose.ui.node.g.b;
                            sVar.e0();
                            if (sVar.S) {
                                sVar.k(fVar3);
                            } else {
                                sVar.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                            androidx.compose.runtime.t.x(sVar, f1VarA, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                            androidx.compose.runtime.t.p(sVar, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                            androidx.compose.runtime.t.t(sVar, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
                            j = com.app.mlounge.ui.theme.b.m;
                            f = 20;
                            aVar4 = aVar2;
                            androidx.compose.ui.r rVar4 = rVar3;
                            q1.b(fVar, null, i1.m(oVar, f), j, sVar, ((i5 >> 6) & 14) | 432, 0);
                            androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, f2));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            t0 t0Var = new t0(1.0f, true);
                            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                            int iHashCode2 = Long.hashCode(sVar.T);
                            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, t0Var);
                            sVar.e0();
                            if (sVar.S) {
                                sVar.k(fVar3);
                            } else {
                                sVar.o0();
                            }
                            androidx.compose.runtime.t.x(sVar, wVarA, eVar);
                            androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                            androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
                            androidx.compose.runtime.x2 x2Var = n6.a;
                            z5.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).k, sVar, 6, 0, 131066);
                            z5.b(str2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).l, sVar, (i5 >> 3) & 14, 0, 131066);
                            sVar.p(true);
                            if (aVar4 != null) {
                                sVar.b0(1759166143);
                                q1.b(com.google.android.gms.dynamite.g.u(), null, i1.m(oVar, f), j, sVar, 432, 0);
                                sVar.p(false);
                            } else {
                                sVar.b0(1759272163);
                                sVar.p(false);
                            }
                            sVar.p(true);
                            rVar2 = rVar4;
                            aVar3 = aVar4;
                        } else {
                            sVar.W();
                            aVar3 = aVar2;
                        }
                        s1VarT = sVar.t();
                        if (s1VarT != null) {
                            s1VarT.d = new i0(str, str2, fVar, rVar2, aVar3, i, i2);
                        }
                    }
                    i4 |= 24576;
                    aVar2 = aVar;
                    i5 = i4;
                    if ((i5 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (sVar.T(i5 & 1, z)) {
                        oVar = androidx.compose.ui.o.b;
                        if (i7 != 0) {
                            rVar3 = oVar;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i8 != 0) {
                            aVar2 = null;
                        }
                        objQ = sVar.Q();
                        fVar2 = androidx.compose.runtime.n.a;
                        if (objQ == fVar2) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        kVar = (androidx.compose.foundation.interaction.k) objQ;
                        a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
                        float f4 = 12;
                        androidx.compose.ui.r rVarR2 = androidx.compose.foundation.layout.b.r(i1.e(rVar3, 1.0f), 16, f4);
                        if (aVar2 != null) {
                            sVar.b0(-1010514709);
                            float f5 = 2;
                            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                                j2 = com.app.mlounge.ui.theme.b.q;
                            } else {
                                j2 = androidx.compose.ui.graphics.t.h;
                            }
                            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(oVar, f5, j2, androidx.compose.foundation.shape.e.a(8));
                            if ((57344 & i5) == 16384) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objQ2 = sVar.Q();
                            if (z2) {
                                objQ2 = new x2(19, aVar2);
                                sVar.l0(objQ2);
                            } else {
                                objQ2 = new x2(19, aVar2);
                                sVar.l0(objQ2);
                            }
                            rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG2, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
                            sVar.p(false);
                        } else {
                            sVar.b0(-1010512765);
                            sVar.p(false);
                            rVarN = oVar;
                        }
                        androidx.compose.ui.r rVarD2 = rVarR2.d(rVarN);
                        f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
                        int iHashCode3 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar, rVarD2);
                        androidx.compose.ui.node.h.b.getClass();
                        fVar3 = androidx.compose.ui.node.g.b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar3);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.f;
                        androidx.compose.runtime.t.x(sVar, f1VarA2, eVar5);
                        androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.g.e;
                        androidx.compose.runtime.t.x(sVar, jVarL3, eVar6);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.g.g;
                        androidx.compose.runtime.t.p(sVar, numValueOf2, eVar7);
                        androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                        androidx.compose.runtime.t.t(sVar, dVar2);
                        androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.g.d;
                        androidx.compose.runtime.t.x(sVar, rVarC3, eVar8);
                        j = com.app.mlounge.ui.theme.b.m;
                        f = 20;
                        aVar4 = aVar2;
                        androidx.compose.ui.r rVar5 = rVar3;
                        q1.b(fVar, null, i1.m(oVar, f), j, sVar, ((i5 >> 6) & 14) | 432, 0);
                        androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, f4));
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        t0 t0Var2 = new t0(1.0f, true);
                        androidx.compose.foundation.layout.w wVarA2 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                        int iHashCode4 = Long.hashCode(sVar.T);
                        androidx.compose.runtime.internal.j jVarL4 = sVar.l();
                        androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar, t0Var2);
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(fVar3);
                        } else {
                            sVar.o0();
                        }
                        androidx.compose.runtime.t.x(sVar, wVarA2, eVar5);
                        androidx.compose.runtime.t.x(sVar, jVarL4, eVar6);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar, eVar7, sVar, dVar2);
                        androidx.compose.runtime.t.x(sVar, rVarC4, eVar8);
                        androidx.compose.runtime.x2 x2Var2 = n6.a;
                        z5.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var2)).k, sVar, 6, 0, 131066);
                        z5.b(str2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var2)).l, sVar, (i5 >> 3) & 14, 0, 131066);
                        sVar.p(true);
                        if (aVar4 != null) {
                            sVar.b0(1759166143);
                            q1.b(com.google.android.gms.dynamite.g.u(), null, i1.m(oVar, f), j, sVar, 432, 0);
                            sVar.p(false);
                        } else {
                            sVar.b0(1759272163);
                            sVar.p(false);
                        }
                        sVar.p(true);
                        rVar2 = rVar5;
                        aVar3 = aVar4;
                    } else {
                        sVar.W();
                        aVar3 = aVar2;
                    }
                    s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new i0(str, str2, fVar, rVar2, aVar3, i, i2);
                    }
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26951. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                public static final void p(com.app.mlounge.ui.viewmodel.p1 r71, com.app.mlounge.ui.viewmodel.k r72, androidx.compose.runtime.s r73, int r74) {
                    /*
                        Method dump skipped, instruction units count: 2695
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.settings.e0.p(com.app.mlounge.ui.viewmodel.p1, com.app.mlounge.ui.viewmodel.k, androidx.compose.runtime.s, int):void");
                }

                public static final void q(final String str, boolean z, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
                    boolean z2;
                    int i3;
                    androidx.compose.runtime.internal.f fVar2;
                    final boolean z3;
                    a1 a1Var;
                    androidx.compose.ui.o oVar;
                    boolean z4;
                    androidx.compose.ui.o oVar2;
                    boolean z5;
                    androidx.compose.ui.graphics.vector.f fVarB;
                    androidx.compose.runtime.s sVar2 = sVar;
                    sVar2.c0(-119636697);
                    int i4 = i2 & 2;
                    if (i4 != 0) {
                        i3 = i | 48;
                        z2 = z;
                    } else if ((i & 48) == 0) {
                        z2 = z;
                        i3 = i | (sVar2.g(z2) ? 32 : 16);
                    } else {
                        z2 = z;
                        i3 = i;
                    }
                    if (sVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                        boolean z6 = i4 != 0 ? false : z2;
                        Object objQ = sVar2.Q();
                        androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
                        if (objQ == fVar3) {
                            objQ = androidx.compose.runtime.t.r(Boolean.valueOf(!z6));
                            sVar2.l0(objQ);
                        }
                        a1 a1Var2 = (a1) objQ;
                        Object objQ2 = sVar2.Q();
                        if (objQ2 == fVar3) {
                            objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
                        a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
                        androidx.compose.ui.o oVar3 = androidx.compose.ui.o.b;
                        if (z6) {
                            sVar2.b0(726384286);
                            float f = 8;
                            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.b.r(i1.e(oVar3, 1.0f), 16, f), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                            Object objQ3 = sVar2.Q();
                            if (objQ3 == fVar3) {
                                objQ3 = new androidx.compose.foundation.lazy.m(a1Var2, 23);
                                sVar2.l0(objQ3);
                            }
                            androidx.compose.ui.r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1);
                            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                            int iHashCode = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL = sVar2.l();
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarN);
                            androidx.compose.ui.node.h.b.getClass();
                            androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(fVar4);
                            } else {
                                sVar2.o0();
                            }
                            androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
                            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                            androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(n6.a)).i;
                            long j = com.app.mlounge.ui.theme.b.f;
                            a1Var = a1Var2;
                            z5.b(str, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 6, 0, 131066);
                            sVar2 = sVar;
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.b.e(sVar2, new t0(1.0f, true));
                            if (((Boolean) a1Var.getValue()).booleanValue()) {
                                fVarB = com.google.android.gms.dynamite.g.e;
                                if (fVarB != null) {
                                    z5 = false;
                                } else {
                                    androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i5 = h0.a;
                                    p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                                    ArrayList arrayList = new ArrayList(32);
                                    arrayList.add(new androidx.compose.ui.graphics.vector.o(12.0f, 8.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.v(-6.0f, 6.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.v(1.41f, 1.41f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.n(12.0f, 10.83f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.v(4.59f, 4.58f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.n(18.0f, 14.0f));
                                    arrayList.add(androidx.compose.ui.graphics.vector.k.c);
                                    z5 = false;
                                    androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
                                    fVarB = eVar.b();
                                    com.google.android.gms.dynamite.g.e = fVarB;
                                }
                            } else {
                                z5 = false;
                                fVarB = com.google.firebase.b.c;
                                if (fVarB == null) {
                                    androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i6 = h0.a;
                                    p0 p0Var2 = new p0(androidx.compose.ui.graphics.t.b);
                                    ArrayList arrayList2 = new ArrayList(32);
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.o(16.59f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.n(12.0f, 13.17f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.n(7.41f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.n(6.0f, 10.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.v(6.0f, 6.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.v(6.0f, -6.0f));
                                    arrayList2.add(androidx.compose.ui.graphics.vector.k.c);
                                    androidx.compose.ui.graphics.vector.e.a(eVar2, arrayList2, 0, p0Var2);
                                    fVarB = eVar2.b();
                                    com.google.firebase.b.c = fVarB;
                                }
                            }
                            q1.b(fVarB, ((Boolean) a1Var.getValue()).booleanValue() ? "Collapse" : "Expand", i1.m(oVar3, 20), j, sVar2, 384, 0);
                            sVar2.p(true);
                            sVar2.p(z5);
                            oVar = oVar3;
                            z4 = z5;
                        } else {
                            a1Var = a1Var2;
                            sVar2.b0(727293888);
                            oVar = oVar3;
                            z5.b(str, androidx.compose.foundation.layout.b.r(oVar3, 16, 8), com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).i, sVar, 54, 0, 131064);
                            sVar2 = sVar;
                            z4 = false;
                            sVar2.p(false);
                        }
                        if (((Boolean) a1Var.getValue()).booleanValue()) {
                            sVar2.b0(727484321);
                            oVar2 = oVar;
                            fVar2 = fVar;
                            p5.a(androidx.compose.foundation.layout.b.s(i1.e(oVar2, 1.0f), 16, 0.0f, 2), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-166577830, new x0(fVar2), sVar2), sVar, 12582918, 120);
                            sVar2 = sVar;
                            sVar2.p(z4);
                        } else {
                            fVar2 = fVar;
                            oVar2 = oVar;
                            sVar2.b0(727669019);
                            sVar2.p(z4);
                        }
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar2, 8));
                        z3 = z6;
                    } else {
                        fVar2 = fVar;
                        sVar2.W();
                        z3 = z2;
                    }
                    s1 s1VarT = sVar2.t();
                    if (s1VarT != null) {
                        final androidx.compose.runtime.internal.f fVar5 = fVar2;
                        s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.c
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                e0.q(str, z3, fVar5, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }

                public static final void r(final String str, final String str2, final boolean z, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.graphics.vector.f fVar, boolean z2, androidx.compose.runtime.s sVar, final int i, final int i2) {
                    int i3;
                    boolean z3;
                    int i4;
                    final boolean z4;
                    androidx.compose.runtime.s sVar2;
                    androidx.compose.runtime.s sVar3 = sVar;
                    sVar3.c0(-549654010);
                    if ((i & 6) == 0) {
                        i3 = i | (sVar3.f(str) ? 4 : 2);
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= sVar3.f(str2) ? 32 : 16;
                    }
                    int i5 = i3 | (sVar3.g(z) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar3.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar3.f(fVar) ? 16384 : 8192);
                    int i6 = i2 & 32;
                    if (i6 != 0) {
                        i4 = i5 | 196608;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        i4 = i5 | (sVar3.g(z3) ? 131072 : Parser.ARGC_LIMIT);
                    }
                    int i7 = i4;
                    if (sVar3.T(i7 & 1, (74899 & i7) != 74898)) {
                        boolean z5 = i6 != 0 ? true : z3;
                        Object objQ = sVar3.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                        if (objQ == fVar2) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar3);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        a1 a1VarB = _COROUTINE.a.B(kVar, sVar3, 6);
                        float f = z5 ? 1.0f : 0.4f;
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        float f2 = 12;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.b.r(i1.e(oVar, 1.0f), 16, f2), 2, (((Boolean) a1VarB.getValue()).booleanValue() && z5) ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                        boolean z6 = ((i7 & 7168) == 2048) | ((i7 & 896) == 256);
                        Object objQ2 = sVar.Q();
                        if (z6 || objQ2 == fVar2) {
                            objQ2 = new androidx.compose.foundation.selection.g(lVar, z, 2);
                            sVar2 = sVar;
                            sVar2.l0(objQ2);
                        } else {
                            sVar2 = sVar;
                        }
                        boolean z7 = z5;
                        androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.j(rVarG, kVar, null, z5, null, (kotlin.jvm.functions.a) objQ2, 24), z7, kVar);
                        f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                        int iHashCode = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL = sVar2.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarM);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar3);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                        androidx.compose.runtime.t.x(sVar2, f1VarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                        androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                        androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        androidx.compose.runtime.t.t(sVar2, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                        androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
                        long j = com.app.mlounge.ui.theme.b.m;
                        q1.b(fVar, null, i1.m(oVar, 20), androidx.compose.ui.graphics.t.b(f, j), sVar2, ((i7 >> 12) & 14) | 432, 0);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, f2));
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        t0 t0Var = new t0(1.0f, true);
                        androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, t0Var);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar3);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
                        androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
                        androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
                        androidx.compose.runtime.x2 x2Var = n6.a;
                        z5.b(str, null, androidx.compose.ui.graphics.t.b(f, com.app.mlounge.ui.theme.b.l), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).k, sVar, i7 & 14, 0, 131066);
                        int i8 = i7 >> 3;
                        z5.b(str2, null, androidx.compose.ui.graphics.t.b(f, j), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).l, sVar, i8 & 14, 0, 131066);
                        sVar.p(true);
                        long j2 = com.app.mlounge.ui.theme.b.f;
                        long jB = androidx.compose.ui.graphics.t.b(0.3f, j2);
                        long j3 = com.app.mlounge.ui.theme.b.n;
                        long j4 = com.app.mlounge.ui.theme.b.c;
                        t5.a(z, lVar, null, z7, androidx.compose.material3.q.l(j2, jB, j3, j4, androidx.compose.ui.graphics.t.b(0.4f, j2), androidx.compose.ui.graphics.t.b(0.12f, j2), androidx.compose.ui.graphics.t.b(0.4f, j3), androidx.compose.ui.graphics.t.b(0.4f, j4), sVar, 52428), sVar, ((i7 >> 6) & Token.ELSE) | (i8 & 57344), 76);
                        sVar3 = sVar;
                        sVar3.p(true);
                        z4 = z7;
                    } else {
                        sVar3.W();
                        z4 = z3;
                    }
                    s1 s1VarT = sVar3.t();
                    if (s1VarT != null) {
                        s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.m
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                e0.r(str, str2, z, lVar, fVar, z4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }

                /* JADX WARN: Code duplicated, block: B:42:0x0089  */
                /* JADX WARN: Code duplicated, block: B:43:0x008b  */
                /* JADX WARN: Code duplicated, block: B:46:0x0094 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:47:0x0096  */
                /* JADX WARN: Code duplicated, block: B:48:0x009b  */
                /* JADX WARN: Code duplicated, block: B:50:0x009f  */
                /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:57:0x00c7  */
                /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
                /* JADX WARN: Code duplicated, block: B:66:0x0107  */
                /* JADX WARN: Code duplicated, block: B:69:0x014d  */
                /* JADX WARN: Code duplicated, block: B:70:0x0151  */
                /* JADX WARN: Code duplicated, block: B:73:0x01b3  */
                /* JADX WARN: Code duplicated, block: B:74:0x01c0  */
                /* JADX WARN: Code duplicated, block: B:78:0x0208  */
                /* JADX WARN: Code duplicated, block: B:82:0x0223  */
                /* JADX WARN: Code duplicated, block: B:85:0x0238  */
                /* JADX WARN: Code duplicated, block: B:87:0x02a1  */
                /* JADX WARN: Code duplicated, block: B:90:0x02ae  */
                /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
                public static final void s(String str, final String str2, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.graphics.vector.f fVar, final androidx.compose.ui.r rVar, final String str3, androidx.compose.ui.text.input.g0 g0Var, q0 q0Var, androidx.compose.runtime.s sVar, final int i, final int i2) {
                    androidx.compose.ui.text.input.g0 g0Var2;
                    int i3;
                    q0 q0Var2;
                    boolean z;
                    final String str4;
                    final androidx.compose.ui.text.input.g0 g0Var3;
                    final q0 q0Var3;
                    s1 s1VarT;
                    androidx.compose.ui.text.input.g0 g0Var4;
                    q0 q0Var4;
                    Object objQ;
                    androidx.compose.runtime.f fVar2;
                    a1 a1Var;
                    l2 l2Var;
                    Object objQ2;
                    androidx.compose.foundation.interaction.k kVar;
                    androidx.compose.ui.focus.l lVar2;
                    boolean zF;
                    Object objQ3;
                    int i4;
                    kotlin.coroutines.d dVar;
                    Object objQ4;
                    androidx.compose.ui.node.f fVar3;
                    androidx.compose.runtime.internal.f fVar4;
                    boolean zF2;
                    Object objQ5;
                    Object objQ6;
                    androidx.compose.runtime.s sVar2 = sVar;
                    sVar2.c0(-1257614323);
                    int i5 = (sVar2.f(str2) ? 32 : 16) | i | (sVar2.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar2.f(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    if ((i & 24576) == 0) {
                        i5 |= sVar2.f(rVar) ? 16384 : 8192;
                    }
                    int i6 = i2 & 64;
                    if (i6 != 0) {
                        i3 = i5 | 1572864;
                        g0Var2 = g0Var;
                    } else {
                        g0Var2 = g0Var;
                        i3 = i5 | (sVar2.f(g0Var2) ? 1048576 : 524288);
                    }
                    int i7 = i2 & 128;
                    if (i7 == 0) {
                        if ((i & 12582912) == 0) {
                            q0Var2 = q0Var;
                            i3 |= sVar2.f(q0Var2) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i3) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (sVar2.T(i3 & 1, z)) {
                            if (i6 != 0) {
                                g0Var4 = androidx.compose.ui.text.input.f0.e;
                            } else {
                                g0Var4 = g0Var2;
                            }
                            if (i7 != 0) {
                                q0Var4 = q0.c;
                            } else {
                                q0Var4 = q0Var2;
                            }
                            objQ = sVar2.Q();
                            fVar2 = androidx.compose.runtime.n.a;
                            if (objQ == fVar2) {
                                objQ = androidx.compose.runtime.t.r(Boolean.FALSE);
                                sVar2.l0(objQ);
                            }
                            a1Var = (a1) objQ;
                            l2Var = (l2) sVar2.j(l1.p);
                            objQ2 = sVar2.Q();
                            if (objQ2 == fVar2) {
                                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                            }
                            kVar = (androidx.compose.foundation.interaction.k) objQ2;
                            lVar2 = (androidx.compose.ui.focus.l) sVar2.j(l1.i);
                            Boolean boolValueOf = Boolean.valueOf(((Boolean) a1Var.getValue()).booleanValue());
                            zF = sVar2.f(l2Var);
                            objQ3 = sVar2.Q();
                            i4 = 6;
                            if (!zF || objQ3 == fVar2) {
                                dVar = null;
                                objQ3 = new com.app.mlounge.ui.components.v(l2Var, a1Var, null, 6);
                                sVar2.l0(objQ3);
                            } else {
                                dVar = null;
                            }
                            l0.c(sVar2, boolValueOf, (kotlin.jvm.functions.p) objQ3);
                            objQ4 = sVar2.Q();
                            if (objQ4 == fVar2) {
                                objQ4 = new com.app.mlounge.ui.components.x(kVar, a1Var, dVar, i4);
                                sVar2.l0(objQ4);
                            }
                            l0.c(sVar2, kVar, (kotlin.jvm.functions.p) objQ4);
                            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(i1.e(rVar, 1.0f), 0.0f, 8, 1);
                            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                            int iHashCode = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL = sVar2.l();
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarS);
                            androidx.compose.ui.node.h.b.getClass();
                            fVar3 = androidx.compose.ui.node.g.b;
                            sVar2.e0();
                            int i8 = i3;
                            if (sVar2.S) {
                                sVar2.k(fVar3);
                            } else {
                                sVar2.o0();
                            }
                            androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
                            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                            long j = com.app.mlounge.ui.theme.b.m;
                            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                            q1.b(fVar, null, i1.m(oVar, 20), j, sVar2, ((i8 >> 9) & 14) | 432, 0);
                            androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, 12));
                            boolean z2 = !((Boolean) a1Var.getValue()).booleanValue();
                            if (str3 == null) {
                                sVar2.b0(1931428682);
                                sVar2.p(false);
                                fVar4 = null;
                            } else {
                                sVar2.b0(1931428683);
                                androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-616702814, new com.app.mlounge.ui.components.r(str3, 11), sVar2);
                                sVar2.p(false);
                                fVar4 = fVarC;
                            }
                            b4 b4Var = b4.a;
                            long j2 = com.app.mlounge.ui.theme.b.f;
                            long j3 = com.app.mlounge.ui.theme.b.e;
                            long j4 = com.app.mlounge.ui.theme.b.l;
                            u5 u5VarC = b4.c(j4, j4, j2, j2, j3, 0L, 0L, sVar, 2147477244);
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            t0 t0Var = new t0(1.0f, true);
                            zF2 = sVar.f(l2Var) | sVar.h(lVar2);
                            objQ5 = sVar.Q();
                            if (zF2 || objQ5 == fVar2) {
                                objQ5 = new com.app.mlounge.ui.screens.search.g(l2Var, lVar2, a1Var, 4);
                                sVar.l0(objQ5);
                            }
                            androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(t0Var, (kotlin.jvm.functions.l) objQ5);
                            objQ6 = sVar.Q();
                            if (objQ6 == fVar2) {
                                objQ6 = new m2(a1Var, 20);
                                sVar.l0(objQ6);
                            }
                            androidx.compose.ui.r rVarT = androidx.compose.ui.focus.d.t(rVarE, (kotlin.jvm.functions.l) objQ6);
                            str4 = str;
                            int i9 = i8 >> 3;
                            int i10 = i8 >> 6;
                            androidx.compose.ui.text.input.g0 g0Var5 = g0Var4;
                            q0 q0Var5 = q0Var4;
                            h4.a(str2, lVar, rVarT, false, z2, null, androidx.compose.runtime.internal.k.c(-630482737, new com.app.mlounge.ui.components.r(str4, 12), sVar), fVar4, null, null, g0Var5, q0Var5, null, true, 0, 0, kVar, null, u5VarC, sVar, (i9 & Token.ASSIGN_MOD) | (i9 & 14) | 1572864, (57344 & i10) | 12582912 | (i10 & 458752), 6, 2965288);
                            sVar2 = sVar;
                            sVar2.p(true);
                            g0Var3 = g0Var5;
                            q0Var3 = q0Var5;
                        } else {
                            str4 = str;
                            sVar2.W();
                            g0Var3 = g0Var2;
                            q0Var3 = q0Var2;
                        }
                        s1VarT = sVar2.t();
                        if (s1VarT != null) {
                            s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.n
                                @Override // kotlin.jvm.functions.p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    e0.s(str4, str2, lVar, fVar, rVar, str3, g0Var3, q0Var3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                    return kotlin.y.a;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    q0Var2 = q0Var;
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (sVar2.T(i3 & 1, z)) {
                        if (i6 != 0) {
                            g0Var4 = androidx.compose.ui.text.input.f0.e;
                        } else {
                            g0Var4 = g0Var2;
                        }
                        if (i7 != 0) {
                            q0Var4 = q0.c;
                        } else {
                            q0Var4 = q0Var2;
                        }
                        objQ = sVar2.Q();
                        fVar2 = androidx.compose.runtime.n.a;
                        if (objQ == fVar2) {
                            objQ = androidx.compose.runtime.t.r(Boolean.FALSE);
                            sVar2.l0(objQ);
                        }
                        a1Var = (a1) objQ;
                        l2Var = (l2) sVar2.j(l1.p);
                        objQ2 = sVar2.Q();
                        if (objQ2 == fVar2) {
                            objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                        }
                        kVar = (androidx.compose.foundation.interaction.k) objQ2;
                        lVar2 = (androidx.compose.ui.focus.l) sVar2.j(l1.i);
                        Boolean boolValueOf2 = Boolean.valueOf(((Boolean) a1Var.getValue()).booleanValue());
                        zF = sVar2.f(l2Var);
                        objQ3 = sVar2.Q();
                        i4 = 6;
                        if (zF) {
                            dVar = null;
                            objQ3 = new com.app.mlounge.ui.components.v(l2Var, a1Var, null, 6);
                            sVar2.l0(objQ3);
                        } else {
                            dVar = null;
                            objQ3 = new com.app.mlounge.ui.components.v(l2Var, a1Var, null, 6);
                            sVar2.l0(objQ3);
                        }
                        l0.c(sVar2, boolValueOf2, (kotlin.jvm.functions.p) objQ3);
                        objQ4 = sVar2.Q();
                        if (objQ4 == fVar2) {
                            objQ4 = new com.app.mlounge.ui.components.x(kVar, a1Var, dVar, i4);
                            sVar2.l0(objQ4);
                        }
                        l0.c(sVar2, kVar, (kotlin.jvm.functions.p) objQ4);
                        androidx.compose.ui.r rVarS2 = androidx.compose.foundation.layout.b.s(i1.e(rVar, 1.0f), 0.0f, 8, 1);
                        f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarS2);
                        androidx.compose.ui.node.h.b.getClass();
                        fVar3 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        int i11 = i3;
                        if (sVar2.S) {
                            sVar2.k(fVar3);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, f1VarA2, androidx.compose.ui.node.g.f);
                        androidx.compose.runtime.t.x(sVar2, jVarL2, androidx.compose.ui.node.g.e);
                        androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                        androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                        androidx.compose.runtime.t.x(sVar2, rVarC2, androidx.compose.ui.node.g.d);
                        long j5 = com.app.mlounge.ui.theme.b.m;
                        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                        q1.b(fVar, null, i1.m(oVar2, 20), j5, sVar2, ((i11 >> 9) & 14) | 432, 0);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar2, 12));
                        boolean z3 = !((Boolean) a1Var.getValue()).booleanValue();
                        if (str3 == null) {
                            sVar2.b0(1931428682);
                            sVar2.p(false);
                            fVar4 = null;
                        } else {
                            sVar2.b0(1931428683);
                            androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(-616702814, new com.app.mlounge.ui.components.r(str3, 11), sVar2);
                            sVar2.p(false);
                            fVar4 = fVarC2;
                        }
                        b4 b4Var2 = b4.a;
                        long j6 = com.app.mlounge.ui.theme.b.f;
                        long j7 = com.app.mlounge.ui.theme.b.e;
                        long j8 = com.app.mlounge.ui.theme.b.l;
                        u5 u5VarC2 = b4.c(j8, j8, j6, j6, j7, 0L, 0L, sVar, 2147477244);
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        t0 t0Var2 = new t0(1.0f, true);
                        zF2 = sVar.f(l2Var) | sVar.h(lVar2);
                        objQ5 = sVar.Q();
                        if (zF2) {
                            objQ5 = new com.app.mlounge.ui.screens.search.g(l2Var, lVar2, a1Var, 4);
                            sVar.l0(objQ5);
                        } else {
                            objQ5 = new com.app.mlounge.ui.screens.search.g(l2Var, lVar2, a1Var, 4);
                            sVar.l0(objQ5);
                        }
                        androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(t0Var2, (kotlin.jvm.functions.l) objQ5);
                        objQ6 = sVar.Q();
                        if (objQ6 == fVar2) {
                            objQ6 = new m2(a1Var, 20);
                            sVar.l0(objQ6);
                        }
                        androidx.compose.ui.r rVarT2 = androidx.compose.ui.focus.d.t(rVarE2, (kotlin.jvm.functions.l) objQ6);
                        str4 = str;
                        int i12 = i11 >> 3;
                        int i13 = i11 >> 6;
                        androidx.compose.ui.text.input.g0 g0Var6 = g0Var4;
                        q0 q0Var6 = q0Var4;
                        h4.a(str2, lVar, rVarT2, false, z3, null, androidx.compose.runtime.internal.k.c(-630482737, new com.app.mlounge.ui.components.r(str4, 12), sVar), fVar4, null, null, g0Var6, q0Var6, null, true, 0, 0, kVar, null, u5VarC2, sVar, (i12 & Token.ASSIGN_MOD) | (i12 & 14) | 1572864, (57344 & i13) | 12582912 | (i13 & 458752), 6, 2965288);
                        sVar2 = sVar;
                        sVar2.p(true);
                        g0Var3 = g0Var6;
                        q0Var3 = q0Var6;
                    } else {
                        str4 = str;
                        sVar2.W();
                        g0Var3 = g0Var2;
                        q0Var3 = q0Var2;
                    }
                    s1VarT = sVar2.t();
                    if (s1VarT != null) {
                        s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.settings.n
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                e0.s(str4, str2, lVar, fVar, rVar, str3, g0Var3, q0Var3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }

                public static final long t(File file) {
                    long length = 0;
                    if (file != null && file.exists()) {
                        kotlin.sequences.f fVar = new kotlin.sequences.f(new kotlin.sequences.g(new kotlin.io.h(file), true, new com.app.mlounge.ui.t(24)));
                        while (fVar.hasNext()) {
                            length += ((File) fVar.next()).length();
                        }
                    }
                    return length;
                }

                public static final String u(Context context) {
                    long jT = 0;
                    try {
                        jT = t(context.getCacheDir());
                        File externalCacheDir = context.getExternalCacheDir();
                        if (externalCacheDir != null) {
                            jT += t(externalCacheDir);
                        }
                    } catch (Exception unused) {
                    }
                    if (jT < 1024) {
                        return jT + " B";
                    }
                    if (jT >= 1048576) {
                        return jT < 1073741824 ? String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(jT / 1048576.0d)}, 1)) : String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(jT / 1.073741824E9d)}, 1));
                    }
                    return (jT / ((long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) + " KB";
                }

                public static final String v(Uri uri) {
                    try {
                        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
                        treeDocumentId.getClass();
                        List listU = kotlin.text.k.U(treeDocumentId, new String[]{":"}, 6);
                        if (listU.size() != 2) {
                            return null;
                        }
                        String str = (String) listU.get(0);
                        String str2 = (String) listU.get(1);
                        if (!"primary".equalsIgnoreCase(str)) {
                            return "/storage/" + str + "/" + str2;
                        }
                        return Environment.getExternalStorageDirectory() + "/" + str2;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }
