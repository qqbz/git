/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;
import java.awt.geom.*;

/**
 *
 * @author SimonLaptop
 */
public class RobotInfo extends Point2D.Double{ //TO DO: welche Werte brauchen wir wirklich?
    
    String NAME;
    double energy;
    boolean isAlive;
    double velocity;
    boolean ISTEAMMATE;
    double bearingRad;
    double headingRad;
    
    public void setName(String a){
        this.NAME = a;
    }
    
    public String getName(){
        return this.NAME;
    }
    
    public void setEnergy(double a){
        this.energy = a;
    }
    
    public double getEnergy(){
        return this.energy;
    }
    
    public void setIsAlive(boolean a){
        this.isAlive = a;
    }
    
    public boolean getIsAlive(){
        return this.isAlive;
    }
    
    public void setVelocity(double a){
        this.velocity = a;
    }
    
    public double getVelocity(){
        return this.velocity;
    }
    
    public void setIsTeammate(boolean a){
        this.ISTEAMMATE = a;
    }
    
    public boolean getIsTeammate(){
        return this.ISTEAMMATE;
    }
    
    public void setBearingRad(double a){
        this.bearingRad = a;
    }
    
    public double getBearingRad(){
        return this.bearingRad;
    }
    
    public void setHeadingRad(double a){
        this.headingRad = a;
    }
    
    public double getHeadingRad(){
        return this.headingRad;
    }
}