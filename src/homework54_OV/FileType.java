package homework54_OV;

public enum FileType {
    GIF (".gif"),
    JPG (".jpg"),
    CLASS (".class");
    private String ext;
    FileType(String ext) {
        this.ext = ext;
    }

    public String getExt() {
        return ext;
    }
}
