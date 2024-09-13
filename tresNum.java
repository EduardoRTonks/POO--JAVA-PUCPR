public class tresNum {
    static int maior(int a, int b,int c) {
        if(a>b && a>c) return a;
        if(b>c) return b;
        return c;
    }
    static int menor(int a, int b,int c) {
        if(a<b && a<c) return a;
        if(b<c) return b;
        return c;
    }
    static int intermediario(int a, int b, int c) {
        if((a<b&&a>c)||(a>b&&a<c))
            return a;
        else if(b<c || b>c)
            return b;
        else return c;
    }
}
