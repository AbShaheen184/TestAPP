package org.mozilla.javascript.ast;

import androidx.compose.runtime.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class GeneratorMethodDefinition extends AstNode {
    private AstNode methodName;

    public GeneratorMethodDefinition(int i, int i2, AstNode astNode) {
        super(i, i2);
        setType(23);
        setMethodName(astNode);
    }

    public AstNode getMethodName() {
        return this.methodName;
    }

    public void setMethodName(AstNode astNode) {
        assertNotNull(astNode);
        this.methodName = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return j.j(makeIndent(i), "*", this.methodName.toSource(i));
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.methodName.visit(nodeVisitor);
        }
    }
}
