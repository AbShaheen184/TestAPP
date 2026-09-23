package androidx.compose.ui.text.android.selection;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends _COROUTINE.b {
    public final BreakIterator G;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.G = characterInstance;
    }

    @Override // _COROUTINE.b
    public final int C(int i) {
        return this.G.following(i);
    }

    @Override // _COROUTINE.b
    public final int E(int i) {
        return this.G.preceding(i);
    }
}
