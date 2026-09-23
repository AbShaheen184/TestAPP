package org.mozilla.javascript.regexp;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class RENode {
    int bmsize;
    char chr;
    int flatIndex;
    boolean greedy;
    int index;
    RENode kid;
    RENode kid2;
    int kidlen;
    int length;
    int max;
    int min;
    RENode next;
    byte op;
    int parenCount;
    int parenIndex;
    boolean sense;
    int startIndex;

    public RENode(byte b) {
        this.op = b;
    }
}
