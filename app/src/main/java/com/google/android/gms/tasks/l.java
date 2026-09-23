package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements f, e, c {
    public int A;
    public int B;
    public int C;
    public Exception D;
    public boolean E;
    public final Object e = new Object();
    public final int y;
    public final s z;

    public l(int i, s sVar) {
        this.y = i;
        this.z = sVar;
    }

    @Override // com.google.android.gms.tasks.e
    public final void F(Exception exc) {
        synchronized (this.e) {
            this.B++;
            this.D = exc;
            a();
        }
    }

    public final void a() {
        int i = this.A;
        int i2 = this.B;
        int i3 = i + i2 + this.C;
        int i4 = this.y;
        if (i3 == i4) {
            Exception exc = this.D;
            s sVar = this.z;
            if (exc == null) {
                if (this.E) {
                    sVar.n();
                    return;
                } else {
                    sVar.k(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            sVar.m(new ExecutionException(sb.toString(), this.D));
        }
    }

    @Override // com.google.android.gms.tasks.f
    public final void b(Object obj) {
        synchronized (this.e) {
            this.A++;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.c
    public final void x() {
        synchronized (this.e) {
            this.C++;
            this.E = true;
            a();
        }
    }
}
