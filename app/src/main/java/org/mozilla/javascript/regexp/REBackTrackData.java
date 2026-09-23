package org.mozilla.javascript.regexp;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class REBackTrackData {
    final int continuationOp;
    final int continuationPc;
    final int cp;
    final int op;
    final long[] parens;
    final int pc;
    final REBackTrackData previous;
    final REProgState stateStackTop;

    public REBackTrackData(REGlobalData rEGlobalData, int i, int i2, int i3, int i4, int i5) {
        this.previous = rEGlobalData.backTrackStackTop;
        this.op = i;
        this.pc = i2;
        this.cp = i3;
        this.continuationOp = i4;
        this.continuationPc = i5;
        this.parens = rEGlobalData.parens;
        this.stateStackTop = rEGlobalData.stateStackTop;
    }
}
