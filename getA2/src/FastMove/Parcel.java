/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FastMove;

/**
 *
 * @author int105
 */
public class Parcel {
    private int id;
    private double lat,longi;
    private String status;
    
    public Parcel(int id,double lat,double longi,String status){
        this.id = id;
        this.lat = lat;
        this.longi = longi;
        this.status = status;
    }
    public double [] getlatlongi(){
        return new double[]{this.lat,this.longi};
    }
    public void setStatus(String status){
        this.status = status;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append(" ");
            str.append(this.id);
            str.append(" ");
            str.append(this.lat);
            str.append(" ");
            str.append(this.longi);
            str.append(" ");
            str.append(this.status);
        return str.toString();
    }
    
   public Parcel olone(){
       Parcel temp = new Parcel(this.id,this.lat,this.longi,this.status);
           return temp;
       }
   }
    

