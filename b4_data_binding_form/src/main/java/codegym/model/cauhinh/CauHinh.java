package codegym.model.cauhinh;

public class CauHinh {
    String langague;
    String size;
    String fillter="disable";
    String signature;

    public CauHinh(String langague, String size, String fillter, String signature) {
        this.langague = langague;
        this.size = size;
        this.fillter = fillter;
        this.signature = signature;
    }

    public CauHinh() {
    }

    public String getLangague() {
        return langague;
    }

    public void setLangague(String langague) {
        this.langague = langague;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFillter() {
        return fillter;
    }

    public void setFillter(String fillter) {
        this.fillter = fillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
