/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketworld;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author hp
 */
public class Information {
    private final SimpleStringProperty playerId;
    private final SimpleStringProperty name;
    private final SimpleStringProperty gender;
    private final SimpleStringProperty DOB;
    private final SimpleStringProperty bloodGroup;
    private final SimpleStringProperty height;
    private final SimpleStringProperty weight;
    private final SimpleStringProperty country;
    private final SimpleStringProperty batsman;
    private final SimpleStringProperty bowler;
    private final SimpleStringProperty wicketKeeper;

    public Information(String playerId,String name, String gender,String DOB, String bloodGroup, String height, String weight, String country, String batsman, String bowler, String wicketKeeper) {
        this.playerId = new SimpleStringProperty(playerId);
        this.name = new SimpleStringProperty(name);
        this.gender = new SimpleStringProperty(gender);
        this.DOB = new SimpleStringProperty(DOB);
        this.bloodGroup = new SimpleStringProperty(bloodGroup);
        this.height = new SimpleStringProperty(height);
        this.weight = new SimpleStringProperty(weight);
        this.country = new SimpleStringProperty(country);
        this.batsman = new SimpleStringProperty(batsman);
        this.bowler = new SimpleStringProperty(bowler);
        this.wicketKeeper = new SimpleStringProperty(wicketKeeper);
    }

    public String getPlayerId() {
        return playerId.get();
    }

    public String getName() {
        return name.get();
    }

    public String getGender() {
        return gender.get();
    }

    public String getDOB() {
        return DOB.get();
    }

    public String getBloodGroup() {
        return bloodGroup.get();
    }

    public String getHeight() {
        return height.get();
    }

    public String getWeight() {
        return weight.get();
    }

    public String getCountry() {
        return country.get();
    }

    public String getBatsman() {
        return batsman.get();
    }

    public String getBowler() {
        return bowler.get();
    }

    public String getWicketKeeper() {
        return wicketKeeper.get();
    }
    
    public void setPlayerId(String playerId){
        this.playerId.set(playerId);
    }
        
    public void setName(String name){
        this.name.set(name);
    }
    
    public void setGender(String gender){
        this.gender.set(gender);
    }
    
    public void setDOB(String DOB){
        this.DOB.set(DOB);
    }
    
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup.set(bloodGroup);
    }
    
    public void setHeight(String height){
        this.height.set(height);
    }
    
    public void setWeight(String weight){
        this.weight.set(weight);
    }
    
    public void setCountry(String country){
        this.country.set(country);
    }
    
    public void setBatsman(String batsman){
        this.batsman.set(batsman);
    }
    
    public void setBowler(String bowler){
        this.bowler.set(bowler);
    }
    
    public void setWicketKeeper(String wicketKeeper){
        this.wicketKeeper.set(wicketKeeper);
    }
}
