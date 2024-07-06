/*// SOLID RECTANGLE  
class solidreactangle {
    public static void main(String [] args){
        for(int i=0;i<=4;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}

// hollow rectangle 
class hollowrectangle{
    public static void main(String [] args){
        int n=4;
        int m=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");       
        }
        
    }
}


// half pyramid 
class halfpyramid{
  public static void main(String [] args){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
    
        System.out.println(" ");
    }

  }
}


// inverted half pyramid 
class invertedpyramid{
    public static void main (String []args){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

//inverted hald pyramid 
class halfpyramid{
public static void main(String[] args){
    int n=5;
    for (int i=1;i<=n;i++){
        for(int j=1; j<=n-1;j++){
            System.out.print(" * ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    } 
  }
}
*/
class halfpyramidnumber{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " " );
            }
            System.out.println(" ");
        }

    }
}