package learning;
public class TowerofHanoi {
    static void ToH(int n,char fromtower,char totower,char auxtower)
    {
        if(n==1)
        {
            System.out.println("Move disk 1 from "+fromtower+" to "+totower);
            return;
        }
        ToH(n-1,fromtower,auxtower,totower);
        System.out.println("move disk "+n+" from "+fromtower+" to "+totower);
        ToH(n-1,auxtower,totower,fromtower);
    }
    public static void main(String[] args) {
        int n=3;
        ToH(n,'A','B','c');
    }
}
