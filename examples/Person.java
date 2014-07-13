
public class Person {
// Person attributes

//document person
    private int docPrs;
//name person
    private String nm_prs = "john";
//age person
    private int ag_prs;
//gender person
    private String gnrPrs;
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

    public void setDocPrs(int value) {
        this.docPrs = value;        
    }

    public void setNm(String value) {
        this.nm_prs = value;
    }

    public void setGndr(String value) {
        if (value.equals("F") || value.equals("M")) {
            this.gnrPrs = value;
        } else {
            System.out.println("The gender must be F (Female) o M (Male)");
        }
    }

    public void setAg(int value) {
        if (value < 100) {
            this.ag_prs = value;
        } else {
            System.out.println("The Age must be < 100");
        }
    }

    public int setDocPrs() {
        return this.docPrs;
    }

    public String getName() {
        return this.nm_prs;
    }

    public int getAge() {
        return this.ag_prs;
    }

    public String getGen() {
        return this.gnrPrs;
    }
}
