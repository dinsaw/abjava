package in.blogspot.javacodebit.core;

/**
 * Created by dinsaw on 1/4/2015. Part of javacodebit
 */
public class SuperDemo {
    static final int KEY = 8;

    public static void main(String[] args) {
        ExtendedSuperBit bit = new ExtendedSuperBit(10, "Bitman");
        System.out.println("Initialized bit = " + bit.getCode());
        bit.encrypt(KEY);
        System.out.println("Encrypted bit = " + bit.getCode());
        bit.decrypt(KEY);
        System.out.println("Decrypted bit = " + bit.getCode());
    }
}

class SuperBit {
    private int code;

    SuperBit(int code) {
        this.code = code;
    }

    public void encrypt(int key) {
        code = code - key;
        System.out.println("encrypt: subtraction");
    }

    public void decrypt(int key) {
        code = code + key;
        System.out.println("decrypt: addition");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

class ExtendedSuperBit extends SuperBit {
    private String author;

    ExtendedSuperBit(int code, String author) {
        super(code);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void encrypt(int key) {
        super.encrypt(key);
        setCode(getCode() * key);
        System.out.println("encrypt: multiplication");
    }

    @Override
    public void decrypt(int key) {
        setCode(getCode() / key);
        System.out.println("decrypt: divide");
        super.decrypt(key);
    }
}
