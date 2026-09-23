package io.hopmonsdk.seed;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ SeedDiscovery.StringCallback y;
    public final /* synthetic */ String z;

    public /* synthetic */ a(SeedDiscovery.StringCallback stringCallback, String str, int i) {
        this.e = i;
        this.y = stringCallback;
        this.z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.onFailure(this.z);
                break;
            default:
                this.y.onSuccess(this.z);
                break;
        }
    }
}
