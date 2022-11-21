public class DataSource {
    String rendszam;
    String marka;
    String tipus;
    int hengerurtartalom;
    int ossztomeg;
    int gyartasiev;
    String alvazszam;
    String motorszam;
    String muszaki;
    int tkod;

    public DataSource(String[] input ){
        this.rendszam = input[0];
        this.marka = input[1];
        this.tipus = input[2];
        this.hengerurtartalom = Integer.parseInt(input[3]);
        this.ossztomeg = Integer.parseInt(input[4]);
        this.gyartasiev = Integer.parseInt(input[5]);
        this.alvazszam = input[6];
        this.motorszam = input[7];
        this.muszaki = input[8];
        this.tkod = Integer.parseInt(input[9]);

    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getHengerurtartalom() {
        return hengerurtartalom;
    }

    public void setHengerurtartalom(int hengerurtartalom) {
        this.hengerurtartalom = hengerurtartalom;
    }

    public int getOssztomeg() {
        return ossztomeg;
    }

    public void setOssztomeg(int ossztomeg) {
        this.ossztomeg = ossztomeg;
    }

    public int getGyartasiev() {
        return gyartasiev;
    }

    public void setGyartasiev(int gyartasiev) {
        this.gyartasiev = gyartasiev;
    }

    public String getAlvazszam() {
        return alvazszam;
    }

    public void setAlvazszam(String alvazszam) {
        this.alvazszam = alvazszam;
    }

    public String getMotorszam() {
        return motorszam;
    }

    public void setMotorszam(String motorszam) {
        this.motorszam = motorszam;
    }

    public String getMuszaki() {
        return muszaki;
    }

    public void setMuszaki(String muszaki) {
        this.muszaki = muszaki;
    }

    public int getTkod() {
        return tkod;
    }

    public void setTkod(int tkod) {
        this.tkod = tkod;
    }
}
