
public class Person {
// Person attributes

//document person
    private int docprs;//doc prs prs prs
//name person
    private String nmprs = "john"; //nm
//age person
    private int agprs; //ag
//gender person
    private String gnrprs;
//gnr gnr
    public Person(int doc, String name, int age) {
        setDocPrs(doc);
        setNm(name);
        setAg(age);
    }
//gndr gndr
    public Person(int doc, String name, int age, String gen) {
        setDocPrs(doc);
        setNm(name);
        setAg(age);
        setGndr(gen);
    }
//set get get get
    public void setDocPrs(int value) {
        this.docprs = value;        
    }
//nm nm nm gen gen
    public void setNm(String value) {
        this.nmprs = value;
    }

    public void setGndr(String value) {
        if (value.equals("F") || value.equals("M")) {
            this.gnrprs = value;
        } else {
            System.out.println("The gender must be F (Female) o M (Male)");
        }
    }

    public void setAg(int value) {
        if (value < 100) {
            this.agprs = value;
        } else {
            System.out.println("The Age must be < 100");
        }
    }

    public int setDocPrs() {
        return this.docprs;
    }

    public String getName() {
        return this.nmprs;
    }

    public int getAge() {
        return this.agprs;
    }

    public String getGen() {
        return this.gnrprs;
    }
}
