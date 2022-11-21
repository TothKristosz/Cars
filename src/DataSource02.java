public class DataSource02 {
    int tulajnev;
    String kod;
    String nev;
    String cim;

    public DataSource02(String [] input02){
        this.tulajnev = Integer.parseInt(input02[0]);
        this.kod = input02[1];
        this.nev = input02[2];
        this.cim = input02[3];
    }

    public int getTulajnev() {
        return tulajnev;
    }

    public void setTulajnev(int tulajnev) {
        this.tulajnev = tulajnev;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }
}
