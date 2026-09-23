package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements e {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, e.c);
    }

    @Override // androidx.room.e
    public final void F(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.z) {
            try {
                String str = (String) multiInstanceInvalidationService.y.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.z.beginBroadcast();
                int i2 = 0;
                while (true) {
                    h hVar = multiInstanceInvalidationService.z;
                    if (i2 >= iBeginBroadcast) {
                        hVar.finishBroadcast();
                        return;
                    }
                    try {
                        Object broadcastCookie = hVar.getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.y.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((d) multiInstanceInvalidationService.z.getBroadcastItem(i2)).j(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.z.finishBroadcast();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = e.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                F(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.d = strongBinder;
                    dVar2 = cVar;
                } else {
                    dVar2 = (d) iInterfaceQueryLocalInterface;
                }
            }
            int i3 = parcel.readInt();
            dVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
            synchronized (multiInstanceInvalidationService.z) {
                multiInstanceInvalidationService.z.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.b);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.d = strongBinder2;
                dVar = cVar2;
            } else {
                dVar = (d) iInterfaceQueryLocalInterface2;
            }
        }
        String string = parcel.readString();
        dVar.getClass();
        int i4 = 0;
        if (string != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.d;
            synchronized (multiInstanceInvalidationService2.z) {
                try {
                    int i5 = multiInstanceInvalidationService2.e + 1;
                    multiInstanceInvalidationService2.e = i5;
                    if (multiInstanceInvalidationService2.z.register(dVar, Integer.valueOf(i5))) {
                        multiInstanceInvalidationService2.y.put(Integer.valueOf(i5), string);
                        i4 = i5;
                    } else {
                        multiInstanceInvalidationService2.e--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i4);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
