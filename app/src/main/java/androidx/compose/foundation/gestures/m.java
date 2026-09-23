package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements t1 {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // androidx.compose.foundation.gestures.t1
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        n nVar = this.a;
        float fFloatValue = ((Number) nVar.a.invoke(Float.valueOf(f))).floatValue();
        nVar.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        nVar.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
