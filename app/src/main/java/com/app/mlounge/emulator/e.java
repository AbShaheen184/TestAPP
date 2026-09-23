package com.app.mlounge.emulator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ EmulatorActivity y;

    public /* synthetic */ e(EmulatorActivity emulatorActivity, int i) {
        this.e = i;
        this.y = emulatorActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.showMenu();
                break;
            default:
                EmulatorActivity.startAutoSave$lambda$0(this.y);
                break;
        }
    }
}
