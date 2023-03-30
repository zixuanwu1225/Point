public class Point implements Comparable{
    private int x;
    private int y;
    private String label;
    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }
    public String toString(){
        return "Point "+label+" is at x = "+x+", y= "+y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public boolean equals(Object object) {
        if(object instanceof Point){
            if(((Point) object).getX()!=x){
                return false;
            }
            if (((Point) object).getY()!=y){
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Point){
            
        }
    }
}
