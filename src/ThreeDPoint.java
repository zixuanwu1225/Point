public class ThreeDPoint extends Point{
    private int z;
    public ThreeDPoint(String label,int x, int y, int z){
            super(label, x, y);
            this.z = z;
    }
    public String toString(){
        return super.toString()+", z = "+z;
    }
    public int getZ(){
        return z;
    }
    public boolean equals(Object obj){
        if (obj instanceof Point){
            if(((Point) obj).getX()!=super.getX()){
                return false;
            }
            if (((Point) obj).getY()!=super.getY()){
                return false;
            }
            if (((ThreeDPoint) obj).getZ()!=z){
                return false;
            }
        }
        return true;
    }
}
