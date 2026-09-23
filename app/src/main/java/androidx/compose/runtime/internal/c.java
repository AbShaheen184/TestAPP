package androidx.compose.runtime.internal;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.text.u0;
import androidx.compose.material3.t3;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.q;
import androidx.compose.ui.text.r;
import androidx.compose.ui.text.s;
import androidx.media3.common.util.i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.appsalt.internal.b0;
import com.appsalt.internal.c0;
import com.appsalt.internal.g4;
import com.appsalt.internal.j0;
import com.appsalt.internal.n0;
import com.appsalt.internal.o0;
import com.appsalt.internal.r0;
import com.appsalt.internal.r5;
import com.appsalt.internal.u5;
import com.appsalt.internal.w3;
import com.appsalt.internal.w4;
import com.appsalt.internal.z0;
import com.google.android.gms.internal.measurement.db;
import com.google.android.gms.internal.measurement.td;
import com.google.common.util.concurrent.v0;
import java.net.InetAddress;
import java.net.URI;
import java.text.Bidi;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.p;
import kotlin.collections.w;
import kotlin.y;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r, androidx.media3.extractor.text.d {
    public Object A;
    public Object B;
    public final Object e;
    public Object y;
    public final Object z;

    public c(androidx.compose.ui.text.g gVar, m0 m0Var, List list, androidx.compose.ui.unit.c cVar, androidx.compose.ui.text.font.d dVar) {
        int i;
        androidx.compose.ui.text.g gVar2 = gVar;
        m0 m0Var2 = m0Var;
        this.y = gVar2;
        this.z = list;
        final int i2 = 0;
        kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a(this) { // from class: androidx.compose.ui.text.o
            public final /* synthetic */ androidx.compose.runtime.internal.c y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.y.B;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fB = ((q) obj3).a.b();
                            int i3 = 1;
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList.get(i3);
                                    float fB2 = ((q) obj4).a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i3 != size) {
                                        i3++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        q qVar = (q) obj;
                        return Float.valueOf(qVar != null ? qVar.a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.y.B;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((q) obj5).a.F.c();
                            int i4 = 1;
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i4);
                                    float fC2 = ((q) obj6).a.F.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        q qVar2 = (q) obj2;
                        return Float.valueOf(qVar2 != null ? qVar2.a.F.c() : 0.0f);
                }
            }
        };
        kotlin.i iVar = kotlin.i.y;
        this.e = kotlin.a.c(iVar, aVar);
        final int i3 = 1;
        this.A = kotlin.a.c(iVar, new kotlin.jvm.functions.a(this) { // from class: androidx.compose.ui.text.o
            public final /* synthetic */ androidx.compose.runtime.internal.c y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.y.B;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fB = ((q) obj3).a.b();
                            int i4 = 1;
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList.get(i4);
                                    float fB2 = ((q) obj4).a.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj3 = obj4;
                                        fB = fB2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        q qVar = (q) obj;
                        return Float.valueOf(qVar != null ? qVar.a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.y.B;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((q) obj5).a.F.c();
                            int i5 = 1;
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float fC2 = ((q) obj6).a.F.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        q qVar2 = (q) obj2;
                        return Float.valueOf(qVar2 != null ? qVar2.a.F.c() : 0.0f);
                }
            }
        });
        s sVar = m0Var2.b;
        androidx.compose.ui.text.g gVar3 = androidx.compose.ui.text.h.a;
        ArrayList arrayList = gVar2.A;
        String str = gVar2.y;
        w wVar = w.e;
        List listW = arrayList != null ? p.W(arrayList, new androidx.compose.ui.text.f(i3)) : wVar;
        ArrayList arrayList2 = new ArrayList();
        kotlin.collections.l lVar = new kotlin.collections.l();
        int size = listW.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            androidx.compose.ui.text.e eVar = (androidx.compose.ui.text.e) listW.get(i4);
            s sVarA = sVar.a((s) eVar.a);
            int i6 = eVar.b;
            int i7 = eVar.c;
            if (i6 > i7) {
                androidx.compose.ui.text.internal.a.a("Reversed range is not supported");
            }
            while (i5 < i6 && !lVar.isEmpty()) {
                androidx.compose.ui.text.e eVar2 = (androidx.compose.ui.text.e) lVar.last();
                listW = listW;
                int i8 = eVar2.c;
                wVar = wVar;
                Object obj = eVar2.a;
                if (i6 < i8) {
                    arrayList2.add(new androidx.compose.ui.text.e(obj, i5, i6));
                    i5 = i6;
                } else {
                    int i9 = size;
                    arrayList2.add(new androidx.compose.ui.text.e(obj, i5, i8));
                    i5 = eVar2.c;
                    while (!lVar.isEmpty() && i5 == ((androidx.compose.ui.text.e) lVar.last()).c) {
                        lVar.removeLast();
                    }
                    size = i9;
                }
            }
            List list2 = listW;
            w wVar2 = wVar;
            int i10 = size;
            if (i5 < i6) {
                arrayList2.add(new androidx.compose.ui.text.e(sVar, i5, i6));
                i5 = i6;
            }
            androidx.compose.ui.text.e eVar3 = (androidx.compose.ui.text.e) lVar.i();
            if (eVar3 != null) {
                int i11 = eVar3.c;
                Object obj2 = eVar3.a;
                int i12 = eVar3.b;
                if (i12 == i6 && i11 == i7) {
                    lVar.removeLast();
                    lVar.addLast(new androidx.compose.ui.text.e(((s) obj2).a(sVarA), i6, i7));
                } else if (i12 == i11) {
                    arrayList2.add(new androidx.compose.ui.text.e(obj2, i12, i11));
                    lVar.removeLast();
                    lVar.addLast(new androidx.compose.ui.text.e(sVarA, i6, i7));
                } else {
                    if (i11 < i7) {
                        kotlinx.coroutines.future.a.r();
                        throw null;
                    }
                    lVar.addLast(new androidx.compose.ui.text.e(((s) obj2).a(sVarA), i6, i7));
                }
            } else {
                lVar.addLast(new androidx.compose.ui.text.e(sVarA, i6, i7));
            }
            i4++;
            listW = list2;
            wVar = wVar2;
            size = i10;
        }
        w wVar3 = wVar;
        while (i5 <= str.length() && !lVar.isEmpty()) {
            androidx.compose.ui.text.e eVar4 = (androidx.compose.ui.text.e) lVar.last();
            Object obj3 = eVar4.a;
            int i13 = eVar4.c;
            arrayList2.add(new androidx.compose.ui.text.e(obj3, i5, i13));
            while (!lVar.isEmpty() && i13 == ((androidx.compose.ui.text.e) lVar.last()).c) {
                lVar.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new androidx.compose.ui.text.e(sVar, i5, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new androidx.compose.ui.text.e(sVar, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = i;
        while (i14 < size2) {
            androidx.compose.ui.text.e eVar5 = (androidx.compose.ui.text.e) arrayList2.get(i14);
            int i15 = eVar5.b;
            int i16 = eVar5.c;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listA = androidx.compose.ui.text.h.a(gVar2, i15, i16, new t3(10));
            androidx.compose.ui.text.g gVar4 = new androidx.compose.ui.text.g(strSubstring, listA == null ? wVar3 : listA);
            s sVar2 = (s) eVar5.a;
            if (sVar2.b == 0) {
                sVar2 = new s(sVar2.a, sVar.b, sVar2.c, sVar2.d, sVar2.e, sVar2.f, sVar2.g, sVar2.h, sVar2.i);
            }
            m0 m0Var3 = new m0(m0Var2.a, sVar.a(sVar2));
            List list3 = gVar4.e;
            List list4 = list3 == null ? wVar3 : list3;
            List list5 = (List) this.z;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i17 = 0;
            while (i17 < size3) {
                androidx.compose.ui.text.e eVar6 = (androidx.compose.ui.text.e) list5.get(i17);
                int i18 = eVar6.b;
                s sVar3 = sVar;
                int i19 = eVar6.c;
                if (androidx.compose.ui.text.h.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        androidx.compose.ui.text.internal.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new androidx.compose.ui.text.e(eVar6.a, i18 - i15, i19 - i15));
                }
                i17++;
                list5 = list5;
                sVar = sVar3;
            }
            arrayList3.add(new q(new androidx.compose.ui.text.platform.d(strSubstring, m0Var3, list4, arrayList4, dVar, cVar), i15, i16));
            i14++;
            gVar2 = gVar;
            m0Var2 = m0Var;
            str = str;
            arrayList2 = arrayList2;
        }
        this.B = arrayList3;
    }

    public static c q(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        c cVar = new c(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) cVar.A)) {
            try {
                ((ArrayDeque) cVar.A).clear();
                String string = ((SharedPreferences) cVar.e).getString((String) cVar.y, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) cVar.z)) {
                    String[] strArrSplit = string.split((String) cVar.z, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) cVar.A).add(str);
                        }
                    }
                    return cVar;
                }
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int A(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.e).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kotlin.jvm.internal.l.b(cCharAt, 8192) < 0 || kotlin.jvm.internal.l.b(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public androidx.recyclerview.widget.a B(int i, int i2, int i3) {
        androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) ((androidx.constraintlayout.core.d) this.e).a();
        if (aVar != null) {
            aVar.a = i;
            aVar.b = i2;
            aVar.c = i3;
            return aVar;
        }
        androidx.recyclerview.widget.a aVar2 = new androidx.recyclerview.widget.a();
        aVar2.a = i;
        aVar2.b = i2;
        aVar2.c = i3;
        return aVar2;
    }

    public void C(androidx.recyclerview.widget.a aVar) {
        t tVar = (t) this.A;
        ((ArrayList) this.z).add(aVar);
        int i = aVar.a;
        if (i == 1) {
            tVar.d(aVar.b, aVar.c);
            return;
        }
        if (i == 2) {
            int i2 = aVar.b;
            int i3 = aVar.c;
            RecyclerView recyclerView = tVar.a;
            recyclerView.L(i2, i3, false);
            recyclerView.D0 = true;
            return;
        }
        if (i == 4) {
            tVar.c(aVar.b, aVar.c);
        } else if (i == 8) {
            tVar.e(aVar.b, aVar.c);
        } else {
            com.google.firebase.platforminfo.b.f(aVar, "Unknown update op type for ");
        }
    }

    public void D(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i);
            aVar.getClass();
            ((androidx.constraintlayout.core.d) this.e).c(aVar);
        }
        arrayList.clear();
    }

    public void E(com.google.android.datatransport.a aVar, com.google.android.datatransport.g gVar) {
        com.google.android.datatransport.runtime.s sVar = (com.google.android.datatransport.runtime.s) this.B;
        com.google.android.datatransport.runtime.k kVar = (com.google.android.datatransport.runtime.k) this.e;
        String str = (String) this.y;
        com.google.android.datatransport.e eVar = (com.google.android.datatransport.e) this.A;
        if (eVar == null) {
            com.google.firebase.platforminfo.b.h("Null transformer");
            return;
        }
        com.google.android.datatransport.c cVar = (com.google.android.datatransport.c) this.z;
        com.google.android.datatransport.runtime.scheduling.a aVar2 = sVar.c;
        com.google.android.datatransport.runtime.k kVarB = kVar.b(aVar.b);
        a1 a1Var = new a1();
        a1Var.g = new HashMap();
        a1Var.e = Long.valueOf(sVar.a.c());
        a1Var.f = Long.valueOf(sVar.b.c());
        a1Var.b = str;
        a1Var.d = new com.google.android.datatransport.runtime.m(cVar, (byte[]) eVar.apply(aVar.a));
        a1Var.c = null;
        com.google.android.datatransport.b bVar = aVar.c;
        if (bVar != null) {
            a1Var.h = bVar.a;
        }
        aVar2.b.execute(new androidx.work.impl.h(aVar2, kVarB, gVar, a1Var.c(), 2));
    }

    public void F(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.e).put(str, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) ((LinkedHashMap) this.z).get(str);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) ((LinkedHashMap) this.A).get(str);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(obj);
        }
    }

    public int G(int i, int i2) {
        int i3;
        int i4;
        androidx.constraintlayout.core.d dVar = (androidx.constraintlayout.core.d) this.e;
        ArrayList arrayList = (ArrayList) this.z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(size);
            int i5 = aVar.a;
            int i6 = aVar.b;
            if (i5 == 8) {
                int i7 = aVar.c;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            aVar.b = i6 + 1;
                            aVar.c = i7 + 1;
                        } else if (i2 == 2) {
                            aVar.b = i6 - 1;
                            aVar.c = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        aVar.c = i7 + 1;
                    } else if (i2 == 2) {
                        aVar.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        aVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        aVar.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= aVar.c;
                } else if (i5 == 2) {
                    i += aVar.c;
                }
            } else if (i2 == 1) {
                aVar.b = i6 + 1;
            } else if (i2 == 2) {
                aVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) arrayList.get(size2);
            int i8 = aVar2.a;
            int i9 = aVar2.c;
            if (i8 == 8) {
                if (i9 == aVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    dVar.c(aVar2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                dVar.c(aVar2);
            }
        }
        return i;
    }

    @Override // androidx.compose.ui.text.r
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((q) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    @Override // androidx.compose.ui.text.r
    public float b() {
        return ((Number) this.e.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    @Override // androidx.compose.ui.text.r
    public float c() {
        return ((Number) this.A.getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0159  */
    /* JADX WARN: Code duplicated, block: B:53:0x019b A[Catch: all -> 0x01ac, TryCatch #0 {all -> 0x01ac, blocks: (B:50:0x0165, B:51:0x0195, B:53:0x019b, B:55:0x01a8, B:58:0x01ae, B:59:0x01b2, B:61:0x01b8, B:62:0x01c5), top: B:92:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8 A[Catch: all -> 0x01ac, LOOP:2: B:59:0x01b2->B:61:0x01b8, LOOP_END, TryCatch #0 {all -> 0x01ac, blocks: (B:50:0x0165, B:51:0x0195, B:53:0x019b, B:55:0x01a8, B:58:0x01ae, B:59:0x01b2, B:61:0x01b8, B:62:0x01c5), top: B:92:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX WARN: Code duplicated, block: B:72:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0210  */
    /* JADX WARN: Code duplicated, block: B:82:0x0219  */
    /* JADX WARN: Code duplicated, block: B:84:0x021f  */
    /* JADX WARN: Code duplicated, block: B:86:0x023b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0159, please report this as an issue */
    public Object d(int i, String str, kotlin.coroutines.jvm.internal.c cVar) {
        u5 u5Var;
        String str2;
        c cVar2;
        int i2;
        int port;
        String hostName;
        net.luminis.quic.impl.n nVar;
        int i3;
        net.luminis.quic.impl.n nVar2;
        boolean z;
        z0 z0Var;
        Object lVar;
        Throwable thA;
        net.luminis.quic.impl.i iVar;
        String message;
        String strS;
        ArrayList arrayList;
        Iterator it;
        g4 g4Var;
        if (cVar instanceof u5) {
            u5Var = (u5) cVar;
            int i4 = u5Var.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                u5Var.C = i4 - Integer.MIN_VALUE;
            } else {
                u5Var = new u5(this, cVar);
            }
        } else {
            u5Var = new u5(this, cVar);
        }
        Object objWithContext = u5Var.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i5 = u5Var.C;
        kotlin.coroutines.d dVar = null;
        if (i5 == 0) {
            kotlin.a.e(objWithContext);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) this.A;
            u0 u0Var = new u0(this, str, dVar, 12);
            u5Var.e = this;
            u5Var.y = str;
            u5Var.z = i;
            u5Var.C = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, u0Var, u5Var);
            if (objWithContext == aVar) {
                return aVar;
            }
            str2 = str;
            cVar2 = this;
            i2 = i;
        } else {
            if (i5 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = u5Var.z;
            str2 = u5Var.y;
            cVar2 = u5Var.e;
            kotlin.a.e(objWithContext);
        }
        InetAddress inetAddress = (InetAddress) objWithContext;
        androidx.work.impl.k kVar = (androidx.work.impl.k) cVar2.y;
        Objects.toString(inetAddress);
        ((g4) kVar.y).getClass();
        ((com.app.mlounge.ui.theme.f) cVar2.z).getClass();
        net.luminis.quic.impl.a aVar2 = new net.luminis.quic.impl.a();
        ArrayList arrayList2 = new ArrayList();
        aVar2.a = 60000;
        int i6 = 3;
        aVar2.b = 3;
        aVar2.c = 3;
        aVar2.d = 2500000L;
        aVar2.e = 250000L;
        aVar2.f = 250000L;
        aVar2.g = 2;
        aVar2.h = 1500;
        if (inetAddress == null) {
            URI uri = new URI("udp://" + str2 + ':' + i2);
            hostName = uri.getHost();
            port = uri.getPort();
            inetAddress = null;
        } else {
            port = i2;
            hostName = inetAddress.getHostName();
        }
        androidx.work.impl.k kVar2 = (androidx.work.impl.k) cVar2.y;
        r0 r0Var = new r0();
        r0Var.y = kVar2;
        r0Var.e = new SimpleDateFormat("mm:ss.SSS");
        aVar2.c = 1;
        aVar2.b = 100000;
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) cVar2.A;
        if (hostName == null) {
            kotlinx.coroutines.future.a.u("Cannot create connection when URI is not set");
            return null;
        }
        int length = "exit-node".length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = "exit-node".codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                if (10000 < 1) {
                    kotlinx.coroutines.future.a.q("Connect timeout must be larger than 0.");
                    return null;
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(net.luminis.tls.c.TLS_AES_128_GCM_SHA256);
                }
                ArrayList arrayList3 = arrayList2;
                int iE = androidx.constraintlayout.core.g.e(1);
                try {
                    if (iE != 0) {
                        if (iE != 1) {
                            i3 = i6;
                            z = false;
                            nVar2 = null;
                        } else {
                            nVar = net.luminis.quic.impl.n.c;
                        }
                        net.luminis.quic.impl.i iVar2 = new net.luminis.quic.impl.i(inetAddress, hostName, port, "exit-node", 10000L, aVar2, nVar2, r0Var, arrayList3);
                        z0Var = new z0(iVar2, coroutineDispatcher2);
                        iVar2.b();
                        lVar = z0Var;
                        thA = kotlin.m.a(lVar);
                        if (thA != null) {
                            androidx.work.impl.k kVar3 = (androidx.work.impl.k) cVar2.y;
                            message = thA.getMessage();
                            if (message != null) {
                                try {
                                    ArrayList arrayListO = p.O(p.O(kotlin.text.k.U("creapslpinut.com; gapslpinch.com", new String[]{";"}, 6), kotlin.text.k.U("grasplpond.com; clapslport.com", new String[]{";"}, 6)), kotlin.text.k.U("scapslwshell.com; trapslwsin.com", new String[]{";"}, 6));
                                    arrayList = new ArrayList();
                                    for (Object obj : arrayListO) {
                                        if (kotlin.text.k.z(message, (CharSequence) obj, z)) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        message = kotlin.text.r.s(message, (String) it.next(), "host", true);
                                    }
                                    strS = kotlin.text.r.s(message, "quic", "protocol", true);
                                } catch (Throwable th) {
                                    Object lVar2 = new kotlin.l(th);
                                    if (kotlin.m.a(lVar2) != null) {
                                        lVar2 = "";
                                    }
                                    strS = (String) lVar2;
                                }
                            } else {
                                strS = "";
                            }
                            g4Var = (g4) kVar3.y;
                            g4Var.getClass();
                            if (g4.b) {
                                g4Var.a(1, "Unable to connect to server".concat(!kotlin.text.k.J(strS) ? ": ".concat(strS) : ""));
                            }
                            ((g4) ((androidx.work.impl.k) cVar2.y).y).getClass();
                        }
                        if (!(lVar instanceof kotlin.l)) {
                            iVar = z0Var.a;
                            if (iVar.L == i3) {
                                kotlinx.coroutines.future.a.u("keep alive can only be set when connected");
                                return null;
                            }
                            if (iVar.F.f) {
                                iVar.f0 = new androidx.compose.foundation.lazy.grid.l(iVar.e, (int) iVar.F.b, iVar.T);
                            }
                            ((g4) ((androidx.work.impl.k) cVar2.y).y).getClass();
                        }
                        return lVar;
                    }
                    nVar = net.luminis.quic.impl.n.b;
                    iVar2.b();
                    lVar = z0Var;
                } catch (Throwable th2) {
                    lVar = new kotlin.l(th2);
                }
                i3 = i6;
                nVar2 = nVar;
                z = false;
                net.luminis.quic.impl.i iVar3 = new net.luminis.quic.impl.i(inetAddress, hostName, port, "exit-node", 10000L, aVar2, nVar2, r0Var, arrayList3);
                z0Var = new z0(iVar3, coroutineDispatcher2);
                thA = kotlin.m.a(lVar);
                if (thA != null) {
                    androidx.work.impl.k kVar4 = (androidx.work.impl.k) cVar2.y;
                    message = thA.getMessage();
                    if (message != null) {
                        ArrayList arrayListO2 = p.O(p.O(kotlin.text.k.U("creapslpinut.com; gapslpinch.com", new String[]{";"}, 6), kotlin.text.k.U("grasplpond.com; clapslport.com", new String[]{";"}, 6)), kotlin.text.k.U("scapslwshell.com; trapslwsin.com", new String[]{";"}, 6));
                        arrayList = new ArrayList();
                        while (r3.hasNext()) {
                            if (kotlin.text.k.z(message, (CharSequence) obj, z)) {
                                arrayList.add(obj);
                            }
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            message = kotlin.text.r.s(message, (String) it.next(), "host", true);
                        }
                        strS = kotlin.text.r.s(message, "quic", "protocol", true);
                    } else {
                        strS = "";
                    }
                    g4Var = (g4) kVar4.y;
                    g4Var.getClass();
                    if (g4.b) {
                        g4Var.a(1, "Unable to connect to server".concat(!kotlin.text.k.J(strS) ? ": ".concat(strS) : ""));
                    }
                    ((g4) ((androidx.work.impl.k) cVar2.y).y).getClass();
                }
                if (!(lVar instanceof kotlin.l)) {
                    iVar = z0Var.a;
                    if (iVar.L == i3) {
                        kotlinx.coroutines.future.a.u("keep alive can only be set when connected");
                        return null;
                    }
                    if (iVar.F.f) {
                        iVar.f0 = new androidx.compose.foundation.lazy.grid.l(iVar.e, (int) iVar.F.b, iVar.T);
                    }
                    ((g4) ((androidx.work.impl.k) cVar2.y).y).getClass();
                }
                return lVar;
            }
            iCharCount += Character.charCount(iCodePointAt);
            i6 = i6;
            inetAddress = inetAddress;
            r0Var = r0Var;
            arrayList2 = arrayList2;
        }
        kotlinx.coroutines.future.a.u("Application protocol must be set");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e(int i, kotlin.coroutines.jvm.internal.c cVar) {
        r5 r5Var;
        n0 n0Var;
        Object objD;
        c cVar2;
        o0 o0Var = (o0) this.e;
        if (cVar instanceof r5) {
            r5Var = (r5) cVar;
            int i2 = r5Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5Var.A = i2 - Integer.MIN_VALUE;
            } else {
                r5Var = new r5(this, cVar);
            }
        } else {
            r5Var = new r5(this, cVar);
        }
        Object obj = r5Var.y;
        int i3 = r5Var.A;
        if (i3 == 0) {
            kotlin.a.e(obj);
            int iE = androidx.constraintlayout.core.g.e(i);
            if (iE == 0) {
                c2 c2Var = o0Var.g;
                if (c2Var == null) {
                    ArrayList arrayListM = p.M(o0Var.a, o0Var.e);
                    kotlin.random.a aVar = kotlin.random.d.e;
                    n0Var = (n0) p.Q(arrayListM);
                    if (n0Var == null) {
                        n0Var = o0Var.e;
                    }
                    o0Var.e = n0Var;
                } else if (kotlin.time.a.e(kotlin.time.f.a(((kotlin.time.f) c2Var.y).e), o0.h) < 0) {
                    ArrayList arrayListM2 = p.M((ArrayList) c2Var.z, o0Var.e);
                    kotlin.random.a aVar2 = kotlin.random.d.e;
                    n0Var = (n0) p.Q(arrayListM2);
                    if (n0Var == null) {
                        n0Var = o0Var.e;
                    }
                    o0Var.e = n0Var;
                } else {
                    o0Var.g = null;
                    ArrayList arrayListM3 = p.M(o0Var.a, o0Var.e);
                    kotlin.random.a aVar3 = kotlin.random.d.e;
                    n0Var = (n0) p.Q(arrayListM3);
                    if (n0Var == null) {
                        n0Var = o0Var.e;
                    }
                    o0Var.e = n0Var;
                }
                o0Var.c.a.getClass();
            } else {
                if (iE != 1) {
                    coil3.g.a();
                    return null;
                }
                c2 c2Var2 = o0Var.g;
                if (c2Var2 == null) {
                    ArrayList arrayListM4 = p.M(o0Var.b, o0Var.f);
                    kotlin.random.a aVar4 = kotlin.random.d.e;
                    n0Var = (n0) p.Q(arrayListM4);
                    if (n0Var == null) {
                        n0Var = o0Var.f;
                    }
                    o0Var.f = n0Var;
                } else if (kotlin.time.a.e(kotlin.time.f.a(((kotlin.time.f) c2Var2.y).e), o0.h) < 0) {
                    ArrayList arrayListM5 = p.M((ArrayList) c2Var2.A, o0Var.f);
                    kotlin.random.a aVar5 = kotlin.random.d.e;
                    n0Var = (n0) p.Q(arrayListM5);
                    if (n0Var == null) {
                        n0Var = o0Var.f;
                    }
                    o0Var.f = n0Var;
                } else {
                    o0Var.g = null;
                    ArrayList arrayListM6 = p.M(o0Var.b, o0Var.f);
                    kotlin.random.a aVar6 = kotlin.random.d.e;
                    n0Var = (n0) p.Q(arrayListM6);
                    if (n0Var == null) {
                        n0Var = o0Var.f;
                    }
                    o0Var.f = n0Var;
                }
                o0Var.c.a.getClass();
            }
            String str = n0Var.a;
            int i4 = n0Var.b;
            r5Var.e = this;
            r5Var.A = 1;
            objD = d(i4, str, r5Var);
            kotlin.coroutines.intrinsics.a aVar7 = kotlin.coroutines.intrinsics.a.e;
            if (objD == aVar7) {
                return aVar7;
            }
            cVar2 = this;
        } else {
            if (i3 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar2 = r5Var.e;
            kotlin.a.e(obj);
            objD = ((kotlin.m) obj).e;
        }
        androidx.work.impl.k kVar = (androidx.work.impl.k) cVar2.y;
        if (objD != null) {
            objD.hashCode();
        }
        ((g4) kVar.y).getClass();
        return objD;
    }

    @Override // androidx.media3.extractor.text.d
    public int f(long j) {
        long[] jArr = (long[]) this.y;
        int iB = i0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.d
    public long g(int i) {
        return ((long[]) this.y)[i];
    }

    public boolean h() {
        Object lVar;
        boolean z;
        Object lVar2;
        Object lVar3;
        g4 g4Var = (g4) this.B;
        Object lVar4 = y.a;
        ((w3) this.e).getClass();
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new com.appsalt.internal.t3(2, null), 1, null);
            lVar = lVar4;
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        Throwable thA = kotlin.m.a(lVar);
        if (thA != null) {
            lVar = !(thA instanceof TimeoutCancellationException) ? new kotlin.l(thA) : lVar4;
        }
        if (kotlin.m.a(lVar) != null) {
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(1, String.format("Missing %1$s dependency, add %1$s dependency to you project\ncheck installation guide for instructions https://developers.honeygain.com/docs/integration-guides/android#installation", Arrays.copyOf(new Object[]{"kotlinx-coroutines-core"}, 1)));
            }
            z = false;
        } else {
            z = true;
        }
        ((j0) this.y).getClass();
        try {
            w4 w4VarE = c0.e();
            w4VarE.c();
            c0 c0Var = (c0) w4VarE.y;
            c0Var.getClass();
            c0Var.id_ = "AAAA";
            w4VarE.a();
            lVar2 = lVar4;
        } catch (Throwable th2) {
            lVar2 = new kotlin.l(th2);
        }
        if (kotlin.m.a(lVar2) != null) {
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(1, String.format("Missing %1$s dependency, add %1$s dependency to you project\ncheck installation guide for instructions https://developers.honeygain.com/docs/integration-guides/android#installation", Arrays.copyOf(new Object[]{"protobuf-javalite"}, 1)));
            }
            z = false;
        }
        ((j0) this.z).getClass();
        try {
            org.msgpack.core.f fVar = org.msgpack.core.h.b;
            fVar.getClass();
            new org.msgpack.core.a(fVar);
            lVar3 = lVar4;
        } catch (Throwable th3) {
            lVar3 = new kotlin.l(th3);
        }
        if (kotlin.m.a(lVar3) != null) {
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(1, String.format("Missing %1$s dependency, add %1$s dependency to you project\ncheck installation guide for instructions https://developers.honeygain.com/docs/integration-guides/android#installation", Arrays.copyOf(new Object[]{"msgpack-core"}, 1)));
            }
            z = false;
        }
        ((j0) this.A).getClass();
        try {
            new okhttp3.y(new x());
        } catch (Throwable th4) {
            lVar4 = new kotlin.l(th4);
        }
        if (kotlin.m.a(lVar4) == null) {
            return z;
        }
        g4Var.getClass();
        if (!g4.b) {
            return false;
        }
        g4Var.a(1, String.format("Missing %1$s dependency, add %1$s dependency to you project\ncheck installation guide for instructions https://developers.honeygain.com/docs/integration-guides/android#installation", Arrays.copyOf(new Object[]{"okhttp"}, 1)));
        return false;
    }

    public void i(coil3.fetch.h hVar, kotlin.jvm.internal.e eVar) {
        ((ArrayList) this.A).add(new androidx.activity.compose.f(27, hVar, eVar));
    }

    public void j(coil3.map.a aVar, kotlin.jvm.internal.e eVar) {
        ((ArrayList) this.y).add(new kotlin.k(aVar, eVar));
    }

    @Override // androidx.media3.extractor.text.d
    public List k(long j) {
        androidx.media3.extractor.text.ttml.c cVar = (androidx.media3.extractor.text.ttml.c) this.e;
        Map map = (Map) this.z;
        HashMap map2 = (HashMap) this.A;
        HashMap map3 = (HashMap) this.B;
        ArrayList<Pair> arrayList = new ArrayList();
        cVar.g(j, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j, false, cVar.h, treeMap);
        cVar.h(j, map, map2, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                androidx.media3.extractor.text.ttml.f fVar = (androidx.media3.extractor.text.ttml.f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new androidx.media3.common.text.b(null, null, null, bitmapDecodeByteArray, fVar.c, 0, fVar.e, fVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f, fVar.g, false, -16777216, fVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            androidx.media3.extractor.text.ttml.f fVar2 = (androidx.media3.extractor.text.ttml.f) map2.get(entry.getKey());
            fVar2.getClass();
            androidx.media3.common.text.a aVar = (androidx.media3.common.text.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (androidx.media3.extractor.text.ttml.a aVar2 : (androidx.media3.extractor.text.ttml.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), androidx.media3.extractor.text.ttml.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = fVar2.c;
            int i9 = fVar2.d;
            aVar.e = f;
            aVar.f = i9;
            aVar.g = fVar2.e;
            aVar.h = fVar2.b;
            aVar.l = fVar2.f;
            float f2 = fVar2.i;
            int i10 = fVar2.h;
            aVar.k = f2;
            aVar.j = i10;
            aVar.p = fVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // androidx.media3.extractor.text.d
    public int l() {
        return ((long[]) this.y).length;
    }

    public androidx.compose.runtime.g m(b bVar, kotlin.jvm.functions.a aVar) {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.e = -1;
        synchronized (this.e) {
            Throwable th = (Throwable) this.y;
            if (th != null) {
                bVar.b(th);
                return androidx.compose.runtime.f.y;
            }
            a aVar2 = (a) this.z;
            do {
                i = aVar2.get();
                i2 = i + 1;
            } while (!aVar2.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            xVar.e = (i2 >>> 27) & 15;
            ((androidx.collection.j0) this.A).a(bVar);
            if (z && aVar != null) {
                try {
                    aVar.invoke();
                } catch (Throwable th2) {
                    synchronized (this.e) {
                        try {
                            if (((Throwable) this.y) == null) {
                                this.y = th2;
                                androidx.collection.j0 j0Var = (androidx.collection.j0) this.A;
                                Object[] objArr = j0Var.a;
                                int i4 = j0Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((b) objArr[i5]).b(th2);
                                }
                                ((androidx.collection.j0) this.A).d();
                                a aVar3 = (a) this.z;
                                do {
                                    i3 = aVar3.get();
                                } while (!aVar3.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new androidx.compose.foundation.text.input.internal.o(new androidx.compose.foundation.gestures.g(7, bVar, this, xVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi n(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.e;
        ArrayList arrayList = (ArrayList) this.y;
        ArrayList arrayList2 = (ArrayList) this.z;
        boolean[] zArr = (boolean[]) this.A;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.B;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(y(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.B;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.B = cArr2;
        return bidi;
    }

    public boolean o(int i) {
        ArrayList arrayList = (ArrayList) this.z;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i2);
            int i3 = aVar.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = aVar.b;
                    int i5 = aVar.c + i4;
                    while (i4 < i5) {
                        if (t(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (t(aVar.c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void p() {
        t tVar = (t) this.A;
        ArrayList arrayList = (ArrayList) this.z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((t) this.A).a((androidx.recyclerview.widget.a) arrayList.get(i));
        }
        D(arrayList);
        ArrayList arrayList2 = (ArrayList) this.y;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList2.get(i2);
            int i3 = aVar.a;
            if (i3 == 1) {
                tVar.a(aVar);
                tVar.d(aVar.b, aVar.c);
            } else if (i3 == 2) {
                tVar.a(aVar);
                int i4 = aVar.b;
                int i5 = aVar.c;
                RecyclerView recyclerView = tVar.a;
                recyclerView.L(i4, i5, true);
                recyclerView.D0 = true;
                recyclerView.A0.c += i5;
            } else if (i3 == 4) {
                tVar.a(aVar);
                tVar.c(aVar.b, aVar.c);
            } else if (i3 == 8) {
                tVar.a(aVar);
                tVar.e(aVar.b, aVar.c);
            }
        }
        D(arrayList2);
    }

    public void r(androidx.recyclerview.widget.a aVar) {
        int i;
        androidx.constraintlayout.core.d dVar = (androidx.constraintlayout.core.d) this.e;
        int i2 = aVar.a;
        if (i2 == 1 || i2 == 8) {
            kotlinx.coroutines.future.a.q("should not dispatch add or move for pre layout");
            return;
        }
        int iG = G(aVar.b, i2);
        int i3 = aVar.b;
        int i4 = aVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                com.google.firebase.platforminfo.b.f(aVar, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < aVar.c; i6++) {
            int iG2 = G((i * i6) + aVar.b, aVar.a);
            int i7 = aVar.a;
            if (i7 == 2 ? iG2 != iG : !(i7 == 4 && iG2 == iG + 1)) {
                androidx.recyclerview.widget.a aVarB = B(i7, iG, i5);
                s(aVarB, i3);
                dVar.c(aVarB);
                if (aVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iG = iG2;
            } else {
                i5++;
            }
        }
        dVar.c(aVar);
        if (i5 > 0) {
            androidx.recyclerview.widget.a aVarB2 = B(aVar.a, iG, i5);
            s(aVarB2, i3);
            dVar.c(aVarB2);
        }
    }

    public void s(androidx.recyclerview.widget.a aVar, int i) {
        t tVar = (t) this.A;
        tVar.a(aVar);
        int i2 = aVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                tVar.c(i, aVar.c);
                return;
            } else {
                kotlinx.coroutines.future.a.q("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = aVar.c;
        RecyclerView recyclerView = tVar.a;
        recyclerView.L(i, i3, true);
        recyclerView.D0 = true;
        recyclerView.A0.c += i3;
    }

    public int t(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.z;
        int size = arrayList.size();
        while (i2 < size) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i2);
            int i3 = aVar.a;
            int i4 = aVar.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = aVar.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (aVar.c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = aVar.c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += aVar.c;
            }
            i2++;
        }
        return i;
    }

    public void u(kotlin.jvm.functions.l lVar) {
        int i;
        synchronized (this.e) {
            try {
                androidx.collection.j0 j0Var = (androidx.collection.j0) this.A;
                this.A = (androidx.collection.j0) this.B;
                this.B = j0Var;
                a aVar = (a) this.z;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = j0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    lVar.invoke(j0Var.f(i3));
                }
                j0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float v(int i, boolean z) {
        Layout layout = (Layout) this.e;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float w(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iA = i;
        Layout layout = (Layout) this.e;
        if (!z2) {
            return v(i, z);
        }
        int iN = com.imsdk.a.n(layout, iA, z2);
        int lineStart = layout.getLineStart(iN);
        int lineEnd = layout.getLineEnd(iN);
        if (iA != lineStart && iA != lineEnd) {
            return v(i, z);
        }
        if (iA == 0 || iA == layout.getText().length()) {
            return v(i, z);
        }
        int iX = x(iA, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(y(iX))) == -1;
        int iA2 = A(lineEnd, lineStart);
        int iY = y(iX);
        int i4 = lineStart - iY;
        int i5 = iA2 - iY;
        Bidi bidiN = n(iX);
        Bidi bidiCreateLineBidi = bidiN != null ? bidiN.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return iA == lineStart ? z3 : !z3 ? layout.getLineLeft(iN) : layout.getLineRight(iN);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        androidx.compose.ui.text.android.g[] gVarArr = new androidx.compose.ui.text.android.g[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            gVarArr[i6] = new androidx.compose.ui.text.android.g(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, gVarArr, 0, runCount);
        if (iA == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (gVarArr[i8].a == iA) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == gVarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iN);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(gVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(gVarArr[i3 + 1].a);
            }
            return layout.getLineRight(iN);
        }
        if (iA > iA2) {
            iA = A(iA, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (gVarArr[i9].b == iA) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == gVarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iN);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(gVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(gVarArr[i2 + 1].b);
        }
        return layout.getLineRight(iN);
    }

    public int x(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.y;
        int iB = kotlin.collections.q.b(arrayList, Integer.valueOf(i));
        int i2 = iB < 0 ? -(iB + 1) : iB + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int y(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.y).get(i - 1)).intValue();
    }

    public boolean z() {
        return ((ArrayList) this.y).size() > 0;
    }

    public c(g4 g4Var) {
        w3 w3Var = new w3();
        j0 j0Var = b0.e;
        j0 j0Var2 = b0.b;
        j0 j0Var3 = b0.a;
        this.e = w3Var;
        this.y = j0Var;
        this.z = j0Var2;
        this.A = j0Var3;
        this.B = g4Var;
    }

    public c(v0 v0Var, td tdVar, HashMap map) {
        this.e = new ConcurrentHashMap();
        v0Var.getClass();
        this.y = v0Var;
        tdVar.getClass();
        this.z = tdVar;
        this.B = map;
        _COROUTINE.a.o(!map.isEmpty());
        this.A = db.c;
    }

    public c(Map map) {
        map.getClass();
        this.e = new LinkedHashMap(map);
        this.y = new LinkedHashMap();
        this.z = new LinkedHashMap();
        this.A = new LinkedHashMap();
        this.B = new androidx.activity.g(this, 2);
    }

    public c() {
        this.e = new Object();
        this.z = new a(0);
        this.A = new androidx.collection.j0();
        this.B = new androidx.collection.j0();
    }

    public c(Layout layout) {
        this.e = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iG = kotlin.text.k.G(((Layout) this.e).getText(), '\n', length, 4);
            length = iG < 0 ? ((Layout) this.e).getText().length() : iG + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.e).getText().length());
        this.y = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.z = arrayList2;
        this.A = new boolean[((ArrayList) this.y).size()];
        ((ArrayList) this.y).size();
    }

    public c(com.google.android.datatransport.runtime.k kVar, String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.e eVar, com.google.android.datatransport.runtime.s sVar) {
        this.e = kVar;
        this.y = str;
        this.z = cVar;
        this.A = eVar;
        this.B = sVar;
    }

    public c(androidx.media3.extractor.text.ttml.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.e = cVar;
        this.A = map2;
        this.B = map3;
        this.z = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.y = jArr;
    }

    public c(o0 o0Var, androidx.work.impl.k kVar, com.appsalt.internal.x xVar) {
        com.app.mlounge.ui.theme.f fVar = b0.c;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        this.e = o0Var;
        this.y = kVar;
        this.z = fVar;
        this.A = io2;
        this.B = xVar;
    }

    public c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.A = new ArrayDeque();
        this.e = sharedPreferences;
        this.y = "topic_operation_queue";
        this.z = ",";
        this.B = scheduledThreadPoolExecutor;
    }

    public c(t tVar) {
        this.e = new androidx.constraintlayout.core.d(30);
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = tVar;
        this.B = new androidx.media3.exoplayer.dash.manifest.t(this);
    }

    public c(coil3.d dVar) {
        this.e = p.c0(dVar.a);
        this.y = p.c0(dVar.b);
        this.z = p.c0(dVar.c);
        List list = (List) dVar.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new androidx.navigation.internal.h((kotlin.k) it.next(), 10));
        }
        this.A = arrayList;
        List list2 = (List) dVar.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new coil3.c((coil3.decode.j) it2.next(), 1));
        }
        this.B = arrayList2;
    }
}
