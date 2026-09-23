package com.app.mlounge.ui.screens.player;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public /* synthetic */ e(int i, kotlin.jvm.functions.l lVar) {
        this.e = i;
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.invoke(Boolean.FALSE);
                break;
            case 1:
                this.y.invoke(Boolean.TRUE);
                break;
            case 2:
                this.y.invoke(0L);
                break;
            case 3:
                this.y.invoke("audio");
                break;
            case 4:
                this.y.invoke("subtitle");
                break;
            case 5:
                this.y.invoke("settings");
                break;
            default:
                this.y.invoke(Boolean.FALSE);
                break;
        }
        return kotlin.y.a;
    }
}
