package org.mozilla.javascript.ast;

import androidx.compose.runtime.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ArrayComprehensionLoop extends ForInLoop {
    public ArrayComprehensionLoop() {
    }

    @Override // org.mozilla.javascript.ast.Loop
    public AstNode getBody() {
        return null;
    }

    @Override // org.mozilla.javascript.ast.Loop
    public void setBody(AstNode astNode) {
        throw new UnsupportedOperationException("this node type has no body");
    }

    @Override // org.mozilla.javascript.ast.ForInLoop, org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        String str = isForEach() ? "each " : "";
        String source = this.iterator.toSource(0);
        String str2 = isForOf() ? " of " : " in ";
        String source2 = this.iteratedObject.toSource(0);
        StringBuilder sb = new StringBuilder();
        sb.append(strMakeIndent);
        sb.append(" for ");
        sb.append(str);
        sb.append("(");
        sb.append(source);
        return j.m(sb, str2, source2, ")");
    }

    @Override // org.mozilla.javascript.ast.ForInLoop, org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.iterator.visit(nodeVisitor);
            this.iteratedObject.visit(nodeVisitor);
        }
    }

    public ArrayComprehensionLoop(int i) {
        super(i);
    }

    public ArrayComprehensionLoop(int i, int i2) {
        super(i, i2);
    }
}
