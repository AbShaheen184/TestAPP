package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class RegExpLiteral extends AstNode {
    private String flags;
    private String value;

    public RegExpLiteral() {
        this.type = 53;
    }

    public String getFlags() {
        return this.flags;
    }

    public String getValue() {
        return this.value;
    }

    public void setFlags(String str) {
        this.flags = str;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        String str = this.value;
        String str2 = this.flags;
        if (str2 == null) {
            str2 = "";
        }
        return strMakeIndent + "/" + str + "/" + str2;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public RegExpLiteral(int i) {
        super(i);
        this.type = 53;
    }

    public RegExpLiteral(int i, int i2) {
        super(i, i2);
        this.type = 53;
    }
}
