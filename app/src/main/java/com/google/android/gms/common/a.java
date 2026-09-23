package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {
    public boolean e = false;
    public final LinkedBlockingQueue y = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        x.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.e) {
            kotlinx.coroutines.future.a.u("Cannot call get on this connection more than once");
            return null;
        }
        this.e = true;
        IBinder iBinder = (IBinder) this.y.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.y.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
