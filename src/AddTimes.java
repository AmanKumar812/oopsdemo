public class AddTimes {
    int hour,min,sec;
    
    public AddTimes(int h,int m,int s)
    {
        hour=h;
        min=m;
        sec=s;
        
    }
    void add(AddTimes t2) {
        this.hour+=t2.hour;
        this.min+=t2.min;
        this.sec+=t2.sec;
    }
    void check() {
        if(this.sec>=60)
        {
            this.min+=1;
            this.sec=this.sec-60;
        }
        if(this.min>=60)
        {
            this.hour+=1;
            this.min=this.min-60;
        }
        if(this.hour>24)
        {
            
            this.hour=this.hour-24;
        }
    }
    void display() {
        System.out.print("Addition is: ");
        System.out.println(this.hour+":"+this.min+":"+this.sec);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AddTimes t1=new AddTimes(10,45,60);
        AddTimes t2=new AddTimes(3,55,5);        
        
        t1.add(t2);
        t1.check();
        t1.display();
        
    }
    

 

}