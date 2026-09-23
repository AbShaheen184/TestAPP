package androidx.compose.runtime;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.app.mlounge.MainActivity;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.appsalt.internal.f3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.tasks.TasksKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ s2(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        String strConcat;
        StringBuilder sb;
        int i;
        Bundle bundle;
        ?? r17;
        int i2 = 1;
        kotlin.coroutines.d dVar = null;
        switch (this.e) {
            case 0:
                androidx.collection.p0 p0Var = (androidx.collection.p0) this.y;
                if (obj instanceof androidx.compose.runtime.snapshots.x) {
                    ((androidx.compose.runtime.snapshots.x) obj).f(4);
                }
                p0Var.a(obj);
                return kotlin.y.a;
            case 1:
                androidx.compose.runtime.saveable.g gVar = ((androidx.compose.runtime.saveable.e) this.y).z;
                return Boolean.valueOf(gVar != null ? gVar.a(obj) : true);
            case 2:
                androidx.compose.runtime.snapshots.t tVar = (androidx.compose.runtime.snapshots.t) this.y;
                synchronized (tVar.g) {
                    androidx.compose.runtime.snapshots.s sVar = tVar.i;
                    sVar.getClass();
                    Object obj2 = sVar.b;
                    obj2.getClass();
                    int i3 = sVar.d;
                    androidx.collection.f0 f0Var = sVar.c;
                    if (f0Var == null) {
                        f0Var = new androidx.collection.f0();
                        sVar.c = f0Var;
                        sVar.f.m(obj2, f0Var);
                    }
                    sVar.b(obj, i3, obj2, f0Var);
                }
                return kotlin.y.a;
            case 3:
                androidx.compose.ui.text.font.s sVar2 = (androidx.compose.ui.text.font.s) obj;
                return ((androidx.compose.ui.text.font.e) this.y).a(new androidx.compose.ui.text.font.s(null, sVar2.b, sVar2.c, sVar2.d, sVar2.e)).e;
            case 4:
                androidx.compose.ui.text.input.g gVar2 = (androidx.compose.ui.text.input.g) obj;
                String str = ((androidx.compose.ui.text.input.g) this.y) == gVar2 ? " > " : "   ";
                if (!(gVar2 instanceof androidx.compose.ui.text.input.a)) {
                    if (gVar2 instanceof androidx.compose.ui.text.input.v) {
                        sb = new StringBuilder("SetComposingTextCommand(text.length=");
                        androidx.compose.ui.text.input.v vVar = (androidx.compose.ui.text.input.v) gVar2;
                        sb.append(vVar.a.y.length());
                        sb.append(", newCursorPosition=");
                        i = vVar.b;
                    } else if (gVar2 instanceof androidx.compose.ui.text.input.u) {
                        strConcat = ((androidx.compose.ui.text.input.u) gVar2).toString();
                    } else if (gVar2 instanceof androidx.compose.ui.text.input.e) {
                        strConcat = ((androidx.compose.ui.text.input.e) gVar2).toString();
                    } else if (gVar2 instanceof androidx.compose.ui.text.input.f) {
                        strConcat = ((androidx.compose.ui.text.input.f) gVar2).toString();
                    } else if (gVar2 instanceof androidx.compose.ui.text.input.w) {
                        strConcat = ((androidx.compose.ui.text.input.w) gVar2).toString();
                    } else if (gVar2 instanceof androidx.compose.ui.text.input.i) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (gVar2 instanceof androidx.compose.ui.text.input.d) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strC = kotlin.jvm.internal.a0.a(gVar2.getClass()).c();
                        if (strC == null) {
                            strC = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strC);
                    }
                    return str.concat(strConcat);
                }
                sb = new StringBuilder("CommitTextCommand(text.length=");
                androidx.compose.ui.text.input.a aVar = (androidx.compose.ui.text.input.a) gVar2;
                sb.append(aVar.a.y.length());
                sb.append(", newCursorPosition=");
                i = aVar.b;
                strConcat = androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, i, ')');
                return str.concat(strConcat);
            case 5:
                androidx.datastore.core.z zVar = (androidx.datastore.core.z) this.y;
                kotlin.o oVar = zVar.j;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    zVar.h.c(new androidx.datastore.core.j0(th));
                }
                if (oVar.a()) {
                    ((androidx.datastore.core.g0) ((androidx.datastore.core.g1) oVar.getValue())).close();
                }
                return kotlin.y.a;
            case 6:
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                File file = (File) obj;
                file.getClass();
                return new androidx.datastore.core.r0(coroutineScope.getCoroutineContext(), file);
            case 7:
                androidx.navigation.k0 k0Var = (androidx.navigation.k0) this.y;
                androidx.navigation.i iVar = (androidx.navigation.i) obj;
                iVar.getClass();
                androidx.navigation.internal.c cVar = iVar.E;
                androidx.navigation.t tVar2 = iVar.y;
                if (tVar2 == null) {
                    tVar2 = null;
                }
                if (tVar2 != null) {
                    cVar.a();
                    androidx.navigation.t tVarC = k0Var.c(tVar2);
                    if (tVarC != null) {
                        return tVarC.equals(tVar2) ? iVar : k0Var.b().b(tVarC, tVarC.b(cVar.a()));
                    }
                }
                return null;
            case 8:
                Bundle bundle2 = (Bundle) obj;
                androidx.navigation.y yVarH = com.imsdk.a.h((Context) this.y);
                if (bundle2 != null) {
                    bundle2.setClassLoader(yVarH.a.getClassLoader());
                }
                androidx.navigation.internal.f fVar = yVarH.b;
                LinkedHashMap linkedHashMap = fVar.n;
                if (bundle2 == null) {
                    r17 = 0;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            coil3.svg.internal.a.D("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    fVar.d = bundle;
                    fVar.e = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) coil3.network.g.t("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            coil3.svg.internal.a.D("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            coil3.svg.internal.a.D("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            int i6 = i5 + 1;
                            kotlin.coroutines.d dVar2 = dVar;
                            fVar.m.put(Integer.valueOf(intArray[i4]), !kotlin.jvm.internal.l.a(stringArrayList.get(i5), "") ? (String) stringArrayList.get(i5) : dVar2);
                            i4++;
                            i5 = i6;
                            dVar = dVar2;
                        }
                    }
                    r17 = dVar;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            coil3.svg.internal.a.D("android-support-nav:controller:backStackStates");
                            throw r17;
                        }
                        for (String str2 : stringArrayList2) {
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                ArrayList arrayListT = coil3.network.g.t("android-support-nav:controller:backStackStates:" + str2, bundle2);
                                kotlin.collections.l lVar = new kotlin.collections.l(arrayListT.size());
                                Iterator it = arrayListT.iterator();
                                while (it.hasNext()) {
                                    lVar.addLast(new androidx.navigation.j((Bundle) it.next()));
                                }
                                linkedHashMap.put(str2, lVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    ?? ValueOf = (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : r17;
                    yVarH.e = ValueOf != 0 ? ValueOf.booleanValue() : false;
                }
                return yVarH;
            case 9:
                androidx.constraintlayout.core.widgets.analyzer.e eVar = (androidx.constraintlayout.core.widgets.analyzer.e) this.y;
                androidx.sqlite.db.framework.b bVar = (androidx.sqlite.db.framework.b) obj;
                bVar.getClass();
                eVar.i = bVar;
                return kotlin.y.a;
            case 10:
                ((coil3.disk.d) this.y).I = true;
                return kotlin.y.a;
            case 11:
                final MainActivity mainActivity = (MainActivity) this.y;
                Context context = (Context) obj;
                int i7 = MainActivity.G;
                context.getClass();
                VideoView videoView = new VideoView(context);
                videoView.setVideoURI(Uri.parse("android.resource://" + context.getPackageName() + "/2131820546"));
                videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.app.mlounge.m
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        int i8 = MainActivity.G;
                        MainActivity mainActivity2 = mainActivity;
                        mainActivity2.A.setValue(Boolean.FALSE);
                        mainActivity2.k();
                    }
                });
                videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.app.mlounge.n
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
                        int i10 = MainActivity.G;
                        MainActivity mainActivity2 = mainActivity;
                        mainActivity2.A.setValue(Boolean.FALSE);
                        mainActivity2.k();
                        return true;
                    }
                });
                videoView.start();
                return videoView;
            case 12:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.y;
                com.app.mlounge.data.local.a aVar2 = (com.app.mlounge.data.local.a) obj;
                aVar2.getClass();
                String str3 = aVar2.a;
                if (linkedHashSet.contains(str3)) {
                    return androidx.privacysandbox.ads.adservices.java.internal.a.r("`", str3, "`");
                }
                if (aVar2.d && aVar2.e) {
                    return "NULL";
                }
                String str4 = aVar2.b;
                return (kotlin.jvm.internal.l.a(str4, "INTEGER") || kotlin.jvm.internal.l.a(str4, "REAL")) ? "0" : "''";
            case 13:
                com.app.mlounge.ui.viewmodel.c cVar2 = (com.app.mlounge.ui.viewmodel.c) this.y;
                ((j0) obj).getClass();
                return new androidx.activity.compose.d(cVar2, 13);
            case 14:
                com.app.mlounge.ui.viewmodel.g gVar3 = (com.app.mlounge.ui.viewmodel.g) this.y;
                ((j0) obj).getClass();
                return new androidx.activity.compose.d(gVar3, 14);
            case 15:
                com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) this.y;
                IptvChannel iptvChannel = (IptvChannel) obj;
                iptvChannel.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var), null, null, new com.app.mlounge.ui.viewmodel.u(a0Var, iptvChannel, dVar, i2), 3, null);
                return kotlin.y.a;
            case 16:
                com.app.mlounge.ui.viewmodel.f0 f0Var2 = (com.app.mlounge.ui.viewmodel.f0) this.y;
                ((j0) obj).getClass();
                return new androidx.activity.compose.d(f0Var2, 16);
            case 17:
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.y;
                Context context2 = (Context) obj;
                context2.getClass();
                androidx.media3.ui.h0 h0Var = new androidx.media3.ui.h0(context2);
                h0Var.setPlayer(c0Var);
                h0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                h0Var.setUseController(false);
                return h0Var;
            case 18:
                com.app.mlounge.ui.viewmodel.w1 w1Var = (com.app.mlounge.ui.viewmodel.w1) this.y;
                com.app.mlounge.ui.viewmodel.l lVar2 = (com.app.mlounge.ui.viewmodel.l) obj;
                lVar2.getClass();
                MutableStateFlow mutableStateFlow = w1Var.n;
                ChqStream chqStream = ((com.app.mlounge.ui.viewmodel.m) mutableStateFlow.getValue()).e;
                if (chqStream != null) {
                    com.app.mlounge.ui.viewmodel.m mVar = (com.app.mlounge.ui.viewmodel.m) mutableStateFlow.getValue();
                    boolean z2 = mVar.a;
                    String str5 = mVar.b;
                    String str6 = mVar.c;
                    ChqStream chqStream2 = mVar.e;
                    List list = mVar.f;
                    list.getClass();
                    mutableStateFlow.setValue(new com.app.mlounge.ui.viewmodel.m(z2, str5, str6, false, chqStream2, list));
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(w1Var), null, null, new com.app.mlounge.ui.viewmodel.o1(w1Var, chqStream, lVar2, null, 4), 3, null);
                }
                return kotlin.y.a;
            case 19:
                com.app.mlounge.ui.viewmodel.b2 b2Var = (com.app.mlounge.ui.viewmodel.b2) this.y;
                ((j0) obj).getClass();
                return new androidx.activity.compose.d(b2Var, 18);
            case 20:
                com.appsalt.internal.k0 k0Var2 = (com.appsalt.internal.k0) this.y;
                Throwable th2 = (Throwable) obj;
                ((com.appsalt.internal.a2) k0Var2.b.get((com.appsalt.internal.g0) k0Var2.c)).stop();
                k0Var2.g = th2;
                ((kotlin.jvm.functions.l) k0Var2.f).invoke(th2);
                return kotlin.y.a;
            case 21:
                ((f3) this.y).e.invoke((Throwable) obj);
                return kotlin.y.a;
            case 22:
                com.google.firebase.heartbeatinfo.h hVar = (com.google.firebase.heartbeatinfo.h) this.y;
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) obj;
                androidx.datastore.preferences.core.d dVar3 = com.google.firebase.heartbeatinfo.h.c;
                long j = 0;
                for (Map.Entry entry : aVar3.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        androidx.datastore.preferences.core.d dVar4 = (androidx.datastore.preferences.core.d) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = hVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                kotlinx.coroutines.future.a.q(j.f(obj3, "duplicate element: "));
                                return null;
                            }
                            aVar3.e(dVar4, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            aVar3.d(dVar4);
                        }
                    }
                }
                if (j == 0) {
                    aVar3.d(dVar3);
                } else {
                    aVar3.e(dVar3, Long.valueOf(j));
                }
                return null;
            case 23:
                com.google.firebase.sessions.l0 l0Var = (com.google.firebase.sessions.l0) this.y;
                androidx.datastore.core.b bVar2 = (androidx.datastore.core.b) obj;
                bVar2.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", bVar2);
                return new com.google.firebase.sessions.k0(l0Var.a.a(null), null, null);
            case 24:
                return obj == ((kotlin.collections.a) this.y) ? "(this Collection)" : String.valueOf(obj);
            case 25:
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b bVar3 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b) this.y;
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry2.getKey();
                sb2.append(key == bVar3 ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry2.getValue();
                sb2.append(value != bVar3 ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 26:
                androidx.activity.compose.b bVar4 = (androidx.activity.compose.b) this.y;
                obj.getClass();
                return bVar4.invoke();
            case 27:
                return ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k) this.y).c(((Integer) obj).intValue());
            case 28:
                return FutureKt.asCompletableFuture$lambda$2((CompletableFuture) this.y, (Throwable) obj);
            default:
                return TasksKt.asDeferredImpl$lambda$2((com.google.android.gms.tasks.a) this.y, (Throwable) obj);
        }
    }

    public /* synthetic */ s2(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }
}
