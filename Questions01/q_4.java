// SET INTEGER X=2
// SET INTEGER Y=24
// SET INTEGER Z=2
// Z=(X^Z)^X
// Y=Y%2
// DISPLAY X+Y+Z

import java.util.*;
public class q_4 {
    public static void main(String[] args) {
        int x=2;
        int y=24;
        int z=2;
        z=(x^z)^x;
        y=y%2;
        System.out.println(x+y+z);
    }
}
