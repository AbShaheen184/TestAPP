package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.decoder.g;
import androidx.room.v;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.ads_identifier.c;
import com.google.android.gms.internal.ads_identifier.d;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public com.google.android.gms.common.a a;
    public d b;
    public boolean c;
    public final Object d = new Object();
    public b e;
    public final Context f;
    public final long g;

    public a(Context context) {
        x.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static v a(Context context) {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            v vVarE = aVar.e();
            d(vVarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.b();
            return vVarE;
        } catch (Throwable th) {
            try {
                d(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                aVar.b();
                throw th2;
            }
        }
    }

    public static void d(v vVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (vVar != null) {
                map.put("limit_ad_tracking", true != vVar.c ? "0" : "1");
                String str = vVar.b;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new g(map).start();
        }
    }

    public final void b() {
        x.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        com.google.android.gms.common.stats.a.b().c(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        x.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!com.google.android.gms.common.stats.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = aVar;
                        try {
                            IBinder iBinderA = aVar.a();
                            int i = c.d;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads_identifier.b(iBinderA);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new androidx.compose.runtime.snapshots.g(5);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final v e() {
        v vVar;
        x.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        b bVar = this.e;
                        if (bVar == null || !bVar.A) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                x.g(this.a);
                x.g(this.b);
                try {
                    com.google.android.gms.internal.ads_identifier.b bVar2 = (com.google.android.gms.internal.ads_identifier.b) this.b;
                    bVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelA = bVar2.a(parcelObtain, 1);
                    String string = parcelA.readString();
                    parcelA.recycle();
                    com.google.android.gms.internal.ads_identifier.b bVar3 = (com.google.android.gms.internal.ads_identifier.b) this.b;
                    bVar3.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = com.google.android.gms.internal.ads_identifier.a.a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelA2 = bVar3.a(parcelObtain2, 2);
                    boolean z = parcelA2.readInt() != 0;
                    parcelA2.recycle();
                    vVar = new v(1, string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            b bVar4 = this.e;
            if (bVar4 != null) {
                bVar4.z.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new b(this, j);
            }
        }
        return vVar;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
