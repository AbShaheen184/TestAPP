package com.google.protobuf;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.m, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.m, java.util.Iterator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ByteString byteString = (ByteString) obj;
        ByteString byteString2 = (ByteString) obj2;
        ?? Iterator2 = byteString.iterator2();
        ?? Iterator3 = byteString2.iterator2();
        while (Iterator2.hasNext() && Iterator3.hasNext()) {
            int iCompare = Integer.compare(ByteString.toInt(Iterator2.a()), ByteString.toInt(Iterator3.a()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(byteString.size(), byteString2.size());
    }
}
