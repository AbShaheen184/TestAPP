package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class EmptyStatement extends AstNode {
    public EmptyStatement() {
        this.type = Token.EMPTY;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + ";\n";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public EmptyStatement(int i) {
        super(i);
        this.type = Token.EMPTY;
    }

    public EmptyStatement(int i, int i2) {
        super(i, i2);
        this.type = Token.EMPTY;
    }
}
