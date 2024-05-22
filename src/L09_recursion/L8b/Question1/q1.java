package L09_recursion.L8b.Question1;

public class q1 {
    public static long F(int s, int t) {
        if (t == 1)
            return s;
        else if (s == 1)
            return 1;
        else
            return F(s-1,t) + F(s, t-1);
    }
    public static void main(String[] args) {
        int s = 5, t = 3;
        System.out.println("F("+s+", "+t+") = " + F(s,t));
    }
}

/**
 * When main is executed with s = 5 and t = 3, it computes F(5,3):
 *
 * F(5,3)=F(4,3)+F(5,2)
 *
 * F(4,3)=F(3,3)+F(4,2)
 *
 * F(3,3)=F(2,3)+F(3,2)
 *
 * F(2,3)=F(1,3)+F(2,2)
 * * F(1,3)=1 (base case)
 *
 * F(2,2)=F(1,2)+F(2,1)
 * * F(1,2)=1 (base case)
 * * F(2,1)=2 (base case,t=1)
 *
 * F(3,2)=F(2,2)+F(3,1)
 * * F(3,1)=3 (base case,t=1)
 *
 * F(4,2)=F(3,2)+F(4,1)
 * * F(4,1)=4 (base case,t=1)
 *
 * F(5,2)=F(4,2)+F(5,1)
 * * F(5,1)=5 (base case,t=1)
 *
* */
