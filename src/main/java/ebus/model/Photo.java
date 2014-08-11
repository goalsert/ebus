package ebus.model;

public class Photo {
    private Integer id;

    private String title;

    private String url;

    private Long graphid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getGraphid() {
        return graphid;
    }

    public void setGraphid(Long graphid) {
        this.graphid = graphid;
    }
}