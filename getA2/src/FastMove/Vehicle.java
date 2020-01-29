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
public class Vehicle {
    private int id;
    private String driverName;
    
    public Vehicle(int id,String driverName){
        this.id = id;
        this.driverName = driverName;
    }
    public int getId(){
        return id;
    }
    public String getDriverName(){
        return driverName;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", driverName=" + driverName + '}';
    }
    
}
