package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class XmlPropRef extends XmlRef {
    private Name propName;

    public XmlPropRef() {
        this.type = 87;
    }

    public Name getPropName() {
        return this.propName;
    }

    public void setPropName(Name name) {
        assertNotNull(name);
        this.propName = name;
        name.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        if (isAttributeAccess()) {
            sb.append("@");
        }
        Name name = this.namespace;
        if (name != null) {
            sb.append(name.toSource(0));
            sb.append("::");
        }
        sb.append(this.propName.toSource(0));
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Name name = this.namespace;
            if (name != null) {
                name.visit(nodeVisitor);
            }
            this.propName.visit(nodeVisitor);
        }
    }

    public XmlPropRef(int i) {
        super(i);
        this.type = 87;
    }

    public XmlPropRef(int i, int i2) {
        super(i, i2);
        this.type = 87;
    }
}
