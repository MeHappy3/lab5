package tema1;

public class PerecheNumere {
    private int a,b;
    PerecheNumere(){
        this.a=0;
        this.b=0;
    }
    public PerecheNumere(int x, int y){
        this.a=x;
        this.b=y;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public boolean isFibb(){
        int a= Math.min(this.a, this.b);
        int b = Math.max(this.a,this.b);
        for(int i=0,j=1,buff;
            i<=a;
            buff=i+j,i=j,j=buff)
        {
            if(a==i&&b==j)
                return true;
        }
        return false;
    }

    public int cmmc(){
        int cmmc=Math.min(this.a,this.b);
        while((cmmc%this.a!=0)||(cmmc%this.b!=0))
            cmmc++;

        return cmmc;
    }
    static int sumDigits(int n){
        int i=0;
        while(n!=0){
            i+=n%10;
            n/=10;
        }
        return i;
    }
    public boolean equalSumDigits(){
        return sumDigits(this.a)==sumDigits(this.b);
    }
    static int evenDigits(int n){
        int i=0;
        while(n!=0){
            if((n%10)%2==0)
            i++;
            n/=10;
        }
        return i;
    }
    public boolean equalEvenDigits(){
        return evenDigits(this.a)==evenDigits(this.b);
    }

}
