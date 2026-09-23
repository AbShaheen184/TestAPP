package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.text.u0;
import androidx.compose.material3.y1;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.saveable.l;
import androidx.compose.runtime.snapshots.q;
import androidx.compose.runtime.snapshots.u;
import androidx.compose.runtime.t;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.vector.v;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.w1;
import androidx.compose.ui.platform.x1;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.l0;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import androidx.media3.exoplayer.source.t0;
import androidx.navigation.compose.m;
import androidx.navigation.compose.n;
import androidx.work.f0;
import androidx.work.i0;
import androidx.work.z;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.collections.g0;
import kotlin.jvm.functions.p;
import kotlin.text.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static ClassLoader a;
    public static Thread b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static androidx.compose.ui.graphics.vector.f i;
    public static androidx.compose.ui.graphics.vector.f j;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    public static final androidx.work.a B(int i2) {
        if (i2 == 0) {
            return androidx.work.a.e;
        }
        if (i2 == 1) {
            return androidx.work.a.y;
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not convert ", i2, " to BackoffPolicy"));
        return null;
    }

    public static final z C(int i2) {
        if (i2 == 0) {
            return z.e;
        }
        if (i2 == 1) {
            return z.y;
        }
        if (i2 == 2) {
            return z.z;
        }
        if (i2 == 3) {
            return z.A;
        }
        if (i2 == 4) {
            return z.B;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return z.C;
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not convert ", i2, " to NetworkType"));
        return null;
    }

    public static final f0 D(int i2) {
        if (i2 == 0) {
            return f0.e;
        }
        if (i2 == 1) {
            return f0.y;
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not convert ", i2, " to OutOfQuotaPolicy"));
        return null;
    }

    public static final i0 E(int i2) {
        if (i2 == 0) {
            return i0.e;
        }
        if (i2 == 1) {
            return i0.y;
        }
        if (i2 == 2) {
            return i0.z;
        }
        if (i2 == 3) {
            return i0.A;
        }
        if (i2 == 4) {
            return i0.B;
        }
        if (i2 == 5) {
            return i0.C;
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("Could not convert ", i2, " to State"));
        return null;
    }

    public static int G(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("x (", i2, ") must be > 0"));
            return 0;
        }
        switch (com.google.common.math.d.a[roundingMode.ordinal()]) {
            case 1:
                t1.o((i2 > 0) & (((i2 + (-1)) & i2) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i2))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static final int H(z zVar) {
        zVar.getClass();
        int iOrdinal = zVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3) {
                    i2 = 4;
                    if (iOrdinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && zVar == z.C) {
                            return 5;
                        }
                        t0.m(zVar, " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static final void M(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final byte[] N(Set set) throws IOException {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    androidx.work.d dVar = (androidx.work.d) it.next();
                    objectOutputStream.writeUTF(dVar.a.toString());
                    objectOutputStream.writeBoolean(dVar.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dagger.internal.d.b(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static void O(View view, com.google.android.material.shape.i iVar) {
        com.google.android.material.elevation.a aVar = iVar.y.c;
        if (aVar == null || !aVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        com.google.android.material.shape.g gVar = iVar.y;
        if (gVar.m != elevation) {
            gVar.m = elevation;
            iVar.s();
        }
    }

    public static final int P(i0 i0Var) {
        i0Var.getClass();
        int iOrdinal = i0Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3) {
                    i2 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        coil3.g.a();
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static final androidx.work.impl.utils.f Q(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new androidx.work.impl.utils.f(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i2 = objectInputStream.readInt();
                int[] iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = objectInputStream.readInt();
                }
                int i4 = objectInputStream.readInt();
                int[] iArr2 = new int[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr2[i5] = objectInputStream.readInt();
                }
                androidx.work.impl.utils.f fVarA = androidx.work.impl.utils.a.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return fVarA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dagger.internal.d.b(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final long S(long j2, long j3) {
        int iD;
        int iF = l0.f(j2);
        int iE = l0.e(j2);
        if ((l0.f(j3) < l0.e(j2)) && (l0.f(j2) < l0.e(j3))) {
            if ((l0.f(j3) <= l0.f(j2)) && (l0.e(j2) <= l0.e(j3))) {
                iF = l0.f(j3);
                iE = iF;
            } else {
                if ((l0.f(j2) <= l0.f(j3)) && (l0.e(j3) <= l0.e(j2))) {
                    iD = l0.d(j3);
                } else {
                    int iF2 = l0.f(j3);
                    if (iF >= l0.e(j3) || iF2 > iF) {
                        iE = l0.f(j3);
                    } else {
                        iF = l0.f(j3);
                        iD = l0.d(j3);
                    }
                }
                iE -= iD;
            }
        } else if (iE > l0.f(j3)) {
            iF -= l0.d(j3);
            iD = l0.d(j3);
            iE -= iD;
        }
        return d0.b(iF, iE);
    }

    public static void T(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcel.writeBundle(bundle);
        f0(parcel, iE0);
    }

    public static void U(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcel.writeByteArray(bArr);
        f0(parcel, iE0);
    }

    public static void V(Parcel parcel, int i2, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        f0(parcel, iE0);
    }

    public static void W(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        f0(parcel, iE0);
    }

    public static void X(Parcel parcel, int i2, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcel.writeIntArray(iArr);
        f0(parcel, iE0);
    }

    public static void Y(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        f0(parcel, iE0);
    }

    public static void Z(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcel.writeString(str);
        f0(parcel, iE0);
    }

    public static final androidx.compose.ui.autofill.f a(String str) {
        return new androidx.compose.ui.autofill.f(g0.k(str));
    }

    public static void a0(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        f0(parcel, iE0);
    }

    public static final void b(n nVar, s sVar, int i2) {
        q qVar;
        n nVar2 = nVar;
        sVar.c0(294589392);
        if ((((sVar.h(nVar2) ? 4 : 2) | i2) & 3) == 2 && sVar.F()) {
            sVar.W();
        } else {
            androidx.compose.runtime.saveable.e eVarF = l.f(sVar);
            a1 a1VarG = t.g(nVar2.b().e, sVar);
            List list = (List) a1VarG.getValue();
            boolean zBooleanValue = ((Boolean) sVar.j(x1.a)).booleanValue();
            boolean zF = sVar.f(list);
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            Object obj2 = objQ;
            if (zF || objQ == obj) {
                q qVar2 = new q();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                    if (zBooleanValue || iVar.E.j.d.compareTo(o.A) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                qVar2.addAll(arrayList);
                sVar.l0(qVar2);
                obj2 = qVar2;
            }
            q qVar3 = (q) obj2;
            c(qVar3, (List) a1VarG.getValue(), sVar, 0);
            a1 a1VarG2 = t.g(nVar2.b().f, sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = new q();
                sVar.l0(objQ2);
            }
            q qVar4 = (q) objQ2;
            sVar.b0(-367418626);
            ListIterator listIterator = qVar3.listIterator();
            while (true) {
                u uVar = (u) listIterator;
                if (!uVar.hasNext()) {
                    break;
                }
                androidx.navigation.i iVar2 = (androidx.navigation.i) uVar.next();
                androidx.navigation.t tVar = iVar2.y;
                tVar.getClass();
                m mVar = (m) tVar;
                boolean zH = sVar.h(nVar2) | sVar.h(iVar2);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new androidx.activity.compose.f(21, nVar2, iVar2);
                    sVar.l0(objQ3);
                }
                t1.a((kotlin.jvm.functions.a) objQ3, mVar.C, androidx.compose.runtime.internal.k.c(1129586364, new y1(iVar2, nVar2, eVarF, qVar4, mVar), sVar), sVar, 384, 0);
                nVar2 = nVar2;
                eVarF = eVarF;
                qVar4 = qVar4;
            }
            n nVar3 = nVar2;
            q qVar5 = qVar4;
            sVar.p(false);
            Set set = (Set) a1VarG2.getValue();
            boolean zF2 = sVar.f(a1VarG2) | sVar.h(nVar3);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == obj) {
                nVar2 = nVar3;
                qVar = qVar5;
                Object u0Var = new u0(a1VarG2, nVar2, qVar, null, 1);
                sVar.l0(u0Var);
                objQ4 = u0Var;
            } else {
                nVar2 = nVar3;
                qVar = qVar5;
            }
            androidx.compose.runtime.l0.d(set, qVar, (p) objQ4, sVar);
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.core.g0(nVar2, i2, 17);
        }
    }

    public static void b0(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iE0 = e0(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        f0(parcel, iE0);
    }

    public static final void c(List list, Collection collection, s sVar, int i2) {
        sVar.c0(1537894851);
        if ((((sVar.h(list) ? 4 : 2) | i2 | (sVar.h(collection) ? 32 : 16)) & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            boolean zBooleanValue = ((Boolean) sVar.j(x1.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                androidx.navigation.i iVar = (androidx.navigation.i) it.next();
                x xVar = iVar.E.j;
                boolean zG = sVar.g(zBooleanValue) | sVar.h(list) | sVar.h(iVar);
                Object objQ = sVar.Q();
                if (zG || objQ == androidx.compose.runtime.n.a) {
                    objQ = new androidx.navigation.compose.k(0, iVar, list, zBooleanValue);
                    sVar.l0(objQ);
                }
                androidx.compose.runtime.l0.b(xVar, (kotlin.jvm.functions.l) objQ, sVar);
            }
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(list, collection, i2, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader c0() {
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        if (a == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i3];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i2 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i2];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (thread == null) {
                                    try {
                                        f fVar = new f(threadGroup, "GmsDynamite");
                                        try {
                                            fVar.setContextClassLoader(null);
                                            fVar.start();
                                            thread = fVar;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = fVar;
                                            String message2 = e2.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e5) {
                                        e2 = e5;
                                    }
                                }
                            } catch (SecurityException e6) {
                                e2 = e6;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                a = contextClassLoader;
            }
        }
        return a;
    }

    public static final long d(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static void d0(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.k0 r6, kotlin.coroutines.jvm.internal.a r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.text.contextmenu.gestures.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.contextmenu.gestures.a r0 = (androidx.compose.foundation.text.contextmenu.gestures.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            androidx.compose.foundation.text.contextmenu.gestures.a r0 = new androidx.compose.foundation.text.contextmenu.gestures.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            androidx.compose.ui.input.pointer.k0 r6 = r0.e
            kotlin.a.e(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r6)
            r6 = 0
            return r6
        L2e:
            kotlin.a.e(r7)
        L31:
            r0.e = r6
            r0.z = r2
            androidx.compose.ui.input.pointer.n r7 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r7 = r6.b(r7, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.m r7 = (androidx.compose.ui.input.pointer.m) r7
            int r1 = r7.d
            java.lang.Object r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = androidx.compose.ui.input.pointer.u.a(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.g.e(androidx.compose.ui.input.pointer.k0, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static int e0(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final com.app.mlounge.data.repository.a f(String str) {
        str.getClass();
        if (r.u(str, "eporner_", false)) {
            return com.app.mlounge.data.repository.a.y;
        }
        return r.u(str, "noodle_", false) ? com.app.mlounge.data.repository.a.z : com.app.mlounge.data.repository.a.e;
    }

    public static void f0(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static final Object g(androidx.compose.ui.node.j jVar, kotlin.jvm.functions.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object obj;
        d1 d1VarU;
        Object objI;
        androidx.compose.ui.node.a1 a1Var;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) jVar;
        boolean z = qVar.e.K;
        if (z) {
            if (!z) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar2 = qVar.e.B;
            androidx.compose.ui.node.f0 f0VarV = androidx.compose.ui.node.l.v(jVar);
            loop0: while (true) {
                obj = null;
                if (f0VarV == null) {
                    break;
                }
                if ((((androidx.compose.ui.q) f0VarV.d0.g).A & 524288) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.z & 524288) != 0) {
                            androidx.compose.ui.q qVarE = qVar2;
                            androidx.compose.runtime.collection.b bVar = null;
                            while (qVarE != null) {
                                if (qVarE instanceof androidx.compose.ui.relocation.a) {
                                    obj = qVarE;
                                    break loop0;
                                }
                                if ((qVarE.z & 524288) != 0 && (qVarE instanceof androidx.compose.ui.node.k)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.k) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                        if ((qVar3.z & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qVarE = qVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.l.e(bVar);
                            }
                        }
                        qVar2 = qVar2.B;
                    }
                }
                f0VarV = f0VarV.v();
                qVar2 = (f0VarV == null || (a1Var = f0VarV.d0) == null) ? null : (w1) a1Var.f;
            }
            androidx.compose.ui.relocation.a aVar2 = (androidx.compose.ui.relocation.a) obj;
            if (aVar2 != null && (objI = aVar2.I((d1VarU = androidx.compose.ui.node.l.u(jVar)), new androidx.compose.ui.draw.b(7, aVar, d1VarU), cVar)) == kotlin.coroutines.intrinsics.a.e) {
                return objI;
            }
        }
        return y.a;
    }

    public static final LinkedHashSet h(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new androidx.work.d(z, uri));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dagger.internal.d.b(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dagger.internal.d.b(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static int i(int i2, int i3) {
        long j2 = ((long) i2) + ((long) i3);
        int i4 = (int) j2;
        if (j2 == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i2 + ", " + i3 + ")");
    }

    public static void l(androidx.media3.datasource.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Object m(androidx.room.r rVar, kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        if (rVar.k() && rVar.n() && rVar.l()) {
            return lVar.invoke(dVar);
        }
        if (dVar.getContext().get(androidx.room.u.e) == null) {
            return lVar.invoke(dVar);
        }
        androidx.room.s sVar = new androidx.room.s(lVar, (kotlin.coroutines.d) null, 0);
        androidx.room.x xVar = (androidx.room.x) dVar.getContext().get(androidx.room.x.y);
        kotlin.coroutines.f fVar = xVar != null ? xVar.e : null;
        if (fVar != null) {
            return BuildersKt.withContext(fVar, sVar, dVar);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            androidx.room.y yVar = rVar.d;
            if (yVar != null) {
                yVar.execute(new androidx.core.provider.m(1, cancellableContinuationImpl, rVar, sVar));
                return cancellableContinuationImpl.getResult();
            }
            kotlin.jvm.internal.l.f("internalTransactionExecutor");
            throw null;
        } catch (RejectedExecutionException e2) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
    }

    public static androidx.emoji2.text.u n(Context context) {
        ProviderInfo providerInfo;
        androidx.core.provider.d dVar;
        ApplicationInfo applicationInfo;
        com.google.android.material.shape.f cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(5) : new com.google.android.material.shape.f(5);
        PackageManager packageManager = context.getPackageManager();
        t1.n(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrL = cVar.l(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrL) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new androidx.core.provider.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new androidx.emoji2.text.u(new androidx.emoji2.text.t(context, dVar));
    }

    public static coil3.svg.internal.a o(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? new com.google.android.material.shape.k() : new com.google.android.material.shape.e();
        }
        return new com.google.android.material.shape.k();
    }

    public static int p(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (com.google.common.math.d.a[roundingMode.ordinal()]) {
            case 1:
                t1.o(i5 == 0);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static final byte[] q(androidx.work.impl.utils.f fVar) throws IOException {
        int[] iArrA0;
        int[] iArrA1;
        fVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) fVar.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i2 >= 31) {
                    iArrA0 = androidx.work.impl.utils.e.b(networkRequest);
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < 10; i3++) {
                        int i4 = iArr[i3];
                        if (androidx.work.impl.utils.a.d(networkRequest, i4)) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    iArrA0 = kotlin.collections.p.a0(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrA1 = androidx.work.impl.utils.e.a(networkRequest);
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < 30; i5++) {
                        int i6 = iArr2[i5];
                        if (androidx.work.impl.utils.a.c(networkRequest, i6)) {
                            arrayList2.add(Integer.valueOf(i6));
                        }
                    }
                    iArrA1 = kotlin.collections.p.a0(arrayList2);
                }
                objectOutputStream.writeInt(iArrA0.length);
                for (int i7 : iArrA0) {
                    objectOutputStream.writeInt(i7);
                }
                objectOutputStream.writeInt(iArrA1.length);
                for (int i8 : iArrA1) {
                    objectOutputStream.writeInt(i8);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dagger.internal.d.b(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static final androidx.compose.ui.graphics.vector.f s() {
        androidx.compose.ui.graphics.vector.f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(20.0f, 11.0f);
        gVar.r(7.83f);
        gVar.u(5.59f, -5.59f);
        gVar.t(12.0f, 4.0f);
        gVar.u(-8.0f, 8.0f);
        gVar.u(8.0f, 8.0f);
        gVar.u(1.41f, -1.41f);
        gVar.t(7.83f, 13.0f);
        gVar.r(20.0f);
        gVar.A(-2.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f u() {
        androidx.compose.ui.graphics.vector.f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.compose.ui.graphics.vector.o(10.0f, 6.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(8.59f, 7.41f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(13.17f, 12.0f));
        arrayList.add(new v(-4.58f, 4.59f));
        arrayList.add(new androidx.compose.ui.graphics.vector.n(10.0f, 18.0f));
        arrayList.add(new v(6.0f, -6.0f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final String[] v(androidx.compose.ui.autofill.p pVar) {
        pVar.getClass();
        return (String[]) ((androidx.compose.ui.autofill.f) pVar).b.toArray(new String[0]);
    }

    public static final androidx.compose.ui.graphics.vector.f x() {
        androidx.compose.ui.graphics.vector.f fVar = h;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(15.5f, 14.0f);
        gVar.s(-0.79f);
        gVar.u(-0.28f, -0.27f);
        gVar.m(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        gVar.m(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        gVar.w(3.0f, 5.91f, 3.0f, 9.5f);
        gVar.w(5.91f, 16.0f, 9.5f, 16.0f);
        gVar.n(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        gVar.u(0.27f, 0.28f);
        gVar.A(0.79f);
        gVar.u(5.0f, 4.99f);
        gVar.t(20.49f, 19.0f);
        gVar.u(-4.99f, -5.0f);
        gVar.l();
        gVar.v(9.5f, 14.0f);
        gVar.m(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        gVar.w(7.01f, 5.0f, 9.5f, 5.0f);
        gVar.w(14.0f, 7.01f, 14.0f, 9.5f);
        gVar.w(11.99f, 14.0f, 9.5f, 14.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        h = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f y() {
        androidx.compose.ui.graphics.vector.f fVar = i;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(21.0f, 3.0f);
        gVar.t(3.0f, 3.0f);
        gVar.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gVar.A(12.0f);
        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.s(5.0f);
        gVar.A(2.0f);
        gVar.s(8.0f);
        gVar.A(-2.0f);
        gVar.s(5.0f);
        gVar.n(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        gVar.t(23.0f, 5.0f);
        gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.l();
        gVar.v(21.0f, 17.0f);
        gVar.t(3.0f, 17.0f);
        gVar.t(3.0f, 5.0f);
        gVar.s(18.0f);
        gVar.A(12.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        i = fVarB;
        return fVarB;
    }

    public int A() {
        return 0;
    }

    public abstract boolean F(Class cls);

    public abstract void J(int i2);

    public abstract void K(View view, int i2, int i3);

    public abstract void L(View view, float f2, float f3);

    public abstract boolean R(View view, int i2);

    public abstract int j(View view, int i2);

    public abstract int k(View view, int i2);

    public abstract Method r(Class cls, Field field);

    public abstract Constructor t(Class cls);

    public abstract String[] w(Class cls);

    public int z(View view) {
        return 0;
    }

    public void I(View view, int i2) {
    }
}
