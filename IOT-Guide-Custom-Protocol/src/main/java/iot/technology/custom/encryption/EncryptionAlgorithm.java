package iot.technology.custom.encryption;

/**
 * @author james mu
 * @date 2020/7/27 13:48
 */
public interface EncryptionAlgorithm {

    /**
     * 不加密
     */
    byte not = (byte) 0x01;

    /**
     * 对称AES128算法
     */
    byte aes128 = (byte) 0x05;

    /**
     * 异常
     */
    byte error = (byte) 0xFE;

    /**
     * 无效
     */
    byte valid = (byte) 0xFF;
}
