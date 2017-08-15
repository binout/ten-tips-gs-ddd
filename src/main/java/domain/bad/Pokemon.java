package domain.bad;

// tag::pojo[]
public class Pokemon {

    private Long id;
    private String type;
    private String name;
    private int pv;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPv() {
        return pv;
    }
    public void setPv(int pv) {
        this.pv = pv;
    }
}
// end::pojo[]

