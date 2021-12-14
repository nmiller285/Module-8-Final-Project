package Classes;
public class ThinCrust extends Ingredient {

    //Setting pizza size and cooking times
    double ratio;
    int cookTime, size;

    public void setSize(int s){
        if(s == 1){
            ratio = 8.5;
            this.size = s;
        }
        if(s == 2){
            ratio = 12.5;
            this.size = s;
        }
        else{
            ratio = 15.0;
            this.size = s;
        }
    }

    public void setCookTime(int time){
        this.cookTime = time;
    }

    public int getSize(){
        return size;
    }

    public int getCookTime(){
        return cookTime;
    }
    
    //Creating the pizza by inheriting from Ingredient
    @Override
    public double setSauce(int sa) {
        if(sa == 1){
            return marinara;
        }
        else{
            return alfredo;
        }
    }

    @Override
    public double setCheese(int ch) {
        if(ch == 1){
            return mozorella;
        }
        else{
            return provolone;
        }
    }

    public int setCrust(int cr){
        if(cr == 1){
            return thinCrust;
        }
        else{
            return deepDish;
        }
    }

}
