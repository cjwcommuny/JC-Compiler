package classgen;

public class OutputClassFile {
    private byte[] bytes;
    private String fileName;

    public OutputClassFile(byte[] bytes, String fileName) {
        this.bytes = bytes;
        this.fileName = fileName;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public String getFileName() {
        return fileName;
    }
}
