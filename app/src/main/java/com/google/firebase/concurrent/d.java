package com.google.firebase.concurrent;

import com.google.android.gms.tasks.q;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ q A;
    public final /* synthetic */ int e;
    public final /* synthetic */ e y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ d(e eVar, Runnable runnable, q qVar, int i) {
        this.e = i;
        this.y = eVar;
        this.z = runnable;
        this.A = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ExecutorService executorService = this.y.e;
                final int i = 0;
                final Runnable runnable = this.z;
                final q qVar = this.A;
                executorService.execute(new Runnable() { // from class: com.google.firebase.concurrent.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((g) qVar.e).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((g) qVar.e).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                g gVar = (g) qVar.e;
                                try {
                                    runnable2.run();
                                    gVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    gVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.y.e;
                final int i2 = 2;
                final Runnable runnable2 = this.z;
                final q qVar2 = this.A;
                executorService2.execute(new Runnable() { // from class: com.google.firebase.concurrent.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((g) qVar2.e).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((g) qVar2.e).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                g gVar = (g) qVar2.e;
                                try {
                                    runnable3.run();
                                    gVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    gVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.y.e;
                final int i3 = 1;
                final Runnable runnable3 = this.z;
                final q qVar3 = this.A;
                executorService3.execute(new Runnable() { // from class: com.google.firebase.concurrent.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((g) qVar3.e).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((g) qVar3.e).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                g gVar = (g) qVar3.e;
                                try {
                                    runnable4.run();
                                    gVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    gVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
