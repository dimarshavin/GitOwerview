package servlets;

public class BasicClass {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BasicClass{" +
                "id=" + id +
                '}';
    }

    public  boolean IsNew() {
        return(this.id==null);
    }


}
