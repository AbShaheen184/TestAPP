package com.caverock.androidsvg;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements Attributes {
    public XmlPullParser a;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.a.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.a.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        XmlPullParser xmlPullParser = this.a;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.a.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.a.getAttributeValue(i);
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }
}
