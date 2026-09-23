package org.mozilla.javascript.ast;

import kotlinx.coroutines.future.a;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class Symbol {
    private Scope containingTable;
    private int declType;
    private int index = -1;
    private String name;
    private Node node;

    public Symbol(int i, String str) {
        setName(str);
        setDeclType(i);
    }

    public Scope getContainingTable() {
        return this.containingTable;
    }

    public int getDeclType() {
        return this.declType;
    }

    public String getDeclTypeName() {
        return Token.typeToName(this.declType);
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public Node getNode() {
        return this.node;
    }

    public void setContainingTable(Scope scope) {
        this.containingTable = scope;
    }

    public void setDeclType(int i) {
        if (i == 122 || i == 96 || i == 135 || i == 167 || i == 168) {
            this.declType = i;
        } else {
            a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Invalid declType: "));
        }
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Symbol (");
        sb.append(getDeclTypeName());
        sb.append(") name=");
        sb.append(this.name);
        if (this.node != null) {
            sb.append(" line=");
            sb.append(this.node.getLineno());
        }
        return sb.toString();
    }

    public Symbol() {
    }
}
