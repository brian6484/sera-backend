package com.well.netflixclone.common.converter;

import com.well.netflixclone.common.exception.BusinessException;
import com.well.netflixclone.common.exception.ExceptionStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Base64;

//@Converter
//@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
//public class CryptoConverter implements AttributeConverter<String, String> {
//
//    @Value("${auth.encrypt.key}")
//    private final String key;
//
//    @Value("${auth.encrypt.iv}")
//    private final String iv;
//
//    private final String alg = "AES/CBC/PKCS5Padding";
//
//    @Override
//    public String convertToDatabaseColumn(String text) {
//        try {
//            Cipher cipher = Cipher.getInstance(alg);
//            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
//            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
//            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivParameterSpec);
//
//            byte[] encrypted = cipher.doFinal(text.getBytes());
//            return Base64.getEncoder().encodeToString(encrypted);
//        } catch (GeneralSecurityException e) {
//            throw new BusinessException(ExceptionStatus.ENCRYPT_ERROR);
//        }
//    }
//
//    @Override
//    public String convertToEntityAttribute(String text) {
//        try {
//            Cipher cipher = Cipher.getInstance(alg);
//            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
//            IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());
//            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParamSpec);
//
//            byte[] decodedBytes = Base64.getDecoder().decode(text);
//            byte[] decrypted = cipher.doFinal(decodedBytes);
//            return new String(decrypted, "UTF-8");
//        } catch (GeneralSecurityException e) {
//            throw new BusinessException(ExceptionStatus.ENCRYPT_ERROR);
//        } catch (UnsupportedEncodingException e) {
//            throw new BusinessException(ExceptionStatus.ENCRYPT_ERROR);
//        }
//    }
//}
