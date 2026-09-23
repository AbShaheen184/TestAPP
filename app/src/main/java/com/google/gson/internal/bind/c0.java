package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.a0()) {
            try {
                arrayList.add(Integer.valueOf(aVar.f0()));
            } catch (NumberFormatException e) {
                throw new com.google.gson.h(e, 8);
            }
        }
        aVar.A();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        bVar.g();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            bVar.e0(atomicIntegerArray.get(i));
        }
        bVar.A();
    }
}
