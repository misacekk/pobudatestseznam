public class Hrac {
    private String prezdivkaHrace;
    private String herniTrida;
    private int MMRHrace;

    public Hrac(String prezdivkaHrace, String herniTrida, int MMRHrace) {
        this.prezdivkaHrace = prezdivkaHrace;
        this.herniTrida = herniTrida;
        this.MMRHrace = MMRHrace;
    }

    public String getPrezdivkaHrace() {
        return prezdivkaHrace;
    }

    public void setPrezdivkaHrace(String prezdivkaHrace) {
        this.prezdivkaHrace = prezdivkaHrace;
    }

    public String getHerniTrida() {
        return herniTrida;
    }

    public void setHerniTrida(String herniTrida) {
        this.herniTrida = herniTrida;
    }

    public int getMMRHrace() {
        return MMRHrace;
    }

    public void setMMRHrace(int MMRHrace) {
        this.MMRHrace = MMRHrace;
    }

    @Override
    public String toString() {
        return "Hráč: " + prezdivkaHrace + " | " + herniTrida + " | " + MMRHrace;
    }
}
