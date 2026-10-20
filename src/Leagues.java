import java.util.*;


public class Leagues {
    private ArrayList<Team> EPL = new ArrayList<>();
    private ArrayList<Team> LaLiga = new ArrayList<>();
    private ArrayList<Team> SerieA = new ArrayList<>();
    private ArrayList<Team> Bundesliga = new ArrayList<>();
    private ArrayList<Team> Ligue1 = new ArrayList<>();
    private ArrayList<Team> RestOfTheWorld = new ArrayList<>();
    private ArrayList<Team> Custom = new ArrayList<>();

    public Leagues() {

        EPL.addAll(List.of(
                new Team("Arsenal", "EPL", 83, 85, 83),
                new Team("Aston Villa", "EPL", 79, 78, 79),
                new Team("Bournemouth", "EPL", 79, 78, 77),
                new Team("Brentford", "EPL", 79, 79, 78),
                new Team("Brighton", "EPL", 74, 77, 79),
                new Team("Chelsea", "EPL", 81, 82, 79),
                new Team("Crystal Palace", "EPL", 79, 79, 78),
                new Team("Coventry City", "EPL", 74, 74, 74),
                new Team("Everton", "EPL", 76, 79, 77),
                new Team("Fulham", "EPL", 75, 76, 77),
                new Team("Hull City", "EPL", 75, 74, 72),
                new Team("Ipswich Town", "EPL", 75, 77, 74),
                new Team("Leeds United", "EPL", 77, 78, 76),
                new Team("Liverpool", "EPL", 85, 83, 81),
                new Team("Manchester City", "EPL", 87, 84, 84),
                new Team("Manchester United", "EPL", 83, 83, 80),
                new Team("Newcastle United", "EPL", 79, 78, 81),
                new Team("Nottingham Forest", "EPL", 79, 78, 79),
                new Team("Sunderland", "EPL", 78, 78, 79),
                new Team("Tottenham", "EPL", 80, 80, 81)
        ));


        LaLiga.addAll(List.of(
                new Team("Alaves", "LaLiga", 77, 74, 74),
                new Team("Athletic Bilbao", "LaLiga", 79, 78, 80),
                new Team("Atletico Madrid", "LaLiga", 84, 83, 81),
                new Team("Barcelona", "LaLiga", 86, 85, 83),
                new Team("Celta Vigo", "LaLiga", 80, 76, 77),
                new Team("Deportivo La Coruna", "LaLiga", 79, 74, 75),
                new Team("Elche", "LaLiga", 71, 73, 74),
                new Team("Espanyol", "LaLiga", 75, 75, 74),
                new Team("Getafe", "LaLiga", 76, 74, 75),
                new Team("Levante", "LaLiga", 75, 73, 75),
                new Team("Malaga", "LaLiga", 76, 72, 70),
                new Team("Osasuna", "LaLiga", 78, 75, 77),
                new Team("Racing Santander", "LaLiga", 71, 75, 71),
                new Team("Rayo Vallecano", "LaLiga", 75, 78, 76),
                new Team("Real Betis", "LaLiga", 79, 80, 78),
                new Team("Real Madrid", "LaLiga", 86, 86, 83),
                new Team("Real Sociedad", "LaLiga", 81, 78, 77),
                new Team("Sevilla", "LaLiga", 75, 76, 75),
                new Team("Valencia", "LaLiga", 75, 77, 76),
                new Team("Villarreal", "LaLiga", 80, 79, 78)
        ));


        SerieA.addAll(List.of(
                new Team("AC Milan", "SerieA", 80, 79, 79),
                new Team("Atalanta", "SerieA", 79, 78, 77),
                new Team("Bologna", "SerieA", 77, 76, 75),
                new Team("Cagliari", "SerieA", 70, 71, 74),
                new Team("Como", "SerieA", 80, 78, 77),
                new Team("Fiorentina", "SerieA", 74, 75, 74),
                new Team("Frosinone", "SerieA", 71, 72, 69),
                new Team("Genoa", "SerieA", 74, 73, 73),
                new Team("Inter Milan", "SerieA", 83, 83, 81),
                new Team("Juventus", "SerieA", 78, 78, 80),
                new Team("Lazio", "SerieA", 76, 78, 74),
                new Team("Lecce", "SerieA", 71, 69, 71),
                new Team("Monza", "SerieA", 72, 70, 67),
                new Team("Napoli", "SerieA", 79, 83, 79),
                new Team("Parma", "SerieA", 72, 74, 72),
                new Team("Roma", "SerieA", 83, 78, 81),
                new Team("Sassuolo", "SerieA", 76, 72, 72),
                new Team("Torino", "SerieA", 77, 73, 75),
                new Team("Udinese", "SerieA", 76, 73, 72),
                new Team("Venezia", "SerieA", 73, 73, 71)
        ));


        Bundesliga.addAll(List.of(
                new Team("Augsburg", "Bundesliga", 76, 75, 73),
                new Team("Bayer Leverkusen", "Bundesliga", 80, 79, 79),
                new Team("Bayern Munich", "Bundesliga", 90, 84, 84),
                new Team("Borussia Dortmund", "Bundesliga", 85, 80, 80),
                new Team("Borussia Monchengladbach", "Bundesliga", 76, 74, 74),
                new Team("Eintracht Frankfurt", "Bundesliga", 82, 75, 73),
                new Team("Elversberg", "Bundesliga", 71, 70, 70),
                new Team("FC Koln", "Bundesliga", 75, 74, 73),
                new Team("Freiburg", "Bundesliga", 77, 75, 76),
                new Team("Hamburger SV", "Bundesliga", 70, 75, 74),
                new Team("Hoffenheim", "Bundesliga", 77, 77, 76),
                new Team("Mainz", "Bundesliga", 74, 78, 74),
                new Team("Paderborn", "Bundesliga", 70, 70, 70),
                new Team("RB Leipzig", "Bundesliga", 78, 78, 80),
                new Team("Schalke 04", "Bundesliga", 73, 73, 72),
                new Team("Stuttgart", "Bundesliga", 77, 79, 78),
                new Team("Union Berlin", "Bundesliga", 72, 74, 74),
                new Team("Werder Bremen", "Bundesliga", 74, 73, 74)
        ));


        Ligue1.addAll(List.of(
                new Team("Angers", "Ligue1", 72, 72, 72),
                new Team("Auxerre", "Ligue1", 73, 71, 72),
                new Team("Brest", "Ligue1", 75, 72, 74),
                new Team("Le Havre", "Ligue1", 71, 69, 72),
                new Team("Le Mans", "Ligue1", 71, 65, 70),
                new Team("Lens", "Ligue1", 78, 75, 77),
                new Team("Lille", "Ligue1", 77, 76, 77),
                new Team("Lorient", "Ligue1", 71, 73, 70),
                new Team("Lyon", "Ligue1", 75, 77, 76),
                new Team("Marseille", "Ligue1", 77, 76, 76),
                new Team("Monaco", "Ligue1", 75, 77, 75),
                new Team("Nice", "Ligue1", 76, 73, 71),
                new Team("Paris FC", "Ligue1", 77, 75, 74),
                new Team("Paris Saint-Germain", "Ligue1", 87, 85, 86),
                new Team("Rennes", "Ligue1", 79, 77, 76),
                new Team("Strasbourg", "Ligue1", 70, 73, 72),
                new Team("Toulouse", "Ligue1", 71, 72, 71),
                new Team("Troyes", "Ligue1", 70, 70, 69)
        ));

        RestOfTheWorld.addAll(List.of(
                // Portugal - Primeira Liga
                new Team("FC Porto", "Primeira Liga", 77, 79, 78),
                new Team("Benfica", "Primeira Liga", 80, 79, 77),
                new Team("Sporting CP", "Primeira Liga", 79, 75, 78),

                // Netherlands - Eredivisie
                new Team("Ajax", "Eredivisie", 76, 79, 75),
                new Team("PSV", "Eredivisie", 77, 77, 77),
                new Team("Feyenoord", "Eredivisie", 74, 75, 75),

                // Turkey - Super Lig
                new Team("Galatasaray", "Super Lig", 85, 79, 78),
                new Team("Fenerbahce", "Super Lig", 81, 79, 77),
                new Team("Besiktas", "Super Lig", 78, 76, 74),

                // Saudi Arabia - Saudi Pro League
                new Team("Al Hilal", "Saudi Pro League", 78, 78, 74),
                new Team("Al Nassr", "Saudi Pro League", 84, 78, 73),
                new Team("Al Ahli", "Saudi Pro League", 78, 76, 73),

                // Scotland - Scottish Premiership
                new Team("Celtic", "Scottish Premiership", 73, 73, 75),
                new Team("Rangers", "Scottish Premiership", 67, 73, 71),

                // Belgium - Belgian Pro League
                new Team("Club Brugge", "Belgian Pro League", 74, 71, 72),
                new Team("Anderlecht", "Belgian Pro League", 72, 70, 71),

                // Greece - Super League Greece
                new Team("Olympiacos", "Super League Greece", 80, 77, 74),
                new Team("Panathinaikos", "Super League Greece", 75, 73, 77),

                // Argentina - Primera Division
                new Team("River Plate", "Argentine Primera Division", 75, 76, 76),
                new Team("Boca Juniors", "Argentine Primera Division", 73, 76, 73),
                new Team("Racing Club", "Argentine Primera Division", 75, 69, 72),

                // Brazil - Brasileirao Serie A
                new Team("Flamengo", "Brasileirao Serie A", 77, 76, 75),
                new Team("Palmeiras", "Brasileirao Serie A", 78, 76, 74),

                // Mexico - Liga MX
                new Team("Club America", "Liga MX", 72, 74, 73),
                new Team("Cruz Azul", "Liga MX", 72, 74, 73),

                // USA - Major League Soccer
                new Team("Inter Miami", "MLS", 77, 76, 69),
                new Team("Los Angeles FC", "MLS", 74, 71, 69),
                new Team("Seattle Sounders", "MLS", 69, 71, 71),

                // Australia - A-League
                new Team("Melbourne City", "A-League", 60, 64, 62),

                // South Korea - K League 1
                new Team("Jeonbuk Hyundai Motors", "K League 1", 69, 68, 68)
        ));

        Custom.add(new Team("Super Team",null,85,85,85));
    }

    public void importLeague(){
        // Empty rn
}

    public void addTeam(String name,int a,int m,int d){
        Custom.add(new Team(name,null,a,m,d));
    }
}
