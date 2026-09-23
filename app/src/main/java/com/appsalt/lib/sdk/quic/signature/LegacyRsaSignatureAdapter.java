package com.appsalt.lib.sdk.quic.signature;

import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.c0;
import kotlin.k;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyRsaSignatureAdapter extends Signature {
    public final Object a;
    public Signature b;

    public LegacyRsaSignatureAdapter() {
        super("RSASSA-PSS");
        Map mapK = c0.k(new k("SHA256", Signature.getInstance("SHA256withRSA/PSS")), new k("SHA384", Signature.getInstance("SHA384withRSA/PSS")), new k("SHA512", Signature.getInstance("SHA512withRSA/PSS")));
        this.a = mapK;
        this.b = (Signature) mapK.get("SHA256");
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        return this.b.getParameter(str);
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        return this.b.getParameters();
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.b.initSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.b.initVerify(publicKey);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // java.security.SignatureSpi
    public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            return;
        }
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            String digestAlgorithm = ((PSSParameterSpec) algorithmParameterSpec).getDigestAlgorithm();
            Locale locale = Locale.ROOT;
            this.b = (Signature) this.a.get(r.s(digestAlgorithm.toUpperCase(locale), "-", "", false).toUpperCase(locale));
        }
        this.b.setParameter(algorithmParameterSpec);
    }

    @Override // java.security.SignatureSpi
    public final int engineSign(byte[] bArr, int i, int i2) {
        return this.b.sign(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) throws SignatureException {
        this.b.update(b);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) {
        return this.b.verify(bArr);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.b.initSign(privateKey, secureRandom);
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(ByteBuffer byteBuffer) throws SignatureException {
        this.b.update(byteBuffer);
    }

    @Override // java.security.SignatureSpi
    public final byte[] engineSign() {
        return this.b.sign();
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.b.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr, int i, int i2) {
        return this.b.verify(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        this.b.setParameter(str, obj);
    }
}
