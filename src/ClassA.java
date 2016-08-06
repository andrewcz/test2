/**
 * Created by andrewcz on 8/6/16.
 */

class A
{ public A() { n = 0; } // constructor
    public A(int a) { n = a; } // constructor
    public void f() { n++; } // mutates n
    public void g() {
        f();
        n = 2 * n;
        f();
    }
    // g mutates n directly and indirectly (f)
    public int h() {
        return n;
    } // accessor of n
    public void k() {
        System.out.println(n);
    }
    // does not return, only prints, the value of n
    private int n; // instance variable
}
