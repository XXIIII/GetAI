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
public class Job {

    private Vehicle vehicle;
    private Parcel[] parcels;
    private int count;
    private int nextParcel;

    public Job(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.parcels = new Parcel[10];

    }

    public void add(Parcel parcels) {
        this.parcels[count++] = parcels;
        if (this.count == this.parcels.length) {
            expand();
        }
    }

    public void expand() {
        Parcel[] temp = new Parcel[parcels.length + 10];
        System.arraycopy(parcels, 0, temp, 0, count);
        this.parcels = temp;

    }

    public double[] nextStop() {
        if (this.nextParcel == this.count) {
            return null;
        }
        
        return this.parcels[this.nextParcel].getlatlongi();
    }

    public int deliverNextParcel() {
        if (this.nextParcel == this.count) {
            return -1;
        }
        this.parcels[this.nextParcel].setStatus("delivered");
        
        return this.parcels[this.nextParcel++].getId();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append(this.vehicle.toString());
        str.append("\n");
            for(int i = 0;i < this.count;i++){
            str.append(this.parcels[i].toString());
            str.append("\n");
            
        }
        return str.toString();
    }

}
