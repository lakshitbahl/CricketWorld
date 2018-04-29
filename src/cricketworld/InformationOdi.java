/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketworld;
import javafx.beans.property.SimpleStringProperty;

public class InformationOdi {
    private final SimpleStringProperty playerId;
    private final SimpleStringProperty matches;
    private final SimpleStringProperty runs;
    private final SimpleStringProperty innings;
    private final SimpleStringProperty ballsFaced;
    private final SimpleStringProperty century;
    private final SimpleStringProperty fifty;
    private final SimpleStringProperty bestScore;
    private final SimpleStringProperty ducks;
    private final SimpleStringProperty ballsBowled;
    private final SimpleStringProperty runsGiven;
    private final SimpleStringProperty wickets;
    private final SimpleStringProperty w5;
    private final SimpleStringProperty bestBowling;
    private final SimpleStringProperty mom;
    private final SimpleStringProperty catches;
    private final SimpleStringProperty fours;
    private final SimpleStringProperty sixes;

    public InformationOdi(String playerId, String matches, String runs, String innings, String ballsFaced, String century, String fifty, String bestScore, String ducks,String ballsBowled, String runsGiven, String wickets, String w5, String bestBowling, String mom, String catches, String fours, String sixes) {
        this.playerId = new SimpleStringProperty(playerId);
        this.matches = new SimpleStringProperty(matches);
        this.runs = new SimpleStringProperty(runs);
        this.innings = new SimpleStringProperty(innings);
        this.ballsFaced = new SimpleStringProperty(ballsFaced);
        this.century = new SimpleStringProperty(century);
        this.fifty = new SimpleStringProperty(fifty);
        this.bestScore = new SimpleStringProperty(bestScore);
        this.ducks = new SimpleStringProperty(ducks);
        this.ballsBowled = new SimpleStringProperty(ballsBowled);
        this.runsGiven = new SimpleStringProperty(runsGiven);
        this.wickets = new SimpleStringProperty(wickets);
        this.w5 = new SimpleStringProperty(w5);
        this.bestBowling = new SimpleStringProperty(bestBowling);
        this.mom = new SimpleStringProperty(mom);
        this.catches = new SimpleStringProperty(catches);
        this.fours = new SimpleStringProperty(fours);
        this.sixes = new SimpleStringProperty(sixes);
    }

    public String getPlayerId() {
        return playerId.get();
    }

    public String getMatches() {
        return matches.get();
    }

    public String getRuns() {
        return runs.get();
    }

    public String getInnings() {
        return innings.get();
    }

    public String getBallsFaced() {
        return ballsFaced.get();
    }

    public String getCentury() {
        return century.get();
    }

    public String getFifty() {
        return fifty.get();
    }

    public String getBestScore() {
        return bestScore.get();
    }

    public String getDucks() {
        return ducks.get();
    }

    public String getBallsBowled() {
        return ballsBowled.get();
    }

    public String getRunsGiven() {
        return runsGiven.get();
    }

    public String getWickets() {
        return wickets.get();
    }

    public String getW5() {
        return w5.get();
    }

    public String getBestBowling() {
        return bestBowling.get();
    }

    public String getMom() {
        return mom.get();
    }

    public String getCatches() {
        return catches.get();
    }

    public String getFours() {
        return fours.get();
    }

    public String getSixes() {
        return sixes.get();
    }

     public void setPlayerId(String playerId){
        this.playerId.set(playerId);
    }
     
     public void setMatches(String matches){
        this.matches.set(matches);
    }
     
     public void setRuns(String runs){
        this.runs.set(runs);
    }
     
     public void setInnings(String innings){
        this.innings.set(innings);
    }
     
     public void setBallsFaced(String ballsFaced){
        this.ballsFaced.set(ballsFaced);
    }
     
     public void setCentury(String century){
        this.century.set(century);
    }
     
     public void setFifty(String fifty){
        this.fifty.set(fifty);
    }
     
     public void setBestScore(String bestScore){
        this.bestScore.set(bestScore);
    }
     
     public void Ducks(String ducks){
        this.ducks.set(ducks);
    }
     
     public void setBallsBowled(String ballsBowled){
        this.ballsBowled.set(ballsBowled);
    }
     
     public void setRunsGiven(String runsGiven){
        this.runsGiven.set(runsGiven);
    }

    public void Wickets(String wickets){
        this.wickets.set(wickets);
    }
     
    public void W5(String w5){
        this.w5.set(w5);
    }
     
    public void BestBowling(String bestBowling){
        this.bestBowling.set(bestBowling);
    }
     
    public void ManOfMatch(String mom){
        this.mom.set(mom);
    }
     
    public void Catches(String catches){
        this.catches.set(catches);
    }
     
    public void Fours(String fours){
        this.fours.set(fours);
    }
     
    public void Sixes(String sixes){
        this.sixes.set(sixes);
    }
     
}
