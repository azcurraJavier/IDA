
public class School {

// School attributes

//headmaster name
    private String hmaster_nm;
//students number
    private int stNmer;
//Address    
    private String add;

    public School(String headMast, int stNmer, String add) {
        setHeMasterNm(headMast);
        setStuNumb(stNmer);
        setAdd(add);
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setHeMasterNm(String hmaster_nm) {
        this.hmaster_nm = hmaster_nm;
    }

    public void setStuNumb(int stNmer) {
        this.stNmer = stNmer;
    }
}
