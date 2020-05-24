package Task4_1;

/**
 * @author Sayapin Sergey
 *
 */
public class Task4_1 {
    public static void main(String[] args) {
        int indexMin=0;
        int indexMax=0;
        int min=11;
        int max=-11;
        int [] mass = new int[20];
        for (int i=0;i<20;i++) {
            mass[i] = (int) ((Math.random() * (22)) - 11);
            if(mass[i]>0 && mass[i]<min){
                min=mass[i];
                indexMin=i;
            }
            if(mass[i]<0 && mass[i]>max){
                max=mass[i];
                indexMax=i;
            }
            System.out.print(mass[i]+" ");
        }
        mass[indexMax]=min;
        mass[indexMin]=max;
        System.out.println();
        for (int element: mass
             ) {
            System.out.print(element+" ");
        }
    }
}
