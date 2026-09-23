package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements SlotMap.SlotComputer {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void b(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.mozilla.javascript.SlotMap.SlotComputer
    public Slot compute(Object obj, int i, Slot slot) {
        switch (this.a) {
            case 2:
                return ScriptableObject.checkSlotRemoval(obj, i, slot);
            case 3:
                return ScriptableObject.ensureLazySlot(obj, i, slot);
            case 4:
                return ScriptableObject.ensureAccessorSlot(obj, i, slot);
            default:
                return ScriptableObject.ensureLambdaSlot(obj, i, slot);
        }
    }
}
