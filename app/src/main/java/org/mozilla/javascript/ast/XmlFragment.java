package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class XmlFragment extends AstNode {
    public XmlFragment() {
        this.type = Token.XML;
    }

    public XmlFragment(int i) {
        super(i);
        this.type = Token.XML;
    }

    public XmlFragment(int i, int i2) {
        super(i, i2);
        this.type = Token.XML;
    }
}
