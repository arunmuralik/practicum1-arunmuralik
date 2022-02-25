public class Robot {

    String ID;
    int x ;
    int y ;
    String dir;
    public Robot(String ID) //Default Constructor
    {
            this.ID = ID;
            this.x = 0;
            this.y = 0;
            this.dir = "East";
    }

    public String getID()
    {
        return ID;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDir() {
        return dir;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   public void setDir(String dir) {
        this.dir = dir;
    }

    public void advance(String dir)
    {
       if (dir =="East")
       {setX(x+1);
       setDir(dir);}

        if (dir =="West")
        {setX(x-1);
            setDir(dir);}

        if (dir =="North")
        {setY(y+1);
            setDir(dir);}

        if (dir =="South")
        {setY(y-1);
            setDir(dir);}
    }

    public void display()
    {
        System.out.println("Details of Robot :: ID - "+getID()+", Direction - "+getDir()+", Coordinates - ("+getX()+","+getY()+")");
    }
}
