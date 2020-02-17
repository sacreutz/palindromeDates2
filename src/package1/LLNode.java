package package1;

public class LLNode<String> {
    private LLNode link;
    private String info;

    public LLNode(String info) {
        this.info = info;
        link = null;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setLink(LLNode link) {
        this.link = link;
    }

    public LLNode getLink() {
        return link;
    }
}