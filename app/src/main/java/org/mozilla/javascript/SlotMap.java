package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface SlotMap extends Iterable<Slot> {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    @FunctionalInterface
    public interface SlotComputer<S extends Slot> {
        S compute(Object obj, int i, Slot slot);
    }

    void add(Slot slot);

    <S extends Slot> S compute(Object obj, int i, SlotComputer<S> slotComputer);

    boolean isEmpty();

    Slot modify(Object obj, int i, int i2);

    Slot query(Object obj, int i);

    int size();
}
