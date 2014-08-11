package ebus.model;

public class Category {
    private Integer id;

    private String title;

    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getGraphid() {
        return graphid;
    }

    public void setGraphid(Long graphid) {
        this.graphid = graphid;
    }
}