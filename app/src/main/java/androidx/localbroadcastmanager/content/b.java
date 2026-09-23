package androidx.localbroadcastmanager.content;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.PowerManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.collection.s;
import androidx.collection.y0;
import androidx.compose.foundation.s0;
import androidx.constraintlayout.core.widgets.analyzer.e;
import androidx.core.view.r;
import androidx.media3.common.o;
import androidx.media3.common.util.g0;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import androidx.media3.container.u;
import androidx.media3.datasource.g;
import androidx.media3.datasource.h;
import androidx.media3.datasource.j;
import androidx.media3.exoplayer.hls.playlist.t;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.source.w0;
import androidx.media3.exoplayer.upstream.p;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.i;
import androidx.media3.extractor.m;
import androidx.media3.extractor.mp4.d;
import androidx.media3.extractor.n;
import androidx.media3.extractor.ts.a0;
import androidx.media3.extractor.ts.c0;
import androidx.media3.extractor.ts.e0;
import androidx.media3.extractor.ts.z;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.x0;
import androidx.room.q;
import androidx.transition.k;
import com.google.firebase.crashlytics.internal.model.t1;
import io.hopmonsdk.Hopmn;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g, t, p, i, z, androidx.sqlite.b {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public b(int i) {
        this.e = i;
        switch (i) {
            case 5:
                this.y = new HashMap();
                this.z = new ArrayList();
                break;
            case 8:
                this.y = new HashMap();
                this.z = androidx.media3.exoplayer.b.b;
                break;
            case 14:
                this.y = ByteBuffer.allocateDirect(500);
                break;
            case 18:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.y = byteArrayOutputStream;
                this.z = new DataOutputStream(byteArrayOutputStream);
                break;
            case 22:
                this.y = new SparseIntArray();
                this.z = new SparseIntArray();
                break;
            case 25:
                this.y = new y0(0);
                this.z = new s((Object) null);
                break;
            default:
                this.y = new HashMap();
                break;
        }
    }

    public static void i(b bVar, boolean z, boolean z2) {
        synchronized (bVar) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) bVar.z) == null) {
                    if (((Context) bVar.y).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        androidx.media3.common.util.b.t("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.y).getSystemService("power");
                    if (powerManager == null) {
                        androidx.media3.common.util.b.t("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        bVar.z = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.z;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static void j(b bVar, androidx.media3.exoplayer.b bVar2) {
        bVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) bVar.y).entrySet()) {
            if (entry.getKey() != null) {
                k.h();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!r(bVar2, list).equals(r((androidx.media3.exoplayer.b) bVar.z, list))) {
                    throw null;
                }
            }
        }
        bVar.z = bVar2;
    }

    public static androidx.media3.exoplayer.b r(androidx.media3.exoplayer.b bVar, List list) {
        bVar.getClass();
        Map map = bVar.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new androidx.media3.exoplayer.b(map2);
    }

    public static int x(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A() throws IOException {
        String str = (String) this.y;
        if (((FileChannel) this.z) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.z = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.z;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.z = null;
            throw new IllegalStateException(androidx.privacysandbox.ads.adservices.java.internal.a.r("Unable to lock file: '", str, "'."), th);
        }
    }

    public void B(int i, int i2) {
        int[] iArr = (int[]) this.y;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.y;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.y, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.z;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u0 u0Var = (u0) ((ArrayList) this.z).get(size);
            int i4 = u0Var.e;
            if (i4 >= i) {
                u0Var.e = i4 + i2;
            }
        }
    }

    public void C(int i, int i2) {
        int[] iArr = (int[]) this.y;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.y;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.y;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.z;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u0 u0Var = (u0) ((ArrayList) this.z).get(size);
            int i4 = u0Var.e;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.z).remove(size);
                } else {
                    u0Var.e = i4 - i2;
                }
            }
        }
    }

    public r D(p0 p0Var, int i) {
        x0 x0Var;
        r rVar;
        y0 y0Var = (y0) this.y;
        int iD = y0Var.d(p0Var);
        if (iD >= 0 && (x0Var = (x0) y0Var.i(iD)) != null) {
            int i2 = x0Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                x0Var.a = i3;
                if (i == 4) {
                    rVar = x0Var.b;
                } else {
                    if (i != 8) {
                        kotlinx.coroutines.future.a.q("Must provide flag PRE or POST");
                        return null;
                    }
                    rVar = x0Var.c;
                }
                if ((i3 & 12) == 0) {
                    y0Var.g(iD);
                    x0Var.a = 0;
                    x0Var.b = null;
                    x0Var.c = null;
                    x0.d.c(x0Var);
                }
                return rVar;
            }
        }
        return null;
    }

    public void E(p0 p0Var) {
        x0 x0Var = (x0) ((y0) this.y).get(p0Var);
        if (x0Var == null) {
            return;
        }
        x0Var.a &= -2;
    }

    public void F(p0 p0Var) {
        s sVar = (s) this.z;
        for (int iG = sVar.g() - 1; iG >= 0; iG--) {
            if (p0Var == sVar.h(iG)) {
                Object[] objArr = sVar.z;
                Object obj = objArr[iG];
                Object obj2 = androidx.collection.t.a;
                if (obj == obj2) {
                    break;
                }
                objArr[iG] = obj2;
                sVar.e = true;
                break;
            }
        }
        x0 x0Var = (x0) ((y0) this.y).remove(p0Var);
        if (x0Var != null) {
            x0Var.a = 0;
            x0Var.b = null;
            x0Var.c = null;
            x0.d.c(x0Var);
        }
    }

    public androidx.media3.common.util.a G() throws IOException {
        File file = (File) this.z;
        File file2 = (File) this.y;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                androidx.media3.common.util.b.t("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new androidx.media3.common.util.a(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new androidx.media3.common.util.a(file2);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    public h0 H(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.y;
            if (i2 >= iArr.length) {
                androidx.media3.common.util.b.f("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new m();
            }
            if (i == iArr[i2]) {
                return ((w0[]) this.z)[i2];
            }
            i2++;
        }
    }

    public void I() {
        synchronized (this) {
            ((AtomicInteger) this.y).decrementAndGet();
            if (((AtomicInteger) this.y).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void J(ArrayList arrayList) {
        u uVar;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((androidx.media3.container.t) arrayList.get(i)).a == 1) {
                try {
                    uVar = new u((androidx.media3.container.t) arrayList.get(i));
                } catch (androidx.media3.container.s unused) {
                    uVar = null;
                }
                this.z = uVar;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // androidx.media3.extractor.i
    public androidx.media3.extractor.h a(androidx.media3.extractor.o r17, long r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.localbroadcastmanager.content.b.a(androidx.media3.extractor.o, long):androidx.media3.extractor.h");
    }

    @Override // androidx.media3.datasource.g
    public h b() {
        switch (this.e) {
            case 3:
                return new androidx.media3.datasource.m((Context) this.y, ((g) this.z).b());
            default:
                return new androidx.media3.datasource.okhttp.a((y) this.z, (b) this.y);
        }
    }

    @Override // androidx.media3.extractor.ts.z
    public void c(v vVar) {
        c0 c0Var = (c0) this.z;
        SparseArray sparseArray = c0Var.h;
        androidx.media3.common.util.u uVar = (androidx.media3.common.util.u) this.y;
        if (vVar.z() == 0 && (vVar.z() & 128) != 0) {
            vVar.N(6);
            int iA = vVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                vVar.k(uVar.b, 0, 4);
                uVar.m(0);
                int iG = uVar.g(16);
                uVar.o(3);
                if (iG == 0) {
                    uVar.o(13);
                } else {
                    int iG2 = uVar.g(13);
                    if (sparseArray.get(iG2) == null) {
                        sparseArray.put(iG2, new a0(new androidx.fragment.app.h(c0Var, iG2)));
                        c0Var.n++;
                    }
                }
            }
            if (c0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.p
    public Object e(Uri uri, j jVar) {
        androidx.media3.exoplayer.offline.a aVar = (androidx.media3.exoplayer.offline.a) ((p) this.y).e(uri, jVar);
        List list = (List) this.z;
        return (list == null || list.isEmpty()) ? aVar : (androidx.media3.exoplayer.offline.a) aVar.a(list);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.t
    public p f(androidx.media3.exoplayer.hls.playlist.p pVar, androidx.media3.exoplayer.hls.playlist.m mVar) {
        return new b(12, ((t) this.y).f(pVar, mVar), (List) this.z);
    }

    @Override // androidx.media3.extractor.i
    public void g() {
        v vVar = (v) this.z;
        byte[] bArr = i0.b;
        vVar.getClass();
        vVar.K(bArr, bArr.length);
    }

    @Override // androidx.sqlite.b
    public androidx.sqlite.a h(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        e eVar = (e) this.z;
        if (!str.equals(":memory:")) {
            str = ((androidx.room.a) eVar.d).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        androidx.room.concurrent.a aVar = new androidx.room.concurrent.a(str, (eVar.b || eVar.c || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.a;
        reentrantLock.lock();
        b bVar = aVar.b;
        if (bVar != null) {
            try {
                bVar.A();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (eVar.c) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                androidx.sqlite.a aVarH = ((androidx.sqlite.b) this.y).h(str);
                if (eVar.b) {
                    e.f(aVarH);
                    if (((androidx.room.a) eVar.d).g == q.z) {
                        t1.t(aVarH, "PRAGMA synchronous = NORMAL");
                    } else {
                        t1.t(aVarH, "PRAGMA synchronous = FULL");
                    }
                    ((androidx.emoji2.text.g) eVar.e).w(aVarH);
                } else {
                    try {
                        eVar.c = true;
                        e.a(eVar, aVarH);
                        eVar.c = false;
                    } catch (Throwable th2) {
                        eVar.c = false;
                        throw th2;
                    }
                }
                if (bVar != null && (fileChannel2 = (FileChannel) bVar.z) != null) {
                    try {
                        fileChannel2.close();
                        bVar.z = null;
                    } catch (Throwable th3) {
                        bVar.z = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return aVarH;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            if (bVar != null && (fileChannel = (FileChannel) bVar.z) != null) {
                try {
                    fileChannel.close();
                } finally {
                    bVar.z = null;
                }
            }
            throw th5;
        }
        th = th4;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    public void k(p0 p0Var, r rVar) {
        y0 y0Var = (y0) this.y;
        x0 x0VarA = (x0) y0Var.get(p0Var);
        if (x0VarA == null) {
            x0VarA = x0.a();
            y0Var.put(p0Var, x0VarA);
        }
        x0VarA.c = rVar;
        x0VarA.a |= 8;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.t
    public p l() {
        return new b(12, ((t) this.y).l(), (List) this.z);
    }

    @Override // androidx.sqlite.b
    public boolean m() {
        return ((androidx.sqlite.b) this.y).m();
    }

    public boolean n() {
        synchronized (this) {
            if (((AtomicBoolean) this.z).get()) {
                return false;
            }
            ((AtomicInteger) this.y).incrementAndGet();
            return true;
        }
    }

    public void o(Object obj, String str) {
        HashMap map = (HashMap) this.y;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.z).remove(str);
    }

    public void p() {
        switch (this.e) {
            case 9:
                this.y = null;
                this.z = null;
                break;
            default:
                int[] iArr = (int[]) this.y;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.z = null;
                break;
        }
    }

    public boolean q(int i) {
        return ((o) this.y).a.get(i);
    }

    public byte[] s(androidx.media3.extractor.metadata.emsg.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.z;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.y;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            kotlinx.coroutines.future.a.l(e);
            return null;
        }
    }

    public void t(int i) {
        int[] iArr = (int[]) this.y;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.y = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.y = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.y;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("Receiver{");
                sb.append((Hopmn) this.z);
                sb.append(" filter=");
                sb.append((IntentFilter) this.y);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        d dVar = (d) this.z;
        androidx.recyclerview.widget.w0 w0Var = (androidx.recyclerview.widget.w0) this.y;
        int iR = w0Var.r();
        int iT = w0Var.t();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewZ = w0Var.z(i);
            int iN = w0Var.n(viewZ);
            int iC = w0Var.C(viewZ);
            dVar.b = iR;
            dVar.c = iT;
            dVar.d = iN;
            dVar.e = iC;
            if (i3 != 0) {
                dVar.a = i3;
                if (dVar.a()) {
                    return viewZ;
                }
            }
            if (i4 != 0) {
                dVar.a = i4;
                if (dVar.a()) {
                    view = viewZ;
                }
            }
            i += i5;
        }
        return view;
    }

    public n v(Object... objArr) {
        Constructor constructorC;
        synchronized (((AtomicBoolean) this.z)) {
            if (!((AtomicBoolean) this.z).get()) {
                try {
                    constructorC = ((t0) this.y).c();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.z).set(true);
                    constructorC = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorC = null;
        }
        if (constructorC == null) {
            return null;
        }
        try {
            return (n) constructorC.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public synchronized Map w() {
        try {
            if (((Map) this.z) == null) {
                this.z = Collections.unmodifiableMap(new HashMap((HashMap) this.y));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.z;
    }

    public void y() {
        ((SparseIntArray) this.y).clear();
    }

    public boolean z(View view) {
        d dVar = (d) this.z;
        androidx.recyclerview.widget.w0 w0Var = (androidx.recyclerview.widget.w0) this.y;
        int iR = w0Var.r();
        int iT = w0Var.t();
        int iN = w0Var.n(view);
        int iC = w0Var.C(view);
        dVar.b = iR;
        dVar.c = iT;
        dVar.d = iN;
        dVar.e = iC;
        dVar.a = 24579;
        return dVar.a();
    }

    @Override // androidx.media3.extractor.ts.z
    public void d(g0 g0Var, androidx.media3.extractor.p pVar, e0 e0Var) {
    }

    public /* synthetic */ b(int i, boolean z) {
        this.e = i;
    }

    public b(String str) {
        this.e = 29;
        this.y = str.concat(".lck");
    }

    public b(s0 s0Var) {
        this.e = 28;
        this.y = new AtomicInteger(0);
        this.z = new AtomicBoolean(false);
    }

    public b(File file) {
        this.e = 1;
        this.y = file;
        this.z = new File(file.getPath() + ".bak");
    }

    public b(e eVar, androidx.sqlite.b bVar) {
        this.e = 26;
        bVar.getClass();
        this.z = eVar;
        this.y = bVar;
    }

    public b(g0 g0Var) {
        this.e = 20;
        this.y = g0Var;
        this.z = new v();
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    public b(Context context, g gVar) {
        this.e = 3;
        this.y = context.getApplicationContext();
        this.z = gVar;
    }

    public b(y yVar) {
        this.e = 6;
        this.z = yVar;
        this.y = new b(4);
    }

    public b(o oVar, SparseArray sparseArray) {
        this.e = 10;
        this.y = oVar;
        SparseBooleanArray sparseBooleanArray = oVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            _COROUTINE.a.s(i, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i);
            androidx.media3.exoplayer.analytics.a aVar = (androidx.media3.exoplayer.analytics.a) sparseArray.get(iKeyAt);
            aVar.getClass();
            sparseArray2.append(iKeyAt, aVar);
        }
        this.z = sparseArray2;
    }

    public b(Context context) {
        this.e = 2;
        this.y = context;
    }

    public b(androidx.recyclerview.widget.w0 w0Var) {
        this.e = 24;
        this.y = w0Var;
        d dVar = new d();
        dVar.a = 0;
        this.z = dVar;
    }

    public b(MediaCodec.CryptoInfo cryptoInfo) {
        this.e = 7;
        this.y = cryptoInfo;
        this.z = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public b(androidx.media3.exoplayer.video.c cVar) {
        this.e = 15;
        this.z = cVar;
    }

    public b(c0 c0Var) {
        this.e = 21;
        this.z = c0Var;
        this.y = new androidx.media3.common.util.u(new byte[4], 4);
    }

    public b(t0 t0Var) {
        this.e = 16;
        this.y = t0Var;
        this.z = new AtomicBoolean(false);
    }
}
