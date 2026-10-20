public class Team {

    private String name;
    private String league;
    private int atk;
    private int mid;
    private int def;


    public Team(String name, String league, int atk, int mid, int def) {
        this.name = name;
        this.league = league;
        this.atk = atk;
        this.mid = mid;
        this.def = def;
    }

    // GET METHODS \\
    public String getLeague() {
        if (league != null) {
            return league;
        } else {
            return null;
        }

    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return atk;
    }

    public int getMidfield() {
        return mid;
    }

    public int getDefense() {
        return def;
    }

    // SET METHODS \\

    public void setLeague(String l) {
        league = l;
    }

    public void setAttack(int a) {
        atk = a;
    }

    public void setMidfield(int m) {
        mid = m;
    }

    public void setDefense(int d) {
        def = d;
    }
}
