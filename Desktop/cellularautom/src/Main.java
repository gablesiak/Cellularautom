import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int size, iter, bc, metod;
        Scanner sc = new Scanner(System.in);



        System.out.println("Ilosc iteracji: ");
        iter = sc.nextInt();
        size= iter*2 + 1;



        System.out.println("Liczba: ");
        bc = sc.nextInt();

        System.out.println("Metoda (30/60/90)");
        metod = sc.nextInt();

        int a[] = new int[size];
        int temp[] = new int[size];


        for(int i=0; i<size; i++){
            a[i]=0;
            temp[i]=0;
        }

        if(bc==1){
            a[0]=0;
            a[size-1]=0;
            temp[0]=0;
            temp[size-1]=0;
        }

        a[(int)size/2]=1;


        if(metod==30){
            for(int j=0; j<iter; j++){
                for(int k=0; k<size-2; k++){
                    if(a[k]==1 && a[k+1]==1 && a[k+2]==1){
                        temp[k+1]=0;
                    }else if(a[k]==1 && a[k+1]==1 && a[k+2]==0){
                        temp[k+1]=0;
                    }else if(a[k]==1 && a[k+1]==0 && a[k+2]==1){
                        temp[k+1]=0;
                    }else if(a[k]==1 && a[k+1]==0 && a[k+2]==0){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==1 && a[k+2]==1){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==1 && a[k+2]==0){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==0 && a[k+2]==1){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==0 && a[k+2]==0){
                        temp[k+1]=0;
                    }
                }

                for(int i=1; i<size-1; i++){
                    if(a[i]==0){
                        System.out.print("0");
                    }else
                        System.out.print("1");
                }
                System.out.println();

                for(int l=0; l<size; l++){
                    a[l]=temp[l];
                }


            }
        }else if(metod==90){
            for(int j=0; j<iter; j++){
                for(int k=0; k<size-2; k++){
                    if(a[k]==1 && a[k+1]==1 && a[k+2]==1){
                        temp[k+1]=0;
                    }else if(a[k]==1 && a[k+1]==1 && a[k+2]==0){
                        temp[k+1]=1;
                    }else if(a[k]==1 && a[k+1]==0 && a[k+2]==1){
                        temp[k+1]=0;
                    }else if(a[k]==1 && a[k+1]==0 && a[k+2]==0){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==1 && a[k+2]==1){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==1 && a[k+2]==0){
                        temp[k+1]=0;
                    }else if(a[k]==0 && a[k+1]==0 && a[k+2]==1){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==0 && a[k+2]==0){
                        temp[k+1]=0;
                    }
                }

                for(int i=1; i<size-1; i++){
                    if(a[i]==0){
                        System.out.print("0");
                    }else
                        System.out.print("1");
                }
                System.out.println();

                for(int l=0; l<size; l++){
                    a[l]=temp[l];
                }


            }
        }else if(metod==60){
            for(int j=0; j<iter; j++){
                for(int k=0; k<size-2; k++){
                    if(a[k]==1 && a[k+1]==1 && a[k+2]==1){
                        temp[k+1]=0;
                    }else if(a[k]==1 && a[k+1]==1 && a[k+2]==0){
                        temp[k+1]=0;
                    }else if(a[k]==1 && a[k+1]==0 && a[k+2]==1){
                        temp[k+1]=1;
                    }else if(a[k]==1 && a[k+1]==0 && a[k+2]==0){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==1 && a[k+2]==1){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==1 && a[k+2]==0){
                        temp[k+1]=1;
                    }else if(a[k]==0 && a[k+1]==0 && a[k+2]==1){
                        temp[k+1]=0;
                    }else if(a[k]==0 && a[k+1]==0 && a[k+2]==0){
                        temp[k+1]=0;
                    }
                }

                for(int i=1; i<size-1; i++){
                    if(a[i]==0){
                        System.out.print("0");
                    }else
                        System.out.print("1");
                }
                System.out.println();

                for(int l=0; l<size; l++){
                    a[l]=temp[l];
                }


            }
        }else{
            System.err.println("zla metoda");
        }



    }
}


