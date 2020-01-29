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
public class FastMove {
    public static void main(String [] args){
        Vehicle vehicle = new Vehicle(1,"John");
        Job job001 = new Job (vehicle);
        Parcel parcel01 = new Parcel(0,13.760521, 100.533717,"Created");
        Parcel parcel02 = new Parcel(1,13.765090, 100.536206,"Created");
        job001.add(parcel01);
        job001.add(parcel02);
        System.out.println(job001);
    }
}
